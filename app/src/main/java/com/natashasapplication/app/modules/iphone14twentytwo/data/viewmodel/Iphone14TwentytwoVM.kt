package com.natashasapplication.app.modules.iphone14twentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentytwo.`data`.model.Iphone14TwentytwoModel
import com.natashasapplication.app.modules.iphone14twentytwo.`data`.model.ListspecialsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone14TwentytwoVM : ViewModel(), KoinComponent {
  val iphone14TwentytwoModel: MutableLiveData<Iphone14TwentytwoModel> =
      MutableLiveData(Iphone14TwentytwoModel())

  var navArguments: Bundle? = null

  val listspecialsList: MutableLiveData<MutableList<ListspecialsRowModel>> =
      MutableLiveData(mutableListOf())
}
