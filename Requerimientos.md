# **Definición de Requerimientos**

## **Requerimientos Funcionales (RF)**

### **RF-01**: Base de Datos

      - La base de datos será capaz de mantener una cantidad considerable de lecturas de datos.
      - Se guardarán todos los datos relacionados con las cajas de pescado, a partir de la trazabiliadad de cada lote de pescado.
      - Deberá registrarse en una base de datos para su posterior consulta y análisis.
  
### **RF-02**: Entradas y salidas

      - Registro de entradas y salidas de producto por medio de la tegnologia RFID, para mantener un seguimiento automatizado y preciso y del inventario en la congeladora.

### **RF-03**: Generador de documentación

      - El usuario dispondrá de un generador automatizado de documentación según las reglas de negocio, con el objetivo de respaldar los datos de entradas y salidas. La documentación se guardará en formato digital, pero tendrá que ser posible que se imprima en forma física.

### **RF-04**: Reportes y alertas

      - El usuario dispondrá de un notificador de reportes y alertas que permite obtener información valiosa sobre el estado del almacén, esto para evitar el desperdicio o merma.

### **RF-05**: Etiquetado apartir de "Lotificación y Trazabilidad"
      - Los datos de nuestro programa se ordenarán a partir del sistema implementado por nuestro cliente, el sistema "Lote". La clasificación lote se rige por la trazabilidad, en resumen, es la información de cada embarque de pescado, de donde vino, quien lo pescó, forma de empaque, etc. 
 
### **RF-06**: Condiciones ambientales para la tecnología RFID
 
      - El sistema deberá operar de manera efectiva en condiciones ambientales relevantes para la tecnología RFID, como variaciones de temperatura y humedad.
  
### **RF-07**: Implementación de tecnología RFID

      - Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores como antenas de lectura. Se implementarán los más adecuados para el POC.
      
### **RF-08**: UI

      - Se implementará una interfaz funcional que despliegue de manera óptima los cambios en el registro de entradas y salidas.


## Requerimientos No Funcionales (RNF)

### Requerimientos de Producto:

### **RNF-01**: Rendimiento y capacidad del Programa

      - El programa debe ser sometido a pruebas de rendimiento con el fin de asegurar que pueda gestionar eficazmente la carga de trabajo prevista; a su vez, la base de datos debe ser capaz de almacenar correctamente las lecturas de las entradas y salidas.

### **RNF-02**: Confiabilidad y precisión de la tegnología RFID

      - La tegnología RFID deberá calibrarse adecuadamente para el registro de entrada y salida. De igual manera, la tegnología debe ser rápida y eficiente en cuanto al tiempo de respuesta, así como para generar informes.
      
### **RNF-03**: Escalabilidad y Mantenibilidad del POC
    
      - El sistema deberá ser diseñado de manera que sea escalable para futuras implementaciones y crecimiento del almacén. De igual manera, el sistema deberá ser mantenible y sostenible a lo largo del ciclo de vida del producto, para poder adaptarse a los cambios y correcciones de la escalabilidad.

### **RNF-04**: Seguridad respecto a la información

      - Se debe proporcionar niveles adecuados de seguridad para proteger la información sensible y datos del cliente, así como prevenir el acceso no autorizado.

### **RNF-05**: Diseño de UI

      - Ofrecimiento de una interfaz de usuario amigable y eficiente que permita a los usuarios interactuar con las funcionalidades de manera intuitiva.

### Requerimientos de la Organización:

### **RNF-06**: Reglas de Negocio

      - El sistema se adaptará a las reglas de negocio del cliente y su empresa, en este caso, apegandonos al sistema de inventario "Lote"; asimismo, cumpliendo con las normas mexicanas e internacionales en cuanto a la documentación.  
#
# **Especificaciones**

## **Especificación de RF**

| **RF 01** | **Base de Datos** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Infraestructura de hardware y software que pueda gestionar eficazmente la cantidad considerable de lecturas de datos. |
| **Descripción general** |- La base de datos será capaz de mantener una cantidad considerable de lecturas de datos. - Se guardarán todos los datos relacionados con las cajas de pescado, a partir de la trazabiliadad de cada lote de pescado. - Deberá registrarse en una base de datos para su posterior consulta y análisis. |
| **Precondición** | Contar con un sistema de recolección de datos |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Captura de datos**: Se capturan datos del usuario relacionados con las cajas de pescado y la trazabilidad de los lotes de pescado. |
| | Paso 2 - **Normalización de datos**: Los datos capturados se generalizarán para garantizar que estén en un formato estandarizado y coherente.  |
| | Paso 3 - **Almacenamiento**: Los datos normalizados se almacenan en la base de datos. Cada registro se guarda en la base de datos de acuerdo con con su información detallada.|
| | Paso 4 - **Seguridad y acceso**: Los datos son resguardados con medidas de seguridad adecuadas para proteger la integridad y confidencialidad de los datos. | 
| | Paso 5 - **Consulta**: Los usuarios autorizados pueden consultar la base de datos para acceder a la información.  |
| | Paso 6 - **Respaldo y recuperación**: Se realizan copias de seguridad regulares de la base de datos para garantizar la recuperación de datos en caso de fallos o pérdidas.  |
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallos en la Captura de Datos**: Cuando ocurre, se interrumpe el flujo normal de entrada de información. |
| | Paso 2 - **Problemas de Normalización**: Los datos capturados pueden ser inconsistentes o no normalizables debido a errores humanos o discrepancias en los formatos de entrada.|
| | Paso 3 - **Fallos de Almacenamiento**:  Cuando se produce un fallo en el almacenamiento, los datos capturados pueden perderse o no registrarse adecuadamente en la base de datos.|
| | Paso 4 - **Acceso No Autorizado**:  Alguien no autorizado puede intentar acceder a la base de datos, lo que representa un riesgo de seguridad.|
| | Paso 6 - **Pérdida de Datos por Desastres**: Eventos como incendios, inundaciones o ciberataques pueden resultar en la pérdida de datos o la destrucción de la infraestructura de la base de datos.|
| **Postcondición** | Si la base de datos es  funcional y accesible para consulta y análisis. Entonces se puede realizar el intercambio y almacenamiento de la información del inventario" |
| **Impacto** | Muy alto |
| **Urgencia** | Obligatoria|
| **Comentarios** | Se tomarán en cuenta todos los apartados de la trazabilidad para la normalización de los datos. |

#

| **RF 02** | **Entradas y salidas** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Identificador RFID y lector de antena RFID. |
| **Descripción general** |- Registro de entradas y salidas de producto por medio de la tegnologia RFID, para mantener un seguimiento automatizado y preciso y del inventario en la congeladora. |
| **Precondición** | Tener calibrado la tegnología RFID |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Etiquetado de productos**: Se colocan las etiquetas RFID en cad lote que se digire a la congeladora. La etiqueta RFID se llena de la información trazabilizada por e usuario. |
| | Paso 2 - **Registro de productos entrantes**: Al pasar por la puerta de la congeladora, el nuevo lote es escaneado automátocamente por el lector RFID. El lector envia al servidor la hora de entrada y la información del lote. |
| | Paso 3 - **Registro de productos salientes**: Al pasar por la puerta de la congeladora, el lote almacenado es escaneado automátocamente por el lector RFID. El lector envia al servidor la hora de salida y la información del lote. |
| | Paso 4 - **Actualización del inventario**: El sistema mantiene un registro en tiempo real del inventario disponible en la congeladora. | 
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallo del sistema RFID**: El personal puede necesitar registrar manualmente la entrada o salida y notificar a los encargados de la tecnología para su reparación o mantenimiento. |
| | Paso 2 - **Tags RFID defectuosos o ausentes**: Puede haber casos en los que las etiquetas RFID estén dañadas, mal colocadas o ausentes en los productos, lo que impide la captura de datos.
| | Paso 3 - **Tags RFID defectuosos o ausentes**:  Puede haber casos en los que las etiquetas RFID estén dañadas, mal colocadas o ausentes en los productos, lo que impide la captura de datos.
| | Paso 4 - **Errores de lectura o interferencias**:  Pueden ocurrir errores de lectura debido a interferencias electromagnéticas u otros factores que afecten la comunicación entre los lectores RFID y las etiquetas en los productos. |
| **Postcondición** | El sistema de registro de entradas y salidas mediante la tecnología RFID está operativo y funcional, y se mantiene un seguimiento automatizado y preciso del inventario en la congeladora |
| **Impacto** | Alto |
| **Urgencia** | Obligatoria|
| **Comentarios** | |

#

| **RF 03** | **Generador de documentación** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Definir bien cada aspecto de la trazabiliad y del sistema lotificado. |
| **Descripción general** | - El usuario dispondrá de un generador automatizado de documentación según las reglas de negocio, con el objetivo de respaldar los datos de entradas y salidas. La documentación se guardará en formato digital, pero tendrá que ser posible que se imprima en forma física.|
| **Precondición** | Tener acceso a la información requerida por la trazabilidad. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Obtención de datos**: Se obtienen los datos necesarios de la base de datos, tales como es la información de cada embarque de pescado, de donde vino, quien lo pescó, forma de empaque, etc. |
| | Paso 2 - **Plantilla**: Los datos obtenidos se colocan de forma automatica en un documento plantilla que será el reporte de trazabiliadad de cada lote. |
| | Paso 3 - **Validación**: La plantilla resultante se se le entrega al usuario para su verificación correspondiente. |
| | Paso 4 - **Salvar y impresión**: El documento validado se guardará en el respaldo de la base de datos, para posteriormente el usuario pueda imprimir una copia en papel. | 
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallos en la obtencion de datos**: Cuando ocurre, no hay una referencia al lote solicitado y no se puede concretar el documento. |
| | Paso 2 - **Fallos con la plantilla**: Puede haber un error de formato en el documento tal como un error de encuadre o los datos se colocaron en un lugar erroneo.
| | Paso 3 - **Fallos al momento de salvar**: Puede haber una interfecencia con el servidor al momento de guardar un documento de respaldo. En estos cosos no habria referencia de este documento digital. |
| **Postcondición** | Si se concreta esta parte funcional del programa, se agilizaria un proceso de trabajo para el cliente, aunque no tendría más relevancia para el programa. |
| **Impacto** | Muy Alto |
| **Urgencia** | Menor |
| **Comentarios** | Se tendra que consultar con e cliente detalles especificos del proceso de documentación. |

#

| **RF 04** | **Reportes y alertas** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Definir los tiempos optimos para la generación de alertas. |
| **Descripción general** | - El usuario dispondrá de un notificador de reportes y alertas que permite obtener información valiosa sobre el estado del almacén, esto para evitar el desperdicio o merma. |
| **Precondición** | Tener en funcionamiento la base de datos, la tegnologia RFID y la lógica del programa. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Inicio de sesión**: El usuario inicia sesión en el sistema con sus credenciales. |
| | Paso 2 - **Acceso a Reportes y alertas**: Una vez dentro del sistema, el usuario accede al módulo o sección destinada a los reportes y alertas del almacén. |
| | Paso 3 - **Selección de reporte o alerta**: La plantilla resultante se se le entrega al usuario para su verificación correspondiente. |
| | Paso 4 - **Visualización de información**: El sistema muestra al usuario información detallada sobre el reporte y alerta seleccionada. Esto incluye datos como la fecha de ingleso del pescado a la congeladora, su número de lote, que tipo de pescado es, su peso, etc.|
| | Paso 5 - **Cierre de reporte o alerta**: Después de tomar las acciones requeridas, el usuario puede marcar la alerta o reporte como cerrado o resuelto en el sistema para un mejor seguimiento.
| **Excepciones** |  **Acción** |
| | Paso 1 - **Fallo en la conexión con la base de datos**: El sistema debe mostrar un mensaje de error al usuario indicando que no se puede acceder a la información en este momento y sugerir que verifique la configuración de la base de datos o la conexión de red. |
| | Paso 2 - **Fallo en el proceso de generación de alertas**: El sistema debe registrar el error y notificar a los administradores del sistema para su resolución. Además, debe mostrar un mensaje al usuario indicando que ha habido un error en la generación de alertas y que se está trabajando en su solución. |
| | Paso 3 - **Fallo en la entrega de alertas o notificaciones**:  El sistema debe implementar mecanismos de recuperación para intentar reenviar la alerta en caso de un fallo temporal en la entrega. 
| **Postcondición** | Después de que se haya implementado la funcionalidad de "Reportes y alertas", el usuario podrá acceder al notificador de reportes y alertas, y estará informado sobre lso productos prontos a caducar para tomar una mejor desición. |
| **Impacto** | Muy Alto |
| **Urgencia** | Alta |
| **Comentarios** | |

#

| **RF 05** | **Etiquetado apartir de "Lotificación y Trazabilidad"** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Recopilación de información clasificado en sistema "Lote" |.
| **Descripción general** | - Los datos de nuestro programa se ordenará a partir del sistema implementado por nuestro cliente, el sistema "Lote". La clasificación lote se rige por la trazabilidad, en resumen, es la información de cada embarque de pescado, de donde vino, quien lo pescó, forma de empaque, etc. |
| **Precondición** | Tener implementado el sistema Lote en la congeladora y lograr abstraer sus datos. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Recolección de Datos de Trazabilidad**: La pescaderia recibe un nuevo lote de pescado en las instalaciones de procesamiento y a la congeladora. |
| | Paso 2 - **Asignación de Números de Lote**: Los trabajadores asignan un número de Lote al embarque de pescado. |
| | Paso 3 - **Registro de Datos en el Sistema**: Los trabajadores registran el número de lote asignado a la etiqueta RFID, asi como todos sus datos de trazabilidad. 
| | Paso 4 - **Etiquetado de Lotes**: Se colocan las etiquetas RFID en las pilas de pescado.|
| | Paso 5 - **Almacenamiento  Seguimiento**: Se almacena fisicamente, se detecta por el lector RFID y se hace el seguimeinto en tiempo real de la fecha de cada Lote, hasta encontrar algún cambio.
| **Excepciones** |  **Acción** |
| | Paso 1 - **Problemas en el sistema de lotificación**: Comunicar de inmediato al cliente acerca de los problemas técnicos y trabajar en conjunto para resolverlos. Esto puede implicar la actualización o adaptación del sistema de lotificación. |
| | Paso 2 - **Errores en los datos de trazabilidad**: Corregir los datos erróneos, mantener un registro de las correcciones realizadas y asegurarse de que la información correcta se refleje en el etiquetado.
| | Paso 3 - **Perdida de información de trazabilidad**: Notificar de inmediato al cliente y realizar una revisión exhaustiva de los procedimientos para prevenir futuras pérdidas de información. 
| **Postcondición** | Con la implementación exitosa de esta funcionalidad del POC, la forma de etiquetado y el sistema de respaldo será mucho más sencillo y versátil. |
| **Impacto** | Medio |
| **Urgencia** | obligatoria |
| **Comentarios** | |

#

| **RF 06** | **Condiciones ambientales para la tecnología RFID** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Investigación de sistemas de hardware RFID |.
| **Descripción general** | - El sistema deberá operar de manera efectiva en condiciones ambientales relevantes para la tecnología RFID, como variaciones de temperatura y humedad. |
| **Precondición** | Tener acceso al lector RFID o antena  al chip RFID |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Definición de las condiciones ambientales**: Se identifican las condiciones ambientales que son relevantes para la tecnología RFID en el contexto específico en el que se va a implementar el sistema. |
| | Paso 2 - **Selección de componentes y etiquetas RFID adecuadas**: Se eliguen  componentes RFID que estén diseñados para funcionar en las condiciones ambientales identificadas en el paso 1. |
| | Paso 3 - **Pruebas de campo**: Realizar pruebas en un entorno controlado para verificar que los componentes RFID seleccionados funcionen de manera efectiva 
| | Paso 4 - **Validación y documentación**: Validar que el sistema RFID cumple con los requisitos de funcionamiento en condiciones ambientales relevantes y documentar los resultados de las pruebas|
| **Excepciones** |  **Acción** |
| | Paso 1 - **Extremos de temperatura**: El sistema RFID puede no funcionar de manera efectiva en temperaturas extremadamente altas o bajas.  |
| | Paso 2 - **Altos niveles de humedad**: En condiciones de alta humedad o exposición a agua directa, como en entornos acuáticos o cuando el equipo RFID está constantemente mojado, es posible que el sistema no funcione de manera óptima.mación de trazabilidad**: Notificar de inmediato al cliente y realizar una revisión exhaustiva de los procedimientos para prevenir futuras pérdidas de información. 
| **Postcondición** | Si la investigación es efectiva y se define el tipo de tegnologia RFID, se garantiza una implementación de la tegnologia. |
| **Impacto** | Medio |
| **Urgencia** | Alta |
| **Comentarios** | |

#

| **RF 07** | **Implementación de tecnología RFID** |
| --- | --- |
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Requisito** | Tener los dispositivos RFID. |.
| **Descripción general** | - Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores como antenas de lectura. Se implementarán los más adecuados para el POC. |
| **Precondición** | La correcta investigación de la tegnología RFID y el cumplimiento del requerimeinto RF - 06. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Codificación de chips identificadored**: Se codificará los chips identificadores con la información necesaria para identificar los objetos o productos en el POC. |
| | Paso 2 - **Pruebas de dispositivos**: Se realizarán pruebas exhaustivas de los dispositivos RFID seleccionados para garantizar que funcionen correctamente en el entorno del POC.
| | Paso 3 - **Instalación de antenas de lectura**: Se instalarán las antenas de lectura en ubicaciones estratégicas dentro del POC.
| | Paso 4 - **Configuración del sistema**: Se configurará el sistema de recolección y procesamiento de datos RFID para garantizar que los datos se capturen y almacenen de manera eficiente
| | Paso 5 - **Monitoreo y mantenimiento continuo**: Se organizará un programa de monitoreo y mantenimiento continuo para garantizar que la tecnología RFID siga funcionando de manera óptima
| **Excepciones** |  **Acción** |
| | Paso 1 - **Problemas con la instalación**: En caso de no ser capaces de instalar el lector RFID o implememtar los chips, se pedirá ayuda externa.  |
| **Postcondición** | Con la implementación exitosa de esta tegnología, se estará a uns pasos de concluir el POC.  |
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
| **Precondición** |Contar con disponibilidad en los datos de la base de datos. |
| **Secuencia normal** | **Acción** |
| | Paso 1 - **Diseño de la Interfaz**: Se realiarán dibujos, bocetos y pruebas de diseño para la IU. |
| | Paso 2 - **Desarrollo de la Interfaz**: Una vez que el diseño de la interfaz esté listo y aprobado, los proramadores entran a la fase de desarrollo. |
| | Paso 3 - **Integración de Datos**: Se conectará la interfaz de usuario a la base de datos, donde contiene las entradas y salidas. 
| | Paso 4 - **Optimización de Rendimiento**:  Si es necesario, se deben realizar ajustes para optimizar el rendimiento de la interfaz.
| | Paso 5 - **Mantenimiento Continuo:**: La interfaz de usuario será monitoreada y mantenida de manera continua para garantizar su funcionamiento óptimo.
| **Excepciones** |  **Acción** |
| | Paso 1 - **Pérdida de conexión de red**: Comunicar de inmediato al cliente acerca de los problemas técnicos y trabajar en conjunto para resolverlos. Esto puede implicar la actualización o adaptación del sistema de lotificación. |
| | Paso 2 - **Errores en los datos de trazabilidad**: Se despliegará un mensaje de error que indique la pérdida de conexión y sugiera intentar nuevamente cuando se restablezca la conexión.
| | Paso 3 - **Datos incorrectos o no válidos**: La interfaz debe resaltar los campos con problemas y mostrar mensajes de error descriptivos. |
| | Paso 4 - **Error del servidor o de la base de datos**: la interfaz debe mostrar un mensaje de error genérico e informar al usuario que se está trabajando en solucionar el problema. 
| **Postcondición** | Después de la implementación de la interfaz funcional, los usuarios deben ser capaces de acceder al registro de entradas y salidas de forma eficiente y ver los cambios en tiempo real. |
| **Impacto** | Alto |
| **Urgencia** | Baja |
| **Comentarios** | |

#



## **Especificación de RNF**

| **RNF 01** | **Rendimiento y capacidad del Programa** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que nuestro POC sea capaz de funcionar de manera eficiente y efectiva en casos de uso reales.|
| **Requisito** | Tener nuestro programa en nuestra primera versión. |
| **Descripción** | - El programa debe ser sometido a pruebas de rendimiento con el fin de asegurar que pueda gestionar eficazmente la carga de trabajo prevista; a su vez, la base de datos debe ser capaz de almacenar correctamente las lecturas de las entradas y salidas. |
| **Impacto** | Alto |
| **Urgencia** | Moderada |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 02** | **Confiabilidad y precisión de la tegnología RFID** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que la tecnología RFID cumpla con lo requerido en nuestro programa.|
| **Requisito** | Implementar la tegnologia RFID |
| **Descripción** | - La tegnología RFID deberá calibrarse adecuadamente para el registro de entrada y salida. De igual manera, la tegnología debe ser rápida y eficiente en cuanto al tiempo de respuesta, así como para generar informes. |
| **Impacto** | Muy Alto |
| **Urgencia** | Moderada |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 03** | **Escalabilidad y Mantenibilidad del POC** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Asegurarse de que el POC esté preparado para escalar en caso de que se decida implementarla en un entorno de producción. |
| **Requisito** | Se deben cumplir ciertas caracteristicas tanto por parte de la Escalabilidad y de la Mantebilidad. |
| **Descripción** | - El sistema deberá ser diseñado de manera que sea escalable para futuras implementaciones y crecimiento del almacén. De igual manera, el sistema deberá ser mantenible y sostenible a lo largo del ciclo de vida del producto, para poder adaptarse a los cambios y correcciones de la escalabilidad. |
| **Impacto** | Medio |
| **Urgencia** | Menor |
| **Estabilidad** | Media |
| **Comentario** |  |

#

| **RNF 04** | **Seguridad respecto a la información** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar la confidencialidad, integridad y disponibilidad de los datos de inventario de productos pescaderos, así como de la documentación generada. |
| **Requisito** | Autenticación y autorización. Se debe implementar un sistema de autenticación sólido que garantice que solo los usuarios autorizados puedan acceder a la información sensible. |
| **Descripción** |  - Se debe proporcionar niveles adecuados de seguridad para proteger la información sensible y datos del cliente, así como prevenir el acceso no autorizado. |
| **Impacto** | Alto |
| **Urgencia** | Menor |
| **Estabilidad** | Alta |
| **Comentario** |  |

#

| **RNF 05** | **Diseño de UI** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Diseñar una interfaz de usuario que cumpla con los estándares de usabilidad y accesibilidad, satisfaciendo al cliente. |
| **Requisito** |  La interfaz de usuario debe cargar y responder de manera rápida, con un tiempo de  máximo de 2 segundos. |
| **Descripción** |- Ofrecimiento de una interfaz de usuario amigable y eficiente que permita a los usuarios interactuar con las funcionalidades de manera intuitiva. |
| **Impacto** | Muy Alto |
| **Urgencia** | Baja |
| **Estabilidad** | Baja |
| **Comentario** |  |

#

| **RNF 06** | **Reglas de Negocio** |
|---|---|
| **Versión** | Versión 1.0 |
| **Autor** | Deco |
| **Objetivo** | Garantizar que el POC cumpla con un 100% de precisión en el sistema Litificado de acuerdo a las reglas de negocio del cliente y las normas que la rigen.|
| **Requisito** |  La interfaz de usuario debe cargar y responder de manera rápida, con un tiempo de  máximo de 2 segundos. |
| **Descripción** |- El sistema se adaptará a las reglas de negocio del cliente y su empresa, en este caso, apegandonos al sistema de inventario "Lote"; asimismo, cumpliendo con las normas mexicanas e internacionales en cuanto a la documentación. |
| **Impacto** | Alto |
| **Urgencia** | Moderada |
| **Estabilidad** | Alta |
| **Comentario** |  |