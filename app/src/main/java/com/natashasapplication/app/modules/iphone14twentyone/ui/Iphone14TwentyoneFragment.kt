package com.natashasapplication.app.modules.iphone14twentyone.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentyoneBinding
import com.natashasapplication.app.modules.iphone14twentyone.`data`.model.Listbestseller2RowModel
import com.natashasapplication.app.modules.iphone14twentyone.`data`.viewmodel.Iphone14TwentyoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14TwentyoneFragment :
    BaseFragment<FragmentIphone14TwentyoneBinding>(R.layout.fragment_iphone_14_twentyone) {
  private val viewModel: Iphone14TwentyoneVM by viewModels<Iphone14TwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbestsellerAdapter =
    ListbestsellerAdapter(viewModel.listbestsellerList.value?:mutableListOf())
    binding.recyclerListbestseller.adapter = listbestsellerAdapter
    listbestsellerAdapter.setOnItemClickListener(
    object : ListbestsellerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbestseller2RowModel) {
        onClickRecyclerListbestseller(view, position, item)
      }
    }
    )
    viewModel.listbestsellerList.observe(requireActivity()) {
      listbestsellerAdapter.updateData(it)
    }
    binding.iphone14TwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbestseller(
    view: View,
    position: Int,
    item: Listbestseller2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTYONE_FRAGMENT"

  }
}
