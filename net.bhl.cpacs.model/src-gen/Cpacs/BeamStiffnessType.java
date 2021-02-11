/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beam Stiffness Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BeamStiffnessType#getEA <em>EA</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getEIxx <em>EIxx</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getEIyy <em>EIyy</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getEIxy <em>EIxy</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getGIt <em>GIt</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getIt <em>It</em>}</li>
 *   <li>{@link Cpacs.BeamStiffnessType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBeamStiffnessType()
 * @model extendedMetaData="name='beamStiffnessType' kind='elementOnly'"
 * @generated
 */
public interface BeamStiffnessType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>EA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA</em>' containment reference.
	 * @see #setEA(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_EA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEA();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getEA <em>EA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA</em>' containment reference.
	 * @see #getEA()
	 * @generated
	 */
	void setEA(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>EIxx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIxx</em>' containment reference.
	 * @see #setEIxx(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_EIxx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EIxx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEIxx();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getEIxx <em>EIxx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIxx</em>' containment reference.
	 * @see #getEIxx()
	 * @generated
	 */
	void setEIxx(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>EIyy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIyy</em>' containment reference.
	 * @see #setEIyy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_EIyy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EIyy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEIyy();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getEIyy <em>EIyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIyy</em>' containment reference.
	 * @see #getEIyy()
	 * @generated
	 */
	void setEIyy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>EIxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIxy</em>' containment reference.
	 * @see #setEIxy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_EIxy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EIxy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEIxy();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getEIxy <em>EIxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIxy</em>' containment reference.
	 * @see #getEIxy()
	 * @generated
	 */
	void setEIxy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>GIt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GIt</em>' containment reference.
	 * @see #setGIt(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_GIt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GIt' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGIt();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getGIt <em>GIt</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_G()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='G' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getG <em>G</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_It()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='It' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getIt();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getIt <em>It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>It</em>' containment reference.
	 * @see #getIt()
	 * @generated
	 */
	void setIt(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getBeamStiffnessType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.BeamStiffnessType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // BeamStiffnessType
