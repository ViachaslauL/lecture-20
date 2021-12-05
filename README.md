<h2>Home task #20</h2>
<h4>Description</h4>
<p>This app acts as a school journal. Allows you to enter data in the form of marks, students, subjects, teachers, and student parents.</p>
<h4>Task list</h4>
<ol>
<li> new git repo
<li> all best practices (.gitignore, readme etc)
<li> base on modules home task #18
<li> add web module
<li> add spring dispatcher servlet
<li> add spring context
<li> deploy to servlet container per studen
</ol>
<h4>Technologies</h4>
<ol>
<li>Java version: 11
<li>MySQL database
<li>docker-compose
<li>Flyway
<li>Hibernate
<li>Slf4j+logback
<li>Lombok
</ol>
<h4>How to run</h4>
<p>In order to build and run the application, follow these steps. 
In the console, go to the project directory and type:</p>
<ol>
<li>mvn clean package
<li>docker-compose up -d
<li>mvn flyway:migrate
</ol>
