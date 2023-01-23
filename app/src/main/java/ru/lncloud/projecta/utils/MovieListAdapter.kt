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


class MovieListAdapter(context: Context) :
    RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val listMovies: MutableList<MovieInfo> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = inflater.inflate(R.layout.content, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listMovies[position])

    }

    override fun getItemCount(): Int = listMovies.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(movieInfo: MovieInfo) {
            val imageView: ImageView = itemView.findViewById(R.id.image_content)
            val titleView: TextView = itemView.findViewById(R.id.text_content)

            imageView.setImageResource(movieInfo.idPoster)
            titleView.text = movieInfo.title
        }

    }

    fun setMovies(listMovies: List<MovieInfo>) {
        this.listMovies.clear()
        this.listMovies.addAll(listMovies)
    }
}