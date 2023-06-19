package com.natashasapplication.app.modules.iphone14seventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventeen.`data`.model.Iphone14SeventeenModel
import com.natashasapplication.app.modules.iphone14seventeen.`data`.model.ListbestsellerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone14SeventeenVM : ViewModel(), KoinComponent {
  val iphone14SeventeenModel: MutableLiveData<Iphone14SeventeenModel> =
      MutableLiveData(Iphone14SeventeenModel())

  var navArguments: Bundle? = null

  val listbestsellerList: MutableLiveData<MutableList<ListbestsellerRowModel>> =
      MutableLiveData(mutableListOf())
}
