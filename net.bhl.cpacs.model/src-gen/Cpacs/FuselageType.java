/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getPositionings <em>Positionings</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getDecks <em>Decks</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getFuelTanks <em>Fuel Tanks</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getCutOuts <em>Cut Outs</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.FuselageType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageType()
 * @model extendedMetaData="name='fuselageType' kind='elementOnly'"
 * @generated
 */
public interface FuselageType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name of fuselage
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getName <em>Name</em>}' containment reference.
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
	 * 
	 *                                 Description of fuselage
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getDescription <em>Description</em>}' containment reference.
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
	 * 
	 *                                 UID of part to which the fuselage is
	 *                                 mounted (if any)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getParentUID <em>Parent UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getTransformation <em>Transformation</em>}' containment reference.
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
	 * @see #setSections(FuselageSectionsType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Sections()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageSectionsType getSections();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(FuselageSectionsType value);

	/**
	 * Returns the value of the '<em><b>Positionings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionings</em>' containment reference.
	 * @see #setPositionings(PositioningsType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Positionings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionings' namespace='##targetNamespace'"
	 * @generated
	 */
	PositioningsType getPositionings();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getPositionings <em>Positionings</em>}' containment reference.
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
	 * @see #setSegments(FuselageSegmentsType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(FuselageSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(FuselageStructureType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageStructureType getStructure();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(FuselageStructureType value);

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference.
	 * @see #setCompartments(CompartmentsType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Compartments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compartments' namespace='##targetNamespace'"
	 * @generated
	 */
	CompartmentsType getCompartments();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getCompartments <em>Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartments</em>' containment reference.
	 * @see #getCompartments()
	 * @generated
	 */
	void setCompartments(CompartmentsType value);

	/**
	 * Returns the value of the '<em><b>Decks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decks</em>' containment reference.
	 * @see #setDecks(DecksType)
	 * @see Cpacs.CpacsPackage#getFuselageType_Decks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decks' namespace='##targetNamespace'"
	 * @generated
	 */
	DecksType getDecks();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getDecks <em>Decks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decks</em>' containment reference.
	 * @see #getDecks()
	 * @generated
	 */
	void setDecks(DecksType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Aircraft Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #setDynamicAircraftModel(DynamicAircraftModelType)
	 * @see Cpacs.CpacsPackage#getFuselageType_DynamicAircraftModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicAircraftModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicAircraftModelType getDynamicAircraftModel();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #getDynamicAircraftModel()
	 * @generated
	 */
	void setDynamicAircraftModel(DynamicAircraftModelType value);

	/**
	 * Returns the value of the '<em><b>Fuel Tanks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Tanks</em>' containment reference.
	 * @see #setFuelTanks(FuselageFuelTanksType)
	 * @see Cpacs.CpacsPackage#getFuselageType_FuelTanks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelTanks' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageFuelTanksType getFuelTanks();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getFuelTanks <em>Fuel Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Tanks</em>' containment reference.
	 * @see #getFuelTanks()
	 * @generated
	 */
	void setFuelTanks(FuselageFuelTanksType value);

	/**
	 * Returns the value of the '<em><b>Cut Outs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Outs</em>' containment reference.
	 * @see #setCutOuts(FuselageCutOutsType)
	 * @see Cpacs.CpacsPackage#getFuselageType_CutOuts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutOuts' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageCutOutsType getCutOuts();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getCutOuts <em>Cut Outs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Outs</em>' containment reference.
	 * @see #getCutOuts()
	 * @generated
	 */
	void setCutOuts(FuselageCutOutsType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryType12}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType12
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType12)
	 * @see Cpacs.CpacsPackage#getFuselageType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType12 getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType12
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType12 value);

	/**
	 * Unsets the value of the '{@link Cpacs.FuselageType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType12)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.FuselageType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType12)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFuselageType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FuselageType
