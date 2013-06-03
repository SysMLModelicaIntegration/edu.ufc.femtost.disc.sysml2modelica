edu.ufc.femtost.disc.sysml2modelica
===================================

ATL and Acceleo based transformation from SysML to Modelica

Implementation of the SysML-Modelica Transformation Version 1.0
(Beta3 Specification of the SysML-Modelica 1.0 FTF2, with change bars) 
March 2012

KNOWN ISSUES

ISSUE 1

	Derived attributes :
	+/isFinal : Boolean = false
	+/isPartial : Boolean  = false
	
	from 
		SysML4Modelica::Classes::ModelicaClassDefinition
		SysML4Modelica::Components::ModelicaValueProperty
		SysML4Modelica::Components::ModelicaPart
		SysML4Modelica::Components::ModelicaFunctionParameter
		SysML4Modelica::Components::ModelicaPort
		
		Issue: for instance error when saving a .sysml model 
		java.lang.NullPointerException on ModelicaClassDefinition.java
		
		public boolean isFinal() {
			return this.base_Classifier.isLeaf();
		}
		
		public boolean isPartial() {
			return this.base_Classifier.isAbstract();
		}
		
		Resolved by setting isDerived attribute to false for isFinal and isPartial
	
ISSUE 2
	
	Multiplicity [0..*] or [1..*]
		modification : String[0..*]
		arraySize : String[0..*]
		variable : String[1..*]
		externalLibrary : String[0..*]
	
	
