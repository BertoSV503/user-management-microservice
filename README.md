# Registro y Autenticación de Usuarios

## Descripción

Este proyecto es un punto de partida para un microservicio de **registro, autenticación, validación y autorización de usuarios**. Implementa las funcionalidades básicas necesarias para gestionar usuarios en una aplicación, incluyendo el registro de nuevos usuarios, inicio de sesión, y cierre de sesión. 

## Tecnologías Utilizadas

- **Java Development Kit (JDK) 21**: La última versión del JDK para el desarrollo de aplicaciones Java.
- **Spring Boot**: Framework para construir aplicaciones basadas en Spring de manera rápida y eficiente.
- **Spring Security**: Proporciona funcionalidades de autenticación y autorización para proteger aplicaciones.
- **Thymeleaf**: Motor de plantillas para generar vistas en aplicaciones web.
- **Hibernate & JPA**: Facilita la interacción con bases de datos y el manejo de la persistencia de datos.
- **Bootstrap**: Framework de CSS para diseñar interfaces de usuario responsivas y modernas.
- **MariaDB**: Sistema de gestión de bases de datos relacional utilizado para almacenar la información de los usuarios.

## Funcionalidades

- **Registro de Usuarios**: Permite a los nuevos usuarios registrarse proporcionando su nombre, apellido, correo electrónico y contraseña.
- **Inicio de Sesión**: Los usuarios pueden iniciar sesión con sus credenciales.
- **Cierre de Sesión**: Los usuarios pueden cerrar sesión de manera segura.
- **Visualización de Usuarios**: Los usuarios autenticados pueden ver una lista de usuarios registrados en la aplicación.

## Estado del Proyecto

Este proyecto está **completamente funcional** y cubre las funcionalidades básicas mencionadas. Sin embargo, está diseñado como un punto de partida y se prevé la adición de nuevas funcionalidades en el futuro. Algunas posibles extensiones incluyen:

- **Gestión Avanzada de Roles**: Implementación de roles y permisos para un control de acceso más granular.
- **Integración con Servicios Externos**: Posibilidad de integrar con otros sistemas para autenticación federada o servicios externos.
- **Mejoras en la Seguridad**: Inclusión de medidas adicionales de seguridad y auditoría.

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu_usuario/registro-autenticacion-usuarios.git
   ```

2. **Acceder al directorio del proyecto**:
   ```bash
   cd registro-autenticacion-usuarios
   ```

3. **Compilar y ejecutar la aplicación**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Configurar la base de datos**:
   Asegúrate de tener MariaDB en ejecución y configura los detalles de conexión en `src/main/resources/application.properties`.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir al proyecto, por favor sigue estos pasos:

1. **Hacer un fork del repositorio**.
2. **Crear una rama para tu característica**.
3. **Realizar cambios y realizar commits**.
4. **Enviar un pull request**.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).

## Contacto

Para cualquier consulta o información adicional, puedes contactar a [rtorres.roberto@outlook.com](mailto:rtorres.roberto@outlook.com)
