package com.natashasapplication.app.modules.iphone14eighty.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14EightyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers: String? = MyApp.getInstance().resources.getString(R.string.lbl_burgers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestseller: String? = MyApp.getInstance().resources.getString(R.string.lbl_bestseller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassicCheeseb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_classic_cheeseb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuicyflamegr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_juicy_flame_gr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailable: String? = MyApp.getInstance().resources.getString(R.string.lbl_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup912: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNew: String? = MyApp.getInstance().resources.getString(R.string.lbl_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup911: String? = MyApp.getInstance().resources.getString(R.string.lbl_customize)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingHighto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rating_high_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceLowtoH: String? = MyApp.getInstance().resources.getString(R.string.msg_price_low_to_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceHighto: String? = MyApp.getInstance().resources.getString(R.string.msg_price_high_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearall: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)

)
