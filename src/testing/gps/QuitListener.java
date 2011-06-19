package testing.gps;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class QuitListener implements OnClickListener {
	Activity parent;
	public QuitListener(Gps_testingActivity gps_testingActivity){
		parent = gps_testingActivity;
	}
	@Override
	public void onClick(View arg0) {
		Toast.makeText(parent.getApplicationContext(), "Quit disabled", Toast.LENGTH_SHORT ).show();
	}

}
