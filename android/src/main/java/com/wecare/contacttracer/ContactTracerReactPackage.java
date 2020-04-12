package com.wecare.contacttracer;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

public class WeCareReactPackage implements ReactPackage {
    @Nonnull
    @Override
    public List<NativeModule> createNativeModules(@Nonnull final ReactApplicationContext reactContext) {
        return new ArrayList<NativeModule>() {{
            add(new ContactTracer(reactContext));
        }};
    }

    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return null;
    }
}
