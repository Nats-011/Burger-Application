package com.natashasapplication.app.modules.iphone14fiftytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiftytwoBinding
import com.natashasapplication.app.modules.iphone14fiftytwo.`data`.viewmodel.Iphone14FiftytwoVM
import com.natashasapplication.app.modules.iphone14thirtyfive.ui.Iphone14ThirtyfiveActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FiftytwoActivity :
    BaseActivity<ActivityIphone14FiftytwoBinding>(R.layout.activity_iphone_14_fiftytwo) {
  private val viewModel: Iphone14FiftytwoVM by viewModels<Iphone14FiftytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiftytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiftytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
