# 🏎️ Sistema de Gestión de Pilotos de Fórmula 1

Aplicación Java para gestionar información de pilotos de Fórmula 1, sus escuderías y puntuación mediante archivos binarios serializados.

## 📋 Descripción

Este programa permite cargar, visualizar, modificar y guardar información de pilotos de F1. Los datos se almacenan en formato binario serializado para una gestión eficiente. La aplicación incluye arte ASCII temático de F1 para una experiencia visual atractiva.

## 🎯 Funcionalidades

1. **Cargar pilotos** - Lee el archivo binario y carga todos los pilotos en memoria
2. **Mostrar pilotos** - Visualiza el listado completo de pilotos con su información
3. **Añadir nuevo piloto** - Permite agregar pilotos verificando duplicados
4. **Buscar piloto** - Búsqueda por nombre con visualización detallada
5. **Guardar datos** - Persiste los cambios en el archivo binario
6. **Ver coche F1** - Muestra arte ASCII de un coche de Fórmula 1

## 🏗️ Estructura del Proyecto

```
├── GestionPilotosF1Binario.java    # Clase principal con menú interactivo
├── Piloto.java                     # Modelo de datos del piloto
├── CargarPilotosF1Binario.java     # Carga inicial desde archivo de texto
├── CargarPilotos.java              # Lee pilotos desde archivo binario
├── MostrarPilotos.java             # Muestra listado de pilotos
├── AniadirNuevoPiloto.java         # Añade nuevos pilotos al sistema
├── BuscarPiloto.java               # Busca pilotos por nombre
├── GuardarDatos.java               # Guarda pilotos en archivo binario
├── MostrarTitulo.java              # Muestra el título ASCII de F1
├── MostrarCoche.java               # Muestra el arte ASCII del coche
├── pilotos_f1.txt                  # Archivo de datos inicial
├── tituloF1.txt                    # Arte ASCII del título
├── Coche.txt                       # Arte ASCII del coche F1
└── pilotos_f1.dat                  # Archivo binario generado
```

## 📄 Formato del Archivo de Entrada

El archivo `pilotos_f1.txt` debe seguir este formato:

```
NombrePiloto;Escudería;Puntos
Verstappen;Red Bull;421
Norris;McLaren;423
Hamilton;Mercedes;156
```

- Cada línea contiene: nombre, escudería y puntos separados por punto y coma (`;`)
- Los puntos deben ser un valor numérico entero

## 🚀 Ejecución

### Requisitos

- Java JDK 8 o superior
- Archivos necesarios en el directorio del proyecto:
  - `pilotos_f1.txt`
  - `tituloF1.txt`
  - `Coche.txt`

### Compilación

```bash
javac *.java
```

### Carga Inicial de Datos

Primero, ejecuta el programa de carga inicial para generar el archivo binario:

```bash
java CargarPilotosF1Binario
```

Este comando:
- Lee `pilotos_f1.txt`
- Crea el archivo binario `pilotos_f1.dat`

### Ejecución Principal

```bash
java GestionPilotosF1Binario
```

## 💾 Archivos Generados

- **pilotos_f1.dat** - Archivo binario serializado con los objetos `Piloto`

## 🔧 Características Técnicas

### Serialización
- Uso de `ObjectOutputStream` y `ObjectInputStream`
- Persistencia de datos en formato binario

### Colecciones
- `Set<Piloto>` para evitar duplicados automáticamente
- Comparación basada en nombre del piloto (método `equals`)

### Validación
- Control de duplicados al añadir pilotos
- Manejo de excepciones `InputMismatchException`
- Validación de entrada de datos

### Interfaz Visual
- Códigos ANSI para colores:
  - 🟣 Fondo lila para encabezados
  - 🟢 Verde para etiquetas
  - 🔴 Fondo rojo para errores
  - Cursiva para mensajes especiales
- Arte ASCII decorativo
- Emojis para mejor experiencia de usuario

## 📊 Ejemplo de Uso

```
__/\\\\\\\\\_______/\\\_________/\\\\\\\______/\\____________/\\__/\\\________/\\\...
 
Selecciona una opción:
1. Cargar pilotos
2. Mostrar pilotos
3. Añadir nuevo piloto
4. Buscar piloto
5. Guardar datos
6. Ver coche F1.
0. Salir

> 2

LISTADO DE PILOTOS
꧁꧂ ꧁꧂ ꧁꧂ ꧁꧂ ꧁꧂ 

꧁ Nombre: Verstappen
꧁   Escudería: Red Bull
꧁       Puntos: 421
```

## 🎨 Características de Diseño

### Sistema de Colores
- **Fondo Lila** (`\u001B[45m`): Títulos de secciones
- **Verde** (`\u001B[32m`): Etiquetas de datos
- **Fondo Rojo** (`\u001B[41m`): Mensajes de error
- **Cursiva** (`\u001B[3m`): Mensajes especiales

### Arte ASCII
- Título F1 animado en el inicio
- Diseño de coche de carreras disponible en el menú
- Decoradores ornamentales en listados

## 🔒 Prevención de Duplicados

El sistema implementa prevención de duplicados mediante:
- Sobrescritura de `equals()` basada en el nombre del piloto
- Sobrescritura de `hashCode()` coherente con `equals()`
- Validación al añadir nuevos pilotos

## 📝 Flujo de Trabajo Recomendado

1. **Primera vez**: Ejecutar `CargarPilotosF1Binario` para crear el archivo `.dat`
2. **Uso normal**: Ejecutar `GestionPilotosF1Binario`
3. **Cargar datos**: Opción 1 del menú
4. **Realizar operaciones**: Añadir, buscar, mostrar pilotos
5. **Guardar cambios**: Opción 5 antes de salir

## ⚠️ Notas Importantes

- Los cambios **no se guardan automáticamente** - usa la opción 5
- El archivo binario se sobrescribe al guardar
- Los pilotos se identifican únicamente por nombre (case-sensitive en el código, pero búsqueda case-insensitive)
- Asegúrate de tener los archivos `.txt` de arte ASCII en el directorio

## 🏁 Datos de Temporada 2025

El archivo incluye los pilotos de la temporada 2025 de F1 con sus escuderías actualizadas.

## 📝 Licencia

Proyecto educativo para aprendizaje de Java y manejo de archivos binarios.

## 👤 Autor

Proyecto desarrollado como ejercicio de programación en Java con temática de Fórmula 1.
