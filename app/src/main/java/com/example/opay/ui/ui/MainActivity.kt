package com.example.opay.ui.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.opay.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var bottomNavigationView: BottomNavigationView? = null
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragmentId) as NavHostFragment
        navController = navHostFragment.findNavController()
        bottomNavigationView?.findViewById<BottomNavigationView>(R.id.bottomNav)

        //hide back arrow button
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.walletFragment,
                R.id.cardFragment,
                R.id.historyFragment,
                R.id.profileFragment
            )
        )

        //when user navigate from navigation bar page , navbar will hide
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.addNewFragment -> hideBottomNav()
                R.id.signInFragment -> hideBottomNav()
                R.id.signUpFragment -> hideBottomNav()
                R.id.updateProfileFragment -> hideBottomNav()
                R.id.withdrawFragment -> hideBottomNav()
                R.id.sendMoneyFragment -> hideBottomNav()
                R.id.bankTransferFragment -> hideBottomNav()
                R.id.splashScreenFragment -> hideBottomNav()
                R.id.onBoardingFragment -> hideBottomNav()
                R.id.qrCodeFragment -> hideBottomNav()
                R.id.scanQrFragment -> hideBottomNav()

                else -> showBottomNav()
            }
        }

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNav.setupWithNavController(navController)


    }

    //show navbar function
    private fun showBottomNav() {
        bottomNav?.visibility = View.VISIBLE
    }

    //hide navbar function
    private fun hideBottomNav() {
        bottomNav?.visibility = View.GONE
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}