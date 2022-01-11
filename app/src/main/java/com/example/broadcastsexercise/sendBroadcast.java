package com.example.broadcastsexercise;

import android.content.Context;
import android.content.Intent;

public class sendBroadcast {
    public sendBroadcast(int btn, Context context){
        Intent intent = new Intent();
        intent.setAction(MainActivity.action);
        intent.putExtra(MainActivity.gotit,"我收到了");
        context.sendBroadcast(intent);
    }
}
