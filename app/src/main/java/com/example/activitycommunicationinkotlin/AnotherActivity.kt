package com.example.activitycommunicationinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class AnotherActivity : AppCompatActivity() {
    lateinit var getValue: TextView
    lateinit var listView: ListView
    lateinit var lastActivitybtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        this.setTitle("Example Of Static List")


        getValue = findViewById(R.id.getvalue);

        listView = findViewById(R.id.listview)

        lastActivitybtn = findViewById(R.id.lastActivity);

        //for getting the value from MainActivity

        val hero = intent.getSerializableExtra(MainActivity.KEY_NAME) as Hero

        getValue.text = "Name is : " + hero.Name + " Real name is : " + hero.RealName



        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"You clicked : " +position,Toast.LENGTH_LONG).show()
        }

        lastActivitybtn.setOnClickListener {

            startActivity(Intent(this,lastActivity::class.java))
        }



    }

    //in this activity we have used static listview stapes is
    //go to string.xml file and write this code insides th resources
//    <array name="noofstudent">
//    <item>khushaboo  </item>

//    and go to xml select the entry of listview like below
//    @array/noofstudent and the app


}