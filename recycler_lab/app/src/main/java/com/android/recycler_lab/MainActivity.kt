package com.android.recycler_lab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val trackList = listOf(
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
            Track("Королева", "Алла Ости"),
        )

        val adapter = TrackAdapter(trackList)
        recyclerView.adapter = adapter
    }
}
