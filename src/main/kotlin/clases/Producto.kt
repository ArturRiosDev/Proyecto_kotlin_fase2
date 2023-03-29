package clases


class Producto(private var id: String, private var name: String,private var price: Double){

    constructor() : this("","",0.0)

    companion object{
        var productos = mutableListOf<Producto>()

        init {
            initializeProductos()
        }

        private fun initializeProductos() {
            val product1: Producto = Producto("1","Gorra",10.20)
            val product2: Producto = Producto("2","Juguete",71.080)
            val product3: Producto = Producto("3","Celular",54.34)
            val product4: Producto = Producto("4","Comaddadora",30.25)
            val product5: Producto = Producto("5","Martillo",42.20)
            val product6: Producto = Producto("6","Plato",20.00)
            val product7: Producto = Producto("7","Lente",33.20)

            productos.add( product1)
            productos.add( product2)
            productos.add(product3)
            productos.add( product4)
            productos.add(product5)
            productos.add( product6)
            productos.add(product7)
        }
    }

    fun listProducts(){
        productos.forEach {
            println("Product: ${it.id} nombre: ${it.name} precio: ${it.price} ")
        }
    }

    fun totalProducts(products:List<Producto>, cantidad:Int){
            products.forEach {
                val total = String.format("%.2f", it.price * cantidad)
                println("Producto: ${it.name} Precio: ${it.price} Total: ${total}")
            }
    }

    fun findProduct(id:String): Any? {
       val productoEncontrado =  productos.find { it.id == id }
        if(productoEncontrado != null){
            return productoEncontrado
        }
        println("El producto que buscas no existe")
        return false
    }

}
