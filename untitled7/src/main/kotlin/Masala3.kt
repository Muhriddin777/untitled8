import java.util.*

fun main(args: Array<String>) {
    //2 ta int tpidagi o'zgaruvchilar berilgan. A va B  ularning qiymatlari teng bo'lmasa , har bir o'zgaruvchiga ushbu qiymatlar
// yig'indisi, agar ular teng bo'lsa , o'zgaruvchiga nol qiymatni belgilang
    val sc = Scanner(System.`in`)
    print("Birinchi sonni kiriting: ")
    val a = sc.nextInt()
    print("Ikkinchi sonni kiriting: ")
    val b = sc.nextInt()
    if (a != b) {
        println(a + b)
    } else {
        println(0)
    }
}