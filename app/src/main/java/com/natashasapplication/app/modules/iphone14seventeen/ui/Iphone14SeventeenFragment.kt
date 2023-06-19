package com.natashasapplication.app.modules.iphone14seventeen.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14SeventeenBinding
import com.natashasapplication.app.modules.iphone14seventeen.`data`.model.ListbestsellerRowModel
import com.natashasapplication.app.modules.iphone14seventeen.`data`.viewmodel.Iphone14SeventeenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14SeventeenFragment :
    BaseFragment<FragmentIphone14SeventeenBinding>(R.layout.fragment_iphone_14_seventeen) {
  private val viewModel: Iphone14SeventeenVM by viewModels<Iphone14SeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbestsellerAdapter =
    ListbestsellerAdapter(viewModel.listbestsellerList.value?:mutableListOf())
    binding.recyclerListbestseller.adapter = listbestsellerAdapter
    listbestsellerAdapter.setOnItemClickListener(
    object : ListbestsellerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbestsellerRowModel) {
        onClickRecyclerListbestseller(view, position, item)
      }
    }
    )
    viewModel.listbestsellerList.observe(requireActivity()) {
      listbestsellerAdapter.updateData(it)
    }
    binding.iphone14SeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbestseller(
    view: View,
    position: Int,
    item: ListbestsellerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14SEVENTEEN_FRAGMENT"

  }
}
