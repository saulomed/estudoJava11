/**
 * 
 */
package br.com.saulo.java.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author saulo
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	
	String str();
	int val();

}
