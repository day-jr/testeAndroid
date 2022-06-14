package com.example.myapplication.http

import com.example.myapplication.apiUrl
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.net.URL

class HttpHelper {
    fun post(json: String, path: String): String {
        //val URL = "http://dev.ipretty.com.br:8081"

        val URL = "${apiUrl}${path}"

        val headerHttp = MediaType.parse("application/json; charset=utf-8")
        val client = OkHttpClient()
        val body = RequestBody.create(headerHttp, json)
        val request = Request.Builder().url(URL).post(body).build()
        val response =  client.newCall(request).execute().body().toString()
        println(response)
        return response
    }

    fun get(path: String): String {
        val headerHttp = MediaType.parse("application/json; charset=utf-8")
        val URL = "${apiUrl}${path}"
        val client = OkHttpClient()
        val request = Request.Builder().url(URL).build()
        val response =  client.newCall(request).execute().body().toString()
        println(response)
        return response
    }
}