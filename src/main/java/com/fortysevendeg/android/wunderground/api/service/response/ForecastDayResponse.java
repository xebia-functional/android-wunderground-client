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
 * ForecastDayResponse class
 */
public class ForecastDayResponse extends AbstractJSONResponse implements Serializable {

    private int period;

    private String icon;

    @JsonProperty("icon_url")
    private String iconUrl;

    private String title;

    @JsonProperty("fctext")
    private String fcText;

    @JsonProperty("fcttext_metric")
    private String fctTextMetric;

    private int pop;

    private DateResponse date;

    private TemperatureForecastResponse high;

    private TemperatureForecastResponse low;

    private String conditions;

    @JsonProperty("skyicon")
    private String skyIcon;

    @JsonProperty("qpf_allday")
    private QpfResponse qpfAllDay;

    @JsonProperty("qpf_day")
    private QpfResponse qpfDay;

    @JsonProperty("qpf_night")
    private QpfResponse qpfNight;

    @JsonProperty("snow_allday")
    private SnowResponse snowAllDay;

    @JsonProperty("snow_day")
    private SnowResponse snowDay;

    @JsonProperty("snow_night")
    private SnowResponse snowNight;

    @JsonProperty("maxwind")
    private WindResponse maxWind;

    @JsonProperty("avewind")
    private WindResponse aveWind;

    @JsonProperty("avehumidity")
    private int aveHumidity;

    @JsonProperty("maxhumidity")
    private int maxHumidity;

    @JsonProperty("minhumidity")
    private int minHumidity;


    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFcText() {
        return fcText;
    }

    public void setFcText(String fcText) {
        this.fcText = fcText;
    }

    public String getFctTextMetric() {
        return fctTextMetric;
    }

    public void setFctTextMetric(String fctTextMetric) {
        this.fctTextMetric = fctTextMetric;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public DateResponse getDate() {
        return date;
    }

    public void setDate(DateResponse date) {
        this.date = date;
    }

    public TemperatureForecastResponse getHigh() {
        return high;
    }

    public void setHigh(TemperatureForecastResponse high) {
        this.high = high;
    }

    public TemperatureForecastResponse getLow() {
        return low;
    }

    public void setLow(TemperatureForecastResponse low) {
        this.low = low;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getSkyIcon() {
        return skyIcon;
    }

    public void setSkyIcon(String skyIcon) {
        this.skyIcon = skyIcon;
    }

    public QpfResponse getQpfAllDay() {
        return qpfAllDay;
    }

    public void setQpfAllDay(QpfResponse qpfAllDay) {
        this.qpfAllDay = qpfAllDay;
    }

    public QpfResponse getQpfDay() {
        return qpfDay;
    }

    public void setQpfDay(QpfResponse qpfDay) {
        this.qpfDay = qpfDay;
    }

    public QpfResponse getQpfNight() {
        return qpfNight;
    }

    public void setQpfNight(QpfResponse qpfNight) {
        this.qpfNight = qpfNight;
    }

    public SnowResponse getSnowAllDay() {
        return snowAllDay;
    }

    public void setSnowAllDay(SnowResponse snowAllDay) {
        this.snowAllDay = snowAllDay;
    }

    public SnowResponse getSnowDay() {
        return snowDay;
    }

    public void setSnowDay(SnowResponse snowDay) {
        this.snowDay = snowDay;
    }

    public SnowResponse getSnowNight() {
        return snowNight;
    }

    public void setSnowNight(SnowResponse snowNight) {
        this.snowNight = snowNight;
    }

    public WindResponse getMaxWind() {
        return maxWind;
    }

    public void setMaxWind(WindResponse maxWind) {
        this.maxWind = maxWind;
    }

    public WindResponse getAveWind() {
        return aveWind;
    }

    public void setAveWind(WindResponse aveWind) {
        this.aveWind = aveWind;
    }

    public int getAveHumidity() {
        return aveHumidity;
    }

    public void setAveHumidity(int aveHumidity) {
        this.aveHumidity = aveHumidity;
    }

    public int getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(int maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public int getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(int minHumidity) {
        this.minHumidity = minHumidity;
    }
}
