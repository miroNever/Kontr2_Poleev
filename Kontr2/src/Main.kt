suspend fun main(){
    val travel = Travel("Екатеринбург", "Москва", "10.03.2023", "12:30", 300)
    travel.F1()
    var n: Int
    do {
        println("Введите число больше 0: ")
        n = readLine()!!.toInt()
        if(n <= 0) println("Неправильный ввод! Повторите попытку")
    }while (n <= 0)
    travel.F2(n)
}