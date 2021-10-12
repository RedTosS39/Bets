package com.example.betmatch

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import java.util.*

class CountriesAdapter(private val context: Activity, private val arrayList: ArrayList<Countries>)
    : ArrayAdapter<Countries>(context, R.layout.list_item, arrayList) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)

        val button: Button = view.findViewById(R.id.countryButton)

        button.setText(arrayList[position].country)

        return view
    }
}