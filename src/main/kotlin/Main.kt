import clases.User
import java.util.*

fun main(args: Array<String>) {

    val user = User()

    do {
        println()
        println("************************************")
        println(" Bienvenido   *** SuperTianguis ***")
        println("************************************")
        println(" MENU ")
        println(" 1.- Registrar Usuario ")
        println(" 2.- Iniciar Session")
        println(" 3.- listar Usuarios")
        println(" 4.- Salir de aplicación")
        try {
            val opcion  = readLine()?.toInt() as Int
            when ( opcion ){
                1 -> {
                    println("Registrar usuario nuevo")
                    user.altaUser()
                }
                2 -> {
                    println(" Iniciar Session")
                    user.login()
                }
                3 -> {
                    user.listUsers()
                }
                else -> {
                    println(" Closing Program...")
                    break
                }
            }  // when
        } catch (ex: InputMismatchException){
            println("Enter valid number")
        } catch (ex: NumberFormatException){
            println("Seleccionar una opcion valida  por favor")
        }

    } while(true )
}