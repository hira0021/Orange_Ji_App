package com.example.orange_ji.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.orange_ji.R
import com.example.orange_ji.databinding.ActivityMainBinding
import com.example.orange_ji.presentation.mainchat.ChatFragment
import com.example.orange_ji.presentation.mainfollowing.FollowingFragment
import com.example.orange_ji.presentation.mainprofile.ProfileFragment
import com.example.orange_ji.utils.base.BaseVMActivity
import com.example.orange_ji.presentation.mainhome.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

 class MainActivity : BaseVMActivity<ActivityMainBinding, MainViewModel>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        enableEdgeToEdge()

        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    loadFragment(HomeFragment())
                    true
                }

                R.id.action_following -> {
                    loadFragment(FollowingFragment())
                    true
                }

                R.id.action_chat -> {
                    loadFragment(ChatFragment())
                    true
                }

                R.id.action_profile -> {
                    loadFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        // Replace the current fragment with the new fragment
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }
}