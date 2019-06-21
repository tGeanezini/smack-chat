package com.tgeanezini.mobile.smackchat

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    private var userAvatar = "profileDefault"
    private var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

        create_avatar_image.setOnClickListener { createAvatarClicked() }

        btn_create_background_color.setOnClickListener { createBackgroundClicked() }

        btn_create_user.setOnClickListener { createUserClicked() }
    }

    private fun createAvatarClicked() {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28) // images from 0 to 27

        userAvatar = if (color == 0) {
            "light$avatar"
        } else {
            "dark$avatar"
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        create_avatar_image.setImageResource(resourceId)
    }

    private fun createBackgroundClicked() {
        val random = Random()
        val red = random.nextInt(255)
        val green = random.nextInt(255)
        val blue = random.nextInt(255)

        create_avatar_image.setBackgroundColor(Color.rgb(red, green, blue))

        val savedRed = red.toDouble() / 255 // 0 to 1 scale
        val savedGreen = green.toDouble() / 255
        val savedBlue = blue.toDouble() / 255

        avatarColor = "[$savedRed, $savedGreen, $savedBlue, 1]"
    }

    private fun createUserClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
