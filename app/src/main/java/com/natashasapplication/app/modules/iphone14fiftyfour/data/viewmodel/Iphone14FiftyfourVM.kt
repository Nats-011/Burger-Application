package com.natashasapplication.app.modules.iphone14fiftyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14fiftyfour.`data`.model.Iphone14FiftyfourModel
import org.koin.core.KoinComponent

class Iphone14FiftyfourVM : ViewModel(), KoinComponent {
  val iphone14FiftyfourModel: MutableLiveData<Iphone14FiftyfourModel> =
      MutableLiveData(Iphone14FiftyfourModel())

  var navArguments: Bundle? = null
}
