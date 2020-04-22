package modelo

class Camara{
    private var estado: Boolean = false
    private var resolucion: Int=640

    fun setResolucion (){
        this.resolucion=1080
    }

    fun getResolucion ():Int{
        return this.resolucion
    }


    fun encendida(){
        estado = true
    }

    fun apagada(){
        estado=false
    }

    fun getestadoCamara():String{
        return if (estado==true) "camara esta encendida"
               else " camara esta apagada"
    }

}