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

import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;

/**
 * ObservationResponse class
 */
public class ObservationResponse extends AbstractJSONResponse implements Serializable {

    private ImageResponse image;

    private LocationResponse displayLocation;

    private LocationResponse observationLocation;

    private String estimated;

    private String stationId;

    private String observationTime;

    private String observationTimeRfc822;

    private String observationEpoch;

    private String localTimeRfc822;

    private String localEpoch;

    private String localTzShort;

    private String localTzLong;

    private String localTzOffset;

    private String weather;

    private String temperatureString;

    private Double tempF;

    private Double tempC;

    private String relativeHumidity;

    private String windString;

    private String windDir;

    private Double windDegrees;

    private Double windMph;

    private Double windGustMph;

    private Double windKph;

    private Double windGustKph;

    private Double pressureMb;

    private Double pressureIn;

    private String pressureTrend;

    private String dewpointString;

    private Double dewpointF;

    private Double dewpointC;

    private String heatIndexString;

    private String heatIndexF;

    private String heatIndexC;

    private String windchillString;

    private String windchillF;

    private String windchillC;

    private String feelslikeString;

    private Double feelslikeF;

    private Double feelslikeC;

    private Double visibilityMi;

    private Double visibilityKm;

    private String solarradiation;

    private Double uV;

    private String precip1hrString;

    private String precip1hrIn;

    private String precip1hrMetric;

    private String precipTodayString;

    private String precipTodayIn;

    private String precipTodayMetric;

    private String icon;

    private String iconUrl;

    private String forecastUrl;

    private String historyUrl;

    private String obUrl;

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse image) {
        this.image = image;
    }

    public LocationResponse getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(LocationResponse displayLocation) {
        this.displayLocation = displayLocation;
    }

    public LocationResponse getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(LocationResponse observationLocation) {
        this.observationLocation = observationLocation;
    }

    public String getEstimated() {
        return estimated;
    }

    public void setEstimated(String estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Double getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(Double windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Double getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(Double windGustMph) {
        this.windGustMph = windGustMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Double getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(Double windGustKph) {
        this.windGustKph = windGustKph;
    }

    public Double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public Double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Double getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(Double visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public Double getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(Double visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getuV() {
        return uV;
    }

    public void setuV(Double uV) {
        this.uV = uV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
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

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }
}
