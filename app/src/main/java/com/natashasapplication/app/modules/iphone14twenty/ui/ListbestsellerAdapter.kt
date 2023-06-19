package com.natashasapplication.app.modules.iphone14twenty.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natashasapplication.app.R
import com.natashasapplication.app.databinding.RowListbestseller1Binding
import com.natashasapplication.app.modules.iphone14twenty.`data`.model.Listbestseller1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbestsellerAdapter(
  var list: List<Listbestseller1RowModel>
) : RecyclerView.Adapter<ListbestsellerAdapter.RowListbestseller1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbestseller1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbestseller1,parent,false)
    return RowListbestseller1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbestseller1VH, position: Int) {
    val listbestseller1RowModel = Listbestseller1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbestseller1RowModel = list[position]
    holder.binding.listbestseller1RowModel = listbestseller1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbestseller1RowModel>) {
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
      item: Listbestseller1RowModel
    ) {
    }
  }

  inner class RowListbestseller1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbestseller1Binding = RowListbestseller1Binding.bind(itemView)
  }
}
