package br.com.fiap.localweb.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import br.com.fiap.localweb.model.Email

@Dao
interface EmailDao {
    @Insert
    fun enviar(email: Email): Long
    @Update
    fun editarRascunho(email: Email): Int
    @Delete
    fun excluir(email: Email): Int
    fun salvarRascunho(email: Email): Int
    fun listarEmails(): List<Email>
}