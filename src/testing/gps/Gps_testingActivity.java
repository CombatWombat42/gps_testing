package testing.gps;


import android.app.Activity;

import android.content.Context;

import android.location.LocationListener;

import android.location.LocationManager;

import android.os.Bundle;
//import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
public class Gps_testingActivity extends Activity
{
	
	private TextView t;
	private Button quit;
	private LocationListener mlocListener;
	private LocationManager mlocManager;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		/* Use the LocationManager class to obtain GPS locations */
	    t= (TextView) findViewById(R.id.GPS_Locations); 
	    quit = (Button) findViewById(R.id.Quit);
	    mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		mlocListener = new MyLocationListener(this,t);
		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
		quit.setOnClickListener(new QuitListener(this));

	}
	@Override
	public void onStop(){
		mlocManager.removeUpdates(mlocListener);
	}


}/* End of UseGps Activity */