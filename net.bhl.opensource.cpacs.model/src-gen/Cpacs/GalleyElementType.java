/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galley Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GalleyElementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.GalleyElementType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.GalleyElementType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.GalleyElementType#getNumberOfTrolleys <em>Number Of Trolleys</em>}</li>
 *   <li>{@link Cpacs.GalleyElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGalleyElementType()
 * @model extendedMetaData="name='galleyElementType' kind='elementOnly'"
 * @generated
 */
public interface GalleyElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGalleyElementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.GalleyElementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(DeckElementGeometryType)
	 * @see Cpacs.CpacsPackage#getGalleyElementType_Geometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckElementGeometryType getGeometry();

	/**
	 * Sets the value of the '{@link Cpacs.GalleyElementType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(DeckElementGeometryType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DeckElementMassType)
	 * @see Cpacs.CpacsPackage#getGalleyElementType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckElementMassType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.GalleyElementType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(DeckElementMassType value);

	/**
	 * Returns the value of the '<em><b>Number Of Trolleys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of trolleys
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Trolleys</em>' containment reference.
	 * @see #setNumberOfTrolleys(PosExcl0IntBaseType)
	 * @see Cpacs.CpacsPackage#getGalleyElementType_NumberOfTrolleys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfTrolleys' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0IntBaseType getNumberOfTrolleys();

	/**
	 * Sets the value of the '{@link Cpacs.GalleyElementType#getNumberOfTrolleys <em>Number Of Trolleys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Trolleys</em>' containment reference.
	 * @see #getNumberOfTrolleys()
	 * @generated
	 */
	void setNumberOfTrolleys(PosExcl0IntBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGalleyElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GalleyElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GalleyElementType
