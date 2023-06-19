package com.natashasapplication.app.modules.iphone14sixtynine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtynineBinding
import com.natashasapplication.app.modules.iphone14sixtynine.`data`.viewmodel.Iphone14SixtynineVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtynineActivity :
    BaseActivity<ActivityIphone14SixtynineBinding>(R.layout.activity_iphone_14_sixtynine) {
  private val viewModel: Iphone14SixtynineVM by viewModels<Iphone14SixtynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYNINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtynineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
