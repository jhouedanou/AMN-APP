package com.houedanou.amn.coworkingspace;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PlanActivity extends Activity {

	 WebView web;
	    ProgressBar progressBar;
	    
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.map);
	        Typeface tf = Typeface.createFromAsset(getAssets(),
	                "fonts/BebasNeue-webfont.ttf");
	        TextView tv = (TextView) findViewById(R.id.title);
	        	tv.setTypeface(tf);
	        Button btnh = (Button) findViewById(R.id.clickHome);
	        	btnh.setTypeface(tf);
	        	ImageView map = (ImageView)findViewById(R.id.ImageMapView);  
	        	
	        	web = (WebView) findViewById(R.id.webview);
	        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
	        clickHome();

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
	    public class myWebClient extends WebViewClient
	    {
	        @Override
	        public void onPageStarted(WebView view, String url, Bitmap favicon) {
	            // TODO Auto-generated method stub
	            super.onPageStarted(view, url, favicon);
	        }
	 
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	            // TODO Auto-generated method stub
	            view.loadUrl(url);
	            return true;
	 
	        }
	        @Override
	        public void onPageFinished(WebView view, String url) {
	            // TODO Auto-generated method stub
	            super.onPageFinished(view, url);
	            progressBar.setVisibility(View.GONE);
	        }
	    }
}