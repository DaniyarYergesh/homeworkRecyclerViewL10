package ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_recyclerview.Add1
import com.example.homework_recyclerview.R

class ViewHolder2(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(inflater.inflate(R.layout.item2, parent, false))
{
    private val addTextTextView = itemView.findViewById<TextView>(R.id.addText)
    private val addIconView = itemView.findViewById<ImageView>(R.id.path837)

    fun bind(item: Add1){
        addTextTextView.text = item.text
        addIconView.setBackgroundResource(item.flag)
    }
}