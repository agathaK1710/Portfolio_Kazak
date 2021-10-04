package com.android.portfolio_kazak.ui.plans

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.portfolio_kazak.databinding.FragmentPlansBinding

class PlansFragment : Fragment() {

    private lateinit var slideshowViewModel: PlansViewModel
    private var _binding: FragmentPlansBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProvider(this).get(PlansViewModel::class.java)

        _binding = FragmentPlansBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPlans
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}