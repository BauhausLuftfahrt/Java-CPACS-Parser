/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Segment Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentSegmentPathType#getHingePoint <em>Hinge Point</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentPathType#getHingeRotation <em>Hinge Rotation</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentPathType#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentSegmentPathType()
 * @model extendedMetaData="name='componentSegmentPathType' kind='elementOnly'"
 * @generated
 */
public interface ComponentSegmentPathType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Hinge Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of hingePoint of the
	 *                                 componentSegment. The hingePoint is used as reference point for
	 *                                 the deflection definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Point</em>' containment reference.
	 * @see #setHingePoint(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentPathType_HingePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hingePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getHingePoint();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentPathType#getHingePoint <em>Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Point</em>' containment reference.
	 * @see #getHingePoint()
	 * @generated
	 */
	void setHingePoint(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Hinge Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the orientation of the hinge
	 *                                 line with three Euler-rotation angles. The hinge line is
	 *                                 oriented along the global y-axis if all rotations are 0.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Rotation</em>' containment reference.
	 * @see #setHingeRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentPathType_HingeRotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hingeRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getHingeRotation();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentPathType#getHingeRotation <em>Hinge Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Rotation</em>' containment reference.
	 * @see #getHingeRotation()
	 * @generated
	 */
	void setHingeRotation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ComponentSegmentStepsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of all steps of the deflection
	 *                                 path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getComponentSegmentPathType_Steps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='steps' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentSegmentStepsType> getSteps();

} // ComponentSegmentPathType
