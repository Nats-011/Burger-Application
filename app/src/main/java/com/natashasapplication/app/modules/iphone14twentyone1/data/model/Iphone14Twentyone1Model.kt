package com.natashasapplication.app.modules.iphone14twentyone1.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14Twentyone1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtBRsMenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_br_s_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)

)
