/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConstraintsType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConstraintsType()
 * @model extendedMetaData="name='constraintsType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ConstraintSettingsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getConstraintsType_Constraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstraintSettingsType> getConstraint();

} // ConstraintsType
