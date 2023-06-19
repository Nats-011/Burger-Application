package com.natashasapplication.app.modules.iphone14fiftyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftyseven.`data`.model.Iphone14FiftysevenModel
import org.koin.core.KoinComponent

class Iphone14FiftysevenVM : ViewModel(), KoinComponent {
  val iphone14FiftysevenModel: MutableLiveData<Iphone14FiftysevenModel> =
      MutableLiveData(Iphone14FiftysevenModel())

  var navArguments: Bundle? = null
}
