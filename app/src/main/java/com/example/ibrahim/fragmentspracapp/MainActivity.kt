package com.example.ibrahim.fragmentspracapp

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private val fManager = supportFragmentManager

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, HomeFragment()).commit()
            }
            R.id.nav_movies -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, MoviesFragment()).commit()
            }
            R.id.nav_games -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, GamesFragment()).commit()
            }
            R.id.nav_extras -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, ExtrasFragment()).commit()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        Log.i("FragmentMainActivity", "onCreate")
        fManager.beginTransaction().add(R.id.mainActFragment, HomeFragment()).commit()


        home_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, HomeFragment()).commit()
        }
        games_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, GamesFragment()).commit()
        }
        extras_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, ExtrasFragment()).commit()
        }
        movies_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, MoviesFragment()).commit()
        }
    }
}
