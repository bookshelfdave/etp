package com.metadave.etp.rep;


import java.util.ArrayList;
import java.util.List;

public class ETPTuple extends ETPTerm<List<ETPTerm<?>>> {
    public ETPTuple(List value) {
        super(value);
    }

    public ETPTuple(ETPTerm<?> ... terms) {
        List<ETPTerm<?>> ts = new ArrayList<ETPTerm<?>>();
        for(ETPTerm<?> t : terms) {
            ts.add(t);
        }
        this.value = ts;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("{");
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
        b.append("}");
        return b.toString();
    }
}
