package com.natashasapplication.app.modules.iphone14sixtynine.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SixtynineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_address)

)
