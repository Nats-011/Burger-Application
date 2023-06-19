package com.natashasapplication.app.modules.iphone14eightyfour.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14EightyfourBinding
import com.natashasapplication.app.modules.iphone14eightyfour.`data`.viewmodel.Iphone14EightyfourVM
import kotlin.String
import kotlin.Unit

class Iphone14EightyfourFragment :
    BaseFragment<FragmentIphone14EightyfourBinding>(R.layout.fragment_iphone_14_eightyfour) {
  private val viewModel: Iphone14EightyfourVM by viewModels<Iphone14EightyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14EightyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14EIGHTYFOUR_FRAGMENT"

  }
}
