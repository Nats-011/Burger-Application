package com.natashasapplication.app.modules.iphone14sixtyeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtyeightBinding
import com.natashasapplication.app.modules.iphone14sixtyeight.`data`.viewmodel.Iphone14SixtyeightVM
import com.natashasapplication.app.modules.iphone14sixtynine.ui.Iphone14SixtynineActivity
import kotlin.String
import kotlin.Unit

class Iphone14SixtyeightActivity :
    BaseActivity<ActivityIphone14SixtyeightBinding>(R.layout.activity_iphone_14_sixtyeight) {
  private val viewModel: Iphone14SixtyeightVM by viewModels<Iphone14SixtyeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtyeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtYes.setOnClickListener {
      val destIntent = Iphone14SixtynineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYEIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtyeightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
