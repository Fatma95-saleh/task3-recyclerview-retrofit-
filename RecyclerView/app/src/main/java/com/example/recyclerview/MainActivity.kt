package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_rview.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        val users=ArrayList<data>()
        users.add(data("فاطمه الزهراء",25,R.drawable.ic_baseline_person))
        users.add(data("فاطمه الزهراء",25,R.drawable.ic_baseline_person))
        users.add(data("فاطمه الزهراء",25,R.drawable.ic_baseline_person))
        users.add(data("فاطمه الزهراء",25,R.drawable.ic_baseline_person))

        var adapter=CustomeAdapter(users)
        recyclerView.layoutManager =LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=adapter
        adapter.notifyDataSetChanged()
    }
}