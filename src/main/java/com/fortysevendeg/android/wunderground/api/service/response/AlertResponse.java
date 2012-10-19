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
 * AlertResponse class
 * http://www.wunderground.com/weather/api/d/docs?d=data/alerts
 *
 * Returns the short name description, expiration time and a long text description of a severe alert, if one has been issued for the searched upon location.
 * These alerts are only active in the United States and Europe. View our United States Severe Weather map or our European Severe Weather map to see where there are active alerts at this moment.
 * Read the National Weather Service description of VTEC codes used in severe weather alerts in the United States, including "phenomena" and "significane",
 * here: www.weather.gov/os/vtec/pdfs/VTEC_explanation6.pdf
 * European alerts are required to show the "attribution" to Meteoalarm.
 */
public class AlertResponse extends AbstractJSONResponse implements Serializable {

    private String type;

    private String description;

    private String date;

    @JsonProperty("date_epoch")
    private String dateEpoch;

    private String expires;

    @JsonProperty("expires_epoch")
    private String expiresEpoch;

    private String message;

    private String phenomena;

    private String significance;

    @JsonProperty("wtype_meteoalarm")
    private String wTypeMeteoAlarm;

    @JsonProperty("wtype_meteoalarm_name")
    private String wTypeMeteoAlarmMame;

    @JsonProperty("level_meteoalarm")
    private String levelMeteoAlarm;

    @JsonProperty("level_meteoalarm_name")
    private String levelMeteoAlarmName;

    @JsonProperty("level_meteoalarm_description")
    private String levelMeteoAlarmDescription;

    private String attribution;


}
