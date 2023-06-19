package com.natashasapplication.app.modules.iphone14sixtyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtyone.`data`.model.Iphone14SixtyoneModel
import org.koin.core.KoinComponent

class Iphone14SixtyoneVM : ViewModel(), KoinComponent {
  val iphone14SixtyoneModel: MutableLiveData<Iphone14SixtyoneModel> =
      MutableLiveData(Iphone14SixtyoneModel())

  var navArguments: Bundle? = null
}
