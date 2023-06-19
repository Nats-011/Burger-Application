package com.natashasapplication.app.modules.iphone14seventeen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natashasapplication.app.R
import com.natashasapplication.app.databinding.RowListbestsellerBinding
import com.natashasapplication.app.modules.iphone14seventeen.`data`.model.ListbestsellerRowModel
import kotlin.Int
import kotlin.collections.List

class ListbestsellerAdapter(
  var list: List<ListbestsellerRowModel>
) : RecyclerView.Adapter<ListbestsellerAdapter.RowListbestsellerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbestsellerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbestseller,parent,false)
    return RowListbestsellerVH(view)
  }

  override fun onBindViewHolder(holder: RowListbestsellerVH, position: Int) {
    val listbestsellerRowModel = ListbestsellerRowModel()
    // TODO uncomment following line after integration with data source
    // val listbestsellerRowModel = list[position]
    holder.binding.listbestsellerRowModel = listbestsellerRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbestsellerRowModel>) {
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
      item: ListbestsellerRowModel
    ) {
    }
  }

  inner class RowListbestsellerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbestsellerBinding = RowListbestsellerBinding.bind(itemView)
  }
}
