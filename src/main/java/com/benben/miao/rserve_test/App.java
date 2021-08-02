package com.benben.miao.rserve_test;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

/*
 * 1.R install package and run server: install.packages("Rserve"), library(Rserve), Rserve(debug = FALSE, port=6311, args = NULL, quote=(length(args) > 1), wait=FALSE)
 * 2.Add REngine and RServe dependencies to pom file.
 * 3.Import packages and connect RServe.
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    	RConnection rc = null;
    	try {
    		rc = new RConnection(); //建立与Rserve的连接
    		REXP x = rc.eval("R.version.string");//执行R语句
    		System.out.println(x.asString());
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally{
    		rc.close(); //关闭与Rserve的连接
    	}
    }
}
