package com.example.music

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MPService: Service() {

    private val TAG="MPService"
    lateinit var mp:MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {
       return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
     mp=MediaPlayer.create(this,R.raw.song)
        mp.isLooping=true
        mp.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.stop()
    }
}



