/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Point List XYZ Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CurvePointListXYZType#getKinkIndices <em>Kink Indices</em>}</li>
 *   <li>{@link Cpacs.CurvePointListXYZType#getParameterMap <em>Parameter Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCurvePointListXYZType()
 * @model extendedMetaData="name='curvePointListXYZType' kind='elementOnly'"
 * @generated
 */
public interface CurvePointListXYZType extends PointListXYZVectorType {
	/**
	 * Returns the value of the '<em><b>Kink Indices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices of points at which the curve has a kink. Each index is in the range [1, npoints].
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kink Indices</em>' containment reference.
	 * @see #setKinkIndices(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCurvePointListXYZType_KinkIndices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinkIndices' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getKinkIndices();

	/**
	 * Sets the value of the '{@link Cpacs.CurvePointListXYZType#getKinkIndices <em>Kink Indices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kink Indices</em>' containment reference.
	 * @see #getKinkIndices()
	 * @generated
	 */
	void setKinkIndices(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Parameter Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Map between point index and curve parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Map</em>' containment reference.
	 * @see #setParameterMap(CurveParamPointMapType)
	 * @see Cpacs.CpacsPackage#getCurvePointListXYZType_ParameterMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterMap' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveParamPointMapType getParameterMap();

	/**
	 * Sets the value of the '{@link Cpacs.CurvePointListXYZType#getParameterMap <em>Parameter Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Map</em>' containment reference.
	 * @see #getParameterMap()
	 * @generated
	 */
	void setParameterMap(CurveParamPointMapType value);

} // CurvePointListXYZType
