This library is no longer maintained. For all Android REST related features and better support please take a look at https://github.com/47deg/appsly-android-rest.


# Android-wunderground-client

An Android client for the [Weather Underground Weather API](http://www.wunderground.com/weather/api/d/docs?d=index)

# Introduction

Android-wunderground-client was born out of the need to provide an easy interface for Android apps @ [47 Degrees](http://47deg.com) to interface with Weather Underground's Weather API. Contributions and constructive feedback are always welcome.

Android-wunderground-client uses the open source [RESTrung](https://github.com/47deg/restrung) library for getting data from the Weather Underground API.

# Download

## Maven Dependency

Android-wunderground-client may be automatically imported into your project if you already use [Maven](http://maven.apache.org/). Just declare Android-wunderground-client as a maven dependency.
If you wish to always use the latest unstable snapshots, add the Sonatype repository where the snapshot artifacts are being deployed.
Official releases will be made available at Maven Central.

```xml
<repository>
    <id>sonatype</id>
    <url>https://oss.sonatype.org/content/groups/public/</url>
    <releases>
        <enabled>true</enabled>
        <updatePolicy>daily</updatePolicy>
        <checksumPolicy>fail</checksumPolicy>
    </releases>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
        <checksumPolicy>ignore</checksumPolicy>
    </snapshots>
</repository>

<dependency>
    <groupId>com.fortysevendeg.android</groupId>
    <artifactId>android-wunderground-client</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
## Other Downloads

You can get the releases, snapshots and other forms in which Android-wunderground-client is distributed from the [Downloads](https://github.com/47deg/android-wunderground-client/downloads) page.


# Usage

This library has a single method called "query". This method returns a WundergroundResponse class with all of the data from the Weather Underground API. The amount of data returned depends on the features parameter passed to the query method.

```java
void query(APIDelegate<WundergroundResponse> delegate,
            String apiKey,
            Settings settings,
            Query query,
            FeatureParam... features);
```

## Parameters

### ApiKey

Your API key for Weather Underground's Weather API. [Get one here](http://www.wunderground.com/weather/api/)

### Settings (optional)

Settings relating to the returned data.

**Language.** Default: EN. Returns the API response in the [specified language](http://www.wunderground.com/weather/api/d/docs?d=language-support).

```java
Settings settings = Settings.value(Setting.lang(Lang.EU));
```

**Pws.** Default: 1 (true). Use personal weather stations for conditions.

```java
Settings settings = Settings.value(Setting.pws(false));
```

**Bestfct.** Default: 1 (true). Use Weather Undergrond Best Forecast for forecast.

```java
Settings settings = Settings.value(Setting.bestfct(false));
```

**You can combine multiple settings**

```java
Settings settings = Settings.value(Setting.lang(Lang.EU), Setting.pws(false), Setting.bestfct(false));
```

### Query

The location for which you want weather information. Examples:

US state/city

```java
Query.usStateCity("CA", "San_Francisco")
```

US ZipCode

```java
Query.usZipCode("60290")
```

Country/city
```java
Query.internationalStateCity("Australia", "Sydney")
```

Latitude,longitude

```java
Query.latLng(37.8,-122.4)
```

### FeatureParam

One or more of the following data features. Note that these can be combined into a single request. Complete list feature params is [available here](http://www.wunderground.com/weather/api/d/docs?d=data/index)

**alerts** Returns the short name description, expiration time and a long text description of a severe alert — if one has been issued for the searched upon location.

**astronomy** Returns the moon phase, sunrise and sunset times.

**conditions** Returns the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility.

**forecast** Returns a summary of the weather for the next 3 days. This includes high and low temperatures, a string text forecast and the conditions.

**webcams** Returns locations of nearby Personal Weather Stations and URLs for images from their web cams.

Important!! The feature params "history" and "planner" are dates with the following format "history_YYYYMMDD" and "planner_YYYYMMDD". You can use the withSuffix method to achieve the correct format. Example:

```java
withSuffix(Feature.history, "20120810")
```

## Examples of use

The following example returns conditions (the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility from [Weather Underground's Weather API](http://www.wunderground.com/weather/api/d/docs?d=data/conditions)) for a given latitude and longitude

```java
    GeoPoint center = mapView.getMapCenter();
    WundergroundApiProvider.getClient().query(new ContextAwareAPIDelegate<WundergroundResponse>(MainActivity.this, WundergroundResponse.class, RequestCache.LoadPolicy.NEVER) {
        @Override
        public void onResults(WundergroundResponse wundergroundResponse) {
            Toast.makeText(MyActivity.this, wundergroundResponse.getCurrentObservation().getWeather(), Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(Throwable e) {
            Toast.makeText(MyActivity.this, "fail", Toast.LENGTH_LONG).show();
        }
    }, "Your API Key", Query.latLng(center.getLatitudeE6() / 1E6, center.getLongitudeE6() / 1E6), Feature.conditions);
```

The following example returns conditions and astronomy (the moon phase, sunrise and sunset times) for a given latitude and longitude

```java
    GeoPoint center = mapView.getMapCenter();
    WundergroundApiProvider.getClient().query(new ContextAwareAPIDelegate<WundergroundResponse>(MainActivity.this, WundergroundResponse.class, RequestCache.LoadPolicy.NEVER) {
        @Override
        public void onResults(WundergroundResponse wundergroundResponse) {
            Toast.makeText(MyActivity.this, wundergroundResponse.getCurrentObservation().getWeather(), Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(Throwable e) {
            Toast.makeText(MyActivity.this, "fail", Toast.LENGTH_LONG).show();
        }
    }, "Your API Key", Query.latLng(center.getLatitudeE6() / 1E6, center.getLongitudeE6() / 1E6), Feature.conditions, Feature.astronomy);
```

The following example returns the planner (a weather summary based on historical information between the specified dates (30 days max)) for a given country and city

```java
    WundergroundApiProvider.getClient().query(new ContextAwareAPIDelegate<WundergroundResponse>(MainActivity.this, WundergroundResponse.class, RequestCache.LoadPolicy.NEVER) {
        @Override
        public void onResults(WundergroundResponse wundergroundResponse) {
            Toast.makeText(MyActivity.this, wundergroundResponse.getCurrentObservation().getWeather(), Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(Throwable e) {
            Toast.makeText(MyActivity.this, "fail", Toast.LENGTH_LONG).show();
        }
    }, "Your API Key", Query.internationalStateCity("Australia", "Sydney"), withSuffix(Feature.planner, "20120810"));
```

The following example returns conditions for a given latitude/longitude and settings (FR language)

```java
    GeoPoint center = mapView.getMapCenter();
    WundergroundApiProvider.getClient().query(new ContextAwareAPIDelegate<WundergroundResponse>(MainActivity.this, WundergroundResponse.class, RequestCache.LoadPolicy.NEVER) {
        @Override
        public void onResults(WundergroundResponse wundergroundResponse) {
            Toast.makeText(MyActivity.this, wundergroundResponse.getCurrentObservation().getWeather(), Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(Throwable e) {
            Toast.makeText(MyActivity.this, "fail", Toast.LENGTH_LONG).show();
        }
    }, "Your API Key", Settings.value(Setting.lang(Lang.FR)), Query.latLng(center.getLatitudeE6() / 1E6, center.getLongitudeE6() / 1E6), Feature.conditions);
```

# License

Copyright (C) 2012 47 Degrees, LLC 
http://47deg.com  
hello@47deg.com

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# Terms of Service

Make sure to consult the Weather Underground [Terms of Service](http://www.wunderground.com/weather/api/d/terms.html) for applicable restrictions for usage of the API.
