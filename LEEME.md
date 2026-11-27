# Mi Biblioteca (Android)

App de lectura de libros EPUB y TXT.

## Cómo sacar el APK
1. Creá un repositorio nuevo en GitHub (por ejemplo `mi-biblioteca`).
2. Subí todo el contenido de esta carpeta (incluida la carpeta `.github`).
3. Entrá a la pestaña **Actions**: la compilación arranca sola y tarda unos 5 minutos.
4. Cuando termine en verde, abrí la ejecución y bajá **MiBiblioteca-apk**. Adentro está `app-debug.apk`.
5. En el celular, abrí el APK y permití instalar apps de origen desconocido si te lo pide.

## Para cambiar la app
Todo el diseño y las funciones están en `app/src/main/assets/index.html`.
Al subir cambios, GitHub vuelve a compilar el APK solo.
