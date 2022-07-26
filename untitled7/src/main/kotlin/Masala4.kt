import java.util.*

fun main(args: Array<String>) {
    // Uchta raqam berilgan. Ularning eng kichigini toping.
    val `in` = Scanner(System.`in`)
    print("Birinchi sonni kiriting: ")
    val a = `in`.nextInt()
    print("Ikkinchi sonni kiriting: ")
    val b = `in`.nextInt()
    print("uchinchi sonni kiriting: ")
    val c = `in`.nextInt()
    if (a <= b && a <= c)
        println("$a is the smallest number.")
    else if (b <= a && b <= c)
        println("$b is the smallest number.") else
            println("$c is the smallest number."
    )
}