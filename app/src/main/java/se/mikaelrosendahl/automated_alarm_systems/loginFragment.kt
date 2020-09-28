package se.mikaelrosendahl.automated_alarm_systems

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_login.*


class loginFragment : Fragment() {

    // create ref to user i fb
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize Firebase Auth
        auth = Firebase.auth

        // create fun for btn
        loginRegBtn.setOnClickListener {
            auth.createUserWithEmailAndPassword(loginEmailET.text.toString(),passwordET.text.toString() )
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("mindebug", "createUserWithEmail:success")

                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("mindebug", "createUserWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()

                    }
                }

        }
        loginBtn.setOnClickListener {


        }

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onStart() {
        super.onStart()

        if(auth.currentUser == null)
        {
            val intent = Intent (this@loginFragment.context, LoginFrag::class.java)
            startActivity(intent)


        }

    }
}


