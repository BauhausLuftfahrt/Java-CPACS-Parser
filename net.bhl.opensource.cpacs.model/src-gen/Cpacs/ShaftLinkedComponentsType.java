/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shaft Linked Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ShaftLinkedComponentsType#getGroup <em>Group</em>}</li>
 *   <li>{@link Cpacs.ShaftLinkedComponentsType#getEngineUID <em>Engine UID</em>}</li>
 *   <li>{@link Cpacs.ShaftLinkedComponentsType#getTransmissionShaftInputUID <em>Transmission Shaft Input UID</em>}</li>
 *   <li>{@link Cpacs.ShaftLinkedComponentsType#getTransmissionShaftOutputUID <em>Transmission Shaft Output UID</em>}</li>
 *   <li>{@link Cpacs.ShaftLinkedComponentsType#getRotorUID <em>Rotor UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType()
 * @model extendedMetaData="name='shaftLinkedComponentsType' kind='elementOnly'"
 * @generated
 */
public interface ShaftLinkedComponentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Engine UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a linked engine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType_EngineUID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineUID' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<StringUIDBaseType> getEngineUID();

	/**
	 * Returns the value of the '<em><b>Transmission Shaft Input UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a linked transmission shaft input.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Shaft Input UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType_TransmissionShaftInputUID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transmissionShaftInputUID' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<StringUIDBaseType> getTransmissionShaftInputUID();

	/**
	 * Returns the value of the '<em><b>Transmission Shaft Output UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a linked transmission shaft output.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Shaft Output UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType_TransmissionShaftOutputUID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transmissionShaftOutputUID' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<StringUIDBaseType> getTransmissionShaftOutputUID();

	/**
	 * Returns the value of the '<em><b>Rotor UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a linked rotor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotor UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getShaftLinkedComponentsType_RotorUID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rotorUID' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<StringUIDBaseType> getRotorUID();

} // ShaftLinkedComponentsType
