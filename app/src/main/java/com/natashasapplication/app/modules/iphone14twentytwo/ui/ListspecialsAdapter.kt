package com.natashasapplication.app.modules.iphone14twentytwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natashasapplication.app.R
import com.natashasapplication.app.databinding.RowListspecialsBinding
import com.natashasapplication.app.modules.iphone14twentytwo.`data`.model.ListspecialsRowModel
import kotlin.Int
import kotlin.collections.List

class ListspecialsAdapter(
  var list: List<ListspecialsRowModel>
) : RecyclerView.Adapter<ListspecialsAdapter.RowListspecialsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListspecialsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listspecials,parent,false)
    return RowListspecialsVH(view)
  }

  override fun onBindViewHolder(holder: RowListspecialsVH, position: Int) {
    val listspecialsRowModel = ListspecialsRowModel()
    // TODO uncomment following line after integration with data source
    // val listspecialsRowModel = list[position]
    holder.binding.listspecialsRowModel = listspecialsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListspecialsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListspecialsRowModel
    ) {
    }
  }

  inner class RowListspecialsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListspecialsBinding = RowListspecialsBinding.bind(itemView)
  }
}
