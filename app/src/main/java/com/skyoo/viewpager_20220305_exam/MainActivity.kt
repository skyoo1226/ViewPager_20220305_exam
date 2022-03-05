package com.skyoo.viewpager_20220305_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyoo.viewpager_20220305_exam.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

//        뷰페이저도 재사용성이 적용됨. 2~3장의 화면을 가지고, 프래그먼트를 상황에 따라 새로 만들거나
//        함수 추가 호출 하는 등의 동작.

//        3장 or 4장 등 원하는 페이지수 전체를 메모리에 유지하게 하는 명령어.
        mainViewPager.offscreenPageLimit = 3


//        탭레이아웃 / 뷰페이져 연결
        mainTabLayout.setupWithViewPager(mainViewPager)


    }

}