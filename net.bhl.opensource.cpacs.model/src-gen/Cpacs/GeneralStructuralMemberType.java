/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Structural Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeneralStructuralMemberType#getStandardMemberPosition <em>Standard Member Position</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberType#getStructuralMemberPosition <em>Structural Member Position</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberType()
 * @model extendedMetaData="name='generalStructuralMemberType' kind='elementOnly'"
 * @generated
 */
public interface GeneralStructuralMemberType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Standard Member Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Member Position</em>' containment reference.
	 * @see #setStandardMemberPosition(GeneralStructuralMemberPositionType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberType_StandardMemberPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardMemberPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralStructuralMemberPositionType getStandardMemberPosition();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberType#getStandardMemberPosition <em>Standard Member Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Member Position</em>' containment reference.
	 * @see #getStandardMemberPosition()
	 * @generated
	 */
	void setStandardMemberPosition(GeneralStructuralMemberPositionType value);

	/**
	 * Returns the value of the '<em><b>Structural Member Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GeneralStructuralMemberPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Member Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberType_StructuralMemberPosition()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='structuralMemberPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeneralStructuralMemberPositionType> getStructuralMemberPosition();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GeneralStructuralMemberType
