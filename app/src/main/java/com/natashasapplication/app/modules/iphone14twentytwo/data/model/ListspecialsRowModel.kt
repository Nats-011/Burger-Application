package com.natashasapplication.app.modules.iphone14twentytwo.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListspecialsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecials: String? = MyApp.getInstance().resources.getString(R.string.lbl_specials)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlavorfulTrio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_flavorful_trio)
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_delicious_combo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_49)
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
  var txtGroup427: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)

)
