# Casos de Uso

## CU01: Ver Menú Principal
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario ver el menú principal, donde puede acceder a los módulos del sistema.  
**Precondiciones:** El usuario está autenticado en el sistema.
### Escenario principal
1. El sistema muestra el menú principal con los módulos disponibles. 
2. El usuario puede acceder a cualquiera de estos módulos.  

**Postcondiciones:** El sistema muestra los módulos de Médico, Paciente y Cita Médica, permitiendo al usuario seleccionar acciones específicas para cada uno.
### Escenarios alternativos
1. El usuario selecciona el módulo Médico (ver CU02: Ver Médicos).
2. El usuario selecciona el módulo Paciente (ver CU03: Ver Pacientes).
3. El usuario selecciona el módulo Cita Médica (ver CU04: Ver Citas Médicas).

## CU02: Ver Médicos
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario acceder a la administración de los médicos.  
**Precondiciones:** CU01: Ver Menú Principal
### Escenario principal
1. El usuario desea administrar a los médicos del sistema.
2. El sistema muestra el módulo Médico donde se despliegan los médicos registrados.

**Postcondiciones:** El sistema muestra el módulo Médico, permitiendo al usuario realizar acciones como registrar, actualizar, eliminar o buscar médicos.
### Escenarios alternativos
1. El usuario desea registrar un nuevo médico (ver CU05: Registrar Médico).
2. El usuario desea actualizar un médico existente (ver CU06: Actualizar Médico).
3. El usuario desea buscar un médico en el sistema (ver CU07: Buscar Médico).
4. El usuario desea eliminar un médico existente (ver CU08: Eliminar Médico).
5. El usuario desea asignar horarios a un médico (ver CU09: Asignar Horarios).

## CU03: Ver Pacientes
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario acceder a la administración de los pacientes.  
**Precondiciones:** CU01: Ver Menú Principal
### Escenario principal
1. El usuario desea administrar a los pacientes del sistema.
2. El sistema muestra el módulo Paciente donde se despliegan los pacientes registrados.

**Postcondiciones:** El sistema muestra el módulo Paciente, permitiendo al usuario realizar acciones como registrar, actualizar, eliminar o buscar pacientes.
### Escenarios alternativos
1. El usuario desea registrar un nuevo paciente (ver CU10: Registrar Paciente).
2. El usuario desea actualizar un paciente existente (ver CU11: Actualizar Paciente).
3. El usuario desea eliminar un paciente existente (ver CU12: Eliminar Paciente).
4. El usuario desea buscar un paciente en el sistema (ver CU13: Buscar Paciente).

## CU04: Ver Citas Médicas
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario acceder a la administración de las citas médicas.  
**Precondiciones:** CU01: Ver Menú Principal
### Escenario principal
1. El usuario desea administrar las citas médicas del sistema.
2. El sistema muestra el módulo Cita Médica donde se despliegan las citas registradas.

**Postcondiciones:** El sistema muestra el módulo Cita Médica, permitiendo al usuario realizar acciones como registrar, cambiar horarios, cancelar o buscar citas.
### Escenarios alternativos
1. El usuario desea registrar una nueva cita (ver CU14: Registrar Cita).
2. El usuario desea cambiar el horario de una cita existente (ver CU15: Cambiar Horario).
3. El usuario desea cancelar una cita existente (ver CU16: Cancelar Cita).
4. El usuario desea buscar una cita en el sistema (ver CU17: Buscar Cita).

## CU05: Registrar Médico
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario registrar un nuevo médico, ingresando su apellido, nombre, especialidad, consultorio y teléfono.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Médico (CU02: Ver Médicos).
### Escenario principal
1. El usuario ingresa toda la información solicitada (apellido, nombre, especialidad, consultorio y teléfono).
2. El sistema valida la información ingresada.
3. El sistema registra al nuevo médico con la información proporcionada.
4. El sistema muestra un mensaje indicando que el médico ha sido registrado exitosamente.
5. El sistema despliega una pantalla para asignar horarios (ver CU09: Asignar Horario).

**Postcondiciones:** Se registra un nuevo médico en el sistema y queda disponible para su visualización y gestión en el módulo Médico.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU06: Actualizar Médico
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario actualizar un médico existente, modificando su apellido, nombre, especialidad, consultorio o teléfono.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Médico (CU02: Ver Médicos).
### Escenario principal
1. El usuario busca y selecciona al médico que desea actualizar (CU07: Buscar Médico).
2. El usuario modifica los campos deseados (apellido, nombre, especialidad, consultorio y teléfono).
3. El sistema valida la información ingresada.
4. El sistema actualiza al médico con la nueva información proporcionada.
5. El sistema muestra un mensaje indicando que el médico ha sido actualizado exitosamente.

**Postcondiciones:** Se actualiza a un médico en el sistema y se visualiza con el resto de los médicos.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU07: Buscar Médico
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario buscar médicos existentes por especialidad.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Médico (CU02: Ver Médicos).
### Escenario principal
1. El usuario ingresa la especialidad del médico que desea buscar en el campo de búsqueda.
2. El sistema busca coincidencias con la información ingresada.
3. El sistema muestra la lista de médicos encontrados según la especialidad ingresada.

**Postcondiciones:** Se visualizan todos los médicos encontrados.

## CU08: Eliminar Médico
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario eliminar un médico existente.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Médico (CU02: Ver Médicos).
### Escenario principal
1. El usuario busca y selecciona al médico que desea eliminar (CU07: Buscar Médico).
2. El sistema muestra un mensaje de confirmación antes de eliminar.
3. El sistema elimina al médico seleccionado.

**Postcondiciones:** Se elimina un médico del sistema.

### Escenarios alternativos
1. El usuario intenta eliminar un médico con citas médicas registradas. En este caso, el sistema muestra un mensaje de error ya que esta acción no es posible.

## CU09: Asignar Horario
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario asignar un horario a un médico ya existente.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Médico (CU02: Ver Médicos).
### Escenario principal
1. El usuario selecciona al médico al que desea asignar un horario.
2. El usuario elige el día y las horas de atención para el médico seleccionado.
3. El sistema registra los horarios para el médico seleccionado.

**Postcondiciones:** Se asignan horarios a un médico en el sistema.

### Escenarios alternativos
1. El Usuario desea actualizar los horarios del médico.  
   1.1. El usuario selecciona un médico y un día para actualizar.  
   1.2. El usuario marca o desmarca las horas para dicho día.  
   1.3. El sistema elimina los horarios antiguos y crea nuevos con los datos proporcionados
2. El Usuario desea actualizar los horarios del médico.  
   2.1. El usuario selecciona un médico y un día para eliminar.  
   2.2. El sistema elimina los horarios para dicho médico y día.

## CU10: Registrar Paciente
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario registrar un nuevo paciente, añadiendo su número de cédula, apellido, nombre, fecha de nacimiento y teléfono.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Paciente (CU03: Ver Pacientes).
### Escenario principal
1. El usuario ingresa todos los campos solicitados (número de cédula, apellido, nombre, fecha de nacimiento y teléfono).
2. El sistema valida la información ingresada.
3. El sistema registra al nuevo paciente con la información proporcionada.
4. El sistema muestra un mensaje indicando que el paciente ha sido registrado exitosamente.

**Postcondiciones:** Se registra un nuevo paciente en el sistema y queda disponible para su visualización y gestión en el módulo Paciente.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU11: Actualizar Paciente
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario actualizar un paciente existente, modificando su apellido, nombre, fecha de nacimiento o teléfono.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Paciente (CU03: Ver Pacientes).
### Escenario principal
1. El usuario busca y selecciona al paciente que desea actualizar (CU13: Buscar Paciente).
2. El usuario modifica los campos deseados (apellido, nombre, fecha de nacimiento o teléfono).
3. El sistema valida la información ingresada.
4. El sistema actualiza al paciente con la nueva información proporcionada.
5. El sistema muestra un mensaje indicando que el paciente ha sido actualizado exitosamente.

**Postcondiciones:** Se actualiza a un paciente en el sistema y se visualiza junto con el resto de pacientes.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU12: Buscar Paciente
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario buscar pacientes existentes por especialidad.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Paciente (CU03: Ver Pacientes).
### Escenario principal
1. El usuario ingresa en el campo de búsqueda la especialidad del paciente que desea buscar.
2. El sistema busca coincidencias con la información ingresada.
3. El sistema muestra la lista de pacientes encontrados según la especialidad ingresada.

**Postcondiciones:** Se visualizan todos los pacientes encontrados.

## CU13: Eliminar Paciente
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario eliminar un paciente existente.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Paciente (CU03: Ver Pacientes).
### Escenario principal
1. El usuario busca y selecciona al paciente que desea eliminar (CU13: Buscar Paciente).
2. El sistema muestra un mensaje de confirmación antes de eliminar.
3. El sistema elimina al paciente seleccionado.

**Postcondiciones:** Se elimina un paciente del sistema.

### Escenarios alternativos
1. El usuario intenta eliminar un paciente con citas médicas registradas. En este caso, el sistema muestra un mensaje de error al usuario, ya que esta acción no es posible.
## CU14: Registrar Cita
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario registrar una cita médica.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Cita Médica (CU04: Ver Citas Médicas).
### Escenario principal
1. El usuario busca y selecciona al médico (ver CU17: Buscar Médico).
2. El usuario busca y selecciona al paciente (ver CU13: Buscar Paciente).
3. El usuario selecciona una fecha.
4. El sistema muestra las horas disponibles para dicha fecha.
5. El sistema valida la información y registra la cita médica.
6. El sistema muestra un mensaje indicando que la cita ha sido registrada.

**Postcondiciones:** Se registra una cita médica en el sistema.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU15: Cambiar Horario
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario cambiar la fecha y hora de una cita existente. 
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Cita Médica (CU04: Ver Citas Médicas).
### Escenario principal
1. El usuario busca y selecciona la cita médica que desea actualizar (CU17: Buscar Cita).
2. El usuario modifica la fecha y la hora de la cita.
3. El sistema valida la información ingresada.
4. El sistema actualiza la cita con la nueva información proporcionada.
5. El sistema muestra un mensaje indicando que la cita ha sido actualizada exitosamente.

**Postcondiciones:** Se actualiza una cita del sistema.

### Escenarios alternativos
1. El usuario ingresa información inválida o incompleta. En este caso, el sistema informa al usuario sobre el error y solicita la corrección de la información.

## CU16: Cancelar Cita
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario cancelar una cita médica existente.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Cita Médica (CU04: Ver Citas Médicas).
### Escenario principal
1. El usuario busca y selecciona la cita médica que desea cancelar (CU17: Buscar Cita).
2. El sistema muestra un mensaje de confirmación antes de cancelar.
3. El sistema elimina la cita seleccionada.

**Postcondiciones:** Se elimina una cita del sistema.

## CU17: Buscar Cita
**Actor:** Usuario  
**Descripción:** Este caso de uso permite al usuario buscar una cita médica existente.  
**Precondiciones:** El usuario está autenticado en el sistema y se encuentra en el módulo Cita Médica (CU04: Ver Citas Médicas).
### Escenario principal
1. El usuario ingresa en el campo de búsqueda el nombre y/o apellido del médico o el número del paciente.
2. El sistema busca coincidencias con la información ingresada.
3. El sistema muestra la lista de citas médicas encontradas según el médico o paciente ingresado.

**Postcondiciones:** Se visualizan las citas médicas encontradas.
