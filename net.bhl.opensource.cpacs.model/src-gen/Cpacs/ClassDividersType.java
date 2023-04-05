/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Dividers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ClassDividersType#getClassDivider <em>Class Divider</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getClassDividersType()
 * @model extendedMetaData="name='classDividersType' kind='elementOnly'"
 * @generated
 */
public interface ClassDividersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Class Divider</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponent2DBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class divider
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Divider</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getClassDividersType_ClassDivider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='classDivider' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponent2DBaseType> getClassDivider();

} // ClassDividersType
