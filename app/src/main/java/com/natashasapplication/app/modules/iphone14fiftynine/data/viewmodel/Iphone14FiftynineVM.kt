package com.natashasapplication.app.modules.iphone14fiftynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftynine.`data`.model.Iphone14FiftynineModel
import org.koin.core.KoinComponent

class Iphone14FiftynineVM : ViewModel(), KoinComponent {
  val iphone14FiftynineModel: MutableLiveData<Iphone14FiftynineModel> =
      MutableLiveData(Iphone14FiftynineModel())

  var navArguments: Bundle? = null
}
