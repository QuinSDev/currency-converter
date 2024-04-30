# Conversor de moneda 💵
Este repositorio es un <strong>conversor de moneda</strong> que te permite calcular el equivalente entre diferentes divisas. Puedes convertir montos de una moneda a otra, ya sea en <strong>dólares estadounidenses (USD)</strong> o viceversa. La aplicación utiliza la API <strong>ExchangeRate API</strong> para obtener tasas de cambio actualizadas y precisas.

## 🔨 Funcionalidades 
- `1. Conversión monetaria:` La función principal es convertir montos de una moneda a otra. Puedes ingresar un valor en <strong>dólares estadounidenses(USD)</strong> y obtener su equivalente en <strong>reales brasileños(RBL)</strong>, o viceversa.
- `2. Selección de monedas:` El usuario puede elegir las monedas entre las que desea realizar la conversión. (Proximamente más monedas).
- `3. Tasas de cambio en tiempo real:` Utiliza una fuente confiable(como la API <strong>ExchangeRate API</strong>) para obtener tasas de cambio actualizadas. Esto garantiza que las conversiones reflejen las condiciones del mercado en el momento de la consulta.
- `4. Manejo de errores:` La aplicación maneja situaciones inesperadas, como entradas no válidas. Proporciona mensajes de errores claros para guiar al usuario.

![ConversorMoneda](https://github.com/QuinSDev/currency-converter/assets/132032504/1f3cf1ba-7b45-419b-aadb-a623453fa723)



## 📁 Acceso al proyecto
Para poder utilizar la aplicación del conversor de moneda se debe de tener instalado el <strong>[JDK Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)</strong>, y un IDE de su preferencia <strong>([Intellij Idea](https://www.jetbrains.com/idea/download/?section=windows), [Netbeans](https://netbeans.apache.org/front/main/download/))</strong>
<br><br>
Luego de haber instalado Java 17 y el IDE continue con la descarga del proyecto [Aquí](https://github.com/QuinSDev/currency-converter/files/15155141/currency-converter-main.zip) o haga un git clone del repositorio:

```sh
git clone https://github.com/QuinSDev/currency-converter.git
```

Luego, para ejecutar correctamente la aplicación debemos usar la <strong>biblioteca Gson</strong> y tener la <strong>API Key de ExchangeRate API</strong>(o una API de su preferencia). A continucación dejó las guía de ambas:

- [Guía Gson](https://github.com/QuinSDev/currency-converter/blob/main/Gson.md)
- [Guía API Key](https://github.com/QuinSDev/currency-converter/blob/main/ApiKey.md)

## 🛠️ Abra y ejecute el proyecto
Si descargaste el proyecto en .zip deberás descomprimirlo antes de poder buscar y abrir el proyecto. Si lo clonaste solo busca el proyecto y abrelo.

Abre el IDE y dirigete a la opción File, y debes de dar click en Open.
![openProject](https://github.com/QuinSDev/currency-converter/assets/132032504/76381837-b9fa-4087-a466-aed9fbbc0270)

Ahora busca la ubicación del proyecto y le das click en Ok.
![openFileProject](https://github.com/QuinSDev/currency-converter/assets/132032504/5b837a3c-14df-4ea5-a4fa-36632547f6ea)

Cuando hayas abierto el proyecto debes pararte sobre la clase Main.java y darle doble click. Luego debe ejecutar la aplicación dando click en el botón run o con el comando de teclas shift+F10.
![Main](https://github.com/QuinSDev/currency-converter/assets/132032504/b382ab9d-e056-4164-8055-1b105e90aac9)

## 💻 Herramientas utilizadas
- Java 17
- Intellij Idea
- ExchangeRate API
