package com.university.demo;

public class Repository {
    import Student;

    @Repository
    public interface Repository extends Repository<Student, Integer>
    {


    }
