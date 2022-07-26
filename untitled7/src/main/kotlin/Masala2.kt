import java.util.*

fun main(args: Array<String>) {
    //Uchta raqam berilgan. Ulardan o'xshash raqamlarni aniqlash.
    val sc = Scanner(System.`in`)
    print("Birinchi sonni kiriting: ")
    val a = sc.nextInt()
    print("Ikkinchi sonni kiriting: ")
    val b = sc.nextInt()
    print("Uchinchi sonni kiriting: ")
    val c = sc.nextInt()

    if (a == b) {
        println("1- va 2- bir xil")
    } else if (a == c) {
        println("1- va 3- bir xil")
    } else if (b == c) {
        println("2- va 3-  bir xil")
    } else {
        println("Bir xillar yõq")
    }
}