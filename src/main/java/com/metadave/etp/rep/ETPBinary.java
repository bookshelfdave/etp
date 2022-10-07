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

package com.metadave.etp.rep;
import com.ericsson.otp.erlang.OtpErlangObject;

import java.util.ArrayList;
import java.util.List;

public class ETPBinary extends ETPTerm<List<ETPBinary.ETPBinaryValue>> {

    public ETPBinary(List<ETPBinaryValue> value) {
        super(value);
    }

    public ETPBinary(ETPBinaryValue ... values) {
        List<ETPBinaryValue> vs = new ArrayList<ETPBinaryValue>();
        for(ETPBinaryValue v : values) {
            vs.add(v);
        }
        this.value = vs;
    }

    public ETPTerm getValue(int index) {
        // TODO: check for valid index ranges
        return value.get(index);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("<<");
        boolean isFirst = true;
        for(ETPBinaryValue v : value) {
            if(isFirst) {
                b.append(v.toString());
                isFirst = false;
            } else {
                b.append(",");
                b.append(v.toString());
            }
        }
        b.append(">>");
        return b.toString();
    }

    public String quote(String s) {
        s=s.replace("\\","\\\\");
        s=s.replace("\"","\\\"");
        return s;
    }

    @Override
    public OtpErlangObject getOTP() {
        return null;
    }

    public static abstract class ETPBinaryValue<V> extends ETPTerm<V> {
        private Integer size = null;

        protected ETPBinaryValue(V value) {
            this.value = value;
        }

        protected ETPBinaryValue(V value, int size) {
            this.size = size;
            this.value = value;
        }

        protected ETPBinaryValue() {
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

    }

    public static class BinInt extends ETPBinaryValue<Long> {
        public BinInt(Long value) {
            super(value);
        }

        public BinInt(Long value, int size) {
            super(value, size);
        }

        @Override
        public String toString() {
            if(this.getSize() != null) {
                return value.toString() + ":" + this.getSize().toString();
            } else {
                return value.toString();
            }
        }

        @Override
        public OtpErlangObject getOTP() {
            return null;
        }
    }

    public static class BinString extends ETPBinaryValue<String> {
        public BinString(String value) {
            super(value);
        }

        public BinString(String value, int size) {
            super(value, size);
        }

        @Override
        public String toString() {
            return "\"" + quote(value) + "\"";
        }

        public String quote(String s) {
            s=s.replace("\\","\\\\");
            s=s.replace("\"","\\\"");
            return s;
        }

        @Override
        public OtpErlangObject getOTP() {
            return null;
        }
    }
}
