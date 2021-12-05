package by.itacademy.javaenterprise.lepnikau.main;

import by.itacademy.javaenterprise.lepnikau.dao.MarkDAO;
import by.itacademy.javaenterprise.lepnikau.dao.impl.MarkDAOImpl;
import by.itacademy.javaenterprise.lepnikau.dao.impl.StudentDAOImpl;
import by.itacademy.javaenterprise.lepnikau.entity.Mark;
import by.itacademy.javaenterprise.lepnikau.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Thread.currentThread().setContextClassLoader(Main.class.getClassLoader());
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("school_journal");
        EntityManager entityManager = factory.createEntityManager();

        MarkDAO markDAO = new MarkDAOImpl(entityManager);
        StudentDAOImpl studentDAO = new StudentDAOImpl(entityManager);

        Mark mark = markDAO.get(1L);
        Student student = studentDAO.get(1L);

        LOG.info(mark.toString());

        LOG.info(student.toString());

    }
}
