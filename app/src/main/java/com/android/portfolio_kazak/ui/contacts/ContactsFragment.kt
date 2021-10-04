package com.android.portfolio_kazak.ui.contacts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.android.portfolio_kazak.databinding.FragmentContactsBinding

class ContactsFragment : Fragment (){
    private var _binding: FragmentContactsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val instButton: ImageButton = binding.contactsInstagram
        val vkButton: ImageButton = binding.contactsVk

        instButton.setOnClickListener {
            val intent = Intent()
            with (intent) {
                action = Intent.ACTION_VIEW
                addCategory(Intent.CATEGORY_BROWSABLE)
                data = Uri.parse("https://instagram.com/agata.kazak?utm_medium=copy_link")
                startActivity(intent)
            }
        }

        vkButton.setOnClickListener {
            val intent = Intent()
            with (intent) {
                action = Intent.ACTION_VIEW
                addCategory(Intent.CATEGORY_BROWSABLE)
                data = Uri.parse("https://vk.com/agata_kazak")
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