package com.metadave.etp;


import com.metadave.etp.rep.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ETPTests {

    @Test
    public void testString() {
        ETPTerm<?> t = ETP.parse("hello");
        assertEquals("hello", t.toString());
        assertEquals(new ETPString("hello").toString(), "\"" + t.toString() + "\"");
    }

    @Test
    public void testInt() {
        ETPTerm<?> t = ETP.parse("100");
        assertEquals("100", t.toString());
        assertEquals(new ETPInteger(100).getValue(), t.getValue());
    }

    @Test
    public void testFloat() {
        ETPTerm<?> t = ETP.parse("3.14159265359");
        assertEquals("3.14159265359", t.toString());
        assertEquals(new ETPDouble(3.14159265359).getValue(), t.getValue());
    }

    @Test
    public void testBoolean() {
        {
        ETPTerm<?> t = ETP.parse("true");
        assertEquals("true", t.toString());
        assertEquals(new ETPBoolean(true).getValue(), t.getValue());
        }

        {
        ETPTerm<?> t = ETP.parse("false");
        assertEquals("false", t.toString());
        assertEquals(new ETPBoolean(false).getValue(), t.getValue());
        }
    }

    @Test
    public void testAtom() {
        ETPTerm<?> t = ETP.parse("helloworld");
        assertEquals("helloworld", t.toString());
        assertEquals(new ETPAtom("helloworld").getValue(), t.getValue());
    }

    @Test
    public void testList() {
        ETPTerm<?> t = ETP.parse("[1,2,3]");
        assertEquals("[1,2,3]", t.toString());
        List<ETPTerm<?>> v = new ArrayList<ETPTerm<?>>();
        v.add(new ETPInteger(1));
        v.add(new ETPInteger(2));
        v.add(new ETPInteger(3));
        assertEquals(new ETPList(v).getValue().toString(), t.getValue().toString());
    }

    @Test
    public void testTuple() {
        ETPTerm<?> t = ETP.parse("{foo,bar,1}");
        assertEquals("{foo,bar,1}", t.toString());
        List<ETPTerm<?>> v = new ArrayList<ETPTerm<?>>();
        v.add(new ETPAtom("foo"));
        v.add(new ETPAtom("bar"));
        v.add(new ETPInteger(1));
        assertEquals(new ETPList(v).getValue().toString(), t.getValue().toString());
    }

    @Test
    public void testNesting() {
        ETPTerm<?> t = ETP.parse("{foo,bar,[1,2,{a,b,c}]}");
        assertEquals("{foo,bar,[1,2,{a,b,c}]}", t.toString());

        ETPTuple tuple = new ETPTuple(
            new ETPAtom("foo"),
            new ETPAtom("bar"),
            new ETPList(
                    new ETPInteger(1),
                    new ETPInteger(2),
                    new ETPTuple(new ETPAtom("a"), new ETPAtom("b"), new ETPAtom("c"))
            )
        );
        assertEquals(tuple.toString(), t.toString());
    }

    @Test
    public void testBinaries() {
        {
            ETPTerm<?> t = ETP.parse("<<1,2,3>>");
            assertEquals("<<1,2,3>>", t.toString());
        }

        {
            ETPTerm<?> t = ETP.parse("<<1,2,3:16>>");
            assertEquals("<<1,2,3:16>>", t.toString());
        }

        {
            ETPTerm<?> t = ETP.parse("<<1,2,\"foo\">>");
            assertEquals("<<1,2,\"foo\">>", t.toString());
        }
    }

    @Test
    public void testPIDs() {
        ETPTerm<?> t = ETP.parse("<0.33.0>");
        assertEquals("<0.33.0>", t.toString());
    }

    @Test
    public void testRef() {
        ETPTerm<?> t = ETP.parse("#Ref<0.0.0.32>");
        assertEquals("#Ref<0.0.0.32>", t.toString());
    }

    @Test
    public void testFun() {
        ETPTerm<?> t = ETP.parse("#Fun<erl_eval.6.39074546>");
        assertEquals("#Fun<erl_eval.6.39074546>", t.toString());
    }


}