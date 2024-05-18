fun main() {
    println("Введите размеры первой матрицы (число строк и столбцов):")
    val (rows1, cols1) = readln().split(" ").map { it.toInt() }

    if (rows1 <= 0 || cols1 <= 0 ) {
        println("Недействительные значения")
        return
    }

    println("Введите элементы первой матрицы:")
    val matrix1 = Array(rows1) { DoubleArray(cols1) }
    for (i in 0 ..< rows1) {
        matrix1[i] = readln().split(" ").map { it.toDouble() }.toDoubleArray()
        if (matrix1[i].size != cols1) {
            println("Неверное количество чисел в строке")
            return
        }
    }

    println("Введите размеры второй матрицы (число строк и столбцов):")
    val (rows2, cols2) = readln().split(" ").map { it.toInt() }

    if (rows2 <= 0 || cols2 <= 0 ) {
        println("Недействительные значения")
        return
    }

    println("Введите элементы второй матрицы:")
    val matrix2 = Array(rows2) { DoubleArray(cols2) }
    for (i in 0 ..< rows2) {
        matrix2[i] = readln().split(" ").map { it.toDouble() }.toDoubleArray()
        if (matrix2[i].size != cols2) {
            println("Неверное количество чисел в строке")
            return
        }
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
    for (i in 0 ..< rows1) {
        for (j in 0 ..< cols1) {
            scalarProduct += matrix1[i][j] * matrix2[i][j]
        }
    }


    println("Скалярное произведение: $scalarProduct")
}
