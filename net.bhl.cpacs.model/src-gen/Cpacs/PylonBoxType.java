/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonBoxType#getInnerSideShell <em>Inner Side Shell</em>}</li>
 *   <li>{@link Cpacs.PylonBoxType#getOuterSideShell <em>Outer Side Shell</em>}</li>
 *   <li>{@link Cpacs.PylonBoxType#getLowerShell <em>Lower Shell</em>}</li>
 *   <li>{@link Cpacs.PylonBoxType#getUpperShell <em>Upper Shell</em>}</li>
 *   <li>{@link Cpacs.PylonBoxType#getRibsDefinitions <em>Ribs Definitions</em>}</li>
 *   <li>{@link Cpacs.PylonBoxType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonBoxType()
 * @model extendedMetaData="name='pylonBoxType' kind='elementOnly'"
 * @generated
 */
public interface PylonBoxType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Side Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Side Shell</em>' containment reference.
	 * @see #setInnerSideShell(PylonShellType)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_InnerSideShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerSideShell' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShellType getInnerSideShell();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getInnerSideShell <em>Inner Side Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Side Shell</em>' containment reference.
	 * @see #getInnerSideShell()
	 * @generated
	 */
	void setInnerSideShell(PylonShellType value);

	/**
	 * Returns the value of the '<em><b>Outer Side Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Side Shell</em>' containment reference.
	 * @see #setOuterSideShell(PylonShellType)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_OuterSideShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerSideShell' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShellType getOuterSideShell();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getOuterSideShell <em>Outer Side Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Side Shell</em>' containment reference.
	 * @see #getOuterSideShell()
	 * @generated
	 */
	void setOuterSideShell(PylonShellType value);

	/**
	 * Returns the value of the '<em><b>Lower Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Shell</em>' containment reference.
	 * @see #setLowerShell(PylonShellType)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_LowerShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerShell' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShellType getLowerShell();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getLowerShell <em>Lower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Shell</em>' containment reference.
	 * @see #getLowerShell()
	 * @generated
	 */
	void setLowerShell(PylonShellType value);

	/**
	 * Returns the value of the '<em><b>Upper Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Shell</em>' containment reference.
	 * @see #setUpperShell(PylonShellType)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_UpperShell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperShell' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShellType getUpperShell();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getUpperShell <em>Upper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Shell</em>' containment reference.
	 * @see #getUpperShell()
	 * @generated
	 */
	void setUpperShell(PylonShellType value);

	/**
	 * Returns the value of the '<em><b>Ribs Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Definitions</em>' containment reference.
	 * @see #setRibsDefinitions(PylonRibsDefinitionsType)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_RibsDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribsDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonRibsDefinitionsType getRibsDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getRibsDefinitions <em>Ribs Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs Definitions</em>' containment reference.
	 * @see #getRibsDefinitions()
	 * @generated
	 */
	void setRibsDefinitions(PylonRibsDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the pylon box.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPylonBoxType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonBoxType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PylonBoxType
