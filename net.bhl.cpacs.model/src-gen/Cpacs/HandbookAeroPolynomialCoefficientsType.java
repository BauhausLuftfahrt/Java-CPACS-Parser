/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handbook Aero Polynomial Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HandbookAeroPolynomialCoefficientsType#getPolynomialCoefficient <em>Polynomial Coefficient</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHandbookAeroPolynomialCoefficientsType()
 * @model extendedMetaData="name='handbookAeroPolynomialCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface HandbookAeroPolynomialCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Polynomial Coefficient</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DoubleBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polynomial coefficients for the transition
	 *                                 definition (1st one for 0th grade, 2nd one for 1st grade, ...).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polynomial Coefficient</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getHandbookAeroPolynomialCoefficientsType_PolynomialCoefficient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polynomialCoefficient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoubleBaseType> getPolynomialCoefficient();

} // HandbookAeroPolynomialCoefficientsType
