# Dojo Arquitectura

Integrantes: 
Martin Martincorena
Veronica Pava

Se crearon servicios simulando datos de personal y cursos de un colegio. 


### Puertos de acceso aws

http://44.196.59.237:8081/api/personas 

http://44.196.59.237:8080/api/cursos


![PuertosDeAcceso](https://user-images.githubusercontent.com/86497954/163035653-9f8bc977-1b06-4ef2-a54c-d0a9646154ca.png)




### Flujo realizado

#### Paso 1: Desarrollo de la aplicacion y compilacion 

Para poder compilar se tuvo que correr el build desde consola `mvnw install` y configurar un plugin de build en el pom.xml. Se siguieron estos pasos: 

https://javahungry.blogspot.com/2019/05/solved-no-main-manifest-attribute-in-jar.html

#### Paso 2: Dockerizar 

1. Creamos el repositorio en docker hub 

2. Hacemos build utilizando el Dockerfile

3. Hacemos push de la imagen 

#### Paso 3: Crear cuenta e instancia en AWS 

Tener en cuenta los puertos para lograr la conexion desde internet al momento de crear la instancia. 

#### Paso 4: Descargar y correr las imagenes Docker en AWS 

1. Nos conectamos por SSH a la maquina.
2. Instalamos el servicio de Docker, siguiendo esta guia: https://programmerclick.com/article/53951359160/
3. Hacemos pull de las imagenes 
4. Corremos los contenedores con sus puertos correspondientes y en background 


EL flujo completo se ve aquí: 

![flujo](https://user-images.githubusercontent.com/86497954/163035772-bcc9975a-d6f6-453b-8d7b-41346b4efb94.png)


#### Como conectarse a la máquina

1. Crear un keypair en aws y descargarla.
2. Durante la creación de la maquina usar esa keypair 
3. En su máquina local usar WSL, copiar la key al directorio actual y cambiarle los permisos
4. Conectarse usando la llave y la dirección de la maquina. 

![conectarinstancia](https://user-images.githubusercontent.com/86497954/163045136-13ce7a9b-9716-48ca-8798-31d00f455d64.png)







