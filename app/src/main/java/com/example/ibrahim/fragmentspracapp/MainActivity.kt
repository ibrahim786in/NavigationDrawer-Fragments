package com.example.ibrahim.fragmentspracapp

import android.graphics.Color
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
    val color = Color.parseColor("#000000")
    private fun colorCode() {
        home_btn.setTextColor(Color.parseColor("#ff669900"))
        movies_btn.setTextColor(Color.parseColor("#ffff8800"))
        games_btn.setTextColor(Color.parseColor("#ffaa66cc"))
        extras_btn.setTextColor(Color.parseColor("#ff33b5e5"))
    }

    private fun notPressed() {
        home_btn.isPressed = false
        movies_btn.isPressed = false
        games_btn.isPressed = false
        extras_btn.isPressed = false
        images_btn.isPressed = false
    }

    //    lateinit var commonItem: MenuItem
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        notPressed()
        item.isChecked = true

        when (item.itemId) {
            R.id.nav_home -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, HomeFragment()).commit()
                notPressed()
                home_btn.isPressed = true

                colorCode()
                home_btn.setTextColor(color)
            }
            R.id.nav_movies -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, MoviesFragment()).commit()
                notPressed()
                movies_btn.isPressed = true
                colorCode()

                movies_btn.setTextColor(color)
            }
            R.id.nav_games -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, GamesFragment()).commit()
                notPressed()
                games_btn.isPressed = true
                colorCode()
                games_btn.setTextColor(color)
            }
            R.id.nav_extras -> {
                fManager.beginTransaction().replace(R.id.mainActFragment, ExtrasFragment()).commit()
                notPressed()
                extras_btn.isPressed = true
                colorCode()
                extras_btn.setTextColor(color)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        notPressed()

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
        Log.i("FragmentMainActivity", "onCreate")
        fManager.beginTransaction().add(R.id.mainActFragment, HomeFragment()).addToBackStack(null).commit()
        onNavigationItemSelected(nav_view.menu.getItem(0))

        home_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, HomeFragment()).commit()
            notPressed()
            onNavigationItemSelected(nav_view.menu.getItem(0))
            home_btn.isPressed = true

//        onNavigationItemSelected(commonItem)
        }
        movies_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, MoviesFragment()).commit()
            notPressed()
            onNavigationItemSelected(nav_view.menu.getItem(1))
            movies_btn.isPressed = true

        }
        games_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, GamesFragment()).commit()
            notPressed()
            onNavigationItemSelected(nav_view.menu.getItem(2))
            games_btn.isPressed = true

        }
        extras_btn.setOnClickListener {
            fManager.beginTransaction().replace(R.id.mainActFragment, ExtrasFragment()).commit()
            notPressed()
            onNavigationItemSelected(nav_view.menu.getItem(3))
            extras_btn.isPressed = true

        }
    }
}
