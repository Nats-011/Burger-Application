package com.natashasapplication.app.modules.iphone14twentyone.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listbestseller2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBestseller: String? = MyApp.getInstance().resources.getString(R.string.lbl_bestseller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPannaCotta: String? = MyApp.getInstance().resources.getString(R.string.lbl_panna_cotta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredSixtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_6_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSilkypannacot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_silky_panna_cot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_59)
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
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)

)
