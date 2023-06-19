package com.natashasapplication.app.modules.iphone14fiftyfive.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14FiftyfiveBinding
import com.natashasapplication.app.modules.iphone14fiftyfive.`data`.viewmodel.Iphone14FiftyfiveVM
import kotlin.String
import kotlin.Unit

class Iphone14FiftyfiveFragment :
    BaseFragment<FragmentIphone14FiftyfiveBinding>(R.layout.fragment_iphone_14_fiftyfive) {
  private val viewModel: Iphone14FiftyfiveVM by viewModels<Iphone14FiftyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14FiftyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYFIVE_FRAGMENT"

  }
}
