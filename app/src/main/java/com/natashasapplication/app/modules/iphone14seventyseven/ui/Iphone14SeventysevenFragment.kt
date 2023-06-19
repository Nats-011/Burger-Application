package com.natashasapplication.app.modules.iphone14seventyseven.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventysevenBinding
import com.natashasapplication.app.modules.iphone14seventyseven.`data`.viewmodel.Iphone14SeventysevenVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventysevenFragment :
    BaseFragment<FragmentIphone14SeventysevenBinding>(R.layout.fragment_iphone_14_seventyseven) {
  private val viewModel: Iphone14SeventysevenVM by viewModels<Iphone14SeventysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYSEVEN_FRAGMENT"

  }
}
