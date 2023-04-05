/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Pylon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginePylonType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getPositionings <em>Positionings</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getLoadCarryingStructure <em>Load Carrying Structure</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.EnginePylonType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginePylonType()
 * @model extendedMetaData="name='enginePylonType' kind='elementOnly'"
 * @generated
 */
public interface EnginePylonType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the engine pylon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getName <em>Name</em>}' containment reference.
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
	 * Description of the engine pylon.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the parent (normally wing or fuselage).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference.
	 * @see #setSections(WingSectionsType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Sections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSectionsType getSections();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(WingSectionsType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(WingSegmentsType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Segments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(WingSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Positionings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionings</em>' containment reference.
	 * @see #setPositionings(PositioningsType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Positionings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionings' namespace='##targetNamespace'"
	 * @generated
	 */
	PositioningsType getPositionings();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getPositionings <em>Positionings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positionings</em>' containment reference.
	 * @see #getPositionings()
	 * @generated
	 */
	void setPositionings(PositioningsType value);

	/**
	 * Returns the value of the '<em><b>Load Carrying Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Carrying Structure</em>' containment reference.
	 * @see #setLoadCarryingStructure(PylonStructureType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_LoadCarryingStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadCarryingStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonStructureType getLoadCarryingStructure();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getLoadCarryingStructure <em>Load Carrying Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Carrying Structure</em>' containment reference.
	 * @see #getLoadCarryingStructure()
	 * @generated
	 */
	void setLoadCarryingStructure(PylonStructureType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryXyXzYzType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryXyXzYzType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryXyXzYzType getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryXyXzYzType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryXyXzYzType value);

	/**
	 * Unsets the value of the '{@link Cpacs.EnginePylonType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.EnginePylonType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the engine pylon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getEnginePylonType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePylonType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // EnginePylonType
