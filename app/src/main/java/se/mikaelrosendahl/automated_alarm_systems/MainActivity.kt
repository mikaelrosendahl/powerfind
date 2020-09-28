package se.mikaelrosendahl.automated_alarm_systems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      changeContentBtn.setOnClickListener {
          supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder, loginFragment())
              .commit()

      }
    }
}