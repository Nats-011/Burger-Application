package com.natashasapplication.app.modules.iphone14fortyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortyfive.`data`.model.Iphone14FortyfiveModel
import org.koin.core.KoinComponent

class Iphone14FortyfiveVM : ViewModel(), KoinComponent {
  val iphone14FortyfiveModel: MutableLiveData<Iphone14FortyfiveModel> =
      MutableLiveData(Iphone14FortyfiveModel())

  var navArguments: Bundle? = null
}
