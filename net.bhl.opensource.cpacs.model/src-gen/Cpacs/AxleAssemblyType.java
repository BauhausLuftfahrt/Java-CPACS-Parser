/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axle Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AxleAssemblyType#getAxle <em>Axle</em>}</li>
 *   <li>{@link Cpacs.AxleAssemblyType#getPosOnBogie <em>Pos On Bogie</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAxleAssemblyType()
 * @model extendedMetaData="name='axleAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface AxleAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Axle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle</em>' containment reference.
	 * @see #setAxle(AxleType)
	 * @see Cpacs.CpacsPackage#getAxleAssemblyType_Axle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axle' namespace='##targetNamespace'"
	 * @generated
	 */
	AxleType getAxle();

	/**
	 * Sets the value of the '{@link Cpacs.AxleAssemblyType#getAxle <em>Axle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axle</em>' containment reference.
	 * @see #getAxle()
	 * @generated
	 */
	void setAxle(AxleType value);

	/**
	 * Returns the value of the '<em><b>Pos On Bogie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative position of the axle to the bogie (if more than one axle is defined; 0 = forward end of bogie; 1 = rear end of bogie)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pos On Bogie</em>' attribute.
	 * @see #isSetPosOnBogie()
	 * @see #unsetPosOnBogie()
	 * @see #setPosOnBogie(double)
	 * @see Cpacs.CpacsPackage#getAxleAssemblyType_PosOnBogie()
	 * @model unsettable="true" dataType="Cpacs.PosOnBogieType" required="true"
	 *        extendedMetaData="kind='element' name='posOnBogie' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPosOnBogie();

	/**
	 * Sets the value of the '{@link Cpacs.AxleAssemblyType#getPosOnBogie <em>Pos On Bogie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos On Bogie</em>' attribute.
	 * @see #isSetPosOnBogie()
	 * @see #unsetPosOnBogie()
	 * @see #getPosOnBogie()
	 * @generated
	 */
	void setPosOnBogie(double value);

	/**
	 * Unsets the value of the '{@link Cpacs.AxleAssemblyType#getPosOnBogie <em>Pos On Bogie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosOnBogie()
	 * @see #getPosOnBogie()
	 * @see #setPosOnBogie(double)
	 * @generated
	 */
	void unsetPosOnBogie();

	/**
	 * Returns whether the value of the '{@link Cpacs.AxleAssemblyType#getPosOnBogie <em>Pos On Bogie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pos On Bogie</em>' attribute is set.
	 * @see #unsetPosOnBogie()
	 * @see #getPosOnBogie()
	 * @see #setPosOnBogie(double)
	 * @generated
	 */
	boolean isSetPosOnBogie();

} // AxleAssemblyType
