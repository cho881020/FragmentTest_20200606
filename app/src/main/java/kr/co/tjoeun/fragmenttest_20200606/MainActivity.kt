package kr.co.tjoeun.fragmenttest_20200606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.fragmenttest_20200606.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mainAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mainAdapter = MainViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = mainAdapter
    }

}
