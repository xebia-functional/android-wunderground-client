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

This library only has a method called "query". This method returned a WundergroundResponse class with all data of Wunderground's api.

```java
void query(APIDelegate<WundergroundResponse> delegate, String apiKey, Settings settings, Query query, FeatureParam... features);
```

## Simple

The follow example returns the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility from [Wunderground's Weather API](http://www.wunderground.com/weather/api/d/docs?d=data/conditions)

```java
    GeoPoint center = mapView.getMapCenter();
    WundergroundApiProvider.getClient().query(new ContextAwareAPIDelegate<WundergroundResponse>(MainActivity.this, WundergroundResponse.class, RequestCache.LoadPolicy.NEVER) {
        @Override
        public void onResults(WundergroundResponse wundergroundResponse) {
            Toast.makeText(MyActivity.this, wundergroundResponse.getCurrentObservation().getDisplayLocation().getCity() + "--" + wundergroundResponse.getCurrentObservation().getWeather(), Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(Throwable e) {
            Toast.makeText(MyActivity.this, "fail", Toast.LENGTH_LONG).show();
        }
    }, "Your Api Key", Query.latLng(center.getLatitudeE6() / 1E6, center.getLongitudeE6()  / 1E6),
                    conditions);
```