/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutOutType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getReinforcementElementUID <em>Reinforcement Element UID</em>}</li>
 *   <li>{@link Cpacs.CutOutType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutOutType()
 * @model extendedMetaData="name='cutOutType' kind='elementOnly'"
 * @generated
 */
public interface CutOutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the cut out element
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getName <em>Name</em>}' containment reference.
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
	 * Description of the cut out element
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the cut element (absolute value)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_Width()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidth();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the cut element (absolute value)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_Height()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeight();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fillet radius of the cut element (absolute
	 *                                 value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #setFilletRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_FilletRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filletRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFilletRadius();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getFilletRadius <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a structural element that reinforces
	 *                                 the cut out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinforcement Element UID</em>' containment reference.
	 * @see #setReinforcementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutType_ReinforcementElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reinforcementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReinforcementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getReinforcementElementUID <em>Reinforcement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Element UID</em>' containment reference.
	 * @see #getReinforcementElementUID()
	 * @generated
	 */
	void setReinforcementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCutOutType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CutOutType
