package com.houedanou.amn.coworkingspace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdhActivity extends Activity {
	Button btnOK;
    EditText txtSubject;
    EditText txtMessage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adh);
        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/BebasNeue-webfont.ttf");
        Typeface OS = Typeface.createFromAsset(getAssets(),"fonts/Aller_Bd.ttf");        
        TextView mi = (TextView) findViewById(R.id.messageintro);
    	mi.setTypeface(OS);
        TextView mis = (TextView) findViewById(R.id.sujet);
     	mis.setTypeface(OS);
        TextView mss = (TextView) findViewById(R.id.msgsujet);
     	mss.setTypeface(OS);

        TextView tv = (TextView) findViewById(R.id.title);
        	tv.setTypeface(tf);
        Button btnh = (Button) findViewById(R.id.clickHome);
        	btnh.setTypeface(tf);
        Button bn = (Button) findViewById(R.id.btnOK);
        	bn.setTypeface(tf);
        btnOK = (Button) findViewById(R.id.btnOK);
        txtSubject = (EditText) findViewById(R.id.etSubject);
        txtMessage = (EditText) findViewById(R.id.etMessage);
        btnOK.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String to = "tapefr@gmail.com";
                String subject = txtSubject.getText().toString();
                String message = txtMessage.getText().toString();
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                mail.putExtra(Intent.EXTRA_SUBJECT, subject);
                mail.putExtra(Intent.EXTRA_TEXT, message);
                mail.setType("message/rfc822");
                startActivity(Intent.createChooser(mail, "Envoyer via:"));
            }
        });
    
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
}
