package com.natashasapplication.app.modules.iphone14twenty.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listbestseller1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBestseller: String? = MyApp.getInstance().resources.getString(R.string.lbl_bestseller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_raspberry_milks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredEightyFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4_8_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSumptuousmilks: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sumptuous_milks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_59)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailable: String? = MyApp.getInstance().resources.getString(R.string.lbl_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup373: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)

)
