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
 * GeoLookupLocationsResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/geolookup
 *
 * Returns the the city name, zip code / postal code, latitude-longitude coordinates and nearby personal weather stations
 */
public class GeoLookupLocationsResponse extends AbstractJSONResponse implements Serializable {

    private String type;

    private String country;

    @JsonProperty("country_iso3166")
    private String countryIso3166;

    @JsonProperty("country_name")
    private String countryName;

    private String state;

    private String city;

    @JsonProperty("tz_short")
    private String tzShort;

    @JsonProperty("tz_long")
    private String tzLong;

    private double lat;

    private double lon;

    private String zip;

    private String magic;

    private String wmo;

    private String l;

    @JsonProperty("requesturl")
    private String requestUrl;

    @JsonProperty("wuiurl")
    private String wuiUrl;

    @JsonProperty("nearby_weather_stations")
    private NearbyWeatherStationsResponse nearbyWeatherStations;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTzShort() {
        return tzShort;
    }

    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    public String getTzLong() {
        return tzLong;
    }

    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String getWmo() {
        return wmo;
    }

    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getWuiUrl() {
        return wuiUrl;
    }

    public void setWuiUrl(String wuiUrl) {
        this.wuiUrl = wuiUrl;
    }

    public NearbyWeatherStationsResponse getNearbyWeatherStations() {
        return nearbyWeatherStations;
    }

    public void setNearbyWeatherStations(NearbyWeatherStationsResponse nearbyWeatherStations) {
        this.nearbyWeatherStations = nearbyWeatherStations;
    }
}
