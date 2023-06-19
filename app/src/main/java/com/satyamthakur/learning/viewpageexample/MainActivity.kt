package com.satyamthakur.learning.viewpageexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satyamthakur.learning.viewpageexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binder: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        val mylist = listOf<ImageModel>(
            ImageModel(R.drawable.everest),
            ImageModel(R.drawable.iceberg),
            ImageModel(R.drawable.moonshine),
            ImageModel(R.drawable.ribbon),
            ImageModel(R.drawable.waves)
        )

        binder.viewPager.apply {
            adapter = MyPagerAdaper(mylist, this@MainActivity)
            offscreenPageLimit = 3
            setPageTransformer(VerticalStackTransformer(3))
        }
    }
}