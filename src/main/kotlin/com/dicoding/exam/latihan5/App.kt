/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan5

import kotlinx.coroutines.*

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kriteria seperti berikut:
 *
 *     - Jadikan sebagai suspending function dengan menambahkan suspend operator
 *     - Menambahkan delay 3 detik
 *     - Mengembalikkan nilai kembalian hasil dari perhitungan denngan rumus valueA + valueB
 *
 */
suspend fun sum(valueA: Int, valueB: Int): Int {
    // Added 3 second delay
    delay(3000)
    // Returns the return value from a calculation using the formula valueA + valueB
    return valueA + valueB
}


/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kriteria seperti berikut:
 *
 *     - Jadikan sebagai suspending function dengan menambahkan suspend operator
 *     - Menambahkan delay 2 detik
 *     - Mengembalikkan nilai kembalian hasil dari perhitungan denngan rumus valueA * valueB
 *
 */
suspend fun multiple(valueA: Int, valueB: Int): Int {
    // Added 2 second delay
    delay(2000)
    // Returns the return value from the calculation using the formula valueA * valueB
    return valueA * valueB
}

fun main() = runBlocking {
    println("Counting...")
    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }
    println("Result sum: ${resultSum.await()}\n" +
            "Result multiple: ${resultMultiple.await()}")
}