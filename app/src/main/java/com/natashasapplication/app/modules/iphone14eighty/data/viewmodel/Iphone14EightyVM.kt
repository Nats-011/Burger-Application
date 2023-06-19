package com.natashasapplication.app.modules.iphone14eighty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14eighty.`data`.model.Iphone14EightyModel
import org.koin.core.KoinComponent

class Iphone14EightyVM : ViewModel(), KoinComponent {
  val iphone14EightyModel: MutableLiveData<Iphone14EightyModel> =
      MutableLiveData(Iphone14EightyModel())

  var navArguments: Bundle? = null
}
