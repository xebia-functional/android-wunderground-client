# Android-wunderground-client

An Android client for [Wunderground's Weather API](http://www.wunderground.com/weather/api/d/docs?d=index)

# Introduction

Android-wunderground-client was born out of the need to provide an easy interface for Android apps @ [47 Degrees](http://47deg.com) to interface with Wunderground's Weather API.
Contributions and constructive feedback are welcome.

Android-wunderground-client used the [RESTrung](https://github.com/47deg/restrung) library for get data from server's wunderground.

# Download

## Maven Dependency

## Dependencies

# Usage

This library only has a method called "query". This method returned a WundergroundResponse class with all data of Wunderground's api. The amount data returned depends of the feature param

```java
void query(APIDelegate<WundergroundResponse> delegate,
            String apiKey,
            Settings settings,
            Query query,
            FeatureParam... features);
```

## Params

### ApiKey param

Your api key for wunderground's Weather API. [Get here](http://www.wunderground.com/weather/api/)

### Settings (optional)

Set settings for returned data.

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

**You can use various**

```java
Settings settings = Settings.value(Setting.lang(Lang.EU), Setting.pws(false), Setting.bestfct(false));
```

### Query

The location for which you want weather information. Examples:

US state/city

```java
Query.usStateCity("CA", "San_Francisco")
```

US zipcode

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




## Simple

The follow example returns the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility from [Wunderground's Weather API](http://www.wunderground.com/weather/api/d/docs?d=data/conditions) by latitude and longitude

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
    }, "Your Api Key", Query.latLng(center.getLatitudeE6() / 1E6, center.getLongitudeE6() / 1E6), conditions);
```