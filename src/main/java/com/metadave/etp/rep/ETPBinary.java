package com.metadave.etp.rep;


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

    public static abstract class ETPBinaryValue<V> {
        private Integer size = null;
        protected V value;


        protected ETPBinaryValue(V value) {
            this.value = value;
        }

        protected ETPBinaryValue(V value, int size) {
            this.size = new Integer(size);
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

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
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
            return "\"" + value.toString() + "\"";
        }
    }
}
