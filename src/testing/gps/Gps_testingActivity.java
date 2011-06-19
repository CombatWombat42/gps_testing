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
	private Button quit,next;
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
	    next = (Button) findViewById(R.id.Next_Screen);
	    mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		mlocListener = new MyLocationListener(this,t);
		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
		quit.setOnClickListener(new QuitListener(this));
		next.setOnClickListener(new NextListener(this));

	}
	@Override
	public void onStop(){
		super.onStop();
		mlocManager.removeUpdates(mlocListener);
	}
	public void returnToMain(){
		setContentView(R.layout.main);
	}


}/* End of UseGps Activity */