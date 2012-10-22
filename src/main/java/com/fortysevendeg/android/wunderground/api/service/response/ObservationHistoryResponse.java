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
 * ObservationHistoryResponse class
 */
public class ObservationHistoryResponse extends AbstractJSONResponse implements Serializable {

    private DateTideResponse date;

    @JsonProperty("utcdate")
    private DateTideResponse utcDate;

    @JsonProperty("tempm")
    private double tempM;

    @JsonProperty("tempi")
    private double tempI;

    @JsonProperty("dewptm")
    private double dewPtm;

    @JsonProperty("dewpti")
    private double dewPti;

    private int hum;

    @JsonProperty("wspdm")
    private double wsPdm;

    @JsonProperty("wspdi")
    private double wsPdi;

    @JsonProperty("wgustm")
    private double wGustM;

    @JsonProperty("wgusti")
    private double wGustI;

    @JsonProperty("wdird")
    private int wDirD;

    @JsonProperty("")
    private String wDirE;

    @JsonProperty("vism")
    private double visM;

    @JsonProperty("visi")
    private double visI;

    @JsonProperty("pressurem")
    private double pressureM;

    @JsonProperty("pressurei")
    private double pressureI;

    @JsonProperty("windchillm")
    private double windChillM;

    @JsonProperty("windchilli")
    private double windChillI;

    @JsonProperty("heatindexm")
    private double heatIndexM;

    @JsonProperty("heatindexi")
    private double heatIndexI;

    @JsonProperty("precipm")
    private double precipM;

    @JsonProperty("precipi")
    private double precipI;

    @JsonProperty("conds")
    private String condS;

    private String icon;

    private double fog;

    private double rain;

    private double snow;

    private double hail;

    private double thunder;

    private double tornado;

    private String metar;

    public DateTideResponse getDate() {
        return date;
    }

    public void setDate(DateTideResponse date) {
        this.date = date;
    }

    public DateTideResponse getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(DateTideResponse utcDate) {
        this.utcDate = utcDate;
    }

    public double getTempM() {
        return tempM;
    }

    public void setTempM(double tempM) {
        this.tempM = tempM;
    }

    public double getTempI() {
        return tempI;
    }

    public void setTempI(double tempI) {
        this.tempI = tempI;
    }

    public double getDewPtm() {
        return dewPtm;
    }

    public void setDewPtm(double dewPtm) {
        this.dewPtm = dewPtm;
    }

    public double getDewPti() {
        return dewPti;
    }

    public void setDewPti(double dewPti) {
        this.dewPti = dewPti;
    }

    public int getHum() {
        return hum;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }

    public double getWsPdm() {
        return wsPdm;
    }

    public void setWsPdm(double wsPdm) {
        this.wsPdm = wsPdm;
    }

    public double getWsPdi() {
        return wsPdi;
    }

    public void setWsPdi(double wsPdi) {
        this.wsPdi = wsPdi;
    }

    public double getwGustM() {
        return wGustM;
    }

    public void setwGustM(double wGustM) {
        this.wGustM = wGustM;
    }

    public double getwGustI() {
        return wGustI;
    }

    public void setwGustI(double wGustI) {
        this.wGustI = wGustI;
    }

    public int getwDirD() {
        return wDirD;
    }

    public void setwDirD(int wDirD) {
        this.wDirD = wDirD;
    }

    public String getwDirE() {
        return wDirE;
    }

    public void setwDirE(String wDirE) {
        this.wDirE = wDirE;
    }

    public double getVisM() {
        return visM;
    }

    public void setVisM(double visM) {
        this.visM = visM;
    }

    public double getVisI() {
        return visI;
    }

    public void setVisI(double visI) {
        this.visI = visI;
    }

    public double getPressureM() {
        return pressureM;
    }

    public void setPressureM(double pressureM) {
        this.pressureM = pressureM;
    }

    public double getPressureI() {
        return pressureI;
    }

    public void setPressureI(double pressureI) {
        this.pressureI = pressureI;
    }

    public double getWindChillM() {
        return windChillM;
    }

    public void setWindChillM(double windChillM) {
        this.windChillM = windChillM;
    }

    public double getWindChillI() {
        return windChillI;
    }

    public void setWindChillI(double windChillI) {
        this.windChillI = windChillI;
    }

    public double getHeatIndexM() {
        return heatIndexM;
    }

    public void setHeatIndexM(double heatIndexM) {
        this.heatIndexM = heatIndexM;
    }

    public double getHeatIndexI() {
        return heatIndexI;
    }

    public void setHeatIndexI(double heatIndexI) {
        this.heatIndexI = heatIndexI;
    }

    public double getPrecipM() {
        return precipM;
    }

    public void setPrecipM(double precipM) {
        this.precipM = precipM;
    }

    public double getPrecipI() {
        return precipI;
    }

    public void setPrecipI(double precipI) {
        this.precipI = precipI;
    }

    public String getCondS() {
        return condS;
    }

    public void setCondS(String condS) {
        this.condS = condS;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getFog() {
        return fog;
    }

    public void setFog(double fog) {
        this.fog = fog;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getHail() {
        return hail;
    }

    public void setHail(double hail) {
        this.hail = hail;
    }

    public double getThunder() {
        return thunder;
    }

    public void setThunder(double thunder) {
        this.thunder = thunder;
    }

    public double getTornado() {
        return tornado;
    }

    public void setTornado(double tornado) {
        this.tornado = tornado;
    }

    public String getMetar() {
        return metar;
    }

    public void setMetar(String metar) {
        this.metar = metar;
    }
}
