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
 * WundergroundResponse class
 *
 * General class with all response data
 *
 */
public class WundergroundResponse extends AbstractJSONResponse implements Serializable {

    private InfoWundergroundResponse response;

    /**
     * @see AlertResponse
     */
    private List<AlertResponse> alerts;

    /**
     * @see AlmanacResponse
     */
    private AlmanacResponse almanac;

    /**
     * @see MoonPhaseResponse
     */
    @JsonProperty("moon_phase")
    private MoonPhaseResponse moonPhase;

    /**
     * @see ObservationResponse
     */
    @JsonProperty("current_observation")
    private ObservationResponse currentObservation;

    /**
     * @see ForecastResponse
     */
    private ForecastResponse forecast;

    /**
     * @see GeoLookupLocationsResponse
     */
    @JsonProperty("location")
    private GeoLookupLocationsResponse geoLookupLocation;

    /**
     * @see RawTideResponse
     */
    @JsonProperty("rawtide")
    private RawTideResponse rawTide;

    /**
     * @see SatelliteResponse
     */
    private SatelliteResponse satellite;

    public InfoWundergroundResponse getResponse() {
        return response;
    }

    public void setResponse(InfoWundergroundResponse response) {
        this.response = response;
    }

    public ObservationResponse getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(ObservationResponse currentObservation) {
        this.currentObservation = currentObservation;
    }

    public List<AlertResponse> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<AlertResponse> alerts) {
        this.alerts = alerts;
    }

    public AlmanacResponse getAlmanac() {
        return almanac;
    }

    public void setAlmanac(AlmanacResponse almanac) {
        this.almanac = almanac;
    }

    public MoonPhaseResponse getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(MoonPhaseResponse moonPhase) {
        this.moonPhase = moonPhase;
    }

    public ForecastResponse getForecast() {
        return forecast;
    }

    public void setForecast(ForecastResponse forecast) {
        this.forecast = forecast;
    }

    public GeoLookupLocationsResponse getGeoLookupLocation() {
        return geoLookupLocation;
    }

    public void setGeoLookupLocation(GeoLookupLocationsResponse geoLookupLocation) {
        this.geoLookupLocation = geoLookupLocation;
    }

    public RawTideResponse getRawTide() {
        return rawTide;
    }

    public void setRawTide(RawTideResponse rawTide) {
        this.rawTide = rawTide;
    }

    public SatelliteResponse getSatellite() {
        return satellite;
    }

    public void setSatellite(SatelliteResponse satellite) {
        this.satellite = satellite;
    }
}
