package com.natashasapplication.app.modules.iphone14nine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14NineBinding
import com.natashasapplication.app.modules.iphone14nine.`data`.viewmodel.Iphone14NineVM
import kotlin.String
import kotlin.Unit

class Iphone14NineActivity :
    BaseActivity<ActivityIphone14NineBinding>(R.layout.activity_iphone_14_nine) {
  private val viewModel: Iphone14NineVM by viewModels<Iphone14NineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14NineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14NineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
