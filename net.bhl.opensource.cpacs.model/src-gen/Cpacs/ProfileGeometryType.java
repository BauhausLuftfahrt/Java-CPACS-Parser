/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ProfileGeometryType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getCst2D <em>Cst2 D</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getStandardProfile <em>Standard Profile</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.ProfileGeometryType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getProfileGeometryType()
 * @model extendedMetaData="name='profileGeometryType' kind='elementOnly'"
 * @generated
 */
public interface ProfileGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getName <em>Name</em>}' containment reference.
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
	 * Description of profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getDescription <em>Description</em>}' containment reference.
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
	 * @see #setPointList(CurvePointListXYZType)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_PointList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointList' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePointListXYZType getPointList();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getPointList <em>Point List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point List</em>' containment reference.
	 * @see #getPointList()
	 * @generated
	 */
	void setPointList(CurvePointListXYZType value);

	/**
	 * Returns the value of the '<em><b>Cst2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cst2 D</em>' containment reference.
	 * @see #setCst2D(Cst2DType)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_Cst2D()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cst2D' namespace='##targetNamespace'"
	 * @generated
	 */
	Cst2DType getCst2D();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getCst2D <em>Cst2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cst2 D</em>' containment reference.
	 * @see #getCst2D()
	 * @generated
	 */
	void setCst2D(Cst2DType value);

	/**
	 * Returns the value of the '<em><b>Standard Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Profile</em>' containment reference.
	 * @see #setStandardProfile(StandardProfileType)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_StandardProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardProfileType getStandardProfile();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getStandardProfile <em>Standard Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Profile</em>' containment reference.
	 * @see #getStandardProfile()
	 * @generated
	 */
	void setStandardProfile(StandardProfileType value);

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
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryXyXzYzType getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getSymmetry <em>Symmetry</em>}' attribute.
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
	 * Unsets the value of the '{@link Cpacs.ProfileGeometryType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.ProfileGeometryType#getSymmetry <em>Symmetry</em>}' attribute is set.
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
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getProfileGeometryType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ProfileGeometryType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ProfileGeometryType
