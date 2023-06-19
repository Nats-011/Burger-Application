package com.natashasapplication.app.modules.iphone14eightythree.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14EightythreeBinding
import com.natashasapplication.app.modules.iphone14eightythree.`data`.viewmodel.Iphone14EightythreeVM
import kotlin.String
import kotlin.Unit

class Iphone14EightythreeFragment :
    BaseFragment<FragmentIphone14EightythreeBinding>(R.layout.fragment_iphone_14_eightythree) {
  private val viewModel: Iphone14EightythreeVM by viewModels<Iphone14EightythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14EightythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14EIGHTYTHREE_FRAGMENT"

  }
}
