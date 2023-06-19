package com.natashasapplication.app.modules.iphone14fiftysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftysix.`data`.model.Iphone14FiftysixModel
import org.koin.core.KoinComponent

class Iphone14FiftysixVM : ViewModel(), KoinComponent {
  val iphone14FiftysixModel: MutableLiveData<Iphone14FiftysixModel> =
      MutableLiveData(Iphone14FiftysixModel())

  var navArguments: Bundle? = null
}
