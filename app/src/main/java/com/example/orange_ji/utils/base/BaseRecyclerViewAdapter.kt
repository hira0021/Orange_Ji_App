package com.example.orange_ji.utils.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T, VH : RecyclerView.ViewHolder> : RecyclerView.Adapter<VH>() {

    protected val items: MutableList<T> = mutableListOf()

    fun setItems(newItems: List<T>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    fun addItem(newItem: T) {
        items.add(newItem)
        notifyDataSetChanged()
    }

    fun getItem(position: Int): T {
        return items[position]
    }

    fun removeItem(removedItem: T) {
        items.remove(removedItem)
        notifyDataSetChanged()
    }

    fun containsItem(item: T): Boolean {
        return items.contains(item)
    }

    fun getAllItems(): List<T> {
        return items.toList()
    }

    override fun getItemCount() = items.size

}