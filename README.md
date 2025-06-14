# Java-Project
En el ramo de Programación de Algoritmos II, el cual era con Java, se nos pedía trabajar un mini-proyecto en el que debíamos tener en cuenta una BBDD, interacción con el usuario, una lógica de negocio, etc. Se adjunta las instrucciones específicas.


Descripción:

Durante esta semana tendrás que realizar la Evaluación final transversal de la asignatura, en la cual deberán desarrollar una actividad con encargo grupal en la que resolverán un caso planteado a través de la construcción de una solución en la que se implementará un proyecto con arquitectura en capas utilizando el lenguaje de programación Java aplicando el paradigma de orientación a objeto y ejecutando operaciones de acceso a datos que permitan la gestión de la información almacenada. 
Claro, aquí tienes las instrucciones del proyecto formateadas en Markdown para una presentación clara y estética.


> # 💻 Proyecto Final: Sistema de Gestión "DulceHogar"
>
> ## Descripción General de la Evaluación
>
> Durante esta semana tendrás que realizar la **Evaluación final transversal** de la asignatura. Deberás desarrollar una actividad con encargo grupal en la que resolverás un caso planteado a través de la construcción de una solución en la que se implementará un proyecto con **arquitectura en capas** utilizando el lenguaje de programación **Java**, aplicando el paradigma de orientación a objetos y ejecutando operaciones de acceso a datos que permitan la gestión de la información almacenada.
>
> ---
>
> ## 📋 Instrucciones Específicas
>
> ### Arquitectura y Configuración del Proyecto
> * Debe construir un **proyecto nuevo**.
> * El proyecto deberá ser dividido en **3 capas**:
>     1.  Capa de Negocio (Lógica)
>     2.  Capa de Acceso a Datos 
>     3.  Capa de Interfaz de Usuario (UI)
> * Utiliza un patrón de arquitectura para separar la lógica de la vista en la aplicación.
> * Construye el aplicativo a partir de un IDE de lenguaje de programación (ej. Eclipse, IntelliJ IDEA, NetBeans).
>
> ### Capa de Acceso a Datos
> * Debe crear y utilizar una base de datos **MySQL** con el nombre `DulceHogar`.
> * Deberá utilizar una clase que establezca la conexión con la base de datos en su constructor y retornar la misma (conexión) a través de un método `getter`.
> * Codifica las instrucciones de la aplicación para generar la conexión a una base de datos.
> * Deberá crear las clases correspondientes que representen el contexto para cada tabla (ej. `SocioDAO`, `CuentaDAO`).
> * Genera la codificación de las operaciones de acceso a datos (`CRUD`) necesarias para el desarrollo del aplicativo.
>
> ### Capa de Negocio (Lógica)
> * Deberá crear las clases correspondientes que representen la lógica de negocio para cada entidad (ej. `Socio`, `Cuenta`).
> * Las clases de esta capa deben interactuar con las clases de la capa de acceso a datos.
> * Emplear los operadores para definir la lógica de negocio del aplicativo.
> * Utiliza los métodos *custom* para representar la lógica de negocio del aplicativo.
>
> ### Capa de Interfaz de Usuario (UI)
> * En esta capa deberá agregar los formularios (`JFrame`, `JPanel`, etc.) correspondientes.
> * Cuando la aplicación se ejecuta, debe mostrarse una ventana o formulario principal.
> * Para ingresar a la aplicación, el cliente debe ingresar sus **credenciales de inicio**.
> * La ventana principal debe tener un **menú** con opciones para:
>     * Visualizar información de **Socios**.
>     * Gestionar **Cuenta Socio**.
>     * **Salir**.
> * Las clases de esta capa deben interactuar con la capa de negocio.
> * Emplea los componentes gráficos de la interfaz de usuario.
> * Utiliza los elementos de la interfaz de usuario para programar y darle funcionalidad a la aplicación.
>
> ### Requisitos de Implementación y Conceptos
> * **Script Inicial:** En el script de la base de datos, creará **2 socios** con sus **2 cuentas** respectivas.
> * **Lenguaje:** Elaborar la aplicación de acuerdo a la sintaxis de **Java**.
> * **Tipos de Datos:** Considerar los tipos de datos que se requieren para almacenar la información.
> * **Estructuras de Control:** Utilizar en la aplicación las estructuras de control condicionales (`if-else`, `switch`) e iterativas (`for`, `while`).
> * **POO:** Emplea los conceptos de la **programación orientada a objetos**, incluyendo **herencia** y **polimorfismo**.
> * **Colecciones:** Ocupa las colecciones necesarias (`ArrayList`, `HashMap`, etc.) para el almacenamiento y gestión temporal de información.
>
> ---
>
> ## 🏢 Descripción del Caso: DulceHogar
>
> **DulceHogar** le contacta para continuar con una nueva etapa de desarrollo del producto. En esta ocasión, se requiere construir una aplicación de escritorio para la institución.
>
> ### Contexto
>
> **DulceHogar** es una institución para mayores de tercera edad que presta servicios en distintas regiones de Chile. Actualmente, posee siete sucursales activas, con un foco principal en la atención presencial y preferencial a clientes. Siendo una compañía nueva en el mercado, se encuentra en un proceso de crecimiento y posicionamiento, por lo que sus servicios están en continua etapa de perfeccionamiento.
>
> ### Servicios y Cuentas de Socio
>
> Dentro de los servicios que DulceHogar ofrece se encuentra la gestión de **Socios**. Cada socio puede tener **sólo una cuenta** contratada. Una cuenta tiene las siguientes características:
> * **Número de Socio:** Entero de 9 dígitos. Ej: `123456789`
> * **Valor Cuota:** Monto mensual en pesos chilenos que el socio debe cancelar.
> * **Cantidad Aportada:** Valor entero que representa el monto total de los pagos de un socio. Ej: `$ 1.650.000`
>
> ### Operaciones Disponibles
>
> * **Registrar Socio:** Genera el registro de los datos de una persona para ser cliente.
> * **Desplegar Datos del Socio:** Permite visualizar los datos de un socio específico.
> * **Cancelar Cuota:** Cancela un monto mensual en la cuenta, lo que provoca un aumento en la "Cantidad Aportada".
> * **Consultar Saldo:** Muestra la cuota cancelada y el monto total de pagos de un socio.
>
> ### Estructura de Datos
>
> #### Datos del Socio
> * **Número de Socio:** Ej: `123456789`
> * **RUT:** Ej: `22.342.753-0`
> * **Nombre:** Ej: `Albaro`
> * **Apellido Paterno:** Ej: `Henríquez`
> * **Apellido Materno:** Ej: `Mardones`
> * **Correo:** Ej: `Ahenriquez@yahoo.com`
> * **Domicilio:** Ej: `Avenida Principal 123`
> * **Región:** Ej: `Metropolitana`
> * **Ciudad:** Ej: `Santiago`
> * **Comuna:** Ej: `Providencia`
> * **Teléfono:** Ej: `97634562`
>
> #### Datos de la Cuenta del Socio
> * **Numero de Socio:** Ej: `123456789`
> * **Valor Cuota:** Ej: `80000`
> * **Cantidad Aportada:** Ej: `7000000`


