package com.example.myshoppinglist.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myshoppinglist.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item)
    }


    companion object {
        fun newIntentAddItem1(context: Context): Intent {
            return Intent(context, MainActivity2::class.java)
        }
    }
}