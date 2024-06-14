package com.example.rahul1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.content.Intent
import android.net.Uri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.rahul1.kotlinexs.employee
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //activiy is getting created -- chick is in the egg -- mem being allocated for activity
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //inflate this xml
        setContentView(R.layout.activity_main)
        Log.i(TAG,"activity is getting created")
        // inflateXml()

    }

    //chick came out of the egg --activity is visible to the user to interact - click
    override fun onStart() {
        super.onStart()
        Log.e(TAG,"activity is started")
    }

    //sleep night -- incomming call ur activity goes into the background for sometime
    override fun onPause() {
        super.onPause()
        Log.w(TAG,"activity has paused")

    }

    //chick has woken up -- activity comes back to the foreground
    override fun onResume() {
        super.onResume()
        Log.w(TAG, "activity has resumed")

    }

    //death of the chick -- activity no lonnger exists in the ram -- pushed to hdd[hibernate]
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"activity is stopped")

    }



    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"activity is destroyed")
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickhandler","button clicked")
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))  //intent= intention
        startActivity(dialIntent)

        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("mykey","android-vit-rahul")
        throw NullPointerException("demo vit exception")
        startActivity(hIntent)
    }

    fun inflateXml(){
        var nameEditText = EditText(this)
        nameEditText.setHint("enter ur name")
        var pwdEditText = EditText(this)
        pwdEditText.setHint("enter ur pass")
        var loginButton = Button(this)
        loginButton.setText("login")
    }
}