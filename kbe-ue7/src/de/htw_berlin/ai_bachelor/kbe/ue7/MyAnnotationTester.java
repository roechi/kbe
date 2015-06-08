package de.htw_berlin.ai_bachelor.kbe.ue7;

import java.io.Serializable;

/*  In dieser Klasse wird die selbstgeschriebene Annotation CreationInfo mit den Parametern description, tags, baseClass
 *  und interfaces verwendet. Der Parameter author wird nicht explizit gesetzt und nimmt daher den default-Wert Max 
 *  Mustermann an.
 */ 
@CreationInfo(description = "Diese Klasse dient allein als Repräsentationsbeispiel für selbstgeschriebene Annotations", 
			  tags = {"Annotationen", "Test"},
			  baseClass = AnnotationTester.class,
			  interfaces = {Annotation.class, Serializable.class})
public class MyAnnotationTester extends AnnotationTester implements Annotation, Serializable
{
	private static final long serialVersionUID = 1L;
	private String testField;
	
	public MyAnnotationTester() 
	{
		testField = "Test";
	}
	
	public void foo()
	{
	}
	
	public String getTestField()
	{
		return testField;
	}
}
