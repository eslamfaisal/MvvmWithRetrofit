package com.eslam.mvvmtask.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.eslam.mvvmtask.model.Support
import java.io.Serializable

class UsersResponse : Serializable {
    @SerializedName("page")
    @Expose
    var page: Int? = null

    @SerializedName("per_page")
    @Expose
    var perPage: Int? = null

    @SerializedName("total")
    @Expose
    var total: Int? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null

    @SerializedName("data")
    @Expose
    var data: List<User>? = null

    @SerializedName("support")
    @Expose
    var support: Support? = null

}