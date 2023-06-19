package com.natashasapplication.app.modules.iphone14fiftyseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiftysevenBinding
import com.natashasapplication.app.modules.iphone14fiftyseven.`data`.viewmodel.Iphone14FiftysevenVM
import kotlin.String
import kotlin.Unit

class Iphone14FiftysevenActivity :
    BaseActivity<ActivityIphone14FiftysevenBinding>(R.layout.activity_iphone_14_fiftyseven) {
  private val viewModel: Iphone14FiftysevenVM by viewModels<Iphone14FiftysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiftysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYSEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiftysevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
