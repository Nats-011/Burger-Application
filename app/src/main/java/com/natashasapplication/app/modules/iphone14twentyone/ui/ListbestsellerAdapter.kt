package com.natashasapplication.app.modules.iphone14twentyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natashasapplication.app.R
import com.natashasapplication.app.databinding.RowListbestseller2Binding
import com.natashasapplication.app.modules.iphone14twentyone.`data`.model.Listbestseller2RowModel
import kotlin.Int
import kotlin.collections.List

class ListbestsellerAdapter(
  var list: List<Listbestseller2RowModel>
) : RecyclerView.Adapter<ListbestsellerAdapter.RowListbestseller2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbestseller2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbestseller2,parent,false)
    return RowListbestseller2VH(view)
  }

  override fun onBindViewHolder(holder: RowListbestseller2VH, position: Int) {
    val listbestseller2RowModel = Listbestseller2RowModel()
    // TODO uncomment following line after integration with data source
    // val listbestseller2RowModel = list[position]
    holder.binding.listbestseller2RowModel = listbestseller2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbestseller2RowModel>) {
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
      item: Listbestseller2RowModel
    ) {
    }
  }

  inner class RowListbestseller2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbestseller2Binding = RowListbestseller2Binding.bind(itemView)
  }
}
