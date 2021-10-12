package com.example.betmatch


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    //private val arrayCountry = arrayOf(Countries(R.string.england))
    private lateinit var buttonStats: Button
    private lateinit var buttonNews: Button
    private lateinit var buttonTables: Button
    private lateinit var buttonSettings: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getId()



        buttonNews.setOnClickListener {
            Toast.makeText(this, R.string.news, Toast.LENGTH_LONG).show()
        }
        buttonSettings.setOnClickListener {
            Toast.makeText(this, R.string.settings, Toast.LENGTH_LONG).show()
        }
        buttonStats.setOnClickListener {
            Toast.makeText(this, R.string.stats, Toast.LENGTH_LONG).show()
        }
        buttonTables.setOnClickListener {
            Toast.makeText(this, R.string.tables, Toast.LENGTH_LONG).show()
        }


    }

    private fun getId() {
        buttonNews = findViewById(R.id.buttonNews)
        buttonSettings = findViewById(R.id.buttonSettings)
        buttonStats = findViewById(R.id.buttonStats)
        buttonTables = findViewById(R.id.buttonTables)
    }
}

