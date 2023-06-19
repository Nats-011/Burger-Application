package com.natashasapplication.app.modules.iphone14fortyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortyone.`data`.model.Iphone14FortyoneModel
import org.koin.core.KoinComponent

class Iphone14FortyoneVM : ViewModel(), KoinComponent {
  val iphone14FortyoneModel: MutableLiveData<Iphone14FortyoneModel> =
      MutableLiveData(Iphone14FortyoneModel())

  var navArguments: Bundle? = null
}
