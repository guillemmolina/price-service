# Servicio de API REST para Consultar Precios
API que ofrece un servicio para consultar precios de productos

Este servicio de API REST permite consultar precios aplicables a productos en función de la fecha de aplicación, el identificador del producto y el identificador de la marca.

# Parámetros de Consulta

El endpoint para realizar la consulta es:

- GET /price

# Parámetros de Consulta

Para realizar una consulta, se deben proporcionar los siguientes parámetros mediante query parameters, todos obligatorios:

- application_date: La fecha de aplicación del precio en formato ISO 8601.
- product_id: El identificador único del producto.
- brand_id: El identificador único de la marca.


# Arquitectura hexagonal

- Capa de Dominio: Contiene las reglas de negocio y lógica de la aplicación.
- Capa de Aplicación: Actúa como una capa intermedia entre la capa de dominio y las capas externas. Se encarga de orquestar las operaciones y manejar los casos de uso.
- Capa de Infraestructura: Contiene la implementación de los adaptadores de entrada y salida, así como las dependencias externas como bases de datos y servicios externos.

# Pruebas

Se han realizado pruebas para comprobar que la API funciona correctamente. Estas pruebas incluyen:

1. Pruebas de integración para verificar el comportamiento del endpoint /price con diferentes combinaciones de parámetros.