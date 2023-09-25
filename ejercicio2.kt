val listaNumeros = mutableListOf<Int>(1,2,3,4,5)

fun main(){
    var option = "-1"

    while(option!="6"){
        println("Seleccione una opción : 1-Agregar nuevo número, 2-Calcular la suma de los números, 3-Calcular promedio de los números, 4-Encontrar números pares, 5-Mostrar cuadrado de los números o 6-Salir del programa:")
        option= readLine().toString()

        if(option == "1"){
            agregarNumero()
        }else if(option == "2"){
            sumarLista()
        }else if(option == "3"){
            promedioLista()
        }else if(option == "4"){
            encontrarPares()
        }else if(option == "5"){
            calcularCuadrado()
        }else if(option!="6"){
            println("Seleccione una opción válida por favor")
        }

        println()
    }
}
    fun agregarNumero(){

        println("Ingrese el número a añadir: ")
        val nuevoNumero = readLine().toString().toInt()

        listaNumeros.add(nuevoNumero)

        println("Se agrego exitosamente el nuevo número.")
        println("Lista: $listaNumeros")
    }

fun sumarLista(){

    val suma = listaNumeros.reduce{op,num -> op+num}
    println("Suma de numeros: $suma")
}

fun promedioLista(){

    val promedio = (listaNumeros.reduce{op,num -> op+num})/listaNumeros.size
    println("Promedio de numeros: $promedio")
}

fun encontrarPares(){

    val pares =  listaNumeros.filter{ it %2 == 0}
    println("Numeros pares en la lista: $pares")
}

fun calcularCuadrado(){

    val cuadrado =  listaNumeros.map{ it * it}
    println("El cuadrado de los numeros: $cuadrado")
}



