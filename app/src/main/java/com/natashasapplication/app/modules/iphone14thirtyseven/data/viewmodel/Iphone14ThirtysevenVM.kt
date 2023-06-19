package com.natashasapplication.app.modules.iphone14thirtyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtyseven.`data`.model.Iphone14ThirtysevenModel
import org.koin.core.KoinComponent

class Iphone14ThirtysevenVM : ViewModel(), KoinComponent {
  val iphone14ThirtysevenModel: MutableLiveData<Iphone14ThirtysevenModel> =
      MutableLiveData(Iphone14ThirtysevenModel())

  var navArguments: Bundle? = null
}
