package com.natashasapplication.app.modules.iphone14thirtyseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThirtysevenBinding
import com.natashasapplication.app.modules.iphone14thirtyseven.`data`.viewmodel.Iphone14ThirtysevenVM
import com.natashasapplication.app.modules.iphone14thirtysix.ui.Iphone14ThirtysixActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14ThirtysevenActivity :
    BaseActivity<ActivityIphone14ThirtysevenBinding>(R.layout.activity_iphone_14_thirtyseven) {
  private val viewModel: Iphone14ThirtysevenVM by viewModels<Iphone14ThirtysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThirtysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtysixActivity.getIntent(this, null)
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
    const val TAG: String = "IPHONE14THIRTYSEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThirtysevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
