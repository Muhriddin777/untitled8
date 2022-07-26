import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Age:")
    var a = scanner.nextInt()
    //switch o'rniga when ishlatiladi va case ishlatilmaydi
    when(a){
        1->{
            println("1")
        }

        2->{
            println("2")
        }

        3->{
            println("3")
        }
        4->{
            println("4")
        }
        5->{
            println("5")
        }
        in 10 .. 14->{
            //10 dan  14 gacha sonlarni olib beradi
            println("10 , 11 , 12 , 13 , 14 , 15")
        }
        //default o'rniga else ishlatiladi
        else->{
            println("ERROR")
        }
    }

}