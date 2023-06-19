package com.natashasapplication.app.modules.iphone14six.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14six.`data`.model.Iphone14SixModel
import org.koin.core.KoinComponent

class Iphone14SixVM : ViewModel(), KoinComponent {
  val iphone14SixModel: MutableLiveData<Iphone14SixModel> = MutableLiveData(Iphone14SixModel())

  var navArguments: Bundle? = null
}
