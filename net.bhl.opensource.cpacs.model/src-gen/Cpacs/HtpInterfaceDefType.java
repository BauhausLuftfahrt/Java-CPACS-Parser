/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Htp Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpFrame1UID <em>Htp Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpFrame2UID <em>Htp Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpAlphaUp <em>Htp Alpha Up</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpAlphaDown <em>Htp Alpha Down</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpReinfAngle <em>Htp Reinf Angle</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceX <em>Htp Area Tolerance X</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceY <em>Htp Area Tolerance Y</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceZ <em>Htp Area Tolerance Z</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpStructuralElementDefinitions <em>Htp Structural Element Definitions</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getHtpForwardInterfaceDefinitions <em>Htp Forward Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.HtpInterfaceDefType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType()
 * @model extendedMetaData="name='htpInterfaceDefType' kind='elementOnly'"
 * @generated
 */
public interface HtpInterfaceDefType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Htp Frame1 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the fuselage frame at the forward HTP
	 *                                 attchment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Frame1 UID</em>' containment reference.
	 * @see #setHtpFrame1UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpFrame1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFrame1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFrame1UID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpFrame1UID <em>Htp Frame1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Frame1 UID</em>' containment reference.
	 * @see #getHtpFrame1UID()
	 * @generated
	 */
	void setHtpFrame1UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Frame2 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the fuselage frame at the backward HTP
	 *                                 attchment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Frame2 UID</em>' containment reference.
	 * @see #setHtpFrame2UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpFrame2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFrame2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFrame2UID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpFrame2UID <em>Htp Frame2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Frame2 UID</em>' containment reference.
	 * @see #getHtpFrame2UID()
	 * @generated
	 */
	void setHtpFrame2UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Alpha Up</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum HTP deflection (nose up in
	 *                                 degrees)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Alpha Up</em>' containment reference.
	 * @see #setHtpAlphaUp(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpAlphaUp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpAlphaUp' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpAlphaUp();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpAlphaUp <em>Htp Alpha Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Alpha Up</em>' containment reference.
	 * @see #getHtpAlphaUp()
	 * @generated
	 */
	void setHtpAlphaUp(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Alpha Down</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum HTP deflection (nose down in
	 *                                 degrees)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Alpha Down</em>' containment reference.
	 * @see #setHtpAlphaDown(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpAlphaDown()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpAlphaDown' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpAlphaDown();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpAlphaDown <em>Htp Alpha Down</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Alpha Down</em>' containment reference.
	 * @see #getHtpAlphaDown()
	 * @generated
	 */
	void setHtpAlphaDown(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Reinf Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * angle of the reinforcements at backward HTP
	 *                                 attchment
	 *                                 (in degrees)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Reinf Angle</em>' containment reference.
	 * @see #setHtpReinfAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpReinfAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpReinfAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpReinfAngle();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpReinfAngle <em>Htp Reinf Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Reinf Angle</em>' containment reference.
	 * @see #getHtpReinfAngle()
	 * @generated
	 */
	void setHtpReinfAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Area Tolerance X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines area (absolute) in x-direction around
	 *                                 htpFrame2UID where the HTP attachmentpoint has correct position
	 *                                 ==> check and potentially warning message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Area Tolerance X</em>' containment reference.
	 * @see #setHtpAreaToleranceX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpAreaToleranceX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='htpAreaToleranceX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpAreaToleranceX();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceX <em>Htp Area Tolerance X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Area Tolerance X</em>' containment reference.
	 * @see #getHtpAreaToleranceX()
	 * @generated
	 */
	void setHtpAreaToleranceX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Area Tolerance Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines area (absolute) in y-direction around
	 *                                 the
	 *                                 outer edge of htpFrame2UID where the HTP attachmentpoint has correct
	 *                                 y-position ==> check and potentially warning
	 *                                 message
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Area Tolerance Y</em>' containment reference.
	 * @see #setHtpAreaToleranceY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpAreaToleranceY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='htpAreaToleranceY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpAreaToleranceY();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceY <em>Htp Area Tolerance Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Area Tolerance Y</em>' containment reference.
	 * @see #getHtpAreaToleranceY()
	 * @generated
	 */
	void setHtpAreaToleranceY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Area Tolerance Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines allowed z-position for rear HTP
	 *                                 attachment
	 *                                 relativ to total frame height ==> check and potentially warning
	 *                                 message ==> check and potentially warning
	 *                                 message
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Area Tolerance Z</em>' containment reference.
	 * @see #setHtpAreaToleranceZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpAreaToleranceZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='htpAreaToleranceZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpAreaToleranceZ();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpAreaToleranceZ <em>Htp Area Tolerance Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Area Tolerance Z</em>' containment reference.
	 * @see #getHtpAreaToleranceZ()
	 * @generated
	 */
	void setHtpAreaToleranceZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Structural Element Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of HTP structural
	 *                                 elements
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Structural Element Definitions</em>' containment reference.
	 * @see #setHtpStructuralElementDefinitions(HtpStructElemDefType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpStructuralElementDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpStructuralElementDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	HtpStructElemDefType getHtpStructuralElementDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpStructuralElementDefinitions <em>Htp Structural Element Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Structural Element Definitions</em>' containment reference.
	 * @see #getHtpStructuralElementDefinitions()
	 * @generated
	 */
	void setHtpStructuralElementDefinitions(HtpStructElemDefType value);

	/**
	 * Returns the value of the '<em><b>Htp Forward Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of HTP forward attachment to
	 *                                 structure
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Forward Interface Definitions</em>' containment reference.
	 * @see #setHtpForwardInterfaceDefinitions(HtpFwdInterfaceDefType)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_HtpForwardInterfaceDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpForwardInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	HtpFwdInterfaceDefType getHtpForwardInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getHtpForwardInterfaceDefinitions <em>Htp Forward Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Forward Interface Definitions</em>' containment reference.
	 * @see #getHtpForwardInterfaceDefinitions()
	 * @generated
	 */
	void setHtpForwardInterfaceDefinitions(HtpFwdInterfaceDefType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getHtpInterfaceDefType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpInterfaceDefType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // HtpInterfaceDefType
