package com.natashasapplication.app.modules.iphone14sixtysix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtysixBinding
import com.natashasapplication.app.modules.iphone14sixtysix.`data`.viewmodel.Iphone14SixtysixVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtysixActivity :
    BaseActivity<ActivityIphone14SixtysixBinding>(R.layout.activity_iphone_14_sixtysix) {
  private val viewModel: Iphone14SixtysixVM by viewModels<Iphone14SixtysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYSIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtysixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
