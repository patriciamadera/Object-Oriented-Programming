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



 




