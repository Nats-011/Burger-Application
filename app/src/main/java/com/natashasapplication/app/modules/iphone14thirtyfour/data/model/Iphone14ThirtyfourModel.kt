package com.natashasapplication.app.modules.iphone14thirtyfour.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ThirtyfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeawayDine: String? = MyApp.getInstance().resources.getString(R.string.msg_takeaway_dine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_123_main_street)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)

)
