package locker.androiduikit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import locker.searchview.TestingClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestingClass.printNewLine()
    }
}
