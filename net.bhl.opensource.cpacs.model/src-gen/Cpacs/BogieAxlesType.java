/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bogie Axles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BogieAxlesType#getAxle <em>Axle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBogieAxlesType()
 * @model extendedMetaData="name='bogieAxlesType' kind='elementOnly'"
 * @generated
 */
public interface BogieAxlesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Axle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.BogieAxleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getBogieAxlesType_Axle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BogieAxleType> getAxle();

} // BogieAxlesType
