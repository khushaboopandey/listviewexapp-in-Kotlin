package com.example.activitycommunicationinkotlin

import java.io.Serializable

class Hero(val Name: String, val RealName: String) : Serializable
//if you want to pass this parameter through
// intent to another activity then you need to
// implement serializable interface