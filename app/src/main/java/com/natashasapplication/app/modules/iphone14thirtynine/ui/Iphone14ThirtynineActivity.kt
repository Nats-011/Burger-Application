package com.natashasapplication.app.modules.iphone14thirtynine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThirtynineBinding
import com.natashasapplication.app.modules.iphone14thirtynine.`data`.viewmodel.Iphone14ThirtynineVM
import com.natashasapplication.app.modules.iphone14thirtysix.ui.Iphone14ThirtysixActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14ThirtynineActivity :
    BaseActivity<ActivityIphone14ThirtynineBinding>(R.layout.activity_iphone_14_thirtynine) {
  private val viewModel: Iphone14ThirtynineVM by viewModels<Iphone14ThirtynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThirtynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14THIRTYNINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThirtynineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
