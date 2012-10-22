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
import java.util.List;

/**
 * CurrentHurricaneResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/currenthurricane
 *
 * Returns information about current hurricanes and tropical storms. This feature can be used with other weather API features.
 * However, location query options do not apply to the results for currenthurricane.
 */
public class CurrentHurricaneResponse extends AbstractJSONResponse implements Serializable {

    private StormInfoResponse stormInfo;

    @JsonProperty("Current")
    private HurricaneResponse current;

    private List<HurricaneForecast> forecast;

    @JsonProperty("ExtendedForecast")
    private List<HurricaneForecast> extendedForecast;

    private List<HurricaneResponse> track;

    public StormInfoResponse getStormInfo() {
        return stormInfo;
    }

    public void setStormInfo(StormInfoResponse stormInfo) {
        this.stormInfo = stormInfo;
    }

    public HurricaneResponse getCurrent() {
        return current;
    }

    public void setCurrent(HurricaneResponse current) {
        this.current = current;
    }

    public List<HurricaneForecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<HurricaneForecast> forecast) {
        this.forecast = forecast;
    }

    public List<HurricaneForecast> getExtendedForecast() {
        return extendedForecast;
    }

    public void setExtendedForecast(List<HurricaneForecast> extendedForecast) {
        this.extendedForecast = extendedForecast;
    }

    public List<HurricaneResponse> getTrack() {
        return track;
    }

    public void setTrack(List<HurricaneResponse> track) {
        this.track = track;
    }
}
