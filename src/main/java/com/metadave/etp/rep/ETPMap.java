package com.metadave.etp.rep;

import com.ericsson.otp.erlang.OtpErlangMap;
import com.ericsson.otp.erlang.OtpErlangObject;

import java.util.HashMap;
import java.util.Map;

public class ETPMap extends ETPTerm<Map<ETPTerm, ETPTerm>> {

    public ETPMap(Map<ETPTerm, ETPTerm> m) {
        super(m);
    }

    public ETPMap() {
        super(new HashMap<ETPTerm, ETPTerm>());
    }

    @Override
    public OtpErlangObject getOTP() {
        int len = this.value.keySet().size();

        OtpErlangObject[] keys = new OtpErlangObject[len];
        OtpErlangObject[] values = new OtpErlangObject[len];

        int index = 0;
        for(ETPTerm term_key: this.value.keySet()) {
            ETPTerm term_value = this.value.get(term_key);
            keys[index] = term_key.getOTP();
            values[index] = term_value.getOTP();
            index++;
        }

        return new OtpErlangMap(keys, values);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("#{");
        String sep = "";
        for(Map.Entry<ETPTerm, ETPTerm> entry : this.value.entrySet()) {
            b.append(sep);
            b.append(entry.getKey().toString());
            b.append(" => ");
            b.append(entry.getValue().toString());
            sep = ", ";
        }
        b.append("}");
        return b.toString();
    }
}
