package ru.lncloud.projecta.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import ru.lncloud.projecta.R
import ru.lncloud.projecta.dao.MovieInfo


class MovieListAdapter(itemView: View, context: Context) :
    RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val listMovies: MutableList<MovieInfo> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = inflater.inflate(R.layout.content, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movieInfo = listMovies[position]
        holder.imageView.setImageResource(movieInfo.idPoster)
        holder.titleView.text = movieInfo.title
    }

    override fun getItemCount(): Int = listMovies.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var titleView: TextView

        init {
            imageView = itemView.findViewById(R.id.image_content)
            titleView = itemView.findViewById(R.id.text_content)
        }

    }
}