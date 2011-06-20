package testing.gps;

import android.view.View;
import android.view.View.OnClickListener;

public class retListener extends MyListener implements OnClickListener {


	public retListener(Gps_testingActivity gps_testingActivity) {
		super(gps_testingActivity);
	}

	@Override
	public void onClick(View v) {
		parent.setContentView(R.layout.main);
	}

}
