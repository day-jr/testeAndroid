package com.example.myapplication.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {
    fun post(json:String): String {
        //val URL = "http://dev.ipretty.com.br:8081"
        val URL = "http://192.168.1.4:8081/categories"

        val headerHttp = MediaType.parse("application/json; charset=utf-8")
        val client = OkHttpClient()
        val body = RequestBody.create(headerHttp,json)
        val request = Request.Builder().url(URL).post(body).build()
        return client.newCall(request).execute().body().toString()
    }
}