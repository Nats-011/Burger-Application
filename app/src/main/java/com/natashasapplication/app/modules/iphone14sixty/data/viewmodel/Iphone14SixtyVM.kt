package com.natashasapplication.app.modules.iphone14sixty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixty.`data`.model.Iphone14SixtyModel
import org.koin.core.KoinComponent

class Iphone14SixtyVM : ViewModel(), KoinComponent {
  val iphone14SixtyModel: MutableLiveData<Iphone14SixtyModel> =
      MutableLiveData(Iphone14SixtyModel())

  var navArguments: Bundle? = null
}
