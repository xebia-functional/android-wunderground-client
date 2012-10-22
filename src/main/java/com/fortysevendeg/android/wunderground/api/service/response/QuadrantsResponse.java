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
 * QuadrantsResponse class
 */
public class QuadrantsResponse extends AbstractJSONResponse implements Serializable {

    private String comment;

    @JsonProperty("quad_1")
    private String quad1;

    @JsonProperty("quad_2")
    private String quad2;

    @JsonProperty("quad_3")
    private String quad3;

    @JsonProperty("quad_4")
    private String quad4;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getQuad1() {
        return quad1;
    }

    public void setQuad1(String quad1) {
        this.quad1 = quad1;
    }

    public String getQuad2() {
        return quad2;
    }

    public void setQuad2(String quad2) {
        this.quad2 = quad2;
    }

    public String getQuad3() {
        return quad3;
    }

    public void setQuad3(String quad3) {
        this.quad3 = quad3;
    }

    public String getQuad4() {
        return quad4;
    }

    public void setQuad4(String quad4) {
        this.quad4 = quad4;
    }
}
