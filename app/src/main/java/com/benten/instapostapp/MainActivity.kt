package com.benten.instapostapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profileImage: CircleImageView = findViewById(R.id.ivProfileImage)
        val postImage: ImageView = findViewById(R.id.ivPostImage)
        val likeImage: ImageView = findViewById(R.id.ivLike)

        likeImage.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        profileImage.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        Glide.with(this)
            .load("https://www.whitehouse.gov/wp-content/uploads/2021/01/16_abraham_lincoln.jpg")
            .into(profileImage)
        Glide.with(this)
            .load("https://assets.vogue.com/photos/5a80610b0eb2eb69430d048d/16:9/w_1744,h_981,c_limit/irina-robot-pp-promo.jpg")
            .into(postImage)

    }
}