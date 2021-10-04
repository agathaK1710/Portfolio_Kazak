package com.android.portfolio_kazak.ui.education

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.portfolio_kazak.R

class EduAdapter(context: Context, private val list: List<EducationItem>) :
    RecyclerView.Adapter<EduAdapter.ViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(inflater.inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eduElement = list[position]
        holder.apply {
            title.text = eduElement.name
            year.text = eduElement.year
            image.setImageResource(eduElement.image)
        }
    }

    override fun getItemCount() = list.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.textView_education)
        val year: TextView = itemView.findViewById(R.id.education_year)
        val image:ImageView = itemView.findViewById(R.id.education_image)
    }
}