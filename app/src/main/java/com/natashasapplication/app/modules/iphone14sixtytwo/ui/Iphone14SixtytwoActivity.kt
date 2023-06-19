package com.natashasapplication.app.modules.iphone14sixtytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtytwoBinding
import com.natashasapplication.app.modules.iphone14fiftyeight.ui.Iphone14FiftyeightActivity
import com.natashasapplication.app.modules.iphone14sixtytwo.`data`.viewmodel.Iphone14SixtytwoVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtytwoActivity :
    BaseActivity<ActivityIphone14SixtytwoBinding>(R.layout.activity_iphone_14_sixtytwo) {
  private val viewModel: Iphone14SixtytwoVM by viewModels<Iphone14SixtytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameIPhone14Six.setOnClickListener {
      val destIntent = Iphone14FiftyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
