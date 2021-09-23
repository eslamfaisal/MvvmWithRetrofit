package com.eslam.mvvmtask.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eslam.mvvmtask.R
import com.eslam.mvvmtask.viewmodel.UsersViewModel
import com.urgent.daddody.api.Status.*

class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity"
    }


    val viewModel : UsersViewModel by lazy {
        UsersViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getUserData()

        viewModel.listResponse.observe(this) {
            when (it.status) {
                SUCCESS -> {
                    Log.d(TAG, "SUCCESS: ${it.data!!.data!!.size}")
                }
                ERROR -> {

                    Log.d(TAG, "ERROR: ${it.errorMessage}")
                }
                LOADING -> {
                    Log.d(TAG, "LOADING:")
                }
            }
        }
    }
}