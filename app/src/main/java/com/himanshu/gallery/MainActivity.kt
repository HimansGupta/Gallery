package com.himanshu.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this)
        fetch()
        mAdapter = ImageAdapter()
        recyclerView.adapter = mAdapter
    }
    private fun fetch()
    {
        val url = "https://api.flickr.com/services/rest/"
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(myapi::class.java)
        val call = service.getImages()
        call.enqueue(object : Callback<Model1> {
            override fun onResponse(call: Call<Model1>, response: Response<Model1>) {
                if(response.isSuccessful) {
                    val movieResponse = response.body()!!
                    val imagesArray = ArrayList<Images>()
                    for( movie in movieResponse.photos.photo){
                        val images = Images(
                            movie.url_s

                        )
                        imagesArray.add(images)
                    }
                    mAdapter.updateImages(imagesArray)
                }
               else{
                   Toast.makeText(this@MainActivity,"loda",Toast.LENGTH_LONG).show()
                }



            }
            override fun onFailure(call: Call<Model1>, t: Throwable) {

            }


        })
    }
}