package com.natashasapplication.app.modules.iphone14seventyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventyseven.`data`.model.Iphone14SeventysevenModel
import org.koin.core.KoinComponent

class Iphone14SeventysevenVM : ViewModel(), KoinComponent {
  val iphone14SeventysevenModel: MutableLiveData<Iphone14SeventysevenModel> =
      MutableLiveData(Iphone14SeventysevenModel())

  var navArguments: Bundle? = null
}
