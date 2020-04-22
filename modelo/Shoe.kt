package modelo

class Shoe (name: String, descripcion: String,  sku: Int, var marca: String): Producto ( name,  descripcion,  sku), ICrudActions{


    /*override fun create(): String {
        return "Create Shoe"
    }

    override fun read(): String {
        return "read Shoe"
    }

    override fun update(): String {
        return "update Shoe"
    }

    override fun delete(): String {
        return "delete Shoe"
    }*/




    override fun toString(): String {
        return super.toString() +"****marca esto se imprime despues porque en el codigo está shoe.ToString $marca****esto se imprime despues porque en el codigo está shoe.ToString "

    }
    init {
        println("sku id es: $sku  siempre va de primeras por el init")
        println("marca es: $marca siempre va de primeras por el init")
    }
    var size: Int = 34 //minimo sea 34
    set(value) {
        if (value >=34 )
        field = value
        else
            field =34
    }
    get ()=field
    var color: String ="White"

    var model: String ="Botas" //no se ponga tennis
     set (value){
         if (value.equals("Tennis"))
             field = "Botas"
         else field = value

     }
}
