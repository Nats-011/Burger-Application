package com.natashasapplication.app.modules.iphone14sixtyseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtysevenBinding
import com.natashasapplication.app.modules.iphone14seventytwo.ui.Iphone14SeventytwoBottomsheet
import com.natashasapplication.app.modules.iphone14sixtyeight.ui.Iphone14SixtyeightActivity
import com.natashasapplication.app.modules.iphone14sixtyseven.`data`.viewmodel.Iphone14SixtysevenVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtysevenActivity :
    BaseActivity<ActivityIphone14SixtysevenBinding>(R.layout.activity_iphone_14_sixtyseven) {
  private val viewModel: Iphone14SixtysevenVM by viewModels<Iphone14SixtysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtAddDeliveryIn.setOnClickListener {
      val destFragment = Iphone14SeventytwoBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, Iphone14SeventytwoBottomsheet.TAG)
    }
    binding.txtLanguageTwo.setOnClickListener {
      val destIntent = Iphone14SixtyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYSEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtysevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
