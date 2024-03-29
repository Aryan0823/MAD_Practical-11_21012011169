package com.example.mad_practical_11_21012011169


import org.json.JSONObject
import java.io.Serializable

class Person(jsonObject: JSONObject): Serializable {

    var Id:String
    var Name:String
    var EmailId:String
    var PhoneNo:String
    var Address:String
    var Latitude:Double
    var Longitude: Double

    init {
        Id = jsonObject.getString("id")
        EmailId = jsonObject.getString("email")
        PhoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        Name = profileJson.getString("name")
        Address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        Latitude = locationJson.getDouble("lat")
        Longitude = locationJson.getDouble("long")
    }
}