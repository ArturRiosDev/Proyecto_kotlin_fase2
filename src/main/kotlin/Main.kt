import kotlinx.coroutines.GlobalScope
import clases.UserManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

fun main(args: Array<String>) {

    val user = UserManager()

    do {
        println()
        println("************************************")
        println(" Bienvenido   *** SuperTianguis ***")
        println("************************************")
        println(" MENU ")
        println(" 1.- Registrar Usuario ")
        println(" 2.- Iniciar Sesión")
        println(" 3.- listar Usuarios")
        println(" 4.- Salir de aplicación")
        try {
            val opcion = readLine()?.toInt() as Int
            when (opcion) {
                1 -> {
                    println("Registrar usuario nuevo")
                    user.altaUser()
                }

                2 -> {
                    println(" Iniciar Sesión")
                    user.login()
                }

                3 -> {
                    println("Descargando usuarios.....")
                    GlobalScope.launch {
                        delay(1000)
                        user.listUsers()
                    }
                    Thread.sleep(2000)

                }

                4 -> {
                    println(" Closing Program...")
                    break
                }

                else -> {
                    println("Seleccionar una opcion valida  por favor.")
                }
            }  // when
        } catch (ex: InputMismatchException) {
            println("Enter valid number")
        } catch (ex: NumberFormatException) {
            println("Seleccionar una opcion válida  por favor")
        }

    } while (true)
}