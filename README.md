# 🟣 Taller 1 - 10 Ejercicios de Kotlin

## 📖 Descripción

Este repositorio contiene la solución de **10 ejercicios básicos de Kotlin**, desarrollados con el objetivo de practicar los fundamentos del lenguaje, el uso de variables, estructuras de control, funciones y el manejo seguro de datos mediante **Null Safety**.

Cada ejercicio fue implementado en una función independiente para mantener el código organizado, legible y fácil de comprender.

---

# 🎯 Objetivos

- Comprender la sintaxis básica de Kotlin.
- Utilizar correctamente variables (`val` y `var`).
- Implementar funciones para organizar el código.
- Aplicar estructuras condicionales (`if` y `when`).
- Utilizar ciclos (`for` y `while`).
- Manejar la entrada de datos desde consola.
- Aplicar Null Safety para evitar errores.
- Utilizar parámetros por defecto en funciones.
- Generar programas claros y reutilizables.

---

# 📂 Estructura del Proyecto

```
kotlin-clase1-10ejercicios-TUNOMBRE
│
├── src
│   └── Main.kt
│
└── README.md
```

---

# 📝 Ejercicios Desarrollados

## ✅ Ejercicio 1 - Saludo Personalizado

**Objetivo**

Solicitar el nombre y la edad del usuario para mostrar un saludo utilizando **String Templates**.

**Conceptos utilizados**

- Funciones
- Variables
- readLine()
- String Templates (`$variable`)

---

## ✅ Ejercicio 2 - Calculadora Básica

**Objetivo**

Solicitar dos números y realizar las siguientes operaciones:

- Suma
- Resta
- Multiplicación
- División

Además, se valida que no sea posible dividir entre cero.

**Conceptos utilizados**

- Operadores matemáticos
- if
- Conversión de datos
- Validación de datos

---

## ✅ Ejercicio 3 - Clasificador de Edad

**Objetivo**

Solicitar la edad del usuario y clasificarla como:

- Niño
- Adolescente
- Adulto
- Adulto Mayor

Utilizando la estructura `when`.

**Conceptos utilizados**

- when
- Comparaciones
- Condiciones

---

## ✅ Ejercicio 4 - Contador Regresivo

**Objetivo**

Solicitar un número y realizar una cuenta regresiva hasta llegar a cero utilizando un ciclo `while`.

**Conceptos utilizados**

- while
- Variables mutables (`var`)

---

## ✅ Ejercicio 5 - Promedio de Cinco Notas

**Objetivo**

Solicitar cinco notas al usuario y calcular su promedio mediante un ciclo `for`.

**Conceptos utilizados**

- for
- Acumuladores
- Operaciones matemáticas

---

## ✅ Ejercicio 6 - Validador de Datos (Null Safety)

**Objetivo**

Solicitar:

- Nombre
- Edad
- Altura

Manejando correctamente los casos donde el usuario no ingrese información.

**Conceptos utilizados**

- Null Safety
- Operador `?.`
- Operador Elvis `?:`

---

## ✅ Ejercicio 7 - Función con Parámetros por Defecto

**Objetivo**

Crear una función que reciba:

- Nombre
- Edad
- Ciudad

Todos con valores predeterminados.

**Conceptos utilizados**

- Funciones
- Parámetros por defecto

---

## ✅ Ejercicio 8 - Tabla de Multiplicar

**Objetivo**

Solicitar un número e imprimir su tabla de multiplicar del 1 al 10.

**Conceptos utilizados**

- for
- Operaciones matemáticas

---

## ✅ Ejercicio 9 - Conversor de Temperatura

**Objetivo**

Convertir temperaturas entre:

- Celsius → Fahrenheit
- Fahrenheit → Celsius

mediante una opción seleccionada por el usuario.

**Conceptos utilizados**

- when
- Operaciones matemáticas

---

## ✅ Ejercicio 10 - Resumen Final

**Objetivo**

Solicitar información del usuario y mostrar un resumen que incluya:

- Nombre
- Edad
- Categoría
- Mensaje personalizado

Combinando todos los conocimientos adquiridos durante la actividad.

**Conceptos utilizados**

- Funciones
- String Templates
- when
- Variables

---

# 💻 Tecnologías Utilizadas

- Kotlin
- IntelliJ IDEA Community Edition
- JVM

---

# ▶️ Cómo Ejecutar el Proyecto

1. Abrir el proyecto en **IntelliJ IDEA**.
2. Abrir el archivo **Main.kt**.
3. Ejecutar la función `main()`.
4. Ingresar los datos solicitados por cada ejercicio desde la consola.
5. Observar los resultados de cada uno de los ejercicios.

---

# 📚 Conceptos Aplicados

Durante el desarrollo de esta actividad se utilizaron los siguientes conceptos de Kotlin:

- Variables (`val` y `var`)
- Entrada de datos con `readLine()`
- Conversión de datos (`toIntOrNull()` y `toDoubleOrNull()`)
- String Templates
- Funciones
- Parámetros por defecto
- Operadores matemáticos
- Condicionales (`if` y `when`)
- Ciclos (`for` y `while`)
- Null Safety
- Operador Elvis (`?:`)
- Organización del código

---

# 📷 Evidencia de Ejecución

Agregar una captura de pantalla donde se observe la ejecución correcta de los diez ejercicios desde la consola.

Ejemplo:

```
====== LOS 10 EJERCICIOS ======

--- EJERCICIO 1 ---
Nombre: David
Edad: 20
Hola David, tienes 20 años.

--- EJERCICIO 2 ---
...
```

---

# ⏱️ Tiempo de Desarrollo

**Tiempo empleado:** _(Escribe aquí el tiempo que te tomó realizar la actividad.)_

Ejemplo:

> 3 horas.

---

# ⚠️ Dificultades Encontradas

Durante el desarrollo de la actividad se presentaron algunos desafíos como:

- Comprender el funcionamiento de `Null Safety`.
- Manejar correctamente la conversión de datos ingresados por el usuario.
- Organizar el código utilizando funciones independientes.

---

# 💡 Concepto que Más me Aportó

El concepto que más me ayudó a comprender Kotlin fue **Null Safety**, ya que permite evitar errores cuando el usuario no ingresa datos o introduce información incorrecta, haciendo que las aplicaciones sean más seguras y robustas.

---

# 👨‍💻 Autor

**Nombre:** David Díaz Gómez

**Programa de formación:** Análisis y Desarrollo de Software (ADSO)

**Institución:** SENA

---

# ✅ Resultado

Con esta actividad se reforzaron los fundamentos del lenguaje Kotlin mediante la implementación de ejercicios prácticos que integran variables, funciones, estructuras de control, ciclos y manejo seguro de datos, permitiendo desarrollar una base sólida para proyectos de mayor complejidad.