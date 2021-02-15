/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geogen Wing Output Options Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getDestinationWingUID <em>Destination Wing UID</em>}</li>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getSectionDistributionMode <em>Section Distribution Mode</em>}</li>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getNumberOfSections <em>Number Of Sections</em>}</li>
 *   <li>{@link Cpacs.GeogenWingOutputOptionsType#getNumberOfPointsPerSection <em>Number Of Points Per Section</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType()
 * @model extendedMetaData="name='geogenWingOutputOptionsType' kind='elementOnly'"
 * @generated
 */
public interface GeogenWingOutputOptionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Destination Wing UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destination UID of the wing which will be
	 *                                 written into the CPACS file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Wing UID</em>' containment reference.
	 * @see #setDestinationWingUID(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_DestinationWingUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='destinationWingUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDestinationWingUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getDestinationWingUID <em>Destination Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Wing UID</em>' containment reference.
	 * @see #getDestinationWingUID()
	 * @generated
	 */
	void setDestinationWingUID(StringBaseType value);

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
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there exists a mirrored counterpart of the
	 *                                 wing: specify the symmetry plane here
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symmetry</em>' containment reference.
	 * @see #setSymmetry(SymmetryType3)
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_Symmetry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType3 getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getSymmetry <em>Symmetry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' containment reference.
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType3 value);

	/**
	 * Returns the value of the '<em><b>Section Distribution Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Section distribution mode. If not specified,
	 *                                 the value specified in the global output options is used.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Distribution Mode</em>' containment reference.
	 * @see #setSectionDistributionMode(SectionDistributionModeType)
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_SectionDistributionMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sectionDistributionMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SectionDistributionModeType getSectionDistributionMode();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getSectionDistributionMode <em>Section Distribution Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Distribution Mode</em>' containment reference.
	 * @see #getSectionDistributionMode()
	 * @generated
	 */
	void setSectionDistributionMode(SectionDistributionModeType value);

	/**
	 * Returns the value of the '<em><b>Number Of Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of sections. If not specified, the
	 *                                 value specified in the global output options is used.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Sections</em>' containment reference.
	 * @see #setNumberOfSections(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_NumberOfSections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfSections' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfSections();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getNumberOfSections <em>Number Of Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Sections</em>' containment reference.
	 * @see #getNumberOfSections()
	 * @generated
	 */
	void setNumberOfSections(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Points Per Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of points per section. If not
	 *                                 specified, the value specified in the global output options is
	 *                                 used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Points Per Section</em>' containment reference.
	 * @see #setNumberOfPointsPerSection(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getGeogenWingOutputOptionsType_NumberOfPointsPerSection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfPointsPerSection' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfPointsPerSection();

	/**
	 * Sets the value of the '{@link Cpacs.GeogenWingOutputOptionsType#getNumberOfPointsPerSection <em>Number Of Points Per Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Points Per Section</em>' containment reference.
	 * @see #getNumberOfPointsPerSection()
	 * @generated
	 */
	void setNumberOfPointsPerSection(IntegerBaseType value);

} // GeogenWingOutputOptionsType
