package ru.siksmfp.network.play.tcp.testing.file

import java.io.File

class FileWriter(
        filename: String
) {
    private val fileWriter = File(filename).bufferedWriter()

    fun writeRow(row: String) {
        fileWriter.write("$row\n")
    }
}