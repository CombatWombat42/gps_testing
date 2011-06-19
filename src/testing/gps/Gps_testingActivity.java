package testing.gps;


import android.app.Activity;

import android.content.Context;

import android.location.LocationListener;

import android.location.LocationManager;

import android.os.Bundle;
import android.widget.TextView;
public class Gps_testingActivity extends Activity
{
	/** Called when the activity is first created. */
	TextView t;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		/* Use the LocationManager class to obtain GPS locations */
		LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		LocationListener mlocListener = new MyLocationListener(this,t);
		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
		
		t=new TextView(this);
	    t= (TextView) findViewById(R.id.TextView01); 
	    t.setText("Step One: blast egg");
	    t.setText("foo");
	}


}/* End of UseGps Activity */