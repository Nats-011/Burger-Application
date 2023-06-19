package com.natashasapplication.app.modules.iphone14fiftythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftythree.`data`.model.Iphone14FiftythreeModel
import org.koin.core.KoinComponent

class Iphone14FiftythreeVM : ViewModel(), KoinComponent {
  val iphone14FiftythreeModel: MutableLiveData<Iphone14FiftythreeModel> =
      MutableLiveData(Iphone14FiftythreeModel())

  var navArguments: Bundle? = null
}
