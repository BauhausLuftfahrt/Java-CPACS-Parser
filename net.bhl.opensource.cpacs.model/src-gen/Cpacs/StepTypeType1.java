/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getStepTypeType1()
 * @model extendedMetaData="name='stepType_._1_._type'"
 * @generated
 */
public enum StepTypeType1 implements Enumerator {
	/**
	 * The '<em><b>Retracted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRACTED_VALUE
	 * @generated
	 * @ordered
	 */
	RETRACTED(0, "retracted", "retracted"),

	/**
	 * The '<em><b>Intermediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE(1, "intermediate", "intermediate"),

	/**
	 * The '<em><b>Extracted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRACTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXTRACTED(2, "extracted", "extracted");

	/**
	 * The '<em><b>Retracted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRACTED
	 * @model name="retracted"
	 * @generated
	 * @ordered
	 */
	public static final int RETRACTED_VALUE = 0;

	/**
	 * The '<em><b>Intermediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE
	 * @model name="intermediate"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_VALUE = 1;

	/**
	 * The '<em><b>Extracted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRACTED
	 * @model name="extracted"
	 * @generated
	 * @ordered
	 */
	public static final int EXTRACTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Step Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StepTypeType1[] VALUES_ARRAY = new StepTypeType1[] { RETRACTED, INTERMEDIATE, EXTRACTED, };

	/**
	 * A public read-only list of all the '<em><b>Step Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StepTypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Step Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepTypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepTypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StepTypeType1 get(int value) {
		switch (value) {
		case RETRACTED_VALUE:
			return RETRACTED;
		case INTERMEDIATE_VALUE:
			return INTERMEDIATE;
		case EXTRACTED_VALUE:
			return EXTRACTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StepTypeType1(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StepTypeType1
