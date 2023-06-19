package com.natashasapplication.app.modules.iphone14sixtyfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtyfiveBinding
import com.natashasapplication.app.modules.iphone14sixtyfive.`data`.viewmodel.Iphone14SixtyfiveVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtyfiveActivity :
    BaseActivity<ActivityIphone14SixtyfiveBinding>(R.layout.activity_iphone_14_sixtyfive) {
  private val viewModel: Iphone14SixtyfiveVM by viewModels<Iphone14SixtyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtyfiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
