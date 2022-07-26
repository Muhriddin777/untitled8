import java.util.*

fun main(args: Array<String>) {
    //Haqiqiy turdagi 2 ta o'zgaruvchi berilgan . A , B , C . Agar ularning o'sish yoki kanayish tartibda tartiblangan bo'lsa
    // ularni ikki barobarga oshiring. aks holda har bir o'zgaruvchining yangi qiymatini chiqaring

    val sk = Scanner(System.`in`)
    while (true) {
        val random = Random()
        print("Birinchi sonni kiriting: ")
        val a = sk.nextInt()
        print("ikkinchi sonni kiriting: ")
        val b = sk.nextInt()
        print("Uchinchi sonni kiriting: ")
        val s = sk.nextInt()
        if (a < b == b < s) {
            println("Usuvchi--")
            println(a * 2)
            println(b * 2)
            println(s * 2)
        } else if (a > b && b > s) {
            println("kamayuvchi__")
            println(a * 2)
            println(b * 2)
            println(s * 2)
        } else if (a != b && b != s) {
            println("uzgarmas==")
            val r = random.nextInt(100)
            val d = random.nextInt(100)
            val q = random.nextInt(100)
            println(r)
            println(d)
            println(q)
        }
    }
}