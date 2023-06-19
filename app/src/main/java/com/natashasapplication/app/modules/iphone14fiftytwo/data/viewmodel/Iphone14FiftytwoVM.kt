package com.natashasapplication.app.modules.iphone14fiftytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftytwo.`data`.model.Iphone14FiftytwoModel
import org.koin.core.KoinComponent

class Iphone14FiftytwoVM : ViewModel(), KoinComponent {
  val iphone14FiftytwoModel: MutableLiveData<Iphone14FiftytwoModel> =
      MutableLiveData(Iphone14FiftytwoModel())

  var navArguments: Bundle? = null
}
