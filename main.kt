fun sum(first_num: Double) { //Функция суммирования
    print("Введите второе число: \n")
    var second_num = readln().toDouble() //Вводим второе число
    var res = first_num + second_num
    println("$first_num + $second_num = $res")
}

fun sub(first_num: Double){ //Функия вычитания
    print("Введите второе число: \n")
    var second_num = readln().toDouble() //Вводим второе число
    var res = first_num - second_num
    println("$first_num - $second_num = $res")
}
fun mul(first_num: Double){ //Функция умножения
    print("Введите второе число: \n")
    var second_num = readln().toDouble() //Вводим второе число
    var res = first_num * second_num
    println("$first_num * $second_num = $res")
}
fun div(first_num: Double) { //Функция деления
    print("Введите второе число: \n")
    var second_num = readln().toDouble() //Вводим второе число
    if (second_num == 0.0) { //Проверка на ноль
        println("Нельзя делить на ноль!")
    } else {
        var res = first_num / second_num
        println("$first_num / $second_num = $res")
    }
}


fun main(args: Array<String>){ //Функия main и точка входа. "args: Array<String>" - не обязательно писать
    var bool = true
    while (bool) { //Цикл, который позволяет многократно выполнять вычисления, без перезапуска программы
        println("\n1 - Решаем \n2 - Выход")
        var cont = readln() //Управление циклом, если 1 - то выполняется программа, если 2 - в переменную bool поступает значение false и цикл останавливается
        if (cont == "1") {
            println("Введите первое число: ")
            var first_num = readln().toDouble() //Вводим первое число
            print("Выбирите действие: \n + - Сумма \n - - Вычитание \n * - Умножение \n / - Деление \n")
            do { //Цикл "do while" позволяет перевыбирать операцию, если введённый символ не соответствует какой-либо операции
            var operation = readln()
                when (operation) {
                    "+" -> sum(first_num) //Если "+" - выполнение функции sum()
                    "-" -> sub(first_num) //Если "-" - выполнение функции sub()
                    "*" -> mul(first_num) //Если "*" - выполнение функции mul()
                    "/" -> div(first_num) //Если "/" - выполнение функции div()
                    else -> println("Неверная команда") //При использовании какого-либо другого символа
                }
            }while(operation != "+" && operation != "-" && operation != "*" &&operation != "/")
        }else{
            bool = false
        }
    }
}