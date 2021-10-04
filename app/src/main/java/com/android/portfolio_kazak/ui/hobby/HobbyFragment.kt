package com.android.portfolio_kazak.ui.hobby

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.portfolio_kazak.databinding.FragmentHobbyBinding

class HobbyFragment : Fragment() {

    private lateinit var hobbyViewModel: HobbyViewModel
    private lateinit var vkButton : ImageButton
    private lateinit var instButton: ImageButton
    private var _binding: FragmentHobbyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hobbyViewModel =
            ViewModelProvider(this).get(HobbyViewModel::class.java)

        _binding = FragmentHobbyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.hobby
        hobbyViewModel.text_hobby.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        vkButton = binding.buttonVk
        instButton = binding.buttonInstagram
        vkButton.setOnClickListener {
            val intent = Intent()
            with (intent) {
                action = Intent.ACTION_VIEW
                addCategory(Intent.CATEGORY_BROWSABLE)
                data = Uri.parse("https://vk.com/p1h7o1t0o2l0i0f1e")
                startActivity(intent)
            }
        }
        instButton.setOnClickListener {
            val intent = Intent()
            with (intent) {
                action = Intent.ACTION_VIEW
                addCategory(Intent.CATEGORY_BROWSABLE)
                data = Uri.parse("https://instagram.com/agata_kazak?utm_medium=copy_link")
                startActivity(intent)
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}