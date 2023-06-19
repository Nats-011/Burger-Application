package com.natashasapplication.app.modules.iphone14thirtythree.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ThirtythreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeawayDine: String? = MyApp.getInstance().resources.getString(R.string.msg_takeaway_dine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restaurant_s_n)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFontana: String? = MyApp.getInstance().resources.getString(R.string.lbl_fontana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7670CherryAve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_7670_cherry_ave)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_open_10_am_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_distance_7_5_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDRIVENPICKis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_drive_n_pick_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewonMap: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_on_map)

)
