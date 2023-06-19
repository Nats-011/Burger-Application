package com.natashasapplication.app.modules.iphone14fortyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortyeight.`data`.model.Iphone14FortyeightModel
import org.koin.core.KoinComponent

class Iphone14FortyeightVM : ViewModel(), KoinComponent {
  val iphone14FortyeightModel: MutableLiveData<Iphone14FortyeightModel> =
      MutableLiveData(Iphone14FortyeightModel())

  var navArguments: Bundle? = null
}
