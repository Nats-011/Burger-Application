package com.natashasapplication.app.modules.iphone14eightythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14eightythree.`data`.model.Iphone14EightythreeModel
import org.koin.core.KoinComponent

class Iphone14EightythreeVM : ViewModel(), KoinComponent {
  val iphone14EightythreeModel: MutableLiveData<Iphone14EightythreeModel> =
      MutableLiveData(Iphone14EightythreeModel())

  var navArguments: Bundle? = null
}
