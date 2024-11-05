package Kotlin.JVMAnnotations.JVMField;

import java.util.Date;

public class JvmFieldJava
{
    public static void main(String[] args) {
        Session javaSession = new Session("java Session");
        String name = javaSession.name;
        Date d = javaSession.date;
    }
}
