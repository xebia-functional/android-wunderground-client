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
 * WebCamResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/webcams
 *
 * Returns locations of nearby Personal Weather Stations and URLs for images from their web cams
 */
public class WebCamResponse extends AbstractJSONResponse implements Serializable {

    private String handle;

    @JsonProperty("camid")
    private String camId;

    @JsonProperty("camindex")
    private int camIndex;

    @JsonProperty("assocStationId")
    private String assoc_station_id;

    private String link;

    @JsonProperty("linktext")
    private String linkText;

    @JsonProperty("cameraType")
    private String cameratype;

    private String organization;

    private String neighborhood;

    private String zip;

    private String city;

    private String state;

    private String country;

    @JsonProperty("tzName")
    private String tzname;

    private double lat;

    private double lon;

    private String updated;

    private String downloaded;

    @JsonProperty("isrecent")
    private int isRecent;

    @JsonProperty("CURRENTIMAGEURL")
    private String currentImageUrl;

    @JsonProperty("WIDGETCURRENTIMAGEURL")
    private String widgetCurrentImageUrl;

    @JsonProperty("CAMURL")
    private String camUrl;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getCamId() {
        return camId;
    }

    public void setCamId(String camId) {
        this.camId = camId;
    }

    public int getCamIndex() {
        return camIndex;
    }

    public void setCamIndex(int camIndex) {
        this.camIndex = camIndex;
    }

    public String getAssoc_station_id() {
        return assoc_station_id;
    }

    public void setAssoc_station_id(String assoc_station_id) {
        this.assoc_station_id = assoc_station_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getCameratype() {
        return cameratype;
    }

    public void setCameratype(String cameratype) {
        this.cameratype = cameratype;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTzname() {
        return tzname;
    }

    public void setTzname(String tzname) {
        this.tzname = tzname;
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

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(String downloaded) {
        this.downloaded = downloaded;
    }

    public int getRecent() {
        return isRecent;
    }

    public void setRecent(int recent) {
        isRecent = recent;
    }

    public String getCurrentImageUrl() {
        return currentImageUrl;
    }

    public void setCurrentImageUrl(String currentImageUrl) {
        this.currentImageUrl = currentImageUrl;
    }

    public String getWidgetCurrentImageUrl() {
        return widgetCurrentImageUrl;
    }

    public void setWidgetCurrentImageUrl(String widgetCurrentImageUrl) {
        this.widgetCurrentImageUrl = widgetCurrentImageUrl;
    }

    public String getCamUrl() {
        return camUrl;
    }

    public void setCamUrl(String camUrl) {
        this.camUrl = camUrl;
    }
}
