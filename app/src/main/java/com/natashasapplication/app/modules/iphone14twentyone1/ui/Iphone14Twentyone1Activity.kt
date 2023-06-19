package com.natashasapplication.app.modules.iphone14twentyone1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14Twentyone1Binding
import com.natashasapplication.app.modules.iphone14twentyone1.`data`.viewmodel.Iphone14Twentyone1VM
import kotlin.String
import kotlin.Unit

class Iphone14Twentyone1Activity :
    BaseActivity<ActivityIphone14Twentyone1Binding>(R.layout.activity_iphone_14_twentyone1) {
  private val viewModel: Iphone14Twentyone1VM by viewModels<Iphone14Twentyone1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14Twentyone1VM = viewModel
    val adapter = Iphone14Twentyone1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup2,binding.viewPagerViewpager) { tab, position ->
      tab.text = Iphone14Twentyone1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "IPHONE14TWENTYONE1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone14Twentyone1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
