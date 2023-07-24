package com.test.kkangkotlin


import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.test.kkangkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // xml 화면 출력
        setContentView(R.layout.activity_main)




        /**
         * 바인딩을 활용한 뷰 제어
         */

        /*
        // 바인딩 객체 획득
        val binding = ActivityMainBinding.inflate(layoutInflater)
        // 액티비티 화면 출력
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.button.visibility = View.INVISIBLE
            binding.imageView.visibility = View.VISIBLE
        }
        binding.imageView.setOnClickListener {
            binding.button.visibility = View.VISIBLE
            binding.imageView.visibility = View.INVISIBLE
        }
        */


        /**
         * id값으로 뷰 객체 획득
         */
//        val textView1: TextView = findViewById(R.id.text1)
//        val textView1 = findViewById<TextView>(R.id.text1)

        /**
         * 코드로 레이아웃 작성
         */
        /*
        // 이름 문자열 출력 TextView 생성
        val name = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text = "Lake Louise"
        }
        // 이미지 출력 ImageView 생성
        val image = ImageView(this).also {
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.lake_1))
        }
        // 주소 문자열 출력 TextView 생성
        val address = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text = "Lake Louise, AB, 캐나다"
        }
        val layout = LinearLayout(this).apply{
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            // LinearLayout 객체에 TextView, ImageView, TextView 객체 추가
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(address, WRAP_CONTENT, WRAP_CONTENT)
        }

        setContentView(layout)
        */
    }
}