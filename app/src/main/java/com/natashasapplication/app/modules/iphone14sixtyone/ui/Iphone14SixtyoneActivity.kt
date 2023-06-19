package com.natashasapplication.app.modules.iphone14sixtyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtyoneBinding
import com.natashasapplication.app.modules.iphone14sixtyone.`data`.viewmodel.Iphone14SixtyoneVM
import com.natashasapplication.app.modules.iphone14sixtytwo.ui.Iphone14SixtytwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14SixtyoneActivity :
    BaseActivity<ActivityIphone14SixtyoneBinding>(R.layout.activity_iphone_14_sixtyone) {
  private val viewModel: Iphone14SixtyoneVM by viewModels<Iphone14SixtyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameIPhone14Six.setOnClickListener {
      val destIntent = Iphone14SixtytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtyoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
