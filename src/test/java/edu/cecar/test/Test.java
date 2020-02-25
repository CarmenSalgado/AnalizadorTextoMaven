package edu.cecar.Test;
/**
*
* Clase: Test
*
* versión:0.1
*
* fecha Creación: 15/09/2019
*
* fecha Modificación: 25/02/2020
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* @class Expression class is undefined on line 15, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE HACER TESTING O PRUEBAS DE LA APP...
*
**/

import junit.framework.*;


public class Test extends TestCase {

 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void Test()
    {
        assertTrue( true );
    }
    
}
