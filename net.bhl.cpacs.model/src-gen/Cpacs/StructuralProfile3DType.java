/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Profile3 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralProfile3DType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.StructuralProfile3DType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.StructuralProfile3DType#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.StructuralProfile3DType#getSheetList3D <em>Sheet List3 D</em>}</li>
 *   <li>{@link Cpacs.StructuralProfile3DType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralProfile3DType()
 * @model extendedMetaData="name='structuralProfile3DType' kind='elementOnly'"
 * @generated
 */
public interface StructuralProfile3DType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralProfile3DType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfile3DType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralProfile3DType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfile3DType#getDescription <em>Description</em>}' containment reference.
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
	 * @return the value of the '<em>Point List</em>' containment reference.
	 * @see #setPointList(PointListType)
	 * @see Cpacs.CpacsPackage#getStructuralProfile3DType_PointList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointList' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListType getPointList();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfile3DType#getPointList <em>Point List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point List</em>' containment reference.
	 * @see #getPointList()
	 * @generated
	 */
	void setPointList(PointListType value);

	/**
	 * Returns the value of the '<em><b>Sheet List3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet List3 D</em>' containment reference.
	 * @see #setSheetList3D(SheetList3DType)
	 * @see Cpacs.CpacsPackage#getStructuralProfile3DType_SheetList3D()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetList3D' namespace='##targetNamespace'"
	 * @generated
	 */
	SheetList3DType getSheetList3D();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfile3DType#getSheetList3D <em>Sheet List3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet List3 D</em>' containment reference.
	 * @see #getSheetList3D()
	 * @generated
	 */
	void setSheetList3D(SheetList3DType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStructuralProfile3DType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralProfile3DType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StructuralProfile3DType
