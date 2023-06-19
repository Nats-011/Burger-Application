package com.natashasapplication.app.modules.iphone14eighty.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14EightyBinding
import com.natashasapplication.app.modules.iphone14eighty.`data`.viewmodel.Iphone14EightyVM
import kotlin.String
import kotlin.Unit

class Iphone14EightyFragment :
    BaseFragment<FragmentIphone14EightyBinding>(R.layout.fragment_iphone_14_eighty) {
  private val viewModel: Iphone14EightyVM by viewModels<Iphone14EightyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14EightyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14EIGHTY_FRAGMENT"

  }
}
