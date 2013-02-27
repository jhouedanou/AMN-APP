package com.houedanou.amn.coworkingspace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class SplashScreen extends Activity {
private boolean mIsBackButtonPressed;
private static final int SPLASH_DURATION = 2000; // 2 seconds
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.splash_screen);
	Handler handler = new Handler();
	handler.postDelayed(new Runnable(){
        @Override
        public void run() {
            finish();
            if (!mIsBackButtonPressed) {
                // start the home screen if the back button wasn't pressed already 
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(intent);
           }
        }
	 }, SPLASH_DURATION); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called
	}

	 @Override
	   public void onBackPressed() {
	 
	        // set the flag to true so the next activity won't start up
	        mIsBackButtonPressed = true;
	        super.onBackPressed();
	 
	    }
	}