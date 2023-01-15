package ru.lncloud.projecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonMenu: Button = findViewById(R.id.button_top_menu)
        buttonMenu.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is menu", Toast.LENGTH_LONG).show()
        }

        val buttonSearch: Button = findViewById(R.id.button_search)
        buttonSearch.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is search", Toast.LENGTH_LONG).show()
        }

        val buttonBuyTicket: Button = findViewById(R.id.buy_ticket)
        buttonBuyTicket.setOnClickListener {
            Toast.makeText(this@MainActivity, "Ticket purchased", Toast.LENGTH_LONG).show()
        }

        val contentList: ViewGroup = findViewById(R.id.liner_layout)

        val avatarContent = layoutInflater.inflate(R.layout.content, contentList, false)
        val avatarViewGroup = avatarContent.findViewById<ViewGroup>(R.id.content)
        val image: ImageView = avatarViewGroup.findViewById(R.id.image_content)
        image.setImageResource(R.drawable.avatar)
        val textView: TextView = avatarViewGroup.findViewById(R.id.text_content)
        textView.text = resources.getString(R.string.avatar)

        val spartaContent = layoutInflater.inflate(R.layout.content,contentList, false)
        val spartaViewGroup = spartaContent.findViewById<ViewGroup>(R.id.content)
        val imageSparta: ImageView = spartaContent.findViewById(R.id.image_content)
        imageSparta.setImageResource(R.drawable.sparta)
        val textSparta: TextView = spartaViewGroup.findViewById(R.id.text_content)
        textSparta.text = resources.getString(R.string.sparta)

        val returnOfTheKingContent = layoutInflater.inflate(R.layout.content,contentList, false)
        val returnOfTheKingViewGroup = returnOfTheKingContent.findViewById<ViewGroup>(R.id.content)
        val imageReturnOfTheKing: ImageView = returnOfTheKingViewGroup.findViewById(R.id.image_content)
        imageReturnOfTheKing.setImageResource(R.drawable.returnoftheking_1)
        val textReturnOfTheKing: TextView = returnOfTheKingViewGroup.findViewById(R.id.text_content)
        textReturnOfTheKing.text = resources.getString(R.string.lord_ring)

        contentList.addView(avatarContent)
        contentList.addView(spartaContent)
        contentList.addView(returnOfTheKingContent)
    }


}
