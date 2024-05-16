package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

const val tag = "TAG"

class ActivityA : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate A ${hashCode()}")
        setContentView(R.layout.activity_a)
        button = findViewById(R.id.open_b)
        button?.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart A ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop A ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume A ${hashCode()}")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(tag, "onNewIntent A ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy A ${hashCode()}")
    }
}