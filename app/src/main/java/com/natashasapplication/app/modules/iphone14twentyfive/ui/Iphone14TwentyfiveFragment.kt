package com.natashasapplication.app.modules.iphone14twentyfive.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentyfiveBinding
import com.natashasapplication.app.modules.iphone14twentyfive.`data`.viewmodel.Iphone14TwentyfiveVM
import kotlin.String
import kotlin.Unit

class Iphone14TwentyfiveFragment :
    BaseFragment<FragmentIphone14TwentyfiveBinding>(R.layout.fragment_iphone_14_twentyfive) {
  private val viewModel: Iphone14TwentyfiveVM by viewModels<Iphone14TwentyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14TwentyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTYFIVE_FRAGMENT"

  }
}
