package com.natashasapplication.app.modules.iphone14fortythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortythree.`data`.model.Iphone14FortythreeModel
import org.koin.core.KoinComponent

class Iphone14FortythreeVM : ViewModel(), KoinComponent {
  val iphone14FortythreeModel: MutableLiveData<Iphone14FortythreeModel> =
      MutableLiveData(Iphone14FortythreeModel())

  var navArguments: Bundle? = null
}
