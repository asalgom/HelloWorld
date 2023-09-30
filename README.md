# HelloWorld

# Primeros pasos

Primero hemos estado viendo como funciona el entorno de desarrollo Android Studio como crear un proyecto, en que lenguaje de programacion lo queremos,elegir un activity, hemos creado un emulador para ver como se ejecutaran las aplicaciones que vamos haciendo, tambien vimos que tambien se puede ver las aplicaciones que vamos haciendo en nuestro movil, para ello tenemos que desbloquear las opciones de desarrollador, vamos a los ajustes de nuestro movil despues a Acerca del telefono y luego ir a Informacion de Software y luego seleccionar varias veces numero de compilacion y ya tendriamos las opciones de desarrollador. Ahora activamos la opcion depuracion USB, ponemos un cable USB en nuestro movil y ya la aplicacion se instalara en nuestro movil automaticamente y se ejecutara.

Yo he tenido un problema que el entorno de desarrollo y es que no me reconocia mi movil, investigue si el cable USB que usaba estama en mal estado o que si tenia que reiniciar mi movil antes de conectarlo a mi portatil, hasta vi que habia una opcion que era Thoubleshoot device connection que consiste en buscar dispositivos reconocibles y vi de que aparece dispositivos que no se pueden reconocer y ahi salia mi movil, asi que investigue que es lo que pasaba y encontre una solucion ira que tenia que instalar drives de USB de mi movil especifico en mi portartil que es un LG, lo instale y ya me lo reconoce y me deja instalar aplicaciones en mi movil.

# Interfaz

Vimos tambien como es la interfaz de nuestra aplicacion que seria en activity_main.xml, vimos algunos componentes como el TextView que es una caja de texto no editable, vimos tambien que con el codigo del xml podemos editar algunas opciones como que texto tendra, el posicionamiento del texto, su tamaño, su color, el color de fondo, su estilo, el tamaño. Tambien vimos como ponerle un id. Tambien vimos algunos xml de recursos que son color.xml y string.xml, el color.xml que puedemos definir los colores que utilizaran en nuestra aplicación mediante elementos XML asi podemos reutilizar colores cuando lo necesitemos. Y el string.xml se utiliza para definir y gestionar las cadenas de texto utilizadas en nuestra aplicacion Esto facilita la localización, la reutilización y la personalización del texto de la aplicación.

En la MainActivity.java pusimos objetos de tipo TextView para poner un texto de inicio y otro texto para el final, y usamos el metodo findViewById para buscar por id los TextView que hemos definido antes, como es un recurso ponemos R.id.TvInicial. y luego para cambiar el color de los TextView cuando se ejecuta la aplicacion usamos el metodo setTextColor ponemos la clase Color y luego seleccionamos el color que queremos poner a los TextView.

# Poner un icono



