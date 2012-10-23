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

package com.fortysevendeg.android.wunderground.api.service;

import com.fortysevendeg.android.wunderground.api.service.request.FeatureParam;
import com.fortysevendeg.android.wunderground.api.service.request.Query;
import com.fortysevendeg.android.wunderground.api.service.request.Settings;
import com.fortysevendeg.android.wunderground.api.service.response.WundergroundResponse;
import it.restrung.rest.client.APIDelegate;

/**
 * The wundergound api service
 */
public interface WundergroundApiClient {

    /**
     * @see WundergroundApiClient#query(it.restrung.rest.client.APIDelegate, String, com.fortysevendeg.android.wunderground.api.service.request.Settings, com.fortysevendeg.android.wunderground.api.service.request.Query, com.fortysevendeg.android.wunderground.api.service.request.FeatureParam...)
     */
    void query(APIDelegate<WundergroundResponse> delegate, String apiKey, Query query, FeatureParam... features);

    /**
     * Get weather information
     *
     * @param delegate Delegate
     * @param apiKey   Your API key
     * @param settings One or more of the following settings, given as key:value pairs separated by a colon. Example: lang:FR/pws:0
     * @param query    The location for which you want weather information
     * @param features One or more of the following data features. Note that these can be combined into a single request: geolookup/conditions/forecast
     */
    void query(APIDelegate<WundergroundResponse> delegate,String apiKey, Settings settings, Query query, FeatureParam... features);

}
