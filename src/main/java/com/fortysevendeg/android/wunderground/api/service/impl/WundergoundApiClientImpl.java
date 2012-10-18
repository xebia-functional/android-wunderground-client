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

package com.fortysevendeg.android.wunderground.api.service.impl;

import android.text.TextUtils;
import com.fortysevendeg.android.wunderground.api.service.WundergroundApiClient;
import com.fortysevendeg.android.wunderground.api.service.request.Feature;
import com.fortysevendeg.android.wunderground.api.service.request.Query;
import com.fortysevendeg.android.wunderground.api.service.request.Settings;
import com.fortysevendeg.android.wunderground.api.service.response.WundergroundResponse;
import it.restrung.rest.client.APIDelegate;
import it.restrung.rest.client.RestClient;
import it.restrung.rest.client.RestClientFactory;

/**
 * @see com.fortysevendeg.android.wunderground.api.service.WundergroundApiClient
 */
public class WundergoundApiClientImpl implements WundergroundApiClient {

    private RestClient client = RestClientFactory.getClient();

    private String endpoint = "http://api.wunderground.com/api";

    private String getEndpoint(String path) {
        return String.format("%s%s", endpoint, path);
    }

    @Override
    public void query(APIDelegate<WundergroundResponse> delegate, String apiKey, Query query, Feature... features) {
        query(delegate, apiKey, null, query, features);
    }

    @Override
    public void query(APIDelegate<WundergroundResponse> delegate,String apiKey, Settings settings, Query query, Feature... features) {
        if (settings != null) {
            client.getAsync(delegate, getEndpoint("/%s/%s/%s/q/%s"), apiKey, TextUtils.join("/", features), TextUtils.join("/", settings.getValue()), query.getValue());
        } else {
            client.getAsync(delegate, getEndpoint("/%s/%s/q/%s"), apiKey, TextUtils.join("/", features), query.getValue());
        }
    }
}
