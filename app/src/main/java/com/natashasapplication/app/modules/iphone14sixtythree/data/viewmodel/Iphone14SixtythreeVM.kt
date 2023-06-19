package com.natashasapplication.app.modules.iphone14sixtythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtythree.`data`.model.Iphone14SixtythreeModel
import org.koin.core.KoinComponent

class Iphone14SixtythreeVM : ViewModel(), KoinComponent {
  val iphone14SixtythreeModel: MutableLiveData<Iphone14SixtythreeModel> =
      MutableLiveData(Iphone14SixtythreeModel())

  var navArguments: Bundle? = null
}
