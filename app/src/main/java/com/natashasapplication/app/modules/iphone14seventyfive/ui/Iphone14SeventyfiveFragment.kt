package com.natashasapplication.app.modules.iphone14seventyfive.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventyfiveBinding
import com.natashasapplication.app.modules.iphone14seventyfive.`data`.viewmodel.Iphone14SeventyfiveVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventyfiveFragment :
    BaseFragment<FragmentIphone14SeventyfiveBinding>(R.layout.fragment_iphone_14_seventyfive) {
  private val viewModel: Iphone14SeventyfiveVM by viewModels<Iphone14SeventyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYFIVE_FRAGMENT"

  }
}
