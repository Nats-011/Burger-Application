package com.natashasapplication.app.modules.iphone14thirtythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThirtythreeBinding
import com.natashasapplication.app.modules.iphone14thirtythree.`data`.viewmodel.Iphone14ThirtythreeVM
import kotlin.String
import kotlin.Unit

class Iphone14ThirtythreeActivity :
    BaseActivity<ActivityIphone14ThirtythreeBinding>(R.layout.activity_iphone_14_thirtythree) {
  private val viewModel: Iphone14ThirtythreeVM by viewModels<Iphone14ThirtythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThirtythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14THIRTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThirtythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
