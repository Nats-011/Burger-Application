package com.natashasapplication.app.modules.iphone14fiftyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftyfive.`data`.model.Iphone14FiftyfiveModel
import org.koin.core.KoinComponent

class Iphone14FiftyfiveVM : ViewModel(), KoinComponent {
  val iphone14FiftyfiveModel: MutableLiveData<Iphone14FiftyfiveModel> =
      MutableLiveData(Iphone14FiftyfiveModel())

  var navArguments: Bundle? = null
}
