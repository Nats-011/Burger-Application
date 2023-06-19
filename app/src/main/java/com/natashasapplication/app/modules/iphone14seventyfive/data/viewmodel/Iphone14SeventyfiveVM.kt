package com.natashasapplication.app.modules.iphone14seventyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventyfive.`data`.model.Iphone14SeventyfiveModel
import org.koin.core.KoinComponent

class Iphone14SeventyfiveVM : ViewModel(), KoinComponent {
  val iphone14SeventyfiveModel: MutableLiveData<Iphone14SeventyfiveModel> =
      MutableLiveData(Iphone14SeventyfiveModel())

  var navArguments: Bundle? = null
}
