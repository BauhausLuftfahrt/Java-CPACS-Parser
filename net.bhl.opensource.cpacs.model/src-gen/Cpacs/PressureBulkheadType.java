/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Bulkhead Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PressureBulkheadType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getReinforcementNumberVertical <em>Reinforcement Number Vertical</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getStructuralElementVerticalUID <em>Structural Element Vertical UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getReinforcementNumberHorizontal <em>Reinforcement Number Horizontal</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getStructuralElementHorizontalUID <em>Structural Element Horizontal UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getBulkheadCalotteRadiusAtFrame <em>Bulkhead Calotte Radius At Frame</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getMaxFlectionDepth <em>Max Flection Depth</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getReinforcementNumberRadial <em>Reinforcement Number Radial</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getStructuralElementRadialUID <em>Structural Element Radial UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPressureBulkheadType()
 * @model extendedMetaData="name='pressureBulkheadType' kind='elementOnly'"
 * @generated
 */
public interface PressureBulkheadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the pressure bulkhead structural
	 *                                 element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getName <em>Name</em>}' containment reference.
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
	 * Description of the pressure bulkhead
	 *                                 structural element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural sheet element used for the
	 *                                 bulkhead
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Number Vertical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of vertical reinforcements on flat
	 *                                         bulhhead
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinforcement Number Vertical</em>' containment reference.
	 * @see #setReinforcementNumberVertical(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_ReinforcementNumberVertical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reinforcementNumberVertical' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getReinforcementNumberVertical();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getReinforcementNumberVertical <em>Reinforcement Number Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Number Vertical</em>' containment reference.
	 * @see #getReinforcementNumberVertical()
	 * @generated
	 */
	void setReinforcementNumberVertical(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element Vertical UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural elements used as vertical
	 *                                         reinforcements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element Vertical UID</em>' containment reference.
	 * @see #setStructuralElementVerticalUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_StructuralElementVerticalUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementVerticalUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementVerticalUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getStructuralElementVerticalUID <em>Structural Element Vertical UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element Vertical UID</em>' containment reference.
	 * @see #getStructuralElementVerticalUID()
	 * @generated
	 */
	void setStructuralElementVerticalUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Number Horizontal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of horizontal reinforcements on flat
	 *                                         bulhhead
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinforcement Number Horizontal</em>' containment reference.
	 * @see #setReinforcementNumberHorizontal(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_ReinforcementNumberHorizontal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reinforcementNumberHorizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getReinforcementNumberHorizontal();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getReinforcementNumberHorizontal <em>Reinforcement Number Horizontal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Number Horizontal</em>' containment reference.
	 * @see #getReinforcementNumberHorizontal()
	 * @generated
	 */
	void setReinforcementNumberHorizontal(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element Horizontal UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural elements used as
	 *                                         horizontal reinforcements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element Horizontal UID</em>' containment reference.
	 * @see #setStructuralElementHorizontalUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_StructuralElementHorizontalUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementHorizontalUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementHorizontalUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getStructuralElementHorizontalUID <em>Structural Element Horizontal UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element Horizontal UID</em>' containment reference.
	 * @see #getStructuralElementHorizontalUID()
	 * @generated
	 */
	void setStructuralElementHorizontalUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Bulkhead Calotte Radius At Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Radius of bulkhead calotte in the plane of
	 *                                         the adjacent frame
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead Calotte Radius At Frame</em>' containment reference.
	 * @see #setBulkheadCalotteRadiusAtFrame(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_BulkheadCalotteRadiusAtFrame()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bulkheadCalotteRadiusAtFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBulkheadCalotteRadiusAtFrame();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getBulkheadCalotteRadiusAtFrame <em>Bulkhead Calotte Radius At Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead Calotte Radius At Frame</em>' containment reference.
	 * @see #getBulkheadCalotteRadiusAtFrame()
	 * @generated
	 */
	void setBulkheadCalotteRadiusAtFrame(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Max Flection Depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum flection of the pressure bulkhaed
	 *                                         calotte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Flection Depth</em>' containment reference.
	 * @see #setMaxFlectionDepth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_MaxFlectionDepth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxFlectionDepth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMaxFlectionDepth();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getMaxFlectionDepth <em>Max Flection Depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Flection Depth</em>' containment reference.
	 * @see #getMaxFlectionDepth()
	 * @generated
	 */
	void setMaxFlectionDepth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Number Radial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of radial reinforcements (equally
	 *                                         distributed) on curved bulhhead
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinforcement Number Radial</em>' containment reference.
	 * @see #setReinforcementNumberRadial(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_ReinforcementNumberRadial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reinforcementNumberRadial' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getReinforcementNumberRadial();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getReinforcementNumberRadial <em>Reinforcement Number Radial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Number Radial</em>' containment reference.
	 * @see #getReinforcementNumberRadial()
	 * @generated
	 */
	void setReinforcementNumberRadial(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element Radial UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural elements used as radial
	 *                                         reinforcements on curved bulkheads
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element Radial UID</em>' containment reference.
	 * @see #setStructuralElementRadialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_StructuralElementRadialUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementRadialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementRadialUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getStructuralElementRadialUID <em>Structural Element Radial UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element Radial UID</em>' containment reference.
	 * @see #getStructuralElementRadialUID()
	 * @generated
	 */
	void setStructuralElementRadialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PressureBulkheadType
