package com.natashasapplication.app.modules.iphone14four.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14FourBinding
import com.natashasapplication.app.modules.iphone14fiftyseven.ui.Iphone14FiftysevenActivity
import com.natashasapplication.app.modules.iphone14five.ui.Iphone14FiveActivity
import com.natashasapplication.app.modules.iphone14four.`data`.viewmodel.Iphone14FourVM
import com.natashasapplication.app.modules.iphone14nine.ui.Iphone14NineActivity
import com.natashasapplication.app.modules.iphone14seven.ui.Iphone14SevenActivity
import com.natashasapplication.app.modules.iphone14six.ui.Iphone14SixActivity
import com.natashasapplication.app.modules.iphone14sixtyfour.ui.Iphone14SixtyfourActivity
import com.natashasapplication.app.modules.iphone14sixtythree.ui.Iphone14SixtythreeActivity
import com.natashasapplication.app.modules.iphone14thirtytwo.ui.Iphone14ThirtytwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14FourActivity :
    BaseActivity<ActivityIphone14FourBinding>(R.layout.activity_iphone_14_four) {
  private val viewModel: Iphone14FourVM by viewModels<Iphone14FourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14FourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAddressBook.setOnClickListener {
      val destIntent = Iphone14SixtythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImages1remo.setOnClickListener {
      val destIntent = Iphone14SevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtStudentDiscoun.setOnClickListener {
      val destIntent = Iphone14FiftysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtViewActivity.setOnClickListener {
      val destIntent = Iphone14NineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLanguage.setOnClickListener {
      val destIntent = Iphone14ThirtytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSendFeedback.setOnClickListener {
      val destIntent = Iphone14SixtyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLikes.setOnClickListener {
      val destIntent = Iphone14FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCarbonsettings.setOnClickListener {
      val destIntent = Iphone14SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSettings.setOnClickListener {
      val destIntent = Iphone14SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncarbonsettings.setOnClickListener {
      val destIntent = Iphone14SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvector.setOnClickListener {
      val destIntent = Iphone14FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStack.setOnClickListener {
      val destIntent = Iphone14SevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14FourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
