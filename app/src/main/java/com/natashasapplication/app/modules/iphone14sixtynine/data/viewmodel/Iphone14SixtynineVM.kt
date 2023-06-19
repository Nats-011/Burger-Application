package com.natashasapplication.app.modules.iphone14sixtynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14sixtynine.`data`.model.Iphone14SixtynineModel
import org.koin.core.KoinComponent

class Iphone14SixtynineVM : ViewModel(), KoinComponent {
  val iphone14SixtynineModel: MutableLiveData<Iphone14SixtynineModel> =
      MutableLiveData(Iphone14SixtynineModel())

  var navArguments: Bundle? = null
}
