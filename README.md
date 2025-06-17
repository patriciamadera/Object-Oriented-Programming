# Plataforma de E-commerce
Caso de Estudio: Diseño arquitectónico de una plataforma e-Commerce. Desarrollar una plataforma e-Commerce utilizando los principios de la Programación 
Orientada a Objetos (OOP) e integrando componentes basados en Inteligencia Artificial (IA). Este enfoque permitirá construir un sistema modular y escalable que pueda adaptarse 
fácilmente a las necesidades cambiantes del comercio electrónico y mejorar la experiencia del usuario mediante funcionalidades inteligentes. La plataforma incluirá la gestión de 
productos, usuarios, carritos de compras y procesamiento de pedidos, junto con módulos de recomendación de productos, optimización de precios, predicción de demanda y 
atención al cliente automatizada. Todos estos componentes estarán construidos sobre una arquitectura OOP robusta que garantice flexibilidad, mantenibilidad y escalabilidad, 
incorporando las mejores prácticas de IA y patrones de diseño. 

## Tecnologías Usadas
- Backend:
    * Java
- Otros:
    * Git

 ## Implementación
 ![image](https://github.com/user-attachments/assets/0dd10764-2859-48ce-ac38-e5cbb57146ea)



 Para este proyecto se esta utilizando Java con el IDE Eclipse, se creo el proyecto y se implementaron las clases siguientes:

 *Producto
 
 ![image](https://github.com/user-attachments/assets/248c5eae-d9a9-4d34-a529-a26ed5173117)


*Categoria

![image](https://github.com/user-attachments/assets/44f909e6-90d2-4016-8cf5-575851015578)

*Carrito de Compras

![image](https://github.com/user-attachments/assets/9a013c70-30ac-4bf8-9408-7b013a09ee96)

*Articulo del Carrito

![image](https://github.com/user-attachments/assets/60e19a45-6e99-4a65-a406-1736966a6949)


 
 *Cliente
 
 ![image](https://github.com/user-attachments/assets/3ac65daf-6fa2-4b73-8ce7-26f23f1ad0e1)
 

 
 *Inventario
 
 ![image](https://github.com/user-attachments/assets/b378542d-46b6-42f9-8ce1-7048537a3448)

 *Orden
 
![image](https://github.com/user-attachments/assets/962bae2e-8230-4ecb-b936-45c7b28b7424)


*Pago

![image](https://github.com/user-attachments/assets/6e440463-35e9-4688-9a3f-ad2efe399ec6)



 ## Extensión de Funcionalidades mediante Herencia

 Se actualizaron las clases Client y Product para convertirlas en clases abstractas e implementar un metodo a cada una

 ![image](https://github.com/user-attachments/assets/7d30861f-3089-48f2-b570-4e9f59778652)

 ![image](https://github.com/user-attachments/assets/d2de05f1-c5b8-43f2-ae89-b65598c46214)


 ![image](https://github.com/user-attachments/assets/9be15889-7d14-444a-acfc-f51a211766f9)

![image](https://github.com/user-attachments/assets/d21e8048-cee6-4cc8-8bbf-7f400699356b)

Para cada clase se crearon dos clases la cual se extienden de esas dos principales

* De la clase Product se crearon dos clases que son DigitalProduct y PhysicalProduct que heredan de la clase principal

* DigitalProduct
  ![image](https://github.com/user-attachments/assets/9458c94a-ff54-49a7-aa90-ed69e8ce013d)

* PhysicalProduct

 ![image](https://github.com/user-attachments/assets/68d1626e-9fcf-4241-8d20-7ef8cfbf1d22)


  * De la clase Client se crearon dos clases que son RegularClient y Administrator que heredan de la clase principal

  * RegularProduct

![image](https://github.com/user-attachments/assets/9687cab0-076b-4924-a094-f7292bc61c62)


   
  * Administrator
 
![image](https://github.com/user-attachments/assets/3a14c96f-0813-497d-bd3e-a3360c11da9d)


## Polimorfismo y Sobrecarga

Agregar una nueva clase llamada ProductManager

![image](https://github.com/user-attachments/assets/e2b66271-bf50-4ba0-9bd3-ad81802cbf7f)

 
Como ya se habia agregado las clases Product que se extiende a las clases PhysicalProduct y DigitalProduct, se modifico la clase ShoppingCart 

![image](https://github.com/user-attachments/assets/d72403c1-840a-4daf-8660-ef8f93fa88a5)


![image](https://github.com/user-attachments/assets/c4606846-fcc3-44fa-a437-998d1419bd9b)


Se creo una clase Main para probarlo

![image](https://github.com/user-attachments/assets/f457f45c-0413-4292-854d-c736ac050119)


Y esto fue lo que salio en la consola al correrlo

![image](https://github.com/user-attachments/assets/bb6044ea-a07e-47ba-b8db-019419af01aa)

## Encapsulamiento y Abstracta

Se le hicieron modificaciones a la clase Product para que sea abstracta y se declaron los atributos como privados para evitar el acceso directo desde fuera de la clase

![image](https://github.com/user-attachments/assets/7e53d0d5-197c-4894-a340-027372243a9b)

Tambien la clase Client

![image](https://github.com/user-attachments/assets/f396ac7c-6d20-47d1-bb7b-d617bbc9bc3d)

Se modifico ShoppingCart para que acepte varios productos y mejorar los metodos

![image](https://github.com/user-attachments/assets/29d3d5d4-e1a3-41be-8e89-b695253df94c)


## Implementación de Interfaces y Clases Abstractas

Se creo la clase abstracta InventoryManager
![image](https://github.com/user-attachments/assets/7d7f46b0-7e44-44f9-8ed5-8ba1838df562)


Luego se creo la clase PhysicalInventoryManager que extiende a InventoryManager
![image](https://github.com/user-attachments/assets/8543b2e5-9046-45ab-90e4-b050a395cba0)


Tambien se creo la clase DigitalInventoryManager que extiende a InventoryManager
![image](https://github.com/user-attachments/assets/748e40f2-76e8-4852-99f3-c4f6245b8e8c)

Se creo la interfaz PaymentProcess
![image](https://github.com/user-attachments/assets/040a7d48-7cc5-4bad-bc8b-493e6b4ad82c)

Luego de crear la interfaz se creo una clase CardPayment que implementa la interfaz
![image](https://github.com/user-attachments/assets/b3478413-5fcf-4662-9f99-5f19d971cc38)


Tambien se creo la clase PayPalPayment que implementa la misma interfaz
![image](https://github.com/user-attachments/assets/418aea38-e7a2-489d-bc77-81decca34b95)


## Implementación de Patrones de Diseño Singleton, Factory y Observer

Se creo la clase SystemConfiguration con el patrón de diseño Singleton

![image](https://github.com/user-attachments/assets/80a5ea3b-f4a2-4b27-901f-6d22de011029)

Luego se implementó la clase EntityFactory que permite crear instancias de Product (PhysicalProduct and DigitalProduct) y Client (Administrator and RegularClient)

![image](https://github.com/user-attachments/assets/1b6eae34-7521-40d4-bb3a-3278ccfbf15d)

Se creo la interfaz llamada Observer

![image](https://github.com/user-attachments/assets/35b9776b-823d-4536-b351-3bdeaf60d2a2)

Se creó una clase OrderStatusNotifier que mantiene una lista de observadores y los notifica cuando cambia el estado de una orden.

![image](https://github.com/user-attachments/assets/ede76b7d-59d6-447a-b3d4-e45b18233bef)

Tambien se creo una clase InventoryObserver que se implementa de la interfaz Observer

![image](https://github.com/user-attachments/assets/31d4af54-9563-4630-a4f6-4fa8cee0631b)

Y otra clase que se llama UIObserver

![image](https://github.com/user-attachments/assets/6e2ddd70-1f2e-4f1b-9136-ba82e83f6daf)


En la clase Main se agregaron las implementaciones para probar lo realizado

![image](https://github.com/user-attachments/assets/e7408ec4-2586-445d-b134-7df5a3d01f52)

Resultado:

![image](https://github.com/user-attachments/assets/7f0bbd7d-1d89-42b3-85ac-fd965228f88d)

## Implementación de Manejo de Excepciones y Pruebas Unitarias

Se creo un folder llamado Exception en donde se crearon dos clases:

![image](https://github.com/user-attachments/assets/8715ef4e-64dc-4e80-afd1-7d784a6e645e)

* InsufficientInventoryException
![image](https://github.com/user-attachments/assets/e5cc15a2-e3b7-4566-84f6-816075a0479e)

  
* PaymentFailedException

![image](https://github.com/user-attachments/assets/565dd8c3-1e8f-4a85-965d-08861321647c)


Luego se modificaron los clases que ya estaban creadas en el proyecto para agregar metodos nuevos para manejar las excepciones


En la clase Payment se agrego un metodo llamado processPayment()
![image](https://github.com/user-attachments/assets/9f1c9a80-7a0d-43c8-ba88-7218da27fac6)

Se modificó la interfaz PaymentProcess para agregar la excepción
![image](https://github.com/user-attachments/assets/450fb528-d9ad-432a-b08c-358f6e3f578a)

Y se modificaron las clases que implementan la interfaz mencionada anteriormente

* PayPalPayment

![image](https://github.com/user-attachments/assets/3ac62410-b0ef-4d92-a497-cce18846d6e1)


* CardPayment
![image](https://github.com/user-attachments/assets/38d821ab-6515-4d09-a204-5126a8239393)


Se agrego al proyecto JUnit 5
![image](https://github.com/user-attachments/assets/0834b8e0-7c5d-4999-b7b8-870e2d5776ac)


Se creo otro folder llamado test para agregar las clases de pruebas

![image](https://github.com/user-attachments/assets/07bb8de8-b6e0-48c5-b6f2-fde1c3fd5de4)

* PaymentProcessTest

![image](https://github.com/user-attachments/assets/c17f5758-5f7b-48b8-ab86-918a809f8fea)

* ProductTest
![image](https://github.com/user-attachments/assets/ce9bdaeb-7d30-4393-ac70-774c447b22ac)

Test de Product
![image](https://github.com/user-attachments/assets/1477afc1-5300-4b12-af52-bd2495f42a8f)

