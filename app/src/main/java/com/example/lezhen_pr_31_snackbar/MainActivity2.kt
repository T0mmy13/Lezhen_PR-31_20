package com.example.lezhen_pr_31_snackbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import android.graphics.Color
import android.widget.ImageButton
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    private lateinit var btnStandard : Button
    private lateinit var btnWithAction : Button
    private lateinit var btnCustom : Button
    private lateinit var imgbtn : ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStandard = findViewById(R.id.btnStandard)
        btnWithAction = findViewById(R.id.btnWithAction)
        btnCustom = findViewById(R.id.btnCustom)
        imgbtn = findViewById(R.id.IMGbutton)
        val rootView: View = findViewById(R.id.root_view)
        btnStandard.setOnClickListener(){
            Snackbar.make(rootView, "Это обычный SnackBar", Snackbar.LENGTH_SHORT).show()
        }

        btnWithAction.setOnClickListener(){
            val snackBar = Snackbar.make(rootView, "Это SnackBar с кнопкой", Snackbar.LENGTH_LONG)
            snackBar.setAction("Действие") {
                Snackbar.make(rootView, "Кнопка нажата", Snackbar.LENGTH_SHORT).show()
            }
            snackBar.show()
        }

        btnCustom.setOnClickListener(){
            val snackBar = Snackbar.make(rootView, "Это нестандартный SnackBar", Snackbar.LENGTH_LONG)
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(Color.BLUE)
            val textView = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            textView.setTextColor(Color.WHITE)
            snackBar.show()
        }
        imgbtn.setOnClickListener(){
            val snackBar = Snackbar.make(rootView, "Вы нажали на ImgButton", Snackbar.LENGTH_LONG)
            snackBar.setAction("ок") {
                Snackbar.make(rootView, "Спасибо чумба :)", Snackbar.LENGTH_SHORT).show()
            }
            snackBar.show()
        }

    }
}