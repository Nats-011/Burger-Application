package com.natashasapplication.app.modules.iphone14five.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiveBinding
import com.natashasapplication.app.modules.iphone14five.`data`.viewmodel.Iphone14FiveVM
import com.natashasapplication.app.modules.iphone14three.ui.Iphone14ThreeActivity
import kotlin.String
import kotlin.Unit

class Iphone14FiveActivity :
    BaseActivity<ActivityIphone14FiveBinding>(R.layout.activity_iphone_14_five) {
  private val viewModel: Iphone14FiveVM by viewModels<Iphone14FiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAddburgers.setOnClickListener {
      val destIntent = Iphone14ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
