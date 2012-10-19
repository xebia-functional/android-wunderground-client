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
 * MoonPhaseResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/astronomy
 *
 * Returns the moon phase, sunrise and sunset times
 *
 */
public class MoonPhaseResponse extends AbstractJSONResponse implements Serializable {

    private int precentIlluminated;

    private int ageOfMoon;

    @JsonProperty("current_time")
    private BasicTimeResponse currentTime;

    private BasicTimeResponse sunrise;

    private BasicTimeResponse sunset;

    public int getPrecentIlluminated() {
        return precentIlluminated;
    }

    public void setPrecentIlluminated(int precentIlluminated) {
        this.precentIlluminated = precentIlluminated;
    }

    public int getAgeOfMoon() {
        return ageOfMoon;
    }

    public void setAgeOfMoon(int ageOfMoon) {
        this.ageOfMoon = ageOfMoon;
    }

    public BasicTimeResponse getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(BasicTimeResponse currentTime) {
        this.currentTime = currentTime;
    }

    public BasicTimeResponse getSunrise() {
        return sunrise;
    }

    public void setSunrise(BasicTimeResponse sunrise) {
        this.sunrise = sunrise;
    }

    public BasicTimeResponse getSunset() {
        return sunset;
    }

    public void setSunset(BasicTimeResponse sunset) {
        this.sunset = sunset;
    }
}
