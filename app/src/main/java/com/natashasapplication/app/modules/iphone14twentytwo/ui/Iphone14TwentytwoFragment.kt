package com.natashasapplication.app.modules.iphone14twentytwo.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.base.BaseFragment
import com.natashasapplication.app.databinding.FragmentIphone14TwentytwoBinding
import com.natashasapplication.app.modules.iphone14twentytwo.`data`.model.ListspecialsRowModel
import com.natashasapplication.app.modules.iphone14twentytwo.`data`.viewmodel.Iphone14TwentytwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14TwentytwoFragment :
    BaseFragment<FragmentIphone14TwentytwoBinding>(R.layout.fragment_iphone_14_twentytwo) {
  private val viewModel: Iphone14TwentytwoVM by viewModels<Iphone14TwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listspecialsAdapter =
    ListspecialsAdapter(viewModel.listspecialsList.value?:mutableListOf())
    binding.recyclerListspecials.adapter = listspecialsAdapter
    listspecialsAdapter.setOnItemClickListener(
    object : ListspecialsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListspecialsRowModel) {
        onClickRecyclerListspecials(view, position, item)
      }
    }
    )
    viewModel.listspecialsList.observe(requireActivity()) {
      listspecialsAdapter.updateData(it)
    }
    binding.iphone14TwentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListspecials(
    view: View,
    position: Int,
    item: ListspecialsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWENTYTWO_FRAGMENT"

  }
}
