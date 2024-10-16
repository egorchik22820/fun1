fun main() {
    println("1 - камень\n2 - ножницы\n3 - бумага")
    val userChoise = readln()?.toIntOrNull() ?: throw IllegalArgumentException("неверный ввод")

    val PCchoise = (1..3).random()
    println("вы выбрали $userChoise\nкомпьютер выбрал $PCchoise")

    game(PCchoise, userChoise)
}

fun game(PC: Int, user: Int) = when {
    user == PC -> println("ничья")
    user == 1 && PC == 2 || user == 2 && PC == 3 || user == 3 && PC == 1 -> println("вы выйграли")
    else -> println("компьютер выйграл")

}