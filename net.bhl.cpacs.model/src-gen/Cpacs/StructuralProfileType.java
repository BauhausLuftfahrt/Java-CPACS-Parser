/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralProfileType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.StructuralProfileType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.StructuralProfileType#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.StructuralProfileType#getSheetList <em>Sheet List</em>}</li>
 *   <li>{@link Cpacs.StructuralProfileType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralProfileType()
 * @model extendedMetaData="name='structuralProfileType' kind='elementOnly'"
 * @generated
 */
public interface StructuralProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the structure profile.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralProfileType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfileType#getName <em>Name</em>}' containment reference.
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
	 * Description of the structure profile.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralProfileType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfileType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Point List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of structural profile points, only x and
	 *                                 y.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point List</em>' containment reference.
	 * @see #setPointList(PointListXYType)
	 * @see Cpacs.CpacsPackage#getStructuralProfileType_PointList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointList' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYType getPointList();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfileType#getPointList <em>Point List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point List</em>' containment reference.
	 * @see #getPointList()
	 * @generated
	 */
	void setPointList(PointListXYType value);

	/**
	 * Returns the value of the '<em><b>Sheet List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet List</em>' containment reference.
	 * @see #setSheetList(SheetListType)
	 * @see Cpacs.CpacsPackage#getStructuralProfileType_SheetList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetList' namespace='##targetNamespace'"
	 * @generated
	 */
	SheetListType getSheetList();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfileType#getSheetList <em>Sheet List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet List</em>' containment reference.
	 * @see #getSheetList()
	 * @generated
	 */
	void setSheetList(SheetListType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStructuralProfileType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfileType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StructuralProfileType
