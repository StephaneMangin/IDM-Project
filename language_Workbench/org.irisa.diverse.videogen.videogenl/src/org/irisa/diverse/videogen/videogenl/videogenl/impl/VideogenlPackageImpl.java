/**
 */
package org.irisa.diverse.videogen.videogenl.videogenl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.irisa.diverse.videogen.videogenl.videogenl.Alternatives;
import org.irisa.diverse.videogen.videogenl.videogenl.Delay;
import org.irisa.diverse.videogen.videogenl.videogenl.Generate;
import org.irisa.diverse.videogen.videogenl.videogenl.Initialize;
import org.irisa.diverse.videogen.videogenl.videogenl.Mandatory;
import org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum;
import org.irisa.diverse.videogen.videogenl.videogenl.NamedElement;
import org.irisa.diverse.videogen.videogenl.videogenl.Optional;
import org.irisa.diverse.videogen.videogenl.videogenl.Sequence;
import org.irisa.diverse.videogen.videogenl.videogenl.Transition;
import org.irisa.diverse.videogen.videogenl.videogenl.Video;
import org.irisa.diverse.videogen.videogenl.videogenl.VideoGen;
import org.irisa.diverse.videogen.videogenl.videogenl.VideogenlFactory;
import org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage;

import org.irisa.diverse.videogen.videogenl.videogenl.util.VideogenlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideogenlPackageImpl extends EPackageImpl implements VideogenlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mimetypes_EnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideogenlPackageImpl() {
		super(eNS_URI, VideogenlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VideogenlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideogenlPackage init() {
		if (isInited) return (VideogenlPackage)EPackage.Registry.INSTANCE.getEPackage(VideogenlPackage.eNS_URI);

		// Obtain or create and register package
		VideogenlPackageImpl theVideogenlPackage = (VideogenlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideogenlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideogenlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVideogenlPackage.createPackageContents();

		// Initialize created meta-data
		theVideogenlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVideogenlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VideogenlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVideogenlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideogenlPackage.eNS_URI, theVideogenlPackage);
		return theVideogenlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatory() {
		return mandatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialize() {
		return initializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen() {
		return videoGenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_MinDurationConstraint() {
		return (EAttribute)videoGenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_MaxDurationConstraint() {
		return (EAttribute)videoGenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_Variantes() {
		return (EAttribute)videoGenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoGen_Transitions() {
		return (EReference)videoGenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoGen_Videos() {
		return (EReference)videoGenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_MinUserConstraint() {
		return (EAttribute)videoGenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_MaxUserConstraint() {
		return (EAttribute)videoGenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_NextTransition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Active() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Selected() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptional() {
		return optionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptional_Probability() {
		return (EAttribute)optionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Url() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Description() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Duration() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Mimetype() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternatives() {
		return alternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternatives_Options() {
		return (EReference)alternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerate() {
		return generateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Value() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Video() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMimetypes_Enum() {
		return mimetypes_EnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideogenlFactory getVideogenlFactory() {
		return (VideogenlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mandatoryEClass = createEClass(MANDATORY);

		initializeEClass = createEClass(INITIALIZE);

		videoGenEClass = createEClass(VIDEO_GEN);
		createEAttribute(videoGenEClass, VIDEO_GEN__MIN_DURATION_CONSTRAINT);
		createEAttribute(videoGenEClass, VIDEO_GEN__MAX_DURATION_CONSTRAINT);
		createEAttribute(videoGenEClass, VIDEO_GEN__VARIANTES);
		createEReference(videoGenEClass, VIDEO_GEN__TRANSITIONS);
		createEReference(videoGenEClass, VIDEO_GEN__VIDEOS);
		createEAttribute(videoGenEClass, VIDEO_GEN__MIN_USER_CONSTRAINT);
		createEAttribute(videoGenEClass, VIDEO_GEN__MAX_USER_CONSTRAINT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__NEXT_TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__ACTIVE);
		createEAttribute(transitionEClass, TRANSITION__SELECTED);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		optionalEClass = createEClass(OPTIONAL);
		createEAttribute(optionalEClass, OPTIONAL__PROBABILITY);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__URL);
		createEAttribute(videoEClass, VIDEO__DESCRIPTION);
		createEAttribute(videoEClass, VIDEO__DURATION);
		createEAttribute(videoEClass, VIDEO__MIMETYPE);

		alternativesEClass = createEClass(ALTERNATIVES);
		createEReference(alternativesEClass, ALTERNATIVES__OPTIONS);

		generateEClass = createEClass(GENERATE);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__VALUE);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__VIDEO);

		// Create enums
		mimetypes_EnumEEnum = createEEnum(MIMETYPES_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mandatoryEClass.getESuperTypes().add(this.getSequence());
		initializeEClass.getESuperTypes().add(this.getTransition());
		videoGenEClass.getESuperTypes().add(this.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		optionalEClass.getESuperTypes().add(this.getSequence());
		videoEClass.getESuperTypes().add(this.getNamedElement());
		alternativesEClass.getESuperTypes().add(this.getSequence());
		generateEClass.getESuperTypes().add(this.getTransition());
		delayEClass.getESuperTypes().add(this.getTransition());
		sequenceEClass.getESuperTypes().add(this.getTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializeEClass, Initialize.class, "Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGenEClass, VideoGen.class, "VideoGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoGen_MinDurationConstraint(), ecorePackage.getEIntegerObject(), "minDurationConstraint", "0", 1, 1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoGen_MaxDurationConstraint(), ecorePackage.getEIntegerObject(), "maxDurationConstraint", "0", 1, 1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoGen_Variantes(), ecorePackage.getEIntegerObject(), "variantes", "0", 1, 1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoGen_Transitions(), this.getTransition(), null, "transitions", null, 1, -1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoGen_Videos(), this.getVideo(), null, "videos", null, 1, -1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoGen_MinUserConstraint(), ecorePackage.getEIntegerObject(), "minUserConstraint", "0", 0, 1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoGen_MaxUserConstraint(), ecorePackage.getEIntegerObject(), "maxUserConstraint", "0", 0, 1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_NextTransition(), this.getTransition(), null, "nextTransition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Active(), ecorePackage.getEBooleanObject(), "active", "true", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Selected(), ecorePackage.getEBooleanObject(), "selected", "false", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptional_Probability(), ecorePackage.getEIntegerObject(), "probability", "0", 1, 1, Optional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Url(), ecorePackage.getEString(), "url", null, 1, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Description(), ecorePackage.getEString(), "description", null, 1, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Duration(), ecorePackage.getEIntegerObject(), "duration", "0", 1, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Mimetype(), this.getMimetypes_Enum(), "mimetype", null, 1, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativesEClass, Alternatives.class, "Alternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternatives_Options(), this.getOptional(), null, "options", null, 2, -1, Alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generateEClass, Generate.class, "Generate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Value(), ecorePackage.getEIntegerObject(), "value", "0", 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Video(), this.getVideo(), null, "video", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mimetypes_EnumEEnum, Mimetypes_Enum.class, "Mimetypes_Enum");
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.NONE);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.MP4);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.FLV);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.MPEGTS);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.MPEG);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.WEBM);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.WMV);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.AVI);
		addEEnumLiteral(mimetypes_EnumEEnum, Mimetypes_Enum.MOV);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (videoGenEClass, 
		   source, 
		   new String[] {
			 "constraints", "minMaxNotEqual"
		   });	
		addAnnotation
		  (optionalEClass, 
		   source, 
		   new String[] {
			 "constraints", "probMax probMin"
		   });	
		addAnnotation
		  (alternativesEClass, 
		   source, 
		   new String[] {
			 "constraints", "probSumMax"
		   });	
		addAnnotation
		  (delayEClass, 
		   source, 
		   new String[] {
			 "constraints", "positiveDelay"
		   });	
		addAnnotation
		  (sequenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "notIdentical"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (videoGenEClass, 
		   source, 
		   new String[] {
			 "minMaxNotEqual", "\n\t\t\tself.minDurationConstraint <= self.maxDurationConstraint"
		   });	
		addAnnotation
		  (optionalEClass, 
		   source, 
		   new String[] {
			 "probMax", "\n\t\t\tself.probability <= 100",
			 "probMin", "\n\t\t\tself.probability >= 0"
		   });	
		addAnnotation
		  (alternativesEClass, 
		   source, 
		   new String[] {
			 "probSumMax", "\n\t\t\tself.options.probability->sum() <= 100"
		   });	
		addAnnotation
		  (delayEClass, 
		   source, 
		   new String[] {
			 "positiveDelay", "\n\t\t\tself.value >= 0"
		   });	
		addAnnotation
		  (sequenceEClass, 
		   source, 
		   new String[] {
			 "notIdentical", "\n\t\t\tself.allInstances()->forAll(s1, s2 |\n\t\t\t\ts1 <> s2 implies s1.oclAsType(NamedElement).name <> s2.oclAsType(NamedElement).name)"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (optionalEClass, 
		   source, 
		   new String[] {
			 "archetype", "Description"
		   });
	}

} //VideogenlPackageImpl
