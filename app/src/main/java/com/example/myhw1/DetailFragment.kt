package com.example.myhw1

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myhw1.databinding.FragmentRegistrationBinding

class Details : Fragment() {

    private var _binding : FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    private val args : DetailsArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.root
        val view = binding.root

        val userDetails = args.user
        binding.etName.text = Editable.Factory.getInstance().newEditable(userDetails.name)
        binding.etEmail.text = Editable.Factory.getInstance().newEditable(userDetails.email)
        binding.etPassword.text = Editable.Factory.getInstance().newEditable(userDetails.password)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}