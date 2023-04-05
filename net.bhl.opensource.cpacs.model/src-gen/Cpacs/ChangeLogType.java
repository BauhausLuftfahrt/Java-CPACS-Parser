/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Log Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ChangeLogType#getLogEntry <em>Log Entry</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getChangeLogType()
 * @model extendedMetaData="name='changeLogType' kind='elementOnly'"
 * @generated
 */
public interface ChangeLogType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Log Entry</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LogEntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Entry</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getChangeLogType_LogEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogEntryType> getLogEntry();

} // ChangeLogType
