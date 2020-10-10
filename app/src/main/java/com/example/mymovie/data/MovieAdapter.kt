package com.example.mymovie.data

import android.content.Context
import android.icu.number.NumberFormatter.with
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mymovie.R
import com.example.mymovie.model.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item.view.*
import java.util.ArrayList

class MovieAdapter(val context: Context, private val arrayMovie: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    class MovieViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var movie: Movie? = null
        fun bind(movie: Movie) {
            this.movie = movie
            Picasso.get().load(movie.posterUrl).fit().centerInside().into(view.poster)
            view.title.text = movie.title
            view.year.text = movie.title
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }



    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
       var current = arrayMovie[position]
        holder.bind(current)
    }

    override fun getItemCount(): Int {
        return arrayMovie.size
    }


}