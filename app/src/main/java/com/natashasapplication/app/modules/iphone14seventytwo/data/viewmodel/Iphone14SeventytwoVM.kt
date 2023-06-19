package com.natashasapplication.app.modules.iphone14seventytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventytwo.`data`.model.Iphone14SeventytwoModel
import org.koin.core.KoinComponent

class Iphone14SeventytwoVM : ViewModel(), KoinComponent {
  val iphone14SeventytwoModel: MutableLiveData<Iphone14SeventytwoModel> =
      MutableLiveData(Iphone14SeventytwoModel())

  var navArguments: Bundle? = null
}
