package com.natashasapplication.app.modules.iphone14sixty.`data`.model

import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14SixtyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStudenrsdiscou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_studenrs_discou)

)
