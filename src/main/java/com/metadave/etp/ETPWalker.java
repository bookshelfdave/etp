/*
 * -------------------------------------------------------------------
 *
 *   Copyright (c) 2013 Dave Parfitt
 *
 *   This file is provided to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License.  You may obtain
 *   a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 * -------------------------------------------------------------------
 */

package com.metadave.etp;

import com.metadave.etp.rep.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class ETPWalker  extends ETPBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();


    public ETPWalker() {
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    @Override
    public void exitEtp_term(ETPParser.Etp_termContext ctx) {
        if(ctx.etp_atom() != null) {
            setValue(ctx, getValue(ctx.etp_atom()));
        } else if(ctx.etp_bool() != null) {
            setValue(ctx, getValue(ctx.etp_bool()));
        } else if(ctx.etp_float() != null) {
            setValue(ctx, getValue(ctx.etp_float()));
        } else if(ctx.etp_int()  != null) {
            setValue(ctx, getValue(ctx.etp_int()));
        } else if(ctx.etp_list()  != null) {
            setValue(ctx, getValue(ctx.etp_list()));
        } else if(ctx.etp_string()  != null) {
            setValue(ctx, getValue(ctx.etp_string()));
        } else if(ctx.etp_tuple() != null) {
            setValue(ctx, getValue(ctx.etp_tuple()));
        } else if(ctx.etp_binary() != null) {
            setValue(ctx, getValue(ctx.etp_binary()));
        } else if(ctx.etp_pid() != null) {
            setValue(ctx, getValue(ctx.etp_pid()));
        } else if(ctx.etp_ref() != null) {
            setValue(ctx, getValue(ctx.etp_ref()));
        } else if(ctx.etp_fun() != null) {
            setValue(ctx, getValue(ctx.etp_fun()));
        }
    }

    @Override
    public void exitEtp_float(ETPParser.Etp_floatContext ctx) {
        String v = ctx.getText();
        setValue(ctx, new ETPDouble(Double.parseDouble(v)));
    }

    @Override
    public void exitEtp_tuple(ETPParser.Etp_tupleContext ctx) {
        List<ETPTerm<?>> l = new ArrayList<ETPTerm<?>>();
        for(ETPParser.Etp_termContext tc: ctx.tupleitems) {
            l.add((ETPTerm<?>) getValue(tc));
        }
        setValue(ctx, new ETPTuple(l));
    }

    @Override
    public void exitEtp_atom(ETPParser.Etp_atomContext ctx) {
        if(ctx.ID() != null) {
            setValue(ctx, new ETPAtom(ctx.ID().getText()));
        } else if(ctx.IDSTRING() != null) {
            setValue(ctx, new ETPQuotedAtom(stripQuotes(ctx.IDSTRING().getText())));
        }
    }

    @Override
    public void exitEtp_string(ETPParser.Etp_stringContext ctx) {
        String v = stripQuotes(ctx.getText());
        setValue(ctx, new ETPString(v));
    }

    @Override
    public void exitEtp_bool(ETPParser.Etp_boolContext ctx) {
        String v = ctx.getText();
        setValue(ctx, new ETPBoolean(Boolean.parseBoolean(v)));
    }

    @Override
    public void exitEtp_list(ETPParser.Etp_listContext ctx) {
        List<ETPTerm<?>> l = new ArrayList<ETPTerm<?>>();
        for(ETPParser.Etp_termContext tc: ctx.listitems) {
            l.add((ETPTerm<?>) getValue(tc));
        }
        setValue(ctx, new ETPList(l));

    }

    @Override
    public void exitEtp_int(ETPParser.Etp_intContext ctx) {
        String v = ctx.getText();
        setValue(ctx, new ETPInteger(Integer.parseInt(v)));
    }

    public static String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            String v = rawVal.substring(1, rawVal.length() - 1);
            if(v.contains("\\\"")) {
                v = v.replaceAll("\\\\\"","\"");
            }
            return v;
        }
    }

    @Override
    public void exitEtp_binary(ETPParser.Etp_binaryContext ctx) {
        List<ETPBinary.ETPBinaryValue> segments = new ArrayList<ETPBinary.ETPBinaryValue>();
        for(ETPParser.Etp_binary_itemContext segment : ctx.segments) {
            ETPBinary.ETPBinaryValue s = (ETPBinary.ETPBinaryValue)getValue(segment);
            segments.add(s);
        }
        ETPBinary b = new ETPBinary(segments);
        setValue(ctx, b);
    }

    @Override
    public void exitEtp_binary_item(ETPParser.Etp_binary_itemContext ctx) {
        ETPBinary.ETPBinaryValue<?> v = null;
        if(ctx.val != null) {
            if(ctx.size != null) {
                 v = new ETPBinary.BinInt(
                            Long.parseLong(ctx.val.getText()),
                            Integer.parseInt(ctx.size.getText()));
            } else {
                v = new ETPBinary.BinInt(Long.parseLong(ctx.val.getText()));
            }
        } else if(ctx.STRING() != null) {
            if(ctx.size != null) {
                v = new ETPBinary.BinString(stripQuotes(ctx.STRING().getText()),
                        Integer.parseInt(ctx.size.getText()));
            } else {
                v = new ETPBinary.BinString(stripQuotes(ctx.STRING().getText()));
            }
        }
        setValue(ctx, v);
    }

    @Override
    public void exitEtp_pid(ETPParser.Etp_pidContext ctx) {
        setValue(ctx, new ETPPid(ctx.getText()));
    }

    @Override
    public void exitEtp_ref(ETPParser.Etp_refContext ctx) {
        setValue(ctx, new ETPRef(ctx.getText()));
    }

    @Override
    public void exitEtp_fun(ETPParser.Etp_funContext ctx) {
        setValue(ctx, new ETPFun(ctx.getText()));
    }

    //    @Test
//    public void testStripQuotes() {
//        // TODO: edge cases
//        //assertEquals("this is \"a test\"", stripQuotes("\"this is \"a test\"\""));
//        String orig ="\"{\\\"Foo\\\":1}\"";
//        System.out.println(orig);
//        assertEquals("{\"Foo\":1}",stripQuotes(orig));
//    }

}
