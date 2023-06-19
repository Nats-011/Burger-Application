package com.natashasapplication.app.modules.iphone14one.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChef: String? = MyApp.getInstance().resources.getString(R.string.lbl_chef)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBURGER: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_u_r_g_e_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
