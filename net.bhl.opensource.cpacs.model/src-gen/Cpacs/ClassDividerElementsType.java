/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Divider Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ClassDividerElementsType#getClassDividerElement <em>Class Divider Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getClassDividerElementsType()
 * @model extendedMetaData="name='classDividerElementsType' kind='elementOnly'"
 * @generated
 */
public interface ClassDividerElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Class Divider Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class divider element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Divider Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getClassDividerElementsType_ClassDividerElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='classDividerElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getClassDividerElement();

} // ClassDividerElementsType
