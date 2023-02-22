package com.gorani.jetpack_retrofit_total

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gorani.jetpack_retrofit_total.adapter.CustomAdapter
import com.gorani.jetpack_retrofit_total.viewmodel.MainViewModel

/**
 * API)
 * https://raw.githubusercontent.com/googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json
 */

class MainActivity : AppCompatActivity() {

    private val rv: RecyclerView by lazy {
        findViewById(R.id.rv)
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getAllData()

        viewModel.plant.observe(this) {
            val customAdapter = CustomAdapter(this, it)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)

        }

    }
}