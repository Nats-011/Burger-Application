package com.natashasapplication.app.modules.iphone14fiftyfour.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14FiftyfourBinding
import com.natashasapplication.app.modules.iphone14fiftyfour.`data`.viewmodel.Iphone14FiftyfourVM
import kotlin.String
import kotlin.Unit

class Iphone14FiftyfourFragment :
    BaseFragment<FragmentIphone14FiftyfourBinding>(R.layout.fragment_iphone_14_fiftyfour) {
  private val viewModel: Iphone14FiftyfourVM by viewModels<Iphone14FiftyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14FiftyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYFOUR_FRAGMENT"

  }
}
