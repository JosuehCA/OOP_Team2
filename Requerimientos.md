# **Definición de Requerimientos**

## **Requerimientos Funcionales (RF)**

### **RF-01**: Base de Datos

- La base de datos será capaz de mantener una considerable cantidad de lecturas de datos.
- Se guardarán todos los datos relacionados con las cajas de pescado, a partir de la trazabilidad de cada lote de pescado.
- Deberá registrarse en una base de datos para su posterior consulta y análisis.
  
### **RF-02**: Entradas y salidas

- Registro de entradas y salidas de producto por medio de la tecnología RFID para mantener un seguimiento automatizado y preciso del inventario en la conservadora.

### **RF-03**: Generador de documentación

- El usuario dispondrá de un generador automatizado de documentación según las reglas de negocio, con el objetivo de respaldar los datos de entradas y salidas. La documentación se guardará en un formato digital que permita su impresión.

### **RF-04**: Reportes y alertas

- El usuario dispondrá de un notificador de reportes y alertas que permita obtener información sobre el estado del almacén, esto para disminuir el desperdicio del producto.

### **RF-05**: Clasificación de datos

- Los datos se organizarán de forma específica, utilizando el sistema "Lote" como base. La categorización por lotes se basa en la trazabilidad, lo que significa que proporciona detalles sobre cada envío de producto, incluyendo desde su pesca, el proveedor(pescador), hasta el método y la forma de empaque. 
 
### **RF-06**: Condiciones ambientales para la tecnología RFID
 
- El sistema deberá operar de manera efectiva en condiciones ambientales específicas, tomando en cuenta variaciones de temperatura y de humedad.
  
### **RF-07**: Implementación de tecnología RFID

- Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores(etiquetas) como antenas de lectura. Se implementarán los más adecuados para el POC.
      
### **RF-08**: UI

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

### Requerimientos de la Organización:

### **RNF-06**: Reglas de Negocio

- El sistema se ajustará a las reglas de negocio del cliente y su empresa, utilizando el sistema de inventario "Lote" y cumpliendo con las normas mexicanas y americanas en cuanto a la documentación.
#
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

| **RF 03** | **Generador de documentación** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Definir adecuadamente cada aspecto de la trazabilidad. |
| **Descripción general** | - El usuario dispondrá de un generador automatizado de documentación según las reglas de negocio, con el objetivo de respaldar los datos de entradas y salidas. La documentación se guardará en formato digital, pero debe que ser posible que se imprima en forma física. |
| **Precondición** | Tener acceso a la información requerida. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Obtención de datos**: Se obtienen los datos necesarios de la base de datos, como la información de cada embarque de pescado, su origen, el pescador, la forma de empaque, etc. |
| | Paso 2 - **Plantilla**: Los datos obtenidos se colocan automáticamente en un documento-plantilla que será el reporte de trazabilidad de cada lote. |
| | Paso 3 - **Validación**: La plantilla resultante se entrega al usuario para su correspondiente verificación. |
| | Paso 4 - **Guardado e impresión**: El documento validado se guarda en el respaldo de la base de datos, para que el usuario pueda imprimir una copia en papel posteriormente. | 
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallas en la obtención de datos**: Cuando ocurre, no hay una referencia al lote solicitado. Se consultará directamente con la base de datos. |
| | Paso 2 - **Fallas en la plantilla**: Puede haber un error de formato en el documento, como un error de encuadre. Se revisará manualmente. |
| | Paso 3 - **Fallas al momento de guardar**: Puede haber interferencias con la base de datos al guardar un documento de respaldo. Se consultará directamente con la base de datos. |
| **Postcondición** | Se agilizará un proceso de trabajo para el cliente. |
| **Impacto** | Medio |
| **Urgencia** | Menor |
| **Comentarios** | Se tendrán que consultar con el cliente los detalles específicos del proceso de documentación. |

#

| **RF 04** | **Reportes y alertas** |
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
| **Urgencia** | Media |
| **Comentarios** | |

#

| **RF 05** | **Clasificación de datos** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Recopilación de información clasificada en el sistema "Lote". |.
| **Descripción general** | - Los datos se organizarán de forma específica utilizando el sistema "Lote" como base. La categorización por lotes se basa en la trazabilidad, lo que significa que proporciona detalles sobre cada envío de pescado, incluyendo su origen, el pescador responsable, el método de empaque, etc. |
| **Precondición** | Tener implementado el sistema "Lote" en la conservadora y lograr abstraer sus datos. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Recolección de Datos de Trazabilidad**: La planta procesa un nuevo lote de producto y lo deposita en la conservadora. |
| | Paso 2 - **Asignación de Números de Lote**: Los trabajadores asignan un número de lote al embarque de pescado. |
| | Paso 3 - **Registro de Datos en el Sistema**: Los trabajadores registran el número de lote asignado a la etiqueta RFID, así como todos sus datos de trazabilidad. |
| | Paso 4 - **Etiquetado de Lotes**: Se colocan las etiquetas RFID en los lotes de productos resultantes. |
| | Paso 5 - **Almacenamiento  Seguimiento**: Se almacena físicamente, se detecta por el lector RFID y se hace el seguimiento en tiempo real de la fecha de cada lote, hasta encontrar algún cambio. |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Problemas en el sistema "Lote"**: Comunicar de inmediato al cliente acerca de los problemas técnicos y trabajar en conjunto para resolverlos. |
| | Paso 2 - **Errores en los datos de trazabilidad**: Corregir los datos erróneos, mantener un registro de las correcciones realizadas y asegurarse de que la información correcta se refleje en el etiquetado. |
| | Paso 3 - **Pérdida de información de trazabilidad**: Notificar de inmediato al cliente y realizar una revisión exhaustiva de los procedimientos para prevenir futuras pérdidas de información. |
| **Postcondición** | Con la implementación exitosa de esta funcionalidad del POC, la forma de etiquetado y el sistema de respaldo serán mucho más sencillos y versátiles. |
| **Impacto** | Alto |
| **Urgencia** | Obligatoria |
| **Comentarios** | |

#

| **RF 06** | **Condiciones ambientales para la tecnología RFID** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Investigación de sistemas de hardware RFID. |.
| **Descripción general** | - El sistema deberá operar de manera efectiva en condiciones ambientales relevantes para la tecnología RFID. |
| **Precondición** | Tener acceso al lector RFID o antena al chip RFID. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Definición de las condiciones ambientales**: Se identifican las condiciones ambientales que son relevantes para la tecnología RFID. |
| | Paso 2 - **Selección de componentes y etiquetas RFID adecuadas**: Se seleccionan componentes RFID diseñados para funcionar en las condiciones ambientales identificadas. |
| | Paso 3 - **Pruebas de campo**: Se llevan a cabo pruebas en un entorno controlado para verificar que los componentes RFID funcionen de manera efectiva. |
| | Paso 4 - **Validación y documentación**: Se valida que el sistema RFID cumple con los requisitos de funcionamiento en condiciones ambientales relevantes y se documentan los resultados de las pruebas. |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Extremos de temperatura**: El sistema RFID puede no funcionar de manera efectiva en temperaturas extremadamente altas o bajas. Se investigan nuevas opciones de componentes. |
| | Paso 2 - **Altos niveles de humedad**:  En condiciones de alta humedad o exposición directa al agua, como en entornos acuáticos o cuando el equipo RFID está constantemente mojado, es posible que el sistema no funcione de manera óptima. |
| **Postcondición** | Si la investigación es efectiva y se define el tipo de tecnología RFID, se garantiza una implementación exitosa de la tecnología. |
| **Impacto** | Muy Alto |
| **Urgencia** | Alta |
| **Comentarios** | |

#

| **RF 07** | **Implementación de tecnología RFID** |
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

| **RF 08** | **UI** |
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

#

| **RNF 06** | **Reglas de Negocio** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que el POC cumple con un 100% de precisión en el sistema "Lote" de acuerdo con las reglas de negocio del cliente y las normas que lo rigen. |
| **Requisito** | La interfaz de usuario debe cargar y responder de manera rápida, con un tiempo máximo de 2 segundos. |
| **Descripción** | - El sistema se ajustará a las reglas de negocio del cliente y su empresa, utilizando el sistema de inventario "Lote" y cumpliendo con las normas tanto mexicanas como americanas en cuanto a la documentación. |
| **Impacto** | Alto |
| **Urgencia** | Moderada |
| **Estabilidad** | Alta |
| **Comentario** |  |
