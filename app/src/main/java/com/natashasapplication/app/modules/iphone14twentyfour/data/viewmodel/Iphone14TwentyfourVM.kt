package com.natashasapplication.app.modules.iphone14twentyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14twentyfour.`data`.model.Iphone14TwentyfourModel
import org.koin.core.KoinComponent

class Iphone14TwentyfourVM : ViewModel(), KoinComponent {
  val iphone14TwentyfourModel: MutableLiveData<Iphone14TwentyfourModel> =
      MutableLiveData(Iphone14TwentyfourModel())

  var navArguments: Bundle? = null
}
