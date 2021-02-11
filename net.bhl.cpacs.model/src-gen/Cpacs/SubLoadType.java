/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SubLoadType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.SubLoadType#getMz <em>Mz</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSubLoadType()
 * @model extendedMetaData="name='subLoadType' kind='elementOnly'"
 * @generated
 */
public interface SubLoadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSubLoadType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx</em>' containment reference.
	 * @see #setFx(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSubLoadType_Fx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFx();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getFx <em>Fx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_Fy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fy' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFy();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getFy <em>Fy</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_Fz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFz();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getFz <em>Fz</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_Mx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMx();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getMx <em>Mx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_My()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='my' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMy();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getMy <em>My</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSubLoadType_Mz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMz();

	/**
	 * Sets the value of the '{@link Cpacs.SubLoadType#getMz <em>Mz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mz</em>' containment reference.
	 * @see #getMz()
	 * @generated
	 */
	void setMz(StringVectorBaseType value);

} // SubLoadType
