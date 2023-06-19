package com.natashasapplication.app.modules.iphone14fortyeight.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14FortyeightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTemperature: String? = MyApp.getInstance().resources.getString(R.string.lbl_temperature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHot: String? = MyApp.getInstance().resources.getString(R.string.lbl_hot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIced: String? = MyApp.getInstance().resources.getString(R.string.lbl_iced)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWarm: String? = MyApp.getInstance().resources.getString(R.string.lbl_warm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExtraHot: String? = MyApp.getInstance().resources.getString(R.string.lbl_extra_hot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmall: String? = MyApp.getInstance().resources.getString(R.string.lbl_small)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedium: String? = MyApp.getInstance().resources.getString(R.string.lbl_medium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLarge: String? = MyApp.getInstance().resources.getString(R.string.lbl_large)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNutritionalInf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nutritional_inf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_calories_140)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_sugar_14g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecialRequest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_special_request)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_strawberry_lime2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTangyandsweet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tangy_and_sweet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomize: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)

)
