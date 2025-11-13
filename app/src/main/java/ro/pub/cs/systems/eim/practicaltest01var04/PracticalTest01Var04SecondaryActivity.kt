package ro.pub.cs.systems.eim.practicaltest01var04

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import ro.pub.cs.systems.eim.practicaltest01var04.databinding.ActivityPracticalTest01Var04SecondaryBinding

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

class PracticalTest01Var04SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var04_secondary)


        // Preluăm totalul trimis din activitatea principală
        val top_text = findViewById<TextView>(R.id.text_1)
        val bottom_text = findViewById<TextView>(R.id.text_2)
        val top = intent.getCharSequenceExtra("top_text").toString()
        val bottom = intent.getCharSequenceExtra("bottom_text").toString()

        top_text.text = top
        bottom_text.text = bottom

        // Butonul OK — întoarce RESULT_OK
        findViewById<Button>(R.id.ok_button).setOnClickListener {

//            val returnIntent = Intent()
//            returnIntent.putExtra("message", "User pressed OK")
//            returnIntent.putExtra("clicks_acknowledged", totalClicks)
//            setResult(Activity.RESULT_OK, returnIntent)
//            finish()
//            putExtra("key", "Hello")
//            getStringExtra("key")
//
//            putExtra("key", "Hi" as CharSequence)
//            getCharSequenceExtra("key")

            setResult(Activity.RESULT_OK, Intent())
            finish()
        }

        // Butonul Cancel — întoarce RESULT_CANCELED
        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            setResult(Activity.RESULT_CANCELED, Intent())
            finish()
        }

    }
}