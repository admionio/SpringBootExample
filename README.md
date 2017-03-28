# SpringBootExample
This is sample spring boot + spring mvc projects
pom details:
1. The parent include a lots of dependeces and version, we no need to specify version on the dependency.
2. starter-web: Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container.
3. spring-webmvc: Spring MVC module, spring boot will auto load and config.
4. starter-tomcat: Starter for using Tomcat as the embedded servlet container. Default servlet container starter used by spring-boot-starter-web.
5. tomcat-embed-jasper: embed tomcat contianer.
6. springloaded: hot deploy plugin.
7. maven-compiler-plugin: specify the compiler version.

files:
1. build.cmd: provide for windows version build script to package the project.
2. run.cmd: provide for windows version run project script, you can simply run this script and will running the project.
3. settings.xml: specify the Chinese maven mirror for speeding up the building.
