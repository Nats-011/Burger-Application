package com.natashasapplication.app.modules.iphone14sixty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtyBinding
import com.natashasapplication.app.modules.iphone14sixty.`data`.viewmodel.Iphone14SixtyVM
import com.natashasapplication.app.modules.iphone14sixtyone.ui.Iphone14SixtyoneActivity
import kotlin.String
import kotlin.Unit

class Iphone14SixtyActivity :
    BaseActivity<ActivityIphone14SixtyBinding>(R.layout.activity_iphone_14_sixty) {
  private val viewModel: Iphone14SixtyVM by viewModels<Iphone14SixtyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameIPhone14Six.setOnClickListener {
      val destIntent = Iphone14SixtyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
