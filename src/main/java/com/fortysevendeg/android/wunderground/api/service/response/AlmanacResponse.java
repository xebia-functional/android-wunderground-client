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
 * AlmanacResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/almanac
 *
 * Historical average temperature for today
 *
 */
public class AlmanacResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("airport_code")
    private String airportCode;

    @JsonProperty("temp_high")
    private HistoricalTemperatureResponse tempHigh;

    @JsonProperty("temp_low")
    private HistoricalTemperatureResponse tempLow;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public HistoricalTemperatureResponse getTempHigh() {
        return tempHigh;
    }

    public void setTempHigh(HistoricalTemperatureResponse tempHigh) {
        this.tempHigh = tempHigh;
    }

    public HistoricalTemperatureResponse getTempLow() {
        return tempLow;
    }

    public void setTempLow(HistoricalTemperatureResponse tempLow) {
        this.tempLow = tempLow;
    }
}
