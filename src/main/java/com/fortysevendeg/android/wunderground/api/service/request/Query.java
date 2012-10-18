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
 * http://www.wunderground.com/weather/api/d/docs?d=data/index#standard_request_url_format
 */
public class Query {

    private String value;

    private Query(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Query value(String value) {
        return new Query(value);
    }

    public static Query usStateCity(String stateCode, String city) {
        return value(String.format("%s/%s", stateCode, city));
    }

    public static Query usZipCode(String zipCode) {
        return value(zipCode);
    }

    public static Query internationalStateCity(String country, String city) {
        return value(String.format("%s/%s", country, city));
    }

    public static Query latLng(double lat, double lng) {
        return value(String.format("%s,%s", lat, lng));
    }

}
