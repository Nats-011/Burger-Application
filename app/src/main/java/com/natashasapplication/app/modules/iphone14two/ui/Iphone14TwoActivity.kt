package com.natashasapplication.app.modules.iphone14two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14TwoBinding
import com.natashasapplication.app.modules.iphone14four.ui.Iphone14FourActivity
import com.natashasapplication.app.modules.iphone14three.ui.Iphone14ThreeActivity
import com.natashasapplication.app.modules.iphone14two.`data`.viewmodel.Iphone14TwoVM
import kotlin.String
import kotlin.Unit

class Iphone14TwoActivity :
    BaseActivity<ActivityIphone14TwoBinding>(R.layout.activity_iphone_14_two) {
  private val viewModel: Iphone14TwoVM by viewModels<Iphone14TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14TwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroup727.setOnClickListener {
      val destIntent = Iphone14FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearchOne.setOnClickListener {
      val destIntent = Iphone14ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSEARCH.setOnClickListener {
      val destIntent = Iphone14ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
