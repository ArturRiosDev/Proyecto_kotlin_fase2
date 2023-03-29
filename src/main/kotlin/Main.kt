import clases.User

fun main(args: Array<String>) {

    val user = User()

    do {
        println()
        println("************************************")
        println(" Bienvenido a  *** SuperTianguis ***")
        println("************************************")
        println(" MENU ")
        println(" 1.- Registrar Usuario ")
        println(" 2.- Iniciar Session")
        println(" 3.- listar Usuarios")
        println(" 4.- Salir de aplicación")
        // val opcion = readLine()!!.toString()
        val opcion  = readLine()?.toInt() as Int
        when ( opcion ){
            1 -> {
                println("Registrar usuario nuevo")
                user.altaUser()
            }
            2 -> {
                println(" Iniciar Session")
                user.login()
                break
            }
            3 -> {
                user.listUsers()
            }
            4 -> {
                println(" Salir...")
                break

            }
            else -> {
                println(" salir...")
                break
            }

        }  // when

    } while(!opcion.equals(4) )
}