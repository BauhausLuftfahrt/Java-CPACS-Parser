/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparSegmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.SparSegmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.SparSegmentType#getSparPositionUIDs <em>Spar Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.SparSegmentType#getSparCrossSection <em>Spar Cross Section</em>}</li>
 *   <li>{@link Cpacs.SparSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparSegmentType()
 * @model extendedMetaData="name='sparSegmentType' kind='elementOnly'"
 * @generated
 */
public interface SparSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the spar segment (=spar).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSparSegmentType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.SparSegmentType#getName <em>Name</em>}' containment reference.
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
	 * Description of the spar segment (spar).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSparSegmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.SparSegmentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Spar Position UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Position UI Ds</em>' containment reference.
	 * @see #setSparPositionUIDs(SparPositionUIDsType)
	 * @see Cpacs.CpacsPackage#getSparSegmentType_SparPositionUIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparPositionUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	SparPositionUIDsType getSparPositionUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.SparSegmentType#getSparPositionUIDs <em>Spar Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Position UI Ds</em>' containment reference.
	 * @see #getSparPositionUIDs()
	 * @generated
	 */
	void setSparPositionUIDs(SparPositionUIDsType value);

	/**
	 * Returns the value of the '<em><b>Spar Cross Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Cross Section</em>' containment reference.
	 * @see #setSparCrossSection(SparCrossSectionType)
	 * @see Cpacs.CpacsPackage#getSparSegmentType_SparCrossSection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparCrossSection' namespace='##targetNamespace'"
	 * @generated
	 */
	SparCrossSectionType getSparCrossSection();

	/**
	 * Sets the value of the '{@link Cpacs.SparSegmentType#getSparCrossSection <em>Spar Cross Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Cross Section</em>' containment reference.
	 * @see #getSparCrossSection()
	 * @generated
	 */
	void setSparCrossSection(SparCrossSectionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSparSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SparSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SparSegmentType
