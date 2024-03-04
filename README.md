# Servicio de API REST para Consultar Precios
API que ofrece un servicio para consultar precios de productos

Este servicio de API REST permite consultar precios aplicables a productos en función de la fecha de aplicación, el identificador del producto y el identificador de la marca.

Los motivos principales por los que esta aplicación usa arquitectura hexagonal son:
1. Separación de preocupaciones: Permite separar claramente las responsabilidades de cada capa. Respetando en todo momento DDD (Patrón de diseño Domain Driven Design).
2. Testabilidad: Es posible testear la aplicación de forma aislada.
3. Escalabilidad: Añadir nuevas funcionalidades sin modificar la lógica existente.
4. Mantenimiento: Es muy fácil identificar y corregir los errores.

En resumen, este servicio price-service podría escalar gradualmente a una aplicación mucho más compleja, con comunicación a otros microservicios, añadiendo nuevas funcionalidades, etc. Por ende, en una empresa de gran magnitud, es imprescindible tener una estructura y un orden para mejorar el mantenimiento futuro.
# Endpints

El endpoint para realizar la consulta es:

- GET /price

# Parámetros de Consulta

Para realizar una consulta, se deben proporcionar los siguientes parámetros mediante query parameters, todos obligatorios:

- application_date: La fecha de aplicación del precio en formato ISO 8601.
- product_id: El identificador único del producto.
- brand_id: El identificador único de la marca.


# Arquitectura hexagonal
Diferenciación de capas.
- Capa de Dominio: Contiene las reglas de negocio y lógica de la aplicación.
- Capa de Aplicación: Actúa como una capa intermedia entre la capa de dominio y las capas externas. Se encarga de orquestar las operaciones y manejar los casos de uso.
- Capa de Infraestructura: Contiene la implementación de los adaptadores de entrada y salida.

# Pruebas

Se han realizado pruebas para comprobar que la API funciona correctamente. Estas pruebas incluyen:

1. Pruebas de integración para verificar el comportamiento del endpoint /price con diferentes combinaciones de parámetros.
