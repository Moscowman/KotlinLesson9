package ru.varasoft.kotlin.kotlinlesson9.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.varasoft.kotlin.kotlinlesson9.R

const val REQUEST_CODE = 42

// Проверяем, разрешено ли чтение контактов

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.apply {
            beginTransaction()
                .add(R.id.container, MainFragment.newInstance())
                .addToBackStack("")
                .commitAllowingStateLoss()
        }
    }


}