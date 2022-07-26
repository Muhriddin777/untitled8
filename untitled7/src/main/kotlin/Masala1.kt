import java.util.Scanner

fun main(args: Array<String>) {
    //
    val scanner = Scanner(System.`in`)
    println("1--raqamni kiriting")
    val a = scanner.nextInt();
    println("2--raqamni kiriting")
    val b = scanner.nextInt()
    println("3--raqamni kiriting")
    val c = scanner.nextInt()
    if (a >= b && a >= c)
        println("$a Eng katta.")
    else if (b >= a && b >= c)
        println("$b Eng katta.") else
            println("$c Eng katta.")



}