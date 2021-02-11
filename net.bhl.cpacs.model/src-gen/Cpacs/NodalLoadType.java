/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodal Load Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NodalLoadType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getMz <em>Mz</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getLoadBreakdown <em>Load Breakdown</em>}</li>
 *   <li>{@link Cpacs.NodalLoadType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNodalLoadType()
 * @model extendedMetaData="name='nodalLoadType' kind='elementOnly'"
 * @generated
 */
public interface NodalLoadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getDescription <em>Description</em>}' containment reference.
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
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx</em>' containment reference.
	 * @see #setFx(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Fx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFx();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getFx <em>Fx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx</em>' containment reference.
	 * @see #getFx()
	 * @generated
	 */
	void setFx(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Fy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fy</em>' containment reference.
	 * @see #setFy(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Fy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fy' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFy();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getFy <em>Fy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fy</em>' containment reference.
	 * @see #getFy()
	 * @generated
	 */
	void setFy(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Fz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fz</em>' containment reference.
	 * @see #setFz(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Fz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFz();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getFz <em>Fz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fz</em>' containment reference.
	 * @see #getFz()
	 * @generated
	 */
	void setFz(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mx</em>' containment reference.
	 * @see #setMx(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Mx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMx();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getMx <em>Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mx</em>' containment reference.
	 * @see #getMx()
	 * @generated
	 */
	void setMx(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>My</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My</em>' containment reference.
	 * @see #setMy(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_My()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='my' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMy();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getMy <em>My</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My</em>' containment reference.
	 * @see #getMy()
	 * @generated
	 */
	void setMy(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mz</em>' containment reference.
	 * @see #setMz(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_Mz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMz();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getMz <em>Mz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mz</em>' containment reference.
	 * @see #getMz()
	 * @generated
	 */
	void setMz(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Breakdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Breakdown</em>' containment reference.
	 * @see #setLoadBreakdown(LoadBreakdownType)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_LoadBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBreakdownType getLoadBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getLoadBreakdown <em>Load Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Breakdown</em>' containment reference.
	 * @see #getLoadBreakdown()
	 * @generated
	 */
	void setLoadBreakdown(LoadBreakdownType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getNodalLoadType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.NodalLoadType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // NodalLoadType
