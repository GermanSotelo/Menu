package modelo

open class Producto (var name: String, var descripcion: String, var sku: Int) {

    override fun toString(): String {
        return "\nNombre del producto: $name\nDescrpción producto : $descripcion \nSku producto: $sku\n"
    }

    open fun create():String{
         return "creado"
    }

    open fun read():String{
        return "leido"
    }

    open fun update():String{
        return "actualizado"
    }

    open fun delete():String{
        return "eliminado"
    }
}