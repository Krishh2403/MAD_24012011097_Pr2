package com.example.mad_24012011097_pr2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        display(msg = "onCreate function called.")
    }

    override fun onStart() {
        super.onStart()
        display("onStart function called.")
    }

    override fun onPause() {
        super.onPause()
        display("onPause function called.")
    }

    override fun onResume() {
        super.onResume()
        display("onResume function called.")
    }

    override fun onStop() {
        super.onStop()
        display("onStop function called.")
    }

    override fun onRestart() {
        super.onRestart()
        display("onRestart function called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        display("onDestroy function called.")
    }

    fun display(msg: String) {
        Log.i(tag, msg)
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        val rootView = findViewById<View>(R.id.main)
        if (rootView != null) {
            Snackbar.make(rootView, msg, Snackbar.LENGTH_SHORT).show()
        }
    }
}