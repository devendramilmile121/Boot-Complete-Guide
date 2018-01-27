package com.crackmyapp.mtassignment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by dhmil on 27-01-2018.
 */

public class OnBootReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Boot Completed",Toast.LENGTH_LONG).show();
    }
}
