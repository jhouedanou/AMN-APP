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
        Typeface OS = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue-webfont.ttf");
        Button btninpulsion = (Button)findViewById(R.id.inpulsion);
        Button btnumu = (Button)findViewById(R.id.umu);
        Button btnmozci = (Button)findViewById(R.id.mozci);
        Button btnim = (Button)findViewById(R.id.nim);
        Button btnss = (Button)findViewById(R.id.ss);
        Button btntci = (Button)findViewById(R.id.tracking);
        Button btnjl = (Button)findViewById(R.id.jl);
        Button btnamn = (Button)findViewById(R.id.amn);
        Button btnh = (Button) findViewById(R.id.clickHome);

        TextView title = (TextView)findViewById(R.id.title);
        
        TextView tv = (TextView) findViewById(R.id.title);
        	tv.setTypeface(tf);
        	
        	btnh.setTypeface(tf);
        	btnumu.setTypeface(OS);
        	btninpulsion.setTypeface(OS);
        	btnmozci.setTypeface(OS);
        	btnim.setTypeface(OS);
        	btnss.setTypeface(OS);
        	btntci.setTypeface(OS);
        	btnjl.setTypeface(OS);
        	btnamn.setTypeface(OS);
        	
        	
        	callInpulsion();
        	callMozCi();
	        callUmu();	
        	callMonti();
        	callSocial();
        	callTracking();
        	callJl();
        	callamn();

        	clickHome();
        	
        	}
	
	public void callamn(){
	 	Button button = (Button) findViewById(R.id.amn);
			button.setOnClickListener(new OnClickListener() { 
			  @Override
			  public void onClick(View arg0) {
				// custom dialog
				final Dialog dialog = new Dialog(context);
				dialog.setContentView(R.layout.pc_amn);
				dialog.setTitle("AfricainCorp Media Network");
				dialog.show();
				Button dialogButton = (Button) dialog.findViewById(R.id.callamn);
				dialogButton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022522471505"));
					        startActivity(i);
					        Toast.makeText(getApplicationContext(), "AfricainCorp Media Network d\'appel", Toast.LENGTH_SHORT).show();

							dialog.dismiss();
						}
					});
				Button dialogButton2 = (Button) dialog.findViewById(R.id.callamn2);
				dialogButton2.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							Intent intent = new Intent(Intent.ACTION_VIEW, 
								     Uri.parse("http://africaincorpmedia.co"));	
							startActivity(intent);dialog.dismiss();
						}
					});
			  }
			});
		}	
	
	 public void callJl(){
		 	Button button = (Button) findViewById(R.id.jl);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_jlh);
					dialog.setTitle("Inpulsion");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.callboss);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022545029721"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "Jean Luc Houédanou d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});
					Button dialogButton2 = (Button) dialog.findViewById(R.id.callboss2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://houedanou.com"));	
								startActivity(intent);dialog.dismiss();
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
					Button dialogButton2 = (Button) dialog.findViewById(R.id.dialogButtonOK2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://inpulsion.net"));	
								startActivity(intent);dialog.dismiss();
							}
						});
				  }
				});
			}	
	 public void callSocial(){
		 	Button button = (Button) findViewById(R.id.ss);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_socialspot);
					dialog.setTitle("Social Spot");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022540487061"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "Social spot en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});
					Button dialogButton2 = (Button) dialog.findViewById(R.id.dialogButtonOK2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://socialspot.ci"));	
								startActivity(intent);dialog.dismiss();
							}
						});
				  }
				});
			}
	 
	 public void callTracking(){
		 	Button button = (Button) findViewById(R.id.tracking);
				button.setOnClickListener(new OnClickListener() { 
				  @Override
				  public void onClick(View arg0) {
					// custom dialog
					final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.pc_trackingci);
					dialog.setTitle("Inpulsion");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.calltrackingCi);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022558703484"));
						        startActivity(i);
						        Toast.makeText(getApplicationContext(), "Tracking.ci cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});
					Button dialogButton2 = (Button) dialog.findViewById(R.id.calltrackingCi2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://tracking.ci"));	
								startActivity(intent);dialog.dismiss();
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
					dialog.setTitle("Mozilla Côte d\'Ivoire");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.callMozCI);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent j = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:002506865209"));
						        startActivity(j);
						        Toast.makeText(getApplicationContext(), "Mozilla Côte d'Ivoire en cours d\'appel", Toast.LENGTH_SHORT).show();

								dialog.dismiss();
							}
						});		
					Button dialogButton2 = (Button) dialog.findViewById(R.id.callMozCI2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://mozilla.ci"));	
								startActivity(intent);dialog.dismiss();
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
					Button dialogButton2 = (Button) dialog.findViewById(R.id.callUMU2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("http://urbanmotionunited.com"));	
								startActivity(intent);dialog.dismiss();
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
					dialog.setTitle("Nicola Monti");
					dialog.show();
					Button dialogButton = (Button) dialog.findViewById(R.id.callMonti);
					dialogButton.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent k = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:0022503156646"));
						        startActivity(k);
						        Toast.makeText(getApplicationContext(), "Nicola Monti en cours d\'appe", Toast.LENGTH_SHORT).show();
								dialog.dismiss();
							}
						});
					Button dialogButton2 = (Button) dialog.findViewById(R.id.callMonti2);
					dialogButton2.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent intent = new Intent(Intent.ACTION_VIEW, 
									     Uri.parse("https://nimstudios.com"));	
								startActivity(intent);dialog.dismiss();
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


