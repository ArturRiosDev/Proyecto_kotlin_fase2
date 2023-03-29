package clases
class User(private var name:String, private var password:String) {
    constructor() : this("","")
    val compra = Canasta()
    companion object{
        var activeUsers = mutableListOf<User>()

        init {
            initializeUsers()
        }

        private fun initializeUsers() {
            val user1: User = User("marco", "123")
            val user2: User = User("juan", "345")
            val user3: User = User("angie.","111")

            activeUsers.add(user1)
            activeUsers.add(user2)
            activeUsers.add(user3)

        }

    }

    fun listUsers (){
        activeUsers.forEach{ println(it.name) }
    }

    fun altaUser():Boolean {
        print(" Introduce  usuario: ")
        val usuario = readLine()!!.toString()

        print(" Introduce password: ")
        val newUserpassword = readLine()!!.toString()

        if (usuario.isEmpty() && newUserpassword.isEmpty()) {
            return false
        } else {
            val newUser = User(usuario,newUserpassword)
            activeUsers.add(newUser)
            println("Usuario creado con exito")
            return true
        }
    }

   public fun login(){
        print(" Introduce cuenta usuario: ")
        val usuario = readLine()!!.toString()

        print(" Introduce password: ")
        val userPassword = readLine()!!.toString()
// validar usuario
        if(isValidUser(usuario,userPassword)){
            println()
            println("***********************Bienvenido $usuario********************************")
            compra.inicioCompras()
        } else
            println("usuario/contraseña  incorrecto..intenta nuevamente.")
    }

    private fun isValidUser(user:String,userPassword:String):Boolean{
        val user = activeUsers.find { it.name == user }
        if(user != null && user.password == userPassword){
            return true
        }
        return false
    }
}