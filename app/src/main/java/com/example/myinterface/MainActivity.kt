package com.example.myinterface

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myinterface.ui.theme.MyInterfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {

            //Variable declaration

            val name: String = "John"
            val num1: Int = 145
            val num2: Int = 245
            val sum: Int = num1 + num2
            val age: Int = 20
            val height: Double = 5.7
            val isStudent: Boolean = true
            val grade: Char = 'A'


            val result = """
                Name: $name
                Age: $age
                Height: $height
                Student: $isStudent
                Grade: $grade
            """.trimIndent()

            textView.text = result

        }
    }
}
