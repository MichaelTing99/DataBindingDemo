package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("ali","123456","abc@gmail.com","Taman")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main) //use to get data from layout

        binding.personData = aPerson

//        binding.tvName.text = aPerson.name
//        binding.tvIC.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address

        binding.btnUpdate.setOnClickListener(){

            aPerson.email = "cba@gmail.com"

            binding.apply { invalidateAll() }
        }

    }
}