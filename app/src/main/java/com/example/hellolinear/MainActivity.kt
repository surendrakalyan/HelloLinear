package com.example.hellolinear

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var container: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.layoutContainer)

        val btnLinear = findViewById<Button>(R.id.btnLinear)
        val btnRelative = findViewById<Button>(R.id.btnRelative)
        val btnConstraint = findViewById<Button>(R.id.btnConstraint)

        btnLinear.setOnClickListener { showLinearLayout() }
        btnRelative.setOnClickListener { showRelativeLayout() }
        btnConstraint.setOnClickListener { showConstraintLayout() }

        // Show LinearLayout by default
        showLinearLayout()
    }

    private fun showLinearLayout() {
        container.removeAllViews()
        val view = LayoutInflater.from(this).inflate(R.layout.linear_layout, container, false)
        container.addView(view)

        val tv = view.findViewById<TextView>(R.id.tvHelloLinear)
        val btn = view.findViewById<Button>(R.id.btnChangeLinear)
        btn.setOnClickListener { tv.text = "Text Changed in Linear!" }
    }

    private fun showRelativeLayout() {
        container.removeAllViews()
        val view = LayoutInflater.from(this).inflate(R.layout.relative_layout, container, false)
        container.addView(view)

        val tv = view.findViewById<TextView>(R.id.tvHelloRelative)
        val btn = view.findViewById<Button>(R.id.btnChangeRelative)
        btn.setOnClickListener { tv.text = "Text Changed in Relative!" }
    }

    private fun showConstraintLayout() {
        container.removeAllViews()
        val view = LayoutInflater.from(this).inflate(R.layout.constraint_layout, container, false)
        container.addView(view)

        val tv = view.findViewById<TextView>(R.id.tvHelloConstraint)
        val btn = view.findViewById<Button>(R.id.btnChangeConstraint)
        btn.setOnClickListener { tv.text = "Text Changed in Constraint!" }
    }
}