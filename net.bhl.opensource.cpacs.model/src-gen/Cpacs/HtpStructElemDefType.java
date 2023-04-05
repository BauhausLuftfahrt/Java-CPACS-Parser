/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Htp Struct Elem Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpCrossbeamsFrontStructElemUID <em>Htp Crossbeams Front Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpCrossbeamsRearStructElemUID <em>Htp Crossbeams Rear Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpDiagonalBeamsStructElemUID <em>Htp Diagonal Beams Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpSideBeamsStructElemUID <em>Htp Side Beams Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpCutoutReinfUpperStructElemUID <em>Htp Cutout Reinf Upper Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getHtpCutoutReinfLowerStructElemUID <em>Htp Cutout Reinf Lower Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpStructElemDefType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHtpStructElemDefType()
 * @model extendedMetaData="name='htpStructElemDefType' kind='elementOnly'"
 * @generated
 */
public interface HtpStructElemDefType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Htp Crossbeams Front Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for HTP front
	 *                                 crossbeams
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Crossbeams Front Struct Elem UID</em>' containment reference.
	 * @see #setHtpCrossbeamsFrontStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpCrossbeamsFrontStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpCrossbeamsFrontStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpCrossbeamsFrontStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpCrossbeamsFrontStructElemUID <em>Htp Crossbeams Front Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Crossbeams Front Struct Elem UID</em>' containment reference.
	 * @see #getHtpCrossbeamsFrontStructElemUID()
	 * @generated
	 */
	void setHtpCrossbeamsFrontStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Crossbeams Rear Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for HTP rear
	 *                                 crossbeams
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Crossbeams Rear Struct Elem UID</em>' containment reference.
	 * @see #setHtpCrossbeamsRearStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpCrossbeamsRearStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpCrossbeamsRearStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpCrossbeamsRearStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpCrossbeamsRearStructElemUID <em>Htp Crossbeams Rear Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Crossbeams Rear Struct Elem UID</em>' containment reference.
	 * @see #getHtpCrossbeamsRearStructElemUID()
	 * @generated
	 */
	void setHtpCrossbeamsRearStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Diagonal Beams Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for HTP diagonal
	 *                                 beams
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Diagonal Beams Struct Elem UID</em>' containment reference.
	 * @see #setHtpDiagonalBeamsStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpDiagonalBeamsStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpDiagonalBeamsStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpDiagonalBeamsStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpDiagonalBeamsStructElemUID <em>Htp Diagonal Beams Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Diagonal Beams Struct Elem UID</em>' containment reference.
	 * @see #getHtpDiagonalBeamsStructElemUID()
	 * @generated
	 */
	void setHtpDiagonalBeamsStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Side Beams Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for HTP side beams
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Side Beams Struct Elem UID</em>' containment reference.
	 * @see #setHtpSideBeamsStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpSideBeamsStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpSideBeamsStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpSideBeamsStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpSideBeamsStructElemUID <em>Htp Side Beams Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Side Beams Struct Elem UID</em>' containment reference.
	 * @see #getHtpSideBeamsStructElemUID()
	 * @generated
	 */
	void setHtpSideBeamsStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Cutout Reinf Upper Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for upper HTP cutout
	 *                                 reinforcement beams, also used for lower cutout reinforcement,
	 *                                 when not explicitly defined
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Cutout Reinf Upper Struct Elem UID</em>' containment reference.
	 * @see #setHtpCutoutReinfUpperStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpCutoutReinfUpperStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpCutoutReinfUpperStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpCutoutReinfUpperStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpCutoutReinfUpperStructElemUID <em>Htp Cutout Reinf Upper Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Cutout Reinf Upper Struct Elem UID</em>' containment reference.
	 * @see #getHtpCutoutReinfUpperStructElemUID()
	 * @generated
	 */
	void setHtpCutoutReinfUpperStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Cutout Reinf Lower Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element for lower HTP cutout
	 *                                 reinforcement beams (optional)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Cutout Reinf Lower Struct Elem UID</em>' containment reference.
	 * @see #setHtpCutoutReinfLowerStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_HtpCutoutReinfLowerStructElemUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='htpCutoutReinfLowerStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpCutoutReinfLowerStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getHtpCutoutReinfLowerStructElemUID <em>Htp Cutout Reinf Lower Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Cutout Reinf Lower Struct Elem UID</em>' containment reference.
	 * @see #getHtpCutoutReinfLowerStructElemUID()
	 * @generated
	 */
	void setHtpCutoutReinfLowerStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getHtpStructElemDefType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpStructElemDefType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // HtpStructElemDefType
