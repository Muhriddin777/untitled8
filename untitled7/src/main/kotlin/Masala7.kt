import java.util.*

fun main(args: Array<String>) {
    // uchta raqam berilgan ulardan eng katta 2 tasini yig'indisini toping
    var scanner = Scanner(System.`in`)
    print(" 1-raqamni kiriting: ")
    var a = scanner.nextInt()
    print(" 2-raqamni kiriting:")
    var b = scanner.nextInt()
    print(" 3-raqamni kiriting:")
    var c = scanner.nextInt()
    if (a < b && a < c)
    {
        println(b + c)
    } else if (b < a && b < c)
    {
        println(b + c)
    } else if (c < a && c < b)
    {
        println(a + b)
    }
}