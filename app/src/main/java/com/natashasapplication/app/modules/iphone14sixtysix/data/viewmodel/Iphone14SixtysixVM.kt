package com.natashasapplication.app.modules.iphone14sixtysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtysix.`data`.model.Iphone14SixtysixModel
import org.koin.core.KoinComponent

class Iphone14SixtysixVM : ViewModel(), KoinComponent {
  val iphone14SixtysixModel: MutableLiveData<Iphone14SixtysixModel> =
      MutableLiveData(Iphone14SixtysixModel())

  var navArguments: Bundle? = null
}
