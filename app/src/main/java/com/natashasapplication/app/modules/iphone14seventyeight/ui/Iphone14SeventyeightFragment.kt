package com.natashasapplication.app.modules.iphone14seventyeight.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventyeightBinding
import com.natashasapplication.app.modules.iphone14seventyeight.`data`.viewmodel.Iphone14SeventyeightVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventyeightFragment :
    BaseFragment<FragmentIphone14SeventyeightBinding>(R.layout.fragment_iphone_14_seventyeight) {
  private val viewModel: Iphone14SeventyeightVM by viewModels<Iphone14SeventyeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventyeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYEIGHT_FRAGMENT"

  }
}
