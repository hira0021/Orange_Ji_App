package com.example.orange_ji.utils.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseVMActivity<B : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    lateinit var viewModel: VM
    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(getViewModelClass())
    }

    abstract fun getViewBinding() : B

    abstract fun getViewModelClass() : Class<VM>
}