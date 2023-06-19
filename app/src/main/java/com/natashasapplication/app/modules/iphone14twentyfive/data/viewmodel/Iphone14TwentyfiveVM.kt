package com.natashasapplication.app.modules.iphone14twentyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentyfive.`data`.model.Iphone14TwentyfiveModel
import org.koin.core.KoinComponent

class Iphone14TwentyfiveVM : ViewModel(), KoinComponent {
  val iphone14TwentyfiveModel: MutableLiveData<Iphone14TwentyfiveModel> =
      MutableLiveData(Iphone14TwentyfiveModel())

  var navArguments: Bundle? = null
}
