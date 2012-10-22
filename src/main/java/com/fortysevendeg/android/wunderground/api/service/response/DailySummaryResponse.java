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
 * DailySummaryResponse class
 */
public class DailySummaryResponse extends AbstractJSONResponse implements Serializable {

    private DateTideResponse date;

    private int fog;

    private int rain;

    private int snow;

    @JsonProperty("snowfallm")
    private double snowFallM;

    @JsonProperty("snowfalli")
    private double snowFallI;

    @JsonProperty("monthtodatesnowfallm")
    private double monthToDateSnowFallM;

    @JsonProperty("monthtodatesnowfalli")
    private double monthToDateSnowFallI;

    @JsonProperty("since1julsnowfallm")
    private double since1JulSnowFallM;

    @JsonProperty("since1julsnowfalli")
    private double since1JulSnowFallI;

    @JsonProperty("snowdepthm")
    private double snowDepthM;

    @JsonProperty("snowdepthi")
    private double snowDepthI;

    private int hail;

    private int thunder;

    private int tornado;

    @JsonProperty("meantempm")
    private int meanTempM;

    @JsonProperty("meantempi")
    private int meanTempI;

    @JsonProperty("meandewptm")
    private int meanDewPtm;

    @JsonProperty("meandewpti")
    private int meanDewPti;

    @JsonProperty("meanpressurem")
    private double meanPressureM;

    @JsonProperty("meanpressurei")
    private double meanPressureI;

    @JsonProperty("meanwindspdm")
    private int meanWindSpdM;

    @JsonProperty("meanwindspdi")
    private int meanWindSpdI;

    @JsonProperty("meanwdire")
    private String meanWDire;

    @JsonProperty("meanwdird")
    private int meanWDirD;

    @JsonProperty("meanvism")
    private double meanVisM;

    @JsonProperty("meanvisi")
    private double meanVisI;

    private int humidity;

    @JsonProperty("maxtempm")
    private int maxTempM;

    @JsonProperty("maxtempi")
    private int maxTempI;

    @JsonProperty("mintempm")
    private int minTempM;

    @JsonProperty("mintempi")
    private int minTempI;

    @JsonProperty("maxhumidity")
    private int maxHumidity;

    @JsonProperty("minhumidity")
    private int minHumidity;

    @JsonProperty("maxdewptm")
    private int maxDewPtM;

    @JsonProperty("maxdewpti")
    private int maxDewPtI;

    @JsonProperty("mindewptm")
    private int minDewPtM;

    @JsonProperty("mindewpti")
    private int minDewPtI;

    @JsonProperty("maxpressurem")
    private int maxPressureM;

    @JsonProperty("maxpressurei")
    private double maxPressureI;

    @JsonProperty("minpressurem")
    private int minPressureM;

    @JsonProperty("minpressurei")
    private double minPressureI;

    @JsonProperty("maxwspdm")
    private int maxWsPdm;

    @JsonProperty("maxwspdi")
    private int maxWsPdi;

    @JsonProperty("minwspdm")
    private int minWsPdm;

    @JsonProperty("minwspdi")
    private int minWsPdi;

    @JsonProperty("maxvism")
    private double maxVisM;

    @JsonProperty("maxvisi")
    private double maxVisI;

    @JsonProperty("minvism")
    private double minVisM;

    @JsonProperty("minvisi")
    private double minVisI;

    @JsonProperty("gdegreedays")
    private int gDegreeDays;

    @JsonProperty("heatingdegreedays")
    private int heatingDegreeDays;

    @JsonProperty("coolingdegreedays")
    private int coolingDegreeDays;

    @JsonProperty("precipm")
    private double precipM;

    @JsonProperty("precipi")
    private double precipI;

    @JsonProperty("precipsource")
    private String precipSource;

    @JsonProperty("heatingdegreedaysnormal")
    private String heatingDegreeDaysNormal;

    @JsonProperty("monthtodateheatingdegreedays")
    private String monthToDateHeatingDegreeDays;

    @JsonProperty("monthtodateheatingdegreedaysnormal")
    private String monthToDateHeatingDegreeDaysNormal;

    @JsonProperty("since1sepheatingdegreedays")
    private String since1SepHeatingDegreeDays;

    @JsonProperty("since1sepheatingdegreedaysnormal")
    private String since1SepHeatingDegreeDaysNormal;

    @JsonProperty("since1julheatingdegreedays")
    private String since1JulHeatingDegreeDays;

    @JsonProperty("since1julheatingdegreedaysnormal")
    private String since1JulHeatingDegreeDaysNormal;

    @JsonProperty("coolingdegreedaysnormal")
    private String coolingDegreeDaysNormal;

    @JsonProperty("monthtodatecoolingdegreedays")
    private String monthToDateCoolingDegreeDays;

    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    private String monthToDateCoolingDegreeDaysNormal;

    @JsonProperty("since1sepcoolingdegreedays")
    private String since1SepCoolingDegreeDays;

    @JsonProperty("since1sepcoolingdegreedaysnormal")
    private String since1SepCoolingDegreeDaysNormal;

    @JsonProperty("since1jancoolingdegreedays")
    private String since1JanCoolingDegreeDays;

    @JsonProperty("since1jancoolingdegreedaysnormal")
    private String since1JanCoolingDegreeDaysNormal;

    public DateTideResponse getDate() {
        return date;
    }

    public void setDate(DateTideResponse date) {
        this.date = date;
    }

    public int getFog() {
        return fog;
    }

    public void setFog(int fog) {
        this.fog = fog;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public int getSnow() {
        return snow;
    }

    public void setSnow(int snow) {
        this.snow = snow;
    }

    public double getSnowFallM() {
        return snowFallM;
    }

    public void setSnowFallM(double snowFallM) {
        this.snowFallM = snowFallM;
    }

    public double getSnowFallI() {
        return snowFallI;
    }

    public void setSnowFallI(double snowFallI) {
        this.snowFallI = snowFallI;
    }

    public double getMonthToDateSnowFallM() {
        return monthToDateSnowFallM;
    }

    public void setMonthToDateSnowFallM(double monthToDateSnowFallM) {
        this.monthToDateSnowFallM = monthToDateSnowFallM;
    }

    public double getMonthToDateSnowFallI() {
        return monthToDateSnowFallI;
    }

    public void setMonthToDateSnowFallI(double monthToDateSnowFallI) {
        this.monthToDateSnowFallI = monthToDateSnowFallI;
    }

    public double getSince1JulSnowFallM() {
        return since1JulSnowFallM;
    }

    public void setSince1JulSnowFallM(double since1JulSnowFallM) {
        this.since1JulSnowFallM = since1JulSnowFallM;
    }

    public double getSince1JulSnowFallI() {
        return since1JulSnowFallI;
    }

    public void setSince1JulSnowFallI(double since1JulSnowFallI) {
        this.since1JulSnowFallI = since1JulSnowFallI;
    }

    public double getSnowDepthM() {
        return snowDepthM;
    }

    public void setSnowDepthM(double snowDepthM) {
        this.snowDepthM = snowDepthM;
    }

    public double getSnowDepthI() {
        return snowDepthI;
    }

    public void setSnowDepthI(double snowDepthI) {
        this.snowDepthI = snowDepthI;
    }

    public int getHail() {
        return hail;
    }

    public void setHail(int hail) {
        this.hail = hail;
    }

    public int getThunder() {
        return thunder;
    }

    public void setThunder(int thunder) {
        this.thunder = thunder;
    }

    public int getTornado() {
        return tornado;
    }

    public void setTornado(int tornado) {
        this.tornado = tornado;
    }

    public int getMeanTempM() {
        return meanTempM;
    }

    public void setMeanTempM(int meanTempM) {
        this.meanTempM = meanTempM;
    }

    public int getMeanTempI() {
        return meanTempI;
    }

    public void setMeanTempI(int meanTempI) {
        this.meanTempI = meanTempI;
    }

    public int getMeanDewPtm() {
        return meanDewPtm;
    }

    public void setMeanDewPtm(int meanDewPtm) {
        this.meanDewPtm = meanDewPtm;
    }

    public int getMeanDewPti() {
        return meanDewPti;
    }

    public void setMeanDewPti(int meanDewPti) {
        this.meanDewPti = meanDewPti;
    }

    public double getMeanPressureM() {
        return meanPressureM;
    }

    public void setMeanPressureM(double meanPressureM) {
        this.meanPressureM = meanPressureM;
    }

    public double getMeanPressureI() {
        return meanPressureI;
    }

    public void setMeanPressureI(double meanPressureI) {
        this.meanPressureI = meanPressureI;
    }

    public int getMeanWindSpdM() {
        return meanWindSpdM;
    }

    public void setMeanWindSpdM(int meanWindSpdM) {
        this.meanWindSpdM = meanWindSpdM;
    }

    public int getMeanWindSpdI() {
        return meanWindSpdI;
    }

    public void setMeanWindSpdI(int meanWindSpdI) {
        this.meanWindSpdI = meanWindSpdI;
    }

    public String getMeanWDire() {
        return meanWDire;
    }

    public void setMeanWDire(String meanWDire) {
        this.meanWDire = meanWDire;
    }

    public int getMeanWDirD() {
        return meanWDirD;
    }

    public void setMeanWDirD(int meanWDirD) {
        this.meanWDirD = meanWDirD;
    }

    public double getMeanVisM() {
        return meanVisM;
    }

    public void setMeanVisM(double meanVisM) {
        this.meanVisM = meanVisM;
    }

    public double getMeanVisI() {
        return meanVisI;
    }

    public void setMeanVisI(double meanVisI) {
        this.meanVisI = meanVisI;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getMaxTempM() {
        return maxTempM;
    }

    public void setMaxTempM(int maxTempM) {
        this.maxTempM = maxTempM;
    }

    public int getMaxTempI() {
        return maxTempI;
    }

    public void setMaxTempI(int maxTempI) {
        this.maxTempI = maxTempI;
    }

    public int getMinTempM() {
        return minTempM;
    }

    public void setMinTempM(int minTempM) {
        this.minTempM = minTempM;
    }

    public int getMinTempI() {
        return minTempI;
    }

    public void setMinTempI(int minTempI) {
        this.minTempI = minTempI;
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

    public int getMaxDewPtM() {
        return maxDewPtM;
    }

    public void setMaxDewPtM(int maxDewPtM) {
        this.maxDewPtM = maxDewPtM;
    }

    public int getMaxDewPtI() {
        return maxDewPtI;
    }

    public void setMaxDewPtI(int maxDewPtI) {
        this.maxDewPtI = maxDewPtI;
    }

    public int getMinDewPtM() {
        return minDewPtM;
    }

    public void setMinDewPtM(int minDewPtM) {
        this.minDewPtM = minDewPtM;
    }

    public int getMinDewPtI() {
        return minDewPtI;
    }

    public void setMinDewPtI(int minDewPtI) {
        this.minDewPtI = minDewPtI;
    }

    public int getMaxPressureM() {
        return maxPressureM;
    }

    public void setMaxPressureM(int maxPressureM) {
        this.maxPressureM = maxPressureM;
    }

    public double getMaxPressureI() {
        return maxPressureI;
    }

    public void setMaxPressureI(double maxPressureI) {
        this.maxPressureI = maxPressureI;
    }

    public int getMinPressureM() {
        return minPressureM;
    }

    public void setMinPressureM(int minPressureM) {
        this.minPressureM = minPressureM;
    }

    public double getMinPressureI() {
        return minPressureI;
    }

    public void setMinPressureI(double minPressureI) {
        this.minPressureI = minPressureI;
    }

    public int getMaxWsPdm() {
        return maxWsPdm;
    }

    public void setMaxWsPdm(int maxWsPdm) {
        this.maxWsPdm = maxWsPdm;
    }

    public int getMaxWsPdi() {
        return maxWsPdi;
    }

    public void setMaxWsPdi(int maxWsPdi) {
        this.maxWsPdi = maxWsPdi;
    }

    public int getMinWsPdm() {
        return minWsPdm;
    }

    public void setMinWsPdm(int minWsPdm) {
        this.minWsPdm = minWsPdm;
    }

    public int getMinWsPdi() {
        return minWsPdi;
    }

    public void setMinWsPdi(int minWsPdi) {
        this.minWsPdi = minWsPdi;
    }

    public double getMaxVisM() {
        return maxVisM;
    }

    public void setMaxVisM(double maxVisM) {
        this.maxVisM = maxVisM;
    }

    public double getMaxVisI() {
        return maxVisI;
    }

    public void setMaxVisI(double maxVisI) {
        this.maxVisI = maxVisI;
    }

    public double getMinVisM() {
        return minVisM;
    }

    public void setMinVisM(double minVisM) {
        this.minVisM = minVisM;
    }

    public double getMinVisI() {
        return minVisI;
    }

    public void setMinVisI(double minVisI) {
        this.minVisI = minVisI;
    }

    public int getgDegreeDays() {
        return gDegreeDays;
    }

    public void setgDegreeDays(int gDegreeDays) {
        this.gDegreeDays = gDegreeDays;
    }

    public int getHeatingDegreeDays() {
        return heatingDegreeDays;
    }

    public void setHeatingDegreeDays(int heatingDegreeDays) {
        this.heatingDegreeDays = heatingDegreeDays;
    }

    public int getCoolingDegreeDays() {
        return coolingDegreeDays;
    }

    public void setCoolingDegreeDays(int coolingDegreeDays) {
        this.coolingDegreeDays = coolingDegreeDays;
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

    public String getPrecipSource() {
        return precipSource;
    }

    public void setPrecipSource(String precipSource) {
        this.precipSource = precipSource;
    }

    public String getHeatingDegreeDaysNormal() {
        return heatingDegreeDaysNormal;
    }

    public void setHeatingDegreeDaysNormal(String heatingDegreeDaysNormal) {
        this.heatingDegreeDaysNormal = heatingDegreeDaysNormal;
    }

    public String getMonthToDateHeatingDegreeDays() {
        return monthToDateHeatingDegreeDays;
    }

    public void setMonthToDateHeatingDegreeDays(String monthToDateHeatingDegreeDays) {
        this.monthToDateHeatingDegreeDays = monthToDateHeatingDegreeDays;
    }

    public String getMonthToDateHeatingDegreeDaysNormal() {
        return monthToDateHeatingDegreeDaysNormal;
    }

    public void setMonthToDateHeatingDegreeDaysNormal(String monthToDateHeatingDegreeDaysNormal) {
        this.monthToDateHeatingDegreeDaysNormal = monthToDateHeatingDegreeDaysNormal;
    }

    public String getSince1SepHeatingDegreeDays() {
        return since1SepHeatingDegreeDays;
    }

    public void setSince1SepHeatingDegreeDays(String since1SepHeatingDegreeDays) {
        this.since1SepHeatingDegreeDays = since1SepHeatingDegreeDays;
    }

    public String getSince1SepHeatingDegreeDaysNormal() {
        return since1SepHeatingDegreeDaysNormal;
    }

    public void setSince1SepHeatingDegreeDaysNormal(String since1SepHeatingDegreeDaysNormal) {
        this.since1SepHeatingDegreeDaysNormal = since1SepHeatingDegreeDaysNormal;
    }

    public String getSince1JulHeatingDegreeDays() {
        return since1JulHeatingDegreeDays;
    }

    public void setSince1JulHeatingDegreeDays(String since1JulHeatingDegreeDays) {
        this.since1JulHeatingDegreeDays = since1JulHeatingDegreeDays;
    }

    public String getSince1JulHeatingDegreeDaysNormal() {
        return since1JulHeatingDegreeDaysNormal;
    }

    public void setSince1JulHeatingDegreeDaysNormal(String since1JulHeatingDegreeDaysNormal) {
        this.since1JulHeatingDegreeDaysNormal = since1JulHeatingDegreeDaysNormal;
    }

    public String getCoolingDegreeDaysNormal() {
        return coolingDegreeDaysNormal;
    }

    public void setCoolingDegreeDaysNormal(String coolingDegreeDaysNormal) {
        this.coolingDegreeDaysNormal = coolingDegreeDaysNormal;
    }

    public String getMonthToDateCoolingDegreeDays() {
        return monthToDateCoolingDegreeDays;
    }

    public void setMonthToDateCoolingDegreeDays(String monthToDateCoolingDegreeDays) {
        this.monthToDateCoolingDegreeDays = monthToDateCoolingDegreeDays;
    }

    public String getMonthToDateCoolingDegreeDaysNormal() {
        return monthToDateCoolingDegreeDaysNormal;
    }

    public void setMonthToDateCoolingDegreeDaysNormal(String monthToDateCoolingDegreeDaysNormal) {
        this.monthToDateCoolingDegreeDaysNormal = monthToDateCoolingDegreeDaysNormal;
    }

    public String getSince1SepCoolingDegreeDays() {
        return since1SepCoolingDegreeDays;
    }

    public void setSince1SepCoolingDegreeDays(String since1SepCoolingDegreeDays) {
        this.since1SepCoolingDegreeDays = since1SepCoolingDegreeDays;
    }

    public String getSince1SepCoolingDegreeDaysNormal() {
        return since1SepCoolingDegreeDaysNormal;
    }

    public void setSince1SepCoolingDegreeDaysNormal(String since1SepCoolingDegreeDaysNormal) {
        this.since1SepCoolingDegreeDaysNormal = since1SepCoolingDegreeDaysNormal;
    }

    public String getSince1JanCoolingDegreeDays() {
        return since1JanCoolingDegreeDays;
    }

    public void setSince1JanCoolingDegreeDays(String since1JanCoolingDegreeDays) {
        this.since1JanCoolingDegreeDays = since1JanCoolingDegreeDays;
    }

    public String getSince1JanCoolingDegreeDaysNormal() {
        return since1JanCoolingDegreeDaysNormal;
    }

    public void setSince1JanCoolingDegreeDaysNormal(String since1JanCoolingDegreeDaysNormal) {
        this.since1JanCoolingDegreeDaysNormal = since1JanCoolingDegreeDaysNormal;
    }
}
