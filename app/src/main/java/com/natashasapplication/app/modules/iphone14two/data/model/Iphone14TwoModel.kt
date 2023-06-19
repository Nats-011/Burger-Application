package com.natashasapplication.app.modules.iphone14two.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSEARCH: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_e_a_r_c_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_320_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChickenDelight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chicken_delight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introducing_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt180kcal: String? = MyApp.getInstance().resources.getString(R.string.lbl_180kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup726: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup728: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy)

)
