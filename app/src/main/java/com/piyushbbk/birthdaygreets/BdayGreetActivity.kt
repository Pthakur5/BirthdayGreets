package com.piyushbbk.birthdaygreets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_greet.*

class BdayGreetActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_greet)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text = "Happy Birthday\n$name !"
    }
}