/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import videoGenTrace.States.videoGen.TracedMandatory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Mandatory Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Mandatory_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Mandatory_Execute extends VideoGen_VideoGen_Execute_AbstractSubStep, VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Transition_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Mandatory_Execute_AbstractSubStep>, VideoGen_Transition_FinishExecute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedMandatory) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedMandatory getCaller();

} // VideoGen_Mandatory_Execute
