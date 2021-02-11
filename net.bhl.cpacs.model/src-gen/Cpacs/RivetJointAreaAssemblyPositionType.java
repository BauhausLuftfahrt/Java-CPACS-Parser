/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rivet Joint Area Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RivetJointAreaAssemblyPositionType#getRivetJointAreaUID <em>Rivet Joint Area UID</em>}</li>
 *   <li>{@link Cpacs.RivetJointAreaAssemblyPositionType#getStructuralMemberUID <em>Structural Member UID</em>}</li>
 *   <li>{@link Cpacs.RivetJointAreaAssemblyPositionType#getMaxRivetLength <em>Max Rivet Length</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRivetJointAreaAssemblyPositionType()
 * @model extendedMetaData="name='rivetJointAreaAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface RivetJointAreaAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rivet Joint Area UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rivet Joint Area UID</em>' containment reference.
	 * @see #setRivetJointAreaUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getRivetJointAreaAssemblyPositionType_RivetJointAreaUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rivetJointAreaUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRivetJointAreaUID();

	/**
	 * Sets the value of the '{@link Cpacs.RivetJointAreaAssemblyPositionType#getRivetJointAreaUID <em>Rivet Joint Area UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rivet Joint Area UID</em>' containment reference.
	 * @see #getRivetJointAreaUID()
	 * @generated
	 */
	void setRivetJointAreaUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Member UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Member UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRivetJointAreaAssemblyPositionType_StructuralMemberUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralMemberUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStructuralMemberUID();

	/**
	 * Returns the value of the '<em><b>Max Rivet Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Rivet Length</em>' containment reference.
	 * @see #setMaxRivetLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRivetJointAreaAssemblyPositionType_MaxRivetLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxRivetLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMaxRivetLength();

	/**
	 * Sets the value of the '{@link Cpacs.RivetJointAreaAssemblyPositionType#getMaxRivetLength <em>Max Rivet Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rivet Length</em>' containment reference.
	 * @see #getMaxRivetLength()
	 * @generated
	 */
	void setMaxRivetLength(DoubleBaseType value);

} // RivetJointAreaAssemblyPositionType
