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

import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;
import java.util.List;

/**
 * RawTideResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/rawtide
 *
 * Raw Tidal information for graphs
 */
public class RawTideResponse extends AbstractJSONResponse implements Serializable {

    private List<TideInfoResponse> tideInfo;

    private List<RawTideObsResponse> rawTideObs;

    private List<RawTideStats> rawTideStats;

    public List<TideInfoResponse> getTideInfo() {
        return tideInfo;
    }

    public void setTideInfo(List<TideInfoResponse> tideInfo) {
        this.tideInfo = tideInfo;
    }

    public List<RawTideObsResponse> getRawTideObs() {
        return rawTideObs;
    }

    public void setRawTideObs(List<RawTideObsResponse> rawTideObs) {
        this.rawTideObs = rawTideObs;
    }

    public List<RawTideStats> getRawTideStats() {
        return rawTideStats;
    }

    public void setRawTideStats(List<RawTideStats> rawTideStats) {
        this.rawTideStats = rawTideStats;
    }
}
