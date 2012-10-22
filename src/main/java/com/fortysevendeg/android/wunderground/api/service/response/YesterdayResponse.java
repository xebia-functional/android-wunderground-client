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
import java.util.List;

/**
 * YesterdayResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/yesterday
 *
 * Returns a summary of the observed weather history for yesterday
 */
public class YesterdayResponse extends AbstractJSONResponse implements Serializable {

    private DateTideResponse date;

    @JsonProperty("utcdate")
    private DateTideResponse utcDate;

    private List<ObservationHistoryResponse> observations;

    @JsonProperty("dailysummary")
    private List<DailySummaryResponse> dailySummaries;

    public DateTideResponse getDate() {
        return date;
    }

    public void setDate(DateTideResponse date) {
        this.date = date;
    }

    public DateTideResponse getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(DateTideResponse utcDate) {
        this.utcDate = utcDate;
    }

    public List<ObservationHistoryResponse> getObservations() {
        return observations;
    }

    public void setObservations(List<ObservationHistoryResponse> observations) {
        this.observations = observations;
    }

    public List<DailySummaryResponse> getDailySummaries() {
        return dailySummaries;
    }

    public void setDailySummaries(List<DailySummaryResponse> dailySummaries) {
        this.dailySummaries = dailySummaries;
    }
}
