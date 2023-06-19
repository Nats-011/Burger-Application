package com.natashasapplication.app.modules.iphone14seventytwo.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SeventytwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddDeliveryIn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_delivery_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpyourdeliv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_your_deliv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecord: String? = MyApp.getInstance().resources.getString(R.string.lbl_record)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaphereandho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tap_here_and_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeaveatdoor: String? = MyApp.getInstance().resources.getString(R.string.lbl_leave_at_door)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeavewithguar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_leave_with_guar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvoidcalling: String? = MyApp.getInstance().resources.getString(R.string.lbl_avoid_calling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontringthe: String? = MyApp.getInstance().resources.getString(R.string.msg_don_t_ring_the)

)
