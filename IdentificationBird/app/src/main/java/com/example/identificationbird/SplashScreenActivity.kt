package com.example.identificationbird

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModelProvider
import com.example.identificationbird.databinding.ActivitySplashScreenBinding
import com.example.identificationbird.datastore.PreferencesViewModel

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "userSession")
    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var preferencesViewModel: PreferencesViewModel
    private var idUser: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()
        setupViewModel()
    }

    private fun setupViewModel(){
                if(idUser != 0){
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }, splashDuration)
                }

                Handler(Looper.getMainLooper()).postDelayed({
                    val intent = Intent(this, OnBoardingActivity::class.java)
                    startActivity(intent)
                    finish()
                }, splashDuration)


    }

    companion object {
        const val splashDuration: Long = 3000
    }
}