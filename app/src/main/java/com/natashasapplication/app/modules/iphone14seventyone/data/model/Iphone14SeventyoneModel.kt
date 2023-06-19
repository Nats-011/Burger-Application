package com.natashasapplication.app.modules.iphone14seventyone.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SeventyoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtITEMSADDED: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_s_added)

)
