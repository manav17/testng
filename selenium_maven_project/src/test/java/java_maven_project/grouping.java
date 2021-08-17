package java_maven_project;

import org.testng.annotations.Test;

public class grouping {

    @Test(groups = {"automation"})
    void test1()
    {
        System.out.println("gridpoint_1");
    }

    @Test(groups = {"development"})
    void test2()
    {
        System.out.println("gridpoint_2");
    }

    @Test(groups = {"automation"})
    void test3()
    {
        System.out.println("gridpoint_1");
    }

    @Test(groups = {"development"})
    void test4()
    {
        System.out.println("gridpoint_2");
    }

}
