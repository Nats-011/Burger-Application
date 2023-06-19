package com.natashasapplication.app.modules.iphone14thirtyfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThirtyfiveBinding
import com.natashasapplication.app.modules.iphone14thirtyfive.`data`.viewmodel.Iphone14ThirtyfiveVM
import com.natashasapplication.app.modules.iphone14thirtysix.ui.Iphone14ThirtysixActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14ThirtyfiveActivity :
    BaseActivity<ActivityIphone14ThirtyfiveBinding>(R.layout.activity_iphone_14_thirtyfive) {
  private val viewModel: Iphone14ThirtyfiveVM by viewModels<Iphone14ThirtyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThirtyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14THIRTYFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThirtyfiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
