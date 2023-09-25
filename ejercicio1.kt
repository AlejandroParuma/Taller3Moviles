class Contacto(val nombre: String, val telefono: Int, val correo: String){
    
    fun mostrarInfo(){
        println("Nombre: ${nombre} Telefono: ${telefono} Correo: ${correo}")
    }

}

val listaContactos = mutableListOf<Contacto>()

fun main(){
     var option = "-1"

        while(option!="5"){
            println("Seleccione una opción : 1-Agregar nuevo contacto, 2-Mostrar lista de contactos, 3-Buscar un contacto por nombre, 4-Eliminar un contacto por nombre o 5-Salir del programa:")
            option= readLine().toString()

            if(option == "1"){
                agregarContacto()
            }else if(option == "2"){
                mostrarLista()
            }else if(option == "3"){
                buscarContacto()
            }else if(option == "4"){
                elimnarContacto()
            }else if(option!="5"){
                println("Seleccione una opción válida por favor")
            }

            println()
        }
    
}

fun agregarContacto(){

    println("Ingrese el nombre del nuevo contacto: ")
    val nombre = readLine().toString()
    println("Ingrese el telefono del nuevo contacto: ")
    val telefono = readLine().toString().toInt()
    println("Ingrese el correo del nuevo contacto: ")
    val correo = readLine().toString()

    var nuevoContacto = Contacto(nombre, telefono, correo)
    listaContactos.add(nuevoContacto)

    println("Se agrego exitosamente el nuevo contacto")
}

fun mostrarLista(){

    if( listaContactos.size>0){
        println("Lista de contactos registrados")
        for (contacto in listaContactos) {
            contacto.mostrarInfo()
        }
    }
    else{
        println("No hay contactos registrados")
    }
    
}

fun buscarContacto(){



    if( listaContactos.size>0){
        println("Ingrese el nombre del contacto a buscar: ")
        val buscar = readLine().toString()
        for (contacto in listaContactos) {
            if(contacto.nombre.equals(buscar, true) ){
                println("Contacto encontrado:")
                contacto.mostrarInfo()
                return
            }
            
        }
        println("No se encontro un contacto con ese nombre")
    }
    else{
        println("No hay contactos registrados")
    }
    
}

fun elimnarContacto(){



    if( listaContactos.size>0){
        println("Ingrese el nombre del contacto a eliminar: ")
        val buscar = readLine().toString()
        for (contacto in listaContactos) {
            if(contacto.nombre.equals(buscar, true) ){
                listaContactos.remove(contacto)
                println("Contacto eliminado")
                return
            }
            
        }
        println("No se encontro un contacto con ese nombre")
    }
    else{
        println("No hay contactos registrados")
    }
    
}