/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Layer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type defines single composite layers by
 *                 giving a ply thickness, ply reference angle and a materialUID.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CompositeLayerType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CompositeLayerType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CompositeLayerType#getThickness <em>Thickness</em>}</li>
 *   <li>{@link Cpacs.CompositeLayerType#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.CompositeLayerType#getMaterialUID <em>Material UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCompositeLayerType()
 * @model extendedMetaData="name='compositeLayerType' kind='elementOnly'"
 * @generated
 */
public interface CompositeLayerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCompositeLayerType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CompositeLayerType#getName <em>Name</em>}' containment reference.
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
	 * Description of layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCompositeLayerType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CompositeLayerType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thickness of layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness</em>' containment reference.
	 * @see #setThickness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCompositeLayerType_Thickness()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThickness();

	/**
	 * Sets the value of the '{@link Cpacs.CompositeLayerType#getThickness <em>Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' containment reference.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Phi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of layer in degree
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi</em>' containment reference.
	 * @see #setPhi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCompositeLayerType_Phi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhi();

	/**
	 * Sets the value of the '{@link Cpacs.CompositeLayerType#getPhi <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' containment reference.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material UID of the layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCompositeLayerType_MaterialUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.CompositeLayerType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

} // CompositeLayerType
