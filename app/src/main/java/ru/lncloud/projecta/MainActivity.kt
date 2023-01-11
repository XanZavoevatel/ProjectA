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

        val linerLayout: ViewGroup = findViewById(R.id.liner_layout)

        val avatarContent = layoutInflater.inflate(R.layout.content, linerLayout, false)
        val content = avatarContent.findViewById<ViewGroup>(R.id.content)
        val image: ImageView = content.findViewById(R.id.image_content)
        image.setImageResource(R.drawable.avatar)
        val textView: TextView = content.findViewById(R.id.text_content)
        textView.text = "Avatar!"
        linerLayout.addView(avatarContent)

    }


}
