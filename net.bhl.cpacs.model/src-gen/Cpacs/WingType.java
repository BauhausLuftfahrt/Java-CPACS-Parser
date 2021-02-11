/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.WingType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.WingType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.WingType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.WingType#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.WingType#getPositionings <em>Positionings</em>}</li>
 *   <li>{@link Cpacs.WingType#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.WingType#getComponentSegments <em>Component Segments</em>}</li>
 *   <li>{@link Cpacs.WingType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}</li>
 *   <li>{@link Cpacs.WingType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.WingType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingType()
 * @model extendedMetaData="name='wingType' kind='elementOnly'"
 * @generated
 */
public interface WingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the wing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getName <em>Name</em>}' containment reference.
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
	 * Description of the wing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getDescription <em>Description</em>}' containment reference.
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
	 * UID of part to which the wing is mounted (if
	 *                                 any). The parent of the wing can e.g. be the fuselage. In each
	 *                                 aircraft model, there is exactly one part without a parent part
	 *                                 (The root of the connection hierarchy).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getParentUID <em>Parent UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getTransformation <em>Transformation</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingType_Sections()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSectionsType getSections();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(WingSectionsType value);

	/**
	 * Returns the value of the '<em><b>Positionings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionings</em>' containment reference.
	 * @see #setPositionings(PositioningsType)
	 * @see Cpacs.CpacsPackage#getWingType_Positionings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionings' namespace='##targetNamespace'"
	 * @generated
	 */
	PositioningsType getPositionings();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getPositionings <em>Positionings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positionings</em>' containment reference.
	 * @see #getPositionings()
	 * @generated
	 */
	void setPositionings(PositioningsType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(WingSegmentsType)
	 * @see Cpacs.CpacsPackage#getWingType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(WingSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Component Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Segments</em>' containment reference.
	 * @see #setComponentSegments(ComponentSegmentsType)
	 * @see Cpacs.CpacsPackage#getWingType_ComponentSegments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSegmentsType getComponentSegments();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getComponentSegments <em>Component Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Segments</em>' containment reference.
	 * @see #getComponentSegments()
	 * @generated
	 */
	void setComponentSegments(ComponentSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Aircraft Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #setDynamicAircraftModel(DynamicAircraftModelType)
	 * @see Cpacs.CpacsPackage#getWingType_DynamicAircraftModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicAircraftModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicAircraftModelType getDynamicAircraftModel();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #getDynamicAircraftModel()
	 * @generated
	 */
	void setDynamicAircraftModel(DynamicAircraftModelType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType5
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType5)
	 * @see Cpacs.CpacsPackage#getWingType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType5 getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType5
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType5 value);

	/**
	 * Unsets the value of the '{@link Cpacs.WingType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType5)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.WingType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType5)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingType
