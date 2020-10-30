package com.example.casherv2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        navView.menu.getItem(1).isEnabled = false // middle missing
        navView.background = null // shadow null

        btnAccount.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
        }

        btnChart.setOnClickListener {
            startActivity(Intent(this, ChartActivity::class.java))
        }

        fab.setOnClickListener {
            println("blabla")
        }
    }
}