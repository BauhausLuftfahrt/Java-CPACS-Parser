/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselages Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselagesType#getFuselage <em>Fuselage</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselagesType()
 * @model extendedMetaData="name='fuselagesType' kind='elementOnly'"
 * @generated
 */
public interface FuselagesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselagesType_Fuselage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageType> getFuselage();

} // FuselagesType
