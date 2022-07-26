import java.util.*

fun main() {
    //Uchta raqam berilgan  (ya'ni , eng kichik va eng katta bo'lmagan sonni toping).
    val sc = Scanner(System.`in`)
    print("1--raqamni kiriting: ")
    val num1 = sc.nextInt()
    print("2--raqamni kiriting: ")
    val num2 = sc.nextInt()
    print("3--raqamni kiriting: ")
    val num3 = sc.nextInt()
    if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
        println(" O'ratacha raqam $num1")
    else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
        println(
            "Ortacha raqam $num2"
        ) else
        println("O'rtacha raqam $num3")

}