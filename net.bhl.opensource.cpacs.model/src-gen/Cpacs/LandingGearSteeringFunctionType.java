/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Steering Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearSteeringFunctionType#getStep <em>Step</em>}</li>
 *   <li>{@link Cpacs.LandingGearSteeringFunctionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionType()
 * @model extendedMetaData="name='landingGearSteeringFunctionType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearSteeringFunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearSteeringFunctionStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Step within the steering path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionType_Step()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearSteeringFunctionStepType> getStep();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSteeringFunctionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LandingGearSteeringFunctionType
