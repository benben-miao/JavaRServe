# JavaRServe
Java project call R packages and functions realtime and remote serve.

### 1.Source Code Comment
```Java
package com.benben.miao.rserve_test;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

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
```

![Source Code Comment](https://github.com/benben-miao/JavaRServe/raw/master/resource/readme/JavaRServe.png)

### 2.Dependencies in POM
```XML
<dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    
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
  </dependencies>

```

![Dependencies in POM](https://github.com/benben-miao/JavaRServe/raw/master/resource/readme/JavaRServe2.png)
