package com.iqbal.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_button
import kotlinx.android.synthetic.main.activity_main.ed_alamat
import kotlinx.android.synthetic.main.activity_main.ed_email
import kotlinx.android.synthetic.main.activity_main.ed_nama
import kotlinx.android.synthetic.main.activity_main.ed_telpon
import kotlinx.android.synthetic.main.activity_main.spinner_gender

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_button.setOnClickListener {
            val nama=ed_nama.text.toString()
            val gender=spinner_gender.selectedItem.toString()
            val telepon=ed_telpon.text.toString()
            val email=ed_email.text.toString()
            val alamat=ed_alamat.text.toString()
            val intent= Intent(this,ProfileActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("gender",gender)
            intent.putExtra("telepon",telepon)
            intent.putExtra("email",email)
            intent.putExtra("alamat",alamat)
            startActivity(intent)
        }
    }
}
