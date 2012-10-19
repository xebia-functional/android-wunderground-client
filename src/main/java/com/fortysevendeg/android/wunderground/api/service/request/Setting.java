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
public class Setting {

    private String key;

    private String value;

    private Setting(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static Setting getForKeyAndValue(String key, String value) {
        return new Setting(key, value);
    }

    public static Setting lang(Lang lang) {
        return new Setting("lang", lang.name());
    }

    public static Setting pws(boolean pws) {
        return new Setting("pws", pws ? "1" : "0");
    }

    public static Setting bestfct(boolean bestfct) {
        return new Setting("bestfct", bestfct ? "1" : "0");
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", key, value);
    }
}
