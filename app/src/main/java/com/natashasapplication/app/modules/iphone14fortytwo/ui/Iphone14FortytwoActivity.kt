package com.natashasapplication.app.modules.iphone14fortytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FortytwoBinding
import com.natashasapplication.app.modules.iphone14fortytwo.`data`.viewmodel.Iphone14FortytwoVM
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FortytwoActivity :
    BaseActivity<ActivityIphone14FortytwoBinding>(R.layout.activity_iphone_14_fortytwo) {
  private val viewModel: Iphone14FortytwoVM by viewModels<Iphone14FortytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FortytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FORTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FortytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
