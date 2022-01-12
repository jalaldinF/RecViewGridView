package com.example.recviewgridview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewgridview.R
import com.example.recviewgridview.adapter.CustomAdapter
import com.example.recviewgridview.moduls.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        val member = prepareMemberList()
        refreshAdapter(member)
    }
    fun initView(){
        recyclerView.layoutManager = GridLayoutManager(this,3)
    }

    fun prepareMemberList():List<Member>{
        val member = ArrayList<Member>()

     for (i in 0..30){
         member.add(Member("Zaki"+i,"Tora"+i))
     }
        return member
    }
    fun refreshAdapter(member: List<Member>){
        val adapter = CustomAdapter(member)
        recyclerView.adapter = adapter
    }
}