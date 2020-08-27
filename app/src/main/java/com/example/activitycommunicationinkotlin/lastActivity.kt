package com.example.activitycommunicationinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*

class lastActivity : AppCompatActivity() {
    lateinit var value:EditText
    lateinit var addbtn:Button
    lateinit var listView: ListView
    lateinit var arrayadapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        this.setTitle("Users enters value added to the listview")
        value = findViewById(R.id.editTextTextPersonName)
        listView = findViewById(R.id.listview)
        addbtn = findViewById(R.id.addbtn)

        val names = ArrayList<String>()

        arrayadapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names)


        addbtn.setOnClickListener {


                var data: Editable? = value.text
            if (value.length() != 0) {
                names.add(data.toString())
                listView.adapter = arrayadapter
            }

            else{
                value.setError("Please Enter a Value")
                //Toast.makeText(applicationContext,"Please Enter a Value ", Toast.LENGTH_LONG).show()

            }



        }
    }
}