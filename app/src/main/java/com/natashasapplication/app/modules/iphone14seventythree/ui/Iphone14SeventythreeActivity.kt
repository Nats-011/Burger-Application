package com.natashasapplication.app.modules.iphone14seventythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SeventythreeBinding
import com.natashasapplication.app.modules.iphone14seventythree.`data`.viewmodel.Iphone14SeventythreeVM
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14SeventythreeActivity :
    BaseActivity<ActivityIphone14SeventythreeBinding>(R.layout.activity_iphone_14_seventythree) {
  private val viewModel: Iphone14SeventythreeVM by viewModels<Iphone14SeventythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SeventythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.lineLineOne.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SeventythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
