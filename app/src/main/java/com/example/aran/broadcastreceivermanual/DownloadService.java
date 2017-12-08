package com.example.aran.broadcastreceivermanual;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

public class DownloadService extends IntentService {
    public static final String TAG = "DownloadService";

    public DownloadService() {
        super("DownloadService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(TAG, "Download Service dijalankan");
        if (intent != null){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent pemberitahuanSelesaiIntent = new Intent(MainActivity.ACTION_DOWNLOAD_STATUS);
            sendBroadcast(pemberitahuanSelesaiIntent);
        }

    }
}
