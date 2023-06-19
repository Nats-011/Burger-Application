package com.natashasapplication.app.modules.iphone14twentysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentysix.`data`.model.Iphone14TwentysixModel
import org.koin.core.KoinComponent

class Iphone14TwentysixVM : ViewModel(), KoinComponent {
  val iphone14TwentysixModel: MutableLiveData<Iphone14TwentysixModel> =
      MutableLiveData(Iphone14TwentysixModel())

  var navArguments: Bundle? = null
}
