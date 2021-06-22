package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var  tapButton: Button
    private lateinit var  imageResult: ImageView
    private val imageByLocationMap = hashMapOf("Токовский каскадный водопад" to R.drawable.tokovskij_vodopad_ukraina2,
        "Криворожский водопад Белые камни" to R.drawable.vodopad_belie_kamni,
        "Вольногорские Мальдивы" to R.drawable.volnogorskie_maldivi,
        "Панорама на р. Днепр в Обуховке" to R.drawable.dnipro_v_kirovskom,
        "Кодацкая крепость в Старых Кодаках" to R.drawable.kodackskakrepost,
        "Природные овраги и холмы в Старых Кодаках" to R.drawable.prirodnieovragiiholmi,
        "Рыбальский гранитный карьер" to R.drawable.ribalskiygranitniy,
        "Криворожская скала Орлиное гнездо" to R.drawable.skalaorlinoegnezdo,
        "Соленый лиман в Новотроицком" to R.drawable.soleniylimannovotroizkoe,
        "Таромские карьеры" to R.drawable.taromskiekarieri)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textResult)
        imageResult = findViewById(R.id.imageView)
        tapButton = findViewById(R.id.button)
    }

    fun generateLocation(view: View) {

        val randomKey = imageByLocationMap.keys.toList().get((0 until (imageByLocationMap.size)).random())
        val path = imageByLocationMap.get(randomKey)

        resultTextView.setText(randomKey)

        if (path != null) {
            imageResult.setImageResource(path)
        }
    }
}