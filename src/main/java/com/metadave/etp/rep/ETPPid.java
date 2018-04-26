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
import com.ericsson.otp.erlang.OtpErlangPid;

public class ETPPid extends com.metadave.etp.rep.ETPTerm<String> {
    public ETPPid(String value) {
        super(value);
    }

    @Override
    public OtpErlangObject getOTP() {
        int open = value.indexOf('<');
        int close = value.lastIndexOf('>');
        String body = value.substring(open + 1, close);

        if (value.startsWith("#Pid")) {
            int lastDot = body.lastIndexOf('.');
            int serial = Integer.parseInt(body.substring(lastDot + 1));
            body = body.substring(0, lastDot);

            int penultimateDot = body.lastIndexOf('.');

            String node = body.substring(0, penultimateDot);
            int id = Integer.parseInt(body.substring(penultimateDot + 1, lastDot));

            return new OtpErlangPid(node, id, serial, 0);
        }

        int firstDot = body.indexOf('.');
        int secondDot = body.lastIndexOf('.');

        int id = Integer.parseInt(body.substring(0, firstDot));
        int serial = Integer.parseInt(body.substring(firstDot + 1, secondDot));
        int creation = Integer.parseInt(body.substring(secondDot + 1));

        return new OtpErlangPid("", id, serial, creation);
    }
}
