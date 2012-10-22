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
 * HourlyResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/hourly
 *
 * Returns an hourly forecast for the next 36 hours immediately following the API request
 */
public class HourlyResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("FCTTIME")
    private FctTimeResponse fctTime;

    private BasicHourlyResponse temp;

    @JsonProperty("dewpoint")
    private BasicHourlyResponse dewPoint;

    private String condition;

    private String icon;

    @JsonProperty("icon_url")
    private String iconUrl;

    @JsonProperty("fctcode")
    private String fctCode;

    private int sky;

    @JsonProperty("wspd")
    private BasicHourlyResponse wsPd;

    @JsonProperty("wdir")
    private BasicHourlyResponse wDir;

    private String wx;

    private int uvi;

    private int humidity;

    @JsonProperty("windchill")
    private BasicHourlyResponse windChill;

    @JsonProperty("heatindex")
    private BasicHourlyResponse heatIndex;

    @JsonProperty("feelslike")
    private BasicHourlyResponse feelsLike;

    private BasicHourlyResponse qpf;

    private BasicHourlyResponse snow;

    private int pop;

    @JsonProperty("mslp")
    private BasicHourlyResponse msLp;

    public FctTimeResponse getFctTime() {
        return fctTime;
    }

    public void setFctTime(FctTimeResponse fctTime) {
        this.fctTime = fctTime;
    }

    public BasicHourlyResponse getTemp() {
        return temp;
    }

    public void setTemp(BasicHourlyResponse temp) {
        this.temp = temp;
    }

    public BasicHourlyResponse getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(BasicHourlyResponse dewPoint) {
        this.dewPoint = dewPoint;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getFctCode() {
        return fctCode;
    }

    public void setFctCode(String fctCode) {
        this.fctCode = fctCode;
    }

    public int getSky() {
        return sky;
    }

    public void setSky(int sky) {
        this.sky = sky;
    }

    public BasicHourlyResponse getWsPd() {
        return wsPd;
    }

    public void setWsPd(BasicHourlyResponse wsPd) {
        this.wsPd = wsPd;
    }

    public BasicHourlyResponse getwDir() {
        return wDir;
    }

    public void setwDir(BasicHourlyResponse wDir) {
        this.wDir = wDir;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public int getUvi() {
        return uvi;
    }

    public void setUvi(int uvi) {
        this.uvi = uvi;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public BasicHourlyResponse getWindChill() {
        return windChill;
    }

    public void setWindChill(BasicHourlyResponse windChill) {
        this.windChill = windChill;
    }

    public BasicHourlyResponse getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(BasicHourlyResponse heatIndex) {
        this.heatIndex = heatIndex;
    }

    public BasicHourlyResponse getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BasicHourlyResponse feelsLike) {
        this.feelsLike = feelsLike;
    }

    public BasicHourlyResponse getQpf() {
        return qpf;
    }

    public void setQpf(BasicHourlyResponse qpf) {
        this.qpf = qpf;
    }

    public BasicHourlyResponse getSnow() {
        return snow;
    }

    public void setSnow(BasicHourlyResponse snow) {
        this.snow = snow;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public BasicHourlyResponse getMsLp() {
        return msLp;
    }

    public void setMsLp(BasicHourlyResponse msLp) {
        this.msLp = msLp;
    }
}
