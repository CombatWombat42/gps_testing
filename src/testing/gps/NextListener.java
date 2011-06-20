package testing.gps;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NextListener extends MyListener implements OnClickListener {
	Button ret;
	public NextListener(Gps_testingActivity gps_testingActivity) {
		super(gps_testingActivity);
	}

	@Override
	public void onClick(View arg0) {
		parent.setContentView(R.layout.other_screen);
		ret = (Button) parent.findViewById(R.id.ret);
		ret.setOnClickListener(new retListener(parent));
	}

}
