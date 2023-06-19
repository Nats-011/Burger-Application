package com.natashasapplication.app.modules.iphone14twelve.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14TwelveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourProfiles: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_profiles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonal: String? = MyApp.getInstance().resources.getString(R.string.lbl_personal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusiness: String? = MyApp.getInstance().resources.getString(R.string.lbl_business)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhone: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThiscannotbe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_cannot_be)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThiscannotbeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_cannot_be)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup443Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup442Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup439Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup438Value: String? = null
)
