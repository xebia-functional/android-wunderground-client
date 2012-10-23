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
 * PlannerResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/planner
 *
 * Returns a weather summary based on historical information between the specified dates (30 days max).
 */
public class PlannerResponse extends AbstractJSONResponse implements Serializable {

    private String title;

    @JsonProperty("airport_code")
    private String airportCode;

    private String error;

    @JsonProperty("period_of_record")
    private  PlannerPeriodResponse periodOfRecord;

    @JsonProperty("temp_high")
    private PlannerTempResponse tempHigh;

    @JsonProperty("temp_low")
    private PlannerTempResponse tempLow;

    private PlannerPrecipResponse precip;

    @JsonProperty("dewpoint_high")
    private PlannerTempResponse dewPointHigh;

    @JsonProperty("dewpoint_low")
    private PlannerTempResponse dewPointLow;

    @JsonProperty("cloud_cover")
    private PlannerCloudCoverResponse cloudCover;

    @JsonProperty("chance_of")
    private PlannerChanceOfResponse chanceOf;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public PlannerPeriodResponse getPeriodOfRecord() {
        return periodOfRecord;
    }

    public void setPeriodOfRecord(PlannerPeriodResponse periodOfRecord) {
        this.periodOfRecord = periodOfRecord;
    }

    public PlannerTempResponse getTempHigh() {
        return tempHigh;
    }

    public void setTempHigh(PlannerTempResponse tempHigh) {
        this.tempHigh = tempHigh;
    }

    public PlannerTempResponse getTempLow() {
        return tempLow;
    }

    public void setTempLow(PlannerTempResponse tempLow) {
        this.tempLow = tempLow;
    }

    public PlannerPrecipResponse getPrecip() {
        return precip;
    }

    public void setPrecip(PlannerPrecipResponse precip) {
        this.precip = precip;
    }

    public PlannerTempResponse getDewPointHigh() {
        return dewPointHigh;
    }

    public void setDewPointHigh(PlannerTempResponse dewPointHigh) {
        this.dewPointHigh = dewPointHigh;
    }

    public PlannerTempResponse getDewPointLow() {
        return dewPointLow;
    }

    public void setDewPointLow(PlannerTempResponse dewPointLow) {
        this.dewPointLow = dewPointLow;
    }

    public PlannerCloudCoverResponse getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(PlannerCloudCoverResponse cloudCover) {
        this.cloudCover = cloudCover;
    }

    public PlannerChanceOfResponse getChanceOf() {
        return chanceOf;
    }

    public void setChanceOf(PlannerChanceOfResponse chanceOf) {
        this.chanceOf = chanceOf;
    }
}
