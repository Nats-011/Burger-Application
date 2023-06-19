package com.natashasapplication.app.modules.iphone14five.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14FiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNothinghereye: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nothing_here_ye)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddburgersyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_burgers_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddburgers: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_burgers)

)
