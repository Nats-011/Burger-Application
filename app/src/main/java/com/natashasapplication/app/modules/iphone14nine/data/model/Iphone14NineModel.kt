package com.natashasapplication.app.modules.iphone14nine.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14NineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNatashaSardar: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_natasha_sardar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKolkata: String? = MyApp.getInstance().resources.getString(R.string.lbl_kolkata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyorders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyBookings: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookings)

)
