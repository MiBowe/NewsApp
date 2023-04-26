package com.example.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.appnews.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import okhttp3.Dispatcher

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash)
/* Handler(Looper.myLooper()!!).postDelayed({
     setContentView(binding.root)
     binding.bottomNavigationView.setupWithNavController(
         navController = this.findNavController(R.id.nav_host_fragment)
     )
 }, 5000)*/
        CoroutineScope(Dispatchers.Main).launch {
            delay(5000)
            _binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.bottomNavigationView.setupWithNavController(navController = this@MainActivity.findNavController(R.id.nav_host_fragment))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}