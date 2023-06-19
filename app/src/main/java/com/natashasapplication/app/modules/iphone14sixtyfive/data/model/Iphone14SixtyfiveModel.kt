package com.natashasapplication.app.modules.iphone14sixtyfive.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SixtyfiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSendFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_what_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterFeedback: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_feedback)

)
