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

/**
 * ObservationResponse class
 */
public class ObservationResponse extends AbstractJSONResponse implements Serializable {

    private ImageResponse image;

    private LocationResponse display_location;

    private LocationResponse observation_location;

    private String estimated;

    private String station_id;

    private String observation_time;

    private String observation_time_rfc822;

    private String observation_epoch;

    private String local_time_rfc822;

    private String local_epoch;

    private String local_tz_short;

    private String local_tz_long;

    private String local_tz_offset;

    private String weather;

    private String temperature_string;

    private Double temp_f;

    private Double temp_c;

    private String relative_humidity;

    private String wind_string;

    private String wind_dir;

    private Double wind_degrees;

    private Double wind_mph;

    private Double wind_gust_mph;

    private Double wind_kph;

    private Double wind_gust_kph;

    private Double pressure_mb;

    private Double pressure_in;

    private String pressure_trend;

    private String dewpoint_string;

    private Double dewpoint_f;

    private Double dewpoint_c;

    private String heat_index_string;

    private String heat_index_f;

    private String heat_index_c;

    private String windchill_string;

    private String windchill_f;

    private String windchill_c;

    private String feelslike_string;

    private Double feelslike_f;

    private Double feelslike_c;

    private Double visibility_mi;

    private Double visibility_km;

    private String solarradiation;

    private Double uV;

    private String precip_1hr_string;

    private String precip_1hr_in;

    private String precip_1hr_metric;

    private String precip_today_string;

    private String precip_today_in;

    private String precip_today_metric;

    private String icon;

    private String icon_url;

    private String forecast_url;

    private String history_url;

    private String ob_url;

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse image) {
        this.image = image;
    }

    public LocationResponse getDisplay_location() {
        return display_location;
    }

    public void setDisplay_location(LocationResponse display_location) {
        this.display_location = display_location;
    }

    public LocationResponse getObservation_location() {
        return observation_location;
    }

    public void setObservation_location(LocationResponse observation_location) {
        this.observation_location = observation_location;
    }

    public String getEstimated() {
        return estimated;
    }

    public void setEstimated(String estimated) {
        this.estimated = estimated;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getObservation_time() {
        return observation_time;
    }

    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }

    public String getObservation_time_rfc822() {
        return observation_time_rfc822;
    }

    public void setObservation_time_rfc822(String observation_time_rfc822) {
        this.observation_time_rfc822 = observation_time_rfc822;
    }

    public String getObservation_epoch() {
        return observation_epoch;
    }

    public void setObservation_epoch(String observation_epoch) {
        this.observation_epoch = observation_epoch;
    }

    public String getLocal_time_rfc822() {
        return local_time_rfc822;
    }

    public void setLocal_time_rfc822(String local_time_rfc822) {
        this.local_time_rfc822 = local_time_rfc822;
    }

    public String getLocal_epoch() {
        return local_epoch;
    }

    public void setLocal_epoch(String local_epoch) {
        this.local_epoch = local_epoch;
    }

    public String getLocal_tz_short() {
        return local_tz_short;
    }

    public void setLocal_tz_short(String local_tz_short) {
        this.local_tz_short = local_tz_short;
    }

    public String getLocal_tz_long() {
        return local_tz_long;
    }

    public void setLocal_tz_long(String local_tz_long) {
        this.local_tz_long = local_tz_long;
    }

    public String getLocal_tz_offset() {
        return local_tz_offset;
    }

    public void setLocal_tz_offset(String local_tz_offset) {
        this.local_tz_offset = local_tz_offset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature_string() {
        return temperature_string;
    }

    public void setTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
    }

    public Double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(Double temp_f) {
        this.temp_f = temp_f;
    }

    public Double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(Double temp_c) {
        this.temp_c = temp_c;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public String getWind_string() {
        return wind_string;
    }

    public void setWind_string(String wind_string) {
        this.wind_string = wind_string;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Double getWind_degrees() {
        return wind_degrees;
    }

    public void setWind_degrees(Double wind_degrees) {
        this.wind_degrees = wind_degrees;
    }

    public Double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Double getWind_gust_mph() {
        return wind_gust_mph;
    }

    public void setWind_gust_mph(Double wind_gust_mph) {
        this.wind_gust_mph = wind_gust_mph;
    }

    public Double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(Double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public Double getWind_gust_kph() {
        return wind_gust_kph;
    }

    public void setWind_gust_kph(Double wind_gust_kph) {
        this.wind_gust_kph = wind_gust_kph;
    }

    public Double getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(Double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(Double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public String getPressure_trend() {
        return pressure_trend;
    }

    public void setPressure_trend(String pressure_trend) {
        this.pressure_trend = pressure_trend;
    }

    public String getDewpoint_string() {
        return dewpoint_string;
    }

    public void setDewpoint_string(String dewpoint_string) {
        this.dewpoint_string = dewpoint_string;
    }

    public Double getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(Double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public Double getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(Double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public String getHeat_index_string() {
        return heat_index_string;
    }

    public void setHeat_index_string(String heat_index_string) {
        this.heat_index_string = heat_index_string;
    }

    public String getHeat_index_f() {
        return heat_index_f;
    }

    public void setHeat_index_f(String heat_index_f) {
        this.heat_index_f = heat_index_f;
    }

    public String getHeat_index_c() {
        return heat_index_c;
    }

    public void setHeat_index_c(String heat_index_c) {
        this.heat_index_c = heat_index_c;
    }

    public String getWindchill_string() {
        return windchill_string;
    }

    public void setWindchill_string(String windchill_string) {
        this.windchill_string = windchill_string;
    }

    public String getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(String windchill_f) {
        this.windchill_f = windchill_f;
    }

    public String getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(String windchill_c) {
        this.windchill_c = windchill_c;
    }

    public String getFeelslike_string() {
        return feelslike_string;
    }

    public void setFeelslike_string(String feelslike_string) {
        this.feelslike_string = feelslike_string;
    }

    public Double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(Double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Double getVisibility_mi() {
        return visibility_mi;
    }

    public void setVisibility_mi(Double visibility_mi) {
        this.visibility_mi = visibility_mi;
    }

    public Double getVisibility_km() {
        return visibility_km;
    }

    public void setVisibility_km(Double visibility_km) {
        this.visibility_km = visibility_km;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getuV() {
        return uV;
    }

    public void setuV(Double uV) {
        this.uV = uV;
    }

    public String getPrecip_1hr_string() {
        return precip_1hr_string;
    }

    public void setPrecip_1hr_string(String precip_1hr_string) {
        this.precip_1hr_string = precip_1hr_string;
    }

    public String getPrecip_1hr_in() {
        return precip_1hr_in;
    }

    public void setPrecip_1hr_in(String precip_1hr_in) {
        this.precip_1hr_in = precip_1hr_in;
    }

    public String getPrecip_1hr_metric() {
        return precip_1hr_metric;
    }

    public void setPrecip_1hr_metric(String precip_1hr_metric) {
        this.precip_1hr_metric = precip_1hr_metric;
    }

    public String getPrecip_today_string() {
        return precip_today_string;
    }

    public void setPrecip_today_string(String precip_today_string) {
        this.precip_today_string = precip_today_string;
    }

    public String getPrecip_today_in() {
        return precip_today_in;
    }

    public void setPrecip_today_in(String precip_today_in) {
        this.precip_today_in = precip_today_in;
    }

    public String getPrecip_today_metric() {
        return precip_today_metric;
    }

    public void setPrecip_today_metric(String precip_today_metric) {
        this.precip_today_metric = precip_today_metric;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getForecast_url() {
        return forecast_url;
    }

    public void setForecast_url(String forecast_url) {
        this.forecast_url = forecast_url;
    }

    public String getHistory_url() {
        return history_url;
    }

    public void setHistory_url(String history_url) {
        this.history_url = history_url;
    }

    public String getOb_url() {
        return ob_url;
    }

    public void setOb_url(String ob_url) {
        this.ob_url = ob_url;
    }
}
