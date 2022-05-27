package kg.itc.examplemvvm.ui.main.rv

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.itc.examplemvvm.data.models.CompanyEntity

class CompanyAdapter(private val listener:Listener) : RecyclerView.Adapter<CompanyVH>() {
    private var list = arrayListOf<CompanyEntity>()

    fun setData(list: List<CompanyEntity>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyVH {
        return CompanyVH.create(parent,listener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface Listener{
        fun onClick(index: Int)
    }

    override fun onBindViewHolder(holder: CompanyVH, position: Int) {
        val item = list[position]
        holder.bind(item)
    }
}