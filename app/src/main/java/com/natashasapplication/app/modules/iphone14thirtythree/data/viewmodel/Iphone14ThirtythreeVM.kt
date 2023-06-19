package com.natashasapplication.app.modules.iphone14thirtythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtythree.`data`.model.Iphone14ThirtythreeModel
import org.koin.core.KoinComponent

class Iphone14ThirtythreeVM : ViewModel(), KoinComponent {
  val iphone14ThirtythreeModel: MutableLiveData<Iphone14ThirtythreeModel> =
      MutableLiveData(Iphone14ThirtythreeModel())

  var navArguments: Bundle? = null
}
