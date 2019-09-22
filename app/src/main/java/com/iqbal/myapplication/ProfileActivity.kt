package com.iqbal.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.address_value
import kotlinx.android.synthetic.main.activity_profile.email_value
import kotlinx.android.synthetic.main.activity_profile.gender_value
import kotlinx.android.synthetic.main.activity_profile.nama_value
import kotlinx.android.synthetic.main.activity_profile.telp_value

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent.extras
        val name = intent?.getString("nama")
        val telepon = intent?.getString("telepon")
        val kelamin = intent?.getString("gender")
        val alamat = intent?.getString("alamat")
        val email = intent?.getString("email")

        nama_value.text = name
        telp_value.text = telepon
        gender_value.text = kelamin
        address_value.text = alamat
        email_value.text = email



    }
}
