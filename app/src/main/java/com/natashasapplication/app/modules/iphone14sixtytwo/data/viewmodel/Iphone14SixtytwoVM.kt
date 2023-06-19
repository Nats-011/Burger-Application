package com.natashasapplication.app.modules.iphone14sixtytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtytwo.`data`.model.Iphone14SixtytwoModel
import org.koin.core.KoinComponent

class Iphone14SixtytwoVM : ViewModel(), KoinComponent {
  val iphone14SixtytwoModel: MutableLiveData<Iphone14SixtytwoModel> =
      MutableLiveData(Iphone14SixtytwoModel())

  var navArguments: Bundle? = null
}
