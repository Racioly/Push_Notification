package br.com.teste.pushnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        group_push.visibility = View.GONE
        txv_init.visibility = View.VISIBLE

        intent?.getStringExtra(Constants.Keys.TITLE)?.let {
            group_push.visibility = View.VISIBLE
            txv_init.visibility = View.GONE
            txv_title.text = it
        }

        intent?.getStringExtra(Constants.Keys.MESSAGE)?.let {
            txv_message.text = it
        }
    }

    override fun onStop() {
        finishAffinity()
        super.onStop()
    }
}