fun main() {
    println("Введите размеры первой матрицы (число строк и столбцов):")
    val (rows1, cols1) = readLine()!!.split(" ").map { it.toInt() }

    println("Введите элементы первой матрицы:")
    val matrix1 = Array(rows1) { DoubleArray(cols1) }
    for (i in 0 until rows1) {
        matrix1[i] = readLine()!!.split(" ").map { it.toDouble() }.toDoubleArray()
    }

    println("Введите размеры второй матрицы (число строк и столбцов):")
    val (rows2, cols2) = readLine()!!.split(" ").map { it.toInt() }

    println("Введите элементы второй матрицы:")
    val matrix2 = Array(rows2) { DoubleArray(cols2) }
    for (i in 0 until rows2) {
        matrix2[i] = readLine()!!.split(" ").map { it.toDouble() }.toDoubleArray()
    }

    
    if (cols1 != cols2) {
        println("Ошибка: количество столбцов в матрицах не совпадает.")
        return
    }
    if (rows1 != rows2) {
        println("Ошибка: количество строк в матрицах не совпадает.")
        return
    }


    var scalarProduct = 0.0
    for (i in 0 until rows1) {
        for (j in 0 until cols1) {
            scalarProduct += matrix1[i][j] * matrix2[i][j]
        }
    }


    println("Скалярное произведение: $scalarProduct")
}
