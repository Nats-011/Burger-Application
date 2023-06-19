package com.natashasapplication.app.modules.iphone14seventythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventythree.`data`.model.Iphone14SeventythreeModel
import org.koin.core.KoinComponent

class Iphone14SeventythreeVM : ViewModel(), KoinComponent {
  val iphone14SeventythreeModel: MutableLiveData<Iphone14SeventythreeModel> =
      MutableLiveData(Iphone14SeventythreeModel())

  var navArguments: Bundle? = null
}
