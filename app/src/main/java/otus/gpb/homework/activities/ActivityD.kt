package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate D")
        setContentView(R.layout.activity_d)
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart D")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop D")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume D")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(tag, "onNewIntent D")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy D")
    }
}