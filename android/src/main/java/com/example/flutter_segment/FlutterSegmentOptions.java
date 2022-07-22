package com.example.flutter_segment;

import android.os.Bundle;

import java.util.HashMap;

public class FlutterSegmentOptions {
    private final String writeKey;
    private final Boolean trackApplicationLifecycleEvents;
    private final Boolean amplitudeIntegrationEnabled;
    private final Boolean appsflyerIntegrationEnabled;
    private final Boolean adjustIntegrationEnabled;
    private final Boolean enableAdvertisingTracking;
    private final Boolean addAdvertisingIdentifier;
    private final Boolean debug;

    public  FlutterSegmentOptions(
            String writeKey,
            Boolean trackApplicationLifecycleEvents,
            Boolean amplitudeIntegrationEnabled,
            Boolean appsflyerIntegrationEnabled,
            Boolean adjustIntegrationEnabled,
            Boolean enableAdvertisingTracking,
            Boolean addAdvertisingIdentifier,
            Boolean debug
    ) {
        this.writeKey = writeKey;
        this.trackApplicationLifecycleEvents = trackApplicationLifecycleEvents;
        this.amplitudeIntegrationEnabled = amplitudeIntegrationEnabled;
        this.appsflyerIntegrationEnabled = appsflyerIntegrationEnabled;
        this.adjustIntegrationEnabled = adjustIntegrationEnabled;
        this.addAdvertisingIdentifier = addAdvertisingIdentifier;
        this.enableAdvertisingTracking = enableAdvertisingTracking;
        this.debug = debug;
    }

    public String getWriteKey() {
        return writeKey;
    }

    public Boolean getTrackApplicationLifecycleEvents() {
        return trackApplicationLifecycleEvents;
    }

    public Boolean isAmplitudeIntegrationEnabled() {
        return amplitudeIntegrationEnabled;
    }

    public Boolean isAppsflyerIntegrationEnabled() {
        return appsflyerIntegrationEnabled;
    }

    public Boolean isAdjustIntegrationEnabled() {
        return adjustIntegrationEnabled;
    }

    public Boolean isAdvertisingTrackingEnabled() {
        return addAdvertisingIdentifier;
    }

    public Boolean isAdvertisingIdentifierEnabled() {
        return addAdvertisingIdentifier;
    }

    public Boolean getDebug() {
        return debug;
    }

    static FlutterSegmentOptions create(Bundle bundle) {
        String writeKey = bundle.getString("com.claimsforce.segment.WRITE_KEY");
        Boolean trackApplicationLifecycleEvents = bundle.getBoolean("com.claimsforce.segment.TRACK_APPLICATION_LIFECYCLE_EVENTS");
        Boolean isAmplitudeIntegrationEnabled = bundle.getBoolean("com.claimsforce.segment.ENABLE_AMPLITUDE_INTEGRATION", false);
        Boolean isAppsflyerIntegrationEnabled = bundle.getBoolean("com.claimsforce.segment.ENABLE_APPSFLYER_INTEGRATION", false);
        Boolean isAdjustIntegrationEnabled = bundle.getBoolean("com.claimsforce.segment.ENABLE_ADJUST_INTEGRATION", false);
        Boolean isAdvertisingTrackingEnabled = bundle.getBoolean("com.claimsforce.segment.ENABLE_ADVERTISING_TRACKING", false);
        Boolean addAdvertisingIdentifier = bundle.getBoolean("com.claimsforce.segment.ADD_ADVERTISING_IDENTIFIER", false);
        Boolean debug = bundle.getBoolean("com.claimsforce.segment.DEBUG", false);
        return new FlutterSegmentOptions(writeKey, trackApplicationLifecycleEvents, isAmplitudeIntegrationEnabled, isAppsflyerIntegrationEnabled, isAdjustIntegrationEnabled, isAdvertisingTrackingEnabled, addAdvertisingIdentifier, debug);
    }

    static FlutterSegmentOptions create(HashMap<String, Object> options) {
        String writeKey = (String) options.get("writeKey");
        Boolean trackApplicationLifecycleEvents = (Boolean) options.get("trackApplicationLifecycleEvents");
        Boolean isAmplitudeIntegrationEnabled = orFalse((Boolean) options.get("amplitudeIntegrationEnabled"));
        Boolean isAppsflyerIntegrationEnabled = orFalse((Boolean) options.get("appsflyerIntegrationEnabled"));
        Boolean isAdjustIntegrationEnabled = orFalse((Boolean) options.get("adjustIntegrationEnabled"));
        Boolean isAdvertisingTrackingEnabled = orFalse((Boolean) options.get("enableAdvertisingTracking"));
        Boolean addAdvertisingIdentifier = orFalse((Boolean) options.get("addAdvertisingIdentifier"));
        Boolean debug = orFalse((Boolean) options.get("debug"));
        return new FlutterSegmentOptions(writeKey, trackApplicationLifecycleEvents, isAmplitudeIntegrationEnabled, isAppsflyerIntegrationEnabled, isAdjustIntegrationEnabled, isAdvertisingTrackingEnabled, addAdvertisingIdentifier, debug);
    }

    private static Boolean orFalse(Boolean value) {
        return value == null ? false : value;
    }
}
