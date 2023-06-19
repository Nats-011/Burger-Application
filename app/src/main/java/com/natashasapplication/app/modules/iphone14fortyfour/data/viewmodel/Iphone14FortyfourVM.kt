package com.natashasapplication.app.modules.iphone14fortyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fortyfour.`data`.model.Iphone14FortyfourModel
import org.koin.core.KoinComponent

class Iphone14FortyfourVM : ViewModel(), KoinComponent {
  val iphone14FortyfourModel: MutableLiveData<Iphone14FortyfourModel> =
      MutableLiveData(Iphone14FortyfourModel())

  var navArguments: Bundle? = null
}
