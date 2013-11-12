package com.mario.scvhandbook;

import android.app.TabActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TabHost;

public class ViewCharacterMovesActivity extends TabActivity {
	private static final int DEFAULT_HEIGHT = 60;
	private static final int DEFAULT_WIDTH = 120;
	
	private WebView horizontalWeb;
	private WebView verticalWeb;
	private WebView kicksWeb;
	private WebView simultaneousWeb;
	private WebView eightwrWeb;
	private WebView grabWeb;
	private WebView stanceWeb;
	private WebView edgeWeb;
	private WebView comboWeb;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		setContentView(R.layout.tabhost);
		TabHost tabHost = getTabHost();

		String selectedCharName = getIntent().getStringExtra("com.mario.scvhandbook.SelectedCharName");
		String charAssetURL = "file:///android_asset/"+selectedCharName+"/";

		this.setTitle(selectedCharName + "'s movelist/frame data");
		
		// WebViews
		horizontalWeb = (WebView) findViewById(R.id.horizontal);
		horizontalWeb.getSettings().setBuiltInZoomControls(true);
		horizontalWeb.loadUrl(charAssetURL+"horizontal.html");

		verticalWeb = (WebView) findViewById(R.id.vertical);
		verticalWeb.getSettings().setBuiltInZoomControls(true);
		verticalWeb.loadUrl(charAssetURL+"vertical.html");

		kicksWeb = (WebView) findViewById(R.id.kicks);
		kicksWeb.getSettings().setBuiltInZoomControls(true);
		kicksWeb.loadUrl(charAssetURL+"kicks.html");

		simultaneousWeb = (WebView) findViewById(R.id.simultaneous);
		simultaneousWeb.getSettings().setBuiltInZoomControls(true);
		simultaneousWeb.loadUrl(charAssetURL+"simultaneous.html");

		eightwrWeb = (WebView) findViewById(R.id.eightwr);
		eightwrWeb.getSettings().setBuiltInZoomControls(true);
		eightwrWeb.loadUrl(charAssetURL+"eightwr.html");

		grabWeb = (WebView) findViewById(R.id.grab);
		grabWeb.getSettings().setBuiltInZoomControls(true);
		grabWeb.loadUrl(charAssetURL+"grab.html");

		stanceWeb = (WebView) findViewById(R.id.stance);
		stanceWeb.getSettings().setBuiltInZoomControls(true);
		stanceWeb.loadUrl(charAssetURL+"stance.html");

		edgeWeb = (WebView) findViewById(R.id.edge);
		edgeWeb.getSettings().setBuiltInZoomControls(true);
		edgeWeb.loadUrl(charAssetURL+"edge.html");

		comboWeb = (WebView) findViewById(R.id.combo);
		comboWeb.getSettings().setBuiltInZoomControls(true);
		comboWeb.loadUrl(charAssetURL+"combo.html");
		
		// TabSpecs
		TabHost.TabSpec horizontal = tabHost.newTabSpec("horizontal").setContent(R.id.horizontal).setIndicator(getString(R.string.horizontal));
		TabHost.TabSpec vertical = tabHost.newTabSpec("vertical").setContent(R.id.vertical).setIndicator(getString(R.string.vertical));
		TabHost.TabSpec kicks = tabHost.newTabSpec("kicks").setContent(R.id.kicks).setIndicator(getString(R.string.kicks));
		TabHost.TabSpec simultaneous = tabHost.newTabSpec("simultaneous").setContent(R.id.simultaneous).setIndicator(getString(R.string.simultaneous));
		TabHost.TabSpec eightwr = tabHost.newTabSpec("eightwr").setContent(R.id.eightwr).setIndicator(getString(R.string.eightwr));
		TabHost.TabSpec grab = tabHost.newTabSpec("grab").setContent(R.id.grab).setIndicator(getString(R.string.grab));
		TabHost.TabSpec stance = tabHost.newTabSpec("stance").setContent(R.id.stance).setIndicator(getString(R.string.stance));
		TabHost.TabSpec edge = tabHost.newTabSpec("edge").setContent(R.id.edge).setIndicator(getString(R.string.edge));
		TabHost.TabSpec combo = tabHost.newTabSpec("combo").setContent(R.id.combo).setIndicator(getString(R.string.combo));

		// Add tabs
		tabHost.addTab(horizontal);
		tabHost.addTab(vertical);
		tabHost.addTab(kicks);
		tabHost.addTab(simultaneous);
		tabHost.addTab(eightwr);
		tabHost.addTab(grab);
		tabHost.addTab(stance);
		tabHost.addTab(edge);
		tabHost.addTab(combo);

		tabHost.getTabWidget().getChildAt(0).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(0).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(1).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(1).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(2).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(2).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(3).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(3).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(4).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(4).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(5).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(5).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(6).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(6).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(7).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(7).getLayoutParams().width=DEFAULT_WIDTH;
		tabHost.getTabWidget().getChildAt(8).getLayoutParams().height=DEFAULT_HEIGHT;
		tabHost.getTabWidget().getChildAt(8).getLayoutParams().width=DEFAULT_WIDTH;
		
		tabHost.setCurrentTab(0);
		
	}
}
