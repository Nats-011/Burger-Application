package com.natashasapplication.app.modules.iphone14fiftysix.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14FiftysixBinding
import com.natashasapplication.app.modules.iphone14fiftysix.`data`.viewmodel.Iphone14FiftysixVM
import kotlin.String
import kotlin.Unit

class Iphone14FiftysixFragment :
    BaseFragment<FragmentIphone14FiftysixBinding>(R.layout.fragment_iphone_14_fiftysix) {
  private val viewModel: Iphone14FiftysixVM by viewModels<Iphone14FiftysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14FiftysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYSIX_FRAGMENT"

  }
}
