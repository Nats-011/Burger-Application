package com.natashasapplication.app.modules.iphone14six.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyournam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notification_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefinewhatale: String? =
      MyApp.getInstance().resources.getString(R.string.msg_define_what_ale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delete_your_acc)

)
