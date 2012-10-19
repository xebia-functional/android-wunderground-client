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
 * ForecastResponse
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/forecast
 *
 * Returns a summary of the weather for the next 3 days. This includes high and low temperatures, a string text forecast and the conditions
 *
 */
public class ForecastResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("txt_forecast")
    private TxtForecastResponse txtForecast;

    @JsonProperty("simpleforecast")
    private  SimpleForecastResponse simpleForecast;

    public TxtForecastResponse getTxtForecast() {
        return txtForecast;
    }

    public void setTxtForecast(TxtForecastResponse txtForecast) {
        this.txtForecast = txtForecast;
    }

    public SimpleForecastResponse getSimpleForecast() {
        return simpleForecast;
    }

    public void setSimpleForecast(SimpleForecastResponse simpleForecast) {
        this.simpleForecast = simpleForecast;
    }
}
