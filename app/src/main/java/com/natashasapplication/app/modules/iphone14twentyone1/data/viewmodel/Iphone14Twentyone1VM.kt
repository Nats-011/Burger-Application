package com.natashasapplication.app.modules.iphone14twentyone1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentyone1.`data`.model.Iphone14Twentyone1Model
import org.koin.core.KoinComponent

class Iphone14Twentyone1VM : ViewModel(), KoinComponent {
  val iphone14Twentyone1Model: MutableLiveData<Iphone14Twentyone1Model> =
      MutableLiveData(Iphone14Twentyone1Model())

  var navArguments: Bundle? = null
}
