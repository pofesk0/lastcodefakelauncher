package com.fakelauncher;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyDeviceAdminReceiver extends DeviceAdminReceiver {

    @Override
    public void onEnabled(Context context, Intent intent) {
        Toast.makeText(context,"Device Admin включен", Toast.LENGTH_SHORT).show();
    }

	@Override
	public void onPasswordFailed(Context context, Intent intent)
	{
		Intent i = new Intent(context, LauncherActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
	}


    @Override
    public void onDisabled(Context context, Intent intent) {
        Toast.makeText(context,"Device Admin выключен", Toast.LENGTH_SHORT).show();
    }
}
