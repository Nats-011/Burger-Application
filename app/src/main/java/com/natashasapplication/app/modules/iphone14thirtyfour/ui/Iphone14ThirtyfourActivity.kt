package com.natashasapplication.app.modules.iphone14thirtyfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThirtyfourBinding
import com.natashasapplication.app.modules.iphone14thirtyfour.`data`.viewmodel.Iphone14ThirtyfourVM
import kotlin.String
import kotlin.Unit

class Iphone14ThirtyfourActivity :
    BaseActivity<ActivityIphone14ThirtyfourBinding>(R.layout.activity_iphone_14_thirtyfour) {
  private val viewModel: Iphone14ThirtyfourVM by viewModels<Iphone14ThirtyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThirtyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14THIRTYFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThirtyfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
