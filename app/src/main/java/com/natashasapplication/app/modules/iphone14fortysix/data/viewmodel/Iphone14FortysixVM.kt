package com.natashasapplication.app.modules.iphone14fortysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortysix.`data`.model.Iphone14FortysixModel
import org.koin.core.KoinComponent

class Iphone14FortysixVM : ViewModel(), KoinComponent {
  val iphone14FortysixModel: MutableLiveData<Iphone14FortysixModel> =
      MutableLiveData(Iphone14FortysixModel())

  var navArguments: Bundle? = null
}
