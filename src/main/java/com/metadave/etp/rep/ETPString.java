package com.metadave.etp.rep;


public class ETPString extends ETPTerm<String> {
    public ETPString(String value) {
        super(value);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("\"");
        b.append(value);
        b.append("\"");
        return b.toString();
    }
}
