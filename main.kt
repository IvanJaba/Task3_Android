fun main() {
    println("Введите количество чисел ряда Фибоначчи:")
    val n = readLine()?.toIntOrNull() ?: return
    if (n <= 0) {
        println("Количество чисел должно быть больше 0")
        return
    }

    val fibonacci = mutableListOf(0, 1) // Инициализируем массив с начальными значениями 0 и 1

    while (fibonacci.size < n) {
        val nextValue = fibonacci[fibonacci.size - 1] + fibonacci[fibonacci.size - 2] // Вычисляем следующее значение
        fibonacci.add(nextValue) // Добавляем его в массив
    }

    println("Ряд Фибоначчи из $n чисел: $fibonacci")
}



fun main() {
    println("Введите количество чисел ряда Фибоначчи:")
    val n = readLine()?.toIntOrNull() ?: return
    if (n <= 0) {
        println("Количество чисел должно быть больше 0")
        return
    }

    val fibonacci = generateSequence(0 to 1) { it.second to it.first + it.second }
        .map { it.first }
        .take(n)
        .toList() // Генерируем последовательность чисел ряда Фибоначчи и преобразуем ее в неизменяемый список

    println("Ряд Фибоначчи из $n чисел: $fibonacci")
}