/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outer Cut Out Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OuterCutOutProfileType#getProfileUID <em>Profile UID</em>}</li>
 *   <li>{@link Cpacs.OuterCutOutProfileType#getRotZ <em>Rot Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOuterCutOutProfileType()
 * @model extendedMetaData="name='outerCutOutProfileType' kind='elementOnly'"
 * @generated
 */
public interface OuterCutOutProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile UID</em>' containment reference.
	 * @see #setProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getOuterCutOutProfileType_ProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.OuterCutOutProfileType#getProfileUID <em>Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile UID</em>' containment reference.
	 * @see #getProfileUID()
	 * @generated
	 */
	void setProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rot Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rot Z</em>' containment reference.
	 * @see #setRotZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOuterCutOutProfileType_RotZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotZ();

	/**
	 * Sets the value of the '{@link Cpacs.OuterCutOutProfileType#getRotZ <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot Z</em>' containment reference.
	 * @see #getRotZ()
	 * @generated
	 */
	void setRotZ(DoubleBaseType value);

} // OuterCutOutProfileType
