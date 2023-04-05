/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Strut Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackStrutType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrackStrutType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.TrackStrutType#getProfileUID <em>Profile UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackStrutType()
 * @model extendedMetaData="name='trackStrutType' kind='elementOnly'"
 * @generated
 */
public interface TrackStrutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType1)
	 * @see Cpacs.CpacsPackage#getTrackStrutType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType1 getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStrutType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType1 value);

	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrackStrutType_MaterialUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStrutType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile UID</em>' containment reference.
	 * @see #setProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrackStrutType_ProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStrutType#getProfileUID <em>Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile UID</em>' containment reference.
	 * @see #getProfileUID()
	 * @generated
	 */
	void setProfileUID(StringUIDBaseType value);

} // TrackStrutType
