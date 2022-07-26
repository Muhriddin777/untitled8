import java.util.Scanner

fun main(args: Array<String>) {
    val  scanner = Scanner (System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c =0
    while (a<b){

        if (a%2==1){
            println(a)
            c++
        }
        a++
    }
    println("$c ta")
    println("muhriddin")

}