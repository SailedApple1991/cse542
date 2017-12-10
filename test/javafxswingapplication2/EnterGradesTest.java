/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
Code Submission - 09-Dec-2017
Team No : 19

Team member: 
Vasanta Surya Roop Teja, 
Guanyu Lyu, 
Chaojie Wang, 
Anirban Chatterjee,
Venkata Krishnan Anantha Raman


*/


package javafxswingapplication2;

import java.text.DecimalFormat;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dylanwang
 */
public class EnterGradesTest {
    
    public EnterGradesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of NameGen method, of class EnterGrades.
     */
//    @Test
//    public void testNameGen() {
//        System.out.println("NameGen");
//        EnterGrades instance = null;
//        instance.NameGen();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

  
    
   
        
     

    /**
     * Test of Norm method, of class EnterGrades.
     */
    @Test
    public void testNorm() throws Exception{
        System.out.println("test1");
        int[] Student_Total_Marks = new int[] {9,9};
        int total = 18;
        EnterGrades instance = new EnterGrades(2,0);
        double[] expResult = new double[] {0.5,0.5};
        float[] result = instance.Norm(Student_Total_Marks, total);
        System.out.println(result);
        final double[] doubleArray = new double[result.length];

for (int i = 0; i < result.length; i++) {
    doubleArray[i] = result[i];  // no casting needed
}
        assertTrue(Arrays.equals(expResult, doubleArray));
        // TODO review the generated test code and remove the default call to fail.

    }
    
    //test case when teamsize = 7, non-previously grade entered (all default 
     @Test
    public void testNorm_2() throws Exception{
      
          System.out.println("test2");
        int[] Student_Total_Marks2 = new int[] {9,9,9,9,9,9,9};
        int total_2 = 63;
        EnterGrades instance_2 = new EnterGrades(7,0);
        float[] expResult_2 = new float[] {0.14f,0.14f,0.14f,0.14f,0.14f,0.14f,0.14f};
        System.out.println(Student_Total_Marks2);
        float[] result_2 = instance_2.Norm(Student_Total_Marks2, total_2);
        
      
       
         assertTrue(Arrays.equals(expResult_2, result_2));
        
    }

    @Test
      public void testNorm_3() throws Exception{
      
          System.out.println("test3");
        int[] Student_Total_Marks3 = new int[] {7,8};
        int total_3 = 15;
        EnterGrades instance_3 = new EnterGrades(2,1);
        float[] expResult_3 = new float[] {0.47f,0.53f};
        System.out.println(Student_Total_Marks3);
        float[] result_3 = instance_3.Norm(Student_Total_Marks3, total_3);
        
      
       
         assertTrue(Arrays.equals(expResult_3, result_3));
        
    }
      
      
      @Test
        public void testNorm_4() throws Exception{
      
          System.out.println("test4");
        int[] Student_Total_Marks2 = new int[] {8,11,10,13,8,8,10};
        int total_2 = 68;
        EnterGrades instance_2 = new EnterGrades(7,1);
        float[] expResult_2 = new float[] {0.12f,0.16f,0.15f,0.19f,0.12f,0.12f,0.15f};
        System.out.println(Student_Total_Marks2);
        float[] result_2 = instance_2.Norm(Student_Total_Marks2, total_2);
        
      
       
         assertTrue(Arrays.equals(expResult_2, result_2));
        
    }
    
    
        @Test
        public void testNorm_5() throws Exception{
      
          System.out.println("test5");
        int[] Student_Total_Marks2 = new int[] {0,0,0,0,0,0,0};
        int total_2 = 0;
        EnterGrades instance_2 = new EnterGrades(7,1);
        float[] expResult_2 = null;
        System.out.println(Student_Total_Marks2);
        float[] result_2 = instance_2.Norm(Student_Total_Marks2, total_2);
         
      
       
         assertTrue(Arrays.equals(expResult_2, result_2));
        
    }
    
        
          /**
     * Test of getNameList method, of class EnterGrades. For our implementation,
     * we previously generate 7 person's name for future use and pick. Here,
     * We are going to see if getNameList following slot is empty(null) or not.
     * If some of them are null, test failed.
     */
        
          @Test
    public void testGetNameList_size() {
        System.out.println("test6");
        int Expect = 4;
        EnterGrades instance = new EnterGrades(Expect,0);
        instance.NameGen();
        String[] result = instance.getNameList();
        int count = 0;
        System.out.println(result[0]);
        for(int i =0; i<Expect; i++){
            if(result[i] != null) count+=1;
        }
        
        assertEquals(Expect,count);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    
    @Test
    public void testNorm_6() {
        System.out.println("test7");
        int[] Student_Total_Marks =  new int[] {10,9,8};
        int total = 27;
        EnterGrades instance = new EnterGrades(3,0);
        float[] expResult = new float[] {0.37f,0.33f,0.30f};
        float[] result = instance.Norm(Student_Total_Marks, total);
        //final double[] doubleArray = new double[result.length];
        
        /*for (int i = 0; i < result.length; i++) {
            doubleArray[i] = result[i];  // no casting needed
        }*/
        //int i;
        //for(i=0;i<result.length;i++) System.out.println(result[i]);
        assertTrue(Arrays.equals(expResult, result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
  
    @Test
    public void testNorm_7() {
        System.out.println("test8");
        int[] Student_Total_Marks =  new int[] {7,8,7,11};
        int total = 33;
        EnterGrades instance = new EnterGrades(4,0);
        float[] expResult = new float[] {0.21f,0.24f,0.21f, 0.33f};
        float[] result = instance.Norm(Student_Total_Marks, total);
        
        assertTrue(Arrays.equals(expResult, result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNameList method, of class EnterGrades.
     */
//    @Test
//    public void testGetNameList() {
//        System.out.println("getNameList");
//        EnterGrades instance = null;
//        String[] expResult = null;
//        String[] result = instance.getNameList();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of InitFrame method, of class EnterGrades.
     */
//    @Test
//    public void testInitFrame() {
//        System.out.println("InitFrame");
//        EnterGrades instance = null;
//        instance.InitFrame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class EnterGrades.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EnterGrades.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    

    /**
     * Test of InitFrame method, of class EnterGrades.
     */
//    @Test
//    public void testInitFrame() {
//        System.out.println("InitFrame");
//        EnterGrades instance = null;
//        instance.InitFrame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class EnterGrades.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EnterGrades.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   
   

   
}
