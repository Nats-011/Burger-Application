package com.natashasapplication.app.modules.iphone14seventynine.ui

import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventynineBinding
import com.natashasapplication.app.modules.iphone14seventynine.`data`.viewmodel.Iphone14SeventynineVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventynineFragment :
    BaseFragment<FragmentIphone14SeventynineBinding>(R.layout.fragment_iphone_14_seventynine) {
  private val viewModel: Iphone14SeventynineVM by viewModels<Iphone14SeventynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYNINE_FRAGMENT"

  }
}
