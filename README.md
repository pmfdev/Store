# Mary - Proyecto Tienda Online

Este repositorio contiene el código fuente para un proyecto de tienda online llamado "Mary".

## Frontend

El directorio `frontend` contiene dos subdirectorios:

1. **mary-store**: Contiene un Dockerfile para construir una imagen de un proyecto Next.js por defecto.
     Para levantar el proyecto mary-store, ejecuta los siguientes comandos:
     docker build -t mary-store-app . (crear imagen utilizando proyecto que esta en el directorio C:\Users\pmf\Desktop\mary\mary\frontend\mary-store)
     docker run --name mary-store -d -p 3000:3000 073481edde69
 (levantar proyecto en docker)
2. **admin-store**: Contiene un Dockerfile para construir una imagen de un proyecto Angular por defecto.

## Backend

El directorio `backend` está estructurado de la siguiente manera:

- **Módulo Principal**: El backend está compuesto por un módulo principal llamado "tienda", que contiene la lógica del dominio y comparte entidades y recursos con sus módulos hijos.

- **Módulos Hijos**:
    1. `administracion-tienda`: Contiene los archivos para el módulo de administración de la tienda.
    2. `web-tienda`: Contiene los archivos para el módulo web de la tienda.

Cada uno de estos módulos hijos tiene su propio directorio en el backend.

Ubicaciones de los directorios:

- Módulo Principal: `C:\Users\pmf\Desktop\mary\mary\backend\tienda\`
- Módulo de Administración: `C:\Users\pmf\Desktop\mary\mary\backend\tienda\administacion-tienda\`
- Módulo Web: `C:\Users\pmf\Desktop\mary\mary\backend\tienda\web-tienda\`


