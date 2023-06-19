package com.natashasapplication.app.modules.iphone14eightytwo.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14EightytwoBinding
import com.natashasapplication.app.modules.iphone14eightytwo.`data`.viewmodel.Iphone14EightytwoVM
import kotlin.String
import kotlin.Unit

class Iphone14EightytwoFragment :
    BaseFragment<FragmentIphone14EightytwoBinding>(R.layout.fragment_iphone_14_eightytwo) {
  private val viewModel: Iphone14EightytwoVM by viewModels<Iphone14EightytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14EightytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14EIGHTYTWO_FRAGMENT"

  }
}
