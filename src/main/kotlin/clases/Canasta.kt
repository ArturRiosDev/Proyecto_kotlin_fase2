package clases

import java.util.*

class Canasta {
    var listOfProduct = mutableListOf<Producto>()
    val producto = ProductManager()

    fun inicioCompras(): String {

        do {
            println()
            println("SELECCIONAR  PRODUCTOS...")
            // se imprime la lista de productos
            producto.listProducts()
            println("s .-  salir")
            // seleccionar producto

            var opcProd: String = readLine()!!.toString().uppercase()

            if (!opcProd.equals("S")) {
                if (opcProd == "OK") {
                    println("compra realizada con exito")
                    listOfProduct = mutableListOf<Producto>()
                    break
                }
                var productoAComprar = producto.findProduct(opcProd)
                try {
                    if (productoAComprar == false) continue
                } catch (ex: ClassCastException) {
                    print("")
                    continue
                }
                listOfProduct.add(productoAComprar as Producto)
                println("CUANTOS DESEAS COMPRAR ?")
                val cantidad: Int = readLine()!!.toInt()
                println("================ Carrito de compras ===============================")
                producto.totalProducts(listOfProduct, cantidad)
                println("===============================================")

                if (listOfProduct.isNotEmpty()) {
                    println("SI DESEAS REALIZAR LA COMPRA ESCRIBE OK,\nSI DESEA CONTINUAR COMPRANDO ESCRIBA CUALQUIER CARACTER Y PRESIONE ENTER")
                    opcProd = readLine()!!.toString().uppercase()
                    if (opcProd == "OK") {
                        println("compra realizada con exito")
                        listOfProduct = mutableListOf<Producto>()
                        break
                    }
                }

            }

        } while (!opcProd.equals("S"))

        return "opcProd"
    }
}


