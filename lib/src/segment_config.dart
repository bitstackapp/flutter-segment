class SegmentConfig {
  SegmentConfig({
    required this.writeKey,
    this.trackApplicationLifecycleEvents = false,
    this.amplitudeIntegrationEnabled = false,
    this.adjustIntegrationEnabled = false,
    this.appsflyerIntegrationEnabled = false,
    this.enableAdvertisingTracking = false,
    this.addAdvertisingIdentifier = false,
    this.debug = false,
  });

  final String writeKey;
  final bool trackApplicationLifecycleEvents;
  final bool amplitudeIntegrationEnabled;
  final bool adjustIntegrationEnabled;
  final bool appsflyerIntegrationEnabled;
  final bool enableAdvertisingTracking;
  final bool addAdvertisingIdentifier;
  final bool debug;

  Map<String, dynamic> toMap() {
    return {
      'writeKey': writeKey,
      'trackApplicationLifecycleEvents': trackApplicationLifecycleEvents,
      'amplitudeIntegrationEnabled': amplitudeIntegrationEnabled,
      'appsflyerIntegrationEnabled': appsflyerIntegrationEnabled,
      'adjustIntegrationEnabled': adjustIntegrationEnabled,
      'enableAdvertisingTracking': enableAdvertisingTracking,
      'addAdvertisingIdentifier': addAdvertisingIdentifier,
      'debug': debug,
    };
  }
}
