package com.natashasapplication.app.modules.iphone14thirtytwo.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ThirtytwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoyaltyRewards: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_loyalty_rewards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_your_loyalty_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeepcollecting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_keep_collecting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0500points: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_500_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0freecombo: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_free_combo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRedeem: String? = MyApp.getInstance().resources.getString(R.string.lbl_redeem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup191Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup188Value: String? = null
)
