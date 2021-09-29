# GitHub y GitBash

Pasos a seguir para subir archivos de cualquier tipo al repositorio GitHub:

1. Descargar GitBash y ejecutarlo dentro de la carpeta que servira de repositorio local. Click derecho dentro de la carpeta
y opcion "Git Bash Here".

2. Configurar nombre y correo:
    
        git config --global user.name "nombre Usuario del Github"
        git config --global user.email "correo electronico usado en la cuenta del Github"
    
3. Configurar el repositorio remoto al que enviaremos los archivos (el nuestro vamos):
    
        git remote add <origin> <URL_REPOSITORIO>
    
    <origin> es un nombre remoto/alias, no tiene porque ser 'origin' podemos poner el alias que queramos(p.e. 'envio')
    <URL_REPOSITORIO> es una URL remota, la de nuestro repositorio  https://github.com/MCober27/Programacion20-21.git
    
    Con el comando:
        
            git remote -v
        
    Comprobamos el alias y la URL a la que apunta dicho alias
        
    Para cambiar la URL a la que apunta un alias* se usa el comando:
        
            git remote set-url <alias> <URL_REPOSITORIO>
        
    *Podemos tener varios alias apuntando a distintas URL de repositorios distintos
        
4. Comprobamos estos cambios con el comando:
        
            git config --list
        
5. Copiamos el repositorio del github con el comando:
        
            git clone  https://github.com/MCober27/Programacion20-21.git
        
      Asi tendremos el repositorio del github en local. A partir de ahi solo hay que incluir los archivos que queramos           subir al repositorio github.
  
            git add "nombre_archivo.extension"
 
6. Realizamos el commit:
        
            git commit -m "comentario explicativo para el commit, indica por que lo subimos o que subimos, etc etc"

7. Falta subir los nuevos archivos al repositorio GitHub
        
            git push origin main
        
       Recordamos que 'origin' es el alias de la URL de nuestro repositorio GitHub.
       La rama 'main' es la rama principal donde se subiran los cambios y archivos nuevos, antiguamente se podian llamar
       'master'. PAra salir de dudas se puede usar el comando:
        
             git branch
        
8. Pero antes de subir los cambios como estan trabajando en equipo necesitas de asegurarte de descargar el codigo 
   actualizado del proyecto para eso ejecutas:
        
             git pull origin main
        
ADDICIONAL: 
   Para ver los logs y commits ejecuta:
            
            git log
        
            
        
        


