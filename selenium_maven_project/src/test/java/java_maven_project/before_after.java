package java_maven_project;

import org.testng.annotations.*;

public class before_after {


    @BeforeClass
void before_class()
    {
    System.out.println("before class");
    }

    @AfterClass
    void after_class()
    {
        System.out.println("after class");
    }


@BeforeTest
void before_test()

{
    System.out.println("this is before TEST");
}


@AfterTest
void after_test()
{
    System.out.println("this is after test");
}

@BeforeMethod
void before_method()
{
    System.out.println("entering into test case");
}


@AfterMethod
void after_method()
{
    System.out.println("exiting from test case");
}


@Test
void test1()
{
    System.out.println("test 1 is executed");
}

@Test
    void test2()
{
    System.out.println("test 2 is executed");
}

}


