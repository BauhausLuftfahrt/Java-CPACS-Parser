/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Cowl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleCowlType#getSections <em>Sections</em>}</li>
 *   <li>{@link Cpacs.NacelleCowlType#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.NacelleCowlType#getRotationCurve <em>Rotation Curve</em>}</li>
 *   <li>{@link Cpacs.NacelleCowlType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleCowlType()
 * @model extendedMetaData="name='nacelleCowlType' kind='elementOnly'"
 * @generated
 */
public interface NacelleCowlType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference.
	 * @see #setSections(NacelleSectionsType)
	 * @see Cpacs.CpacsPackage#getNacelleCowlType_Sections()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleSectionsType getSections();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCowlType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(NacelleSectionsType value);

	/**
	 * Returns the value of the '<em><b>Guide Curves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Curves</em>' containment reference.
	 * @see #setGuideCurves(NacelleGuideCurvesType)
	 * @see Cpacs.CpacsPackage#getNacelleCowlType_GuideCurves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleGuideCurvesType getGuideCurves();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCowlType#getGuideCurves <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Curves</em>' containment reference.
	 * @see #getGuideCurves()
	 * @generated
	 */
	void setGuideCurves(NacelleGuideCurvesType value);

	/**
	 * Returns the value of the '<em><b>Rotation Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Curve</em>' containment reference.
	 * @see #setRotationCurve(RotationCurveType)
	 * @see Cpacs.CpacsPackage#getNacelleCowlType_RotationCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotationCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	RotationCurveType getRotationCurve();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCowlType#getRotationCurve <em>Rotation Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Curve</em>' containment reference.
	 * @see #getRotationCurve()
	 * @generated
	 */
	void setRotationCurve(RotationCurveType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getNacelleCowlType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.NacelleCowlType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // NacelleCowlType
