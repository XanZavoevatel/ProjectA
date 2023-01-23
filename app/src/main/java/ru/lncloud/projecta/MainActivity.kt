package ru.lncloud.projecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
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

//        val contentList: ViewGroup = findViewById(R.id.liner_layout)
//
//        val avatarContent = layoutInflater.inflate(R.layout.content, contentList, false)
//        val avatarViewGroup = avatarContent.findViewById<ViewGroup>(R.id.content)
//        val image: ImageView = avatarViewGroup.findViewById(R.id.image_content)
//        image.setImageResource(R.drawable.avatar)
//        val textView: TextView = avatarViewGroup.findViewById(R.id.text_content)
//        textView.text = resources.getString(R.string.avatar)
//
//        val spartaContent = layoutInflater.inflate(R.layout.content,contentList, false)
//        val spartaViewGroup = spartaContent.findViewById<ViewGroup>(R.id.content)
//        val imageSparta: ImageView = spartaContent.findViewById(R.id.image_content)
//        imageSparta.setImageResource(R.drawable.sparta)
//        val textSparta: TextView = spartaViewGroup.findViewById(R.id.text_content)
//        textSparta.text = resources.getString(R.string.sparta)
//
//        val returnOfTheKingContent = layoutInflater.inflate(R.layout.content,contentList, false)
//        val returnOfTheKingViewGroup = returnOfTheKingContent.findViewById<ViewGroup>(R.id.content)
//        val imageReturnOfTheKing: ImageView = returnOfTheKingViewGroup.findViewById(R.id.image_content)
//        imageReturnOfTheKing.setImageResource(R.drawable.returnoftheking_1)
//        val textReturnOfTheKing: TextView = returnOfTheKingViewGroup.findViewById(R.id.text_content)
//        textReturnOfTheKing.text = resources.getString(R.string.lord_ring)
//
//        contentList.addView(avatarContent)
//        contentList.addView(spartaContent)
//        contentList.addView(returnOfTheKingContent)
    }

    fun setInitialData() {
        listMovies.add(MovieInfo(R.drawable.avatar, resources.getString(R.string.avatar)))
        listMovies.add(MovieInfo(R.drawable.sparta, resources.getString(R.string.sparta)))
        listMovies.add(MovieInfo(R.drawable.returnoftheking_1, resources.getString(R.string.lord_ring)))
    }


}
