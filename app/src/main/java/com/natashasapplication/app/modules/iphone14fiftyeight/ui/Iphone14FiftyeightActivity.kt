package com.natashasapplication.app.modules.iphone14fiftyeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiftyeightBinding
import com.natashasapplication.app.modules.iphone14fiftyeight.`data`.viewmodel.Iphone14FiftyeightVM
import com.natashasapplication.app.modules.iphone14fiftyseven.ui.Iphone14FiftysevenActivity
import kotlin.String
import kotlin.Unit

class Iphone14FiftyeightActivity :
    BaseActivity<ActivityIphone14FiftyeightBinding>(R.layout.activity_iphone_14_fiftyeight) {
  private val viewModel: Iphone14FiftyeightVM by viewModels<Iphone14FiftyeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiftyeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameIPhone14Fif.setOnClickListener {
      val destIntent = Iphone14FiftysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYEIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiftyeightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
