/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Load Integration Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getUIDs <em>UI Ds</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getOrientationX <em>Orientation X</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getOrientationY <em>Orientation Y</em>}</li>
 *   <li>{@link Cpacs.CutLoadIntegrationPointsType#getOrientationZ <em>Orientation Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType()
 * @model extendedMetaData="name='cutLoadIntegrationPointsType' kind='elementOnly'"
 * @generated
 */
public interface CutLoadIntegrationPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Ds</em>' containment reference.
	 * @see #setUIDs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_UIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getUIDs <em>UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI Ds</em>' containment reference.
	 * @see #getUIDs()
	 * @generated
	 */
	void setUIDs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation X</em>' containment reference.
	 * @see #setOrientationX(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_OrientationX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationX' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getOrientationX();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getOrientationX <em>Orientation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation X</em>' containment reference.
	 * @see #getOrientationX()
	 * @generated
	 */
	void setOrientationX(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Y</em>' containment reference.
	 * @see #setOrientationY(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_OrientationY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationY' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getOrientationY();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getOrientationY <em>Orientation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Y</em>' containment reference.
	 * @see #getOrientationY()
	 * @generated
	 */
	void setOrientationY(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Z</em>' containment reference.
	 * @see #setOrientationZ(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadIntegrationPointsType_OrientationZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationZ' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getOrientationZ();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadIntegrationPointsType#getOrientationZ <em>Orientation Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Z</em>' containment reference.
	 * @see #getOrientationZ()
	 * @generated
	 */
	void setOrientationZ(StringVectorBaseType value);

} // CutLoadIntegrationPointsType
