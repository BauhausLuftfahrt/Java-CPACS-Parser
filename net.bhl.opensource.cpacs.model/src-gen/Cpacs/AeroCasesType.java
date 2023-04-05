/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroCasesType#getAeroCase <em>Aero Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroCasesType()
 * @model extendedMetaData="name='aeroCasesType' kind='elementOnly'"
 * @generated
 */
public interface AeroCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroCasesType_AeroCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroCaseType> getAeroCase();

} // AeroCasesType
