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
 * HurricaneForecast class
 */
public class HurricaneForecast extends AbstractJSONResponse implements Serializable {

    @JsonProperty("ForecastHour")
    private String forecastHour;

    @JsonProperty("SaffirSimpsonCategory")
    private int safFirSimpsonCategory;

    private double lat;

    private double lon;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Time")
    private FctTimeResponse time;

    @JsonProperty("TimeGTM")
    private FctTimeResponse timeGtm;

    @JsonProperty("WindSpeed")
    private SpeedResponse windSpeed;

    @JsonProperty("WindGust")
    private SpeedResponse windGust;

    @JsonProperty("WindQuadrants")
    private QuadrantsResponse windQuadrants;

    @JsonProperty("WindRadius")
    private HurricaneRadiusResponse windRadius;

    @JsonProperty("ErrorRadius")
    private double errorRadius;

    public String getForecastHour() {
        return forecastHour;
    }

    public void setForecastHour(String forecastHour) {
        this.forecastHour = forecastHour;
    }

    public int getSafFirSimpsonCategory() {
        return safFirSimpsonCategory;
    }

    public void setSafFirSimpsonCategory(int safFirSimpsonCategory) {
        this.safFirSimpsonCategory = safFirSimpsonCategory;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FctTimeResponse getTime() {
        return time;
    }

    public void setTime(FctTimeResponse time) {
        this.time = time;
    }

    public FctTimeResponse getTimeGtm() {
        return timeGtm;
    }

    public void setTimeGtm(FctTimeResponse timeGtm) {
        this.timeGtm = timeGtm;
    }

    public SpeedResponse getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(SpeedResponse windSpeed) {
        this.windSpeed = windSpeed;
    }

    public SpeedResponse getWindGust() {
        return windGust;
    }

    public void setWindGust(SpeedResponse windGust) {
        this.windGust = windGust;
    }

    public QuadrantsResponse getWindQuadrants() {
        return windQuadrants;
    }

    public void setWindQuadrants(QuadrantsResponse windQuadrants) {
        this.windQuadrants = windQuadrants;
    }

    public HurricaneRadiusResponse getWindRadius() {
        return windRadius;
    }

    public void setWindRadius(HurricaneRadiusResponse windRadius) {
        this.windRadius = windRadius;
    }

    public double getErrorRadius() {
        return errorRadius;
    }

    public void setErrorRadius(double errorRadius) {
        this.errorRadius = errorRadius;
    }
}
