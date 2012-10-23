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
 * PlannerChanceOfResponse class
 */
public class PlannerChanceOfResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("tempoversixty")
    private PlannerBasicChanceOfResponse tempOverSixty;

    @JsonProperty("chanceofwindyday")
    private PlannerBasicChanceOfResponse chanceOfWindyDay;

    @JsonProperty("chanceofpartlycloudyday")
    private PlannerBasicChanceOfResponse chanceOfPartlyCloudyDay;

    @JsonProperty("chanceofsunnycloudyday")
    private PlannerBasicChanceOfResponse chanceOfSunnyCloudyDay;

    @JsonProperty("chanceofcloudyday")
    private PlannerBasicChanceOfResponse chanceOfCloudyDay;

    @JsonProperty("chanceoffogday")
    private PlannerBasicChanceOfResponse chanceOfFogDay;

    @JsonProperty("chanceofhumidday")
    private PlannerBasicChanceOfResponse chanceOfHumidDay;

    @JsonProperty("chanceofprecip")
    private PlannerBasicChanceOfResponse chanceOfPrecip;

    @JsonProperty("chanceofrainday")
    private PlannerBasicChanceOfResponse chanceOfRainDay;

    @JsonProperty("tempoverninety")
    private PlannerBasicChanceOfResponse tempOverNinety;

    @JsonProperty("chanceofthunderday")
    private PlannerBasicChanceOfResponse chanceOftHunderDay;

    @JsonProperty("chanceofsnowonground")
    private PlannerBasicChanceOfResponse chanceOfSnowOnGround;

    @JsonProperty("chanceoftornadoday")
    private PlannerBasicChanceOfResponse chanceOfTornadoDay;

    @JsonProperty("chanceofsultryday")
    private PlannerBasicChanceOfResponse chanceOfSulTryDay;

    @JsonProperty("tempbelowfreezing")
    private PlannerBasicChanceOfResponse tempBelowFreezing;

    @JsonProperty("tempoverfreezing")
    private PlannerBasicChanceOfResponse tempOverFreezing;

    @JsonProperty("chanceofhailday")
    private PlannerBasicChanceOfResponse chanceOfHailDay;

    @JsonProperty("chanceofsnowday")
    private PlannerBasicChanceOfResponse chanceOfSnowDay;

    public PlannerBasicChanceOfResponse getTempOverSixty() {
        return tempOverSixty;
    }

    public void setTempOverSixty(PlannerBasicChanceOfResponse tempOverSixty) {
        this.tempOverSixty = tempOverSixty;
    }

    public PlannerBasicChanceOfResponse getChanceOfWindyDay() {
        return chanceOfWindyDay;
    }

    public void setChanceOfWindyDay(PlannerBasicChanceOfResponse chanceOfWindyDay) {
        this.chanceOfWindyDay = chanceOfWindyDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfPartlyCloudyDay() {
        return chanceOfPartlyCloudyDay;
    }

    public void setChanceOfPartlyCloudyDay(PlannerBasicChanceOfResponse chanceOfPartlyCloudyDay) {
        this.chanceOfPartlyCloudyDay = chanceOfPartlyCloudyDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfSunnyCloudyDay() {
        return chanceOfSunnyCloudyDay;
    }

    public void setChanceOfSunnyCloudyDay(PlannerBasicChanceOfResponse chanceOfSunnyCloudyDay) {
        this.chanceOfSunnyCloudyDay = chanceOfSunnyCloudyDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfCloudyDay() {
        return chanceOfCloudyDay;
    }

    public void setChanceOfCloudyDay(PlannerBasicChanceOfResponse chanceOfCloudyDay) {
        this.chanceOfCloudyDay = chanceOfCloudyDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfFogDay() {
        return chanceOfFogDay;
    }

    public void setChanceOfFogDay(PlannerBasicChanceOfResponse chanceOfFogDay) {
        this.chanceOfFogDay = chanceOfFogDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfHumidDay() {
        return chanceOfHumidDay;
    }

    public void setChanceOfHumidDay(PlannerBasicChanceOfResponse chanceOfHumidDay) {
        this.chanceOfHumidDay = chanceOfHumidDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfPrecip() {
        return chanceOfPrecip;
    }

    public void setChanceOfPrecip(PlannerBasicChanceOfResponse chanceOfPrecip) {
        this.chanceOfPrecip = chanceOfPrecip;
    }

    public PlannerBasicChanceOfResponse getChanceOfRainDay() {
        return chanceOfRainDay;
    }

    public void setChanceOfRainDay(PlannerBasicChanceOfResponse chanceOfRainDay) {
        this.chanceOfRainDay = chanceOfRainDay;
    }

    public PlannerBasicChanceOfResponse getTempOverNinety() {
        return tempOverNinety;
    }

    public void setTempOverNinety(PlannerBasicChanceOfResponse tempOverNinety) {
        this.tempOverNinety = tempOverNinety;
    }

    public PlannerBasicChanceOfResponse getChanceOftHunderDay() {
        return chanceOftHunderDay;
    }

    public void setChanceOftHunderDay(PlannerBasicChanceOfResponse chanceOftHunderDay) {
        this.chanceOftHunderDay = chanceOftHunderDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfSnowOnGround() {
        return chanceOfSnowOnGround;
    }

    public void setChanceOfSnowOnGround(PlannerBasicChanceOfResponse chanceOfSnowOnGround) {
        this.chanceOfSnowOnGround = chanceOfSnowOnGround;
    }

    public PlannerBasicChanceOfResponse getChanceOfTornadoDay() {
        return chanceOfTornadoDay;
    }

    public void setChanceOfTornadoDay(PlannerBasicChanceOfResponse chanceOfTornadoDay) {
        this.chanceOfTornadoDay = chanceOfTornadoDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfSulTryDay() {
        return chanceOfSulTryDay;
    }

    public void setChanceOfSulTryDay(PlannerBasicChanceOfResponse chanceOfSulTryDay) {
        this.chanceOfSulTryDay = chanceOfSulTryDay;
    }

    public PlannerBasicChanceOfResponse getTempBelowFreezing() {
        return tempBelowFreezing;
    }

    public void setTempBelowFreezing(PlannerBasicChanceOfResponse tempBelowFreezing) {
        this.tempBelowFreezing = tempBelowFreezing;
    }

    public PlannerBasicChanceOfResponse getTempOverFreezing() {
        return tempOverFreezing;
    }

    public void setTempOverFreezing(PlannerBasicChanceOfResponse tempOverFreezing) {
        this.tempOverFreezing = tempOverFreezing;
    }

    public PlannerBasicChanceOfResponse getChanceOfHailDay() {
        return chanceOfHailDay;
    }

    public void setChanceOfHailDay(PlannerBasicChanceOfResponse chanceOfHailDay) {
        this.chanceOfHailDay = chanceOfHailDay;
    }

    public PlannerBasicChanceOfResponse getChanceOfSnowDay() {
        return chanceOfSnowDay;
    }

    public void setChanceOfSnowDay(PlannerBasicChanceOfResponse chanceOfSnowDay) {
        this.chanceOfSnowDay = chanceOfSnowDay;
    }
}
