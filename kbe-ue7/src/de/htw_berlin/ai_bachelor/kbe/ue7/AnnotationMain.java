package de.htw_berlin.ai_bachelor.kbe.ue7;

import java.util.Arrays;

public class AnnotationMain 
{
	public static void main(String[] args) 
	{
		CreationInfo creationInfo = MyAnnotationTester.class.getAnnotation(CreationInfo.class);	
		if (creationInfo != null)
			printCreationInfo(creationInfo);
		else
			System.out.println("Keine " + CreationInfo.class.getSimpleName() + "-Annotation vorhanden.");
	}
	
	private static void printCreationInfo(CreationInfo creationInfo) {
		System.out.println("author: " + creationInfo.author());
		System.out.println("description: " + creationInfo.description());
		System.out.println("tags: " + Arrays.toString(creationInfo.tags()));
		System.out.println("baseClass: " + creationInfo.baseClass().getName());
		System.out.println("interfaces: " + Arrays.toString(creationInfo.interfaces()));
	}
}
