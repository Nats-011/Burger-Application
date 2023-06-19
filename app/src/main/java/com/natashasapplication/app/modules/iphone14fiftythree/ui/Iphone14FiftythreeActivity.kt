package com.natashasapplication.app.modules.iphone14fiftythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiftythreeBinding
import com.natashasapplication.app.modules.iphone14fiftythree.`data`.viewmodel.Iphone14FiftythreeVM
import com.natashasapplication.app.modules.iphone14thirtyfive.ui.Iphone14ThirtyfiveActivity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FiftythreeActivity :
    BaseActivity<ActivityIphone14FiftythreeBinding>(R.layout.activity_iphone_14_fiftythree) {
  private val viewModel: Iphone14FiftythreeVM by viewModels<Iphone14FiftythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiftythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHeart.setOnClickListener {
      val destIntent = Iphone14ThirtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiftythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
