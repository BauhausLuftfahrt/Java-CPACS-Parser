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
 *   <li>{@link Cpacs.CurveParamPointMapType#getPointIndex <em>Point Index</em>}</li>
 *   <li>{@link Cpacs.CurveParamPointMapType#getParamOnCurve <em>Param On Curve</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCurveParamPointMapType()
 * @model extendedMetaData="name='curveParamPointMapType' kind='elementOnly'"
 * @generated
 */
public interface CurveParamPointMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of indices of points to be mapped. Each index must be in the range 0 ... npoints-1 .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Index</em>' containment reference.
	 * @see #setPointIndex(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCurveParamPointMapType_PointIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPointIndex();

	/**
	 * Sets the value of the '{@link Cpacs.CurveParamPointMapType#getPointIndex <em>Point Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Index</em>' containment reference.
	 * @see #getPointIndex()
	 * @generated
	 */
	void setPointIndex(StringVectorBaseType value);

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
