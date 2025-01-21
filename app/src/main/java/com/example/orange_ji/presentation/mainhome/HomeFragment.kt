package com.example.orange_ji.presentation.mainhome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orange_ji.databinding.FragmentHomeBinding
import com.example.orange_ji.domain.model.PostItemDummyData
import com.example.orange_ji.utils.base.BaseVMFragment

class HomeFragment : BaseVMFragment<FragmentHomeBinding, HomeViewModel>() {
    private lateinit var adapter: PostItemAdapter

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun getViewModelClass(): Class<HomeViewModel> {
        return HomeViewModel::class.java
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize the RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = PostItemAdapter { postItem ->
            Toast.makeText(requireContext(), "Clicked: ${postItem.name}", Toast.LENGTH_SHORT).show()
        }
        binding.recyclerView.adapter = adapter
        adapter.setItems(PostItemDummyData.itemList)
    }

}