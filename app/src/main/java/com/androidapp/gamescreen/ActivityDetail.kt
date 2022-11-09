package com.androidapp.gamescreen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.acxdev.commonFunction.adapter.PageAdapter
import com.acxdev.commonFunction.util.FunctionX.Companion.putExtra
import com.acxdev.commonFunction.util.FunctionX.Companion.useCurrentTheme
import com.acxdev.internship.R
import com.acxdev.internship.databinding.ActivityDetailBinding
import com.google.gson.Gson


class ActivityDetail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        useCurrentTheme()
        binding.back.setOnClickListener { onBackPressed() }

        val data = Gson().fromJson(intent.getStringExtra(Constant.DATA), Job::class.java)

        binding.image.setImageResource(data.image)
        binding.title.text = data.title
        binding.duration.text = "${data.uploaded} /"
        binding.location.text = data.location

        val page = PageAdapter(supportFragmentManager)
        page.addWithTitle(FragmentDescription().putExtra(Gson().toJson(data)), getString(R.string.descriptions))
        page.addWithTitle(FragmentShare(), getString(R.string.shareGame))
        binding.viewPager.adapter = page
        binding.tabLayout.setupWithViewPager(binding.viewPager)


        val playBTN: Button = findViewById(R.id.playgamebtn);

        playBTN.setOnClickListener {
                try {
                    val viewIntent = Intent(
                        "android.intent.action.VIEW",
                        Uri.parse("https://play.google.com/store/apps/details?id=com.n3twork.tetris")
                    )
                    startActivity(viewIntent)
                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext, "Unable to Connect Try Again...",
                        Toast.LENGTH_LONG
                    ).show()
                    e.printStackTrace()
                }
        }
    }
}