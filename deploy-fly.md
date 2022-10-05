# Desplegar aplicación Springboot en Fly.io usando Dockerfile

Autor: Licenciado en Sistemas Informáticos Emanuel Aristimuño _ **https://www.linkedin.com/in/emanuel-aristimu%C3%B1o/** _

La siguiente guía sirve únicamente para generar el despliegue de una aplicación Springboot en la nube de fly.io de forma totalmente gratuita.

Para poder **dockerizar** localmente una app es necesario seguir la siguiente guía: [_ **https://spring.io/guides/gs/spring-boot-docker/** _](https://spring.io/guides/gs/spring-boot-docker/)

Pre requisito: tener compilación de proyecto springboot en su computadora local.

A continuación, se detallan los pasos a seguir:

1. Crear archivo **Dockerfile** , en la carpeta de tu proyecto springboot:

![](img/image002.png)

2. Al archivo creado agregarle la dependencia necesaria para levantar jdk11 (por el momento solo jdk11-alpine) y la referencia del archivo **.jar** que contiene la compilación de nuestro proyecto springboot:

Código base:

_ **FROM amazoncorretto:11-alpine-jdk** _

_ **MAINTAINER emaaristimuno** _

_ **COPY** _ _ **target/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar** _ _ **NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar** _

_**ENTRYPOINT ["java","-jar","/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar"]**_

Ejemplo:

![](img/image003.jpg)

Para el ejemplo la compilación que se tendrá en cuenta para crear la imagen se encuentra dentro de la carpeta _ **target** _:

_ **target/demo-0.0.1-SNAPSHOT.jar** _

![](img/image004.jpg)

1. Instalar utilidad de comandos para trabajar con Fly: _ **flyctl** _. Ejecutando en Powershell de Windows:

_**iwr [https://fly.io/install.ps1](https://fly.io/install.ps1) -useb | iex**_

_Ref:_ [_https://fly.io/docs/hands-on/install-flyctl/_](https://fly.io/docs/hands-on/install-flyctl/)

1. Si esta es tu primera vez con Fly.io, tu próximo paso será [Registrarte](https://fly.io/docs/hands-on/sign-up/) . Elegir _ **Try Fly.io for Free** _ como plan para comenzar.

![](img/image005.jpg)

1. Iniciar sesión en Fly:

_ **fly** _ _ **auth** _ _ **signup** _

1. Desplegar nuestra aplicación en los servidores de fly. Ejecutando los siguientes comandos dentro del directorio donde se encuentra el dockerfile:

_ **fly launch** _

_Ref:_ https://fly.io/docs/languages-and-frameworks/dockerfile/

  1. Definir un nombre para nuestra aplicación desplegada en Fly:

![](img/image006.jpg)

  1. _Seleccionar la región que levantara nuestra app:_

![](img/image007.jpg)

_Lo cual creara un archivo_ _ **fly.toml** _ _con las configuraciones necesarias._

  1. _Nos pregunta si queremos instalar una Base de Datos Postgresql, seleccionar que_ _ **No** __:_

![](img/image008.jpg)

  1. _Finalmente, generar nuestro Deploy respondiendo_ _ **YES** _ _a la pregunta:_

![](img/image009.jpg)

1. _Dirigirnos a nuestras aplicaciones desplegadas en_ [_https://fly.io/dashboard_](https://fly.io/dashboard)

![](img/image010.jpg)

1. _Seleccionar la app, Ejemplo:_ _ **deploy-spring-dockerfile** _

![](img/image011.jpg)

1. _Verificar el correcto funcionamiento del servidor:_

![](img/image012.jpg)

| PEV - LIC. En sistemas informáticos Emanuel Aristimuño | 0 |
| --- | --- |