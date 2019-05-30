 package com.example.startupapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
     fun findAge(view:View) {
         val ye:String=txtBox1.text.toString()
         val si:Int=ye.length
         if(si>9)
         {
             ageview.text=getString(R.string.Warning)
             return
         }
         val year:Int=ye.toInt()
         if(year<0)
         {
             ageview.text=getString(R.string.Warning)
             return
         }
         val cYear:Int=Calendar.getInstance().get(Calendar.YEAR)
         if(year>cYear)
         {
             ageview.text=getString(R.string.Warning)
             return
         }


         val age:Int=cYear-year
         ageview.text= "AGE:" + age + " years"

     }

}
