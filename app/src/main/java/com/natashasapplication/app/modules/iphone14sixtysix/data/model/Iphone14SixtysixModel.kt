package com.natashasapplication.app.modules.iphone14sixtysix.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SixtysixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeawayDine: String? = MyApp.getInstance().resources.getString(R.string.msg_takeaway_dine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreciselocatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_precise_locatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup197Value: String? = null
)
