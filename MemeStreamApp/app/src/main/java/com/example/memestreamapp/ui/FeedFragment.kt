package com.example.memestreamapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.memestreamapp.network.RetrofitClient
import kotlinx.coroutines.launch
import android.util.Log
import com.example.memestreamapp.databinding.ActivityFeedFragmentBinding

class FeedFragment : Fragment() {

    private var _binding: ActivityFeedFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivityFeedFragmentBinding.inflate(inflater, container, false)

        // test API call
        lifecycleScope.launch {
            try {
                val memes = RetrofitClient.api.getMemes()
                Log.d("FeedFragment", "Loaded memes: $memes")
                binding.textView.text = "Loaded ${memes.size} memes from API 🎉"
            } catch (e: Exception) {
                Log.e("FeedFragment", "API error", e)
                binding.textView.text = "Failed to load memes 😢"
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

