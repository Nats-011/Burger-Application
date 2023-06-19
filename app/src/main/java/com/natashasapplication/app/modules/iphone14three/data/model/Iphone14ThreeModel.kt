package com.natashasapplication.app.modules.iphone14three.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_classic_cheese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBaconCheesebur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bacon_cheesebur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlueCheeseBur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blue_cheese_bur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMushroomSwiss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mushroom_swiss)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvocadoBaconB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avocado_bacon_b)

)
