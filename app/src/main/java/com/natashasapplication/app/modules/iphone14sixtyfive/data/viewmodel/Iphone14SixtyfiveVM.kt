package com.natashasapplication.app.modules.iphone14sixtyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtyfive.`data`.model.Iphone14SixtyfiveModel
import org.koin.core.KoinComponent

class Iphone14SixtyfiveVM : ViewModel(), KoinComponent {
  val iphone14SixtyfiveModel: MutableLiveData<Iphone14SixtyfiveModel> =
      MutableLiveData(Iphone14SixtyfiveModel())

  var navArguments: Bundle? = null
}
