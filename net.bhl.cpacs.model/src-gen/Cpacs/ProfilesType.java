/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ProfilesType#getFuselageProfiles <em>Fuselage Profiles</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getWingAirfoils <em>Wing Airfoils</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getRotorAirfoils <em>Rotor Airfoils</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getStructuralProfiles <em>Structural Profiles</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getNacelleProfiles <em>Nacelle Profiles</em>}</li>
 *   <li>{@link Cpacs.ProfilesType#getCurveProfiles <em>Curve Profiles</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getProfilesType()
 * @model extendedMetaData="name='profilesType' kind='elementOnly'"
 * @generated
 */
public interface ProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Profiles</em>' containment reference.
	 * @see #setFuselageProfiles(FuselageProfilesType)
	 * @see Cpacs.CpacsPackage#getProfilesType_FuselageProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselageProfilesType getFuselageProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getFuselageProfiles <em>Fuselage Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Profiles</em>' containment reference.
	 * @see #getFuselageProfiles()
	 * @generated
	 */
	void setFuselageProfiles(FuselageProfilesType value);

	/**
	 * Returns the value of the '<em><b>Wing Airfoils</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Airfoils</em>' containment reference.
	 * @see #setWingAirfoils(WingAirfoilsType)
	 * @see Cpacs.CpacsPackage#getProfilesType_WingAirfoils()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingAirfoils' namespace='##targetNamespace'"
	 * @generated
	 */
	WingAirfoilsType getWingAirfoils();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getWingAirfoils <em>Wing Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Airfoils</em>' containment reference.
	 * @see #getWingAirfoils()
	 * @generated
	 */
	void setWingAirfoils(WingAirfoilsType value);

	/**
	 * Returns the value of the '<em><b>Guide Curves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Curves</em>' containment reference.
	 * @see #setGuideCurves(GuideCurveProfilesType)
	 * @see Cpacs.CpacsPackage#getProfilesType_GuideCurves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	GuideCurveProfilesType getGuideCurves();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getGuideCurves <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Curves</em>' containment reference.
	 * @see #getGuideCurves()
	 * @generated
	 */
	void setGuideCurves(GuideCurveProfilesType value);

	/**
	 * Returns the value of the '<em><b>Rotor Airfoils</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotor Airfoils</em>' containment reference.
	 * @see #setRotorAirfoils(RotorAirfoilsType)
	 * @see Cpacs.CpacsPackage#getProfilesType_RotorAirfoils()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotorAirfoils' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorAirfoilsType getRotorAirfoils();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getRotorAirfoils <em>Rotor Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotor Airfoils</em>' containment reference.
	 * @see #getRotorAirfoils()
	 * @generated
	 */
	void setRotorAirfoils(RotorAirfoilsType value);

	/**
	 * Returns the value of the '<em><b>Structural Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Profiles</em>' containment reference.
	 * @see #setStructuralProfiles(StructuralProfilesType)
	 * @see Cpacs.CpacsPackage#getProfilesType_StructuralProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuralProfilesType getStructuralProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getStructuralProfiles <em>Structural Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Profiles</em>' containment reference.
	 * @see #getStructuralProfiles()
	 * @generated
	 */
	void setStructuralProfiles(StructuralProfilesType value);

	/**
	 * Returns the value of the '<em><b>Nacelle Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelle Profiles</em>' containment reference.
	 * @see #setNacelleProfiles(NacelleProfilesType)
	 * @see Cpacs.CpacsPackage#getProfilesType_NacelleProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nacelleProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleProfilesType getNacelleProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getNacelleProfiles <em>Nacelle Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nacelle Profiles</em>' containment reference.
	 * @see #getNacelleProfiles()
	 * @generated
	 */
	void setNacelleProfiles(NacelleProfilesType value);

	/**
	 * Returns the value of the '<em><b>Curve Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Profiles</em>' containment reference.
	 * @see #setCurveProfiles(CurveProfilesType)
	 * @see Cpacs.CpacsPackage#getProfilesType_CurveProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveProfilesType getCurveProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.ProfilesType#getCurveProfiles <em>Curve Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Profiles</em>' containment reference.
	 * @see #getCurveProfiles()
	 * @generated
	 */
	void setCurveProfiles(CurveProfilesType value);

} // ProfilesType
