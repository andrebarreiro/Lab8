package com.projectgroup.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.projectgroup.lab8.Place.Place
import com.projectgroup.lab8.adapter.LineAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var myList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<Place>()

        for (i in 0 until 10 ) { //i=0; i<500; i++
            myList.add(Place("portugal", i + 10, "Lisboa $i", "Marcelo"))

        }

        val recview = findViewById<RecyclerView>(R.id.recycler_view)
        recview.adapter=LineAdapter(myList)
        recview.layoutManager = LinearLayoutManager(this)
    }


}