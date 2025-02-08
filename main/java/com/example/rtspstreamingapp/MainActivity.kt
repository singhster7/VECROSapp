package com.example.rtspstreamingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource
import com.google.android.exoplayer2.ui.PlayerView

class MainActivity : AppCompatActivity() {

    private lateinit var player: ExoPlayer
    private lateinit var playerView: PlayerView
    private lateinit var urlInput: EditText
    private lateinit var playButton: Button
    private lateinit var pauseButton: Button
    private lateinit var stopButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerView = findViewById(R.id.playerView)
        urlInput = findViewById(R.id.urlInput)
        playButton = findViewById(R.id.playButton)
        pauseButton = findViewById(R.id.pauseButton)
        stopButton = findViewById(R.id.stopButton)

        initializePlayer()
        setupButtonListeners()
    }

    private fun initializePlayer() {
        player = ExoPlayer.Builder(this).build()
        playerView.player = player

        player.addListener(object : Player.Listener {
            override fun onPlayerError(error: PlaybackException) {
                Toast.makeText(this@MainActivity, "Error: ${error.message}", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun setupButtonListeners() {
        playButton.setOnClickListener {
            val rtspUrl = urlInput.text.toString()
            if (rtspUrl.isNotEmpty()) {
                playStream(rtspUrl)
            } else {
                Toast.makeText(this, "Please enter a valid RTSP URL", Toast.LENGTH_SHORT).show()
            }
        }

        pauseButton.setOnClickListener {
            player.pause()
        }

        stopButton.setOnClickListener {
            player.stop()
            player.clearMediaItems()
        }
    }

    private fun playStream(rtspUrl: String) {
        val mediaSource = RtspMediaSource.Factory()
            .createMediaSource(MediaItem.fromUri(rtspUrl))

        player.setMediaSource(mediaSource)
        player.prepare()
        player.play()
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}

