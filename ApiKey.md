# Guía para usar Api Key

Nos dirigiremos al sitio de <strong>[ExchangeRate API](https://www.exchangerate-api.com/)</strong>, una vez en el sitio el ya nos ubicará en la ventana de <strong>Get Free Key</strong> 
donde introduciremos nuestro <strong>email.</strong>

![exchangeRate](https://github.com/QuinSDev/currency-converter/assets/132032504/896e2425-7dce-467e-aed8-d83360bb3bae)

<br>
Debemos esperar un momento a que nos llegué un correo con las instrucciones para activar nuestra Api Key y la dirección de la misma. Una vez realizado todo este proceso y con nuestra Api Key 
activada y lista para ser usada el siguiente paso que deberemos realizar es crear un archivo de texto para guardar nuestra Api Key y que está este más segura.

![apiKeyTexto](https://github.com/QuinSDev/currency-converter/assets/132032504/298bdd51-ec5e-4a6d-bc14-e8786d626e4d)

<br>
Dentro del archivo de texto pegarás tu Api Key y guardarás el archivo

![pegarApiKey](https://github.com/QuinSDev/currency-converter/assets/132032504/d69859aa-dcd3-45fe-95de-43c864ea049a)

<br>
Una vez realizado todo esto, nos dirigiremos a nuestro proyecto abierto en el IDE y abriremos nuestra clase <strong>ApiKey.java</strong>. En el método loadApiKey cambaremos el nombre que hay allí
por el nombre del archivo que creamos(en mi caso api_key.txt).

![ApiKeyJava](https://github.com/QuinSDev/currency-converter/assets/132032504/1a931761-e44b-49a7-bc96-9d35872e6751)

<br>
De esta manera ya podremos usar nuestra Api Key de EcxhangeRate API, pero también puedes usar una API de tu preferencia.
