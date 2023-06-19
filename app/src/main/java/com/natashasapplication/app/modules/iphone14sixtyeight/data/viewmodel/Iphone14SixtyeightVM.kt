package com.natashasapplication.app.modules.iphone14sixtyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtyeight.`data`.model.Iphone14SixtyeightModel
import org.koin.core.KoinComponent

class Iphone14SixtyeightVM : ViewModel(), KoinComponent {
  val iphone14SixtyeightModel: MutableLiveData<Iphone14SixtyeightModel> =
      MutableLiveData(Iphone14SixtyeightModel())

  var navArguments: Bundle? = null
}
