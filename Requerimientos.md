# Requerimientos Generales

## **Requerimientos Funcionales (RF)**

### **RF-01**: Base de Datos

      - La base de datos será capaz de mantener una cantidad considerable de lectura de datos.
      - Se guardarán todos los datos relacionados con las cajas de pescado, el tipo de pescado y la fecha de caducidad. 
      - Se deberá registrarse en una base de datos para su posterior consulta y análisis.
  
### **RF-02**: Funcionalidades Especificas del Programa

      - Sistema de prevención de merma para minimizar pérdidas de productos pescaderos.
      - Registro de entradas y salidas de productos de mariscos para mantener un seguimiento preciso del inventario.
      - Generador de reportes y alertas que permita a los usuarios obtener información valiosa sobre el estado del almacén.

### **RF-03**: Condiciones ambientales para la tecnología RFID
 
      - El sistema deberá operar de manera efectiva en condiciones ambientales relevantes para la tecnología RFID, como variaciones de temperatura y humedad.
  
### **RF-04**: Implementación de tecnología RFID

      - Con base en investigaciones ambientales previas, se codificarán y probarán los dispositivos con tecnología RFID, tanto chips identificadores como antenas de lectura. Se implementarán los más adecuados para el POC.
  
### **RF-05**: Etiquetado de Productos
      - Se etiquetarán cada identificador RFID en relación a los datos relacionados de cada caja de pescado. 
### **RF-06**: "Interfaz" de Usuario

      - Ofrecimiento de una interfaz de usuario amigable y eficiente que permita a los usuarios interactuar con las funcionalidades de manera intuitiva.
  
### **RF-07**: Nivel de seguridad

      - Se debe proporcionar niveles adecuados de seguridad para proteger la información sensible y prevenir el acceso no autorizado.




## Requerimientos No Funcionales (RNF)

### Requerimientos de Producto

### **RNF-01**: Rendimiento del Programa
    
      - El programa debe someterse a pruebas de rendimiento para garantizar que pueda manejar la carga de trabajo esperada de manera eficiente.

### **RNF-02**: Tiempo de Respuesta
      - El tiempo de respuesta del sistema para registrar las entradas y salidas, así como para generar informes, debe ser rápido y eficiente.

### **RNF-03**: Precisión de Lectura RFID
      - La tegnologia RFID deberá calibrarse dadecuadamente para el registro de entrada y salida. 
### **RNF-04**: Escalabilidad del POC (Prueba de Concepto)
    
      - El sistema deberá ser diseñado de manera que sea escalable para futuras implementaciones y crecimiento del almacén.
