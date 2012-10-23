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

import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;

/**
 * PlannerTempResponse class
 */
public class PlannerPrecipResponse extends AbstractJSONResponse implements Serializable {

    private SnowResponse min;

    private SnowResponse avg;

    private SnowResponse max;

    public SnowResponse getMin() {
        return min;
    }

    public void setMin(SnowResponse min) {
        this.min = min;
    }

    public SnowResponse getAvg() {
        return avg;
    }

    public void setAvg(SnowResponse avg) {
        this.avg = avg;
    }

    public SnowResponse getMax() {
        return max;
    }

    public void setMax(SnowResponse max) {
        this.max = max;
    }
}
