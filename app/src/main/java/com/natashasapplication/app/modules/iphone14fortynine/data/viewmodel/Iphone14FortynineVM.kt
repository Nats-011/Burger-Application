package com.natashasapplication.app.modules.iphone14fortynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortynine.`data`.model.Iphone14FortynineModel
import org.koin.core.KoinComponent

class Iphone14FortynineVM : ViewModel(), KoinComponent {
  val iphone14FortynineModel: MutableLiveData<Iphone14FortynineModel> =
      MutableLiveData(Iphone14FortynineModel())

  var navArguments: Bundle? = null
}
