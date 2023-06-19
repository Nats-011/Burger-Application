package com.natashasapplication.app.modules.iphone14seventyfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SeventyfourBinding
import com.natashasapplication.app.modules.iphone14seventyfour.`data`.viewmodel.Iphone14SeventyfourVM
import kotlin.String
import kotlin.Unit

class Iphone14SeventyfourActivity :
    BaseActivity<ActivityIphone14SeventyfourBinding>(R.layout.activity_iphone_14_seventyfour) {
  private val viewModel: Iphone14SeventyfourVM by viewModels<Iphone14SeventyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SeventyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SeventyfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
