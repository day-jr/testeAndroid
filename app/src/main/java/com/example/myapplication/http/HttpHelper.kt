package com.example.myapplication.http

import com.example.myapplication.apiUrl
import com.example.myapplication.model.categoryResponseBody.CategoryResponseBody
import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {
    fun post(json: String, path: String):  Int {
        //val URL = "http://dev.ipretty.com.br:8081"

        val URL = "${apiUrl}${path}"

        val headerHttp = MediaType.parse("application/json; charset=utf-8")
        val client = OkHttpClient()
        val body = RequestBody.create(headerHttp, json)
        val request = Request.Builder().url(URL).post(body).build()
        val response =  client.newCall(request).execute()
        val responseBody = response.code()
        //TODO Criar classe ResponseBody pro post e retornar aq
        return responseBody
    }

    fun get(path: String): CategoryResponseBody {

        //TODO flexibilizar o retorno dessas funções (fazer um get pra cada entidade é inviável)
        val URL = "${apiUrl}${path}"
        val client = OkHttpClient()
        val request = Request.Builder().url(URL).build()
        val response =  client.newCall(request).execute()
        val responseBody = response.body()?.string()

        return ObjectMapper().readValue(responseBody, CategoryResponseBody::class.java)
    }
}