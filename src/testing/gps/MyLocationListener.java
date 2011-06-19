package testing.gps;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

	/* Class My Location Listener */
	public class MyLocationListener implements LocationListener
	{
		Activity parent;
		TextView text;

		public MyLocationListener(Gps_testingActivity gps_testingActivity, TextView t) {
			parent = gps_testingActivity;
			text = t;
		}

		@Override
		public void onLocationChanged(Location loc)
		{
			loc.getLatitude();
			loc.getLongitude();
			String Text = "My current location is: " + "Latitude = " + loc.getLatitude() + "Longitud = " + loc.getLongitude();
			Toast.makeText( parent.getApplicationContext(),Text,Toast.LENGTH_SHORT).show();
			//text.setText(Text);

		}

		@Override
		public void onProviderDisabled(String provider)
		{
			Toast.makeText( parent.getApplicationContext(), "Gps Disabled", Toast.LENGTH_SHORT ).show();
		}
		
		@Override
		public void onProviderEnabled(String provider)
		{
			Toast.makeText( parent.getApplicationContext(),"Gps Enabled",Toast.LENGTH_SHORT).show();
		}
		
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras)
		{
		}

	}/* End of Class MyLocationListener */