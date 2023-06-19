package com.natashasapplication.app.modules.iphone14sixtyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtyfour.`data`.model.Iphone14SixtyfourModel
import org.koin.core.KoinComponent

class Iphone14SixtyfourVM : ViewModel(), KoinComponent {
  val iphone14SixtyfourModel: MutableLiveData<Iphone14SixtyfourModel> =
      MutableLiveData(Iphone14SixtyfourModel())

  var navArguments: Bundle? = null
}
