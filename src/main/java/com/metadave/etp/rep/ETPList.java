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

import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;

import java.util.ArrayList;
import java.util.List;

public class ETPList extends ETPTerm<List<ETPTerm<?>>>{
    public ETPList(List<ETPTerm<?>> value) {
        super(value);
    }

    public ETPList(ETPTerm<?> ... terms) {
        List<ETPTerm<?>> ts = new ArrayList<ETPTerm<?>>();
        for(ETPTerm<?> t : terms) {
            ts.add(t);
        }
        this.value = ts;
    }

    public ETPTerm getValue(int index) {
        // TODO: check for valid index ranges
        return value.get(index);
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


    @Override
    public OtpErlangObject getOTP() {
        OtpErlangObject[] children = new OtpErlangObject[this.getValue().size()];
        for(int i = 0; i < this.getValue().size(); i++) {
            children[i] = this.getValue().get(i).getOTP();
        }
        return new OtpErlangList(children);
    }
}
