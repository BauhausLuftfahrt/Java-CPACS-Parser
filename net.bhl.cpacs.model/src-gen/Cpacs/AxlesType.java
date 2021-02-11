/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AxlesType#getAxle <em>Axle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAxlesType()
 * @model extendedMetaData="name='axlesType' kind='elementOnly'"
 * @generated
 */
public interface AxlesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Axle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AxleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAxlesType_Axle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AxleType> getAxle();

} // AxlesType
