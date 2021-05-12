package com.himanshu.gallery

import com.google.gson.annotations.SerializedName

class Model1 {
    @SerializedName("photos")
    var photos  = Img1()

    @SerializedName("stat")
    var stat = ""
}