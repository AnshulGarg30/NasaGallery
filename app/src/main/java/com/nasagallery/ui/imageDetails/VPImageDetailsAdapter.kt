package com.nasagallery.ui.imageDetails

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.nasaGallery.R
import com.nasaGallery.databinding.PageImageDetailsBinding
import com.nasagallery.models.ImageModel


class VPImageDetailsViewHolder(val binding: PageImageDetailsBinding) :
    RecyclerView.ViewHolder(binding.root)

class VPImageDetailsAdapter(
    private val images: List<ImageModel>,
) :
    RecyclerView.Adapter<VPImageDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VPImageDetailsViewHolder {
        val binding =
            PageImageDetailsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VPImageDetailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VPImageDetailsViewHolder, position: Int) {
        Glide.with(holder.itemView).load(images[position].url).centerCrop()
            .listener( object :RequestListener<Drawable>{
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    return false;
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.binding
                    return false;
                }

            })

            .into(holder.binding.image)
        holder.binding.tvExplanation.text = images[position].explanation
    }

    override fun getItemCount(): Int = images.size
}