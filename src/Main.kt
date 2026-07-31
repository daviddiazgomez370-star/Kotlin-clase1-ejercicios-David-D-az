//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
    ejercicio10()


}

fun ejercicio1() {
    print("----- Ejercicio1 -----")

    saludar()
}
fun saludar(){
    print("Ingrese su nombre: ")
    var nombre = readln()

    print("Ingrese su edad: ")
    var edad = readln()?.toIntOrNull()

    println("Hola, $nombre, tienes $edad años. Bienvenido a Kotlin")
}

fun ejercicio2() {
    print("----- Ejercicio2 -----")

    print("Ingrese el primer número: ")
    val num1 = readln()?.toDoubleOrNull()

    print("Ingreseel segundo número: ")
    val num2 = readln()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        println("Suma: ${num1 + num2}")
        println("Resta: ${num1 - num2}")
        println("Multiplicación: ${num1 * num2}")

        if (num2 != 0.0) {
            println("División: ${num1 / num2}")
        }else{
            println("No se puede dividir entre cero")
        }
    }else{
        println("Debe ingresar números válidos")
    }
}

fun ejercicio3() {
    print("----- Ejercicio3 -----")

    print("Edad: ")

    val edad = readln()?.toIntOrNull() ?: 0

    when{
        edad <=12 ->
            println("Niño")

        edad <=17 ->
            println("Adolescente")

        edad <=59 ->
            println("Adulto")

        else ->
            println("Adulto Mayor")
    }
}

fun ejercicio4() {
    print("----- Ejercicio4 -----")

    print("Número: ")

    var numero = readln()?.toIntOrNull() ?: 0

    while (numero >= 0){
        println(numero)

        numero--
    }
}

fun ejercicio5() {
    print("----- Ejercicio5 -----")

    var suma = 0.0

    for (i in 1..5){
        print("Nota $i: ")

        val nota = readln()?.toDoubleOrNull()?:0.0

        suma += nota
    }

    println("Suma: ${suma/5}")
}

fun ejercicio6() {

    print("----- Ejercicio6 -----")

    print("Nombre: ")
    val nombre = readln()

    print("Edad: ")
    val edad = readln()?.toIntOrNull()

    print("Altura: ")
    val altura = readln()?.toDoubleOrNull()

    print("Nombre: ${nombre ?: "No ingresado"}")
    println("Edad: ${edad ?: 0}")
    println("Altura: ${altura ?: 0.0}")
}

fun imprimirDatosPersonales(
    nombre:String="Sin nombre",
    edad:Int=0,
    ciudad:String="Sin ciudad"

){

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Ciudad: $ciudad")

}


fun ejercicio7() {
    print("----- Ejercicio7 -----")

    imprimirDatosPersonales()

    imprimirDatosPersonales(
        "David",
        20,
        "Medellín"
    )
}

fun ejercicio8() {
    print("----- Ejercicio8 -----")

    print("Número: ")

    val numero=readln()?.toIntOrNull()?:0

    for(i in 1..10){

        println("$numero x $i = ${numero*i}")

    }
}

fun ejercicio9() {
    print("----- Ejercicio9 -----")

    println("1. Celsius a Fahrenheit")
    println("2. Fahrenheit a Celsius")

    print("Opción: ")

    val opcion=readln()?.toIntOrNull()?:0

    print("Temperatura: ")

    val temperatura=readln()?.toDoubleOrNull()?:0.0

    when(opcion){

        1-> println("${temperatura*9/5+32} °F")

        2-> println("${(temperatura-32)*5/9} °C")

        else-> println("Opción inválida")

    }
}

fun ejercicio10() {
    print("----- Ejercicio10 -----")

    print("Nombre: ")
    val nombre=readln()?:""

    print("Edad: ")
    val edad=readln()?.toIntOrNull()?:0

    val categoria=when{

        edad<=12->"Niño"

        edad<=17->"Adolescente"

        edad<=59->"Adulto"

        else->"Adulto Mayor"

    }

    println()

    println("===== RESUMEN =====")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Categoría: $categoria")
    println("Mensaje: Hola $nombre, perteneces a la categoría $categoria.")
}

