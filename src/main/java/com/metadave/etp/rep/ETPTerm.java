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

public abstract class ETPTerm<T> {
    protected T value;


    public ETPTerm() {

    }


    public abstract OtpErlangObject getOTP();

    public ETPTerm(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj.getClass().equals(this.getClass())) {
            return this.value.equals(((ETPTerm) obj).getValue());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        String hasher = this.getClass().getName() + this.value.toString();
        return hasher.hashCode();
    }
}
