package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    private var buttonOpenA: Button? = null
    private var buttonOpenD: Button? = null
    private var buttonCloseC: Button? = null
    private var buttonCloseStack: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "onCreate C")
        setContentView(R.layout.activity_c)
        buttonOpenA = findViewById(R.id.open_a)
        buttonOpenD = findViewById(R.id.open_d)
        buttonCloseC = findViewById(R.id.close_c)
        buttonCloseStack = findViewById(R.id.close_stack)

        buttonOpenA?.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }

        buttonOpenD?.setOnClickListener {
            startActivity(Intent(this, ActivityD::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }

        buttonCloseC?.setOnClickListener {
            finish()
        }

        buttonCloseStack?.setOnClickListener {
            finishAffinity()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart C")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop C")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume C")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(tag, "onNewIntent C")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy C")
    }

}