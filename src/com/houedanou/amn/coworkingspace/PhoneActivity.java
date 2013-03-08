package com.houedanou.amn.coworkingspace;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneActivity extends Activity {
	final Context context = this;
	private Button button;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);
        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue-webfont.ttf");
        Typeface OS = Typeface.createFromAsset(getAssets(),"fonts/OpenSans.ttf");
        
        Button btninpulsion = (Button)findViewById(R.id.inpulsion);
        Button btnumu = (Button)findViewById(R.id.umu);
        Button btnmozci = (Button)findViewById(R.id.mozci);
        TextView title = (TextView)findViewById(R.id.title);
        
        TextView tv = (TextView) findViewById(R.id.title);
        	tv.setTypeface(tf);
        Button btnh = (Button) findViewById(R.id.clickHome);
        	btnh.setTypeface(tf);
        	btnumu.setTypeface(OS);
        	btninpulsion.setTypeface(OS);
        	btnmozci.setTypeface(OS);
        	title.setTypeface(OS);
        	callInpulsion();
        	callMozCi();
	        callUmu();	
        	callTrackingci();
        	callMonti();
        	//callSocial();
        	//calljl();
	        clickHome();
        	
        	}
	
	 public void callTrackingci(){
		 	Button button = (Button) findViewById(R.id.tracking);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_trackingci);
					dialog.setTitle("Inpulsion");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022558703484"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "Tracking.ci en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});						
				  }
				});
			}	
	 
	 public void callMonti(){
		 	Button button = (Button) findViewById(R.id.nim);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_monti);
					dialog.setTitle("Inpulsion");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022555612226"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "Nicola Monti en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});						
				  }
				});
			}	
	
	
	 public void callInpulsion(){
		 	Button button = (Button) findViewById(R.id.inpulsion);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_inpulsion);
					dialog.setTitle("Inpulsion");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022520012158"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "inpulsion en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});						
				  }
				});
			}	
	 
	 public void callMozCi(){
		 	Button button = (Button) findViewById(R.id.mozci);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					  
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_mozci);
					dialog.setTitle("Mozilla C™te d\'Ivoire");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.callMozCI);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent j = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:002506865209"));
						        startActivity(j);
						        Toast.makeText(getApplicationContext(), "Mozilla C™te d'Ivoire en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});						
				  }
				});
			}	
	 
	 public void callUmu(){
		 	Button button = (Button) findViewById(R.id.umu);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_umu);
					dialog.setTitle("Urban Motion United");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.callUMU);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent k = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022503156646"));
						        startActivity(k);
						        Toast.makeText(getApplicationContext(), "Urban Motion United en cours d\'appel", Toast.LENGTH_SHORT).show();
								dialog.dismiss();
							}
						});						
				  }
				});
			}	  		
	 public void clickHome(){
			final Context context = this;
			Button btnHome = (Button) findViewById(R.id.clickHome);
			btnHome.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(context, MainActivity.class);
	                startActivity(intent);  }
			});
	 }
}
