package com.asmaa.yummly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navControler: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Bottom_Navigation)
        navControler = findNavController(R.id.navHostFragment)

        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipeFragment,
                R.id.favoriteRecipeFragment,
                R.id.foodJokeFragment
            )
        )
        setupActionBarWithNavController(navControler, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navControler)
    }
    override fun onSupportNavigateUp(): Boolean {
        return navControler.navigateUp() || super.onSupportNavigateUp()
    }
}