package git.myapplication.recyclerviewbasic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import git.myapplication.recyclerviewbasic.databinding.ListItemBinding

class RecyclerViewAdapter(private val dataSet: ArrayList<List<String>>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: List<String>) {
            binding.tvMain.text = data[0]
            binding.tvSub.text = data[1]
        }
    }

}