package com.natashasapplication.app.modules.iphone14sixtythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14SixtythreeBinding
import com.natashasapplication.app.modules.iphone14sixtysix.ui.Iphone14SixtysixActivity
import com.natashasapplication.app.modules.iphone14sixtythree.`data`.viewmodel.Iphone14SixtythreeVM
import kotlin.String
import kotlin.Unit

class Iphone14SixtythreeActivity :
    BaseActivity<ActivityIphone14SixtythreeBinding>(R.layout.activity_iphone_14_sixtythree) {
  private val viewModel: Iphone14SixtythreeVM by viewModels<Iphone14SixtythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14SixtythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtAddAddress.setOnClickListener {
      val destIntent = Iphone14SixtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePlusMath.setOnClickListener {
      val destIntent = Iphone14SixtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SIXTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14SixtythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
