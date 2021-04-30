package com.wuk.mywebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.wuk.base.WkServiceLoader
import com.wuk.common.autoservice.IWebViewService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)
        tv.setOnClickListener{
            val load = WkServiceLoader.load(IWebViewService::class.java)
            load?.let {
                it.startWebViewActivity(this@MainActivity,"https://www.baidu.com","tittle",true)
            }
        }
    }
}