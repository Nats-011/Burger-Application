package com.natashasapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityAppNavigationBinding
import com.natashasapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.natashasapplication.app.modules.iphone14fifty.ui.Iphone14FiftyActivity
import com.natashasapplication.app.modules.iphone14fiftyeight.ui.Iphone14FiftyeightActivity
import com.natashasapplication.app.modules.iphone14fiftynine.ui.Iphone14FiftynineActivity
import com.natashasapplication.app.modules.iphone14fiftyone.ui.Iphone14FiftyoneActivity
import com.natashasapplication.app.modules.iphone14fiftyseven.ui.Iphone14FiftysevenActivity
import com.natashasapplication.app.modules.iphone14fiftythree.ui.Iphone14FiftythreeActivity
import com.natashasapplication.app.modules.iphone14fiftytwo.ui.Iphone14FiftytwoActivity
import com.natashasapplication.app.modules.iphone14five.ui.Iphone14FiveActivity
import com.natashasapplication.app.modules.iphone14forty.ui.Iphone14FortyActivity
import com.natashasapplication.app.modules.iphone14fortyeight.ui.Iphone14FortyeightActivity
import com.natashasapplication.app.modules.iphone14fortyfive.ui.Iphone14FortyfiveActivity
import com.natashasapplication.app.modules.iphone14fortyfour.ui.Iphone14FortyfourActivity
import com.natashasapplication.app.modules.iphone14fortynine.ui.Iphone14FortynineActivity
import com.natashasapplication.app.modules.iphone14fortyone.ui.Iphone14FortyoneActivity
import com.natashasapplication.app.modules.iphone14fortyseven.ui.Iphone14FortysevenActivity
import com.natashasapplication.app.modules.iphone14fortysix.ui.Iphone14FortysixActivity
import com.natashasapplication.app.modules.iphone14fortythree.ui.Iphone14FortythreeActivity
import com.natashasapplication.app.modules.iphone14fortytwo.ui.Iphone14FortytwoActivity
import com.natashasapplication.app.modules.iphone14four.ui.Iphone14FourActivity
import com.natashasapplication.app.modules.iphone14nine.ui.Iphone14NineActivity
import com.natashasapplication.app.modules.iphone14one.ui.Iphone14OneActivity
import com.natashasapplication.app.modules.iphone14seven.ui.Iphone14SevenActivity
import com.natashasapplication.app.modules.iphone14seventyfour.ui.Iphone14SeventyfourActivity
import com.natashasapplication.app.modules.iphone14seventyone.ui.Iphone14SeventyoneActivity
import com.natashasapplication.app.modules.iphone14seventythree.ui.Iphone14SeventythreeActivity
import com.natashasapplication.app.modules.iphone14seventytwo.ui.Iphone14SeventytwoBottomsheet
import com.natashasapplication.app.modules.iphone14six.ui.Iphone14SixActivity
import com.natashasapplication.app.modules.iphone14sixty.ui.Iphone14SixtyActivity
import com.natashasapplication.app.modules.iphone14sixtyeight.ui.Iphone14SixtyeightActivity
import com.natashasapplication.app.modules.iphone14sixtyfive.ui.Iphone14SixtyfiveActivity
import com.natashasapplication.app.modules.iphone14sixtyfour.ui.Iphone14SixtyfourActivity
import com.natashasapplication.app.modules.iphone14sixtynine.ui.Iphone14SixtynineActivity
import com.natashasapplication.app.modules.iphone14sixtyone.ui.Iphone14SixtyoneActivity
import com.natashasapplication.app.modules.iphone14sixtyseven.ui.Iphone14SixtysevenActivity
import com.natashasapplication.app.modules.iphone14sixtysix.ui.Iphone14SixtysixActivity
import com.natashasapplication.app.modules.iphone14sixtythree.ui.Iphone14SixtythreeActivity
import com.natashasapplication.app.modules.iphone14sixtytwo.ui.Iphone14SixtytwoActivity
import com.natashasapplication.app.modules.iphone14thirtyfive.ui.Iphone14ThirtyfiveActivity
import com.natashasapplication.app.modules.iphone14thirtyfour.ui.Iphone14ThirtyfourActivity
import com.natashasapplication.app.modules.iphone14thirtynine.ui.Iphone14ThirtynineActivity
import com.natashasapplication.app.modules.iphone14thirtyseven.ui.Iphone14ThirtysevenActivity
import com.natashasapplication.app.modules.iphone14thirtysix.ui.Iphone14ThirtysixActivity
import com.natashasapplication.app.modules.iphone14thirtythree.ui.Iphone14ThirtythreeActivity
import com.natashasapplication.app.modules.iphone14thirtytwo.ui.Iphone14ThirtytwoActivity
import com.natashasapplication.app.modules.iphone14three.ui.Iphone14ThreeActivity
import com.natashasapplication.app.modules.iphone14twelve.ui.Iphone14TwelveActivity
import com.natashasapplication.app.modules.iphone14twentyone1.ui.Iphone14Twentyone1Activity
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone14Sixty.setOnClickListener {
      val destIntent = Iphone14SixtyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftyNine.setOnClickListener {
      val destIntent = Iphone14FiftynineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SeventyTwo.setOnClickListener {
      val destFragment = Iphone14SeventytwoBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, Iphone14SeventytwoBottomsheet.TAG)
    }
    binding.linearIPhone14ThirtyFive.setOnClickListener {
      val destIntent = Iphone14ThirtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtyTwo.setOnClickListener {
      val destIntent = Iphone14ThirtytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyFive.setOnClickListener {
      val destIntent = Iphone14FortyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14TwentyOne.setOnClickListener {
      val destIntent = Iphone14Twentyone1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyThree.setOnClickListener {
      val destIntent = Iphone14FortythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftySeven.setOnClickListener {
      val destIntent = Iphone14FiftysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtySeven.setOnClickListener {
      val destIntent = Iphone14SixtysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtyNine.setOnClickListener {
      val destIntent = Iphone14ThirtynineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Seven.setOnClickListener {
      val destIntent = Iphone14SevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyFour.setOnClickListener {
      val destIntent = Iphone14SixtyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyNine.setOnClickListener {
      val destIntent = Iphone14FortynineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Twelve.setOnClickListener {
      val destIntent = Iphone14TwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14One.setOnClickListener {
      val destIntent = Iphone14OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyNine.setOnClickListener {
      val destIntent = Iphone14SixtynineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SeventyOne.setOnClickListener {
      val destIntent = Iphone14SeventyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyFive.setOnClickListener {
      val destIntent = Iphone14SixtyfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Fifty.setOnClickListener {
      val destIntent = Iphone14FiftyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyEight.setOnClickListener {
      val destIntent = Iphone14FortyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyTwo.setOnClickListener {
      val destIntent = Iphone14SixtytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyEight.setOnClickListener {
      val destIntent = Iphone14SixtyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortySix.setOnClickListener {
      val destIntent = Iphone14FortysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SeventyThree.setOnClickListener {
      val destIntent = Iphone14SeventythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Six.setOnClickListener {
      val destIntent = Iphone14SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftyOne.setOnClickListener {
      val destIntent = Iphone14FiftyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftyThree.setOnClickListener {
      val destIntent = Iphone14FiftythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyFour.setOnClickListener {
      val destIntent = Iphone14FortyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtySix.setOnClickListener {
      val destIntent = Iphone14SixtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftyTwo.setOnClickListener {
      val destIntent = Iphone14FiftytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Three.setOnClickListener {
      val destIntent = Iphone14ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyThree.setOnClickListener {
      val destIntent = Iphone14SixtythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SeventyFour.setOnClickListener {
      val destIntent = Iphone14SeventyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Nine.setOnClickListener {
      val destIntent = Iphone14NineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Forty.setOnClickListener {
      val destIntent = Iphone14FortyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Four.setOnClickListener {
      val destIntent = Iphone14FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyTwo.setOnClickListener {
      val destIntent = Iphone14FortytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtySeven.setOnClickListener {
      val destIntent = Iphone14ThirtysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtyThree.setOnClickListener {
      val destIntent = Iphone14ThirtythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Two.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14SixtyOne.setOnClickListener {
      val destIntent = Iphone14SixtyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortyOne.setOnClickListener {
      val destIntent = Iphone14FortyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14Five.setOnClickListener {
      val destIntent = Iphone14FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtySix.setOnClickListener {
      val destIntent = Iphone14ThirtysixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FiftyEight.setOnClickListener {
      val destIntent = Iphone14FiftyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14FortySeven.setOnClickListener {
      val destIntent = Iphone14FortysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone14ThirtyFour.setOnClickListener {
      val destIntent = Iphone14ThirtyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
