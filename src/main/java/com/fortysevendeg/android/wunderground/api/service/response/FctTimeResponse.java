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
 * FctTimeResponse class
 */
public class FctTimeResponse extends AbstractJSONResponse implements Serializable {

    private int hour;

    @JsonProperty("hour_padded")
    private String hourPadded;

    private String min;

    private int sec;

    private int year;

    private int mon;

    @JsonProperty("mon_padded")
    private String monPadded;

    @JsonProperty("mon_abbrev")
    private String monAbbrev;

    @JsonProperty("mday")
    private int mDay;

    @JsonProperty("mday_padded")
    private String mDayPadded;

    @JsonProperty("yday")
    private int yDay;

    @JsonProperty("isdst")
    private int isDst;

    private String epoch;

    private String pretty;

    private String civil;

    @JsonProperty("month_name")
    private String monthName;

    @JsonProperty("month_name_abbrev")
    private String monthNameAbbrev;

    @JsonProperty("weekday_name")
    private String weekdayName;

    @JsonProperty("weekday_name_night")
    private String weekdayNameNight;

    @JsonProperty("")
    private String weekday_name_abbrev;

    @JsonProperty("weekday_name_abbrev")
    private String weekdayNameUnLang;

    @JsonProperty("weekday_name_night_unlang")
    private String weekdayNameNightUnLang;

    @JsonProperty("ampm")
    private String amPm;

    private String tz;

    private String age;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getHourPadded() {
        return hourPadded;
    }

    public void setHourPadded(String hourPadded) {
        this.hourPadded = hourPadded;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public String getMonPadded() {
        return monPadded;
    }

    public void setMonPadded(String monPadded) {
        this.monPadded = monPadded;
    }

    public String getMonAbbrev() {
        return monAbbrev;
    }

    public void setMonAbbrev(String monAbbrev) {
        this.monAbbrev = monAbbrev;
    }

    public int getmDay() {
        return mDay;
    }

    public void setmDay(int mDay) {
        this.mDay = mDay;
    }

    public String getmDayPadded() {
        return mDayPadded;
    }

    public void setmDayPadded(String mDayPadded) {
        this.mDayPadded = mDayPadded;
    }

    public int getyDay() {
        return yDay;
    }

    public void setyDay(int yDay) {
        this.yDay = yDay;
    }

    public int getDst() {
        return isDst;
    }

    public void setDst(int dst) {
        isDst = dst;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getMonthNameAbbrev() {
        return monthNameAbbrev;
    }

    public void setMonthNameAbbrev(String monthNameAbbrev) {
        this.monthNameAbbrev = monthNameAbbrev;
    }

    public String getWeekdayName() {
        return weekdayName;
    }

    public void setWeekdayName(String weekdayName) {
        this.weekdayName = weekdayName;
    }

    public String getWeekdayNameNight() {
        return weekdayNameNight;
    }

    public void setWeekdayNameNight(String weekdayNameNight) {
        this.weekdayNameNight = weekdayNameNight;
    }

    public String getWeekday_name_abbrev() {
        return weekday_name_abbrev;
    }

    public void setWeekday_name_abbrev(String weekday_name_abbrev) {
        this.weekday_name_abbrev = weekday_name_abbrev;
    }

    public String getWeekdayNameUnLang() {
        return weekdayNameUnLang;
    }

    public void setWeekdayNameUnLang(String weekdayNameUnLang) {
        this.weekdayNameUnLang = weekdayNameUnLang;
    }

    public String getWeekdayNameNightUnLang() {
        return weekdayNameNightUnLang;
    }

    public void setWeekdayNameNightUnLang(String weekdayNameNightUnLang) {
        this.weekdayNameNightUnLang = weekdayNameNightUnLang;
    }

    public String getAmPm() {
        return amPm;
    }

    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
