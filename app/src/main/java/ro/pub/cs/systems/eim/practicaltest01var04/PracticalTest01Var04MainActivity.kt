package ro.pub.cs.systems.eim.practicaltest01var04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.app.Activity
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.CheckBox
import android.widget.Toast

class PracticalTest01Var04MainActivity : AppCompatActivity() {


    private lateinit var topText: TextView
    private lateinit var bottomText: TextView
    private lateinit var display: Button
    private lateinit var topCheck: CheckBox
    private lateinit var bottomCheck: CheckBox
    private lateinit var show: String
    private lateinit var out: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var04_main)

        topText = findViewById(R.id.top_text) as TextView
        bottomText = findViewById(R.id.bottom_text) as TextView
        display = findViewById(R.id.display_button) as Button
        topCheck = findViewById(R.id.top_check) as CheckBox
        bottomCheck = findViewById(R.id.bottom_check) as CheckBox
        out = findViewById(R.id.out) as TextView

        display.setOnClickListener {
            show = ""
            if (topCheck.isChecked){
                if (topText.text.isNullOrBlank()) {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
                show = show + topText.text
            }
            if (bottomCheck.isChecked){
                if (bottomText.text.isNullOrBlank()) {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
                show = show + bottomText.text
            }
            out.text = show
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putCharSequence("top_text", topText.text)
        outState.putCharSequence("bottom_text", bottomText.text)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        topText.text = savedInstanceState.getCharSequence("top_text").toString()
        bottomText.text = savedInstanceState.getCharSequence("bottom_text").toString()
    }
}