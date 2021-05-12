package com.himanshu.gallery

import com.google.gson.annotations.SerializedName

class Img {
    @SerializedName("id")
    var id = ""
    @SerializedName("owner")
    var owner =  ""
    @SerializedName("secret")
    var secret =  ""
    @SerializedName("server")
    var server = ""
    @SerializedName("farm")
    var farm =  ""
    @SerializedName("title")
    var title = ""
    @SerializedName("ispublic")
    var ispublic =  ""
    @SerializedName("isfriend")
    var isfriend =  ""
    @SerializedName("isfamily")
    var isfamily = ""
    @SerializedName("url_s")
    var url_s =  ""
    @SerializedName("height_s")
    var height_s = ""
    @SerializedName("width_s")
    var width_s = ""
}