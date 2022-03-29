package kg.geectech.homework26

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kg.geectech.homework26.databinding.ActivityMainBinding
import kg.geectech.homework26.extensions.loadImage
import kg.geectech.homework26.extensions.makeToast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val aList =
        arrayListOf("https://i.imgur.com/uRcNSS9.jpeg", "https://i.imgur.com/XXQbNsy.jpeg",
            "https://i.imgur.com/3fdYaYm.jpeg","https://i.imgur.com/jH6bB2v.jpeg",
            "https://i.imgur.com/5G50IKk.jpeg","https://i.imgur.com/xxCxodp.jpeg",
            "https://i.imgur.com/l6aMFm6.jpeg","https://i.imgur.com/uMBSqQH.jpeg"
             ,"https://i.imgur.com/7k6DX7d.jpeg","https://i.imgur.com/nTjqKam.jpeg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btRandom.setOnClickListener {
            val randomImage = Random.nextInt(aList.size)
            val randomIndex = aList[randomImage]
            binding.IVForUri.loadImage(randomIndex)
        }

        binding.btSet.setOnClickListener {
            aList.add(binding.ET.text.toString())
            makeToast(binding.ET.text.toString())
        }

    }
}