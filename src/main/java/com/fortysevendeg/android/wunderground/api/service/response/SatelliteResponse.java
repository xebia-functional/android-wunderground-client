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
 * SatelliteResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/satellite
 *
 * Returns a URL link to .gif visual and infrared satellite images
 */
public class SatelliteResponse extends AbstractJSONResponse implements Serializable {

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("image_url_ir4")
    private String imageUrlIr4;

    @JsonProperty("image_url_vis")
    private String imageUrlVis;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlIr4() {
        return imageUrlIr4;
    }

    public void setImageUrlIr4(String imageUrlIr4) {
        this.imageUrlIr4 = imageUrlIr4;
    }

    public String getImageUrlVis() {
        return imageUrlVis;
    }

    public void setImageUrlVis(String imageUrlVis) {
        this.imageUrlVis = imageUrlVis;
    }
}
