package com.natashasapplication.app.modules.iphone14seventeen.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListbestsellerRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBestseller: String? = MyApp.getInstance().resources.getString(R.string.lbl_bestseller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassicCheeseb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_classic_cheeseb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuicyflamegr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_juicy_flame_gr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailable: String? = MyApp.getInstance().resources.getString(R.string.lbl_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup297: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)

)
