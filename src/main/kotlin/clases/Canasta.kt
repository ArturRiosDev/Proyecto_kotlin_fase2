package clases
class Canasta{
    var listOfProduct = mutableListOf<Producto>()
    val producto = Producto()

    fun inicioCompras():String{
        do {
            println()
            println("SELECCIONAR  PRODUCTOS...")
            // se imprime la lista de productoss
            producto.listProducts()
            println("s .-  salir")
            // seleccionar producto
            val opcProd:String = readLine()!!.toString()

            if (!opcProd.equals("s") ) {
                if(opcProd == "OK"){
                    println("compra realizada con exito")
                    break
                }
            var productoAComprar = producto.findProduct(opcProd)
            listOfProduct.add(productoAComprar as Producto)
                println("CUANTOS DESEAS COMPRAR ?")
                val cantidad:Int = readLine()!!.toInt()
                println("================ Carrito de compras ===============================")
                producto.totalProducts(listOfProduct,cantidad)
                println("===============================================")
                if(listOfProduct.isNotEmpty()){
                    println("SI DESEAS REALIZAR LA COMPRA ESCRIBE OK")
                }
            }
        } while (!opcProd.equals("s"))
        return "opcProd"
    }
    }


