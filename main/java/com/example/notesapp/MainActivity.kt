package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = ArrayList<Notes>()
        item.add(
            Notes(
                R.drawable.pdf,
                "Computer Organisation",
                "https://firebasestorage.googleapis.com/v0/b/my-notes-36b05.appspot.com/o/Computer%20Organization%20-%20basics.pdf?alt=media&token=0574e387-1556-423e-bac8-36e03f03075e"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "Microprocessor Notes",
                "https://firebasestorage.googleapis.com/v0/b/my-notes-36b05.appspot.com/o/microprocessor.pdf?alt=media&token=25698549-94b7-47f0-aadc-046868ac6bc9"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "Process Concepts",
                "https://firebasestorage.googleapis.com/v0/b/my-notes-36b05.appspot.com/o/Process%20Concepts.pdf?alt=media&token=66a75ae1-817c-4a1f-b7d8-0e62e6a8e95e"
            )
        )
        item.add(
            Notes(
                R.drawable.pdf,
                "Flower Image",
                "https://firebasestorage.googleapis.com/v0/b/my-notes-36b05.appspot.com/o/flower.jpg?alt=media&token=4abb64a4-e403-469e-8b44-e3b49c422d71"
            )
        )
        val recycler_view  = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        val adapter = NotesAdapter(item,this)
        recycler_view.adapter = adapter
    }
}

