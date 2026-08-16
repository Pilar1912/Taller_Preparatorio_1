# Taller Preparatorio 1 - Sistemas de Gestión de Inventario

## 📋 Descripción General

Proyecto educativo en Java que implementa dos ejercicios prácticos para aprender conceptos fundamentales de programación orientada a objetos, estructuras de datos (matrices) y manejo de entrada/salida de usuarios.

---

## 📁 Estructura del Proyecto

```
Taller_Preparatorio_1/
├── README.md
├── Ejercicio1/
│   ├── Menu.java              # Punto de entrada y menú interactivo
│   ├── Metodos.java           # Lógica de negocio del inventario
│   └── ObjProductoInv.java    # Clase modelo para productos
└── Ejercicio2/
    ├── Menu.java              # Punto de entrada para búsqueda
    ├── Metodos.java           # Lógica de búsqueda de productos
    └── ObjProducto.java       # Clase modelo para productos
```

---

## 🎯 Ejercicio 1: Sistema de Gestión de Inventario

### Descripción
Sistema interactivo para gestionar un inventario de productos utilizando una matriz bidimensional (n×n). Permite registrar productos, visualizarlos y calcular totales.

### Funcionalidades

| Opción | Función | Descripción |
|--------|---------|-------------|
| 1 | Ingresar productos | Registra n² productos con nombre, cantidad y precio |
| 2 | Mostrar inventario | Visualiza todos los productos registrados |
| 3 | Calcular valor total | Suma todas las cantidades de productos |
| 4 | Salir | Cierra la aplicación |

### Clases

#### `ObjProductoInv.java`
Clase modelo que representa un producto en el inventario.

**Atributos:**
- `NombreProducto` (String): Nombre del producto
- `Cantidad` (int): Cantidad en stock
- `Precio` (double): Precio unitario

**Métodos:**
- Getters y setters para todos los atributos
- Constructor con parámetros

#### `Metodos.java`
Contiene la lógica de negocio del inventario.

**Métodos principales:**
- `RegistrarProductos(int n)`: Crea una matriz n×n de productos ingresados por teclado
- `MostrarProductos()`: Muestra todos los productos y sus detalles
- `TotalCantidades()`: Calcula la suma total de cantidad de unidades
- `OpcionesMenuPrincipal()`: Muestra el menú y retorna la opción seleccionada

#### `Menu.java`
Punto de entrada de la aplicación. Implementa un bucle que mantiene el menú activo hasta que el usuario elige salir.

### Cómo Usar

1. **Compilar:**
   ```bash
   javac Ejercicio1\*.java
   ```

2. **Ejecutar:**
   ```bash
   java Ejercicio1.Menu
   ```

3. **Ejemplo de interacción:**
   ```
   Ingrese la dimensión de la matriz: 2
   ¿Qué desea realizar?
   1. Ingresar productos al inventario
   2. Mostrar inventario
   3. Calcular valor total del inventario
   4. Salir
   > 1
   Producto 1
   Nombre: Arroz
   Cantidad: 50
   Precio: 2.50
   ...
   ```

---

## 🔍 Ejercicio 2: Sistema de Búsqueda de Productos

### Descripción
Aplicación que genera un inventario pre-poblado con 30 productos aleatorios distribuidos en una matriz de 5×6. Permite buscar productos por nombre de forma interactiva.

### Funcionalidades

- **Generación automática**: Crea una matriz 5×6 con productos, cantidades y precios aleatorios
- **Búsqueda por nombre**: Busca un producto por nombre (sin distinción de mayúsculas/minúsculas)
- **Información detallada**: Muestra ID, nombre, cantidad, precio y posición en la matriz

### Clases

#### `ObjProducto.java`
Clase modelo que representa un producto con su identificador único.

**Atributos:**
- `IdProducto` (int): ID único del producto
- `NombreProducto` (String): Nombre del producto
- `Cantidad` (int): Cantidad en stock
- `Precio` (double): Precio unitario

**Métodos:**
- Getters y setters para todos los atributos
- Constructor con parámetros

#### `Metodos.java`
Contiene la lógica para generar y buscar productos.

**Métodos principales:**
- `Productos()`: Genera una matriz 5×6 con 30 productos pre-definidos con datos aleatorios
- `BuscarProducto(ObjProducto[][] productos)`: Busca un producto por nombre ingresado por el usuario

**Productos disponibles:**
Arroz, Frijoles, Aceite, Azúcar, Sal, Leche, Pan, Huevos, Carne, Pollo, Pescado, Verduras, Frutas, Cereal, Galletas, Jugo, Café, Té, Mantequilla, Queso, Yogur, Harina, Pasta, Salsa, Mayonesa, Mostaza, Ketchup, Vinagre, Sopa, Caldo

#### `Menu.java`
Punto de entrada que inicializa el sistema y solicita el producto a buscar.

### Cómo Usar

1. **Compilar:**
   ```bash
   javac Ejercicio2\*.java
   ```

2. **Ejecutar:**
   ```bash
   java Ejercicio2.Menu
   ```

3. **Ejemplo de interacción:**
   ```
   Ingrese el nombre del producto a buscar: Arroz
   Producto encontrado
   ID: 487
   Nombre: Arroz
   Cantidad: 25
   Precio: 15.50
   Posición en la matriz: Fila: 0 Columna: 0
   ```

---

## 🛠️ Requisitos

- **Java 8 o superior** (se recomienda Java 11+)
- IDE recomendado: Visual Studio Code con la extensión de Java

---

## 💡 Conceptos Aprendidos

### En ambos ejercicios:
- ✅ Programación Orientada a Objetos (POO)
- ✅ Matrices bidimensionales
- ✅ Encapsulación (getters/setters)
- ✅ Constructores y métodos
- ✅ Entrada/salida con Scanner
- ✅ Bucles y estructuras condicionales

### Ejercicio 1 específicamente:
- ✅ Interacción con menús interactivos
- ✅ Manejo dinámico de arrays

### Ejercicio 2 específicamente:
- ✅ Números aleatorios (clase Random)
- ✅ Búsqueda en estructuras de datos
- ✅ Métodos de comparación de strings

---

## ⚙️ Notas Importantes

1. **Ejercicio 1**: Usa matrices cuadradas (n×n). Se debe ingresar la dimensión al iniciar.
2. **Ejercicio 2**: La matriz es fija (5×6 = 30 productos). Los datos se generan aleatoriamente en cada ejecución.
3. Ambas aplicaciones usan la clase `Scanner` para entrada de datos desde consola.
4. La búsqueda en Ejercicio 2 es **case-insensitive** (no distingue mayúsculas/minúsculas).

---

## 📝 Posibles Mejoras Futuras

- Agregar validación de entrada de datos
- Implementar persistencia en archivos
- Crear interfaz gráfica (Swing o JavaFX)
- Agregar funcionalidades de edición y eliminación de productos
- Implementar manejo de excepciones más robusto
- Agregar más opciones de búsqueda avanzada

---

## 👨‍💻 Autor

Proyecto educativo para aprendizaje de Java y POO.