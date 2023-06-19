package com.natashasapplication.app.modules.iphone14seventytwo.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.natashasapplication.app.databinding.BottomsheetIphone14SeventytwoBinding
import com.natashasapplication.app.modules.iphone14seventytwo.`data`.viewmodel.Iphone14SeventytwoVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventytwoBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetIphone14SeventytwoBinding>(R.layout.bottomsheet_iphone_14_seventytwo)
    {
  private val viewModel: Iphone14SeventytwoVM by viewModels<Iphone14SeventytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.iphone14SeventytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYTWO_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): Iphone14SeventytwoBottomsheet {
      val fragment = Iphone14SeventytwoBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
