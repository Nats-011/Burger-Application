package com.natashasapplication.app.modules.iphone14fortytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortytwo.`data`.model.Iphone14FortytwoModel
import org.koin.core.KoinComponent

class Iphone14FortytwoVM : ViewModel(), KoinComponent {
  val iphone14FortytwoModel: MutableLiveData<Iphone14FortytwoModel> =
      MutableLiveData(Iphone14FortytwoModel())

  var navArguments: Bundle? = null
}
