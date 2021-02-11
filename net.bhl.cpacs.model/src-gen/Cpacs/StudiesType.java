/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StudiesType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Cpacs.StudiesType#getDesignStudies <em>Design Studies</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStudiesType()
 * @model extendedMetaData="name='studiesType' kind='elementOnly'"
 * @generated
 */
public interface StudiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType)
	 * @see Cpacs.CpacsPackage#getStudiesType_Parameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType getParameters();

	/**
	 * Sets the value of the '{@link Cpacs.StudiesType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType value);

	/**
	 * Returns the value of the '<em><b>Design Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Studies</em>' containment reference.
	 * @see #setDesignStudies(DesignStudiesType)
	 * @see Cpacs.CpacsPackage#getStudiesType_DesignStudies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designStudies' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignStudiesType getDesignStudies();

	/**
	 * Sets the value of the '{@link Cpacs.StudiesType#getDesignStudies <em>Design Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Studies</em>' containment reference.
	 * @see #getDesignStudies()
	 * @generated
	 */
	void setDesignStudies(DesignStudiesType value);

} // StudiesType
