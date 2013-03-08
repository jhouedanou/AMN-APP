package com.houedanou.amn.coworkingspace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Typeface OS = Typeface.createFromAsset(getAssets(),"fonts/OpenSans.ttf");
        Button btnqsn = (Button)findViewById(R.id.qsn);
        Button btnadh = (Button)findViewById(R.id.adh);
        Button btnplan = (Button)findViewById(R.id.plan);
        Button btnphone = (Button)findViewById(R.id.phone);
        Button btncalendar = (Button)findViewById(R.id.calendar);
        Button btnhours = (Button)findViewById(R.id.hours);

        btnqsn.setTypeface(OS);
        btnadh.setTypeface(OS);
        btnplan.setTypeface(OS);
        btnphone.setTypeface(OS);
        btncalendar.setTypeface(OS);
        btnhours.setTypeface(OS);
        
        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue-webfont.ttf");
        TextView tv = (TextView) findViewById(R.id.title);
        	tv.setTypeface(tf);
        	switchqsn();
        	switchadh();
        	switchcal();
        	switchphone();
        	switchplan();
        	switchlocal();
        
    }
    public void switchphone() {
  		final Context context = this;
  		Button button = (Button) findViewById(R.id.phone);
  		button.setOnClickListener(new OnClickListener() {
  			@Override
  			public void onClick(View arg0) {
  				Intent intent = new Intent(context, PhoneActivity.class);
                  startActivity(intent);  }
  		});
    
    }
    
    public void switchplan() {
		final Context context = this;
		Button button = (Button) findViewById(R.id.plan);
		button.setOnClickListener(new OnClickListener() {
			@Override
			
		public void onClick(View arg0) {
				
				Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
					    Uri.parse("http://maps.google.com/maps?saddr=&daddr=5.351667,-3.968373"));
				intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
				startActivity(intent);
		        Toast.makeText(getApplicationContext(), "Veuillez activer les services de localisation sur votre appareil", Toast.LENGTH_SHORT).show();
				}
			
	});

	}
    
    public void switchqsn() {
		final Context context = this;
		Button button = (Button) findViewById(R.id.qsn);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, QsnActivity.class);
                startActivity(intent);  }
		});

	}
        	
    public void switchadh() {
		final Context context = this;
		Button button = (Button) findViewById(R.id.adh);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, AdhActivity.class);
                startActivity(intent);  }
		});

	}        	
    
    public void switchcal() {
		final Context context = this;
		Button button = (Button) findViewById(R.id.calendar);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, CalendarActivity.class);
                startActivity(intent);  }
		});

	}        	
    
    public void switchlocal() {
		final Context context = this;
		Button button = (Button) findViewById(R.id.hours);
		button.setOnClickListener(new OnClickListener() {
			@Override
			
			public void onClick(View arg0) {
					Intent intent = new Intent(Intent.ACTION_VIEW, 
		     Uri.parse("https://plus.google.com/116809047855476701317"));	

	startActivity(intent);

	}
		
		});

	}        

    
}
