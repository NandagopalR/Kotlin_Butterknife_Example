package com.orgware.kotilnsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class HomeActivity : AppCompatActivity() {

    @BindView(R.id.btnLogin)
    lateinit var btnLogin: Button
    @BindView(R.id.tv_username)
    lateinit var etUsername: EditText
    @BindView(R.id.tv_password)
    lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.btnLogin)
    public fun onLoginClick() {

        if (etUsername.text.isEmpty()) {
            Toast.makeText(this, "Username is empty", Toast.LENGTH_SHORT).show()
            return
        }

        if (etPassword.text.isEmpty()) {
            Toast.makeText(this, "Password is empty", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, String.format("Login Success for %s!", etUsername.text.toString()), Toast.LENGTH_SHORT).show()

    }

}
