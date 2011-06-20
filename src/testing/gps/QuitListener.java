package testing.gps;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class QuitListener extends MyListener implements OnClickListener  {

	public QuitListener(Gps_testingActivity gps_testingActivity) {
		super(gps_testingActivity);
	}

	@Override
	public void onClick(View arg0) {
		Toast.makeText(parent.getApplicationContext(), "Quit disabled", Toast.LENGTH_SHORT ).show();
	}

}
