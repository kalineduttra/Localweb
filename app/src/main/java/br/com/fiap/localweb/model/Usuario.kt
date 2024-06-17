package br.com.fiap.localweb.model

data class Usuario(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var email = String = ""
)

