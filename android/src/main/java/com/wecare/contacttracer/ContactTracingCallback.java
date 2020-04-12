package com.wecare.contacttracer;

import java.util.List;

public interface ContactTracingCallback {
    /**
     * Notifies the client that the user has been exposed and they should
     * be warned by the app of possible exposure.
     */
    void onContact();

    /**
     * Requests client to upload the provided daily tracing keys to their server for distribution
     * after the other user’s client receives the requestProvideDiagnosisKeys callback.
     *
     * The keys provided here will be at least 24 hours old. In order to be whitelisted to use this API,
     * apps will be required to timestamp and cryptographically sign the set of keys before delivery to the server
     * with the signature of an authorized medical authority.
     * @param keys
     */

    /**
     *
     * @param keys
     */
    void requestUploadDailyTracingKeys(List<DailyTracingKey> keys);


    /**
     * Requests client to provide a list of all diagnosis keys from the server.
     * This should be done by invoking provideDiagnosisKeys().
     */
    void requestProvideDiagnosisKeys();
}
