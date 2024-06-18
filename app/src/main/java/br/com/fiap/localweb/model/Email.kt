package br.com.fiap.localweb.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tbl_emails")
data class Email(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var remetente: String = "",
    var destinatario: String = "",
    var texto: String = "",
    var importante: Boolean = false,
    @ColumnInfo(name = "evento") var isEvento: Boolean = false
)
//Email com evento true será vinculado ao calendário
