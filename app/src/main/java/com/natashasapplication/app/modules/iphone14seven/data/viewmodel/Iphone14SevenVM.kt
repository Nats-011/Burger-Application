package com.natashasapplication.app.modules.iphone14seven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seven.`data`.model.Iphone14SevenModel
import org.koin.core.KoinComponent

class Iphone14SevenVM : ViewModel(), KoinComponent {
  val iphone14SevenModel: MutableLiveData<Iphone14SevenModel> =
      MutableLiveData(Iphone14SevenModel())

  var navArguments: Bundle? = null
}
