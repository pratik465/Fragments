package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var item = arrayOf("Learning1", "Reading2")
    var fragment = arrayOf(ReadingkFragment(), LearningFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.ViewPage.adapter = Fragment1(supportFragmentManager, fragment, item)
        binding.TabLayout.setupWithViewPager(binding.ViewPage)

    }
}