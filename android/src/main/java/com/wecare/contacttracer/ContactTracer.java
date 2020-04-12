package com.wecare.reactplugin;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import javax.annotation.Nonnull;

public class WeCare extends ReactContextBaseJavaModule {
    public WeCare(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return WeCare.class.getSimpleName();
    }

}
