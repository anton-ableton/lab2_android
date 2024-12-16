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
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
            Track("No Hay Ley", "Kali Uchis"),
        )

        val adapter = TrackAdapter(trackList)
        recyclerView.adapter = adapter
    }
}
