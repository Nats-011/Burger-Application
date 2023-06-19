package com.natashasapplication.app.modules.iphone14fifty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fifty.`data`.model.Iphone14FiftyModel
import org.koin.core.KoinComponent

class Iphone14FiftyVM : ViewModel(), KoinComponent {
  val iphone14FiftyModel: MutableLiveData<Iphone14FiftyModel> =
      MutableLiveData(Iphone14FiftyModel())

  var navArguments: Bundle? = null
}
