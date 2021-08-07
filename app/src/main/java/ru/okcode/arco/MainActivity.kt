package ru.okcode.arco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.okcode.arco.core.MyClassCore
import ru.okcode.arco.viewbinding.ViewBindingDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vbd = ViewBindingDelegate()
        val mcc = MyClassCore()
    }
}