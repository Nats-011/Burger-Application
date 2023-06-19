package com.natashasapplication.app.modules.iphone14fortyfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FortyfiveBinding
import com.natashasapplication.app.modules.iphone14fortyfive.`data`.viewmodel.Iphone14FortyfiveVM
import com.natashasapplication.app.modules.iphone14thirtyfive.ui.Iphone14ThirtyfiveActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FortyfiveActivity :
    BaseActivity<ActivityIphone14FortyfiveBinding>(R.layout.activity_iphone_14_fortyfive) {
  private val viewModel: Iphone14FortyfiveVM by viewModels<Iphone14FortyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FortyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FORTYFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FortyfiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
