/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Guide Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getStartSectionUID <em>Start Section UID</em>}</li>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getFromZeta <em>From Zeta</em>}</li>
 *   <li>{@link Cpacs.NacelleGuideCurveType#getToZeta <em>To Zeta</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType()
 * @model extendedMetaData="name='nacelleGuideCurveType' kind='elementOnly'"
 * @generated
 */
public interface NacelleGuideCurveType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Guide Curve Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of the guide curve profile
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guide Curve Profile UID</em>' containment reference.
	 * @see #setGuideCurveProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_GuideCurveProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='guideCurveProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getGuideCurveProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Curve Profile UID</em>' containment reference.
	 * @see #getGuideCurveProfileUID()
	 * @generated
	 */
	void setGuideCurveProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Section UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of the start section
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Section UID</em>' containment reference.
	 * @see #setStartSectionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_StartSectionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startSectionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartSectionUID();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getStartSectionUID <em>Start Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Section UID</em>' containment reference.
	 * @see #getStartSectionUID()
	 * @generated
	 */
	void setStartSectionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>From Zeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Curve coordinate of the referenced section profile at which the guide curve shall start.
	 *                                 Valid values are in the interval -1,..,1.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Zeta</em>' containment reference.
	 * @see #setFromZeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_FromZeta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromZeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFromZeta();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getFromZeta <em>From Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Zeta</em>' containment reference.
	 * @see #getFromZeta()
	 * @generated
	 */
	void setFromZeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>To Zeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Curve coordinate of the profile following the referenced section profile.
	 *                                 It defines where the guide curve ends.
	 *                                 Valid values are in the interval -1,..,1.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Zeta</em>' containment reference.
	 * @see #setToZeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurveType_ToZeta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toZeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getToZeta();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleGuideCurveType#getToZeta <em>To Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Zeta</em>' containment reference.
	 * @see #getToZeta()
	 * @generated
	 */
	void setToZeta(DoubleBaseType value);

} // NacelleGuideCurveType
