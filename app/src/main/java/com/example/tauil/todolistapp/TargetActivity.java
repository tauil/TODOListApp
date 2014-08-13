package com.example.tauil.todolistapp;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.tauil.todolistapp.R;

public class TargetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.target, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_notification) {
            final NotificationManager nMgn= (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

            Notification note=new Notification(R.drawable.ic_launcher, "Traybar fast text",System.currentTimeMillis());

            PendingIntent i=PendingIntent.getActivity(this, 0, new Intent("android.intent.action.TargetActivity"), 0);

            note.setLatestEventInfo(this, "Notification Title", "Notification summary..", i);

            nMgn.notify(13, note);
        }
        return super.onOptionsItemSelected(item);
    }
}
