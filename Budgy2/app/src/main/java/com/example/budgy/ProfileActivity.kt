package com.example.budgy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private var isMenuOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupNavigation()
        setupHamburgerMenu()
    }

    private fun setupHamburgerMenu() {
        val menuButton = findViewById<ImageButton>(R.id.menuButton)
        val dropdownMenu = findViewById<LinearLayout>(R.id.dropdownMenu)

        menuButton?.setOnClickListener {
            isMenuOpen = !isMenuOpen
            dropdownMenu.visibility = if (isMenuOpen) View.VISIBLE else View.GONE
        }
    }

    private fun setupNavigation() {
        val home = findViewById<ImageButton>(R.id.navHome)
        val history = findViewById<ImageButton>(R.id.navHistory)
        val reports = findViewById<ImageButton>(R.id.navReports)
        val profile = findViewById<ImageButton>(R.id.navProfile)

        home?.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

        history?.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
            finish()
        }

        reports?.setOnClickListener {
            startActivity(Intent(this, ReportsActivity::class.java))
            finish()
        }

        profile?.setOnClickListener {
            // Already on profile
        }
    }
}