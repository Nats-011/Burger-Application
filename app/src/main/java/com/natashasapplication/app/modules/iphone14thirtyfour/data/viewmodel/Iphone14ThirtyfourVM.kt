package com.natashasapplication.app.modules.iphone14thirtyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14thirtyfour.`data`.model.Iphone14ThirtyfourModel
import org.koin.core.KoinComponent

class Iphone14ThirtyfourVM : ViewModel(), KoinComponent {
  val iphone14ThirtyfourModel: MutableLiveData<Iphone14ThirtyfourModel> =
      MutableLiveData(Iphone14ThirtyfourModel())

  var navArguments: Bundle? = null
}
