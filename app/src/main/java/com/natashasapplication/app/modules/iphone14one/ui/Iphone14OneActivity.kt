package com.natashasapplication.app.modules.iphone14one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14OneBinding
import com.natashasapplication.app.modules.iphone14one.`data`.viewmodel.Iphone14OneVM
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14OneActivity :
    BaseActivity<ActivityIphone14OneBinding>(R.layout.activity_iphone_14_one) {
  private val viewModel: Iphone14OneVM by viewModels<Iphone14OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14OneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imagePolygonOne.setOnClickListener {
        val destIntent = Iphone14TwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtGetStarted.setOnClickListener {
        val destIntent = Iphone14TwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.viewRectangleFive.setOnClickListener {
        val destIntent = Iphone14TwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "IPHONE14ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone14OneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
