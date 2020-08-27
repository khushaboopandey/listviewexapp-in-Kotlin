package com.example.activitycommunicationinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_NAME = "name"
    }

    lateinit var Go_To_Another_Activity: Button

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("Example Of Dynamic List")

        Go_To_Another_Activity = findViewById(R.id.Btn1)

        Go_To_Another_Activity.setOnClickListener {

            startActivity(

                Intent(this, AnotherActivity::class.java)
                    .putExtra(KEY_NAME, Hero("Khus", "Khushaboo"))
            )
        }


        listView = findViewById(R.id.listview1)

        val names = arrayOf("sonam","raj","diveya","sonam","raj","diveya","sonam","raj","diveya","sonam","raj","diveya")
        listView.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names)

           listView.setOnItemClickListener { parent, view, position, id ->

               Toast.makeText(applicationContext,"You clicked : " +names[position],Toast.LENGTH_LONG).show()
           }
    }
}