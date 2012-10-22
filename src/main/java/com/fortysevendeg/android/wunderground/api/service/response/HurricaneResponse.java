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
 * HurricaneResponse class
 */
public class HurricaneResponse extends AbstractJSONResponse implements Serializable {

    private double lat;

    private double lon;

    /**
     * -5   Remnants
     * -4   Invest
     * -3   Extratropical
     * -2   Tropical Depression
     * -1   Subtropical Storm
     * 0    Tropical Storm
     * 1–5  Category [Nice] Hurricane
     *
     * These are based on the Saffir-Simpson hurricane scale. Typhoons are classified into these bins.
     */
    @JsonProperty("SaffirSimpsonCategory")
    private int saffirSimpsonCategory;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Time")
    private FctTimeResponse time;

    @JsonProperty("TimeGMT")
    private FctTimeResponse timeGmt;

    @JsonProperty("WindSpeed")
    private SpeedResponse windSpeed;

    @JsonProperty("WindGust")
    private SpeedResponse windGust;

    @JsonProperty("Fspeed")
    private SpeedResponse fSpeed;

    @JsonProperty("Movement")
    private MovementHurricane movement;

    @JsonProperty("Pressure")
    private PressureResponse pressure;

    @JsonProperty("WindQuadrants")
    private QuadrantsResponse windQuadrants;

    @JsonProperty("WindRadius")
    private HurricaneRadiusResponse windRadius;

    @JsonProperty("SeaQuadrants")
    private QuadrantsResponse seaQuadrants;

    @JsonProperty("SeaRadius")
    private HurricaneRadiusResponse seaRadius;

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

    public int getSaffirSimpsonCategory() {
        return saffirSimpsonCategory;
    }

    public void setSaffirSimpsonCategory(int saffirSimpsonCategory) {
        this.saffirSimpsonCategory = saffirSimpsonCategory;
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

    public FctTimeResponse getTimeGmt() {
        return timeGmt;
    }

    public void setTimeGmt(FctTimeResponse timeGmt) {
        this.timeGmt = timeGmt;
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

    public SpeedResponse getfSpeed() {
        return fSpeed;
    }

    public void setfSpeed(SpeedResponse fSpeed) {
        this.fSpeed = fSpeed;
    }

    public MovementHurricane getMovement() {
        return movement;
    }

    public void setMovement(MovementHurricane movement) {
        this.movement = movement;
    }

    public PressureResponse getPressure() {
        return pressure;
    }

    public void setPressure(PressureResponse pressure) {
        this.pressure = pressure;
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

    public QuadrantsResponse getSeaQuadrants() {
        return seaQuadrants;
    }

    public void setSeaQuadrants(QuadrantsResponse seaQuadrants) {
        this.seaQuadrants = seaQuadrants;
    }

    public HurricaneRadiusResponse getSeaRadius() {
        return seaRadius;
    }

    public void setSeaRadius(HurricaneRadiusResponse seaRadius) {
        this.seaRadius = seaRadius;
    }
}