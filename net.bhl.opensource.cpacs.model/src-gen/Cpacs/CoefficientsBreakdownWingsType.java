/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Wings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingsType#getWing <em>Wing</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingsType()
 * @model extendedMetaData="name='coefficientsBreakdownWingsType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownWingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CoefficientsBreakdownWingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingsType_Wing()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoefficientsBreakdownWingType> getWing();

} // CoefficientsBreakdownWingsType
