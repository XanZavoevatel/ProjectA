package ru.lncloud.projecta

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import ru.lncloud.projecta.dao.MovieInfo
import ru.lncloud.projecta.databinding.ActivityMainBinding
import ru.lncloud.projecta.utils.MovieListAdapter

class MainActivity : AppCompatActivity() {

    //Создаем переменную для класса биндинг
    private lateinit var activityMainBinding: ActivityMainBinding

    //список фильмов
    private val listMovies: MutableList<MovieInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //инициализация переменной класса биндинга
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        //заполняем список фильмов контентом
        setInitialData()

        //создаем экземпляр адаптера
        val adapter = MovieListAdapter(this)

        //связываем наш пейджер в макете с адаптером
        activityMainBinding.viewPager.adapter = adapter

        //передаем список фильмов в адаптер
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

        activityMainBinding.switchTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
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
