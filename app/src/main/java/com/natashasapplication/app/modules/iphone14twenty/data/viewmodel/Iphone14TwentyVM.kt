package com.natashasapplication.app.modules.iphone14twenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twenty.`data`.model.Iphone14TwentyModel
import com.natashasapplication.app.modules.iphone14twenty.`data`.model.Listbestseller1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone14TwentyVM : ViewModel(), KoinComponent {
  val iphone14TwentyModel: MutableLiveData<Iphone14TwentyModel> =
      MutableLiveData(Iphone14TwentyModel())

  var navArguments: Bundle? = null

  val listbestsellerList: MutableLiveData<MutableList<Listbestseller1RowModel>> =
      MutableLiveData(mutableListOf())
}
