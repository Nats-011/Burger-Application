package com.natashasapplication.app.modules.iphone14fiftyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftyone.`data`.model.Iphone14FiftyoneModel
import org.koin.core.KoinComponent

class Iphone14FiftyoneVM : ViewModel(), KoinComponent {
  val iphone14FiftyoneModel: MutableLiveData<Iphone14FiftyoneModel> =
      MutableLiveData(Iphone14FiftyoneModel())

  var navArguments: Bundle? = null
}
