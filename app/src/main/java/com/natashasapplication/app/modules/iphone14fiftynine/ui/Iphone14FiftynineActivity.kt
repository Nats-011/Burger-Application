package com.natashasapplication.app.modules.iphone14fiftynine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FiftynineBinding
import com.natashasapplication.app.modules.iphone14fiftynine.`data`.viewmodel.Iphone14FiftynineVM
import com.natashasapplication.app.modules.iphone14sixty.ui.Iphone14SixtyActivity
import kotlin.String
import kotlin.Unit

class Iphone14FiftynineActivity :
    BaseActivity<ActivityIphone14FiftynineBinding>(R.layout.activity_iphone_14_fiftynine) {
  private val viewModel: Iphone14FiftynineVM by viewModels<Iphone14FiftynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FiftynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameIPhone14Fif.setOnClickListener {
      val destIntent = Iphone14SixtyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FIFTYNINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FiftynineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
