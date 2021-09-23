package com.eslam.mvvmtask.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class User : Serializable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("first_name")
    @Expose
    var firstName: String? = null

    @SerializedName("last_name")
    @Expose
    var lastName: String? = null

    @SerializedName("avatar")
    @Expose
    var avatar: String? = null

}