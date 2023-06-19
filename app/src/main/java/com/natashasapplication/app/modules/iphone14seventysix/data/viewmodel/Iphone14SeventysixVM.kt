package com.natashasapplication.app.modules.iphone14seventysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventysix.`data`.model.Iphone14SeventysixModel
import org.koin.core.KoinComponent

class Iphone14SeventysixVM : ViewModel(), KoinComponent {
  val iphone14SeventysixModel: MutableLiveData<Iphone14SeventysixModel> =
      MutableLiveData(Iphone14SeventysixModel())

  var navArguments: Bundle? = null
}
