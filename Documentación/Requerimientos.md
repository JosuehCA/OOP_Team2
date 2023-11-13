# **Definición de Requerimientos**

## **Requerimientos Funcionales (RF)**

### **RF-01**: Base de Datos

- La base de datos será capaz de mantener una considerable cantidad de lecturas de datos.
- Se guardarán todos los datos relacionados con las cajas de pescado, a partir de la trazabilidad de cada lote de pescado.
- Deberá registrarse en una base de datos para su posterior consulta y análisis.
  
### **RF-02**: Entradas y salidas

- Registro de entradas y salidas de producto por medio de la tecnología RFID para mantener un seguimiento automatizado y preciso del inventario en la conservadora.

### **RF-03**: Reportes y alertas

- El usuario dispondrá de un notificador de reportes y alertas que permita obtener información sobre el estado del almacén, esto para disminuir el desperdicio del producto.
  
### **RF-04**: Implementación de tecnología RFID

- Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores(etiquetas) como antenas de lectura. Se implementarán los más adecuados para el POC.
      
### **RF-05**: UI

- Se implementará una interfaz funcional que despliegue de manera óptima los cambios en el registro de entradas y salidas.

## Requerimientos No Funcionales (RNF)

### Requerimientos de Producto:

### **RNF-01**: Rendimiento y capacidad del Programa

- El programa debe someterse a pruebas de rendimiento, con el fin de asegurar que pueda gestionar eficazmente la carga de trabajo prevista. Asimismo, la base de datos debe ser capaz de almacenar correctamente las lecturas de entradas y salidas.

### **RNF-02**: Confiabilidad y precisión de la tecnología RFID

- La tecnología RFID debe calibrarse adecuadamente para el registro de entradas y salidas. De igual manera, esta tecnología debe ser rápida y eficiente tanto en el tiempo de respuesta como en la generación de informes.
      
### **RNF-03**: Escalabilidad y Mantenibilidad del POC
    
- El diseño del sistema debe tomar en cuenta las implementaciones futuras y el crecimiento del almacén. Además, debe ser mantenible y sostenible a lo largo del ciclo de vida del producto, facilitando su adaptación a cambios y correcciones necesarios para garantizar la escalabilidad. 

### **RNF-04**: Seguridad respecto a la información

- Se deben proporcionar niveles adecuados de seguridad, que permitan la protección de información sensible (datos del cliente, proveedor, cantidad) y la prevención del acceso no autorizado.

### **RNF-05**: Diseño de UI

- Ofrecer una interfaz de usuario amigable y eficiente para que los usuarios puedan interactuar con las funcionalidades de manera intuitiva.

# **Especificaciones**

## **Especificación de RF**

| **RF 01** | **Base de Datos** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Infraestructura de hardware y software que gestione eficazmente la cantidad considerable de lecturas de datos. |
| **Descripción general** | - La base de datos será capaz de mantener una gran cantidad de lecturas de datos. - Se guardarán todos los datos relacionados con las cajas de pescado, a partir de la trazabilidad de cada lote de pescado. - Deberán registrarse en una base de datos para su posterior consulta y análisis. |
| **Precondición** | Contar con un sistema de recolección de datos. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Captura de datos**: Se capturan datos del usuario relacionados con las cajas de pescado y la trazabilidad de los lotes de pescado. |
| | Paso 2 - **Normalización de datos**: Los datos capturados se generalizarán para garantizar que estén en un formato estandarizado y coherente.  |
| | Paso 3 - **Almacenamiento**: Los datos estandarizados se almacenan en la base de datos. |
| | Paso 4 - **Seguridad y acceso**: Los datos se resguardan con medidas de seguridad adecuadas. | 
| | Paso 5 - **Consulta**: Los usuarios autorizados pueden consultar la base de datos para acceder a la información necesaria.  |
| | Paso 6 - **Respaldo y recuperación**: Se realizan copias de seguridad regulares de la base de datos. |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallos en la Captura de Datos**: Se interrumpe el flujo normal de entrada de información. La base de datos notifica la interrupción.  |
| | Paso 2 - **Problemas de Normalización**: Los datos capturados pueden ser inconsistentes debido a errores humanos. Esto puede implicar la revisión manual y corrección de los datos. |
| | Paso 3 - **Fallos de Almacenamiento**: Se lleva a cabo una recuperación de datos por medio de una copia de seguridad. |
| | Paso 4 - **Acceso No Autorizado**: Esto puede incluir el monitoreo de la seguridad de la base de datos. |
| | Paso 6 - **Pérdida de Datos por Desastres**:  Esto implica la recuperación de datos desde copias de seguridad, la restauración de la infraestructura de la base de datos y la implementación de medidas para prevenir futuras pérdidas de datos por desastres. |
| **Postcondición** | Si la base de datos es funcional y accesible para consulta y análisis, entonces se puede realizar el intercambio y almacenamiento de la información del inventario. |
| **Impacto** | Muy alto |
| **Urgencia** | Obligatoria |
| **Comentarios** | Se tomarán en cuenta todos los apartados de la trazabilidad para la normalización de los datos. |

#

| **RF 02** | **Entradas y salidas** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Identificador RFID y lector de antena RFID. |
| **Descripción general** |- Registro de entradas y salidas de producto por medio de la tecnologia RFID, que permita mantener un seguimiento automatizado y preciso del inventario en la conservadora. |
| **Precondición** | Tener calibrada la tecnología RFID |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Etiquetado de productos**: Se colocan las etiquetas RFID en cada lote que se dirige a la conservadora. |
| | Paso 2 - **Registro de productos entrantes**: El nuevo lote es escaneado automáticamente por el lector RFID. El lector envía al servidor la hora de entrada y la información del lote. |
| | Paso 3 - **Registro de productos salientes**: El lote almacenado es escaneado automáticamente por el lector RFID. El lector envía al servidor la hora de salida y la información del lote. |
| | Paso 4 - **Actualización del inventario**: El sistema mantiene un registro en tiempo real del inventario disponible en la conservadora. | 
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallo del sistema RFID**: El personal puede necesitar registrar manualmente la entrada o salida y notificar a los encargados de la tecnología para su reparación o mantenimiento. |
| | Paso 2 - **Tags RFID defectuosos o ausentes**: Puede haber casos en los que las etiquetas RFID estén dañadas, mal colocadas o ausentes en los productos, lo que impide la captura de datos. |
| | Paso 3 - **Errores de lectura o interferencias**: Pueden ocurrir errores de lectura debido a interferencias electromagnéticas u otros factores que afecten la comunicación entre los lectores RFID y las etiquetas en los productos. |
| **Postcondición** | El sistema de registro de entradas y salidas mediante la tecnología RFID está operativo y funcional, y se mantiene un seguimiento automatizado y preciso del inventario en la conservadora. |
| **Impacto** | Alto |
| **Urgencia** | Obligatoria|
| **Comentarios** | |

#

| **RF 03** | **Reportes y alertas** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Definir los tiempos óptimos para la generación de alertas. |
| **Descripción general** | - El usuario dispondrá de un notificador de reportes y alertas que permite obtener información valiosa sobre el estado del almacén, esto para evitar el desperdicio del producto. |
| **Precondición** | Tener en funcionamiento la base de datos, la tecnología RFID y la lógica del programa. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Inicio de sesión**: El usuario inicia sesión en el sistema con sus credenciales. |
| | Paso 2 - **Acceso a Reportes y alertas**: El usuario accede al módulo o sección destinada a los reportes y alertas del almacén. |
| | Paso 3 - **Selección de reporte o alerta**: La plantilla resultante se le entrega al usuario para su verificación correspondiente. |
| | Paso 4 - **Visualización de información**: El sistema muestra al usuario información detallada sobre el reporte y alerta seleccionada. |
| | Paso 5 - **Cierre de reporte o alerta**: Después de tomar las acciones requeridas, el usuario puede marcar la alerta o reporte como cerrado. |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallo en la conexión con la base de datos**: Se debe mostrar un mensaje de error al usuario indicando que no se puede acceder a la información. |
| | Paso 2 - **Fallo en el proceso de generación de alertas**: Debe registrarse el error, notificar a los administradores y mostrar un mensaje al usuario informando sobre el problema y la búsqueda de una solución. |
| | Paso 3 - **Fallo en la entrega de alertas o notificaciones**:  El sistema debe implementar mecanismos de recuperación para intentar reenviar la alerta en caso de un fallo temporal en la entrega. |
| **Postcondición** | Una vez implementada la funcionalidad de "Reportes y alertas," el cliente estará informado acerca de los productos próximos a caducar, lo que le permitirá tomar decisiones más informadas |
| **Impacto** | Alto |
| **Urgencia** | Menor |
| **Comentarios** | |

#

| **RF 04** | **Implementación de tecnología RFID** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Contar con los dispositivos RFID. |.
| **Descripción general** | - Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores como antenas de lectura. Se implementarán los más adecuados para el POC. |
| **Precondición** | La correcta investigación de la tecnología RFID y el cumplimiento del requerimiento RF - 06. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Codificación de chips identificadores**: Se codificarán los identificadores con la información necesaria para identificar los objetos o productos en el POC. |
| | Paso 2 - **Pruebas de dispositivos**: Se realizarán pruebas de los dispositivos RFID seleccionados. |
| | Paso 3 - **Instalación de antenas de lectura**: Se instalarán las antenas de lectura en ubicaciones estratégicas dentro del POC. |
| | Paso 4 - **Configuración del sistema**: Se configurará el sistema de recolección y procesamiento de datos RFID. |
| | Paso 5 - **Monitoreo y mantenimiento**: Se organizará un programa de monitoreo y mantenimiento continuo. |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Problemas con la instalación**: En caso de no ser capaces de instalar el lector RFID o implementar los chips, solicitaremos ayuda externa. |
| **Postcondición** | Se deberá dar seguimiento del funcionamiento de los dispositivos RFID. |
| **Impacto** | Alto |
| **Urgencia** | Alta |
| **Comentarios** | |

#

| **RF 05** | **UI** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Una base de datos o almacenamiento de datos conectada con un framework web. |.
| **Descripción general** |  - Se implementará una interfaz funcional que despliegue de manera óptima los cambios en el registro de entradas y salidas. |
| **Precondición** | Tener disponibilidad en la base de datos. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Diseño de la Interfaz**: Se realizarán dibujos, bocetos y pruebas de diseño para la IU. |
| | Paso 2 - **Desarrollo de la Interfaz**: Programación de la interfaz de usuario. |
| | Paso 3 - **Integración de Datos**:Se conectará la interfaz de usuario a la base de datos, donde contiene las entradas y salidas. |
| | Paso 4 - **Optimización de Rendimiento**: Si es necesario, se deben realizar ajustes para optimizar el rendimiento de la interfaz. |
| | Paso 5 - **Mantenimiento Continuo:**: La interfaz de usuario será monitoreada y mantenida de manera continua para garantizar su funcionamiento.
| **Excepciones** |  **Acción** |
| | Paso 1 - **Pérdida de conexión de red**: Comunicar de inmediato al cliente acerca de los problemas técnicos y trabajar en conjunto para resolverlos. |
| | Paso 2 - **Errores en los datos de trazabilidad**: Se desplegará un mensaje de error que indique la pérdida de conexión y sugiera intentar nuevamente cuando se restablezca la conexión.
| | Paso 3 - **Datos incorrectos o no válidos**: La interfaz debe resaltar los campos con problemas y mostrar mensajes de error descriptivos. |
| | Paso 4 - **Error del servidor o de la base de datos**: La interfaz debe mostrar un mensaje de error genérico e informar al usuario que se está trabajando en solucionar el problema. 
| **Postcondición** | Después de la implementación de la interfaz funcional, el cliente tendrá una mejor experiencia a la hora de agilizar el inventario. |
| **Impacto** | Alto |
| **Urgencia** | Baja |
| **Comentarios** | |

#

## **Especificación de RNF**

| **RNF 01** | **Rendimiento y capacidad del Programa** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que el sistema sea capaz de funcionar de manera eficiente en situaciones de uso reales.|
| **Requisito** | Contar con la primera versión del programa. |
| **Descripción** | - El programa debe someterse a pruebas de rendimiento, con el fin de asegurar que pueda gestionar eficazmente la carga de trabajo prevista. Asimismo, la base de datos debe ser capaz de almacenar correctamente las lecturas de las entradas y salidas. |
| **Impacto** | Alto |
| **Urgencia** | Alta |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 02** | **Confiabilidad y precisión de la tecnología RFID** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que la tecnología RFID cumpla con los requisitos de nuestro programa. |
| **Requisito** | Implementar la tecnología RFID. |
| **Descripción** | - La tecnología RFID debe calibrarse adecuadamente para el registro de entrada y salida. De igual manera, la tecnología debe ser rápida y eficiente en cuanto al tiempo de respuesta, así como en la generación de informes. |
| **Impacto** | Muy Alto |
| **Urgencia** | Moderada |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 03** | **Escalabilidad y Mantenibilidad del POC** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Asegurarse de que el POC esté preparado para escalar en caso de que se decida implementarlo en un entorno de producción. |
| **Requisito** | Se deben cumplir ciertas características tanto en la Escalabilidad como en la Mantenibilidad. |
| **Descripción** | - El sistema debe ser diseñado para ser escalable en futuras implementaciones y el crecimiento del almacén. Además, debe ser mantenible y sostenible a lo largo del ciclo de vida del producto, facilitando su adaptación a cambios y correcciones necesarios para garantizar la escalabilidad. |
| **Impacto** | Medio |
| **Urgencia** | Menor |
| **Estabilidad** | Media |
| **Comentario** |  |

#

| **RNF 04** | **Seguridad respecto a la información** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Asegurar la confidencialidad, integridad y disponibilidad de los datos del inventario de productos pesqueros, así como de la documentación generada. |
| **Requisito** | Autenticación y autorización. Debe implementarse un sistema de autenticación sólido que garantice que solo los usuarios autorizados puedan acceder a la información sensible. |
| **Descripción** | - Se deben proporcionar niveles adecuados de seguridad para proteger la información sensible y los datos del cliente, así como prevenir el acceso no autorizado. |
| **Impacto** | Alto |
| **Urgencia** | Menor |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 05** | **Diseño de UI** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Diseñar una interfaz de usuario que cumpla con los estándares de usabilidad y accesibilidad, satisfaciendo así al cliente. |
| **Requisito** | La interfaz de usuario debe cargar y responder de manera rápida, con un tiempo máximo de 2 segundos. |
| **Descripción** |- Ofrecer una interfaz de usuario amigable y eficiente para que los usuarios puedan interactuar con las funcionalidades de manera intuitiva. |
| **Impacto** | Medio |
| **Urgencia** | Baja |
| **Estabilidad** | Baja |
| **Comentario** |  |
