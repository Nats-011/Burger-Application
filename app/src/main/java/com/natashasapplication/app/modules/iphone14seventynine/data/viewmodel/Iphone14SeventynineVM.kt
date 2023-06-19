package com.natashasapplication.app.modules.iphone14seventynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natashasapplication.app.modules.iphone14seventynine.`data`.model.Iphone14SeventynineModel
import org.koin.core.KoinComponent

class Iphone14SeventynineVM : ViewModel(), KoinComponent {
  val iphone14SeventynineModel: MutableLiveData<Iphone14SeventynineModel> =
      MutableLiveData(Iphone14SeventynineModel())

  var navArguments: Bundle? = null
}
