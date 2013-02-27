package com.houedanou.amn.coworkingspace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class QsnActivity extends Activity {
	Button button;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qsn);
		 Typeface tf = Typeface.createFromAsset(getAssets(),
	                "fonts/BebasNeue-webfont.ttf");
	        TextView tv = (TextView) findViewById(R.id.title);
	        	tv.setTypeface(tf);
	        Button btnh = (Button) findViewById(R.id.clickHome);
	        	btnh.setTypeface(tf);
	        	String html="<h3><b>Coworking Space ?</b></h3></br><p>Le <b>coworking space</b> est un espace de travail collaboratif o&ugrave; se rencontrent passionn&eacute;s et professionnels du d&eacute;veloppement web, des m&eacute;dias, de la communication et autres.</p> <p>Les objectifs de ce laboratoire des nouvelles technologies sont multiples :</p><p></p><p>Permettre aux <b>travailleurs</b>, par le biais du travail collaboratif, d&rsquo;<b>am&eacute;liorer leur savoir faire</b> dans leur domaine de pr&eacute;dilection et de b&acirc;tir un <b>r&eacute;seau de personnes ressources</b>;</br><p>Permettre aux <b>investisseurs </b>et aux <b>porteurs de projet</b> de trouver un <b>espace propice</b> &agrave; la r&eacute;alisation de leurs projets, ainsi que des <b>ressources quapfi&eacute;es et comp&eacute;tente</b>s;</br><p>Fournir aux <b>organisateurs d&rsquo;&eacute;v&eacute;nients</b> un <b>cadre id&eacute;al</b> pour leurs manifestations;</br><p>Accompagner les <b>travailleurs freelance</b> et aux <b>start ups </b>dans leur <b>croissance</b><i>;</i></br><p>A notre niveau, <b>susciter (et maintenir) une dynamique d&rsquo;innovation au niveau du web ivoirien.</b></br><p></p></br></br><h3>Que proposons nous ?</h3></br><p>Pour r&eacute;aliser les objectifs pr&eacute;c&eacute;diment &eacute;voqu&eacute;s, le coworking space d&rsquo;AMN met &agrave; la disposition de ses membres les commodit&eacute;s ci dessous :</p><p></p><p>Une connection internet haut d&eacute;bit ( Aviso &amp; V3000);</p><p>Un cadre securis&eacute;;</p><p>Des ordinateurs;</p><p>Des cl&eacute;s USB et des supports de stockage externe;</p><p>Divers logiciels (adobe creative suite, windev, final cut, etc.);</p><p>Une mezzanine pouvant faire office d espace de pr&eacute;sentation, de r&eacute;union et de brainstorming , pour 8 personnes;</p><p>Un fond vert/noir/blanc (mensuration 5 metres x 3.5 metres);</p><p>Un vid&eacute;oprojecteur;</p><p>Une salle de travail commune;</p><p>Un bureau (assez grand pour trois tables de bureaux de taille standard);</p><p>Une bibpoth&egrave;que (&agrave; venir);</p><p>Un jardin et une cuisine.</p><p></p><h3>Combien ?</h3><h4>Coworkers, investisseurs et Porteurs de projet</h4><p>Le coworking space se propose de mettre en relation les diff&eacute;rentes composantes de l&rsquo;&eacute;cosyst&egrave;me du web et des m&eacute;dias ivoiriens.</p><h4>Startups/Freelance</h4><p><b><i>Salle commune de travail</i></b></p><p></p><p>Individu- 85,000 fcfa/mois ( trois mois d&rsquo;avance)</p><p>Desktop Dedi&eacute; a 100,000 Fcfa/mois* (trois mois d&rsquo;avance)</p><p>Start-up  (3-4 personnes) 150,000 fcfa/mois (Trois mois d&rsquo;avance) Table de  travail commune-  Desktop Dedi&eacute; (Start up 3 a 4 personnes) 200,000  fcfa/mois (Trois mois d&rsquo;avance)</p><p></p><p><i><b>Bureau</b></i></p><p></p><p>Individu- 180,000 Fcfa/mois (trois mois d&rsquo;avance)**</p><p>Start-up(3-4 personnes) 240,000 Fcfa/mois ( trois mois d&rsquo;avance)***</p><p></p><p><i><b>Green/Black/White/Blue Room</b></i></p><p></p><p>Photographe et Vidéographe 150,000 Fcfa/mois ( trois mois d&rsquo;avance)</p><p>Personne morale 300,000 fcfa/mois ( trois mois d&rsquo;avance)</p><p></p>";
	        	TextView htmlT = (TextView) findViewById(R.id.presentation);
	        	htmlT.setText(Html.fromHtml(html));
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
