/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positionings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PositioningsType#getPositioning <em>Positioning</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPositioningsType()
 * @model extendedMetaData="name='positioningsType' kind='elementOnly'"
 * @generated
 */
public interface PositioningsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positioning</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PositioningType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPositioningsType_Positioning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioning' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositioningType> getPositioning();

} // PositioningsType
