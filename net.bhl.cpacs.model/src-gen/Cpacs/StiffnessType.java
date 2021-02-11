/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stiffness Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StiffnessType#getEA <em>EA</em>}</li>
 *   <li>{@link Cpacs.StiffnessType#getEIyy <em>EIyy</em>}</li>
 *   <li>{@link Cpacs.StiffnessType#getEIzz <em>EIzz</em>}</li>
 *   <li>{@link Cpacs.StiffnessType#getGIt <em>GIt</em>}</li>
 *   <li>{@link Cpacs.StiffnessType#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.StiffnessType#getIt <em>It</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStiffnessType()
 * @model extendedMetaData="name='stiffnessType' kind='elementOnly'"
 * @generated
 */
public interface StiffnessType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>EA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA</em>' containment reference.
	 * @see #setEA(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_EA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEA();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getEA <em>EA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA</em>' containment reference.
	 * @see #getEA()
	 * @generated
	 */
	void setEA(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>EIyy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIyy</em>' containment reference.
	 * @see #setEIyy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_EIyy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EIyy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEIyy();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getEIyy <em>EIyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIyy</em>' containment reference.
	 * @see #getEIyy()
	 * @generated
	 */
	void setEIyy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>EIzz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIzz</em>' containment reference.
	 * @see #setEIzz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_EIzz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EIzz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEIzz();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getEIzz <em>EIzz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIzz</em>' containment reference.
	 * @see #getEIzz()
	 * @generated
	 */
	void setEIzz(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>GIt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GIt</em>' containment reference.
	 * @see #setGIt(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_GIt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GIt' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGIt();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getGIt <em>GIt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GIt</em>' containment reference.
	 * @see #getGIt()
	 * @generated
	 */
	void setGIt(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference.
	 * @see #setG(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_G()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='G' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getG <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' containment reference.
	 * @see #getG()
	 * @generated
	 */
	void setG(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>It</em>' containment reference.
	 * @see #setIt(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStiffnessType_It()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='It' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getIt();

	/**
	 * Sets the value of the '{@link Cpacs.StiffnessType#getIt <em>It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>It</em>' containment reference.
	 * @see #getIt()
	 * @generated
	 */
	void setIt(DoubleBaseType value);

} // StiffnessType
