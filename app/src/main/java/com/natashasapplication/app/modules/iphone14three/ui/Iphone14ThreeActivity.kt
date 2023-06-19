package com.natashasapplication.app.modules.iphone14three.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseActivity
import com.natashasapplication.app.databinding.ActivityIphone14ThreeBinding
import com.natashasapplication.app.modules.iphone14three.`data`.model.ListrectanglefifteenRowModel
import com.natashasapplication.app.modules.iphone14three.`data`.viewmodel.Iphone14ThreeVM
import com.natashasapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ThreeActivity :
    BaseActivity<ActivityIphone14ThreeBinding>(R.layout.activity_iphone_14_three) {
  private val viewModel: Iphone14ThreeVM by viewModels<Iphone14ThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefifteenAdapter =
    ListrectanglefifteenAdapter(viewModel.listrectanglefifteenList.value?:mutableListOf())
    binding.recyclerListrectanglefifteen.adapter = listrectanglefifteenAdapter
    listrectanglefifteenAdapter.setOnItemClickListener(
    object : ListrectanglefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglefifteenRowModel) {
        onClickRecyclerListrectanglefifteen(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenList.observe(this) {
      listrectanglefifteenAdapter.updateData(it)
    }
    binding.iphone14ThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListrectanglefifteen(
    view: View,
    position: Int,
    item: ListrectanglefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
