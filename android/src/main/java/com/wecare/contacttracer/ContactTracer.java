package com.wecare.contacttracer;

import android.app.PendingIntent;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;

import java.util.List;

import javax.annotation.Nonnull;

public class ContactTracer extends ReactContextBaseJavaModule implements ContactTracingCallback {
    public ContactTracer(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return ContactTracer.class.getSimpleName();
    }

    @ReactMethod
    public void promiseMethod(ReadableMap productMap, Promise promise) {

    }

    /**
     * Starts BLE broadcasts and scanning based on the defined protocol.
     *
     * If not previously used, this shows a user dialog for consent to start contact
     * tracing and get permission.
     *
     * Calls back when data is to be pushed or pulled from the client, see
     * ContactTracingCallback.
     *
     * Callers need to re-invoke this after each device restart, providing a new
     * callback PendingIntent.
     */
    Task<Status> startContactTracing(PendingIntent contactTracingCallback) {
        return null;
    }

    /**
     * Disables advertising and scanning related to contact tracing. Contents of the
     * database and keys will remain.
     *
     * If the client app has been uninstalled by the user, this will be automatically
     * invoked and the database and keys will be wiped from the device.
     */
    Task<Status> stopContactTracing() {
        return null;
    }

    /**
     * Indicates whether contact tracing is currently running for the
     * requesting app.
     */
    Task<Status> isContactTracingEnabled() {
        return null;
    }

    /**
     * Flags daily tracing keys as to be stored on the server.
     *
     * This should only be done after proper verification is performed on the
     * client side that the user is diagnosed positive.
     *
     * Calling this will invoke the
     * ContactTracingCallback.requestUploadDailyTracingKeys callback
     * provided via startContactTracing at some point in the future. Provided keys
     * should be uploaded to the server and distributed to other users.
     *
     * This shows a user dialog for sharing and uploading data to the server.
     * The status will also flip back off again after 14 days; in other words,
     * the client will stop receiving requestUploadDailyTracingKeys
     * callbacks after that time.*
     * * Only 14 days of history are available.
     **/
    Task<Status> startSharingDailyTracingKeys() {
        return null;
    }

    /**
     * Provides a list of diagnosis keys for contact checking. The keys are to be
     * provided by a centralized service (e.g. synced from the server).
     *
     * When invoked after the requestProvideDiagnosisKeys callback, this triggers a
     * recalculation of contact status which can be obtained via hasContact()
     * after the calculation has finished.
     *
     * Should be called with a maximum of N keys at a time.
     */
    Task<Status> provideDiagnosisKeys(List<DailyTracingKey> keys) {
        return null;
    }

    /**
     * The maximum number of keys to pass into provideDiagnosisKeys at any given
     * time.
     */
    int getMaxDiagnosisKeys() {
        return -1;
    }

    /**
     * Check if this user has come into contact with a provided key. Contact
     * calculation happens daily.
     */
    Task<Boolean> hasContact() {
        return null;
    }

    /**
     * Check if this user has come into contact with a provided key. Contact
     * calculation happens daily.
     */
    Task<List<ContactInfo>> getContactInformation() {
        return null;
    }


    @Override
    public void onContact() {

    }

    @Override
    public void requestUploadDailyTracingKeys(List<DailyTracingKey> keys) {

    }

    @Override
    public void requestProvideDiagnosisKeys() {

    }
}
