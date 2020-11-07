package com.alarmsystems.automated_alarm_systems

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_layout_item.view.*

class Settingsadapter () : RecyclerView.Adapter<MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val vh = MyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.my_layout_item, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.rowtext.text = "Setting " + position.toString()

    }

}

class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var rowtext = view.rowText


}
