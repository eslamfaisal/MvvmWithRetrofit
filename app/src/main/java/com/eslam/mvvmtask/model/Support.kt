package com.eslam.mvvmtask.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Support : Serializable {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("text")
    @Expose
    var text: String? = null

}