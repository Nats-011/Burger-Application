package com.natashasapplication.app.modules.iphone14eightyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14eightyfour.`data`.model.Iphone14EightyfourModel
import org.koin.core.KoinComponent

class Iphone14EightyfourVM : ViewModel(), KoinComponent {
  val iphone14EightyfourModel: MutableLiveData<Iphone14EightyfourModel> =
      MutableLiveData(Iphone14EightyfourModel())

  var navArguments: Bundle? = null
}
