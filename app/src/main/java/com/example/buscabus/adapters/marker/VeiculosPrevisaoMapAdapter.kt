package com.example.buscabus.adapters.marker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.example.buscabus.databinding.MarcadorVeiculoPrevisaoBinding
import com.example.buscabus.models.VeiculosPrevisao
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.model.Marker

class VeiculosPrevisaoMapAdapter(private val context: Context) : InfoWindowAdapter {

    override fun getInfoContents(marker: Marker): View? {
        val veiculo = marker.tag as? VeiculosPrevisao ?: return null
        val layoutInflater = LayoutInflater.from(context)
        val binding = MarcadorVeiculoPrevisaoBinding.inflate(layoutInflater, null, false)

        binding.textCodigoVeiculoPrevisao.text = "Código: ${veiculo.p}"
        binding.textHorarioVeiculoPrevisao.text = "Previsão de chegada: ${veiculo.t}"

        return binding.root
    }

    override fun getInfoWindow(p0: Marker): View? {
        return null
    }
}