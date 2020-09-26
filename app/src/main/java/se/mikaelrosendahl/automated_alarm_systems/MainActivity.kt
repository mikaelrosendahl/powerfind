package se.mikaelrosendahl.automated_alarm_systems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_start_.*
import se.mikaelrosendahl.automated_alarm_systems.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okNextBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.btnFragment, LoginFragment())
        }

    }
}