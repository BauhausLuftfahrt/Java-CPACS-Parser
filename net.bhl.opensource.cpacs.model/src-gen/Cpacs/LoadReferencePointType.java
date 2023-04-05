/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reference Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadReferencePointType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getXsi <em>Xsi</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link Cpacs.LoadReferencePointType#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadReferencePointType()
 * @model extendedMetaData="name='loadReferencePointType' kind='elementOnly'"
 * @generated
 */
public interface LoadReferencePointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_X()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_Y()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_Z()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position. Eta refers to the segment or componentSegment depending on the referenced uID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_Eta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position. Xsi refers to the segment or componentSegment depending on the referenced uID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_Xsi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getXsi <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi</em>' containment reference.
	 * @see #getXsi()
	 * @generated
	 */
	void setXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rel Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height position.
	 *                                 relHeight is relative to the local airfoil thickness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height</em>' containment reference.
	 * @see #setRelHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_RelHeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeight();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getRelHeight <em>Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height</em>' containment reference.
	 * @see #getRelHeight()
	 * @generated
	 */
	void setRelHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference uID determines the reference coordinate system.
	 *                             If it points to a segment, then the eta-xsi values are considered to be in segment
	 *                             eta-xsi coordinates; if it points to a componentSegment,
	 *                             then componentSegment eta-xsi coordinates are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference UID</em>' containment reference.
	 * @see #setReferenceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferencePointType_ReferenceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferencePointType#getReferenceUID <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference UID</em>' containment reference.
	 * @see #getReferenceUID()
	 * @generated
	 */
	void setReferenceUID(StringUIDBaseType value);

} // LoadReferencePointType
