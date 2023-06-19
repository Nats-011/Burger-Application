package com.natashasapplication.app.modules.iphone14four.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14four.`data`.model.Iphone14FourModel
import org.koin.core.KoinComponent

class Iphone14FourVM : ViewModel(), KoinComponent {
  val iphone14FourModel: MutableLiveData<Iphone14FourModel> = MutableLiveData(Iphone14FourModel())

  var navArguments: Bundle? = null
}
