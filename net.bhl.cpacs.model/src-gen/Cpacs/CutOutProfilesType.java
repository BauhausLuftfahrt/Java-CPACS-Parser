/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Out Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutOutProfilesType#getOuterCutOutProfile <em>Outer Cut Out Profile</em>}</li>
 *   <li>{@link Cpacs.CutOutProfilesType#getInnerCutOutProfile <em>Inner Cut Out Profile</em>}</li>
 *   <li>{@link Cpacs.CutOutProfilesType#getCutOutProfile <em>Cut Out Profile</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutOutProfilesType()
 * @model extendedMetaData="name='cutOutProfilesType' kind='elementOnly'"
 * @generated
 */
public interface CutOutProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Outer Cut Out Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Cut Out Profile</em>' containment reference.
	 * @see #setOuterCutOutProfile(OuterCutOutProfileType)
	 * @see Cpacs.CpacsPackage#getCutOutProfilesType_OuterCutOutProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerCutOutProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterCutOutProfileType getOuterCutOutProfile();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutProfilesType#getOuterCutOutProfile <em>Outer Cut Out Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Cut Out Profile</em>' containment reference.
	 * @see #getOuterCutOutProfile()
	 * @generated
	 */
	void setOuterCutOutProfile(OuterCutOutProfileType value);

	/**
	 * Returns the value of the '<em><b>Inner Cut Out Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Cut Out Profile</em>' containment reference.
	 * @see #setInnerCutOutProfile(OuterCutOutProfileType)
	 * @see Cpacs.CpacsPackage#getCutOutProfilesType_InnerCutOutProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerCutOutProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterCutOutProfileType getInnerCutOutProfile();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutProfilesType#getInnerCutOutProfile <em>Inner Cut Out Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Cut Out Profile</em>' containment reference.
	 * @see #getInnerCutOutProfile()
	 * @generated
	 */
	void setInnerCutOutProfile(OuterCutOutProfileType value);

	/**
	 * Returns the value of the '<em><b>Cut Out Profile</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CutOutProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Out Profile</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCutOutProfilesType_CutOutProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutOutProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CutOutProfileType> getCutOutProfile();

} // CutOutProfilesType
