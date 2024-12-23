# Usar una imagen base de JDK
FROM openjdk:17-jdk-slim

# Definir el directorio de trabajo
WORKDIR /app

# Copiar el archivo .jar a la imagen
COPY out/artifacts/docker_jar/docker.jar app.jar

# Exponer el puerto
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]