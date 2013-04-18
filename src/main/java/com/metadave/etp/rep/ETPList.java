package com.metadave.etp.rep;

import java.util.List;

public class ETPList extends ETPTerm<List<ETPTerm<?>>>{
    public ETPList(List value) {
        super(value);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("[");
        boolean isFirst = true;
        for(ETPTerm<?> t : getValue()) {
            if(isFirst) {
                b.append(t.toString());
                isFirst = false;
            } else {
                b.append(",");
                b.append(t.toString());
            }

        }
        b.append("]");
        return b.toString();
    }
}
