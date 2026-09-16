# Examen - Automatización de Pruebas


### Descripción del Proyecto
Este repositorio contiene un proyecto Java Maven configurado con JUnit y Selenium para demostrar un flujo completo de CI/CD utilizando Trunk-Based Development.

### Estrategia de Pruebas e Integración Continua (CI)
- Se definió un pipeline de CI (`ci-pipeline.yml`) en GitHub Actions que se ejecuta automáticamente en cada 'push' a la rama `main`.
- El pipeline incluye etapas de compilación (build), pruebas unitarias e integración para garantizar la calidad del código[cite: 3, 5, 6].

### Estrategia de Entrega Continua (CD) y Rollback
- Se implementó un pipeline de CD (`cd-deployment.yml`) para simular el despliegue en un ambiente de Staging.
- Incluye pruebas de aceptación (smoke tests) y un mecanismo de **Rollback Automático** que se desencadena ante fallos de salud post-despliegue, asegurando la restauración rápida a un estado estable previo[cite: 3, 5, 6].

### Cómo ejecutar las pruebas localmente
Ejecutar el comando en la terminal: `mvn clean test`