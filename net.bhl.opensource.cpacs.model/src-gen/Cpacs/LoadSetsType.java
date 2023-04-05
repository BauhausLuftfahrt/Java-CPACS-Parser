/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Sets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadSetsType#getLoadSet <em>Load Set</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadSetsType()
 * @model extendedMetaData="name='loadSetsType' kind='elementOnly'"
 * @generated
 */
public interface LoadSetsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Set</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LoadSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Set</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadSetsType_LoadSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadSetType> getLoadSet();

} // LoadSetsType
