package com.tgeanezini.mobile.smackchat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            onLoginClicked()
        }

        btn_create_user.setOnClickListener {
            onCreateUserClicked()
        }
    }

    private fun onLoginClicked() {

    }

    private fun onCreateUserClicked() {
        val intent = Intent(this, CreateUserActivity::class.java)
        startActivity(intent)
    }
}
