package br.com.fiap.localweb.database.dao

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