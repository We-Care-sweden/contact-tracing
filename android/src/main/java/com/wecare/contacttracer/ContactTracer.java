package com.wecare.contacttracer;

import android.app.PendingIntent;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

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
    //Task<Status> startContactTracing(PendingIntent contactTracingCallback);


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
