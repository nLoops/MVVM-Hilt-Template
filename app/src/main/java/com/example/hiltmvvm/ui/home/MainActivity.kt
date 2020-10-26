package com.example.hiltmvvm.ui.home

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.hiltmvvm.R
import com.example.hiltmvvm.data.Result
import dagger.hilt.android.AndroidEntryPoint

// Any app component will marked with this
// Service
// Activity and Fragments
// Broadcast receiver
// Content provider
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // inject view model using ktx
    private val homeViewModel: HomeViewModel by viewModels()

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textview)
        react("HELLO WORLD!")

        homeViewModel.loadData()
        homeViewModel.memberList.observe(this, { status ->
            when (status) {
                is Result.Loading -> react("SHOW LOADING VIEW")
                is Result.Success -> react("DATA SIZE IS ${status.data?.data?.size}")
                is Result.DataError -> react("SHOW ERROR VIEW WITH CODE ${status.errorCode}")
            }
        })
    }

    private fun react(msg: String) {
        textView.animate()
                .alpha(0.0f)
                .setDuration(200)
                .setListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) = Unit

                    override fun onAnimationEnd(animation: Animator?) {
                        textView.text = msg
                        textView.alpha = 1.0f
                    }

                    override fun onAnimationCancel(animation: Animator?) = Unit

                    override fun onAnimationRepeat(animation: Animator?) = Unit

                })
    }

}