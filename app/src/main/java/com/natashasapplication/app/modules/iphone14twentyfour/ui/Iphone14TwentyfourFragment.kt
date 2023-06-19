package com.natashasapplication.app.modules.iphone14twentyfour.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentyfourBinding
import com.natashasapplication.app.modules.iphone14twentyfour.`data`.viewmodel.Iphone14TwentyfourVM
import kotlin.String
import kotlin.Unit

class Iphone14TwentyfourFragment :
    BaseFragment<FragmentIphone14TwentyfourBinding>(R.layout.fragment_iphone_14_twentyfour) {
  private val viewModel: Iphone14TwentyfourVM by viewModels<Iphone14TwentyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14TwentyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTYFOUR_FRAGMENT"

  }
}
