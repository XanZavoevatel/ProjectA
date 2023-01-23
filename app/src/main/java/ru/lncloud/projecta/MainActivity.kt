package ru.lncloud.projecta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.lncloud.projecta.dao.MovieInfo
import ru.lncloud.projecta.databinding.ActivityMainBinding
import ru.lncloud.projecta.utils.MovieListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private val listMovies: MutableList<MovieInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        setInitialData()

        val adapter = MovieListAdapter(this)
        activityMainBinding.viewPager.adapter = adapter
        adapter.setMovies(listMovies)


        activityMainBinding.buttonTopMenu.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is menu", Toast.LENGTH_LONG).show()
        }

        activityMainBinding.buttonSearch.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is search", Toast.LENGTH_LONG).show()
        }

        activityMainBinding.buyTicket.setOnClickListener {
            Toast.makeText(this@MainActivity, "Ticket purchased", Toast.LENGTH_LONG).show()
        }
    }

    private fun setInitialData() {
        listMovies.add(MovieInfo(R.drawable.avatar, resources.getString(R.string.avatar)))
        listMovies.add(MovieInfo(R.drawable.sparta, resources.getString(R.string.sparta)))
        listMovies.add(
            MovieInfo(
                R.drawable.returnoftheking_1,
                resources.getString(R.string.lord_ring)
            )
        )
    }
}
