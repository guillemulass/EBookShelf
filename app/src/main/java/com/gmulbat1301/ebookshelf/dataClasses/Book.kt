package com.gmulbat1301.ebookshelf.dataClasses

data class Book(
    var titulo: String = "",
    var autor: String = "",
    var sinopsis: String = "",
    var fechaSalida: String = "",
    var resenaPersonal: String = "",
    var comentarios: String = ""
) {
    constructor() : this("", "", "", "")
}
