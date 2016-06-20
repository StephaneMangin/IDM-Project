/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.irisa.diverse.videogen.videogenl.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VideoGenValidator INSTANCE = new VideoGenValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.irisa.diverse.videogen.videogenl.videoGen";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VideoGenPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VideoGenPackage.MANDATORY:
				return validateMandatory((Mandatory)value, diagnostics, context);
			case VideoGenPackage.INITIALIZE:
				return validateInitialize((Initialize)value, diagnostics, context);
			case VideoGenPackage.VIDEO_GEN:
				return validateVideoGen((VideoGen)value, diagnostics, context);
			case VideoGenPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case VideoGenPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case VideoGenPackage.OPTIONAL:
				return validateOptional((Optional)value, diagnostics, context);
			case VideoGenPackage.VIDEO:
				return validateVideo((Video)value, diagnostics, context);
			case VideoGenPackage.ALTERNATIVES:
				return validateAlternatives((Alternatives)value, diagnostics, context);
			case VideoGenPackage.GENERATE:
				return validateGenerate((Generate)value, diagnostics, context);
			case VideoGenPackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			case VideoGenPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case VideoGenPackage.MIMETYPES_ENUM:
				return validateMimetypes_Enum((Mimetypes_Enum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatory(Mandatory mandatory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatory, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_notIdentical(mandatory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialize(Initialize initialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoGen(VideoGen videoGen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(videoGen, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(videoGen, diagnostics, context);
		if (result || diagnostics != null) result &= validateVideoGen_minMaxNotEqual(videoGen, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minMaxNotEqual constraint of '<em>Video Gen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIDEO_GEN__MIN_MAX_NOT_EQUAL__EEXPRESSION = "\n" +
		"\t\t\tself.minDurationConstraint <= self.maxDurationConstraint";

	/**
	 * Validates the minMaxNotEqual constraint of '<em>Video Gen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoGen_minMaxNotEqual(VideoGen videoGen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.VIDEO_GEN,
				 videoGen,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minMaxNotEqual",
				 VIDEO_GEN__MIN_MAX_NOT_EQUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptional(Optional optional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(optional, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_notIdentical(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validateOptional_probMax(optional, diagnostics, context);
		if (result || diagnostics != null) result &= validateOptional_probMin(optional, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the probMax constraint of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPTIONAL__PROB_MAX__EEXPRESSION = "\n" +
		"\t\t\tself.probability <= 100";

	/**
	 * Validates the probMax constraint of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptional_probMax(Optional optional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.OPTIONAL,
				 optional,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "probMax",
				 OPTIONAL__PROB_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the probMin constraint of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPTIONAL__PROB_MIN__EEXPRESSION = "\n" +
		"\t\t\tself.probability >= 0";

	/**
	 * Validates the probMin constraint of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptional_probMin(Optional optional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.OPTIONAL,
				 optional,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "probMin",
				 OPTIONAL__PROB_MIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideo(Video video, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(video, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternatives(Alternatives alternatives, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alternatives, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_notIdentical(alternatives, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlternatives_probSumMax(alternatives, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the probSumMax constraint of '<em>Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALTERNATIVES__PROB_SUM_MAX__EEXPRESSION = "\n" +
		"\t\t\tself.options.probability->sum() <= 100";

	/**
	 * Validates the probSumMax constraint of '<em>Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternatives_probSumMax(Alternatives alternatives, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.ALTERNATIVES,
				 alternatives,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "probSumMax",
				 ALTERNATIVES__PROB_SUM_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenerate(Generate generate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelay_positiveDelay(delay, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveDelay constraint of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELAY__POSITIVE_DELAY__EEXPRESSION = "\n" +
		"\t\t\tself.value >= 0";

	/**
	 * Validates the positiveDelay constraint of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay_positiveDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.DELAY,
				 delay,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "positiveDelay",
				 DELAY__POSITIVE_DELAY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_notIdentical(sequence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notIdentical constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEQUENCE__NOT_IDENTICAL__EEXPRESSION = "\n" +
		"\t\t\tself.allInstances()->forAll(s1, s2 |\n" +
		"\t\t\t\ts1 <> s2 implies s1.oclAsType(NamedElement).name <> s2.oclAsType(NamedElement).name)";

	/**
	 * Validates the notIdentical constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence_notIdentical(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VideoGenPackage.Literals.SEQUENCE,
				 sequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notIdentical",
				 SEQUENCE__NOT_IDENTICAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimetypes_Enum(Mimetypes_Enum mimetypes_Enum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VideoGenValidator
