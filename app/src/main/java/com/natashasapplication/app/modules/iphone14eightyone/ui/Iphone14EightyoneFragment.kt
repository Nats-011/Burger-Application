package com.natashasapplication.app.modules.iphone14eightyone.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14EightyoneBinding
import com.natashasapplication.app.modules.iphone14eightyone.`data`.viewmodel.Iphone14EightyoneVM
import kotlin.String
import kotlin.Unit

class Iphone14EightyoneFragment :
    BaseFragment<FragmentIphone14EightyoneBinding>(R.layout.fragment_iphone_14_eightyone) {
  private val viewModel: Iphone14EightyoneVM by viewModels<Iphone14EightyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14EightyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14EIGHTYONE_FRAGMENT"

  }
}
