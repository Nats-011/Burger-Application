package com.natashasapplication.app.modules.iphone14thirtynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtynine.`data`.model.Iphone14ThirtynineModel
import org.koin.core.KoinComponent

class Iphone14ThirtynineVM : ViewModel(), KoinComponent {
  val iphone14ThirtynineModel: MutableLiveData<Iphone14ThirtynineModel> =
      MutableLiveData(Iphone14ThirtynineModel())

  var navArguments: Bundle? = null
}
