package org.thoughtcrime.securesms;


import android.content.Context;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.signal.glide.Log;
import org.thoughtcrime.securesms.util.DynamicTheme;

import androidx.annotation.NonNull;

import static org.webrtc.ContextUtils.getApplicationContext;

public class SplashActivity extends MainFragment {

    public static SplashActivity newInstance() {
        return new SplashActivity();
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setHasOptionsMenu(false);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        return inflater.inflate(R.layout.activity_splash, container, false);

    }


}
