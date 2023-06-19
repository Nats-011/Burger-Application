package com.natashasapplication.app.modules.iphone14twenty.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentyBinding
import com.natashasapplication.app.modules.iphone14twenty.`data`.model.Listbestseller1RowModel
import com.natashasapplication.app.modules.iphone14twenty.`data`.viewmodel.Iphone14TwentyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14TwentyFragment :
    BaseFragment<FragmentIphone14TwentyBinding>(R.layout.fragment_iphone_14_twenty) {
  private val viewModel: Iphone14TwentyVM by viewModels<Iphone14TwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbestsellerAdapter =
    ListbestsellerAdapter(viewModel.listbestsellerList.value?:mutableListOf())
    binding.recyclerListbestseller.adapter = listbestsellerAdapter
    listbestsellerAdapter.setOnItemClickListener(
    object : ListbestsellerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbestseller1RowModel) {
        onClickRecyclerListbestseller(view, position, item)
      }
    }
    )
    viewModel.listbestsellerList.observe(requireActivity()) {
      listbestsellerAdapter.updateData(it)
    }
    binding.iphone14TwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbestseller(
    view: View,
    position: Int,
    item: Listbestseller1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTY_FRAGMENT"

  }
}
