package com.natashasapplication.app.modules.iphone14fortyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortyseven.`data`.model.Iphone14FortysevenModel
import org.koin.core.KoinComponent

class Iphone14FortysevenVM : ViewModel(), KoinComponent {
  val iphone14FortysevenModel: MutableLiveData<Iphone14FortysevenModel> =
      MutableLiveData(Iphone14FortysevenModel())

  var navArguments: Bundle? = null
}
