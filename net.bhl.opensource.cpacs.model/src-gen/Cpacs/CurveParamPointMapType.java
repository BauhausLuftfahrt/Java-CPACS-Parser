/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Param Point Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CurveParamPointMapType#getPointIndices <em>Point Indices</em>}</li>
 *   <li>{@link Cpacs.CurveParamPointMapType#getParamOnCurve <em>Param On Curve</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCurveParamPointMapType()
 * @model extendedMetaData="name='curveParamPointMapType' kind='elementOnly'"
 * @generated
 */
public interface CurveParamPointMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point Indices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of indices of points to be mapped. Each index must be in the range [1, npoints].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Indices</em>' containment reference.
	 * @see #setPointIndices(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCurveParamPointMapType_PointIndices()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointIndices' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPointIndices();

	/**
	 * Sets the value of the '{@link Cpacs.CurveParamPointMapType#getPointIndices <em>Point Indices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Indices</em>' containment reference.
	 * @see #getPointIndices()
	 * @generated
	 */
	void setPointIndices(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Param On Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of parameters on the curve, that is mapped to the points defined by their index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param On Curve</em>' containment reference.
	 * @see #setParamOnCurve(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCurveParamPointMapType_ParamOnCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paramOnCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getParamOnCurve();

	/**
	 * Sets the value of the '{@link Cpacs.CurveParamPointMapType#getParamOnCurve <em>Param On Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param On Curve</em>' containment reference.
	 * @see #getParamOnCurve()
	 * @generated
	 */
	void setParamOnCurve(StringVectorBaseType value);

} // CurveParamPointMapType
