/**
 */
package videoGenTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videoGenTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE: return createVideoGen_Alternatives_Execute();
			case StepsPackage.VIDEO_GEN_DELAY_EXECUTE: return createVideoGen_Delay_Execute();
			case StepsPackage.VIDEO_GEN_GENERATE_COMPUTE: return createVideoGen_Generate_Compute();
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE: return createVideoGen_Generate_Execute();
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE: return createVideoGen_Initialize_Execute();
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE: return createVideoGen_Mandatory_Execute();
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE: return createVideoGen_Optional_Execute();
			case StepsPackage.VIDEO_GEN_SEQUENCE_EXECUTE: return createVideoGen_Sequence_Execute();
			case StepsPackage.VIDEO_GEN_TRANSITION_EXECUTE: return createVideoGen_Transition_Execute();
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT: return createVideoGen_Video_Select();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Alternatives_Execute createVideoGen_Alternatives_Execute() {
		VideoGen_Alternatives_ExecuteImpl videoGen_Alternatives_Execute = new VideoGen_Alternatives_ExecuteImpl();
		return videoGen_Alternatives_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Delay_Execute createVideoGen_Delay_Execute() {
		VideoGen_Delay_ExecuteImpl videoGen_Delay_Execute = new VideoGen_Delay_ExecuteImpl();
		return videoGen_Delay_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Generate_Compute createVideoGen_Generate_Compute() {
		VideoGen_Generate_ComputeImpl videoGen_Generate_Compute = new VideoGen_Generate_ComputeImpl();
		return videoGen_Generate_Compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Generate_Execute createVideoGen_Generate_Execute() {
		VideoGen_Generate_ExecuteImpl videoGen_Generate_Execute = new VideoGen_Generate_ExecuteImpl();
		return videoGen_Generate_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Initialize_Execute createVideoGen_Initialize_Execute() {
		VideoGen_Initialize_ExecuteImpl videoGen_Initialize_Execute = new VideoGen_Initialize_ExecuteImpl();
		return videoGen_Initialize_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Mandatory_Execute createVideoGen_Mandatory_Execute() {
		VideoGen_Mandatory_ExecuteImpl videoGen_Mandatory_Execute = new VideoGen_Mandatory_ExecuteImpl();
		return videoGen_Mandatory_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Optional_Execute createVideoGen_Optional_Execute() {
		VideoGen_Optional_ExecuteImpl videoGen_Optional_Execute = new VideoGen_Optional_ExecuteImpl();
		return videoGen_Optional_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Sequence_Execute createVideoGen_Sequence_Execute() {
		VideoGen_Sequence_ExecuteImpl videoGen_Sequence_Execute = new VideoGen_Sequence_ExecuteImpl();
		return videoGen_Sequence_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Transition_Execute createVideoGen_Transition_Execute() {
		VideoGen_Transition_ExecuteImpl videoGen_Transition_Execute = new VideoGen_Transition_ExecuteImpl();
		return videoGen_Transition_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Video_Select createVideoGen_Video_Select() {
		VideoGen_Video_SelectImpl videoGen_Video_Select = new VideoGen_Video_SelectImpl();
		return videoGen_Video_Select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
