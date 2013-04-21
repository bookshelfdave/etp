package com.metadave.etp.rep;


public class ETPQuotedAtom extends ETPAtom {
    public ETPQuotedAtom(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }
}
