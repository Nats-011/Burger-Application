package com.natashasapplication.app.modules.iphone14twelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twelve.`data`.model.Iphone14TwelveModel
import org.koin.core.KoinComponent

class Iphone14TwelveVM : ViewModel(), KoinComponent {
  val iphone14TwelveModel: MutableLiveData<Iphone14TwelveModel> =
      MutableLiveData(Iphone14TwelveModel())

  var navArguments: Bundle? = null
}
