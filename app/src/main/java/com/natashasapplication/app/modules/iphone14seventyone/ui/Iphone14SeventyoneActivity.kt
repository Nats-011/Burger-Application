package com.natashasapplication.app.modules.iphone14seventyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SeventyoneBinding
import com.natashasapplication.app.modules.iphone14seventyone.`data`.viewmodel.Iphone14SeventyoneVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventyoneActivity :
    BaseActivity<ActivityIphone14SeventyoneBinding>(R.layout.activity_iphone_14_seventyone) {
  private val viewModel: Iphone14SeventyoneVM by viewModels<Iphone14SeventyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SeventyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SeventyoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
