//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var i = 1
    val array = List(20) { i++ }
    val strArray = listOf("one", "two", "three")
    // Задание 1
    println(array.drop(5).count{it%2==0})
    // Задание 2
    println(array.take(7).sum())
    // Задание 3
    val z3 = strArray.map{ it.toList() }.flatten()
    println(z3)

    // Задание 4
    val z4 = strArray.maxWithOrNull(compareBy {it.length})
    println(z4)

    // Задание 5
    val listProduct = listOf(
        Product("Яблоки", 10),
        Product("Апельсины", 8),
        Product("Персики", 13),
        Product("Бананы", 7)
    )
    val res = listProduct.map { it.count }.fold(0) { a, b -> a + b }
    println(res)
}

data class Product(val title:String, val count:Int)