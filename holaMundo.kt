import modelo.Camara
import modelo.Movie
import modelo.Producto
import modelo.Shoe
import kotlin.math.sqrt

const  val N = "NAME"

fun main (args: Array<String>){
    println("Hola mompix")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)//los trata como variables primitivos
    val a=-4
    val b=2

    println ("como objeto "+a.plus(b))
    println(a.times(b))
    a.minus(b)
    var c  = a.unaryMinus()
    println ("b $c, "+ c)
      val d = false
      val e = d.not()
    println ("e $e ")


   val name = args[0]//accedo a la posición 0 de una colección de datos
    println (name)

    val nombre = "german"
    val apellido = "sotelo"
    val nombreapellido ="thiago \t sotelo"
    println ("tu nombre es $nombre,  $apellido")
    println ("tu nombre es $nombreapellido")

    //raw string
    val parrafo = """** primer programa kotlin dia
        |** 10 -04 hora 8:05, viernes santo, andrea esta
        |** jugando parchis, y ya no hay nadie 
        |** en la calle
    """.trimIndent()
    println (parrafo.trimMargin("** "))

    val unoADiez = 1..10

    for (i in unoADiez){
        println(i)

    }

    val aAlZ ='A'..'F'

    for (letra in aAlZ){
        println(letra)

    }

    val numero=12
    if (numero.equals(2)){//si es true
      print("son iguales ")
    }
    else print("no son iguales  ")

    if (numero !=2){//si es true
        println("+++++++++++")
    }
    else println("----------\n")

    when(numero) {
        in 1..5-> println("si está entre 1 y 5")
        in 6..10-> println("si está entre 6 y 10")
        !in 1..10-> println(" no está entre 1 y 10")
        else -> println("no esta")

    }
     var j =1
    while (j < 10){
        println("mensaje $j")
        j++

    }

    do{
        println("mensaje dowhile $j")
        j++
    } while (j < 1)

    val paises = arrayOf("Colombia","Chile","Perú")
    val dias = arrayOf<String>("Lunes", "Martes", "Miercoles")
     val numeros = intArrayOf(1,2,3,4,5,6,40,12)
     var suma=0;
    for (num in numeros){
        suma = suma + num
        println(num)
    }
    val promedio = suma/numeros.size
    println("promedio es "+promedio)


    var arreglo2 = arrayOf(10,20,30)//tipo de dato obejto
    var intprimitivo:IntArray = arreglo2.toIntArray()//lo pasamos a primitivo

    //clase 21
    var suma2 = arreglo2.sum() //suma del objeto arreglo2
    println("la suma del arreglo es: "+suma2)

    arreglo2=arreglo2.plus(40) // agregar un elemento al objeto arreglo2
    for (a in arreglo2) {
        println(" arreglo: $a")
    }

    arreglo2 = arreglo2.reversedArray()//metodo para reversar el arreglo del objeto
    for (a in arreglo2) {
        println(" arreglo en reversa: $a")
    }

    //clase 22 colocar expresiones
    var x=5
    println("x es igual a 5? ${x==5}")//true
    var mensaje = "el valor de x es $x"
    x++
    println("${mensaje.replace("es","fue")}, x es igual a: $x")


    //clase 23 funciones
    var raiz =4.0
    val numerosFuncion = intArrayOf(20,3,4,5,6,40,12)
    println("raiz cuadrada de $raiz: ${sqrt(raiz)}")
    println("el promedio de los numeros en función es: ${promedioNumero(numerosFuncion,4)}")
    println("${evaluar('+',2)}")

    //ejemplo lambdas
    var saludo = { println("hola mundo")}
    saludo()

    //var sumaLam = {instrucciones -> sentencias}
    var plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result =plus(3,4,5)
    println(result)
    println("otra forma: "+ plus(1,2,3))
    println("una tercera forma: "+{a: Int, b: Int, c: Int -> a+b+c}(10,11,12))

    val numeroCalculado = {n: Int ->
        when(n){
            in 1..3 -> println("tu numero esta entre 1 y 3 ")
            in 4..7 -> println("tu numero esta entre 4 y 7 ")
            in 8..10 -> println("tu numero esta entre 8 y 10 ")

        }
    }

    println(numeroCalculado(5))
    val camara = Camara ()
    camara.encendida()
    camara.apagada()
    println(camara.getestadoCamara())

    camara.setResolucion()
    println(camara.getResolucion())


    //clase 32 asigando get y set desde la clase shoe

    println("**************************************************************\n****************************************************")
    var shoe = Shoe("Shoe", "Zapatos azules", 34, "adidas" )

    println(shoe.toString())

    shoe.size =33
    println("medida de los zapatos: "+shoe.size)
    shoe.model ="Tennis"
    println("modelo: "+shoe.model)


    println("***********************************************************")
   val movie = Movie ("coco", "pixar", 120)
    println(movie.titulo)
    println(movie.creador)
    println(movie.duracion)

   var res:Int  = calculadora(1,2,3, ::multiplicar)
    println("la calculadora opero una multiplicación: $res")

    res = calculadora(4,5,6, ::restar)
    println("la calculadora opero una resta: $res")

    println("${calculadora(4,5,6, ::sumar)}")


}

//funcion de orden superior
fun calculadora (a:Int, b: Int, c: Int, operacion:(Int, Int, Int)->Int):Int{
    return operacion (a,b,c)
}

fun sumar (a:Int, b:Int, c:Int)=a+b+c
fun restar (a:Int, b:Int, c:Int)=a-b-c
fun multiplicar (a:Int, b:Int, c:Int)=a*b*c


//FUNCIONES EXTERNAS AL MAIN SIEMPRE
fun evaluar (caracter : Char = '=',number:Int =2):String{
    return "${number} es ${caracter}"


}


fun promedioNumero (numeros2: IntArray, n:Int):Int{
    var suma=0;
    for (num in numeros2){
       suma += num //igual a suma = suma + num
    }
    return (suma/numeros2.size)+n
}


