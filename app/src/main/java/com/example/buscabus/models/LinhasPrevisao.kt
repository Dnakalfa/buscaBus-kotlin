package com.example.buscabus.models

data class LinhasPrevisao(
    val c: String,
    val cl: Int,
    val lt0: String,
    val lt1: String,
    val qv: Int,
    val sl: Int,
    val vs: List<VeiculosPrevisao>
)