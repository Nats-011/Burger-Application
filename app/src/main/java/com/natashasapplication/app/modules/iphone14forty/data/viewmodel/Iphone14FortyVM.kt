package com.natashasapplication.app.modules.iphone14forty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14forty.`data`.model.Iphone14FortyModel
import org.koin.core.KoinComponent

class Iphone14FortyVM : ViewModel(), KoinComponent {
  val iphone14FortyModel: MutableLiveData<Iphone14FortyModel> =
      MutableLiveData(Iphone14FortyModel())

  var navArguments: Bundle? = null
}
