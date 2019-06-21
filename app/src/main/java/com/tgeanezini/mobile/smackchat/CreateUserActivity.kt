package com.tgeanezini.mobile.smackchat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

        create_avatar_image.setOnClickListener { createAvatarClicked() }

        btn_create_background_color.setOnClickListener { createBackgroundClicked() }

        btn_create_user.setOnClickListener { createUserClicked() }
    }

    private fun createAvatarClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun createBackgroundClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun createUserClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
