package com.natashasapplication.app.modules.iphone14seventyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventyeight.`data`.model.Iphone14SeventyeightModel
import org.koin.core.KoinComponent

class Iphone14SeventyeightVM : ViewModel(), KoinComponent {
  val iphone14SeventyeightModel: MutableLiveData<Iphone14SeventyeightModel> =
      MutableLiveData(Iphone14SeventyeightModel())

  var navArguments: Bundle? = null
}
