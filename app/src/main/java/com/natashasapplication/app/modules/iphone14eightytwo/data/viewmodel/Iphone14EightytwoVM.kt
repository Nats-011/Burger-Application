package com.natashasapplication.app.modules.iphone14eightytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14eightytwo.`data`.model.Iphone14EightytwoModel
import org.koin.core.KoinComponent

class Iphone14EightytwoVM : ViewModel(), KoinComponent {
  val iphone14EightytwoModel: MutableLiveData<Iphone14EightytwoModel> =
      MutableLiveData(Iphone14EightytwoModel())

  var navArguments: Bundle? = null
}
