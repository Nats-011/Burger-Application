package com.natashasapplication.app.modules.iphone14thirtysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtysix.`data`.model.Iphone14ThirtysixModel
import org.koin.core.KoinComponent

class Iphone14ThirtysixVM : ViewModel(), KoinComponent {
  val iphone14ThirtysixModel: MutableLiveData<Iphone14ThirtysixModel> =
      MutableLiveData(Iphone14ThirtysixModel())

  var navArguments: Bundle? = null
}
