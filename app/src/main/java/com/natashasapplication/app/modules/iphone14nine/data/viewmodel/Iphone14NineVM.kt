package com.natashasapplication.app.modules.iphone14nine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14nine.`data`.model.Iphone14NineModel
import org.koin.core.KoinComponent

class Iphone14NineVM : ViewModel(), KoinComponent {
  val iphone14NineModel: MutableLiveData<Iphone14NineModel> = MutableLiveData(Iphone14NineModel())

  var navArguments: Bundle? = null
}
