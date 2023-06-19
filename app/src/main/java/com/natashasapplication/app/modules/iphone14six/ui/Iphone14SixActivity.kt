package com.natashasapplication.app.modules.iphone14six.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixBinding
import com.natashasapplication.app.modules.iphone14six.`data`.viewmodel.Iphone14SixVM
import kotlin.String
import kotlin.Unit

class Iphone14SixActivity :
    BaseActivity<ActivityIphone14SixBinding>(R.layout.activity_iphone_14_six) {
  private val viewModel: Iphone14SixVM by viewModels<Iphone14SixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
