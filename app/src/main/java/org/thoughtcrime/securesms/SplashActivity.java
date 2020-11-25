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
    SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", Context.MODE_PRIVATE);
    boolean isLight = pref.getBoolean("theme_nav",true);
//
//    int nightModeFlags =
//            getContext().getResources().getConfiguration().uiMode &
//                    Configuration.UI_MODE_NIGHT_MASK;

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
       // Log.d("THEME USED", R.attr.theme_type);
//        switch (nightModeFlags) {
//            case Configuration.UI_MODE_NIGHT_YES:
//                isLight = false;
//                break;
//
//            case Configuration.UI_MODE_NIGHT_NO:
//                isLight = true;
//                break;
//
//            case Configuration.UI_MODE_NIGHT_UNDEFINED:
//                isLight = true;
//                break;
//
//        }
        return inflater.inflate(R.layout.activity_splash, container, false);
//        if(isLight){
//            return inflater.inflate(R.layout.activity_splash, container, false);
//        }else{
//            return inflater.inflate(R.layout.activity_splash_dark, container, false);
//
//        }
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        globals.hideNavBar(this.getWindow());
////
//     //   setContentView(R.layout.main_activity);
//
//      //  navigator.onCreate(savedInstanceState);
//
//
//        setContentView(R.layout.activity_splash);
////        skull = findViewById(R.id.splash_skull);
////        skullAnim = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.skull_animation);
////        skull.setAnimation(skullAnim);
////        sun = findViewById(R.id.splash_sun);
////        sunAnim = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.sun_animation);
////        sun.setAnimation(sunAnim);
////        back = findViewById(R.id.splash_background);
////        backAnim = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.back_animation);
////        back.setAnimation(backAnim);
//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run(){
//
//                startActivity(new Intent(SplashActivity.this, MainActivity.class));
//                finish();
//
//            }
//        },4000);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//    }
}
