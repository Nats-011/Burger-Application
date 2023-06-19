package com.natashasapplication.app.modules.iphone14twentytwo.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14TwentytwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeverages: String? = MyApp.getInstance().resources.getString(R.string.lbl_beverages)

)
