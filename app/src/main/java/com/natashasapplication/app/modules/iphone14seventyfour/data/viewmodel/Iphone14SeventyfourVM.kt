package com.natashasapplication.app.modules.iphone14seventyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventyfour.`data`.model.Iphone14SeventyfourModel
import org.koin.core.KoinComponent

class Iphone14SeventyfourVM : ViewModel(), KoinComponent {
  val iphone14SeventyfourModel: MutableLiveData<Iphone14SeventyfourModel> =
      MutableLiveData(Iphone14SeventyfourModel())

  var navArguments: Bundle? = null
}
