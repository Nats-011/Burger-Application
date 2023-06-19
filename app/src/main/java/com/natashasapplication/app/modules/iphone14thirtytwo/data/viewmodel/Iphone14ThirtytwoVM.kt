package com.natashasapplication.app.modules.iphone14thirtytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtytwo.`data`.model.Iphone14ThirtytwoModel
import org.koin.core.KoinComponent

class Iphone14ThirtytwoVM : ViewModel(), KoinComponent {
  val iphone14ThirtytwoModel: MutableLiveData<Iphone14ThirtytwoModel> =
      MutableLiveData(Iphone14ThirtytwoModel())

  var navArguments: Bundle? = null
}
