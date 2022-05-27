package kg.itc.examplemvvm.ui.main.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.databinding.RecyclerCompanyBinding

class CompanyVH(private val binding : RecyclerCompanyBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(item: CompanyEntity) {
        with(binding){

            companyName.text = item.name
            region.text = item.region

            favoriteImg.setOnClickListener {
                Glide.with(itemView.context).load(R.drawable.ic_favorite_black).into(favoriteImg)
            }
        }
    }

    companion object{
        fun create(parent: ViewGroup, listener: CompanyAdapter.Listener):CompanyVH{
            val vw = LayoutInflater.from(parent.context).
            inflate(R.layout.recycler_company,parent,false)

            val binding = RecyclerCompanyBinding.bind(vw)
            return CompanyVH(binding).apply {
                itemView.setOnClickListener{
                    listener.onClick(adapterPosition)
                }
            }

        }
    }
}
