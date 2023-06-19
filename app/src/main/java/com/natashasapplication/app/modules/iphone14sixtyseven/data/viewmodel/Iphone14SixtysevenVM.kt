package com.natashasapplication.app.modules.iphone14sixtyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtyseven.`data`.model.Iphone14SixtysevenModel
import org.koin.core.KoinComponent

class Iphone14SixtysevenVM : ViewModel(), KoinComponent {
  val iphone14SixtysevenModel: MutableLiveData<Iphone14SixtysevenModel> =
      MutableLiveData(Iphone14SixtysevenModel())

  var navArguments: Bundle? = null
}
