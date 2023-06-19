package com.natashasapplication.app.modules.iphone14eightyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14eightyone.`data`.model.Iphone14EightyoneModel
import org.koin.core.KoinComponent

class Iphone14EightyoneVM : ViewModel(), KoinComponent {
  val iphone14EightyoneModel: MutableLiveData<Iphone14EightyoneModel> =
      MutableLiveData(Iphone14EightyoneModel())

  var navArguments: Bundle? = null
}
