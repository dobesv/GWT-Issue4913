package test.rebind;

import test.client.TestClassToFind;
import test.client.TestSubclassToFind;

import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.core.ext.typeinfo.NotFoundException;

public class Generator extends com.google.gwt.core.ext.Generator {

	@Override
	public String generate(TreeLogger logger, GeneratorContext context,
			String typeName) throws UnableToCompleteException {
		JClassType cls;
		System.out.println(this+" running ...");
		try {
			cls = context.getTypeOracle().getType(TestSubclassToFind.class.getName());
			System.out.println("Found class .... "+cls);
			System.out.println("Methods of "+cls.getName());
			for(JMethod m : cls.getMethods()) {
				System.out.println(m);
			}
			System.out.println("Methods of the super class of "+cls.getName()+" ("+cls.getSuperclass().getName()+")");
			for(JMethod m : cls.getSuperclass().getMethods()) {
				System.out.println(m);
			}
			JClassType cls2 = context.getTypeOracle().getType(TestClassToFind.class.getName());
			System.out.println("Methods of class "+cls2.getName());
			for(JMethod m : cls2.getMethods()) {
				System.out.println(m);
			}
			
		} catch (NotFoundException e) {
			e.printStackTrace();
			throw new UnableToCompleteException();
		}
		
		return null;
	}

}
