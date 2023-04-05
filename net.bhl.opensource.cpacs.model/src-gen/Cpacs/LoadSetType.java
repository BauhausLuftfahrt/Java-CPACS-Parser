/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadSetType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getPointSetUID <em>Point Set UID</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getFx <em>Fx</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getFy <em>Fy</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getFz <em>Fz</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getMx <em>Mx</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getMy <em>My</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getMz <em>Mz</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getDx <em>Dx</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getDy <em>Dy</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getDz <em>Dz</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getPhix <em>Phix</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getPhiy <em>Phiy</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getPhiz <em>Phiz</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getLoadBreakdown <em>Load Breakdown</em>}</li>
 *   <li>{@link Cpacs.LoadSetType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadSetType()
 * @model extendedMetaData="name='loadSetType' kind='elementOnly'"
 * @generated
 */
public interface LoadSetType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Set UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of load application point set (analysis/global/loadApplicationPoints)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Set UID</em>' containment reference.
	 * @see #setPointSetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_PointSetUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointSetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPointSetUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getPointSetUID <em>Point Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Set UID</em>' containment reference.
	 * @see #getPointSetUID()
	 * @generated
	 */
	void setPointSetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Force in x-direction [N]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fx</em>' containment reference.
	 * @see #setFx(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Fx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getFx();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getFx <em>Fx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx</em>' containment reference.
	 * @see #getFx()
	 * @generated
	 */
	void setFx(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Fy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Force in y-direction [N]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fy</em>' containment reference.
	 * @see #setFy(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Fy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getFy();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getFy <em>Fy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fy</em>' containment reference.
	 * @see #getFy()
	 * @generated
	 */
	void setFy(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Fz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Force in z-direction [N]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fz</em>' containment reference.
	 * @see #setFz(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Fz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getFz();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getFz <em>Fz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fz</em>' containment reference.
	 * @see #getFz()
	 * @generated
	 */
	void setFz(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Moment around x-axis [Nm]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mx</em>' containment reference.
	 * @see #setMx(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Mx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getMx();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getMx <em>Mx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mx</em>' containment reference.
	 * @see #getMx()
	 * @generated
	 */
	void setMx(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>My</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Moment around y-axis [Nm]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>My</em>' containment reference.
	 * @see #setMy(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_My()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='my' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getMy();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getMy <em>My</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My</em>' containment reference.
	 * @see #getMy()
	 * @generated
	 */
	void setMy(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Moment around z-axis [Nm]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mz</em>' containment reference.
	 * @see #setMz(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Mz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getMz();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getMz <em>Mz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mz</em>' containment reference.
	 * @see #getMz()
	 * @generated
	 */
	void setMz(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal displacement in x-direction [m]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dx</em>' containment reference.
	 * @see #setDx(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Dx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDx();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getDx <em>Dx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' containment reference.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal displacement in y-direction [m]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dy</em>' containment reference.
	 * @see #setDy(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Dy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDy();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getDy <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' containment reference.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal displacement in z-direction [m]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dz</em>' containment reference.
	 * @see #setDz(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Dz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDz();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getDz <em>Dz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dz</em>' containment reference.
	 * @see #getDz()
	 * @generated
	 */
	void setDz(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Phix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal rotation around x-axis [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phix</em>' containment reference.
	 * @see #setPhix(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Phix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phix' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getPhix();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getPhix <em>Phix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phix</em>' containment reference.
	 * @see #getPhix()
	 * @generated
	 */
	void setPhix(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Phiy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal rotation around y-axis [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phiy</em>' containment reference.
	 * @see #setPhiy(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Phiy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phiy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getPhiy();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getPhiy <em>Phiy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phiy</em>' containment reference.
	 * @see #getPhiy()
	 * @generated
	 */
	void setPhiy(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Phiz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Nodal rotation around z-axis [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phiz</em>' containment reference.
	 * @see #setPhiz(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_Phiz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phiz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getPhiz();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getPhiz <em>Phiz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phiz</em>' containment reference.
	 * @see #getPhiz()
	 * @generated
	 */
	void setPhiz(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Breakdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Load brake-down
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Breakdown</em>' containment reference.
	 * @see #setLoadBreakdown(LoadBreakdownType)
	 * @see Cpacs.CpacsPackage#getLoadSetType_LoadBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBreakdownType getLoadBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getLoadBreakdown <em>Load Breakdown</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getLoadSetType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadSetType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LoadSetType
