package com.natashasapplication.app.modules.iphone14seventysix.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventysixBinding
import com.natashasapplication.app.modules.iphone14seventysix.`data`.viewmodel.Iphone14SeventysixVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventysixFragment :
    BaseFragment<FragmentIphone14SeventysixBinding>(R.layout.fragment_iphone_14_seventysix) {
  private val viewModel: Iphone14SeventysixVM by viewModels<Iphone14SeventysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYSIX_FRAGMENT"

  }
}
