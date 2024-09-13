package com.example.custom_fetching

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.custom_fetching.databinding.ActivityMainBinding
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    var a: Button? = null
    var b: EditText? = null
    var c: Button? = null
    var d: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.btn1.setOnClickListener{
            var dialog =Dialog(this)
            dialog.setContentView(R.layout.data_entry_layout)
            var btn =dialog.findViewById<Button>(R.id.btn2)
            var editText1 =dialog.findViewById<EditText>(R.id.edtf1)
            var editText2=dialog.findViewById<EditText>(R.id.edtf2)
            var editText3 =dialog.findViewById<EditText>(R.id.edtf3)
            var editText4=dialog.findViewById<EditText>(R.id.edtf4)

            dialog.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            dialog.show()
            btn?.setOnClickListener{
                if(editText1?.text.isNullOrEmpty()){
                    editText1?.error = "Value Required"
                    Toast.makeText(this,"Enter a value",Toast.LENGTH_SHORT).show()
                }
                else if (editText2?.text.isNullOrEmpty()){
                    editText2?.error = "Value Required"
                    Toast.makeText(this,"Enter the value",Toast.LENGTH_SHORT).show()
                }
                else if (editText3?.text.isNullOrEmpty()){
                    editText3?.error = "Value Required"
                    Toast.makeText(this,"Enter the value",Toast.LENGTH_SHORT).show()
                }
                else if (editText4?.text.isNullOrEmpty()){
                    editText4?.error = "Value Required"
                    Toast.makeText(this,"Enter the value",Toast.LENGTH_SHORT).show()
                }
                else{
                    binding.edt1.setText(editText1.text.toString())
                    binding.edt2.setText(editText2.text.toString())
                    binding.edt3.setText(editText3.text.toString())
                    binding.edt4.setText(editText4.text.toString())
                }

                dialog.dismiss()
                dialog.setCancelable(true)
            }

        }
        }
    }





