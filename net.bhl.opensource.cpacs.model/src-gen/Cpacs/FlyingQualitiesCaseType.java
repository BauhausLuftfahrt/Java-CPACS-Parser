/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flying Qualities Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getClass_ <em>Class</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getCategory <em>Category</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getLongitudinal <em>Longitudinal</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getLateral <em>Lateral</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getCharParameters <em>Char Parameters</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getRatings <em>Ratings</em>}</li>
 *   <li>{@link Cpacs.FlyingQualitiesCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType()
 * @model extendedMetaData="name='flyingQualitiesCaseType' kind='elementOnly'"
 * @generated
 */
public interface FlyingQualitiesCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getName <em>Name</em>}' containment reference.
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
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aircraft Class; Class 1 small light aircraft;
	 *                                 Class 2 medium weight aircraft, low to medium maneuverability;
	 *                                 Class 3 large, heavy aircraft, low to medium maneuverability;
	 *                                 Class 4 high maneuverability aircraft
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Class()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getClass_();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flight Phase Category; Category A Non-terminal
	 *                                 flight phases requiring maneuvering, precision tracking, or
	 *                                 precise flight-path control (e.g. air-to-air combat, terrain
	 *                                 following). Category B Non-terminal Flight Phases with gradual
	 *                                 maneuvers and without precision tracking, although accurate
	 *                                 flight-path control may be required (e.g. climb, cruise).
	 *                                 Category C Terminal Flight Phases are normally accomplished
	 *                                 using gradual maneuvers and usually require accurate flight-path
	 *                                 control (takeoff, approach and landing).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCategory();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Longitudinal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing longitudinal transfer
	 *                                 functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitudinal</em>' containment reference.
	 * @see #setLongitudinal(FqLongitudinalType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Longitudinal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longitudinal' namespace='##targetNamespace'"
	 * @generated
	 */
	FqLongitudinalType getLongitudinal();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getLongitudinal <em>Longitudinal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal</em>' containment reference.
	 * @see #getLongitudinal()
	 * @generated
	 */
	void setLongitudinal(FqLongitudinalType value);

	/**
	 * Returns the value of the '<em><b>Lateral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing lateral directional
	 *                                 transfer functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lateral</em>' containment reference.
	 * @see #setLateral(FqLateralType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Lateral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lateral' namespace='##targetNamespace'"
	 * @generated
	 */
	FqLateralType getLateral();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getLateral <em>Lateral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lateral</em>' containment reference.
	 * @see #getLateral()
	 * @generated
	 */
	void setLateral(FqLateralType value);

	/**
	 * Returns the value of the '<em><b>Char Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of the handling qualities criteria
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Parameters</em>' containment reference.
	 * @see #setCharParameters(FqCharParametersType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_CharParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='charParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	FqCharParametersType getCharParameters();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getCharParameters <em>Char Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Parameters</em>' containment reference.
	 * @see #getCharParameters()
	 * @generated
	 */
	void setCharParameters(FqCharParametersType value);

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing handling qualities
	 *                                 ratings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratings</em>' containment reference.
	 * @see #setRatings(FqRatingsType)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_Ratings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratings' namespace='##targetNamespace'"
	 * @generated
	 */
	FqRatingsType getRatings();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getRatings <em>Ratings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratings</em>' containment reference.
	 * @see #getRatings()
	 * @generated
	 */
	void setRatings(FqRatingsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlyingQualitiesCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlyingQualitiesCaseType
