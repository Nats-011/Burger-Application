package com.natashasapplication.app.modules.iphone14fiftyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftyeight.`data`.model.Iphone14FiftyeightModel
import org.koin.core.KoinComponent

class Iphone14FiftyeightVM : ViewModel(), KoinComponent {
  val iphone14FiftyeightModel: MutableLiveData<Iphone14FiftyeightModel> =
      MutableLiveData(Iphone14FiftyeightModel())

  var navArguments: Bundle? = null
}
