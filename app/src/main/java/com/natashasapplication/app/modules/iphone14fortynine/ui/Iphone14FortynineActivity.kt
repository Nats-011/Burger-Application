package com.natashasapplication.app.modules.iphone14fortynine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FortynineBinding
import com.natashasapplication.app.modules.iphone14fortynine.`data`.viewmodel.Iphone14FortynineVM
import com.natashasapplication.app.modules.iphone14thirtyfive.ui.Iphone14ThirtyfiveActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FortynineActivity :
    BaseActivity<ActivityIphone14FortynineBinding>(R.layout.activity_iphone_14_fortynine) {
  private val viewModel: Iphone14FortynineVM by viewModels<Iphone14FortynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FortynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.lineLineTwelve.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
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
    const val TAG: String = "IPHONE14FORTYNINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FortynineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
