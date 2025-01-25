package com.example.orange_ji.presentation.mainhome

import android.graphics.PorterDuff
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.orange_ji.R
import com.example.orange_ji.databinding.ItemHighlightedPostTextBinding
import com.example.orange_ji.databinding.ItemPostTextBinding
import com.example.orange_ji.domain.model.PostItem

class PostItemAdapter(
    private val onItemClick: (PostItem) -> Unit = {}
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items = mutableListOf<PostItem>()

    companion object {
        const val TYPE_NORMAL = 0
        const val TYPE_HIGHLIGHTED = 1
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].postType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HIGHLIGHTED -> {
                val binding = ItemHighlightedPostTextBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                ItemHighlightedPostTextViewHolder(binding)
            }

            else -> {
                val binding = ItemPostTextBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                ItemPostTextViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is ItemHighlightedPostTextViewHolder -> holder.bind(item, onItemClick)
            is ItemPostTextViewHolder -> holder.bind(item, onItemClick)
        }
    }

    override fun getItemCount(): Int = items.size

    fun setItems(postItems: List<PostItem>) {
        val previousSize = items.size
        items.clear()
        items.addAll(postItems)
        notifyItemRangeRemoved(0, previousSize)
        notifyItemRangeInserted(0, items.size)
    }

    class ItemPostTextViewHolder(private val binding: ItemPostTextBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PostItem, onItemClick: (PostItem) -> Unit) {
            var isLike = item.isLike
            Glide.with(binding.profileImageView.context)
                .load(R.drawable.default_user_image)
                .placeholder(R.drawable.default_user_image)
                .error(R.drawable.default_user_image)
                .transform(RoundedCorners(20))
                .into(binding.profileImageView)
            binding.name.text = item.name
            binding.content.text = item.content
            binding.time.text = "19.40"

            binding.likeContainer.setOnClickListener {
                if (isLike == 1) {
                    binding.likeIcon.setImageResource(R.drawable.ic_like_inactive_64)
                    binding.likeIcon.setColorFilter(
                        binding.root.context.getColor(R.color.light_gray),
                        PorterDuff.Mode.SRC_IN
                    )
                    binding.likeText.apply {
                        setTypeface(Typeface.DEFAULT, Typeface.NORMAL)
                        setTextColor(binding.root.context.getColor(R.color.light_gray))
                    }
                    isLike = 0
                } else {
                    binding.likeIcon.setImageResource(R.drawable.ic_like_active_64)
                    binding.likeIcon.setColorFilter(
                        binding.root.context.getColor(R.color.main_color),
                        PorterDuff.Mode.SRC_IN
                    )
                    binding.likeText.apply {
                        setTypeface(Typeface.DEFAULT, Typeface.BOLD)
                        setTextColor(binding.root.context.getColor(R.color.main_color))
                    }
                    isLike = 1
                }
            }
            binding.root.setOnClickListener { onItemClick(item) }
        }
    }

    class ItemHighlightedPostTextViewHolder(private val binding: ItemHighlightedPostTextBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PostItem, onItemClick: (PostItem) -> Unit) {
            Glide.with(binding.profileImageView.context)
                .load(R.drawable.default_user_image)
                .placeholder(R.drawable.default_user_image)
                .error(R.drawable.default_user_image)
                .transform(RoundedCorners(20))
                .into(binding.profileImageView)
            binding.name.text = item.name
            binding.content.text = item.content
            binding.time.text = "19.40"
            binding.root.setOnClickListener { onItemClick(item) }
        }
    }

}