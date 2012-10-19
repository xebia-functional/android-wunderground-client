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

package com.fortysevendeg.android.wunderground.api.service.request;

/**
 * Available features
 * http://www.wunderground.com/weather/api/d/docs?d=data/index
 */
public enum Feature {

    /**
     * Returns the short name description, expiration time and a long text description of a severe alert — if one has been issued for the searched upon location.
     */
    alerts,
    /**
     * Historical average temperature for today
     */
    almanac,
    /**
     * Returns the moon phase, sunrise and sunset times.
     */
    astronomy,
    /**
     * Returns the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility.
     */
    conditions,
    /**
     * Returns the current position, forecast, and track of all current hurricanes.
     */
    //currenthurricane, //unsupported in this version
    /**
     * Returns a summary of the weather for the next 3 days. This includes high and low temperatures, a string text forecast and the conditions.
     */
    forecast,
    /**
     * Returns a summary of the weather for the next 10 days. This includes high and low temperatures, a string text forecast and the conditions.
     */
    forecast10day,
    /**
     * Returns the the city name, zip code / postal code, latitude-longitude coordinates and nearby personal weather stations.
     */
    geolookup,
    /**
     * history_YYYYMMDD returns a summary of the observed weather for the specified date.
     */
    //history, //unsupported in this version
    /**
     * Returns an hourly forecast for the next 36 hours immediately following the API request.
     */
    //hourly, //unsupported in this version
    /**
     * Returns an hourly forecast for the next 10 days
     */
    //hourly10day, //unsupported in this version
    /**
     * planner_MMDDMMDD returns a weather summary based on historical information between the specified dates (30 days max).
     */
    //planner, //unsupported in this version
    /**
     * Raw Tidal information for graphs
     */
    //rawtide, //unsupported in this version
    /**
     * Tidal information
     */
    //tide,  //unsupported in this version
    /**
     * Returns locations of nearby Personal Weather Stations and URL's for images from their web cams.
     */
    //webcams,  //unsupported in this version
    /**
     * Returns a summary of the observed weather history for yesterday.
     */
    //yesterday  //unsupported in this version
}
