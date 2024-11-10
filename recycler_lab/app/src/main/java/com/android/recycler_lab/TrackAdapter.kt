package com.android.recycler_lab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Track(val title: String, val artist: String)

class TrackAdapter(private val tracks: List<Track>) : RecyclerView.Adapter<TrackAdapter.TrackViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_track, parent, false)
        return TrackViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        val track = tracks[position]
        holder.titleTextView.text = track.title
        holder.artistTextView.text = track.artist
    }

    override fun getItemCount(): Int = tracks.size

    inner class TrackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val artistTextView: TextView = itemView.findViewById(R.id.textViewArtist)
        val albumImageView: ImageView = itemView.findViewById(R.id.imageViewAlbum)
        val playButtonImageView: ImageView = itemView.findViewById(R.id.imageViewPlayButton)
    }
}
