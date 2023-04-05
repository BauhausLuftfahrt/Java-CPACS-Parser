/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Based Structural Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getSheetProperties <em>Sheet Properties</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getStructuralProfileUID <em>Structural Profile UID</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getPointProperties <em>Point Properties</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getReferencePointUID <em>Reference Point UID</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getStandardProfileType <em>Standard Profile Type</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getGlobalBeamProperties <em>Global Beam Properties</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType()
 * @model extendedMetaData="name='profileBasedStructuralElementType' kind='elementOnly'"
 * @generated
 */
public interface ProfileBasedStructuralElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the profile based structural element
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getName <em>Name</em>}' containment reference.
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
	 * Description of the profile based structural
	 *                                 element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Sheet Properties</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MaterialDefinitionForProfileBasedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Properties</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_SheetProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sheetProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MaterialDefinitionForProfileBasedType> getSheetProperties();

	/**
	 * Returns the value of the '<em><b>Structural Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the structural profile profile
	 *                                                 uID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Profile UID</em>' containment reference.
	 * @see #setStructuralProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_StructuralProfileUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getStructuralProfileUID <em>Structural Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Profile UID</em>' containment reference.
	 * @see #getStructuralProfileUID()
	 * @generated
	 */
	void setStructuralProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Properties</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MaterialDefinitionForProfileBasedPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Properties</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_PointProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MaterialDefinitionForProfileBasedPointType> getPointProperties();

	/**
	 * Returns the value of the '<em><b>Reference Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference point in structural profile
	 *                                                 definition for structural element definition
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Point UID</em>' containment reference.
	 * @see #setReferencePointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_ReferencePointUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referencePointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferencePointUID();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getReferencePointUID <em>Reference Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Point UID</em>' containment reference.
	 * @see #getReferencePointUID()
	 * @generated
	 */
	void setReferencePointUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Profile Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Profile Type, see picture below for
	 *                                             further information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Profile Type</em>' containment reference.
	 * @see #setStandardProfileType(StandardProfileTypeType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_StandardProfileType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardProfileType' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardProfileTypeType getStandardProfileType();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getStandardProfileType <em>Standard Profile Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Profile Type</em>' containment reference.
	 * @see #getStandardProfileType()
	 * @generated
	 */
	void setStandardProfileType(StandardProfileTypeType value);

	/**
	 * Returns the value of the '<em><b>Global Beam Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Beam Properties</em>' containment reference.
	 * @see #setGlobalBeamProperties(GlobalBeamPropertiesType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_GlobalBeamProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalBeamProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalBeamPropertiesType getGlobalBeamProperties();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getGlobalBeamProperties <em>Global Beam Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Beam Properties</em>' containment reference.
	 * @see #getGlobalBeamProperties()
	 * @generated
	 */
	void setGlobalBeamProperties(GlobalBeamPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Transformation2DType)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_Transformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Transformation2DType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation2DType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileBasedStructuralElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ProfileBasedStructuralElementType
