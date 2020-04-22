import modeloMenu.*

fun main  (args: Array<String>) {

    println("***Bienvenido a Recipe Maker")

    do {
        println("*********Selecciona las opción deseeada: \n" +
                "**********1. Hacer una receta\n" +
                "**********2. Ver mis recetas\n" +
                "**********3. Salir")
        var valor = readLine()!!.toInt()
        if (valor==1){
            println(hacerReseta())

            do{
                println("Por favor escoja una categoria")
                var categoria = readLine()!!.toInt()


                 if (categoria == 1) {
                  println("1.Agua")
                  var agua = readLine()!!.toInt()
                  categoria = 9
                 } else if (categoria == 2) {
                  println("1. Leche")
                  var leche = readLine()!!.toInt()
                  categoria = 9
                 } else if (categoria == 3) {
                  val carnes = Carnes()
                  println(carnes.toString())
                  var carne = readLine()!!.toInt()
                  categoria = 9
                  } else if (categoria == 4) {
                  val verduras = Verduras()
                  println(verduras.toString())
                  var verdura = readLine()!!.toInt()
                  categoria = 9
                  } else if (categoria == 5) {
                  val frutas = Frutas()
                  println(frutas.toString())
                  var fruta = readLine()!!.toInt()
                  categoria = 9
                  } else if (categoria == 6) {
                  val cereal = Cereal()
                  println(cereal.toString())
                  var cereales = readLine()!!.toInt()
                  categoria = 9
                  } else if (categoria == 7) {
                  val huevos = Huevos()
                  println(huevos.toString())
                  var huevo = readLine()!!.toInt()
                  categoria = 9
                  } else if (categoria == 8) {
                  val aceite = Aceites()
                  println(aceite.toString())
                  var aceites = readLine()!!.toInt()
                  categoria = 9
                  }
                    println("Desea agregar algún otro ingrediente?\n1.SI\n0.NO")
                    categoria = readLine()!!.toInt()



            }while (categoria!=0)

        } else if (valor==2) {
            println(mostrarReseta())
            valor =3
        }
    } while (valor!=3)

    println(">>>>>>>>>>GRACIAS<<<<<<<<<<")

}

fun hacerReseta(){
    println("-------------------------\nSeleccione por categoria\n-------------------------\n1.Agua\n2.Leche\n3.Carne\n" +
            "4.Verduras\n5.Frutas\n6.Cereal\n7.Huevos\n8.Aceites\n9.Salir")
}

fun mostrarReseta (){
    println("ver mis recetas")
    println()
}