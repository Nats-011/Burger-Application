package com.natashasapplication.app.modules.iphone14seven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SevenBinding
import com.natashasapplication.app.modules.iphone14seven.`data`.viewmodel.Iphone14SevenVM
import kotlin.String
import kotlin.Unit

class Iphone14SevenActivity :
    BaseActivity<ActivityIphone14SevenBinding>(R.layout.activity_iphone_14_seven) {
  private val viewModel: Iphone14SevenVM by viewModels<Iphone14SevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
