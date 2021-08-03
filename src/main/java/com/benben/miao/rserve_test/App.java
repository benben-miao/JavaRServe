package com.benben.miao.rserve_test;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

/*
 1.# R install package and run server
 # 安装模块和配置: 
 install.packages("Rserve")
 library(Rserve)
 # 通过函数和参数运行服务
 Rserve(debug = FALSE, port=6311, args = NULL, quote=(length(args) > 1), wait=FALSE)

 2.Add REngine and RServe dependencies to pom file.
	<dependency>
	    <groupId>org.rosuda.REngine</groupId>
	    <artifactId>REngine</artifactId>
	    <version>2.1.0</version>
	</dependency>
	<dependency>
	    <groupId>org.rosuda.REngine</groupId>
	    <artifactId>Rserve</artifactId>
	    <version>1.8.1</version>
	</dependency>
	
 3.Import packages and connect RServe.
	RConnection rc = null;
	rc = new RConnection();
    REXP x = rc.eval("R.version.string");
 */

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    	RConnection rc = null;
    	try {
    		rc = new RConnection(); //建立与Rserve的连接
    		REXP x = rc.eval("R.version.string"); //执行R语句
    		System.out.println(x.asString());
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally{
    		rc.close(); //关闭与Rserve的连接
    	}
    }
}
