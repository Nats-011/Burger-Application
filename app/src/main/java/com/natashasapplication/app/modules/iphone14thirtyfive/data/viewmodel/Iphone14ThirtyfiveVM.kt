package com.natashasapplication.app.modules.iphone14thirtyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtyfive.`data`.model.Iphone14ThirtyfiveModel
import org.koin.core.KoinComponent

class Iphone14ThirtyfiveVM : ViewModel(), KoinComponent {
  val iphone14ThirtyfiveModel: MutableLiveData<Iphone14ThirtyfiveModel> =
      MutableLiveData(Iphone14ThirtyfiveModel())

  var navArguments: Bundle? = null
}
