package kg.itc.examplemvvm.ui.main.rv

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.domain.models.Company

class EntertainmentAdapter(private val listener: Listener) :
    RecyclerView.Adapter<EntertainmentVH>() {

    private var list = arrayListOf<CompanyEntity>()

    fun setData(list: List<CompanyEntity>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
        Log.e("setData","Ok")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntertainmentVH {
        return EntertainmentVH.create(parent,listener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface Listener{
        fun onClick(index: Int)
    }

    override fun onBindViewHolder(holder: EntertainmentVH, position: Int) {
        val item = list[position]
        Log.e("setData","Ok - $position")
        holder.bind(item)
    }
}