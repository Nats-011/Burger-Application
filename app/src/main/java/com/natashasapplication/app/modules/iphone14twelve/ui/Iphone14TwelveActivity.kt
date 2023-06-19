package com.natashasapplication.app.modules.iphone14twelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14TwelveBinding
import com.natashasapplication.app.modules.iphone14twelve.`data`.viewmodel.Iphone14TwelveVM
import kotlin.String
import kotlin.Unit

class Iphone14TwelveActivity :
    BaseActivity<ActivityIphone14TwelveBinding>(R.layout.activity_iphone_14_twelve) {
  private val viewModel: Iphone14TwelveVM by viewModels<Iphone14TwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14TwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14TwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
