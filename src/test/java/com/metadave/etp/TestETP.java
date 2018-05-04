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

import com.ericsson.otp.erlang.*;
import com.metadave.etp.rep.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestETP {

    @Test
    public void name() throws Exception {
        String str = "{create,[{pid,#Pid<node.32470.6422>},{study,[{name,\"MACD@tv-basicstudies-69\"},{src,[{symbol,\"BITSTAMP:XRPUSD\"},{resolution,{week,1}}]},{inputs,[{\"fast length\",\"12\"},{\"slow length\",\"26\"},{\"source\",\"close\"},{\"signal smoothing\",\"9\"},{\"simple ma(oscillator)\",\"false\"},{\"simple ma(signal line)\",\"false\"}]},{symbol_info,[{name,\"BITSTAMP:XRPUSD\"},{short_name,\"XRPUSD\"},{base_name,\"BITSTAMP:XRPUSD\"},{description,#Bin<15>},{exchange,\"BITSTAMP\"},{price_scale,100000},{pointvalue,1.0},{min_movement,1},{type,bitcoin},{has_intraday,true},{expiration,undefined},{listed_exchange,\"BITSTAMP\"},{currency,\"USD\"}]},{session_spec,[{timezone,\"Etc/UTC\"},{intervals,\"0000-0000:1234567\"}]},{regular_session_spec,[{timezone,\"Etc/UTC\"},{intervals,\"24x7\"}]}]},{dependencies,[]}]}";
        ETPTerm term = ETP.parse(str);
        OtpErlangObject otp = term.getOTP();

        assertEquals(str, otp.toString());
    }

    @Test
    public void testFailure() {
        try {
            System.out.println("Please ignore test output below!");
            ETP.parse("!!!!");
            assertTrue("Fail", false);
        } catch (Exception e) {
            assertTrue("Pass", true);
        }
    }

    @Test
    public void testString() throws Exception {
        {
            ETPTerm<?> t = ETP.parse("\"hello\"");
            assertEquals("hello",t.getValue());
            assertEquals("\"hello\"", t.toString());
            assertEquals(new ETPString("\"hello\"").toString(), "\"" + t.toString() + "\"");
        }


        {
            // whitespace
            ETPTerm<?> t = ETP.parse("\" hello world! \"");
            assertEquals(" hello world! ",t.getValue());
            assertEquals("\" hello world! \"", t.toString());
            assertEquals(new ETPString("\" hello world! \"").toString(), "\"" + t.toString() + "\"");
        }

    }

    @Test
    public void testInt() throws Exception  {
        ETPTerm<?> t = ETP.parse("100");
        assertEquals("100", t.toString());
        assertEquals(new ETPLong(100).getValue(), t.getValue());
    }

    @Test
    public void testNegativeInt() throws Exception  {
        ETPTerm<?> t = ETP.parse("-100");
        assertEquals("-100", t.toString());
        assertEquals(new ETPLong(-100).getValue(), t.getValue());
    }

    @Test
    public void testFloat() throws Exception  {
        ETPTerm<?> t = ETP.parse("3.14159265359");
        assertEquals("3.14159265359", t.toString());
        assertEquals(new ETPDouble(3.14159265359).getValue(), t.getValue());
    }

    @Test
    public void testNegativeFloat() throws Exception  {
        ETPTerm<?> t = ETP.parse("-3.14159265359");
        assertEquals("-3.14159265359", t.toString());
        assertEquals(new ETPDouble(-3.14159265359).getValue(), t.getValue());
    }

    @Test
    public void testBoolean() throws Exception  {
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
    public void testAtom() throws Exception  {
        {
            ETPTerm<?> t = ETP.parse("helloworld");
            assertEquals("helloworld", t.toString());
            assertEquals(new ETPAtom("helloworld").getValue(), t.getValue());
        }

        {
            ETPTerm<?> t = ETP.parse("'helloworld@this is a special atom'");
            assertEquals("helloworld@this is a special atom", t.getValue());
            assertEquals("'helloworld@this is a special atom'", t.toString());
            assertEquals(new ETPQuotedAtom("helloworld@this is a special atom").getValue(), t.getValue());
        }
    }

    @Test
    public void testList() throws Exception  {
        ETPTerm<?> t = ETP.parse("[1,2,3]");
        assertEquals("[1,2,3]", t.toString());
        List<ETPTerm<?>> v = new ArrayList<ETPTerm<?>>();
        v.add(new ETPLong(1));
        v.add(new ETPLong(2));
        v.add(new ETPLong(3));
        assertEquals(new ETPList(v).getValue().toString(), t.getValue().toString());
    }

    @Test
    public void testTuple() throws Exception  {
        ETPTerm<?> t = ETP.parse("{foo,bar,1}");
        assertEquals("{foo,bar,1}", t.toString());
        List<ETPTerm<?>> v = new ArrayList<ETPTerm<?>>();
        v.add(new ETPAtom("foo"));
        v.add(new ETPAtom("bar"));
        v.add(new ETPLong(1));
        assertEquals(new ETPList(v).getValue().toString(), t.getValue().toString());
    }

    @Test
    public void testNesting() throws Exception  {
        ETPTerm<?> t = ETP.parse("{foo,bar,[1,2,{a,b,c}]}");
        assertEquals("{foo,bar,[1,2,{a,b,c}]}", t.toString());

        ETPTuple tuple = new ETPTuple(
            new ETPAtom("foo"),
            new ETPAtom("bar"),
            new ETPList(
                    new ETPLong(1),
                    new ETPLong(2),
                    new ETPTuple(new ETPAtom("a"), new ETPAtom("b"), new ETPAtom("c"))
            )
        );
        assertEquals(tuple.toString(), t.toString());
    }

    @Test
    public void testBinaries() throws Exception  {
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
    public void testFakeBin() throws Exception {
        ETPTerm term = ETP.parse("#Bin<15>");
        assertEquals("#Bin<15>", term.toString());
        assertEquals(new OtpErlangBinary(new byte[15]), term.getOTP());
    }

    @Test
    public void testPIDs() throws Exception  {
        {
            ETPTerm<?> t = ETP.parse("<0.33.0>");
            assertEquals("<0.33.0>", t.toString());
            assertEquals(t.getOTP(), new OtpErlangPid("", 0, 33, 0));
        }
        {
            OtpErlangPid otpErlangPid = new OtpErlangPid("node", 1, 2, 0);
            ETPTerm<?> t = ETP.parse(otpErlangPid.toString());

            assertEquals("#Pid<node.1.2>", t.toString());
            assertEquals(otpErlangPid, t.getOTP());
        }
        {
            OtpErlangPid otpErlangPid = new OtpErlangPid("node@node.node12", 1, 2, 0);
            ETPTerm<?> t = ETP.parse(otpErlangPid.toString());

            assertEquals("#Pid<node@node.node12.1.2>", t.toString());
            assertEquals(otpErlangPid, t.getOTP());
        }

    }

    @Test
    public void testRef() throws Exception  {
        ETPTerm<?> t = ETP.parse("#Ref<0.0.0.32>");
        assertEquals("#Ref<0.0.0.32>", t.toString());
    }

    @Test
    public void testFun() throws Exception  {
        ETPTerm<?> t = ETP.parse("#Fun<erl_eval.6.39074546>");
        assertEquals("#Fun<erl_eval.6.39074546>", t.toString());
    }


    @Test
    public void testStringMulti() throws Exception {
        {
            List<ETPTerm> t = ETP.parseMulti("a .\n b .");
        }
        {
            List<ETPTerm> t = ETP.parseMulti("{a,b}. {c,1,[a,b]}.");
            System.out.println(t);
        }
    }

    @Test
    public void testMap() throws Exception {
        {
            ETPTerm<HashMap<ETPTerm<?>, ETPTerm<?>>> t = ETP.parse("#{foo=>2}");
            assertEquals(new ETPLong(2), t.getValue().get(new ETPAtom("foo")));
        }

        {
            ETPTerm<HashMap<ETPTerm<?>, ETPTerm<?>>> t = ETP.parse("#{a => 2, b => 3, c=> 4, \"a\" => 1, \"b\" => 2, \"c\" => 4}");
            assertEquals(new ETPLong(2), t.getValue().get(new ETPAtom("a")));
            assertEquals(new ETPLong(3), t.getValue().get(new ETPAtom("b")));
            assertEquals(new ETPLong(4), t.getValue().get(new ETPAtom("c")));
            assertEquals(new ETPLong(1), t.getValue().get(new ETPString("a")));
            assertEquals(new ETPLong(2), t.getValue().get(new ETPString("b")));
            assertEquals(new ETPLong(4), t.getValue().get(new ETPString("c")));
        }
    }


}
