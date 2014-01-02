package com.fusion.ifinance;

import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class MainActivity extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        super.setIntegerProperty("splashscreen", "file:///android_asset/www/img/splashkym.pmg");
        super.loadUrl("file:///android_asset/www/index.html", 3000);
    }

} 