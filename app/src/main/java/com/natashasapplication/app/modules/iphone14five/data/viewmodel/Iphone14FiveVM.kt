package com.natashasapplication.app.modules.iphone14five.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14five.`data`.model.Iphone14FiveModel
import org.koin.core.KoinComponent

class Iphone14FiveVM : ViewModel(), KoinComponent {
  val iphone14FiveModel: MutableLiveData<Iphone14FiveModel> = MutableLiveData(Iphone14FiveModel())

  var navArguments: Bundle? = null
}
