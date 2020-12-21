## Instalación de scala a través de intellij

1) Descarga intellij, version conmunitaria de la siguiente liga

https://www.jetbrains.com/idea/download/#section=linux

2) Descomprime el archivo y envíalo a un directorio para su instalación (ubuntu 20.04)
$ sudo tar -xzf ideaIC-2020.3.tar.gz -C ~/Software

3) Ejecuta intellij desde terminal
$ cd Software/idea-IC-203.5981.155/
$ ./bin/idea.sh
   
4.1) Sigue las instrucciones del sitio oficial para preparar el ambiente 
   de desarrollo para scala.

https://docs.scala-lang.org/getting-started/intellij-track/getting-started-with-scala-in-intellij.html

4.1) Otra opción es cargar proyecto existente, selecciona el archivo build.sbt y asegurate
	de seleccionar la opción "auto-import". Enseguida todas las dependencias se actualizaran
	automáticamente.
	
5) Ejecuta el programa: 

    - dentro de el proyecto "conekta_test" (en el panel de proyecto), navega al archivo:
    src/main/scala/calcula_numero/Main.scala

    - da click derecho da nuevamente clic a "run 'Main'"