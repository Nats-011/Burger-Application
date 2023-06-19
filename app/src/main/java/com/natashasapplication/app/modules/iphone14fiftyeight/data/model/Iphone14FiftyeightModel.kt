package com.natashasapplication.app.modules.iphone14fiftyeight.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14FiftyeightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStudenrsdiscou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_studenrs_discou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountClaime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discount_claime)

)
