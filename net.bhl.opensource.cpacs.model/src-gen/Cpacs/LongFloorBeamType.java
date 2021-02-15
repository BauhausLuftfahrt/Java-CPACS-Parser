/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Floor Beam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LongFloorBeamType#getLongFloorBeamPosition <em>Long Floor Beam Position</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLongFloorBeamType()
 * @model extendedMetaData="name='longFloorBeamType' kind='elementOnly'"
 * @generated
 */
public interface LongFloorBeamType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Long Floor Beam Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LongFloorBeamPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Floor Beam Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLongFloorBeamType_LongFloorBeamPosition()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='longFloorBeamPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LongFloorBeamPositionType> getLongFloorBeamPosition();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LongFloorBeamType
