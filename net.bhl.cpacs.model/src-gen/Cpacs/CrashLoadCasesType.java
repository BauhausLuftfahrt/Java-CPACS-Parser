/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crash Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CrashLoadCasesType#getCrashLoadCase <em>Crash Load Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCrashLoadCasesType()
 * @model extendedMetaData="name='crashLoadCasesType' kind='elementOnly'"
 * @generated
 */
public interface CrashLoadCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Crash Load Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CrashLoadcaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crash Load Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCrashLoadCasesType_CrashLoadCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crashLoadCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrashLoadcaseType> getCrashLoadCase();

} // CrashLoadCasesType
