# Citas Médicas

Bienvenido/a, esta aplicación fue realizada como proyecto de la materia de Programación Orientada a Objectos, en el segundo semestre de la carrera de Ingeniería de Software.
## Descripción

Este proyecto consiste en un sistema de gestión de citas médicas diseñado para un centro médico donde un administrador se encarga de registrar médicos y pacientes, así como de programar y administrar citas, permitiendo la gestión de las mismas.
## Características
Funcionalidades principales:
1. Agendamiento de citas: El usuario puede agendar citas con médicos disponibles, especificando la fecha y hora convenientes.
2. Modificación de citas: El usuario tienen la capacidad de cambiar la fecha y hora de las citas previamente agendadas.
3. Cancelación de citas: Se permite al usuario cancelar citas programadas en caso de ser necesario.
4. Búsqueda de citas: Los pacientes y el personal médico pueden buscar citas por diferentes criterios, como médico, o paciente.

Administración de pacientes y médicos:
1. Registro de pacientes y médicos: La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en la información de los pacientes y médicos.
2. Gestión de Horarios: Los médicos pueden establecer y gestionar sus horarios de consulta, lo que permite a los pacientes agendar citas dentro de esos horarios disponibles.

## Tecnologías Utilizadas
- [Lenguaje de Programación] - Java
- [Base de Datos] - MySQL

## Instalación

1. Clona este repositorio:

    ```bash
    git clone 'https://github.com/ricardo2112/Citas-Medicas.git'
    ```

2. Configura la base de datos y otros parámetros:
   * Instala y configura MySQL Server 8.0.30
   * Instala y configura MySQL Workbench
   * Ejecuta el script para la creación de la base de datos: [Citas-Medicas.txt](https://github.com/ricardo2112/Citas-Medicas/files/14670218/Citas-Medicas.txt)

3. Abrir Apache NetBeans IDE 19
   * Cargar las [Librerías de Java.zip](https://github.com/ricardo2112/Citas-Medicas/files/14670244/Librerias.de.Java.zip) utilizadas
   * Configurar la clase Conexión, con las credenciales de tu servidor MySQL

    *Nota: si desear ejecutar sin necesidad del IDE, configura tu servidor MySQL con las credenciales de la clase conexión. De esta manera podrás ejecutar la aplicación con tan solo un click al archivo encontrado [aquí](https://github.com/ricardo2112/Citas-Medicas/tree/main/ProyectoCitasMedicas/store).*

## Créditos

Este proyecto fue desarrollado por Ricardo Becerra.
