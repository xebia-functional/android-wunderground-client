/*
 *
 *  * Copyright (C) 2012 47 Degrees, LLC
 *  * http://47deg.com
 *  * hello@47deg.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.fortysevendeg.android.wunderground.api.service.response;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;

/**
 * HurricaneRadiusResponse class
 */
public class HurricaneRadiusResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("12")
    private HurricaneBasicRadiusResponse r12;

    @JsonProperty("34")
    private HurricaneBasicRadiusResponse r34;

    @JsonProperty("50")
    private HurricaneBasicRadiusResponse r50;

    @JsonProperty("64")
    private HurricaneBasicRadiusResponse r64;

    public HurricaneBasicRadiusResponse getR12() {
        return r12;
    }

    public void setR12(HurricaneBasicRadiusResponse r12) {
        this.r12 = r12;
    }

    public HurricaneBasicRadiusResponse getR34() {
        return r34;
    }

    public void setR34(HurricaneBasicRadiusResponse r34) {
        this.r34 = r34;
    }

    public HurricaneBasicRadiusResponse getR50() {
        return r50;
    }

    public void setR50(HurricaneBasicRadiusResponse r50) {
        this.r50 = r50;
    }

    public HurricaneBasicRadiusResponse getR64() {
        return r64;
    }

    public void setR64(HurricaneBasicRadiusResponse r64) {
        this.r64 = r64;
    }
}
