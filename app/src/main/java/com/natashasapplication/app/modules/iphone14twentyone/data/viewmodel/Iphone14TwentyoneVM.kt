package com.natashasapplication.app.modules.iphone14twentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentyone.`data`.model.Iphone14TwentyoneModel
import com.natashasapplication.app.modules.iphone14twentyone.`data`.model.Listbestseller2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone14TwentyoneVM : ViewModel(), KoinComponent {
  val iphone14TwentyoneModel: MutableLiveData<Iphone14TwentyoneModel> =
      MutableLiveData(Iphone14TwentyoneModel())

  var navArguments: Bundle? = null

  val listbestsellerList: MutableLiveData<MutableList<Listbestseller2RowModel>> =
      MutableLiveData(mutableListOf())
}
