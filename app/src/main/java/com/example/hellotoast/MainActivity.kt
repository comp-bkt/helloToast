package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.hellotoast.R
import com.example.hellotoast.MainActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")
        mShowCount = findViewById<View>(R.id.show_count) as TextView

        // Restore the state.
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("count")
            mShowCount!!.text = mCount.toString()
        }
    }

    public override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "onSaveInstanceState")
        outState.putInt("count", mCount)
    }

    public override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun showToast(view: View?) {
        val toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) mShowCount!!.text = Integer.toString(mCount)
    }

    companion object {
        private val LOG_TAG = MainActivity::class.java.simpleName
    }
}