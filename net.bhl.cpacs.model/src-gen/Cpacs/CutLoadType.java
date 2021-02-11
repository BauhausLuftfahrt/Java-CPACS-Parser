/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Load Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutLoadType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getMz <em>Mz</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getLoadBreakdown <em>Load Breakdown</em>}</li>
 *   <li>{@link Cpacs.CutLoadType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutLoadType()
 * @model extendedMetaData="name='cutLoadType' kind='elementOnly'"
 * @generated
 */
public interface CutLoadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getParentUID <em>Parent UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Fx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFx();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getFx <em>Fx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Fy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fy' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFy();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getFy <em>Fy</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Fz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFz();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getFz <em>Fz</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Mx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMx();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getMx <em>Mx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_My()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='my' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMy();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getMy <em>My</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_Mz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMz();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getMz <em>Mz</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_LoadBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBreakdownType getLoadBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getLoadBreakdown <em>Load Breakdown</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CutLoadType
