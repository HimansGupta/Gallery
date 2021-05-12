package com.himanshu.gallery

import com.google.gson.annotations.SerializedName

class Img1 {
    @SerializedName("page")
    var page = ""
    @SerializedName("pages")
    var pages =  ""
    @SerializedName("perpage")
    var perpage =  ""
    @SerializedName("total")
    var total = ""
    @SerializedName("photo")
    var photo =  ArrayList<Img>()
}