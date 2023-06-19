package com.natashasapplication.app.modules.iphone14seventyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventyone.`data`.model.Iphone14SeventyoneModel
import org.koin.core.KoinComponent

class Iphone14SeventyoneVM : ViewModel(), KoinComponent {
  val iphone14SeventyoneModel: MutableLiveData<Iphone14SeventyoneModel> =
      MutableLiveData(Iphone14SeventyoneModel())

  var navArguments: Bundle? = null
}
