package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate B")
        setContentView(R.layout.activity_b)
        button = findViewById(R.id.open_c)
        button?.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart B")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop B")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume B")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(tag, "onNewIntent B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy B")
    }
}