package com.example.appnavfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.appnavfragment.domain.VocabularyUseCase
import com.example.appnavfragment.presentation.VocabularyViewModel
import com.example.appnavfragment.presentation.VocabularyViewModelFactory
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this)[VocabularyViewModel::class.java]
    }
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

    }

    private fun fillFragment(homeFragment: HomeFragment) {

    }
}