/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotationCurveType#getReferenceSectionUID <em>Reference Section UID</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getStartZeta <em>Start Zeta</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getEndZeta <em>End Zeta</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getStartZetaBlending <em>Start Zeta Blending</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getEndZetaBlending <em>End Zeta Blending</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getCurveProfileUID <em>Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.RotationCurveType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotationCurveType()
 * @model extendedMetaData="name='rotationCurveType' kind='elementOnly'"
 * @generated
 */
public interface RotationCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Section UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the section which serves as reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Section UID</em>' containment reference.
	 * @see #setReferenceSectionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_ReferenceSectionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceSectionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceSectionUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getReferenceSectionUID <em>Reference Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Section UID</em>' containment reference.
	 * @see #getReferenceSectionUID()
	 * @generated
	 */
	void setReferenceSectionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Zeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start zeta [-1,..,1]; relative curve coordante along the rotation curve from which it will be inserted in the nacelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Zeta</em>' containment reference.
	 * @see #setStartZeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_StartZeta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startZeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStartZeta();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getStartZeta <em>Start Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Zeta</em>' containment reference.
	 * @see #getStartZeta()
	 * @generated
	 */
	void setStartZeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>End Zeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End zeta [-1,..,1]; relative curve coordante along the rotation curve up to which it will be inserted in the nacelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Zeta</em>' containment reference.
	 * @see #setEndZeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_EndZeta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endZeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEndZeta();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getEndZeta <em>End Zeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Zeta</em>' containment reference.
	 * @see #getEndZeta()
	 * @generated
	 */
	void setEndZeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Zeta Blending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start zeta for blending [-1..1]; relative curve coordinate along the nacelle profile at which blending from the nacelle profile to the rotation curve will begin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Zeta Blending</em>' containment reference.
	 * @see #setStartZetaBlending(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_StartZetaBlending()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startZetaBlending' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStartZetaBlending();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getStartZetaBlending <em>Start Zeta Blending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Zeta Blending</em>' containment reference.
	 * @see #getStartZetaBlending()
	 * @generated
	 */
	void setStartZetaBlending(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>End Zeta Blending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End zeta for blending; relative curve coordinate along the nacelle profile at which blending from the rotation curve to the nacelle profile will end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Zeta Blending</em>' containment reference.
	 * @see #setEndZetaBlending(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_EndZetaBlending()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endZetaBlending' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEndZetaBlending();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getEndZetaBlending <em>End Zeta Blending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Zeta Blending</em>' containment reference.
	 * @see #getEndZetaBlending()
	 * @generated
	 */
	void setEndZetaBlending(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Curve Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the rotation curve profile; the profile should be defined in x=[0..1] to be transformed by the section which is referenced by referenceSectionUID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Profile UID</em>' containment reference.
	 * @see #setCurveProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_CurveProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='curveProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCurveProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getCurveProfileUID <em>Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Profile UID</em>' containment reference.
	 * @see #getCurveProfileUID()
	 * @generated
	 */
	void setCurveProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRotationCurveType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotationCurveType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RotationCurveType
