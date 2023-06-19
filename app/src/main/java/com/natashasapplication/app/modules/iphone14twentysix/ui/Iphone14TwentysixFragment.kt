package com.natashasapplication.app.modules.iphone14twentysix.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentysixBinding
import com.natashasapplication.app.modules.iphone14twentysix.`data`.viewmodel.Iphone14TwentysixVM
import kotlin.String
import kotlin.Unit

class Iphone14TwentysixFragment :
    BaseFragment<FragmentIphone14TwentysixBinding>(R.layout.fragment_iphone_14_twentysix) {
  private val viewModel: Iphone14TwentysixVM by viewModels<Iphone14TwentysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14TwentysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTYSIX_FRAGMENT"

  }
}
