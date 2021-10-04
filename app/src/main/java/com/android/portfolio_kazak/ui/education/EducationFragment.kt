package com.android.portfolio_kazak.ui.education

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.portfolio_kazak.R

class EducationFragment : Fragment() {
    private lateinit var eduRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_education, container, false)
        eduRecyclerView = view.findViewById(R.id.recycler_view_education)
        eduRecyclerView.layoutManager = LinearLayoutManager(view.context)
        eduRecyclerView.adapter = EduAdapter(view.context, Storage.getData())

        return view
    }


}