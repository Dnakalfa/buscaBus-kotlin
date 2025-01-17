package com.example.buscabus.rederers

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.buscabus.R
import com.example.buscabus.models.VeiculosPosicao
import com.example.buscabus.utils.BitmapHelper
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.clustering.view.DefaultClusterRenderer

class VeiculoRenderer(
    private val context: Context,
    map: GoogleMap,
    clusterManager: ClusterManager<VeiculosPosicao>
) : DefaultClusterRenderer<VeiculosPosicao>(context, map, clusterManager) {

    private val onibusIcon: BitmapDescriptor by lazy {
        val color = ContextCompat.getColor(context, R.color.primary)
        BitmapHelper.vectorToBitmap(context, R.drawable.baseline_directions_bus_64, color)
    }

    override fun onBeforeClusterItemRendered(item: VeiculosPosicao, markerOptions: MarkerOptions) {
        markerOptions.title(item.title).position(item.position).icon(onibusIcon)
    }

    override fun onClusterItemRendered(clusterItem: VeiculosPosicao, marker: Marker) {
        marker.tag = clusterItem
    }
}