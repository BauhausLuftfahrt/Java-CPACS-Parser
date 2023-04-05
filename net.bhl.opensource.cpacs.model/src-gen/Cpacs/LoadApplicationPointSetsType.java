/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Application Point Sets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadApplicationPointSetsType#getLoadApplicationPointSet <em>Load Application Point Set</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetsType()
 * @model extendedMetaData="name='loadApplicationPointSetsType' kind='elementOnly'"
 * @generated
 */
public interface LoadApplicationPointSetsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Application Point Set</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LoadApplicationPointSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Application Point Set</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetsType_LoadApplicationPointSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadApplicationPointSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadApplicationPointSetType> getLoadApplicationPointSet();

} // LoadApplicationPointSetsType
