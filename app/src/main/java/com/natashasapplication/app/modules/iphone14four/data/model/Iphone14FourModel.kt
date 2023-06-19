package com.natashasapplication.app.modules.iphone14four.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14FourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayments: String? = MyApp.getInstance().resources.getString(R.string.lbl_payments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourorders: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavoriteorders: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_favorite_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressBook: String? = MyApp.getInstance().resources.getString(R.string.lbl_address_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_loyalty_reward)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNatasha: String? = MyApp.getInstance().resources.getString(R.string.lbl_natasha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudentDiscoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_student_discoun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup252Value: String? = null
)
