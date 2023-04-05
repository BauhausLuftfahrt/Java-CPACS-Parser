/**
 */
package Cpacs.util;

import Cpacs.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage
 * @generated
 */
public class CpacsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CpacsValidator INSTANCE = new CpacsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Cpacs";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CpacsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE:
			return validateActuatorAttachmentType((ActuatorAttachmentType) value, diagnostics, context);
		case CpacsPackage.ACTUATOR_CONTROL_SURFACE_ATTACHMENT_TYPE:
			return validateActuatorControlSurfaceAttachmentType((ActuatorControlSurfaceAttachmentType) value,
					diagnostics, context);
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE:
			return validateActuatorFuselageWingAttachmentType((ActuatorFuselageWingAttachmentType) value, diagnostics,
					context);
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE:
			return validateActuatorFuselageWingType((ActuatorFuselageWingType) value, diagnostics, context);
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE:
			return validateActuatorParentAttachmentType((ActuatorParentAttachmentType) value, diagnostics, context);
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE:
			return validateActuatorsFuselageWingType((ActuatorsFuselageWingType) value, diagnostics, context);
		case CpacsPackage.AERO_CASE_AERO_DATA_TYPE:
			return validateAeroCaseAeroDataType((AeroCaseAeroDataType) value, diagnostics, context);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE:
			return validateAeroCaseCoefficientsType((AeroCaseCoefficientsType) value, diagnostics, context);
		case CpacsPackage.AERO_CASE_SPECIFICATION_TYPE:
			return validateAeroCaseSpecificationType((AeroCaseSpecificationType) value, diagnostics, context);
		case CpacsPackage.AERO_CASES_TYPE:
			return validateAeroCasesType((AeroCasesType) value, diagnostics, context);
		case CpacsPackage.AERO_CASE_TYPE:
			return validateAeroCaseType((AeroCaseType) value, diagnostics, context);
		case CpacsPackage.AERO_DATA_COMPONENTS_TYPE:
			return validateAeroDataComponentsType((AeroDataComponentsType) value, diagnostics, context);
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE:
			return validateAeroDataComponentType((AeroDataComponentType) value, diagnostics, context);
		case CpacsPackage.AERO_DATA_VEHICLE_TYPE:
			return validateAeroDataVehicleType((AeroDataVehicleType) value, diagnostics, context);
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE:
			return validateAeroelasticDivergenceType((AeroelasticDivergenceType) value, diagnostics, context);
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE:
			return validateAeroelasticStaticMaxDisplacementType((AeroelasticStaticMaxDisplacementType) value,
					diagnostics, context);
		case CpacsPackage.AEROELASTICS_TYPE:
			return validateAeroelasticsType((AeroelasticsType) value, diagnostics, context);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAPS_TYPE:
			return validateAeroLimitsIncrementMapsType((AeroLimitsIncrementMapsType) value, diagnostics, context);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE:
			return validateAeroLimitsIncrementMapType((AeroLimitsIncrementMapType) value, diagnostics, context);
		case CpacsPackage.AERO_LIMITS_MAP_TYPE:
			return validateAeroLimitsMapType((AeroLimitsMapType) value, diagnostics, context);
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE:
			return validateAeroMapOperationLimitType((AeroMapOperationLimitType) value, diagnostics, context);
		case CpacsPackage.AERO_MAP_TYPE:
			return validateAeroMapType((AeroMapType) value, diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE:
			return validateAeroPerformanceBoundaryConditionsType((AeroPerformanceBoundaryConditionsType) value,
					diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE:
			return validateAeroPerformanceIncrementMapsType((AeroPerformanceIncrementMapsType) value, diagnostics,
					context);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE:
			return validateAeroPerformanceIncrementMapType((AeroPerformanceIncrementMapType) value, diagnostics,
					context);
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE:
			return validateAeroPerformanceMapRCType((AeroPerformanceMapRCType) value, diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE:
			return validateAeroPerformanceMapsRCType((AeroPerformanceMapsRCType) value, diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE:
			return validateAeroPerformanceMapType((AeroPerformanceMapType) value, diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE:
			return validateAeroPerformanceRCType((AeroPerformanceRCType) value, diagnostics, context);
		case CpacsPackage.AERO_PERFORMANCE_TYPE:
			return validateAeroPerformanceType((AeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_ANALYSES_GLOBAL_TYPE:
			return validateAircraftAnalysesGlobalType((AircraftAnalysesGlobalType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE:
			return validateAircraftAnalysesType((AircraftAnalysesType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENTS_TYPE:
			return validateAircraftControlElementsType((AircraftControlElementsType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_CONTROL_ELEMENT_TYPE:
			return validateAircraftControlElementType((AircraftControlElementType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE:
			return validateAircraftGlobalType((AircraftGlobalType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_MODEL_TYPE:
			return validateAircraftModelType((AircraftModelType) value, diagnostics, context);
		case CpacsPackage.AIRCRAFT_TYPE:
			return validateAircraftType((AircraftType) value, diagnostics, context);
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE:
			return validateAirfoilAeroPerformanceType((AirfoilAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE:
			return validateAirfoilsAeroPerformanceType((AirfoilsAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.AIRFRAME_MAINTENANCE_COST_TYPE:
			return validateAirframeMaintenanceCostType((AirframeMaintenanceCostType) value, diagnostics, context);
		case CpacsPackage.AIRLINES_TYPE:
			return validateAirlinesType((AirlinesType) value, diagnostics, context);
		case CpacsPackage.AIRLINE_TYPE:
			return validateAirlineType((AirlineType) value, diagnostics, context);
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE:
			return validateAirportCompatabilityGlobalType((AirportCompatabilityGlobalType) value, diagnostics, context);
		case CpacsPackage.AIRPORTS_TYPE:
			return validateAirportsType((AirportsType) value, diagnostics, context);
		case CpacsPackage.AIRPORT_TYPE:
			return validateAirportType((AirportType) value, diagnostics, context);
		case CpacsPackage.ALIGNMENT_CROSS_BEAM_TYPE:
			return validateAlignmentCrossBeamType((AlignmentCrossBeamType) value, diagnostics, context);
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE:
			return validateAlignmentFloorPanelType((AlignmentFloorPanelType) value, diagnostics, context);
		case CpacsPackage.ALIGNMENT_STRING_FRAME_TYPE:
			return validateAlignmentStringFrameType((AlignmentStringFrameType) value, diagnostics, context);
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE:
			return validateAlignmentStructMemberType((AlignmentStructMemberType) value, diagnostics, context);
		case CpacsPackage.ALTITUDE_TYPE:
			return validateAltitudeType((AltitudeType) value, diagnostics, context);
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE:
			return validateAnisotropicShellPropertiesType((AnisotropicShellPropertiesType) value, diagnostics, context);
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE:
			return validateAnisotropicSolidPropertiesType((AnisotropicSolidPropertiesType) value, diagnostics, context);
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE:
			return validateAtmosphericModelOldType((AtmosphericModelOldType) value, diagnostics, context);
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE:
			return validateAtmosphericModelType((AtmosphericModelType) value, diagnostics, context);
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE1:
			return validateAtmosphericModelType1((AtmosphericModelType1) value, diagnostics, context);
		case CpacsPackage.ATTACHMENT_PINS_TYPE:
			return validateAttachmentPinsType((AttachmentPinsType) value, diagnostics, context);
		case CpacsPackage.ATTACHMENT_PIN_TYPE:
			return validateAttachmentPinType((AttachmentPinType) value, diagnostics, context);
		case CpacsPackage.AXLE_ASSEMBLIES_TYPE:
			return validateAxleAssembliesType((AxleAssembliesType) value, diagnostics, context);
		case CpacsPackage.AXLE_ASSEMBLY_TYPE:
			return validateAxleAssemblyType((AxleAssemblyType) value, diagnostics, context);
		case CpacsPackage.AXLE_TYPE:
			return validateAxleType((AxleType) value, diagnostics, context);
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE:
			return validateBeamCrossSectionType((BeamCrossSectionType) value, diagnostics, context);
		case CpacsPackage.BEAM_STIFFNESS_TYPE:
			return validateBeamStiffnessType((BeamStiffnessType) value, diagnostics, context);
		case CpacsPackage.BLOCKED_DOF_TYPE:
			return validateBlockedDOFType((BlockedDOFType) value, diagnostics, context);
		case CpacsPackage.BOGIE_TYPE:
			return validateBogieType((BogieType) value, diagnostics, context);
		case CpacsPackage.BOOLEAN_BASE_TYPE:
			return validateBooleanBaseType((BooleanBaseType) value, diagnostics, context);
		case CpacsPackage.BOUNDING_BOX_TYPE:
			return validateBoundingBoxType((BoundingBoxType) value, diagnostics, context);
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE:
			return validateBoundingElementUIDsType((BoundingElementUIDsType) value, diagnostics, context);
		case CpacsPackage.CABIN_AISLES_TYPE:
			return validateCabinAislesType((CabinAislesType) value, diagnostics, context);
		case CpacsPackage.CABIN_AISLE_TYPE:
			return validateCabinAisleType((CabinAisleType) value, diagnostics, context);
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE:
			return validateCabinGeometryContoursType((CabinGeometryContoursType) value, diagnostics, context);
		case CpacsPackage.CABIN_GEOMETRY_CONTOUR_TYPE:
			return validateCabinGeometryContourType((CabinGeometryContourType) value, diagnostics, context);
		case CpacsPackage.CABIN_GEOMETRY_TYPE:
			return validateCabinGeometryType((CabinGeometryType) value, diagnostics, context);
		case CpacsPackage.CABIN_SPACES_TYPE:
			return validateCabinSpacesType((CabinSpacesType) value, diagnostics, context);
		case CpacsPackage.CABIN_SPACE_TYPE:
			return validateCabinSpaceType((CabinSpaceType) value, diagnostics, context);
		case CpacsPackage.CALIBRATED_AIR_SPEED_TYPE:
			return validateCalibratedAirSpeedType((CalibratedAirSpeedType) value, diagnostics, context);
		case CpacsPackage.CAP_TYPE:
			return validateCapType((CapType) value, diagnostics, context);
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE:
			return validateCargoContainerElementsType((CargoContainerElementsType) value, diagnostics, context);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE:
			return validateCargoContainerElementType((CargoContainerElementType) value, diagnostics, context);
		case CpacsPackage.CARGO_CONTAINERS_TYPE:
			return validateCargoContainersType((CargoContainersType) value, diagnostics, context);
		case CpacsPackage.CARGO_CONTAINER_TYPE:
			return validateCargoContainerType((CargoContainerType) value, diagnostics, context);
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE:
			return validateCargoCrossBeamsAssemblyType((CargoCrossBeamsAssemblyType) value, diagnostics, context);
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE:
			return validateCargoCrossBeamStrutsAssemblyType((CargoCrossBeamStrutsAssemblyType) value, diagnostics,
					context);
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE:
			return validateCargoDoorsAssemblyType((CargoDoorsAssemblyType) value, diagnostics, context);
		case CpacsPackage.CEILING_PANEL_ELEMENTS_TYPE:
			return validateCeilingPanelElementsType((CeilingPanelElementsType) value, diagnostics, context);
		case CpacsPackage.CEILING_PANELS_TYPE:
			return validateCeilingPanelsType((CeilingPanelsType) value, diagnostics, context);
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE:
			return validateCellPositioningChordwiseType((CellPositioningChordwiseType) value, diagnostics, context);
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE:
			return validateCellPositioningSpanwiseType((CellPositioningSpanwiseType) value, diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE:
			return validateCenterFuselageAreasAssemblyType((CenterFuselageAreasAssemblyType) value, diagnostics,
					context);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE:
			return validateCenterFuselageAreaType((CenterFuselageAreaType) value, diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE:
			return validateCenterFuselageHighWingConfigurationType((CenterFuselageHighWingConfigurationType) value,
					diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE:
			return validateCenterFuselageKeelbeamType((CenterFuselageKeelbeamType) value, diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE:
			return validateCenterFuselageLateralPanelsType((CenterFuselageLateralPanelsType) value, diagnostics,
					context);
		case CpacsPackage.CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION_TYPE:
			return validateCenterFuselageLongFloorBeamsConnectionType(
					(CenterFuselageLongFloorBeamsConnectionType) value, diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE:
			return validateCenterFuselageLowWingConfigurationType((CenterFuselageLowWingConfigurationType) value,
					diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE:
			return validateCenterFuselageMainFramesType((CenterFuselageMainFramesType) value, diagnostics, context);
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE:
			return validateCenterFuselagePressureFloorType((CenterFuselagePressureFloorType) value, diagnostics,
					context);
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE:
			return validateCenterFuselageSideboxType((CenterFuselageSideboxType) value, diagnostics, context);
		case CpacsPackage.CERTIFICATION_CASES_TYPE:
			return validateCertificationCasesType((CertificationCasesType) value, diagnostics, context);
		case CpacsPackage.CHANGE_LOG_TYPE:
			return validateChangeLogType((ChangeLogType) value, diagnostics, context);
		case CpacsPackage.CHARGES_COST_TYPE:
			return validateChargesCostType((ChargesCostType) value, diagnostics, context);
		case CpacsPackage.CHORDWISE_PARTS_TYPE:
			return validateChordwisePartsType((ChordwisePartsType) value, diagnostics, context);
		case CpacsPackage.CHORDWISE_PART_TYPE:
			return validateChordwisePartType((ChordwisePartType) value, diagnostics, context);
		case CpacsPackage.CLASS_DIVIDER_ELEMENTS_TYPE:
			return validateClassDividerElementsType((ClassDividerElementsType) value, diagnostics, context);
		case CpacsPackage.CLASS_DIVIDERS_TYPE:
			return validateClassDividersType((ClassDividersType) value, diagnostics, context);
		case CpacsPackage.COCKPIT_CONTROLS_TYPE:
			return validateCockpitControlsType((CockpitControlsType) value, diagnostics, context);
		case CpacsPackage.COCKPIT_CONTROL_TYPE:
			return validateCockpitControlType((CockpitControlType) value, diagnostics, context);
		case CpacsPackage.COEFFICIENT_REFERENCE_TYPE:
			return validateCoefficientReferenceType((CoefficientReferenceType) value, diagnostics, context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE:
			return validateCoefficientsBreakdownComponentsType((CoefficientsBreakdownComponentsType) value, diagnostics,
					context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENT_TYPE:
			return validateCoefficientsBreakdownComponentType((CoefficientsBreakdownComponentType) value, diagnostics,
					context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_SEGMENT_TYPE:
			return validateCoefficientsBreakdownSegmentType((CoefficientsBreakdownSegmentType) value, diagnostics,
					context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE:
			return validateCoefficientsBreakdownStripsType((CoefficientsBreakdownStripsType) value, diagnostics,
					context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIP_TYPE:
			return validateCoefficientsBreakdownStripType((CoefficientsBreakdownStripType) value, diagnostics, context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_TYPE:
			return validateCoefficientsBreakdownType((CoefficientsBreakdownType) value, diagnostics, context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_SEGMENTS_TYPE:
			return validateCoefficientsBreakdownWingSegmentsType((CoefficientsBreakdownWingSegmentsType) value,
					diagnostics, context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WINGS_TYPE:
			return validateCoefficientsBreakdownWingsType((CoefficientsBreakdownWingsType) value, diagnostics, context);
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_WING_TYPE:
			return validateCoefficientsBreakdownWingType((CoefficientsBreakdownWingType) value, diagnostics, context);
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE:
			return validateCommandCaseCommandType((CommandCaseCommandType) value, diagnostics, context);
		case CpacsPackage.COMMAND_CASES_TYPE:
			return validateCommandCasesType((CommandCasesType) value, diagnostics, context);
		case CpacsPackage.COMMAND_CASE_TYPE:
			return validateCommandCaseType((CommandCaseType) value, diagnostics, context);
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE:
			return validateCompartmentGeometryType((CompartmentGeometryType) value, diagnostics, context);
		case CpacsPackage.COMPARTMENTS_TYPE:
			return validateCompartmentsType((CompartmentsType) value, diagnostics, context);
		case CpacsPackage.COMPARTMENT_TYPE:
			return validateCompartmentType((CompartmentType) value, diagnostics, context);
		case CpacsPackage.COMPLEX_BASE_TYPE:
			return validateComplexBaseType((ComplexBaseType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_COST_TYPE:
			return validateComponentCostType((ComponentCostType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE:
			return validateComponentSegmentPathType((ComponentSegmentPathType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_SEGMENT_STEPS_TYPE:
			return validateComponentSegmentStepsType((ComponentSegmentStepsType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE:
			return validateComponentSegmentStepType((ComponentSegmentStepType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE:
			return validateComponentSegmentsType((ComponentSegmentsType) value, diagnostics, context);
		case CpacsPackage.COMPONENT_SEGMENT_TYPE:
			return validateComponentSegmentType((ComponentSegmentType) value, diagnostics, context);
		case CpacsPackage.COMPOSITE_LAYER_TYPE:
			return validateCompositeLayerType((CompositeLayerType) value, diagnostics, context);
		case CpacsPackage.COMPOSITES_TYPE:
			return validateCompositesType((CompositesType) value, diagnostics, context);
		case CpacsPackage.COMPOSITE_TYPE:
			return validateCompositeType((CompositeType) value, diagnostics, context);
		case CpacsPackage.CONFIGURATION_TYPE:
			return validateConfigurationType((ConfigurationType) value, diagnostics, context);
		case CpacsPackage.CONNECTIVITIES_TYPE:
			return validateConnectivitiesType((ConnectivitiesType) value, diagnostics, context);
		case CpacsPackage.CONNECTIVITY_TYPE:
			return validateConnectivityType((ConnectivityType) value, diagnostics, context);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE:
			return validateConstraintSettingsType((ConstraintSettingsType) value, diagnostics, context);
		case CpacsPackage.CONSTRAINTS_TYPE:
			return validateConstraintsType((ConstraintsType) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_AT_P1_TYPE:
			return validateContinuityAtP1Type((ContinuityAtP1Type) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_AT_P2_TYPE:
			return validateContinuityAtP2Type((ContinuityAtP2Type) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_TYPE:
			return validateContinuityType((ContinuityType) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_TYPE1:
			return validateContinuityType1((ContinuityType1) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_TYPE2:
			return validateContinuityType2((ContinuityType2) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_TYPE3:
			return validateContinuityType3((ContinuityType3) value, diagnostics, context);
		case CpacsPackage.CONTINUITY_TYPE4:
			return validateContinuityType4((ContinuityType4) value, diagnostics, context);
		case CpacsPackage.CONTOUR_REFERENCE_TYPE:
			return validateContourReferenceType((ContourReferenceType) value, diagnostics, context);
		case CpacsPackage.CONTOUR_TYPE:
			return validateContourType((ContourType) value, diagnostics, context);
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE:
			return validateControlDistributorsType((ControlDistributorsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE:
			return validateControlDistributorType((ControlDistributorType) value, diagnostics, context);
		case CpacsPackage.CONTROL_ELEMENTS_TYPE:
			return validateControlElementsType((ControlElementsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_ELEMENT_TYPE:
			return validateControlElementType((ControlElementType) value, diagnostics, context);
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE:
			return validateControlFunctionsType((ControlFunctionsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_FUNCTION_TYPE:
			return validateControlFunctionType((ControlFunctionType) value, diagnostics, context);
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE:
			return validateControllabilityReqsType((ControllabilityReqsType) value, diagnostics, context);
		case CpacsPackage.CONTROLLABILITY_REQUIREMENT_TYPE:
			return validateControllabilityRequirementType((ControllabilityRequirementType) value, diagnostics, context);
		case CpacsPackage.CONTROL_LAW_MODES_TYPE:
			return validateControlLawModesType((ControlLawModesType) value, diagnostics, context);
		case CpacsPackage.CONTROL_LAW_MODE_TYPE:
			return validateControlLawModeType((ControlLawModeType) value, diagnostics, context);
		case CpacsPackage.CONTROL_LAWS_TYPE:
			return validateControlLawsType((ControlLawsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_ACTUATORS_TYPE:
			return validateControlSurfaceActuatorsType((ControlSurfaceActuatorsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE:
			return validateControlSurfaceActuatorType((ControlSurfaceActuatorType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE:
			return validateControlSurfaceAirfoilType((ControlSurfaceAirfoilType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE:
			return validateControlSurfaceBorderLeadingEdgeType((ControlSurfaceBorderLeadingEdgeType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_BORDER_SPOILER_TYPE:
			return validateControlSurfaceBorderSpoilerType((ControlSurfaceBorderSpoilerType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE:
			return validateControlSurfaceBorderTrailingEdgeType((ControlSurfaceBorderTrailingEdgeType) value,
					diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE:
			return validateControlSurfaceContoursType((ControlSurfaceContoursType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTORS_TYPE:
			return validateControlSurfaceDeflectionVectorsType((ControlSurfaceDeflectionVectorsType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE:
			return validateControlSurfaceDeflectionVectorType((ControlSurfaceDeflectionVectorType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAPS_TYPE:
			return validateControlSurfaceHingeMomentMapsType((ControlSurfaceHingeMomentMapsType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAP_TYPE:
			return validateControlSurfaceHingeMomentMapType((ControlSurfaceHingeMomentMapType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE:
			return validateControlSurfaceHingePointType((ControlSurfaceHingePointType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_LEADING_EDGE_TYPE:
			return validateControlSurfaceOuterShapeLeadingEdgeType((ControlSurfaceOuterShapeLeadingEdgeType) value,
					diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_SPOILER_TYPE:
			return validateControlSurfaceOuterShapeSpoilerType((ControlSurfaceOuterShapeSpoilerType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE:
			return validateControlSurfaceOuterShapeTrailingEdgeType((ControlSurfaceOuterShapeTrailingEdgeType) value,
					diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE:
			return validateControlSurfacePathType((ControlSurfacePathType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE:
			return validateControlSurfacePerformanceMapOldType((ControlSurfacePerformanceMapOldType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAPS_OLD_TYPE:
			return validateControlSurfacePerformanceMapsOldType((ControlSurfacePerformanceMapsOldType) value,
					diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE:
			return validateControlSurfaceSkinCutOutBorderType((ControlSurfaceSkinCutOutBorderType) value, diagnostics,
					context);
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE:
			return validateControlSurfaceSkinCutOutType((ControlSurfaceSkinCutOutType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_STEPS_TYPE:
			return validateControlSurfaceStepsType((ControlSurfaceStepsType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE:
			return validateControlSurfaceStepType((ControlSurfaceStepType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACES_TYPE:
			return validateControlSurfacesType((ControlSurfacesType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_TRACKS_TYPE:
			return validateControlSurfaceTracksType((ControlSurfaceTracksType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE:
			return validateControlSurfaceTrackTypeType((ControlSurfaceTrackTypeType) value, diagnostics, context);
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE:
			return validateControlSurfaceWingCutOutType((ControlSurfaceWingCutOutType) value, diagnostics, context);
		case CpacsPackage.CORNER_RADIUS_TYPE:
			return validateCornerRadiusType((CornerRadiusType) value, diagnostics, context);
		case CpacsPackage.COST_AIR_CONDITIONING_SYSTEMS_TYPE:
			return validateCostAirConditioningSystemsType((CostAirConditioningSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_AUTOMATIC_FLIGHT_SYSTEMS_TYPE:
			return validateCostAutomaticFlightSystemsType((CostAutomaticFlightSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_AUXILARY_POWER_UNITS_TYPE:
			return validateCostAuxilaryPowerUnitsType((CostAuxilaryPowerUnitsType) value, diagnostics, context);
		case CpacsPackage.COST_BLEED_AIR_SYSTEMS_TYPE:
			return validateCostBleedAirSystemsType((CostBleedAirSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_COMMUNICATION_SYSTEMS_TYPE:
			return validateCostCommunicationSystemsType((CostCommunicationSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_COMPONENTS_TYPE:
			return validateCostComponentsType((CostComponentsType) value, diagnostics, context);
		case CpacsPackage.COST_DE_ICING_SYSTEMS_TYPE:
			return validateCostDeIcingSystemsType((CostDeIcingSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE:
			return validateCostElectricalSystemsType((CostElectricalSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_ENGINE_PYLONS_TYPE:
			return validateCostEnginePylonsType((CostEnginePylonsType) value, diagnostics, context);
		case CpacsPackage.COST_EQUIPPED_ENGINES_TYPE:
			return validateCostEquippedEnginesType((CostEquippedEnginesType) value, diagnostics, context);
		case CpacsPackage.COST_FIRE_PROTECTION_SYSTEMS_TYPE:
			return validateCostFireProtectionSystemsType((CostFireProtectionSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE:
			return validateCostFixedEmergencyOxygenSystemsType((CostFixedEmergencyOxygenSystemsType) value, diagnostics,
					context);
		case CpacsPackage.COST_FLIGHT_CONTROL_SYSTEMS_TYPE:
			return validateCostFlightControlSystemsType((CostFlightControlSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_FUEL_SYSTEMS_TYPE:
			return validateCostFuelSystemsType((CostFuelSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE:
			return validateCostFurnishingElementsType((CostFurnishingElementsType) value, diagnostics, context);
		case CpacsPackage.COST_FURNISHINGS_TYPE:
			return validateCostFurnishingsType((CostFurnishingsType) value, diagnostics, context);
		case CpacsPackage.COST_FUSELAGES_TYPE:
			return validateCostFuselagesType((CostFuselagesType) value, diagnostics, context);
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE:
			return validateCostHydraulicSystemsType((CostHydraulicSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE:
			return validateCostInstrumentSystemsType((CostInstrumentSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_LANDING_GEAR_TYPE:
			return validateCostLandingGearType((CostLandingGearType) value, diagnostics, context);
		case CpacsPackage.COST_LIGHTING_SYSTEMS_TYPE:
			return validateCostLightingSystemsType((CostLightingSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_NACELLES_TYPE:
			return validateCostNacellesType((CostNacellesType) value, diagnostics, context);
		case CpacsPackage.COST_NAVIGATION_SYSTEMS_TYPE:
			return validateCostNavigationSystemsType((CostNavigationSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_POWER_UNITS_TYPE:
			return validateCostPowerUnitsType((CostPowerUnitsType) value, diagnostics, context);
		case CpacsPackage.COST_SYSTEMS_TYPE:
			return validateCostSystemsType((CostSystemsType) value, diagnostics, context);
		case CpacsPackage.COST_WATER_INSTALLATION_SYSTEMS_TYPE:
			return validateCostWaterInstallationSystemsType((CostWaterInstallationSystemsType) value, diagnostics,
					context);
		case CpacsPackage.COST_WINGS_TYPE:
			return validateCostWingsType((CostWingsType) value, diagnostics, context);
		case CpacsPackage.CPACS_TYPE:
			return validateCpacsType((CpacsType) value, diagnostics, context);
		case CpacsPackage.CRASH_LOAD_CASES_TYPE:
			return validateCrashLoadCasesType((CrashLoadCasesType) value, diagnostics, context);
		case CpacsPackage.CRASH_LOADCASE_TYPE:
			return validateCrashLoadcaseType((CrashLoadcaseType) value, diagnostics, context);
		case CpacsPackage.CREW_COST_TYPE:
			return validateCrewCostType((CrewCostType) value, diagnostics, context);
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE:
			return validateCrossBeamAssemblyPositionType((CrossBeamAssemblyPositionType) value, diagnostics, context);
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE:
			return validateCrossBeamStrutAssemblyPositionType((CrossBeamStrutAssemblyPositionType) value, diagnostics,
					context);
		case CpacsPackage.CRUISE_ROLLERS_TYPE:
			return validateCruiseRollersType((CruiseRollersType) value, diagnostics, context);
		case CpacsPackage.CRUISE_ROLLER_TYPE:
			return validateCruiseRollerType((CruiseRollerType) value, diagnostics, context);
		case CpacsPackage.CST2_DTYPE:
			return validateCst2DType((Cst2DType) value, diagnostics, context);
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE:
			return validateCurveParamPointMapType((CurveParamPointMapType) value, diagnostics, context);
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE:
			return validateCurvePointListXYZType((CurvePointListXYZType) value, diagnostics, context);
		case CpacsPackage.CURVE_POINT_TYPE:
			return validateCurvePointType((CurvePointType) value, diagnostics, context);
		case CpacsPackage.CURVE_PROFILES_TYPE:
			return validateCurveProfilesType((CurveProfilesType) value, diagnostics, context);
		case CpacsPackage.CUT_LOAD_POINTS_TYPE:
			return validateCutLoadPointsType((CutLoadPointsType) value, diagnostics, context);
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE:
			return validateCutOutControlPointsType((CutOutControlPointsType) value, diagnostics, context);
		case CpacsPackage.CUT_OUT_CONTROL_POINT_TYPE:
			return validateCutOutControlPointType((CutOutControlPointType) value, diagnostics, context);
		case CpacsPackage.CUT_OUT_PROFILES_TYPE:
			return validateCutOutProfilesType((CutOutProfilesType) value, diagnostics, context);
		case CpacsPackage.CUT_OUT_PROFILE_TYPE:
			return validateCutOutProfileType((CutOutProfileType) value, diagnostics, context);
		case CpacsPackage.CUT_OUT_TYPE:
			return validateCutOutType((CutOutType) value, diagnostics, context);
		case CpacsPackage.CUTOUT_TYPE_TYPE:
			return validateCutoutTypeType((CutoutTypeType) value, diagnostics, context);
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_ARRAY_TYPE:
			return validateDampingDerivativesRatesArrayType((DampingDerivativesRatesArrayType) value, diagnostics,
					context);
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE:
			return validateDampingDerivativesRatesType((DampingDerivativesRatesType) value, diagnostics, context);
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE:
			return validateDampingDerivativesType((DampingDerivativesType) value, diagnostics, context);
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE:
			return validateDamTolBehaviourType((DamTolBehaviourType) value, diagnostics, context);
		case CpacsPackage.DAM_TOL_FORMAN_TYPE:
			return validateDamTolFormanType((DamTolFormanType) value, diagnostics, context);
		case CpacsPackage.DAM_TOL_WALKER_TYPE:
			return validateDamTolWalkerType((DamTolWalkerType) value, diagnostics, context);
		case CpacsPackage.DATE_BASE_TYPE:
			return validateDateBaseType((DateBaseType) value, diagnostics, context);
		case CpacsPackage.DATE_TIME_BASE_TYPE:
			return validateDateTimeBaseType((DateTimeBaseType) value, diagnostics, context);
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE:
			return validateDeckComponent2DBaseType((DeckComponent2DBaseType) value, diagnostics, context);
		case CpacsPackage.DECK_COMPONENT_BASE_TYPE:
			return validateDeckComponentBaseType((DeckComponentBaseType) value, diagnostics, context);
		case CpacsPackage.DECK_DOORS_TYPE:
			return validateDeckDoorsType((DeckDoorsType) value, diagnostics, context);
		case CpacsPackage.DECK_DOOR_TYPE:
			return validateDeckDoorType((DeckDoorType) value, diagnostics, context);
		case CpacsPackage.DECK_ELEMENT_BASE_TYPE:
			return validateDeckElementBaseType((DeckElementBaseType) value, diagnostics, context);
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE:
			return validateDeckElementGeometryType((DeckElementGeometryType) value, diagnostics, context);
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE:
			return validateDeckElementMassType((DeckElementMassType) value, diagnostics, context);
		case CpacsPackage.DECK_ELEMENTS_TYPE:
			return validateDeckElementsType((DeckElementsType) value, diagnostics, context);
		case CpacsPackage.DECK_STRUCTURAL_MOUNTS_TYPE:
			return validateDeckStructuralMountsType((DeckStructuralMountsType) value, diagnostics, context);
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE:
			return validateDeckStructuralMountType((DeckStructuralMountType) value, diagnostics, context);
		case CpacsPackage.DECKS_TYPE:
			return validateDecksType((DecksType) value, diagnostics, context);
		case CpacsPackage.DECK_TYPE:
			return validateDeckType((DeckType) value, diagnostics, context);
		case CpacsPackage.DECK_TYPE_TYPE:
			return validateDeckTypeType((DeckTypeType) value, diagnostics, context);
		case CpacsPackage.DELTA_TEMPERATURE_TYPE:
			return validateDeltaTemperatureType((DeltaTemperatureType) value, diagnostics, context);
		case CpacsPackage.DESIGN_MASSES_TYPE:
			return validateDesignMassesType((DesignMassesType) value, diagnostics, context);
		case CpacsPackage.DESIGN_PARAMETERS_TYPE:
			return validateDesignParametersType((DesignParametersType) value, diagnostics, context);
		case CpacsPackage.DESIGN_PARAMETER_TYPE:
			return validateDesignParameterType((DesignParameterType) value, diagnostics, context);
		case CpacsPackage.DESIGN_SPACE_TYPE:
			return validateDesignSpaceType((DesignSpaceType) value, diagnostics, context);
		case CpacsPackage.DESIGN_STUDIES_TYPE:
			return validateDesignStudiesType((DesignStudiesType) value, diagnostics, context);
		case CpacsPackage.DESIGN_VOLUME_TYPE:
			return validateDesignVolumeType((DesignVolumeType) value, diagnostics, context);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE:
			return validateDirectOperatingCostType((DirectOperatingCostType) value, diagnostics, context);
		case CpacsPackage.DIVERGENCE_CASES_TYPE:
			return validateDivergenceCasesType((DivergenceCasesType) value, diagnostics, context);
		case CpacsPackage.DIVERGENCE_CASE_TYPE:
			return validateDivergenceCaseType((DivergenceCaseType) value, diagnostics, context);
		case CpacsPackage.DOCUMENT_ROOT:
			return validateDocumentRoot((DocumentRoot) value, diagnostics, context);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE:
			return validateDoorAssemblyPositionType((DoorAssemblyPositionType) value, diagnostics, context);
		case CpacsPackage.DOOR_CUT_OUT_TYPE:
			return validateDoorCutOutType((DoorCutOutType) value, diagnostics, context);
		case CpacsPackage.DOOR_OPENING_LEGACY_TYPE:
			return validateDoorOpeningLegacyType((DoorOpeningLegacyType) value, diagnostics, context);
		case CpacsPackage.DOOR_OPENING_TYPE:
			return validateDoorOpeningType((DoorOpeningType) value, diagnostics, context);
		case CpacsPackage.DOORS_TYPE:
			return validateDoorsType((DoorsType) value, diagnostics, context);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE:
			return validateDoorSurroundStructurePositionType((DoorSurroundStructurePositionType) value, diagnostics,
					context);
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE:
			return validateDoorSurroundStructuresAssemblyType((DoorSurroundStructuresAssemblyType) value, diagnostics,
					context);
		case CpacsPackage.DOOR_TYPE_TYPE:
			return validateDoorTypeType((DoorTypeType) value, diagnostics, context);
		case CpacsPackage.DOOR_TYPE_TYPE1:
			return validateDoorTypeType1((DoorTypeType1) value, diagnostics, context);
		case CpacsPackage.DOUBLE_ARRAY_BASE_TYPE:
			return validateDoubleArrayBaseType((DoubleArrayBaseType) value, diagnostics, context);
		case CpacsPackage.DOUBLE_BASE_TYPE:
			return validateDoubleBaseType((DoubleBaseType) value, diagnostics, context);
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE:
			return validateDoubleConstraintBaseType((DoubleConstraintBaseType) value, diagnostics, context);
		case CpacsPackage.DOUBLE_VECTOR_BASE_TYPE:
			return validateDoubleVectorBaseType((DoubleVectorBaseType) value, diagnostics, context);
		case CpacsPackage.DOUBLE_VECTOR_CONSTRAINT_BASE_TYPE:
			return validateDoubleVectorConstraintBaseType((DoubleVectorConstraintBaseType) value, diagnostics, context);
		case CpacsPackage.DRAG_CONTRIBUTIONS_TYPE:
			return validateDragContributionsType((DragContributionsType) value, diagnostics, context);
		case CpacsPackage.DRIVE_SYSTEMS_TYPE:
			return validateDriveSystemsType((DriveSystemsType) value, diagnostics, context);
		case CpacsPackage.DRIVE_SYSTEM_TYPE:
			return validateDriveSystemType((DriveSystemType) value, diagnostics, context);
		case CpacsPackage.DURATION_TYPE:
			return validateDurationType((DurationType) value, diagnostics, context);
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE:
			return validateDynamicAircraftModelAnalysisType((DynamicAircraftModelAnalysisType) value, diagnostics,
					context);
		case CpacsPackage.EMISSIVITY_MAP_TYPE:
			return validateEmissivityMapType((EmissivityMapType) value, diagnostics, context);
		case CpacsPackage.END_TIME_UTC_TYPE:
			return validateEndTimeUTCType((EndTimeUTCType) value, diagnostics, context);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE:
			return validateEngineAnalysisType((EngineAnalysisType) value, diagnostics, context);
		case CpacsPackage.ENGINE_CONCEPT_TYPE:
			return validateEngineConceptType((EngineConceptType) value, diagnostics, context);
		case CpacsPackage.ENGINE_FAN_TYPE:
			return validateEngineFanType((EngineFanType) value, diagnostics, context);
		case CpacsPackage.ENGINE_GEOMETRY_TYPE:
			return validateEngineGeometryType((EngineGeometryType) value, diagnostics, context);
		case CpacsPackage.ENGINE_GLOBAL_TYPE:
			return validateEngineGlobalType((EngineGlobalType) value, diagnostics, context);
		case CpacsPackage.ENGINE_MOUNTS_TYPE:
			return validateEngineMountsType((EngineMountsType) value, diagnostics, context);
		case CpacsPackage.ENGINE_MOUNT_TYPE:
			return validateEngineMountType((EngineMountType) value, diagnostics, context);
		case CpacsPackage.ENGINE_NACELLE_TYPE:
			return validateEngineNacelleType((EngineNacelleType) value, diagnostics, context);
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE:
			return validateEnginePerformanceMapsType((EnginePerformanceMapsType) value, diagnostics, context);
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE:
			return validateEnginePerformanceMapType((EnginePerformanceMapType) value, diagnostics, context);
		case CpacsPackage.ENGINE_POSITIONS_TYPE:
			return validateEnginePositionsType((EnginePositionsType) value, diagnostics, context);
		case CpacsPackage.ENGINE_POSITION_TYPE:
			return validateEnginePositionType((EnginePositionType) value, diagnostics, context);
		case CpacsPackage.ENGINE_PYLONS_TYPE:
			return validateEnginePylonsType((EnginePylonsType) value, diagnostics, context);
		case CpacsPackage.ENGINE_PYLON_TYPE:
			return validateEnginePylonType((EnginePylonType) value, diagnostics, context);
		case CpacsPackage.ENGINE_SPINNER_TYPE:
			return validateEngineSpinnerType((EngineSpinnerType) value, diagnostics, context);
		case CpacsPackage.ENGINES_TYPE:
			return validateEnginesType((EnginesType) value, diagnostics, context);
		case CpacsPackage.ENGINE_TYPE:
			return validateEngineType((EngineType) value, diagnostics, context);
		case CpacsPackage.ENVIRONMENT_TYPE:
			return validateEnvironmentType((EnvironmentType) value, diagnostics, context);
		case CpacsPackage.ETA_ISO_LINE_TYPE:
			return validateEtaIsoLineType((EtaIsoLineType) value, diagnostics, context);
		case CpacsPackage.ETA_XSI_POINT_TYPE:
			return validateEtaXsiPointType((EtaXsiPointType) value, diagnostics, context);
		case CpacsPackage.ETA_XSI_REL_HEIGHT_POINT_TYPE:
			return validateEtaXsiRelHeightPointType((EtaXsiRelHeightPointType) value, diagnostics, context);
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE:
			return validateFatigueBehaviourType((FatigueBehaviourType) value, diagnostics, context);
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE:
			return validateFatigueStressBasedBrownMillerType((FatigueStressBasedBrownMillerType) value, diagnostics,
					context);
		case CpacsPackage.FLEET_TYPE:
			return validateFleetType((FleetType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE:
			return validateFlightAnalysisType((FlightAnalysisType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE:
			return validateFlightDynamicsAnalysisType((FlightDynamicsAnalysisType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE:
			return validateFlightDynamicsLinearModelType((FlightDynamicsLinearModelType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE:
			return validateFlightDynamicsTrimResultType((FlightDynamicsTrimResultType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE:
			return validateFlightEnvelopeSpeedType((FlightEnvelopeSpeedType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_ENVELOPES_TYPE:
			return validateFlightEnvelopesType((FlightEnvelopesType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_ENVELOPE_TYPE:
			return validateFlightEnvelopeType((FlightEnvelopeType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE:
			return validateFlightLoadCasesType((FlightLoadCasesType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_LOAD_CONDITIONS_TYPE:
			return validateFlightLoadConditionsType((FlightLoadConditionsType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_LOAD_DATA_TYPE:
			return validateFlightLoadDataType((FlightLoadDataType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PATH_ANGLE_TYPE:
			return validateFlightPathAngleType((FlightPathAngleType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PATH_TYPE:
			return validateFlightPathType((FlightPathType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE:
			return validateFlightPerformanceCasesType((FlightPerformanceCasesType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE:
			return validateFlightPerformanceCaseType((FlightPerformanceCaseType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE:
			return validateFlightPerformanceLandingType((FlightPerformanceLandingType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE:
			return validateFlightPerformanceLevelType((FlightPerformanceLevelType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE:
			return validateFlightPerformanceRequirementsType((FlightPerformanceRequirementsType) value, diagnostics,
					context);
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENT_TYPE:
			return validateFlightPerformanceRequirementType((FlightPerformanceRequirementType) value, diagnostics,
					context);
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE:
			return validateFlightPerformanceTakeoffType((FlightPerformanceTakeoffType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE:
			return validateFlightPerformanceTurnType((FlightPerformanceTurnType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_POINTS_TYPE:
			return validateFlightPointsType((FlightPointsType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_POINT_TYPE:
			return validateFlightPointType((FlightPointType) value, diagnostics, context);
		case CpacsPackage.FLIGHTS_TYPE:
			return validateFlightsType((FlightsType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE:
			return validateFlightSystemsType((FlightSystemsType) value, diagnostics, context);
		case CpacsPackage.FLIGHT_TYPE:
			return validateFlightType((FlightType) value, diagnostics, context);
		case CpacsPackage.FLOOR_PANELS_TYPE:
			return validateFloorPanelsType((FloorPanelsType) value, diagnostics, context);
		case CpacsPackage.FLOOR_PANEL_TYPE:
			return validateFloorPanelType((FloorPanelType) value, diagnostics, context);
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE:
			return validateFlyingQualitiesCasesType((FlyingQualitiesCasesType) value, diagnostics, context);
		case CpacsPackage.FLYING_QUALITIES_CASE_TYPE:
			return validateFlyingQualitiesCaseType((FlyingQualitiesCaseType) value, diagnostics, context);
		case CpacsPackage.FQ_CHAR_PARAMETERS_TYPE:
			return validateFqCharParametersType((FqCharParametersType) value, diagnostics, context);
		case CpacsPackage.FQ_EIGLAT_TYPE:
			return validateFqEiglatType((FqEiglatType) value, diagnostics, context);
		case CpacsPackage.FQ_LATERAL_TYPE:
			return validateFqLateralType((FqLateralType) value, diagnostics, context);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE:
			return validateFqLongitudinalType((FqLongitudinalType) value, diagnostics, context);
		case CpacsPackage.FQ_PHUGOID_TYPE:
			return validateFqPhugoidType((FqPhugoidType) value, diagnostics, context);
		case CpacsPackage.FQ_RATINGS_TYPE:
			return validateFqRatingsType((FqRatingsType) value, diagnostics, context);
		case CpacsPackage.FQ_ROLL_PERF_TYPE:
			return validateFqRollPerfType((FqRollPerfType) value, diagnostics, context);
		case CpacsPackage.FQ_ROLOSC_TYPE:
			return validateFqRoloscType((FqRoloscType) value, diagnostics, context);
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE:
			return validateFqShortPeriodType((FqShortPeriodType) value, diagnostics, context);
		case CpacsPackage.FQ_TREFF_TYPE:
			return validateFqTreffType((FqTreffType) value, diagnostics, context);
		case CpacsPackage.FRAMES_ASSEMBLY_TYPE:
			return validateFramesAssemblyType((FramesAssemblyType) value, diagnostics, context);
		case CpacsPackage.FRAME_TYPE:
			return validateFrameType((FrameType) value, diagnostics, context);
		case CpacsPackage.FREE_PATH_TYPE:
			return validateFreePathType((FreePathType) value, diagnostics, context);
		case CpacsPackage.FUEL_CONSUMED_TYPE:
			return validateFuelConsumedType((FuelConsumedType) value, diagnostics, context);
		case CpacsPackage.FUEL_FRACTION_TYPE:
			return validateFuelFractionType((FuelFractionType) value, diagnostics, context);
		case CpacsPackage.FUEL_IN_TANK_TYPE:
			return validateFuelInTankType((FuelInTankType) value, diagnostics, context);
		case CpacsPackage.FUEL_MASS_FRACTION_TYPE:
			return validateFuelMassFractionType((FuelMassFractionType) value, diagnostics, context);
		case CpacsPackage.FUEL_PLANNING_TYPE_TYPE:
			return validateFuelPlanningTypeType((FuelPlanningTypeType) value, diagnostics, context);
		case CpacsPackage.FUEL_REMAINING_TYPE:
			return validateFuelRemainingType((FuelRemainingType) value, diagnostics, context);
		case CpacsPackage.FUELS_TYPE:
			return validateFuelsType((FuelsType) value, diagnostics, context);
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE:
			return validateFuelTankVolumeType((FuelTankVolumeType) value, diagnostics, context);
		case CpacsPackage.FUEL_TYPE:
			return validateFuelType((FuelType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_AERO_PERFORMANCE_TYPE:
			return validateFuselageAeroPerformanceType((FuselageAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_CUT_OUTS_TYPE:
			return validateFuselageCutOutsType((FuselageCutOutsType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE:
			return validateFuselageCutOutType((FuselageCutOutType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_ELEMENTS_TYPE:
			return validateFuselageElementsType((FuselageElementsType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_ELEMENT_TYPE:
			return validateFuselageElementType((FuselageElementType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE:
			return validateFuselageFuelTanksType((FuselageFuelTanksType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_FUEL_TANK_TYPE:
			return validateFuselageFuelTankType((FuselageFuelTankType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_PROFILES_TYPE:
			return validateFuselageProfilesType((FuselageProfilesType) value, diagnostics, context);
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE:
			return validateFuselagesAeroPerformanceType((FuselagesAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_SECTIONS_TYPE:
			return validateFuselageSectionsType((FuselageSectionsType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_SECTION_TYPE:
			return validateFuselageSectionType((FuselageSectionType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_SEGMENTS_TYPE:
			return validateFuselageSegmentsType((FuselageSegmentsType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE:
			return validateFuselageSegmentType((FuselageSegmentType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE:
			return validateFuselageStructureType((FuselageStructureType) value, diagnostics, context);
		case CpacsPackage.FUSELAGES_TYPE:
			return validateFuselagesType((FuselagesType) value, diagnostics, context);
		case CpacsPackage.FUSELAGE_TYPE:
			return validateFuselageType((FuselageType) value, diagnostics, context);
		case CpacsPackage.GALLEY_ELEMENTS_TYPE:
			return validateGalleyElementsType((GalleyElementsType) value, diagnostics, context);
		case CpacsPackage.GALLEY_ELEMENT_TYPE:
			return validateGalleyElementType((GalleyElementType) value, diagnostics, context);
		case CpacsPackage.GALLEYS_TYPE:
			return validateGalleysType((GalleysType) value, diagnostics, context);
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE:
			return validateGearDeflectionVectorsType((GearDeflectionVectorsType) value, diagnostics, context);
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE:
			return validateGearDeflectionVectorType((GearDeflectionVectorType) value, diagnostics, context);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE:
			return validateGeneralStructuralMemberPositionType((GeneralStructuralMemberPositionType) value, diagnostics,
					context);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE:
			return validateGeneralStructuralMembersAssemblyType((GeneralStructuralMembersAssemblyType) value,
					diagnostics, context);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE:
			return validateGeneralStructuralMemberType((GeneralStructuralMemberType) value, diagnostics, context);
		case CpacsPackage.GENERIC_COST_TYPE:
			return validateGenericCostType((GenericCostType) value, diagnostics, context);
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE:
			return validateGenericFloorElementsType((GenericFloorElementsType) value, diagnostics, context);
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE:
			return validateGenericFloorModulesType((GenericFloorModulesType) value, diagnostics, context);
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE:
			return validateGenericGeometricComponentType((GenericGeometricComponentType) value, diagnostics, context);
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE:
			return validateGenericGeometryComponentsType((GenericGeometryComponentsType) value, diagnostics, context);
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENT_TYPE:
			return validateGenericGeometryComponentType((GenericGeometryComponentType) value, diagnostics, context);
		case CpacsPackage.GENERIC_MASS_TYPE:
			return validateGenericMassType((GenericMassType) value, diagnostics, context);
		case CpacsPackage.GENERIC_SYSTEMS_TYPE:
			return validateGenericSystemsType((GenericSystemsType) value, diagnostics, context);
		case CpacsPackage.GENERIC_SYSTEM_TYPE:
			return validateGenericSystemType((GenericSystemType) value, diagnostics, context);
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE:
			return validateGeographicPointConstraintType((GeographicPointConstraintType) value, diagnostics, context);
		case CpacsPackage.GEOGRAPHIC_POINT_TYPE:
			return validateGeographicPointType((GeographicPointType) value, diagnostics, context);
		case CpacsPackage.GLOBAL_AERO_PERFORMANCE_TYPE:
			return validateGlobalAeroPerformanceType((GlobalAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE:
			return validateGlobalBeamPropertiesType((GlobalBeamPropertiesType) value, diagnostics, context);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE:
			return validateGlobalFlightPointType((GlobalFlightPointType) value, diagnostics, context);
		case CpacsPackage.GLOBAL_PERFORMANCE_CASES_TYPE:
			return validateGlobalPerformanceCasesType((GlobalPerformanceCasesType) value, diagnostics, context);
		case CpacsPackage.GROUND_LOAD_CASES_TYPE:
			return validateGroundLoadCasesType((GroundLoadCasesType) value, diagnostics, context);
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE:
			return validateGuideCurveProfileGeometryType((GuideCurveProfileGeometryType) value, diagnostics, context);
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE:
			return validateGuideCurveProfilesType((GuideCurveProfilesType) value, diagnostics, context);
		case CpacsPackage.GUIDE_CURVES_TYPE:
			return validateGuideCurvesType((GuideCurvesType) value, diagnostics, context);
		case CpacsPackage.GUIDE_CURVE_TYPE:
			return validateGuideCurveType((GuideCurveType) value, diagnostics, context);
		case CpacsPackage.GUST_SHAPE_TYPE:
			return validateGustShapeType((GustShapeType) value, diagnostics, context);
		case CpacsPackage.HEADER_TYPE:
			return validateHeaderType((HeaderType) value, diagnostics, context);
		case CpacsPackage.HEADING_TYPE:
			return validateHeadingType((HeadingType) value, diagnostics, context);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE:
			return validateHingeMomentsMapType((HingeMomentsMapType) value, diagnostics, context);
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE:
			return validateHtpFwdInterfaceDefType((HtpFwdInterfaceDefType) value, diagnostics, context);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE:
			return validateHtpInterfaceDefType((HtpInterfaceDefType) value, diagnostics, context);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE:
			return validateHtpStructElemDefType((HtpStructElemDefType) value, diagnostics, context);
		case CpacsPackage.IMPACT_SURFACE_DEFINITION_TYPE:
			return validateImpactSurfaceDefinitionType((ImpactSurfaceDefinitionType) value, diagnostics, context);
		case CpacsPackage.INDIRECT_OPERATING_COST_TYPE:
			return validateIndirectOperatingCostType((IndirectOperatingCostType) value, diagnostics, context);
		case CpacsPackage.INTEGER_BASE_TYPE:
			return validateIntegerBaseType((IntegerBaseType) value, diagnostics, context);
		case CpacsPackage.INTER_CONNECTION_STRUT_ATTACHMENT_TYPE:
			return validateInterConnectionStrutAttachmentType((InterConnectionStrutAttachmentType) value, diagnostics,
					context);
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE:
			return validateInterconnectionStrutsType((InterconnectionStrutsType) value, diagnostics, context);
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE:
			return validateInterconnectionStrutType((InterconnectionStrutType) value, diagnostics, context);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE:
			return validateIntercostalPositionType((IntercostalPositionType) value, diagnostics, context);
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE:
			return validateIntercostalsAssemblyType((IntercostalsAssemblyType) value, diagnostics, context);
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE:
			return validateInterfaceDefinitionsType((InterfaceDefinitionsType) value, diagnostics, context);
		case CpacsPackage.INTERNAL_PRESSURES_TYPE:
			return validateInternalPressuresType((InternalPressuresType) value, diagnostics, context);
		case CpacsPackage.INTERNAL_PRESSURE_TYPE:
			return validateInternalPressureType((InternalPressureType) value, diagnostics, context);
		case CpacsPackage.INTERPOLATION_TYPE:
			return validateInterpolationType((InterpolationType) value, diagnostics, context);
		case CpacsPackage.INTERPOLATION_TYPE1:
			return validateInterpolationType1((InterpolationType1) value, diagnostics, context);
		case CpacsPackage.INTERPOLATION_TYPE2:
			return validateInterpolationType2((InterpolationType2) value, diagnostics, context);
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE:
			return validateIsotropicPropertiesType((IsotropicPropertiesType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_BASE_TYPE:
			return validateLandingGearBaseType((LandingGearBaseType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE:
			return validateLandingGearBrakingStateType((LandingGearBrakingStateType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_COMPONENT_ASSEMBLY_TYPE:
			return validateLandingGearComponentAssemblyType((LandingGearComponentAssemblyType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE:
			return validateLandingGearControlFunctionsType((LandingGearControlFunctionsType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_CONTROL_TYPE:
			return validateLandingGearControlType((LandingGearControlType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_EXTENSION_FUNCTION_STEP_TYPE:
			return validateLandingGearExtensionFunctionStepType((LandingGearExtensionFunctionStepType) value,
					diagnostics, context);
		case CpacsPackage.LANDING_GEAR_EXTENSION_FUNCTION_TYPE:
			return validateLandingGearExtensionFunctionType((LandingGearExtensionFunctionType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE:
			return validateLandingGearInterfaceDefinitionsType((LandingGearInterfaceDefinitionsType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_KEELBEAM_TYPE:
			return validateLandingGearInterfaceKeelbeamType((LandingGearInterfaceKeelbeamType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_LATERAL_PANELS_TYPE:
			return validateLandingGearInterfaceLateralPanelsType((LandingGearInterfaceLateralPanelsType) value,
					diagnostics, context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION_TYPE:
			return validateLandingGearInterfaceLongFloorBeamsConnectionType(
					(LandingGearInterfaceLongFloorBeamsConnectionType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE:
			return validateLandingGearInterfaceMainFramesType((LandingGearInterfaceMainFramesType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_PRESSURE_FLOOR_TYPE:
			return validateLandingGearInterfacePressureFloorType((LandingGearInterfacePressureFloorType) value,
					diagnostics, context);
		case CpacsPackage.LANDING_GEAR_INTERFACE_SIDEBOX_TYPE:
			return validateLandingGearInterfaceSideboxType((LandingGearInterfaceSideboxType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE:
			return validateLandingGearPositionSafetyMarginsType((LandingGearPositionSafetyMarginsType) value,
					diagnostics, context);
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE:
			return validateLandingGearSteeringFunctionStepType((LandingGearSteeringFunctionStepType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_TYPE:
			return validateLandingGearSteeringFunctionType((LandingGearSteeringFunctionType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_STRUT_ATTACHMENT_TYPE:
			return validateLandingGearStrutAttachmentType((LandingGearStrutAttachmentType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEARS_TYPE:
			return validateLandingGearsType((LandingGearsType) value, diagnostics, context);
		case CpacsPackage.LANDING_GEAR_SUPPORT_BEAM_POSITION_TYPE:
			return validateLandingGearSupportBeamPositionType((LandingGearSupportBeamPositionType) value, diagnostics,
					context);
		case CpacsPackage.LANDING_GEAR_TYPE:
			return validateLandingGearType((LandingGearType) value, diagnostics, context);
		case CpacsPackage.LATERAL_CAP_TYPE:
			return validateLateralCapType((LateralCapType) value, diagnostics, context);
		case CpacsPackage.LATITUDE_TYPE:
			return validateLatitudeType((LatitudeType) value, diagnostics, context);
		case CpacsPackage.LAVATORIES_TYPE:
			return validateLavatoriesType((LavatoriesType) value, diagnostics, context);
		case CpacsPackage.LAVATORY_ELEMENTS_TYPE:
			return validateLavatoryElementsType((LavatoryElementsType) value, diagnostics, context);
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE:
			return validateLeadingEdgeDevicesType((LeadingEdgeDevicesType) value, diagnostics, context);
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE:
			return validateLeadingEdgeDeviceType((LeadingEdgeDeviceType) value, diagnostics, context);
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE:
			return validateLeadingEdgeHollowType((LeadingEdgeHollowType) value, diagnostics, context);
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE:
			return validateLeadingEdgeShapeType((LeadingEdgeShapeType) value, diagnostics, context);
		case CpacsPackage.LINER_TYPE:
			return validateLinerType((LinerType) value, diagnostics, context);
		case CpacsPackage.LINK_TO_FILE_TYPE:
			return validateLinkToFileType((LinkToFileType) value, diagnostics, context);
		case CpacsPackage.LOAD_ANALYSIS_TYPE:
			return validateLoadAnalysisType((LoadAnalysisType) value, diagnostics, context);
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE:
			return validateLoadApplicationPointSetsType((LoadApplicationPointSetsType) value, diagnostics, context);
		case CpacsPackage.LOAD_APPLICATION_POINT_SET_TYPE:
			return validateLoadApplicationPointSetType((LoadApplicationPointSetType) value, diagnostics, context);
		case CpacsPackage.LOAD_APPLICATION_POINTS_TYPE:
			return validateLoadApplicationPointsType((LoadApplicationPointsType) value, diagnostics, context);
		case CpacsPackage.LOAD_BREAKDOWN_TYPE:
			return validateLoadBreakdownType((LoadBreakdownType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE:
			return validateLoadCaseAccelerationsType((LoadCaseAccelerationsType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_GUST_TYPE:
			return validateLoadCaseGustType((LoadCaseGustType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_LOAD_FACTORS_TYPE:
			return validateLoadCaseLoadFactorsType((LoadCaseLoadFactorsType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_SPECIFICATION_TYPE:
			return validateLoadCaseSpecificationType((LoadCaseSpecificationType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASES_TYPE:
			return validateLoadCasesType((LoadCasesType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE:
			return validateLoadCaseSuperpositionType((LoadCaseSuperpositionType) value, diagnostics, context);
		case CpacsPackage.LOAD_CASE_TYPE:
			return validateLoadCaseType((LoadCaseType) value, diagnostics, context);
		case CpacsPackage.LOAD_ENVELOPES_TYPE:
			return validateLoadEnvelopesType((LoadEnvelopesType) value, diagnostics, context);
		case CpacsPackage.LOAD_ENVELOPE_TYPE:
			return validateLoadEnvelopeType((LoadEnvelopeType) value, diagnostics, context);
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE:
			return validateLoadReferenceLineType((LoadReferenceLineType) value, diagnostics, context);
		case CpacsPackage.LOAD_REFERENCE_POINT_TYPE:
			return validateLoadReferencePointType((LoadReferencePointType) value, diagnostics, context);
		case CpacsPackage.LOAD_SETS_TYPE:
			return validateLoadSetsType((LoadSetsType) value, diagnostics, context);
		case CpacsPackage.LOAD_SET_TYPE:
			return validateLoadSetType((LoadSetType) value, diagnostics, context);
		case CpacsPackage.LOG_ENTRY_TYPE:
			return validateLogEntryType((LogEntryType) value, diagnostics, context);
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE:
			return validateLongFloorBeamPositionType((LongFloorBeamPositionType) value, diagnostics, context);
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE:
			return validateLongFloorBeamsAssemblyType((LongFloorBeamsAssemblyType) value, diagnostics, context);
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE:
			return validateLongFloorBeamType((LongFloorBeamType) value, diagnostics, context);
		case CpacsPackage.LONGITUDE_TYPE:
			return validateLongitudeType((LongitudeType) value, diagnostics, context);
		case CpacsPackage.LOWER_HEIGHT_FRACTION_TYPE:
			return validateLowerHeightFractionType((LowerHeightFractionType) value, diagnostics, context);
		case CpacsPackage.LUGGAGE_COMPARTMENT_ELEMENTS_TYPE:
			return validateLuggageCompartmentElementsType((LuggageCompartmentElementsType) value, diagnostics, context);
		case CpacsPackage.LUGGAGE_COMPARTMENTS_TYPE:
			return validateLuggageCompartmentsType((LuggageCompartmentsType) value, diagnostics, context);
		case CpacsPackage.MACH_NUMBER_TYPE:
			return validateMachNumberType((MachNumberType) value, diagnostics, context);
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE:
			return validateMAdditionalCenterTanksType((MAdditionalCenterTanksType) value, diagnostics, context);
		case CpacsPackage.MAIN_ACTUATOR_TYPE:
			return validateMainActuatorType((MainActuatorType) value, diagnostics, context);
		case CpacsPackage.MAIN_GEARS_TYPE:
			return validateMainGearsType((MainGearsType) value, diagnostics, context);
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE:
			return validateMainStrutInterfaceDefinitionsType((MainStrutInterfaceDefinitionsType) value, diagnostics,
					context);
		case CpacsPackage.MAIN_STRUT_WING_FUSELAGE_ATTACHMENT_TYPE:
			return validateMainStrutWingFuselageAttachmentType((MainStrutWingFuselageAttachmentType) value, diagnostics,
					context);
		case CpacsPackage.MAINTENANCE_COST_TYPE:
			return validateMaintenanceCostType((MaintenanceCostType) value, diagnostics, context);
		case CpacsPackage.MAIR_CONDITIONING_TYPE:
			return validateMAirConditioningType((MAirConditioningType) value, diagnostics, context);
		case CpacsPackage.MASS_BREAKDOWN_TYPE:
			return validateMassBreakdownType((MassBreakdownType) value, diagnostics, context);
		case CpacsPackage.MASS_FRACTION_TYPE:
			return validateMassFractionType((MassFractionType) value, diagnostics, context);
		case CpacsPackage.MASS_INERTIA_TYPE:
			return validateMassInertiaType((MassInertiaType) value, diagnostics, context);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE:
			return validateMassInertiaVectorType((MassInertiaVectorType) value, diagnostics, context);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE:
			return validateMaterialDefinitionForProfileBasedPointType(
					(MaterialDefinitionForProfileBasedPointType) value, diagnostics, context);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE:
			return validateMaterialDefinitionForProfileBasedType((MaterialDefinitionForProfileBasedType) value,
					diagnostics, context);
		case CpacsPackage.MATERIAL_DEFINITION_TYPE:
			return validateMaterialDefinitionType((MaterialDefinitionType) value, diagnostics, context);
		case CpacsPackage.MATERIALS_TYPE:
			return validateMaterialsType((MaterialsType) value, diagnostics, context);
		case CpacsPackage.MATERIAL_TYPE:
			return validateMaterialType((MaterialType) value, diagnostics, context);
		case CpacsPackage.MAUTOMATIC_FLIGHT_SYSTEM_TYPE:
			return validateMAutomaticFlightSystemType((MAutomaticFlightSystemType) value, diagnostics, context);
		case CpacsPackage.MAUXILLARY_POWER_UNIT_TYPE:
			return validateMAuxillaryPowerUnitType((MAuxillaryPowerUnitType) value, diagnostics, context);
		case CpacsPackage.MBELLY_FAIRINGS_TYPE:
			return validateMBellyFairingsType((MBellyFairingsType) value, diagnostics, context);
		case CpacsPackage.MBLEED_AIR_SYSTEM_TYPE:
			return validateMBleedAirSystemType((MBleedAirSystemType) value, diagnostics, context);
		case CpacsPackage.MBULK_CARGOS_TYPE:
			return validateMBulkCargosType((MBulkCargosType) value, diagnostics, context);
		case CpacsPackage.MBULK_CARGO_TYPE:
			return validateMBulkCargoType((MBulkCargoType) value, diagnostics, context);
		case CpacsPackage.MBULKHEADS_TYPE:
			return validateMBulkheadsType((MBulkheadsType) value, diagnostics, context);
		case CpacsPackage.MCABIN_FLOORS_TYPE:
			return validateMCabinFloorsType((MCabinFloorsType) value, diagnostics, context);
		case CpacsPackage.MCABIN_LIGHTINGS_TYPE:
			return validateMCabinLightingsType((MCabinLightingsType) value, diagnostics, context);
		case CpacsPackage.MCARGO_FLOORS_TYPE:
			return validateMCargoFloorsType((MCargoFloorsType) value, diagnostics, context);
		case CpacsPackage.MCARGO_LININGS_TYPE:
			return validateMCargoLiningsType((MCargoLiningsType) value, diagnostics, context);
		case CpacsPackage.MCARGO_LOADINGS_TYPE:
			return validateMCargoLoadingsType((MCargoLoadingsType) value, diagnostics, context);
		case CpacsPackage.MCARGO_TYPE:
			return validateMCargoType((MCargoType) value, diagnostics, context);
		case CpacsPackage.MCARRIAGES_TYPE:
			return validateMCarriagesType((MCarriagesType) value, diagnostics, context);
		case CpacsPackage.MCARRY_ONS_TYPE:
			return validateMCarryOnsType((MCarryOnsType) value, diagnostics, context);
		case CpacsPackage.MCARRY_ON_TYPE:
			return validateMCarryOnType((MCarryOnType) value, diagnostics, context);
		case CpacsPackage.MCATERINGS_TYPE:
			return validateMCateringsType((MCateringsType) value, diagnostics, context);
		case CpacsPackage.MCELLS_TYPE:
			return validateMCellsType((MCellsType) value, diagnostics, context);
		case CpacsPackage.MCOCKPIT_LIGHTINGS_TYPE:
			return validateMCockpitLightingsType((MCockpitLightingsType) value, diagnostics, context);
		case CpacsPackage.MCOMMUNICATION_TYPE:
			return validateMCommunicationType((MCommunicationType) value, diagnostics, context);
		case CpacsPackage.MCOMPONENT_SEGMENTS_TYPE:
			return validateMComponentSegmentsType((MComponentSegmentsType) value, diagnostics, context);
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE:
			return validateMComponentSegmentType((MComponentSegmentType) value, diagnostics, context);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE:
			return validateMControlSurfaceSupportsType((MControlSurfaceSupportsType) value, diagnostics, context);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE:
			return validateMControlSurfaceSupportType((MControlSurfaceSupportType) value, diagnostics, context);
		case CpacsPackage.MCREW_MEMBERS_TYPE:
			return validateMCrewMembersType((MCrewMembersType) value, diagnostics, context);
		case CpacsPackage.MCREW_SEATS_TYPE:
			return validateMCrewSeatsType((MCrewSeatsType) value, diagnostics, context);
		case CpacsPackage.MDE_ICING_TYPE:
			return validateMDeIcingType((MDeIcingType) value, diagnostics, context);
		case CpacsPackage.MDOCUMENTS_TOOLS_TYPE:
			return validateMDocumentsToolsType((MDocumentsToolsType) value, diagnostics, context);
		case CpacsPackage.MDOORS_TYPE:
			return validateMDoorsType((MDoorsType) value, diagnostics, context);
		case CpacsPackage.MELECTRICAL_DISTRIBUTION_TYPE:
			return validateMElectricalDistributionType((MElectricalDistributionType) value, diagnostics, context);
		case CpacsPackage.MELECTRICAL_GENERATION_TYPE:
			return validateMElectricalGenerationType((MElectricalGenerationType) value, diagnostics, context);
		case CpacsPackage.MEMERGENCY_EQUIPMENTS_TYPE:
			return validateMEmergencyEquipmentsType((MEmergencyEquipmentsType) value, diagnostics, context);
		case CpacsPackage.MEMERGENCY_OXYGEN_SYSTEMS_TYPE:
			return validateMEmergencyOxygenSystemsType((MEmergencyOxygenSystemsType) value, diagnostics, context);
		case CpacsPackage.MEMPTY_UL_DS_TYPE:
			return validateMEmptyULDsType((MEmptyULDsType) value, diagnostics, context);
		case CpacsPackage.MEMPTY_ULD_TYPE:
			return validateMEmptyULDType((MEmptyULDType) value, diagnostics, context);
		case CpacsPackage.MENGINE_APU_OILS_TYPE:
			return validateMEngineAPUOilsType((MEngineAPUOilsType) value, diagnostics, context);
		case CpacsPackage.MENGINE_CONTROL_TYPE:
			return validateMEngineControlType((MEngineControlType) value, diagnostics, context);
		case CpacsPackage.MEQUIPPED_ENGINES_TYPE:
			return validateMEquippedEnginesType((MEquippedEnginesType) value, diagnostics, context);
		case CpacsPackage.MEXT_LIGHTINGS_TYPE:
			return validateMExtLightingsType((MExtLightingsType) value, diagnostics, context);
		case CpacsPackage.MFIRE_PROTECTION_TYPE:
			return validateMFireProtectionType((MFireProtectionType) value, diagnostics, context);
		case CpacsPackage.MFIXED_GALLEYS_TYPE:
			return validateMFixedGalleysType((MFixedGalleysType) value, diagnostics, context);
		case CpacsPackage.MFIXED_LEADING_EDGES_TYPE:
			return validateMFixedLeadingEdgesType((MFixedLeadingEdgesType) value, diagnostics, context);
		case CpacsPackage.MFIXED_LEADING_EDGE_TYPE:
			return validateMFixedLeadingEdgeType((MFixedLeadingEdgeType) value, diagnostics, context);
		case CpacsPackage.MFIXED_TRAILING_EDGES_TYPE:
			return validateMFixedTrailingEdgesType((MFixedTrailingEdgesType) value, diagnostics, context);
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE:
			return validateMFixedTrailingEdgeType((MFixedTrailingEdgeType) value, diagnostics, context);
		case CpacsPackage.MFLIGHT_CONTROLS_TYPE:
			return validateMFlightControlsType((MFlightControlsType) value, diagnostics, context);
		case CpacsPackage.MFLOOR_COVERINGS_TYPE:
			return validateMFloorCoveringsType((MFloorCoveringsType) value, diagnostics, context);
		case CpacsPackage.MFRAMES_TYPE:
			return validateMFramesType((MFramesType) value, diagnostics, context);
		case CpacsPackage.MFRESH_WATER_SYSTEMS_TYPE:
			return validateMFreshWaterSystemsType((MFreshWaterSystemsType) value, diagnostics, context);
		case CpacsPackage.MFUEL_SYSTEM_TYPE:
			return validateMFuelSystemType((MFuelSystemType) value, diagnostics, context);
		case CpacsPackage.MFUEL_TYPE:
			return validateMFuelType((MFuelType) value, diagnostics, context);
		case CpacsPackage.MFURNISHING_TYPE:
			return validateMFurnishingType((MFurnishingType) value, diagnostics, context);
		case CpacsPackage.MFUSELAGES_STRUCTURE_TYPE:
			return validateMFuselagesStructureType((MFuselagesStructureType) value, diagnostics, context);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE:
			return validateMFuselageStructureType((MFuselageStructureType) value, diagnostics, context);
		case CpacsPackage.MHYDRAULIC_DISTRIBUTION_TYPE:
			return validateMHydraulicDistributionType((MHydraulicDistributionType) value, diagnostics, context);
		case CpacsPackage.MHYDRAULIC_GENERATION_TYPE:
			return validateMHydraulicGenerationType((MHydraulicGenerationType) value, diagnostics, context);
		case CpacsPackage.MIFE_SYSTEMS_TYPE:
			return validateMIFESystemsType((MIFESystemsType) value, diagnostics, context);
		case CpacsPackage.MINSTRUMENT_PANEL_TYPE:
			return validateMInstrumentPanelType((MInstrumentPanelType) value, diagnostics, context);
		case CpacsPackage.MINSULATIONS_TYPE:
			return validateMInsulationsType((MInsulationsType) value, diagnostics, context);
		case CpacsPackage.MINTEGRATED_MODULAR_AVIONICS_TYPE:
			return validateMIntegratedModularAvionicsType((MIntegratedModularAvionicsType) value, diagnostics, context);
		case CpacsPackage.MINTER_GAS_SYSTEM_TYPE:
			return validateMInterGasSystemType((MInterGasSystemType) value, diagnostics, context);
		case CpacsPackage.MISSION_DEFINITIONS_TYPE:
			return validateMissionDefinitionsType((MissionDefinitionsType) value, diagnostics, context);
		case CpacsPackage.MISSION_END_RUNWAY_TYPE:
			return validateMissionEndRunwayType((MissionEndRunwayType) value, diagnostics, context);
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE:
			return validateMissionPerformanceMapDefinitionType((MissionPerformanceMapDefinitionType) value, diagnostics,
					context);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE:
			return validateMissionSegmentBlockConstraintsType((MissionSegmentBlockConstraintsType) value, diagnostics,
					context);
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE:
			return validateMissionSegmentBlocksType((MissionSegmentBlocksType) value, diagnostics, context);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE:
			return validateMissionSegmentBlockType((MissionSegmentBlockType) value, diagnostics, context);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE:
			return validateMissionSegmentEndConditionType((MissionSegmentEndConditionType) value, diagnostics, context);
		case CpacsPackage.MISSION_SEGMENTS_TYPE:
			return validateMissionSegmentsType((MissionSegmentsType) value, diagnostics, context);
		case CpacsPackage.MISSION_SEGMENT_TYPE:
			return validateMissionSegmentType((MissionSegmentType) value, diagnostics, context);
		case CpacsPackage.MISSION_START_CONDITION_TYPE:
			return validateMissionStartConditionType((MissionStartConditionType) value, diagnostics, context);
		case CpacsPackage.MISSION_START_RUNWAY_TYPE:
			return validateMissionStartRunwayType((MissionStartRunwayType) value, diagnostics, context);
		case CpacsPackage.MISSIONS_TYPE:
			return validateMissionsType((MissionsType) value, diagnostics, context);
		case CpacsPackage.MISSION_TYPE:
			return validateMissionType((MissionType) value, diagnostics, context);
		case CpacsPackage.MLANDING_GEARS_TYPE:
			return validateMLandingGearsType((MLandingGearsType) value, diagnostics, context);
		case CpacsPackage.MLANDING_GEAR_SUPPORTS_TYPE:
			return validateMLandingGearSupportsType((MLandingGearSupportsType) value, diagnostics, context);
		case CpacsPackage.MLAVATORIES_TYPE:
			return validateMLavatoriesType((MLavatoriesType) value, diagnostics, context);
		case CpacsPackage.MLININGS_TYPE:
			return validateMLiningsType((MLiningsType) value, diagnostics, context);
		case CpacsPackage.MMAIN_GEARS_TYPE:
			return validateMMainGearsType((MMainGearsType) value, diagnostics, context);
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE:
			return validateMManufacturerEmptyType((MManufacturerEmptyType) value, diagnostics, context);
		case CpacsPackage.MMILLITARY_SYSTEMS_TYPE:
			return validateMMillitarySystemsType((MMillitarySystemsType) value, diagnostics, context);
		case CpacsPackage.MMOVEABLE_LEADING_EDGES_TYPE:
			return validateMMoveableLeadingEdgesType((MMoveableLeadingEdgesType) value, diagnostics, context);
		case CpacsPackage.MMOVEABLE_LEADING_EDGE_TYPE:
			return validateMMoveableLeadingEdgeType((MMoveableLeadingEdgeType) value, diagnostics, context);
		case CpacsPackage.MMOVEABLES_TYPE:
			return validateMMoveablesType((MMoveablesType) value, diagnostics, context);
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE:
			return validateMMoveableTrailingEdgeType((MMoveableTrailingEdgeType) value, diagnostics, context);
		case CpacsPackage.MNAVIGATION_TYPE:
			return validateMNavigationType((MNavigationType) value, diagnostics, context);
		case CpacsPackage.MNOSE_GEARS_TYPE:
			return validateMNoseGearsType((MNoseGearsType) value, diagnostics, context);
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE:
			return validateMonetaryValuesAnalysisType((MonetaryValuesAnalysisType) value, diagnostics, context);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE:
			return validateMOperatorItemsType((MOperatorItemsType) value, diagnostics, context);
		case CpacsPackage.MOVERHEAD_BINS_TYPE:
			return validateMOverheadBinsType((MOverheadBinsType) value, diagnostics, context);
		case CpacsPackage.MPART_STOW_DOORS_TYPE:
			return validateMPartStowDoorsType((MPartStowDoorsType) value, diagnostics, context);
		case CpacsPackage.MPASSENGERS_TYPE:
			return validateMPassengersType((MPassengersType) value, diagnostics, context);
		case CpacsPackage.MPASSENGER_TYPE:
			return validateMPassengerType((MPassengerType) value, diagnostics, context);
		case CpacsPackage.MPAX_TYPE:
			return validateMPaxType((MPaxType) value, diagnostics, context);
		case CpacsPackage.MPAYLOAD_TYPE:
			return validateMPayloadType((MPayloadType) value, diagnostics, context);
		case CpacsPackage.MPOWER_UNITS_TYPE:
			return validateMPowerUnitsType((MPowerUnitsType) value, diagnostics, context);
		case CpacsPackage.MPYLON_ATTACHMENTS_TYPE:
			return validateMPylonAttachmentsType((MPylonAttachmentsType) value, diagnostics, context);
		case CpacsPackage.MPYLONS_TYPE:
			return validateMPylonsType((MPylonsType) value, diagnostics, context);
		case CpacsPackage.MREMOVABLE_CREW_RESTS_TYPE:
			return validateMRemovableCrewRestsType((MRemovableCrewRestsType) value, diagnostics, context);
		case CpacsPackage.MRIBS_TYPE:
			return validateMRibsType((MRibsType) value, diagnostics, context);
		case CpacsPackage.MRIB_TYPE:
			return validateMRibType((MRibType) value, diagnostics, context);
		case CpacsPackage.MSEATS_TYPE:
			return validateMSeatsType((MSeatsType) value, diagnostics, context);
		case CpacsPackage.MSHELLS_TYPE:
			return validateMShellsType((MShellsType) value, diagnostics, context);
		case CpacsPackage.MSHELL_TYPE:
			return validateMShellType((MShellType) value, diagnostics, context);
		case CpacsPackage.MSKIN_PANELS_TYPE:
			return validateMSkinPanelsType((MSkinPanelsType) value, diagnostics, context);
		case CpacsPackage.MSKINS_TYPE:
			return validateMSkinsType((MSkinsType) value, diagnostics, context);
		case CpacsPackage.MSPAR_CELLS_TYPE:
			return validateMSparCellsType((MSparCellsType) value, diagnostics, context);
		case CpacsPackage.MSPAR_SKINS_TYPE:
			return validateMSparSkinsType((MSparSkinsType) value, diagnostics, context);
		case CpacsPackage.MSPARS_TYPE:
			return validateMSparsType((MSparsType) value, diagnostics, context);
		case CpacsPackage.MSPAR_TYPE:
			return validateMSparType((MSparType) value, diagnostics, context);
		case CpacsPackage.MSPECIAL_STRUCTURES_TYPE:
			return validateMSpecialStructuresType((MSpecialStructuresType) value, diagnostics, context);
		case CpacsPackage.MSPOILERS_TYPE:
			return validateMSpoilersType((MSpoilersType) value, diagnostics, context);
		case CpacsPackage.MSTRINGERS_TYPE:
			return validateMStringersType((MStringersType) value, diagnostics, context);
		case CpacsPackage.MSTRUCTURE_TYPE:
			return validateMStructureType((MStructureType) value, diagnostics, context);
		case CpacsPackage.MSYSTEMS_TYPE:
			return validateMSystemsType((MSystemsType) value, diagnostics, context);
		case CpacsPackage.MTOILET_FLUIDS_TYPE:
			return validateMToiletFluidsType((MToiletFluidsType) value, diagnostics, context);
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE:
			return validateMTrailingEdgeDevicesType((MTrailingEdgeDevicesType) value, diagnostics, context);
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE:
			return validateMTrailingEdgeDeviceType((MTrailingEdgeDeviceType) value, diagnostics, context);
		case CpacsPackage.MULD_CONTENTS_TYPE:
			return validateMULDContentsType((MULDContentsType) value, diagnostics, context);
		case CpacsPackage.MULD_CONTENT_TYPE:
			return validateMULDContentType((MULDContentType) value, diagnostics, context);
		case CpacsPackage.MUNUSABLE_FUELS_TYPE:
			return validateMUnusableFuelsType((MUnusableFuelsType) value, diagnostics, context);
		case CpacsPackage.MVACUUM_WASTE_SYSTEMS_TYPE:
			return validateMVacuumWasteSystemsType((MVacuumWasteSystemsType) value, diagnostics, context);
		case CpacsPackage.MWALLS_TYPE:
			return validateMWallsType((MWallsType) value, diagnostics, context);
		case CpacsPackage.MWASTE_WATER_SYSTEMS_TYPE:
			return validateMWasteWaterSystemsType((MWasteWaterSystemsType) value, diagnostics, context);
		case CpacsPackage.MWATER_RESERVOIRS_TYPE:
			return validateMWaterReservoirsType((MWaterReservoirsType) value, diagnostics, context);
		case CpacsPackage.MWINDOWS_TYPE:
			return validateMWindowsType((MWindowsType) value, diagnostics, context);
		case CpacsPackage.MWING_BOX_TYPE:
			return validateMWingBoxType((MWingBoxType) value, diagnostics, context);
		case CpacsPackage.MWINGS_STRUCTURE_TYPE:
			return validateMWingsStructureType((MWingsStructureType) value, diagnostics, context);
		case CpacsPackage.MWING_STRUCTURE_TYPE:
			return validateMWingStructureType((MWingStructureType) value, diagnostics, context);
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE:
			return validateNacelleCenterCowlType((NacelleCenterCowlType) value, diagnostics, context);
		case CpacsPackage.NACELLE_COWL_TYPE:
			return validateNacelleCowlType((NacelleCowlType) value, diagnostics, context);
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE:
			return validateNacelleGuideCurvesType((NacelleGuideCurvesType) value, diagnostics, context);
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE:
			return validateNacelleGuideCurveType((NacelleGuideCurveType) value, diagnostics, context);
		case CpacsPackage.NACELLE_PROFILES_TYPE:
			return validateNacelleProfilesType((NacelleProfilesType) value, diagnostics, context);
		case CpacsPackage.NACELLE_SECTIONS_TYPE:
			return validateNacelleSectionsType((NacelleSectionsType) value, diagnostics, context);
		case CpacsPackage.NACELLE_SECTION_TYPE:
			return validateNacelleSectionType((NacelleSectionType) value, diagnostics, context);
		case CpacsPackage.NAME_TYPE:
			return validateNameType((NameType) value, diagnostics, context);
		case CpacsPackage.NAME_TYPE1:
			return validateNameType1((NameType1) value, diagnostics, context);
		case CpacsPackage.NOISE_ANALYSIS_TYPE:
			return validateNoiseAnalysisType((NoiseAnalysisType) value, diagnostics, context);
		case CpacsPackage.NOSE_GEARS_TYPE:
			return validateNoseGearsType((NoseGearsType) value, diagnostics, context);
		case CpacsPackage.OEM_TYPE:
			return validateOEMType((OEMType) value, diagnostics, context);
		case CpacsPackage.OPERATIONAL_CASES_TYPE:
			return validateOperationalCasesType((OperationalCasesType) value, diagnostics, context);
		case CpacsPackage.OPERATIONAL_CASE_TYPE:
			return validateOperationalCaseType((OperationalCaseType) value, diagnostics, context);
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE:
			return validateOperationLimitIncrementsType((OperationLimitIncrementsType) value, diagnostics, context);
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE:
			return validateOrthotropicShellPropertiesType((OrthotropicShellPropertiesType) value, diagnostics, context);
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE:
			return validateOrthotropicSolidPropertiesType((OrthotropicSolidPropertiesType) value, diagnostics, context);
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE:
			return validateOuterCutOutProfileType((OuterCutOutProfileType) value, diagnostics, context);
		case CpacsPackage.PARAMETERS_TYPE:
			return validateParametersType((ParametersType) value, diagnostics, context);
		case CpacsPackage.PARAMETER_TYPE:
			return validateParameterType((ParameterType) value, diagnostics, context);
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE:
			return validatePaxCrossBeamsAssemblyType((PaxCrossBeamsAssemblyType) value, diagnostics, context);
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE:
			return validatePaxCrossBeamStrutsAssemblyType((PaxCrossBeamStrutsAssemblyType) value, diagnostics, context);
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE:
			return validatePaxDoorsAssemblyType((PaxDoorsAssemblyType) value, diagnostics, context);
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE:
			return validatePayloadGlobalType((PayloadGlobalType) value, diagnostics, context);
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE:
			return validatePerformanceMapSelectionType((PerformanceMapSelectionType) value, diagnostics, context);
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE:
			return validatePerformanceRequirementConfigurationsType((PerformanceRequirementConfigurationsType) value,
					diagnostics, context);
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE:
			return validatePerformanceRequirementsType((PerformanceRequirementsType) value, diagnostics, context);
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE:
			return validatePerformanceTargetsGlobalType((PerformanceTargetsGlobalType) value, diagnostics, context);
		case CpacsPackage.PHI_TYPE:
			return validatePhiType((PhiType) value, diagnostics, context);
		case CpacsPackage.PINTLE_STRUTS_TYPE:
			return validatePintleStrutsType((PintleStrutsType) value, diagnostics, context);
		case CpacsPackage.PISTON_TYPE:
			return validatePistonType((PistonType) value, diagnostics, context);
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE:
			return validatePlasticityCurvePointsType((PlasticityCurvePointsType) value, diagnostics, context);
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE:
			return validatePlasticityCurvePointType((PlasticityCurvePointType) value, diagnostics, context);
		case CpacsPackage.PLASTICITY_CURVES_TYPE:
			return validatePlasticityCurvesType((PlasticityCurvesType) value, diagnostics, context);
		case CpacsPackage.PLASTICITY_CURVE_TYPE:
			return validatePlasticityCurveType((PlasticityCurveType) value, diagnostics, context);
		case CpacsPackage.POINT_ABS_REL_TYPE:
			return validatePointAbsRelType((PointAbsRelType) value, diagnostics, context);
		case CpacsPackage.POINT_CONSTRAINT_TYPE:
			return validatePointConstraintType((PointConstraintType) value, diagnostics, context);
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE:
			return validatePointListRelXYZVectorType((PointListRelXYZVectorType) value, diagnostics, context);
		case CpacsPackage.POINT_LIST_TYPE:
			return validatePointListType((PointListType) value, diagnostics, context);
		case CpacsPackage.POINT_LIST_XY_TYPE:
			return validatePointListXYType((PointListXYType) value, diagnostics, context);
		case CpacsPackage.POINT_LIST_XY_VECTOR_TYPE:
			return validatePointListXYVectorType((PointListXYVectorType) value, diagnostics, context);
		case CpacsPackage.POINT_LIST_XYZ_VECTOR_TYPE:
			return validatePointListXYZVectorType((PointListXYZVectorType) value, diagnostics, context);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE:
			return validatePointPerformanceConstraintsType((PointPerformanceConstraintsType) value, diagnostics,
					context);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE:
			return validatePointPerformanceDefinitionsType((PointPerformanceDefinitionsType) value, diagnostics,
					context);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE:
			return validatePointPerformanceDefinitionType((PointPerformanceDefinitionType) value, diagnostics, context);
		case CpacsPackage.POINT_PERFORMANCE_REQUIREMENTS_TYPE:
			return validatePointPerformanceRequirementsType((PointPerformanceRequirementsType) value, diagnostics,
					context);
		case CpacsPackage.POINT_TYPE:
			return validatePointType((PointType) value, diagnostics, context);
		case CpacsPackage.POINT_XTYPE:
			return validatePointXType((PointXType) value, diagnostics, context);
		case CpacsPackage.POINT_XY_TYPE:
			return validatePointXYType((PointXYType) value, diagnostics, context);
		case CpacsPackage.POINT_XYZ_TYPE:
			return validatePointXYZType((PointXYZType) value, diagnostics, context);
		case CpacsPackage.POINT_XZ_TYPE:
			return validatePointXZType((PointXZType) value, diagnostics, context);
		case CpacsPackage.POINT_YTYPE:
			return validatePointYType((PointYType) value, diagnostics, context);
		case CpacsPackage.POINT_YZ_TYPE:
			return validatePointYZType((PointYZType) value, diagnostics, context);
		case CpacsPackage.POINT_ZTYPE:
			return validatePointZType((PointZType) value, diagnostics, context);
		case CpacsPackage.POS_EXCL0_DOUBLE_BASE_TYPE:
			return validatePosExcl0DoubleBaseType((PosExcl0DoubleBaseType) value, diagnostics, context);
		case CpacsPackage.POS_EXCL0_INT_BASE_TYPE:
			return validatePosExcl0IntBaseType((PosExcl0IntBaseType) value, diagnostics, context);
		case CpacsPackage.POS_INT_VECTOR_BASE_TYPE:
			return validatePosIntVectorBaseType((PosIntVectorBaseType) value, diagnostics, context);
		case CpacsPackage.POSITIONINGS_TYPE:
			return validatePositioningsType((PositioningsType) value, diagnostics, context);
		case CpacsPackage.POSITIONING_TYPE:
			return validatePositioningType((PositioningType) value, diagnostics, context);
		case CpacsPackage.POWER_CONSUMED_TYPE:
			return validatePowerConsumedType((PowerConsumedType) value, diagnostics, context);
		case CpacsPackage.POWER_FRACTION_TYPE:
			return validatePowerFractionType((PowerFractionType) value, diagnostics, context);
		case CpacsPackage.POWER_REMAINING_TYPE:
			return validatePowerRemainingType((PowerRemainingType) value, diagnostics, context);
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE:
			return validatePressureBulkheadAssemblyPositionType((PressureBulkheadAssemblyPositionType) value,
					diagnostics, context);
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_TYPE:
			return validatePressureBulkheadAssemblyType((PressureBulkheadAssemblyType) value, diagnostics, context);
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE:
			return validatePressureBulkheadsType((PressureBulkheadsType) value, diagnostics, context);
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE:
			return validatePressureBulkheadType((PressureBulkheadType) value, diagnostics, context);
		case CpacsPackage.PRIORITY_SETTING_TYPE:
			return validatePrioritySettingType((PrioritySettingType) value, diagnostics, context);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE:
			return validateProfileBasedStructuralElementsType((ProfileBasedStructuralElementsType) value, diagnostics,
					context);
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE:
			return validateProfileBasedStructuralElementType((ProfileBasedStructuralElementType) value, diagnostics,
					context);
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE:
			return validateProfileGeometry2DType((ProfileGeometry2DType) value, diagnostics, context);
		case CpacsPackage.PROFILE_GEOMETRY_TYPE:
			return validateProfileGeometryType((ProfileGeometryType) value, diagnostics, context);
		case CpacsPackage.PROFILES_TYPE:
			return validateProfilesType((ProfilesType) value, diagnostics, context);
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE:
			return validatePylonAttachmentsType((PylonAttachmentsType) value, diagnostics, context);
		case CpacsPackage.PYLON_ATTACHMENT_TYPE:
			return validatePylonAttachmentType((PylonAttachmentType) value, diagnostics, context);
		case CpacsPackage.PYLON_BOX_TYPE:
			return validatePylonBoxType((PylonBoxType) value, diagnostics, context);
		case CpacsPackage.PYLON_PINS_TYPE:
			return validatePylonPinsType((PylonPinsType) value, diagnostics, context);
		case CpacsPackage.PYLON_PIN_TYPE:
			return validatePylonPinType((PylonPinType) value, diagnostics, context);
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE:
			return validatePylonRibsDefinitionsType((PylonRibsDefinitionsType) value, diagnostics, context);
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE:
			return validatePylonRibsDefinitionType((PylonRibsDefinitionType) value, diagnostics, context);
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE:
			return validatePylonRibsPositioningType((PylonRibsPositioningType) value, diagnostics, context);
		case CpacsPackage.PYLON_SHACKLES_TYPE:
			return validatePylonShacklesType((PylonShacklesType) value, diagnostics, context);
		case CpacsPackage.PYLON_SHACKLE_TYPE:
			return validatePylonShackleType((PylonShackleType) value, diagnostics, context);
		case CpacsPackage.PYLON_SHELL_TYPE:
			return validatePylonShellType((PylonShellType) value, diagnostics, context);
		case CpacsPackage.PYLON_STRUCTURE_TYPE:
			return validatePylonStructureType((PylonStructureType) value, diagnostics, context);
		case CpacsPackage.PYLON_STRUTS_TYPE:
			return validatePylonStrutsType((PylonStrutsType) value, diagnostics, context);
		case CpacsPackage.RADIATIVE_FORCING_TYPE:
			return validateRadiativeForcingType((RadiativeForcingType) value, diagnostics, context);
		case CpacsPackage.RANGE_TYPE:
			return validateRangeType((RangeType) value, diagnostics, context);
		case CpacsPackage.RATE_OF_CLIMB_TYPE:
			return validateRateOfClimbType((RateOfClimbType) value, diagnostics, context);
		case CpacsPackage.RECTANGLE_PROFILE_TYPE:
			return validateRectangleProfileType((RectangleProfileType) value, diagnostics, context);
		case CpacsPackage.RECURRING_COST_TYPE:
			return validateRecurringCostType((RecurringCostType) value, diagnostics, context);
		case CpacsPackage.REFERENCE_TYPE:
			return validateReferenceType((ReferenceType) value, diagnostics, context);
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE:
			return validateRelativeStrutPositionType((RelativeStrutPositionType) value, diagnostics, context);
		case CpacsPackage.RELEASED_STORES_TYPE:
			return validateReleasedStoresType((ReleasedStoresType) value, diagnostics, context);
		case CpacsPackage.RELEASED_STORE_TYPE:
			return validateReleasedStoreType((ReleasedStoreType) value, diagnostics, context);
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE:
			return validateRemainingContributionsType((RemainingContributionsType) value, diagnostics, context);
		case CpacsPackage.REMAINING_CONTRIBUTION_TYPE:
			return validateRemainingContributionType((RemainingContributionType) value, diagnostics, context);
		case CpacsPackage.REQUIREMENT_CLASSIFICATION_TYPE:
			return validateRequirementClassificationType((RequirementClassificationType) value, diagnostics, context);
		case CpacsPackage.REQUIREMENT_TYPE:
			return validateRequirementType((RequirementType) value, diagnostics, context);
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE:
			return validateRibCrossingBehaviourType((RibCrossingBehaviourType) value, diagnostics, context);
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE1:
			return validateRibCrossingBehaviourType1((RibCrossingBehaviourType1) value, diagnostics, context);
		case CpacsPackage.RIB_IDENTIFICATION_TYPE:
			return validateRibIdentificationType((RibIdentificationType) value, diagnostics, context);
		case CpacsPackage.RIB_ROTATION_TYPE:
			return validateRibRotationType((RibRotationType) value, diagnostics, context);
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE:
			return validateRivetJointAreaAssemblyPositionType((RivetJointAreaAssemblyPositionType) value, diagnostics,
					context);
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE:
			return validateRivetJointAreasAssemblyType((RivetJointAreasAssemblyType) value, diagnostics, context);
		case CpacsPackage.RIVETS_TYPE:
			return validateRivetsType((RivetsType) value, diagnostics, context);
		case CpacsPackage.RIVET_TYPE:
			return validateRivetType((RivetType) value, diagnostics, context);
		case CpacsPackage.ROTATION_CURVE_TYPE:
			return validateRotationCurveType((RotationCurveType) value, diagnostics, context);
		case CpacsPackage.ROT_DIRECTION_TYPE:
			return validateRotDirectionType((RotDirectionType) value, diagnostics, context);
		case CpacsPackage.ROTOR_AIRFOILS_TYPE:
			return validateRotorAirfoilsType((RotorAirfoilsType) value, diagnostics, context);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE:
			return validateRotorBladeAttachmentsType((RotorBladeAttachmentsType) value, diagnostics, context);
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE:
			return validateRotorBladeAttachmentType((RotorBladeAttachmentType) value, diagnostics, context);
		case CpacsPackage.ROTOR_BLADES_TYPE:
			return validateRotorBladesType((RotorBladesType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE:
			return validateRotorcraftAnalysesType((RotorcraftAnalysesType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE:
			return validateRotorcraftGlobalType((RotorcraftGlobalType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MASS_BREAKDOWN_TYPE:
			return validateRotorcraftMassBreakdownType((RotorcraftMassBreakdownType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE:
			return validateRotorcraftMassEMType((RotorcraftMassEMType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE:
			return validateRotorcraftMassGroupLevel1Type((RotorcraftMassGroupLevel1Type) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL2_TYPE:
			return validateRotorcraftMassGroupLevel2Type((RotorcraftMassGroupLevel2Type) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MASS_OEM_TYPE:
			return validateRotorcraftMassOEMType((RotorcraftMassOEMType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE:
			return validateRotorcraftModelType((RotorcraftModelType) value, diagnostics, context);
		case CpacsPackage.ROTORCRAFT_TYPE:
			return validateRotorcraftType((RotorcraftType) value, diagnostics, context);
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE:
			return validateRotorHubHingesType((RotorHubHingesType) value, diagnostics, context);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE:
			return validateRotorHubHingeType((RotorHubHingeType) value, diagnostics, context);
		case CpacsPackage.ROTOR_HUB_TYPE:
			return validateRotorHubType((RotorHubType) value, diagnostics, context);
		case CpacsPackage.ROTORS_TYPE:
			return validateRotorsType((RotorsType) value, diagnostics, context);
		case CpacsPackage.ROTOR_TYPE:
			return validateRotorType((RotorType) value, diagnostics, context);
		case CpacsPackage.RUNWAY_ILS_TYPE:
			return validateRunwayILSType((RunwayILSType) value, diagnostics, context);
		case CpacsPackage.RUNWAY_START_POSITION_TYPE:
			return validateRunwayStartPositionType((RunwayStartPositionType) value, diagnostics, context);
		case CpacsPackage.RUNWAYS_TYPE:
			return validateRunwaysType((RunwaysType) value, diagnostics, context);
		case CpacsPackage.RUNWAY_TYPE:
			return validateRunwayType((RunwayType) value, diagnostics, context);
		case CpacsPackage.RUNWAY_TYPE1:
			return validateRunwayType1((RunwayType1) value, diagnostics, context);
		case CpacsPackage.SEAT_ELEMENTS_TYPE:
			return validateSeatElementsType((SeatElementsType) value, diagnostics, context);
		case CpacsPackage.SEAT_ELEMENT_TYPE:
			return validateSeatElementType((SeatElementType) value, diagnostics, context);
		case CpacsPackage.SEAT_MODULES_TYPE:
			return validateSeatModulesType((SeatModulesType) value, diagnostics, context);
		case CpacsPackage.SEGMENT_DIRECTION_TYPE:
			return validateSegmentDirectionType((SegmentDirectionType) value, diagnostics, context);
		case CpacsPackage.SEGMENT_TYPE_TYPE:
			return validateSegmentTypeType((SegmentTypeType) value, diagnostics, context);
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE:
			return validateShaftLinkedComponentsType((ShaftLinkedComponentsType) value, diagnostics, context);
		case CpacsPackage.SHAFTS_TYPE:
			return validateShaftsType((ShaftsType) value, diagnostics, context);
		case CpacsPackage.SHAFT_TYPE:
			return validateShaftType((ShaftType) value, diagnostics, context);
		case CpacsPackage.SHEET3_DTYPE:
			return validateSheet3DType((Sheet3DType) value, diagnostics, context);
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE:
			return validateSheetBasedStructuralElementsType((SheetBasedStructuralElementsType) value, diagnostics,
					context);
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE:
			return validateSheetBasedStructuralElementType((SheetBasedStructuralElementType) value, diagnostics,
					context);
		case CpacsPackage.SHEET_LIST3_DTYPE:
			return validateSheetList3DType((SheetList3DType) value, diagnostics, context);
		case CpacsPackage.SHEET_LIST_TYPE:
			return validateSheetListType((SheetListType) value, diagnostics, context);
		case CpacsPackage.SHEET_POINTS_TYPE:
			return validateSheetPointsType((SheetPointsType) value, diagnostics, context);
		case CpacsPackage.SHEET_TYPE:
			return validateSheetType((SheetType) value, diagnostics, context);
		case CpacsPackage.SIDE_STRUTS_TYPE:
			return validateSideStrutsType((SideStrutsType) value, diagnostics, context);
		case CpacsPackage.SIDE_TYPE:
			return validateSideType((SideType) value, diagnostics, context);
		case CpacsPackage.SIDEWALL_PANEL_ELEMENTS_TYPE:
			return validateSidewallPanelElementsType((SidewallPanelElementsType) value, diagnostics, context);
		case CpacsPackage.SIDEWALL_PANELS_TYPE:
			return validateSidewallPanelsType((SidewallPanelsType) value, diagnostics, context);
		case CpacsPackage.SINGLE_GENERIC_MASS_TYPE:
			return validateSingleGenericMassType((SingleGenericMassType) value, diagnostics, context);
		case CpacsPackage.SKID_GEARS_TYPE:
			return validateSkidGearsType((SkidGearsType) value, diagnostics, context);
		case CpacsPackage.SKIN_SEGMENTS_TYPE:
			return validateSkinSegmentsType((SkinSegmentsType) value, diagnostics, context);
		case CpacsPackage.SKIN_SEGMENT_TYPE:
			return validateSkinSegmentType((SkinSegmentType) value, diagnostics, context);
		case CpacsPackage.SKIN_TYPE:
			return validateSkinType((SkinType) value, diagnostics, context);
		case CpacsPackage.SPAR_CELLS_TYPE:
			return validateSparCellsType((SparCellsType) value, diagnostics, context);
		case CpacsPackage.SPAR_CELL_TYPE:
			return validateSparCellType((SparCellType) value, diagnostics, context);
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE:
			return validateSparCrossSectionType((SparCrossSectionType) value, diagnostics, context);
		case CpacsPackage.SPAR_POSITIONS_TYPE:
			return validateSparPositionsType((SparPositionsType) value, diagnostics, context);
		case CpacsPackage.SPAR_POSITION_TYPE:
			return validateSparPositionType((SparPositionType) value, diagnostics, context);
		case CpacsPackage.SPAR_POSITION_UI_DS_TYPE:
			return validateSparPositionUIDsType((SparPositionUIDsType) value, diagnostics, context);
		case CpacsPackage.SPAR_SEGMENTS_TYPE:
			return validateSparSegmentsType((SparSegmentsType) value, diagnostics, context);
		case CpacsPackage.SPAR_SEGMENT_TYPE:
			return validateSparSegmentType((SparSegmentType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENTS_TYPE:
			return validateSpecificConfigurationSegmentsType((SpecificConfigurationSegmentsType) value, diagnostics,
					context);
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE:
			return validateSpecificConfigurationSegmentType((SpecificConfigurationSegmentType) value, diagnostics,
					context);
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE:
			return validateSpecificConfigurationUIDsType((SpecificConfigurationUIDsType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE:
			return validateSpecificConfigurationUIDType((SpecificConfigurationUIDType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_EXCESS_POWER_TYPE:
			return validateSpecificExcessPowerType((SpecificExcessPowerType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE:
			return validateSpecificHeatMapType((SpecificHeatMapType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE:
			return validateSpecificPerformanceMapsType((SpecificPerformanceMapsType) value, diagnostics, context);
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE:
			return validateSpecificPerformanceMapType((SpecificPerformanceMapType) value, diagnostics, context);
		case CpacsPackage.SPEED_DESIGNATORS_TYPE:
			return validateSpeedDesignatorsType((SpeedDesignatorsType) value, diagnostics, context);
		case CpacsPackage.SPOILERS_TYPE:
			return validateSpoilersType((SpoilersType) value, diagnostics, context);
		case CpacsPackage.SPOILER_TYPE:
			return validateSpoilerType((SpoilerType) value, diagnostics, context);
		case CpacsPackage.STANDARD_PROFILE_SHEET_ID_TYPE:
			return validateStandardProfileSheetIDType((StandardProfileSheetIDType) value, diagnostics, context);
		case CpacsPackage.STANDARD_PROFILE_TYPE:
			return validateStandardProfileType((StandardProfileType) value, diagnostics, context);
		case CpacsPackage.STANDARD_PROFILE_TYPE_TYPE:
			return validateStandardProfileTypeType((StandardProfileTypeType) value, diagnostics, context);
		case CpacsPackage.STATE_PARAMETERS_TYPE:
			return validateStateParametersType((StateParametersType) value, diagnostics, context);
		case CpacsPackage.STATE_PARAMETER_TYPE:
			return validateStateParameterType((StateParameterType) value, diagnostics, context);
		case CpacsPackage.STIFFNESS_TYPE:
			return validateStiffnessType((StiffnessType) value, diagnostics, context);
		case CpacsPackage.STRING_ARRAY_BASE_TYPE:
			return validateStringArrayBaseType((StringArrayBaseType) value, diagnostics, context);
		case CpacsPackage.STRING_BASE_TYPE:
			return validateStringBaseType((StringBaseType) value, diagnostics, context);
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE:
			return validateStringerFramePositionType((StringerFramePositionType) value, diagnostics, context);
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE:
			return validateStringerFramePositionUIDsType((StringerFramePositionUIDsType) value, diagnostics, context);
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE:
			return validateStringersAssemblyType((StringersAssemblyType) value, diagnostics, context);
		case CpacsPackage.STRINGER_TYPE:
			return validateStringerType((StringerType) value, diagnostics, context);
		case CpacsPackage.STRING_UID_BASE_TYPE:
			return validateStringUIDBaseType((StringUIDBaseType) value, diagnostics, context);
		case CpacsPackage.STRING_VECTOR_BASE_TYPE:
			return validateStringVectorBaseType((StringVectorBaseType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE:
			return validateStructuralElementsType((StructuralElementsType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE:
			return validateStructuralMountType((StructuralMountType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE:
			return validateStructuralProfile3DType((StructuralProfile3DType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE:
			return validateStructuralProfilesType((StructuralProfilesType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE:
			return validateStructuralProfileType((StructuralProfileType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE:
			return validateStructuralWallElementsType((StructuralWallElementsType) value, diagnostics, context);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE:
			return validateStructuralWallElementType((StructuralWallElementType) value, diagnostics, context);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE:
			return validateStrutAssemblyType((StrutAssemblyType) value, diagnostics, context);
		case CpacsPackage.STRUT_PROPERTIES_TYPE:
			return validateStrutPropertiesType((StrutPropertiesType) value, diagnostics, context);
		case CpacsPackage.STRUT_TYPE:
			return validateStrutType((StrutType) value, diagnostics, context);
		case CpacsPackage.STUDIES_TYPE:
			return validateStudiesType((StudiesType) value, diagnostics, context);
		case CpacsPackage.SUB_FLEETS_TYPE:
			return validateSubFleetsType((SubFleetsType) value, diagnostics, context);
		case CpacsPackage.SUB_FLEET_TYPE:
			return validateSubFleetType((SubFleetType) value, diagnostics, context);
		case CpacsPackage.SUB_LOAD_TYPE:
			return validateSubLoadType((SubLoadType) value, diagnostics, context);
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE:
			return validateSuperEllipseProfileType((SuperEllipseProfileType) value, diagnostics, context);
		case CpacsPackage.SUPPORT_BEAM_TYPE:
			return validateSupportBeamType((SupportBeamType) value, diagnostics, context);
		case CpacsPackage.SYSTEMS_TYPE:
			return validateSystemsType((SystemsType) value, diagnostics, context);
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE:
			return validateTailplaneAttachmentAreaType((TailplaneAttachmentAreaType) value, diagnostics, context);
		case CpacsPackage.TAILPLANE_ATTACHMENT_TYPE_TYPE:
			return validateTailplaneAttachmentTypeType((TailplaneAttachmentTypeType) value, diagnostics, context);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE:
			return validateTakeoffPerformanceParametersType((TakeoffPerformanceParametersType) value, diagnostics,
					context);
		case CpacsPackage.TANGENT_LINKS_TYPE:
			return validateTangentLinksType((TangentLinksType) value, diagnostics, context);
		case CpacsPackage.TIED_INTERFACES_TYPE:
			return validateTiedInterfacesType((TiedInterfacesType) value, diagnostics, context);
		case CpacsPackage.TIED_INTERFACE_TYPE:
			return validateTiedInterfaceType((TiedInterfaceType) value, diagnostics, context);
		case CpacsPackage.TIME_BASE_TYPE:
			return validateTimeBaseType((TimeBaseType) value, diagnostics, context);
		case CpacsPackage.TIME_CONSTRAINT_BASE_TYPE:
			return validateTimeConstraintBaseType((TimeConstraintBaseType) value, diagnostics, context);
		case CpacsPackage.TOOLSPECIFIC_TYPE:
			return validateToolspecificType((ToolspecificType) value, diagnostics, context);
		case CpacsPackage.TOOL_TYPE:
			return validateToolType((ToolType) value, diagnostics, context);
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE:
			return validateTopologyEntriesType((TopologyEntriesType) value, diagnostics, context);
		case CpacsPackage.TOPOLOGY_ENTRY_TYPE:
			return validateTopologyEntryType((TopologyEntryType) value, diagnostics, context);
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE:
			return validateTotalOperatingCostType((TotalOperatingCostType) value, diagnostics, context);
		case CpacsPackage.TRACK_ACTUATOR_TYPE:
			return validateTrackActuatorType((TrackActuatorType) value, diagnostics, context);
		case CpacsPackage.TRACK_JOINT_COORDINATES_TYPE:
			return validateTrackJointCoordinatesType((TrackJointCoordinatesType) value, diagnostics, context);
		case CpacsPackage.TRACK_JOINT_POSITIONS_TYPE:
			return validateTrackJointPositionsType((TrackJointPositionsType) value, diagnostics, context);
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE:
			return validateTrackJointPositionType((TrackJointPositionType) value, diagnostics, context);
		case CpacsPackage.TRACK_SECONDARY_STRUCTURE_TYPE:
			return validateTrackSecondaryStructureType((TrackSecondaryStructureType) value, diagnostics, context);
		case CpacsPackage.TRACK_STRUCTURE_TYPE:
			return validateTrackStructureType((TrackStructureType) value, diagnostics, context);
		case CpacsPackage.TRACK_STRUTS_TYPE:
			return validateTrackStrutsType((TrackStrutsType) value, diagnostics, context);
		case CpacsPackage.TRACK_STRUT_TYPE:
			return validateTrackStrutType((TrackStrutType) value, diagnostics, context);
		case CpacsPackage.TRACK_SUB_TYPE_TYPE:
			return validateTrackSubTypeType((TrackSubTypeType) value, diagnostics, context);
		case CpacsPackage.TRACK_TYPE_TYPE:
			return validateTrackTypeType((TrackTypeType) value, diagnostics, context);
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE:
			return validateTrailingEdgeDevicesType((TrailingEdgeDevicesType) value, diagnostics, context);
		case CpacsPackage.TRAILING_EDGE_DEVICE_TYPE:
			return validateTrailingEdgeDeviceType((TrailingEdgeDeviceType) value, diagnostics, context);
		case CpacsPackage.TRAJECTORIES_TYPE:
			return validateTrajectoriesType((TrajectoriesType) value, diagnostics, context);
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE:
			return validateTrajectoryGlobalType((TrajectoryGlobalType) value, diagnostics, context);
		case CpacsPackage.TRAJECTORY_TYPE:
			return validateTrajectoryType((TrajectoryType) value, diagnostics, context);
		case CpacsPackage.TRANSFORMATION2_DTYPE:
			return validateTransformation2DType((Transformation2DType) value, diagnostics, context);
		case CpacsPackage.TRANSFORMATION_TYPE:
			return validateTransformationType((TransformationType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE:
			return validateTransmissionGearRatioType((TransmissionGearRatioType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE:
			return validateTransmissionShaftInputsType((TransmissionShaftInputsType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE:
			return validateTransmissionShaftInputType((TransmissionShaftInputType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE:
			return validateTransmissionShaftOutputsType((TransmissionShaftOutputsType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE:
			return validateTransmissionShaftOutputType((TransmissionShaftOutputType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSIONS_TYPE:
			return validateTransmissionsType((TransmissionsType) value, diagnostics, context);
		case CpacsPackage.TRANSMISSION_TYPE:
			return validateTransmissionType((TransmissionType) value, diagnostics, context);
		case CpacsPackage.TRIM_CASE_TYPE:
			return validateTrimCaseType((TrimCaseType) value, diagnostics, context);
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE:
			return validateTrimRequirementsType((TrimRequirementsType) value, diagnostics, context);
		case CpacsPackage.TRIM_REQUIREMENT_TYPE:
			return validateTrimRequirementType((TrimRequirementType) value, diagnostics, context);
		case CpacsPackage.TRIM_TYPE:
			return validateTrimType((TrimType) value, diagnostics, context);
		case CpacsPackage.TURN_ANGLE_TYPE:
			return validateTurnAngleType((TurnAngleType) value, diagnostics, context);
		case CpacsPackage.TYPE_OF_POINT_PERFORMANCE_TYPE:
			return validateTypeOfPointPerformanceType((TypeOfPointPerformanceType) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE:
			return validateTypeType((TypeType) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE4:
			return validateTypeType4((TypeType4) value, diagnostics, context);
		case CpacsPackage.UID_GROUP_DEFINITIONS_TYPE:
			return validateUIDGroupDefinitionsType((UIDGroupDefinitionsType) value, diagnostics, context);
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE:
			return validateUIDGroupDefinitionType((UIDGroupDefinitionType) value, diagnostics, context);
		case CpacsPackage.UID_SEQUENCE_TYPE:
			return validateUIDSequenceType((UIDSequenceType) value, diagnostics, context);
		case CpacsPackage.UPPER_LINKS_TYPE:
			return validateUpperLinksType((UpperLinksType) value, diagnostics, context);
		case CpacsPackage.VARIABLE_CONDITIONS_TYPE:
			return validateVariableConditionsType((VariableConditionsType) value, diagnostics, context);
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE:
			return validateVariableSegmentsType((VariableSegmentsType) value, diagnostics, context);
		case CpacsPackage.VARIABLE_SEGMENT_TYPE:
			return validateVariableSegmentType((VariableSegmentType) value, diagnostics, context);
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE:
			return validateVehicleConfigurationsType((VehicleConfigurationsType) value, diagnostics, context);
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE:
			return validateVehicleConfigurationType((VehicleConfigurationType) value, diagnostics, context);
		case CpacsPackage.VEHICLES_TYPE:
			return validateVehiclesType((VehiclesType) value, diagnostics, context);
		case CpacsPackage.VERSION_INFOS_TYPE:
			return validateVersionInfosType((VersionInfosType) value, diagnostics, context);
		case CpacsPackage.VERSION_INFO_TYPE:
			return validateVersionInfoType((VersionInfoType) value, diagnostics, context);
		case CpacsPackage.VTP_FRAME_DEF_TYPE:
			return validateVtpFrameDefType((VtpFrameDefType) value, diagnostics, context);
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE:
			return validateVtpInterfaceDefType((VtpInterfaceDefType) value, diagnostics, context);
		case CpacsPackage.WALL_POSITIONS_TYPE:
			return validateWallPositionsType((WallPositionsType) value, diagnostics, context);
		case CpacsPackage.WALL_POSITION_TYPE:
			return validateWallPositionType((WallPositionType) value, diagnostics, context);
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE:
			return validateWallPositionUIDsType((WallPositionUIDsType) value, diagnostics, context);
		case CpacsPackage.WALL_SEGMENTS_TYPE:
			return validateWallSegmentsType((WallSegmentsType) value, diagnostics, context);
		case CpacsPackage.WALL_SEGMENT_TYPE:
			return validateWallSegmentType((WallSegmentType) value, diagnostics, context);
		case CpacsPackage.WALLS_TYPE:
			return validateWallsType((WallsType) value, diagnostics, context);
		case CpacsPackage.WAY_POINT_TYPE_TYPE:
			return validateWayPointTypeType((WayPointTypeType) value, diagnostics, context);
		case CpacsPackage.WEB_TYPE:
			return validateWebType((WebType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCE_CASE_TYPE:
			return validateWeightAndBalanceCaseType((WeightAndBalanceCaseType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE:
			return validateWeightAndBalanceFuelInTanksType((WeightAndBalanceFuelInTanksType) value, diagnostics,
					context);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE:
			return validateWeightAndBalanceFuelInTankType((WeightAndBalanceFuelInTankType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_TYPE:
			return validateWeightAndBalanceFuelType((WeightAndBalanceFuelType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCEM_CARGOS_TYPE:
			return validateWeightAndBalancemCargosType((WeightAndBalancemCargosType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE:
			return validateWeightAndBalancemPaxxType((WeightAndBalancemPaxxType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCE_PAYLOAD_TYPE:
			return validateWeightAndBalancePayloadType((WeightAndBalancePayloadType) value, diagnostics, context);
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE:
			return validateWeightAndBalanceType((WeightAndBalanceType) value, diagnostics, context);
		case CpacsPackage.WHEEL_TYPE:
			return validateWheelType((WheelType) value, diagnostics, context);
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE:
			return validateWindowAssemblyPositionType((WindowAssemblyPositionType) value, diagnostics, context);
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE:
			return validateWindowsAssemblyType((WindowsAssemblyType) value, diagnostics, context);
		case CpacsPackage.WINDOWS_TYPE:
			return validateWindowsType((WindowsType) value, diagnostics, context);
		case CpacsPackage.WING_AERO_PERFORMANCE_TYPE:
			return validateWingAeroPerformanceType((WingAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.WING_AIRFOILS_TYPE:
			return validateWingAirfoilsType((WingAirfoilsType) value, diagnostics, context);
		case CpacsPackage.WING_ATTACHMENT_POSITIONING_TYPE:
			return validateWingAttachmentPositioningType((WingAttachmentPositioningType) value, diagnostics, context);
		case CpacsPackage.WING_CELLS_TYPE:
			return validateWingCellsType((WingCellsType) value, diagnostics, context);
		case CpacsPackage.WING_CELL_TYPE:
			return validateWingCellType((WingCellType) value, diagnostics, context);
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE:
			return validateWingComponentSegmentStructureType((WingComponentSegmentStructureType) value, diagnostics,
					context);
		case CpacsPackage.WING_ELEMENTS_TYPE:
			return validateWingElementsType((WingElementsType) value, diagnostics, context);
		case CpacsPackage.WING_ELEMENT_TYPE:
			return validateWingElementType((WingElementType) value, diagnostics, context);
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE:
			return validateWingFuelTankBorderType((WingFuelTankBorderType) value, diagnostics, context);
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE:
			return validateWingFuelTankGeometryType((WingFuelTankGeometryType) value, diagnostics, context);
		case CpacsPackage.WING_FUEL_TANKS_TYPE:
			return validateWingFuelTanksType((WingFuelTanksType) value, diagnostics, context);
		case CpacsPackage.WING_FUEL_TANK_TYPE:
			return validateWingFuelTankType((WingFuelTankType) value, diagnostics, context);
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE:
			return validateWingFuselageAttachmentsType((WingFuselageAttachmentsType) value, diagnostics, context);
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE:
			return validateWingFuselageAttachmentType((WingFuselageAttachmentType) value, diagnostics, context);
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE:
			return validateWingInterfaceDefinitionsType((WingInterfaceDefinitionsType) value, diagnostics, context);
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE:
			return validateWingInterfaceMainFramesType((WingInterfaceMainFramesType) value, diagnostics, context);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE:
			return validateWingInterfaceSupportStrutsAssemblyType((WingInterfaceSupportStrutsAssemblyType) value,
					diagnostics, context);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE:
			return validateWingInterfaceSupportStrutType((WingInterfaceSupportStrutType) value, diagnostics, context);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE:
			return validateWingIntermediateStructureCellsType((WingIntermediateStructureCellsType) value, diagnostics,
					context);
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE:
			return validateWingIntermediateStructureCellType((WingIntermediateStructureCellType) value, diagnostics,
					context);
		case CpacsPackage.WING_RIB_CELL_TYPE:
			return validateWingRibCellType((WingRibCellType) value, diagnostics, context);
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE:
			return validateWingRibCrossSectionType((WingRibCrossSectionType) value, diagnostics, context);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE:
			return validateWingRibExplicitPositioningType((WingRibExplicitPositioningType) value, diagnostics, context);
		case CpacsPackage.WING_RIB_POINT_TYPE:
			return validateWingRibPointType((WingRibPointType) value, diagnostics, context);
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE:
			return validateWingRibsDefinitionsType((WingRibsDefinitionsType) value, diagnostics, context);
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE:
			return validateWingRibsDefinitionType((WingRibsDefinitionType) value, diagnostics, context);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE:
			return validateWingRibsPositioningType((WingRibsPositioningType) value, diagnostics, context);
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE:
			return validateWingsAeroPerformanceType((WingsAeroPerformanceType) value, diagnostics, context);
		case CpacsPackage.WING_SECTIONS_TYPE:
			return validateWingSectionsType((WingSectionsType) value, diagnostics, context);
		case CpacsPackage.WING_SECTION_TYPE:
			return validateWingSectionType((WingSectionType) value, diagnostics, context);
		case CpacsPackage.WING_SEGMENTS_TYPE:
			return validateWingSegmentsType((WingSegmentsType) value, diagnostics, context);
		case CpacsPackage.WING_SEGMENT_TYPE:
			return validateWingSegmentType((WingSegmentType) value, diagnostics, context);
		case CpacsPackage.WING_SHELL_TYPE:
			return validateWingShellType((WingShellType) value, diagnostics, context);
		case CpacsPackage.WING_SKIN_TYPE:
			return validateWingSkinType((WingSkinType) value, diagnostics, context);
		case CpacsPackage.WING_SPAR_TYPE:
			return validateWingSparType((WingSparType) value, diagnostics, context);
		case CpacsPackage.WING_STRINGER_TYPE:
			return validateWingStringerType((WingStringerType) value, diagnostics, context);
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE:
			return validateWingStructuralMountsType((WingStructuralMountsType) value, diagnostics, context);
		case CpacsPackage.WINGS_TYPE:
			return validateWingsType((WingsType) value, diagnostics, context);
		case CpacsPackage.WING_TYPE:
			return validateWingType((WingType) value, diagnostics, context);
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE:
			return validateWingWingAttachmentElementsType((WingWingAttachmentElementsType) value, diagnostics, context);
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE:
			return validateWingWingAttachmentSparsType((WingWingAttachmentSparsType) value, diagnostics, context);
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE:
			return validateWingWingAttachmentsSparsType((WingWingAttachmentsSparsType) value, diagnostics, context);
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE:
			return validateWingWingAttachmentsType((WingWingAttachmentsType) value, diagnostics, context);
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE:
			return validateWingWingAttachmentType((WingWingAttachmentType) value, diagnostics, context);
		case CpacsPackage.XSI_ISO_LINE_TYPE:
			return validateXsiIsoLineType((XsiIsoLineType) value, diagnostics, context);
		case CpacsPackage.ZCOUPLINGS_TYPE:
			return validateZCouplingsType((ZCouplingsType) value, diagnostics, context);
		case CpacsPackage.ZCOUPLING_TYPE:
			return validateZCouplingType((ZCouplingType) value, diagnostics, context);
		case CpacsPackage.FORMAT_TYPE:
			return validateFormatType((FormatType) value, diagnostics, context);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE:
			return validateGeometricBaseTypeType((GeometricBaseTypeType) value, diagnostics, context);
		case CpacsPackage.PLACEMENT_TYPE:
			return validatePlacementType((PlacementType) value, diagnostics, context);
		case CpacsPackage.REF_TYPE_TYPE:
			return validateRefTypeType((RefTypeType) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE:
			return validateRelationalOperatorType((RelationalOperatorType) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE1:
			return validateRelationalOperatorType1((RelationalOperatorType1) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE2:
			return validateRelationalOperatorType2((RelationalOperatorType2) value, diagnostics, context);
		case CpacsPackage.SIDE_OF_FIRST_WHEEL_TYPE:
			return validateSideOfFirstWheelType((SideOfFirstWheelType) value, diagnostics, context);
		case CpacsPackage.SIZING_TYPE_TYPE:
			return validateSizingTypeType((SizingTypeType) value, diagnostics, context);
		case CpacsPackage.STEP_TYPE_TYPE:
			return validateStepTypeType((StepTypeType) value, diagnostics, context);
		case CpacsPackage.STEP_TYPE_TYPE1:
			return validateStepTypeType1((StepTypeType1) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_TYPE:
			return validateSymmetryType((SymmetryType) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_TYPE1:
			return validateSymmetryType1((SymmetryType1) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_XY_XZ_YZ_TYPE:
			return validateSymmetryXyXzYzType((SymmetryXyXzYzType) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE1:
			return validateTypeType1((TypeType1) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE2:
			return validateTypeType2((TypeType2) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE3:
			return validateTypeType3((TypeType3) value, diagnostics, context);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE:
			return validateUncertaintyFunctionType((UncertaintyFunctionType) value, diagnostics, context);
		case CpacsPackage.DOUBLE_VECTOR_BASE_TYPE_BASE:
			return validateDoubleVectorBaseTypeBase((String) value, diagnostics, context);
		case CpacsPackage.FORMAT_TYPE_OBJECT:
			return validateFormatTypeObject((FormatType) value, diagnostics, context);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE_OBJECT:
			return validateGeometricBaseTypeTypeObject((GeometricBaseTypeType) value, diagnostics, context);
		case CpacsPackage.MAIN_STRUT_RELATIVE_POSITION_TYPE:
			return validateMainStrutRelativePositionType((Double) value, diagnostics, context);
		case CpacsPackage.MAIN_STRUT_RELATIVE_POSITION_TYPE_OBJECT:
			return validateMainStrutRelativePositionTypeObject((Double) value, diagnostics, context);
		case CpacsPackage.PLACEMENT_TYPE_OBJECT:
			return validatePlacementTypeObject((PlacementType) value, diagnostics, context);
		case CpacsPackage.POS_ON_BOGIE_TYPE:
			return validatePosOnBogieType((Double) value, diagnostics, context);
		case CpacsPackage.POS_ON_BOGIE_TYPE_OBJECT:
			return validatePosOnBogieTypeObject((Double) value, diagnostics, context);
		case CpacsPackage.REF_TYPE_TYPE_OBJECT:
			return validateRefTypeTypeObject((RefTypeType) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE_OBJECT:
			return validateRelationalOperatorTypeObject((RelationalOperatorType1) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE_OBJECT1:
			return validateRelationalOperatorTypeObject1((RelationalOperatorType) value, diagnostics, context);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE_OBJECT2:
			return validateRelationalOperatorTypeObject2((RelationalOperatorType2) value, diagnostics, context);
		case CpacsPackage.RELATIVE_POSITION_TYPE:
			return validateRelativePositionType((Double) value, diagnostics, context);
		case CpacsPackage.RELATIVE_POSITION_TYPE_OBJECT:
			return validateRelativePositionTypeObject((Double) value, diagnostics, context);
		case CpacsPackage.SIDE_OF_FIRST_WHEEL_TYPE_OBJECT:
			return validateSideOfFirstWheelTypeObject((SideOfFirstWheelType) value, diagnostics, context);
		case CpacsPackage.SIZING_TYPE_TYPE_OBJECT:
			return validateSizingTypeTypeObject((SizingTypeType) value, diagnostics, context);
		case CpacsPackage.STEP_TYPE_TYPE_OBJECT:
			return validateStepTypeTypeObject((StepTypeType) value, diagnostics, context);
		case CpacsPackage.STEP_TYPE_TYPE_OBJECT1:
			return validateStepTypeTypeObject1((StepTypeType1) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT:
			return validateSymmetryTypeObject((SymmetryType) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT1:
			return validateSymmetryTypeObject1((SymmetryType1) value, diagnostics, context);
		case CpacsPackage.SYMMETRY_XY_XZ_YZ_TYPE_OBJECT:
			return validateSymmetryXyXzYzTypeObject((SymmetryXyXzYzType) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE_OBJECT:
			return validateTypeTypeObject((TypeType1) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE_OBJECT1:
			return validateTypeTypeObject1((TypeType2) value, diagnostics, context);
		case CpacsPackage.TYPE_TYPE_OBJECT2:
			return validateTypeTypeObject2((TypeType3) value, diagnostics, context);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE_OBJECT:
			return validateUncertaintyFunctionTypeObject((UncertaintyFunctionType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorAttachmentType(ActuatorAttachmentType actuatorAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorControlSurfaceAttachmentType(
			ActuatorControlSurfaceAttachmentType actuatorControlSurfaceAttachmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorControlSurfaceAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorFuselageWingAttachmentType(
			ActuatorFuselageWingAttachmentType actuatorFuselageWingAttachmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorFuselageWingAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorFuselageWingType(ActuatorFuselageWingType actuatorFuselageWingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorFuselageWingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorParentAttachmentType(ActuatorParentAttachmentType actuatorParentAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorParentAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorsFuselageWingType(ActuatorsFuselageWingType actuatorsFuselageWingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorsFuselageWingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroCaseAeroDataType(AeroCaseAeroDataType aeroCaseAeroDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroCaseAeroDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroCaseCoefficientsType(AeroCaseCoefficientsType aeroCaseCoefficientsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroCaseCoefficientsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroCaseSpecificationType(AeroCaseSpecificationType aeroCaseSpecificationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroCaseSpecificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroCasesType(AeroCasesType aeroCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroCaseType(AeroCaseType aeroCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroDataComponentsType(AeroDataComponentsType aeroDataComponentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroDataComponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroDataComponentType(AeroDataComponentType aeroDataComponentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroDataComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroDataVehicleType(AeroDataVehicleType aeroDataVehicleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroDataVehicleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroelasticDivergenceType(AeroelasticDivergenceType aeroelasticDivergenceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroelasticDivergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroelasticStaticMaxDisplacementType(
			AeroelasticStaticMaxDisplacementType aeroelasticStaticMaxDisplacementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroelasticStaticMaxDisplacementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroelasticsType(AeroelasticsType aeroelasticsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroelasticsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroLimitsIncrementMapsType(AeroLimitsIncrementMapsType aeroLimitsIncrementMapsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroLimitsIncrementMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroLimitsIncrementMapType(AeroLimitsIncrementMapType aeroLimitsIncrementMapType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroLimitsIncrementMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroLimitsMapType(AeroLimitsMapType aeroLimitsMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroLimitsMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroMapOperationLimitType(AeroMapOperationLimitType aeroMapOperationLimitType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroMapOperationLimitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroMapType(AeroMapType aeroMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceBoundaryConditionsType(
			AeroPerformanceBoundaryConditionsType aeroPerformanceBoundaryConditionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceBoundaryConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceIncrementMapsType(
			AeroPerformanceIncrementMapsType aeroPerformanceIncrementMapsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceIncrementMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceIncrementMapType(
			AeroPerformanceIncrementMapType aeroPerformanceIncrementMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceIncrementMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceMapRCType(AeroPerformanceMapRCType aeroPerformanceMapRCType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceMapRCType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceMapsRCType(AeroPerformanceMapsRCType aeroPerformanceMapsRCType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceMapsRCType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceMapType(AeroPerformanceMapType aeroPerformanceMapType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceRCType(AeroPerformanceRCType aeroPerformanceRCType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceRCType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAeroPerformanceType(AeroPerformanceType aeroPerformanceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftAnalysesGlobalType(AircraftAnalysesGlobalType aircraftAnalysesGlobalType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftAnalysesGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftAnalysesType(AircraftAnalysesType aircraftAnalysesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftAnalysesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftControlElementsType(AircraftControlElementsType aircraftControlElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftControlElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftControlElementType(AircraftControlElementType aircraftControlElementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftControlElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftGlobalType(AircraftGlobalType aircraftGlobalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftModelType(AircraftModelType aircraftModelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftType(AircraftType aircraftType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aircraftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirfoilAeroPerformanceType(AirfoilAeroPerformanceType airfoilAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airfoilAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirfoilsAeroPerformanceType(AirfoilsAeroPerformanceType airfoilsAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airfoilsAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirframeMaintenanceCostType(AirframeMaintenanceCostType airframeMaintenanceCostType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airframeMaintenanceCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirlinesType(AirlinesType airlinesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airlinesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirlineType(AirlineType airlineType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airlineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirportCompatabilityGlobalType(AirportCompatabilityGlobalType airportCompatabilityGlobalType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airportCompatabilityGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirportsType(AirportsType airportsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airportsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirportType(AirportType airportType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(airportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentCrossBeamType(AlignmentCrossBeamType alignmentCrossBeamType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignmentCrossBeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentFloorPanelType(AlignmentFloorPanelType alignmentFloorPanelType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignmentFloorPanelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentStringFrameType(AlignmentStringFrameType alignmentStringFrameType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignmentStringFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignmentStructMemberType(AlignmentStructMemberType alignmentStructMemberType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alignmentStructMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltitudeType(AltitudeType altitudeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(altitudeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnisotropicShellPropertiesType(AnisotropicShellPropertiesType anisotropicShellPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anisotropicShellPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnisotropicSolidPropertiesType(AnisotropicSolidPropertiesType anisotropicSolidPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anisotropicSolidPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtmosphericModelOldType(AtmosphericModelOldType atmosphericModelOldType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atmosphericModelOldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtmosphericModelType(AtmosphericModelType atmosphericModelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atmosphericModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtmosphericModelType1(AtmosphericModelType1 atmosphericModelType1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atmosphericModelType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachmentPinsType(AttachmentPinsType attachmentPinsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachmentPinsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachmentPinType(AttachmentPinType attachmentPinType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachmentPinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxleAssembliesType(AxleAssembliesType axleAssembliesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axleAssembliesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxleAssemblyType(AxleAssemblyType axleAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axleAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxleType(AxleType axleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeamCrossSectionType(BeamCrossSectionType beamCrossSectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beamCrossSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeamStiffnessType(BeamStiffnessType beamStiffnessType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beamStiffnessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockedDOFType(BlockedDOFType blockedDOFType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockedDOFType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBogieType(BogieType bogieType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bogieType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanBaseType(BooleanBaseType booleanBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingBoxType(BoundingBoxType boundingBoxType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingElementUIDsType(BoundingElementUIDsType boundingElementUIDsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingElementUIDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinAislesType(CabinAislesType cabinAislesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinAislesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinAisleType(CabinAisleType cabinAisleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinAisleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinGeometryContoursType(CabinGeometryContoursType cabinGeometryContoursType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinGeometryContoursType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinGeometryContourType(CabinGeometryContourType cabinGeometryContourType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinGeometryContourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinGeometryType(CabinGeometryType cabinGeometryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinSpacesType(CabinSpacesType cabinSpacesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinSpacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabinSpaceType(CabinSpaceType cabinSpaceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalibratedAirSpeedType(CalibratedAirSpeedType calibratedAirSpeedType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calibratedAirSpeedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapType(CapType capType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoContainerElementsType(CargoContainerElementsType cargoContainerElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoContainerElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoContainerElementType(CargoContainerElementType cargoContainerElementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoContainerElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoContainersType(CargoContainersType cargoContainersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoContainersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoContainerType(CargoContainerType cargoContainerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoCrossBeamsAssemblyType(CargoCrossBeamsAssemblyType cargoCrossBeamsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoCrossBeamsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoCrossBeamStrutsAssemblyType(
			CargoCrossBeamStrutsAssemblyType cargoCrossBeamStrutsAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoCrossBeamStrutsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCargoDoorsAssemblyType(CargoDoorsAssemblyType cargoDoorsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cargoDoorsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCeilingPanelElementsType(CeilingPanelElementsType ceilingPanelElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ceilingPanelElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCeilingPanelsType(CeilingPanelsType ceilingPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ceilingPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellPositioningChordwiseType(CellPositioningChordwiseType cellPositioningChordwiseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellPositioningChordwiseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellPositioningSpanwiseType(CellPositioningSpanwiseType cellPositioningSpanwiseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellPositioningSpanwiseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageAreasAssemblyType(
			CenterFuselageAreasAssemblyType centerFuselageAreasAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageAreasAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageAreaType(CenterFuselageAreaType centerFuselageAreaType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageHighWingConfigurationType(
			CenterFuselageHighWingConfigurationType centerFuselageHighWingConfigurationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageHighWingConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageKeelbeamType(CenterFuselageKeelbeamType centerFuselageKeelbeamType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageKeelbeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageLateralPanelsType(
			CenterFuselageLateralPanelsType centerFuselageLateralPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageLateralPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageLongFloorBeamsConnectionType(
			CenterFuselageLongFloorBeamsConnectionType centerFuselageLongFloorBeamsConnectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageLongFloorBeamsConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageLowWingConfigurationType(
			CenterFuselageLowWingConfigurationType centerFuselageLowWingConfigurationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageLowWingConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageMainFramesType(CenterFuselageMainFramesType centerFuselageMainFramesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageMainFramesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselagePressureFloorType(
			CenterFuselagePressureFloorType centerFuselagePressureFloorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselagePressureFloorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterFuselageSideboxType(CenterFuselageSideboxType centerFuselageSideboxType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerFuselageSideboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificationCasesType(CertificationCasesType certificationCasesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificationCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeLogType(ChangeLogType changeLogType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeLogType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargesCostType(ChargesCostType chargesCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargesCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChordwisePartsType(ChordwisePartsType chordwisePartsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chordwisePartsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChordwisePartType(ChordwisePartType chordwisePartType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chordwisePartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDividerElementsType(ClassDividerElementsType classDividerElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDividerElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDividersType(ClassDividersType classDividersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDividersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCockpitControlsType(CockpitControlsType cockpitControlsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cockpitControlsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCockpitControlType(CockpitControlType cockpitControlType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cockpitControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientReferenceType(CoefficientReferenceType coefficientReferenceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownComponentsType(
			CoefficientsBreakdownComponentsType coefficientsBreakdownComponentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownComponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownComponentType(
			CoefficientsBreakdownComponentType coefficientsBreakdownComponentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownSegmentType(
			CoefficientsBreakdownSegmentType coefficientsBreakdownSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownStripsType(
			CoefficientsBreakdownStripsType coefficientsBreakdownStripsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownStripsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownStripType(CoefficientsBreakdownStripType coefficientsBreakdownStripType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownStripType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownType(CoefficientsBreakdownType coefficientsBreakdownType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownWingSegmentsType(
			CoefficientsBreakdownWingSegmentsType coefficientsBreakdownWingSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownWingSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownWingsType(CoefficientsBreakdownWingsType coefficientsBreakdownWingsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownWingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoefficientsBreakdownWingType(CoefficientsBreakdownWingType coefficientsBreakdownWingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coefficientsBreakdownWingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandCaseCommandType(CommandCaseCommandType commandCaseCommandType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandCaseCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandCasesType(CommandCasesType commandCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandCaseType(CommandCaseType commandCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentGeometryType(CompartmentGeometryType compartmentGeometryType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentsType(CompartmentsType compartmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentType(CompartmentType compartmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexBaseType(ComplexBaseType complexBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentCostType(ComponentCostType componentCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSegmentPathType(ComponentSegmentPathType componentSegmentPathType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSegmentPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSegmentStepsType(ComponentSegmentStepsType componentSegmentStepsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSegmentStepsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSegmentStepType(ComponentSegmentStepType componentSegmentStepType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSegmentStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSegmentsType(ComponentSegmentsType componentSegmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSegmentType(ComponentSegmentType componentSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeLayerType(CompositeLayerType compositeLayerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeLayerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositesType(CompositesType compositesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeType(CompositeType compositeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationType(ConfigurationType configurationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivitiesType(ConnectivitiesType connectivitiesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectivitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityType(ConnectivityType connectivityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectivityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSettingsType(ConstraintSettingsType constraintSettingsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintsType(ConstraintsType constraintsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityAtP1Type(ContinuityAtP1Type continuityAtP1Type, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityAtP1Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityAtP2Type(ContinuityAtP2Type continuityAtP2Type, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityAtP2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityType(ContinuityType continuityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityType1(ContinuityType1 continuityType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityType2(ContinuityType2 continuityType2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityType3(ContinuityType3 continuityType3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityType4(ContinuityType4 continuityType4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuityType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourReferenceType(ContourReferenceType contourReferenceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contourReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourType(ContourType contourType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDistributorsType(ControlDistributorsType controlDistributorsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlDistributorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDistributorType(ControlDistributorType controlDistributorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlDistributorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlElementsType(ControlElementsType controlElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlElementType(ControlElementType controlElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFunctionsType(ControlFunctionsType controlFunctionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlFunctionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFunctionType(ControlFunctionType controlFunctionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllabilityReqsType(ControllabilityReqsType controllabilityReqsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controllabilityReqsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllabilityRequirementType(ControllabilityRequirementType controllabilityRequirementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controllabilityRequirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlLawModesType(ControlLawModesType controlLawModesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlLawModesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlLawModeType(ControlLawModeType controlLawModeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlLawModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlLawsType(ControlLawsType controlLawsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlLawsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceActuatorsType(ControlSurfaceActuatorsType controlSurfaceActuatorsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceActuatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceActuatorType(ControlSurfaceActuatorType controlSurfaceActuatorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceActuatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceAirfoilType(ControlSurfaceAirfoilType controlSurfaceAirfoilType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceAirfoilType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceBorderLeadingEdgeType(
			ControlSurfaceBorderLeadingEdgeType controlSurfaceBorderLeadingEdgeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceBorderLeadingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceBorderSpoilerType(
			ControlSurfaceBorderSpoilerType controlSurfaceBorderSpoilerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceBorderSpoilerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceBorderTrailingEdgeType(
			ControlSurfaceBorderTrailingEdgeType controlSurfaceBorderTrailingEdgeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceBorderTrailingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceContoursType(ControlSurfaceContoursType controlSurfaceContoursType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceContoursType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceDeflectionVectorsType(
			ControlSurfaceDeflectionVectorsType controlSurfaceDeflectionVectorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceDeflectionVectorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceDeflectionVectorType(
			ControlSurfaceDeflectionVectorType controlSurfaceDeflectionVectorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceDeflectionVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceHingeMomentMapsType(
			ControlSurfaceHingeMomentMapsType controlSurfaceHingeMomentMapsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceHingeMomentMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceHingeMomentMapType(
			ControlSurfaceHingeMomentMapType controlSurfaceHingeMomentMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceHingeMomentMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceHingePointType(ControlSurfaceHingePointType controlSurfaceHingePointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceHingePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceOuterShapeLeadingEdgeType(
			ControlSurfaceOuterShapeLeadingEdgeType controlSurfaceOuterShapeLeadingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceOuterShapeLeadingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceOuterShapeSpoilerType(
			ControlSurfaceOuterShapeSpoilerType controlSurfaceOuterShapeSpoilerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceOuterShapeSpoilerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceOuterShapeTrailingEdgeType(
			ControlSurfaceOuterShapeTrailingEdgeType controlSurfaceOuterShapeTrailingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceOuterShapeTrailingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfacePathType(ControlSurfacePathType controlSurfacePathType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfacePathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfacePerformanceMapOldType(
			ControlSurfacePerformanceMapOldType controlSurfacePerformanceMapOldType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfacePerformanceMapOldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfacePerformanceMapsOldType(
			ControlSurfacePerformanceMapsOldType controlSurfacePerformanceMapsOldType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfacePerformanceMapsOldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceSkinCutOutBorderType(
			ControlSurfaceSkinCutOutBorderType controlSurfaceSkinCutOutBorderType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceSkinCutOutBorderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceSkinCutOutType(ControlSurfaceSkinCutOutType controlSurfaceSkinCutOutType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceSkinCutOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceStepsType(ControlSurfaceStepsType controlSurfaceStepsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceStepsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceStepType(ControlSurfaceStepType controlSurfaceStepType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfacesType(ControlSurfacesType controlSurfacesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceTracksType(ControlSurfaceTracksType controlSurfaceTracksType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceTracksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceTrackTypeType(ControlSurfaceTrackTypeType controlSurfaceTrackTypeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceTrackTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlSurfaceWingCutOutType(ControlSurfaceWingCutOutType controlSurfaceWingCutOutType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlSurfaceWingCutOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCornerRadiusType(CornerRadiusType cornerRadiusType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cornerRadiusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostAirConditioningSystemsType(CostAirConditioningSystemsType costAirConditioningSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costAirConditioningSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostAutomaticFlightSystemsType(CostAutomaticFlightSystemsType costAutomaticFlightSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costAutomaticFlightSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostAuxilaryPowerUnitsType(CostAuxilaryPowerUnitsType costAuxilaryPowerUnitsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costAuxilaryPowerUnitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostBleedAirSystemsType(CostBleedAirSystemsType costBleedAirSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costBleedAirSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostCommunicationSystemsType(CostCommunicationSystemsType costCommunicationSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costCommunicationSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostComponentsType(CostComponentsType costComponentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costComponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostDeIcingSystemsType(CostDeIcingSystemsType costDeIcingSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costDeIcingSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostElectricalSystemsType(CostElectricalSystemsType costElectricalSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costElectricalSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostEnginePylonsType(CostEnginePylonsType costEnginePylonsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costEnginePylonsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostEquippedEnginesType(CostEquippedEnginesType costEquippedEnginesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costEquippedEnginesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFireProtectionSystemsType(CostFireProtectionSystemsType costFireProtectionSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFireProtectionSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFixedEmergencyOxygenSystemsType(
			CostFixedEmergencyOxygenSystemsType costFixedEmergencyOxygenSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFixedEmergencyOxygenSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFlightControlSystemsType(CostFlightControlSystemsType costFlightControlSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFlightControlSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFuelSystemsType(CostFuelSystemsType costFuelSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFuelSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFurnishingElementsType(CostFurnishingElementsType costFurnishingElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFurnishingElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFurnishingsType(CostFurnishingsType costFurnishingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFurnishingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostFuselagesType(CostFuselagesType costFuselagesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costFuselagesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostHydraulicSystemsType(CostHydraulicSystemsType costHydraulicSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costHydraulicSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostInstrumentSystemsType(CostInstrumentSystemsType costInstrumentSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costInstrumentSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostLandingGearType(CostLandingGearType costLandingGearType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costLandingGearType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostLightingSystemsType(CostLightingSystemsType costLightingSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costLightingSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostNacellesType(CostNacellesType costNacellesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costNacellesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostNavigationSystemsType(CostNavigationSystemsType costNavigationSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costNavigationSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostPowerUnitsType(CostPowerUnitsType costPowerUnitsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costPowerUnitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostSystemsType(CostSystemsType costSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostWaterInstallationSystemsType(
			CostWaterInstallationSystemsType costWaterInstallationSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costWaterInstallationSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostWingsType(CostWingsType costWingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(costWingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpacsType(CpacsType cpacsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpacsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrashLoadCasesType(CrashLoadCasesType crashLoadCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crashLoadCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrashLoadcaseType(CrashLoadcaseType crashLoadcaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crashLoadcaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrewCostType(CrewCostType crewCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crewCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBeamAssemblyPositionType(CrossBeamAssemblyPositionType crossBeamAssemblyPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossBeamAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBeamStrutAssemblyPositionType(
			CrossBeamStrutAssemblyPositionType crossBeamStrutAssemblyPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossBeamStrutAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCruiseRollersType(CruiseRollersType cruiseRollersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cruiseRollersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCruiseRollerType(CruiseRollerType cruiseRollerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cruiseRollerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCst2DType(Cst2DType cst2DType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cst2DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveParamPointMapType(CurveParamPointMapType curveParamPointMapType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveParamPointMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurvePointListXYZType(CurvePointListXYZType curvePointListXYZType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curvePointListXYZType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurvePointType(CurvePointType curvePointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curvePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveProfilesType(CurveProfilesType curveProfilesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutLoadPointsType(CutLoadPointsType cutLoadPointsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutLoadPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOutControlPointsType(CutOutControlPointsType cutOutControlPointsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOutControlPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOutControlPointType(CutOutControlPointType cutOutControlPointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOutControlPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOutProfilesType(CutOutProfilesType cutOutProfilesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOutProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOutProfileType(CutOutProfileType cutOutProfileType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOutProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOutType(CutOutType cutOutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutoutTypeType(CutoutTypeType cutoutTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutoutTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDampingDerivativesRatesArrayType(
			DampingDerivativesRatesArrayType dampingDerivativesRatesArrayType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dampingDerivativesRatesArrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDampingDerivativesRatesType(DampingDerivativesRatesType dampingDerivativesRatesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dampingDerivativesRatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDampingDerivativesType(DampingDerivativesType dampingDerivativesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dampingDerivativesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDamTolBehaviourType(DamTolBehaviourType damTolBehaviourType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(damTolBehaviourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDamTolFormanType(DamTolFormanType damTolFormanType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(damTolFormanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDamTolWalkerType(DamTolWalkerType damTolWalkerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(damTolWalkerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateBaseType(DateBaseType dateBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeBaseType(DateTimeBaseType dateTimeBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckComponent2DBaseType(DeckComponent2DBaseType deckComponent2DBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckComponent2DBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckComponentBaseType(DeckComponentBaseType deckComponentBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckComponentBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckDoorsType(DeckDoorsType deckDoorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckDoorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckDoorType(DeckDoorType deckDoorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckDoorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckElementBaseType(DeckElementBaseType deckElementBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckElementBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckElementGeometryType(DeckElementGeometryType deckElementGeometryType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckElementGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckElementMassType(DeckElementMassType deckElementMassType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckElementMassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckElementsType(DeckElementsType deckElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckStructuralMountsType(DeckStructuralMountsType deckStructuralMountsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckStructuralMountsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckStructuralMountType(DeckStructuralMountType deckStructuralMountType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckStructuralMountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecksType(DecksType decksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckType(DeckType deckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeckTypeType(DeckTypeType deckTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deckTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeltaTemperatureType(DeltaTemperatureType deltaTemperatureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deltaTemperatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignMassesType(DesignMassesType designMassesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designMassesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignParametersType(DesignParametersType designParametersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignParameterType(DesignParameterType designParameterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designParameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignSpaceType(DesignSpaceType designSpaceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignStudiesType(DesignStudiesType designStudiesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designStudiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignVolumeType(DesignVolumeType designVolumeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designVolumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectOperatingCostType(DirectOperatingCostType directOperatingCostType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directOperatingCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivergenceCasesType(DivergenceCasesType divergenceCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divergenceCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivergenceCaseType(DivergenceCaseType divergenceCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divergenceCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorAssemblyPositionType(DoorAssemblyPositionType doorAssemblyPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorCutOutType(DoorCutOutType doorCutOutType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorCutOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorOpeningLegacyType(DoorOpeningLegacyType doorOpeningLegacyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorOpeningLegacyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorOpeningType(DoorOpeningType doorOpeningType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorOpeningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorsType(DoorsType doorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorSurroundStructurePositionType(
			DoorSurroundStructurePositionType doorSurroundStructurePositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorSurroundStructurePositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorSurroundStructuresAssemblyType(
			DoorSurroundStructuresAssemblyType doorSurroundStructuresAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorSurroundStructuresAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorTypeType(DoorTypeType doorTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorTypeType1(DoorTypeType1 doorTypeType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doorTypeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleArrayBaseType(DoubleArrayBaseType doubleArrayBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleArrayBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBaseType(DoubleBaseType doubleBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleConstraintBaseType(DoubleConstraintBaseType doubleConstraintBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleConstraintBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleVectorBaseType(DoubleVectorBaseType doubleVectorBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleVectorBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleVectorConstraintBaseType(DoubleVectorConstraintBaseType doubleVectorConstraintBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleVectorConstraintBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDragContributionsType(DragContributionsType dragContributionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dragContributionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriveSystemsType(DriveSystemsType driveSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(driveSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriveSystemType(DriveSystemType driveSystemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(driveSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationType(DurationType durationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicAircraftModelAnalysisType(
			DynamicAircraftModelAnalysisType dynamicAircraftModelAnalysisType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicAircraftModelAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmissivityMapType(EmissivityMapType emissivityMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emissivityMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTimeUTCType(EndTimeUTCType endTimeUTCType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endTimeUTCType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineAnalysisType(EngineAnalysisType engineAnalysisType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineConceptType(EngineConceptType engineConceptType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineConceptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineFanType(EngineFanType engineFanType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineFanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineGeometryType(EngineGeometryType engineGeometryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineGlobalType(EngineGlobalType engineGlobalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineMountsType(EngineMountsType engineMountsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineMountsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineMountType(EngineMountType engineMountType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineMountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineNacelleType(EngineNacelleType engineNacelleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineNacelleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePerformanceMapsType(EnginePerformanceMapsType enginePerformanceMapsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePerformanceMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePerformanceMapType(EnginePerformanceMapType enginePerformanceMapType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePerformanceMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePositionsType(EnginePositionsType enginePositionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePositionType(EnginePositionType enginePositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePylonsType(EnginePylonsType enginePylonsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePylonsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginePylonType(EnginePylonType enginePylonType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginePylonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineSpinnerType(EngineSpinnerType engineSpinnerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineSpinnerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnginesType(EnginesType enginesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enginesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineType(EngineType engineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentType(EnvironmentType environmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtaIsoLineType(EtaIsoLineType etaIsoLineType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etaIsoLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtaXsiPointType(EtaXsiPointType etaXsiPointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etaXsiPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtaXsiRelHeightPointType(EtaXsiRelHeightPointType etaXsiRelHeightPointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etaXsiRelHeightPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFatigueBehaviourType(FatigueBehaviourType fatigueBehaviourType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fatigueBehaviourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFatigueStressBasedBrownMillerType(
			FatigueStressBasedBrownMillerType fatigueStressBasedBrownMillerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fatigueStressBasedBrownMillerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFleetType(FleetType fleetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fleetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightAnalysisType(FlightAnalysisType flightAnalysisType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightDynamicsAnalysisType(FlightDynamicsAnalysisType flightDynamicsAnalysisType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightDynamicsAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightDynamicsLinearModelType(FlightDynamicsLinearModelType flightDynamicsLinearModelType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightDynamicsLinearModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightDynamicsTrimResultType(FlightDynamicsTrimResultType flightDynamicsTrimResultType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightDynamicsTrimResultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightEnvelopeSpeedType(FlightEnvelopeSpeedType flightEnvelopeSpeedType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightEnvelopeSpeedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightEnvelopesType(FlightEnvelopesType flightEnvelopesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightEnvelopesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightEnvelopeType(FlightEnvelopeType flightEnvelopeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightEnvelopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightLoadCasesType(FlightLoadCasesType flightLoadCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightLoadCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightLoadConditionsType(FlightLoadConditionsType flightLoadConditionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightLoadConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightLoadDataType(FlightLoadDataType flightLoadDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightLoadDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPathAngleType(FlightPathAngleType flightPathAngleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPathAngleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPathType(FlightPathType flightPathType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceCasesType(FlightPerformanceCasesType flightPerformanceCasesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceCaseType(FlightPerformanceCaseType flightPerformanceCaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceLandingType(FlightPerformanceLandingType flightPerformanceLandingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceLandingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceLevelType(FlightPerformanceLevelType flightPerformanceLevelType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceRequirementsType(
			FlightPerformanceRequirementsType flightPerformanceRequirementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceRequirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceRequirementType(
			FlightPerformanceRequirementType flightPerformanceRequirementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceRequirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceTakeoffType(FlightPerformanceTakeoffType flightPerformanceTakeoffType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceTakeoffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPerformanceTurnType(FlightPerformanceTurnType flightPerformanceTurnType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPerformanceTurnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPointsType(FlightPointsType flightPointsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightPointType(FlightPointType flightPointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightsType(FlightsType flightsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightSystemsType(FlightSystemsType flightSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlightType(FlightType flightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloorPanelsType(FloorPanelsType floorPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floorPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloorPanelType(FloorPanelType floorPanelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floorPanelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlyingQualitiesCasesType(FlyingQualitiesCasesType flyingQualitiesCasesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flyingQualitiesCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlyingQualitiesCaseType(FlyingQualitiesCaseType flyingQualitiesCaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flyingQualitiesCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqCharParametersType(FqCharParametersType fqCharParametersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqCharParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqEiglatType(FqEiglatType fqEiglatType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqEiglatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqLateralType(FqLateralType fqLateralType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqLateralType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqLongitudinalType(FqLongitudinalType fqLongitudinalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqLongitudinalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqPhugoidType(FqPhugoidType fqPhugoidType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqPhugoidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqRatingsType(FqRatingsType fqRatingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqRatingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqRollPerfType(FqRollPerfType fqRollPerfType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqRollPerfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqRoloscType(FqRoloscType fqRoloscType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqRoloscType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqShortPeriodType(FqShortPeriodType fqShortPeriodType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqShortPeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqTreffType(FqTreffType fqTreffType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqTreffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramesAssemblyType(FramesAssemblyType framesAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(framesAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameType(FrameType frameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreePathType(FreePathType freePathType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freePathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelConsumedType(FuelConsumedType fuelConsumedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelConsumedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelFractionType(FuelFractionType fuelFractionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelFractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelInTankType(FuelInTankType fuelInTankType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelInTankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelMassFractionType(FuelMassFractionType fuelMassFractionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelMassFractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelPlanningTypeType(FuelPlanningTypeType fuelPlanningTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelPlanningTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelRemainingType(FuelRemainingType fuelRemainingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelRemainingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelsType(FuelsType fuelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelTankVolumeType(FuelTankVolumeType fuelTankVolumeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelTankVolumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuelType(FuelType fuelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageAeroPerformanceType(FuselageAeroPerformanceType fuselageAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageCutOutsType(FuselageCutOutsType fuselageCutOutsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageCutOutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageCutOutType(FuselageCutOutType fuselageCutOutType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageCutOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageElementsType(FuselageElementsType fuselageElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageElementType(FuselageElementType fuselageElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageFuelTanksType(FuselageFuelTanksType fuselageFuelTanksType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageFuelTanksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageFuelTankType(FuselageFuelTankType fuselageFuelTankType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageFuelTankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageProfilesType(FuselageProfilesType fuselageProfilesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselagesAeroPerformanceType(FuselagesAeroPerformanceType fuselagesAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselagesAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageSectionsType(FuselageSectionsType fuselageSectionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageSectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageSectionType(FuselageSectionType fuselageSectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageSegmentsType(FuselageSegmentsType fuselageSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageSegmentType(FuselageSegmentType fuselageSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageStructureType(FuselageStructureType fuselageStructureType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselagesType(FuselagesType fuselagesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselagesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuselageType(FuselageType fuselageType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fuselageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleyElementsType(GalleyElementsType galleyElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(galleyElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleyElementType(GalleyElementType galleyElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(galleyElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleysType(GalleysType galleysType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(galleysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGearDeflectionVectorsType(GearDeflectionVectorsType gearDeflectionVectorsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gearDeflectionVectorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGearDeflectionVectorType(GearDeflectionVectorType gearDeflectionVectorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gearDeflectionVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStructuralMemberPositionType(
			GeneralStructuralMemberPositionType generalStructuralMemberPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalStructuralMemberPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStructuralMembersAssemblyType(
			GeneralStructuralMembersAssemblyType generalStructuralMembersAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalStructuralMembersAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStructuralMemberType(GeneralStructuralMemberType generalStructuralMemberType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalStructuralMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericCostType(GenericCostType genericCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericFloorElementsType(GenericFloorElementsType genericFloorElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericFloorElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericFloorModulesType(GenericFloorModulesType genericFloorModulesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericFloorModulesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericGeometricComponentType(GenericGeometricComponentType genericGeometricComponentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericGeometricComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericGeometryComponentsType(GenericGeometryComponentsType genericGeometryComponentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericGeometryComponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericGeometryComponentType(GenericGeometryComponentType genericGeometryComponentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericGeometryComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericMassType(GenericMassType genericMassType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericMassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericSystemsType(GenericSystemsType genericSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericSystemType(GenericSystemType genericSystemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicPointConstraintType(GeographicPointConstraintType geographicPointConstraintType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geographicPointConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicPointType(GeographicPointType geographicPointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geographicPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalAeroPerformanceType(GlobalAeroPerformanceType globalAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBeamPropertiesType(GlobalBeamPropertiesType globalBeamPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalBeamPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFlightPointType(GlobalFlightPointType globalFlightPointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalFlightPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalPerformanceCasesType(GlobalPerformanceCasesType globalPerformanceCasesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalPerformanceCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroundLoadCasesType(GroundLoadCasesType groundLoadCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groundLoadCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideCurveProfileGeometryType(GuideCurveProfileGeometryType guideCurveProfileGeometryType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideCurveProfileGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideCurveProfilesType(GuideCurveProfilesType guideCurveProfilesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideCurveProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideCurvesType(GuideCurvesType guideCurvesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideCurvesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideCurveType(GuideCurveType guideCurveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGustShapeType(GustShapeType gustShapeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gustShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderType(HeaderType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadingType(HeadingType headingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHingeMomentsMapType(HingeMomentsMapType hingeMomentsMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hingeMomentsMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHtpFwdInterfaceDefType(HtpFwdInterfaceDefType htpFwdInterfaceDefType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htpFwdInterfaceDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHtpInterfaceDefType(HtpInterfaceDefType htpInterfaceDefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htpInterfaceDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHtpStructElemDefType(HtpStructElemDefType htpStructElemDefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htpStructElemDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactSurfaceDefinitionType(ImpactSurfaceDefinitionType impactSurfaceDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impactSurfaceDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndirectOperatingCostType(IndirectOperatingCostType indirectOperatingCostType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indirectOperatingCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerBaseType(IntegerBaseType integerBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterConnectionStrutAttachmentType(
			InterConnectionStrutAttachmentType interConnectionStrutAttachmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interConnectionStrutAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterconnectionStrutsType(InterconnectionStrutsType interconnectionStrutsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interconnectionStrutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterconnectionStrutType(InterconnectionStrutType interconnectionStrutType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interconnectionStrutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntercostalPositionType(IntercostalPositionType intercostalPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intercostalPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntercostalsAssemblyType(IntercostalsAssemblyType intercostalsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intercostalsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefinitionsType(InterfaceDefinitionsType interfaceDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalPressuresType(InternalPressuresType internalPressuresType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalPressuresType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalPressureType(InternalPressureType internalPressureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalPressureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolationType(InterpolationType interpolationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interpolationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolationType1(InterpolationType1 interpolationType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interpolationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolationType2(InterpolationType2 interpolationType2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interpolationType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsotropicPropertiesType(IsotropicPropertiesType isotropicPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isotropicPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearBaseType(LandingGearBaseType landingGearBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearBrakingStateType(LandingGearBrakingStateType landingGearBrakingStateType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearBrakingStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearComponentAssemblyType(
			LandingGearComponentAssemblyType landingGearComponentAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearComponentAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearControlFunctionsType(
			LandingGearControlFunctionsType landingGearControlFunctionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearControlFunctionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearControlType(LandingGearControlType landingGearControlType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearExtensionFunctionStepType(
			LandingGearExtensionFunctionStepType landingGearExtensionFunctionStepType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearExtensionFunctionStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearExtensionFunctionType(
			LandingGearExtensionFunctionType landingGearExtensionFunctionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearExtensionFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceDefinitionsType(
			LandingGearInterfaceDefinitionsType landingGearInterfaceDefinitionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceKeelbeamType(
			LandingGearInterfaceKeelbeamType landingGearInterfaceKeelbeamType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceKeelbeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceLateralPanelsType(
			LandingGearInterfaceLateralPanelsType landingGearInterfaceLateralPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceLateralPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceLongFloorBeamsConnectionType(
			LandingGearInterfaceLongFloorBeamsConnectionType landingGearInterfaceLongFloorBeamsConnectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceLongFloorBeamsConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceMainFramesType(
			LandingGearInterfaceMainFramesType landingGearInterfaceMainFramesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceMainFramesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfacePressureFloorType(
			LandingGearInterfacePressureFloorType landingGearInterfacePressureFloorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfacePressureFloorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearInterfaceSideboxType(
			LandingGearInterfaceSideboxType landingGearInterfaceSideboxType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearInterfaceSideboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearPositionSafetyMarginsType(
			LandingGearPositionSafetyMarginsType landingGearPositionSafetyMarginsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearPositionSafetyMarginsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearSteeringFunctionStepType(
			LandingGearSteeringFunctionStepType landingGearSteeringFunctionStepType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearSteeringFunctionStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearSteeringFunctionType(
			LandingGearSteeringFunctionType landingGearSteeringFunctionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearSteeringFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearStrutAttachmentType(LandingGearStrutAttachmentType landingGearStrutAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearStrutAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearsType(LandingGearsType landingGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearSupportBeamPositionType(
			LandingGearSupportBeamPositionType landingGearSupportBeamPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearSupportBeamPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingGearType(LandingGearType landingGearType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingGearType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLateralCapType(LateralCapType lateralCapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lateralCapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType(LatitudeType latitudeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latitudeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLavatoriesType(LavatoriesType lavatoriesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lavatoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLavatoryElementsType(LavatoryElementsType lavatoryElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lavatoryElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeadingEdgeDevicesType(LeadingEdgeDevicesType leadingEdgeDevicesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leadingEdgeDevicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeadingEdgeDeviceType(LeadingEdgeDeviceType leadingEdgeDeviceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leadingEdgeDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeadingEdgeHollowType(LeadingEdgeHollowType leadingEdgeHollowType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leadingEdgeHollowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeadingEdgeShapeType(LeadingEdgeShapeType leadingEdgeShapeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leadingEdgeShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinerType(LinerType linerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkToFileType(LinkToFileType linkToFileType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkToFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadAnalysisType(LoadAnalysisType loadAnalysisType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadApplicationPointSetsType(LoadApplicationPointSetsType loadApplicationPointSetsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadApplicationPointSetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadApplicationPointSetType(LoadApplicationPointSetType loadApplicationPointSetType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadApplicationPointSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadApplicationPointsType(LoadApplicationPointsType loadApplicationPointsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadApplicationPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBreakdownType(LoadBreakdownType loadBreakdownType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBreakdownType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseAccelerationsType(LoadCaseAccelerationsType loadCaseAccelerationsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseAccelerationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseGustType(LoadCaseGustType loadCaseGustType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseGustType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseLoadFactorsType(LoadCaseLoadFactorsType loadCaseLoadFactorsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseLoadFactorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseSpecificationType(LoadCaseSpecificationType loadCaseSpecificationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseSpecificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCasesType(LoadCasesType loadCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseSuperpositionType(LoadCaseSuperpositionType loadCaseSuperpositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseSuperpositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadCaseType(LoadCaseType loadCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadEnvelopesType(LoadEnvelopesType loadEnvelopesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadEnvelopesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadEnvelopeType(LoadEnvelopeType loadEnvelopeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadEnvelopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadReferenceLineType(LoadReferenceLineType loadReferenceLineType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadReferenceLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadReferencePointType(LoadReferencePointType loadReferencePointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadReferencePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadSetsType(LoadSetsType loadSetsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadSetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadSetType(LoadSetType loadSetType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogEntryType(LogEntryType logEntryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongFloorBeamPositionType(LongFloorBeamPositionType longFloorBeamPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longFloorBeamPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongFloorBeamsAssemblyType(LongFloorBeamsAssemblyType longFloorBeamsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longFloorBeamsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongFloorBeamType(LongFloorBeamType longFloorBeamType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longFloorBeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType(LongitudeType longitudeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longitudeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerHeightFractionType(LowerHeightFractionType lowerHeightFractionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lowerHeightFractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageCompartmentElementsType(LuggageCompartmentElementsType luggageCompartmentElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageCompartmentElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageCompartmentsType(LuggageCompartmentsType luggageCompartmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageCompartmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachNumberType(MachNumberType machNumberType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAdditionalCenterTanksType(MAdditionalCenterTanksType mAdditionalCenterTanksType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mAdditionalCenterTanksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainActuatorType(MainActuatorType mainActuatorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainActuatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainGearsType(MainGearsType mainGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutInterfaceDefinitionsType(
			MainStrutInterfaceDefinitionsType mainStrutInterfaceDefinitionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainStrutInterfaceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutWingFuselageAttachmentType(
			MainStrutWingFuselageAttachmentType mainStrutWingFuselageAttachmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainStrutWingFuselageAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaintenanceCostType(MaintenanceCostType maintenanceCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maintenanceCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAirConditioningType(MAirConditioningType mAirConditioningType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mAirConditioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassBreakdownType(MassBreakdownType massBreakdownType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massBreakdownType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassFractionType(MassFractionType massFractionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massFractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassInertiaType(MassInertiaType massInertiaType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massInertiaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassInertiaVectorType(MassInertiaVectorType massInertiaVectorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massInertiaVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialDefinitionForProfileBasedPointType(
			MaterialDefinitionForProfileBasedPointType materialDefinitionForProfileBasedPointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialDefinitionForProfileBasedPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialDefinitionForProfileBasedType(
			MaterialDefinitionForProfileBasedType materialDefinitionForProfileBasedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialDefinitionForProfileBasedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialDefinitionType(MaterialDefinitionType materialDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialsType(MaterialsType materialsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialType(MaterialType materialType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAutomaticFlightSystemType(MAutomaticFlightSystemType mAutomaticFlightSystemType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mAutomaticFlightSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAuxillaryPowerUnitType(MAuxillaryPowerUnitType mAuxillaryPowerUnitType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mAuxillaryPowerUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBellyFairingsType(MBellyFairingsType mBellyFairingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mBellyFairingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBleedAirSystemType(MBleedAirSystemType mBleedAirSystemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mBleedAirSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBulkCargosType(MBulkCargosType mBulkCargosType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mBulkCargosType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBulkCargoType(MBulkCargoType mBulkCargoType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mBulkCargoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMBulkheadsType(MBulkheadsType mBulkheadsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mBulkheadsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCabinFloorsType(MCabinFloorsType mCabinFloorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCabinFloorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCabinLightingsType(MCabinLightingsType mCabinLightingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCabinLightingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCargoFloorsType(MCargoFloorsType mCargoFloorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCargoFloorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCargoLiningsType(MCargoLiningsType mCargoLiningsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCargoLiningsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCargoLoadingsType(MCargoLoadingsType mCargoLoadingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCargoLoadingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCargoType(MCargoType mCargoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCargoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCarriagesType(MCarriagesType mCarriagesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCarriagesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCarryOnsType(MCarryOnsType mCarryOnsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCarryOnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCarryOnType(MCarryOnType mCarryOnType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCarryOnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCateringsType(MCateringsType mCateringsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCateringsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCellsType(MCellsType mCellsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCockpitLightingsType(MCockpitLightingsType mCockpitLightingsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCockpitLightingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCommunicationType(MCommunicationType mCommunicationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCommunicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMComponentSegmentsType(MComponentSegmentsType mComponentSegmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mComponentSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMComponentSegmentType(MComponentSegmentType mComponentSegmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mComponentSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMControlSurfaceSupportsType(MControlSurfaceSupportsType mControlSurfaceSupportsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mControlSurfaceSupportsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMControlSurfaceSupportType(MControlSurfaceSupportType mControlSurfaceSupportType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mControlSurfaceSupportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCrewMembersType(MCrewMembersType mCrewMembersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCrewMembersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCrewSeatsType(MCrewSeatsType mCrewSeatsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mCrewSeatsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDeIcingType(MDeIcingType mDeIcingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mDeIcingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDocumentsToolsType(MDocumentsToolsType mDocumentsToolsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mDocumentsToolsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDoorsType(MDoorsType mDoorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mDoorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMElectricalDistributionType(MElectricalDistributionType mElectricalDistributionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mElectricalDistributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMElectricalGenerationType(MElectricalGenerationType mElectricalGenerationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mElectricalGenerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEmergencyEquipmentsType(MEmergencyEquipmentsType mEmergencyEquipmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEmergencyEquipmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEmergencyOxygenSystemsType(MEmergencyOxygenSystemsType mEmergencyOxygenSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEmergencyOxygenSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEmptyULDsType(MEmptyULDsType mEmptyULDsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEmptyULDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEmptyULDType(MEmptyULDType mEmptyULDType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEmptyULDType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEngineAPUOilsType(MEngineAPUOilsType mEngineAPUOilsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEngineAPUOilsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEngineControlType(MEngineControlType mEngineControlType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEngineControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEquippedEnginesType(MEquippedEnginesType mEquippedEnginesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mEquippedEnginesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMExtLightingsType(MExtLightingsType mExtLightingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mExtLightingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFireProtectionType(MFireProtectionType mFireProtectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFireProtectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFixedGalleysType(MFixedGalleysType mFixedGalleysType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFixedGalleysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFixedLeadingEdgesType(MFixedLeadingEdgesType mFixedLeadingEdgesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFixedLeadingEdgesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFixedLeadingEdgeType(MFixedLeadingEdgeType mFixedLeadingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFixedLeadingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFixedTrailingEdgesType(MFixedTrailingEdgesType mFixedTrailingEdgesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFixedTrailingEdgesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFixedTrailingEdgeType(MFixedTrailingEdgeType mFixedTrailingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFixedTrailingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFlightControlsType(MFlightControlsType mFlightControlsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFlightControlsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFloorCoveringsType(MFloorCoveringsType mFloorCoveringsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFloorCoveringsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFramesType(MFramesType mFramesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFramesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFreshWaterSystemsType(MFreshWaterSystemsType mFreshWaterSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFreshWaterSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFuelSystemType(MFuelSystemType mFuelSystemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFuelSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFuelType(MFuelType mFuelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFuelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFurnishingType(MFurnishingType mFurnishingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFurnishingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFuselagesStructureType(MFuselagesStructureType mFuselagesStructureType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFuselagesStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMFuselageStructureType(MFuselageStructureType mFuselageStructureType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mFuselageStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMHydraulicDistributionType(MHydraulicDistributionType mHydraulicDistributionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mHydraulicDistributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMHydraulicGenerationType(MHydraulicGenerationType mHydraulicGenerationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mHydraulicGenerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMIFESystemsType(MIFESystemsType mifeSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mifeSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMInstrumentPanelType(MInstrumentPanelType mInstrumentPanelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mInstrumentPanelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMInsulationsType(MInsulationsType mInsulationsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mInsulationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMIntegratedModularAvionicsType(MIntegratedModularAvionicsType mIntegratedModularAvionicsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mIntegratedModularAvionicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMInterGasSystemType(MInterGasSystemType mInterGasSystemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mInterGasSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionDefinitionsType(MissionDefinitionsType missionDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionEndRunwayType(MissionEndRunwayType missionEndRunwayType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionEndRunwayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionPerformanceMapDefinitionType(
			MissionPerformanceMapDefinitionType missionPerformanceMapDefinitionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionPerformanceMapDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentBlockConstraintsType(
			MissionSegmentBlockConstraintsType missionSegmentBlockConstraintsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentBlockConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentBlocksType(MissionSegmentBlocksType missionSegmentBlocksType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentBlocksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentBlockType(MissionSegmentBlockType missionSegmentBlockType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentEndConditionType(MissionSegmentEndConditionType missionSegmentEndConditionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentEndConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentsType(MissionSegmentsType missionSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionSegmentType(MissionSegmentType missionSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionStartConditionType(MissionStartConditionType missionStartConditionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionStartConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionStartRunwayType(MissionStartRunwayType missionStartRunwayType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionStartRunwayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionsType(MissionsType missionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMissionType(MissionType missionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(missionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLandingGearsType(MLandingGearsType mLandingGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mLandingGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLandingGearSupportsType(MLandingGearSupportsType mLandingGearSupportsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mLandingGearSupportsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLavatoriesType(MLavatoriesType mLavatoriesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mLavatoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMLiningsType(MLiningsType mLiningsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mLiningsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMainGearsType(MMainGearsType mMainGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMainGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMManufacturerEmptyType(MManufacturerEmptyType mManufacturerEmptyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mManufacturerEmptyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMillitarySystemsType(MMillitarySystemsType mMillitarySystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMillitarySystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMoveableLeadingEdgesType(MMoveableLeadingEdgesType mMoveableLeadingEdgesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMoveableLeadingEdgesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMoveableLeadingEdgeType(MMoveableLeadingEdgeType mMoveableLeadingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMoveableLeadingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMoveablesType(MMoveablesType mMoveablesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMoveablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMMoveableTrailingEdgeType(MMoveableTrailingEdgeType mMoveableTrailingEdgeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mMoveableTrailingEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMNavigationType(MNavigationType mNavigationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mNavigationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMNoseGearsType(MNoseGearsType mNoseGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mNoseGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonetaryValuesAnalysisType(MonetaryValuesAnalysisType monetaryValuesAnalysisType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monetaryValuesAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMOperatorItemsType(MOperatorItemsType mOperatorItemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mOperatorItemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMOverheadBinsType(MOverheadBinsType mOverheadBinsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mOverheadBinsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPartStowDoorsType(MPartStowDoorsType mPartStowDoorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPartStowDoorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPassengersType(MPassengersType mPassengersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPassengersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPassengerType(MPassengerType mPassengerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPassengerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPaxType(MPaxType mPaxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPaxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPayloadType(MPayloadType mPayloadType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPayloadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPowerUnitsType(MPowerUnitsType mPowerUnitsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPowerUnitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPylonAttachmentsType(MPylonAttachmentsType mPylonAttachmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPylonAttachmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPylonsType(MPylonsType mPylonsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mPylonsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRemovableCrewRestsType(MRemovableCrewRestsType mRemovableCrewRestsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mRemovableCrewRestsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRibsType(MRibsType mRibsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mRibsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMRibType(MRibType mRibType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mRibType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSeatsType(MSeatsType mSeatsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSeatsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMShellsType(MShellsType mShellsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mShellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMShellType(MShellType mShellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mShellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSkinPanelsType(MSkinPanelsType mSkinPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSkinPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSkinsType(MSkinsType mSkinsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSkinsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSparCellsType(MSparCellsType mSparCellsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSparCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSparSkinsType(MSparSkinsType mSparSkinsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSparSkinsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSparsType(MSparsType mSparsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSparsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSparType(MSparType mSparType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSparType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSpecialStructuresType(MSpecialStructuresType mSpecialStructuresType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSpecialStructuresType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSpoilersType(MSpoilersType mSpoilersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSpoilersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMStringersType(MStringersType mStringersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mStringersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMStructureType(MStructureType mStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMSystemsType(MSystemsType mSystemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMToiletFluidsType(MToiletFluidsType mToiletFluidsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mToiletFluidsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTrailingEdgeDevicesType(MTrailingEdgeDevicesType mTrailingEdgeDevicesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mTrailingEdgeDevicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTrailingEdgeDeviceType(MTrailingEdgeDeviceType mTrailingEdgeDeviceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mTrailingEdgeDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMULDContentsType(MULDContentsType muldContentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(muldContentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMULDContentType(MULDContentType muldContentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(muldContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMUnusableFuelsType(MUnusableFuelsType mUnusableFuelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mUnusableFuelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMVacuumWasteSystemsType(MVacuumWasteSystemsType mVacuumWasteSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mVacuumWasteSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWallsType(MWallsType mWallsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWallsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWasteWaterSystemsType(MWasteWaterSystemsType mWasteWaterSystemsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWasteWaterSystemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWaterReservoirsType(MWaterReservoirsType mWaterReservoirsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWaterReservoirsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWindowsType(MWindowsType mWindowsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWindowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWingBoxType(MWingBoxType mWingBoxType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWingBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWingsStructureType(MWingsStructureType mWingsStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWingsStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMWingStructureType(MWingStructureType mWingStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mWingStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleCenterCowlType(NacelleCenterCowlType nacelleCenterCowlType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleCenterCowlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleCowlType(NacelleCowlType nacelleCowlType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleCowlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleGuideCurvesType(NacelleGuideCurvesType nacelleGuideCurvesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleGuideCurvesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleGuideCurveType(NacelleGuideCurveType nacelleGuideCurveType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleGuideCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleProfilesType(NacelleProfilesType nacelleProfilesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleSectionsType(NacelleSectionsType nacelleSectionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleSectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNacelleSectionType(NacelleSectionType nacelleSectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nacelleSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType1(NameType1 nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoiseAnalysisType(NoiseAnalysisType noiseAnalysisType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noiseAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoseGearsType(NoseGearsType noseGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noseGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOEMType(OEMType oemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationalCasesType(OperationalCasesType operationalCasesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationalCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationalCaseType(OperationalCaseType operationalCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationalCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationLimitIncrementsType(OperationLimitIncrementsType operationLimitIncrementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationLimitIncrementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrthotropicShellPropertiesType(OrthotropicShellPropertiesType orthotropicShellPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orthotropicShellPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrthotropicSolidPropertiesType(OrthotropicSolidPropertiesType orthotropicSolidPropertiesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orthotropicSolidPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterCutOutProfileType(OuterCutOutProfileType outerCutOutProfileType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerCutOutProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType(ParametersType parametersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaxCrossBeamsAssemblyType(PaxCrossBeamsAssemblyType paxCrossBeamsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paxCrossBeamsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaxCrossBeamStrutsAssemblyType(PaxCrossBeamStrutsAssemblyType paxCrossBeamStrutsAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paxCrossBeamStrutsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaxDoorsAssemblyType(PaxDoorsAssemblyType paxDoorsAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paxDoorsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayloadGlobalType(PayloadGlobalType payloadGlobalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payloadGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceMapSelectionType(PerformanceMapSelectionType performanceMapSelectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceMapSelectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceRequirementConfigurationsType(
			PerformanceRequirementConfigurationsType performanceRequirementConfigurationsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceRequirementConfigurationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceRequirementsType(PerformanceRequirementsType performanceRequirementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceRequirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceTargetsGlobalType(PerformanceTargetsGlobalType performanceTargetsGlobalType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceTargetsGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhiType(PhiType phiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phiType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePintleStrutsType(PintleStrutsType pintleStrutsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pintleStrutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePistonType(PistonType pistonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pistonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlasticityCurvePointsType(PlasticityCurvePointsType plasticityCurvePointsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plasticityCurvePointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlasticityCurvePointType(PlasticityCurvePointType plasticityCurvePointType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plasticityCurvePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlasticityCurvesType(PlasticityCurvesType plasticityCurvesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plasticityCurvesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlasticityCurveType(PlasticityCurveType plasticityCurveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plasticityCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointAbsRelType(PointAbsRelType pointAbsRelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointAbsRelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointConstraintType(PointConstraintType pointConstraintType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointListRelXYZVectorType(PointListRelXYZVectorType pointListRelXYZVectorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointListRelXYZVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointListType(PointListType pointListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointListXYType(PointListXYType pointListXYType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointListXYType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointListXYVectorType(PointListXYVectorType pointListXYVectorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointListXYVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointListXYZVectorType(PointListXYZVectorType pointListXYZVectorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointListXYZVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointPerformanceConstraintsType(
			PointPerformanceConstraintsType pointPerformanceConstraintsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointPerformanceConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointPerformanceDefinitionsType(
			PointPerformanceDefinitionsType pointPerformanceDefinitionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointPerformanceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointPerformanceDefinitionType(PointPerformanceDefinitionType pointPerformanceDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointPerformanceDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointPerformanceRequirementsType(
			PointPerformanceRequirementsType pointPerformanceRequirementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointPerformanceRequirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointXType(PointXType pointXType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointXType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointXYType(PointXYType pointXYType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointXYType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointXYZType(PointXYZType pointXYZType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointXYZType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointXZType(PointXZType pointXZType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointXZType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointYType(PointYType pointYType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointYType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointYZType(PointYZType pointYZType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointYZType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointZType(PointZType pointZType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointZType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosExcl0DoubleBaseType(PosExcl0DoubleBaseType posExcl0DoubleBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(posExcl0DoubleBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosExcl0IntBaseType(PosExcl0IntBaseType posExcl0IntBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(posExcl0IntBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosIntVectorBaseType(PosIntVectorBaseType posIntVectorBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(posIntVectorBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioningsType(PositioningsType positioningsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positioningsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioningType(PositioningType positioningType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerConsumedType(PowerConsumedType powerConsumedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerConsumedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerFractionType(PowerFractionType powerFractionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerFractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerRemainingType(PowerRemainingType powerRemainingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerRemainingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureBulkheadAssemblyPositionType(
			PressureBulkheadAssemblyPositionType pressureBulkheadAssemblyPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressureBulkheadAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureBulkheadAssemblyType(PressureBulkheadAssemblyType pressureBulkheadAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressureBulkheadAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureBulkheadsType(PressureBulkheadsType pressureBulkheadsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressureBulkheadsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureBulkheadType(PressureBulkheadType pressureBulkheadType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressureBulkheadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritySettingType(PrioritySettingType prioritySettingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prioritySettingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileBasedStructuralElementsType(
			ProfileBasedStructuralElementsType profileBasedStructuralElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileBasedStructuralElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileBasedStructuralElementType(
			ProfileBasedStructuralElementType profileBasedStructuralElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileBasedStructuralElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileGeometry2DType(ProfileGeometry2DType profileGeometry2DType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileGeometry2DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileGeometryType(ProfileGeometryType profileGeometryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfilesType(ProfilesType profilesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonAttachmentsType(PylonAttachmentsType pylonAttachmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonAttachmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonAttachmentType(PylonAttachmentType pylonAttachmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonBoxType(PylonBoxType pylonBoxType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonPinsType(PylonPinsType pylonPinsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonPinsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonPinType(PylonPinType pylonPinType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonPinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonRibsDefinitionsType(PylonRibsDefinitionsType pylonRibsDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonRibsDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonRibsDefinitionType(PylonRibsDefinitionType pylonRibsDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonRibsDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonRibsPositioningType(PylonRibsPositioningType pylonRibsPositioningType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonRibsPositioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonShacklesType(PylonShacklesType pylonShacklesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonShacklesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonShackleType(PylonShackleType pylonShackleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonShackleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonShellType(PylonShellType pylonShellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonShellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonStructureType(PylonStructureType pylonStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePylonStrutsType(PylonStrutsType pylonStrutsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pylonStrutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiativeForcingType(RadiativeForcingType radiativeForcingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radiativeForcingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType(RangeType rangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateOfClimbType(RateOfClimbType rateOfClimbType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateOfClimbType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectangleProfileType(RectangleProfileType rectangleProfileType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectangleProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurringCostType(RecurringCostType recurringCostType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recurringCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeStrutPositionType(RelativeStrutPositionType relativeStrutPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeStrutPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleasedStoresType(ReleasedStoresType releasedStoresType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releasedStoresType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleasedStoreType(ReleasedStoreType releasedStoreType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releasedStoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemainingContributionsType(RemainingContributionsType remainingContributionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remainingContributionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemainingContributionType(RemainingContributionType remainingContributionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remainingContributionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementClassificationType(RequirementClassificationType requirementClassificationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementClassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementType(RequirementType requirementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRibCrossingBehaviourType(RibCrossingBehaviourType ribCrossingBehaviourType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ribCrossingBehaviourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRibCrossingBehaviourType1(RibCrossingBehaviourType1 ribCrossingBehaviourType1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ribCrossingBehaviourType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRibIdentificationType(RibIdentificationType ribIdentificationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ribIdentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRibRotationType(RibRotationType ribRotationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ribRotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRivetJointAreaAssemblyPositionType(
			RivetJointAreaAssemblyPositionType rivetJointAreaAssemblyPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rivetJointAreaAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRivetJointAreasAssemblyType(RivetJointAreasAssemblyType rivetJointAreasAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rivetJointAreasAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRivetsType(RivetsType rivetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rivetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRivetType(RivetType rivetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rivetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotationCurveType(RotationCurveType rotationCurveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotationCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotDirectionType(RotDirectionType rotDirectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorAirfoilsType(RotorAirfoilsType rotorAirfoilsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorAirfoilsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorBladeAttachmentsType(RotorBladeAttachmentsType rotorBladeAttachmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorBladeAttachmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorBladeAttachmentType(RotorBladeAttachmentType rotorBladeAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorBladeAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorBladesType(RotorBladesType rotorBladesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorBladesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftAnalysesType(RotorcraftAnalysesType rotorcraftAnalysesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftAnalysesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftGlobalType(RotorcraftGlobalType rotorcraftGlobalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftMassBreakdownType(RotorcraftMassBreakdownType rotorcraftMassBreakdownType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftMassBreakdownType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftMassEMType(RotorcraftMassEMType rotorcraftMassEMType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftMassEMType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftMassGroupLevel1Type(RotorcraftMassGroupLevel1Type rotorcraftMassGroupLevel1Type,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftMassGroupLevel1Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftMassGroupLevel2Type(RotorcraftMassGroupLevel2Type rotorcraftMassGroupLevel2Type,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftMassGroupLevel2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftMassOEMType(RotorcraftMassOEMType rotorcraftMassOEMType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftMassOEMType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftModelType(RotorcraftModelType rotorcraftModelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorcraftType(RotorcraftType rotorcraftType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorcraftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorHubHingesType(RotorHubHingesType rotorHubHingesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorHubHingesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorHubHingeType(RotorHubHingeType rotorHubHingeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorHubHingeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorHubType(RotorHubType rotorHubType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorHubType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorsType(RotorsType rotorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotorType(RotorType rotorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunwayILSType(RunwayILSType runwayILSType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runwayILSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunwayStartPositionType(RunwayStartPositionType runwayStartPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runwayStartPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunwaysType(RunwaysType runwaysType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runwaysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunwayType(RunwayType runwayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runwayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunwayType1(RunwayType1 runwayType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runwayType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeatElementsType(SeatElementsType seatElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seatElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeatElementType(SeatElementType seatElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seatElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeatModulesType(SeatModulesType seatModulesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seatModulesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentDirectionType(SegmentDirectionType segmentDirectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(segmentDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentTypeType(SegmentTypeType segmentTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(segmentTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShaftLinkedComponentsType(ShaftLinkedComponentsType shaftLinkedComponentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shaftLinkedComponentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShaftsType(ShaftsType shaftsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shaftsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShaftType(ShaftType shaftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shaftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheet3DType(Sheet3DType sheet3DType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheet3DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetBasedStructuralElementsType(
			SheetBasedStructuralElementsType sheetBasedStructuralElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetBasedStructuralElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetBasedStructuralElementType(
			SheetBasedStructuralElementType sheetBasedStructuralElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetBasedStructuralElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetList3DType(SheetList3DType sheetList3DType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetList3DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetListType(SheetListType sheetListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetPointsType(SheetPointsType sheetPointsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetPointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSheetType(SheetType sheetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sheetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideStrutsType(SideStrutsType sideStrutsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sideStrutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideType(SideType sideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSidewallPanelElementsType(SidewallPanelElementsType sidewallPanelElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sidewallPanelElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSidewallPanelsType(SidewallPanelsType sidewallPanelsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sidewallPanelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleGenericMassType(SingleGenericMassType singleGenericMassType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleGenericMassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkidGearsType(SkidGearsType skidGearsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skidGearsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinSegmentsType(SkinSegmentsType skinSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skinSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinSegmentType(SkinSegmentType skinSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skinSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkinType(SkinType skinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparCellsType(SparCellsType sparCellsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparCellType(SparCellType sparCellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparCrossSectionType(SparCrossSectionType sparCrossSectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparCrossSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparPositionsType(SparPositionsType sparPositionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparPositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparPositionType(SparPositionType sparPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparPositionUIDsType(SparPositionUIDsType sparPositionUIDsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparPositionUIDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparSegmentsType(SparSegmentsType sparSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparSegmentType(SparSegmentType sparSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sparSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificConfigurationSegmentsType(
			SpecificConfigurationSegmentsType specificConfigurationSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificConfigurationSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificConfigurationSegmentType(
			SpecificConfigurationSegmentType specificConfigurationSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificConfigurationSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificConfigurationUIDsType(SpecificConfigurationUIDsType specificConfigurationUIDsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificConfigurationUIDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificConfigurationUIDType(SpecificConfigurationUIDType specificConfigurationUIDType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificConfigurationUIDType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificExcessPowerType(SpecificExcessPowerType specificExcessPowerType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificExcessPowerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificHeatMapType(SpecificHeatMapType specificHeatMapType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificHeatMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificPerformanceMapsType(SpecificPerformanceMapsType specificPerformanceMapsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificPerformanceMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificPerformanceMapType(SpecificPerformanceMapType specificPerformanceMapType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificPerformanceMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedDesignatorsType(SpeedDesignatorsType speedDesignatorsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speedDesignatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpoilersType(SpoilersType spoilersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spoilersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpoilerType(SpoilerType spoilerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spoilerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardProfileSheetIDType(StandardProfileSheetIDType standardProfileSheetIDType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardProfileSheetIDType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardProfileType(StandardProfileType standardProfileType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardProfileTypeType(StandardProfileTypeType standardProfileTypeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardProfileTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateParametersType(StateParametersType stateParametersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateParameterType(StateParameterType stateParameterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateParameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStiffnessType(StiffnessType stiffnessType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stiffnessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringArrayBaseType(StringArrayBaseType stringArrayBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringArrayBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringBaseType(StringBaseType stringBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringerFramePositionType(StringerFramePositionType stringerFramePositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringerFramePositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringerFramePositionUIDsType(StringerFramePositionUIDsType stringerFramePositionUIDsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringerFramePositionUIDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringersAssemblyType(StringersAssemblyType stringersAssemblyType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringersAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringerType(StringerType stringerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringUIDBaseType(StringUIDBaseType stringUIDBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringUIDBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringVectorBaseType(StringVectorBaseType stringVectorBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringVectorBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralElementsType(StructuralElementsType structuralElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralMountType(StructuralMountType structuralMountType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralMountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralProfile3DType(StructuralProfile3DType structuralProfile3DType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralProfile3DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralProfilesType(StructuralProfilesType structuralProfilesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralProfilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralProfileType(StructuralProfileType structuralProfileType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralWallElementsType(StructuralWallElementsType structuralWallElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralWallElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralWallElementType(StructuralWallElementType structuralWallElementType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralWallElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrutAssemblyType(StrutAssemblyType strutAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strutAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrutPropertiesType(StrutPropertiesType strutPropertiesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strutPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrutType(StrutType strutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudiesType(StudiesType studiesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubFleetsType(SubFleetsType subFleetsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subFleetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubFleetType(SubFleetType subFleetType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subFleetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubLoadType(SubLoadType subLoadType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subLoadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperEllipseProfileType(SuperEllipseProfileType superEllipseProfileType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superEllipseProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportBeamType(SupportBeamType supportBeamType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportBeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemsType(SystemsType systemsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTailplaneAttachmentAreaType(TailplaneAttachmentAreaType tailplaneAttachmentAreaType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tailplaneAttachmentAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTailplaneAttachmentTypeType(TailplaneAttachmentTypeType tailplaneAttachmentTypeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tailplaneAttachmentTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTakeoffPerformanceParametersType(
			TakeoffPerformanceParametersType takeoffPerformanceParametersType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(takeoffPerformanceParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTangentLinksType(TangentLinksType tangentLinksType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tangentLinksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiedInterfacesType(TiedInterfacesType tiedInterfacesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tiedInterfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiedInterfaceType(TiedInterfaceType tiedInterfaceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tiedInterfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBaseType(TimeBaseType timeBaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstraintBaseType(TimeConstraintBaseType timeConstraintBaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeConstraintBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolspecificType(ToolspecificType toolspecificType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolspecificType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolType(ToolType toolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopologyEntriesType(TopologyEntriesType topologyEntriesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topologyEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopologyEntryType(TopologyEntryType topologyEntryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topologyEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalOperatingCostType(TotalOperatingCostType totalOperatingCostType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalOperatingCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackActuatorType(TrackActuatorType trackActuatorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackActuatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackJointCoordinatesType(TrackJointCoordinatesType trackJointCoordinatesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackJointCoordinatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackJointPositionsType(TrackJointPositionsType trackJointPositionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackJointPositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackJointPositionType(TrackJointPositionType trackJointPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackJointPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackSecondaryStructureType(TrackSecondaryStructureType trackSecondaryStructureType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackSecondaryStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackStructureType(TrackStructureType trackStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackStrutsType(TrackStrutsType trackStrutsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackStrutsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackStrutType(TrackStrutType trackStrutType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackStrutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackSubTypeType(TrackSubTypeType trackSubTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackSubTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackTypeType(TrackTypeType trackTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrailingEdgeDevicesType(TrailingEdgeDevicesType trailingEdgeDevicesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trailingEdgeDevicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrailingEdgeDeviceType(TrailingEdgeDeviceType trailingEdgeDeviceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trailingEdgeDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrajectoriesType(TrajectoriesType trajectoriesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trajectoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrajectoryGlobalType(TrajectoryGlobalType trajectoryGlobalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trajectoryGlobalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrajectoryType(TrajectoryType trajectoryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trajectoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformation2DType(Transformation2DType transformation2DType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformation2DType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationType(TransformationType transformationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionGearRatioType(TransmissionGearRatioType transmissionGearRatioType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionGearRatioType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionShaftInputsType(TransmissionShaftInputsType transmissionShaftInputsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionShaftInputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionShaftInputType(TransmissionShaftInputType transmissionShaftInputType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionShaftInputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionShaftOutputsType(TransmissionShaftOutputsType transmissionShaftOutputsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionShaftOutputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionShaftOutputType(TransmissionShaftOutputType transmissionShaftOutputType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionShaftOutputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionsType(TransmissionsType transmissionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionType(TransmissionType transmissionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimCaseType(TrimCaseType trimCaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trimCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimRequirementsType(TrimRequirementsType trimRequirementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trimRequirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimRequirementType(TrimRequirementType trimRequirementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trimRequirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimType(TrimType trimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trimType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnAngleType(TurnAngleType turnAngleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnAngleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfPointPerformanceType(TypeOfPointPerformanceType typeOfPointPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeOfPointPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType4(TypeType4 typeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIDGroupDefinitionsType(UIDGroupDefinitionsType uidGroupDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uidGroupDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIDGroupDefinitionType(UIDGroupDefinitionType uidGroupDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uidGroupDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIDSequenceType(UIDSequenceType uidSequenceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uidSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperLinksType(UpperLinksType upperLinksType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(upperLinksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableConditionsType(VariableConditionsType variableConditionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableSegmentsType(VariableSegmentsType variableSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableSegmentType(VariableSegmentType variableSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleConfigurationsType(VehicleConfigurationsType vehicleConfigurationsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vehicleConfigurationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleConfigurationType(VehicleConfigurationType vehicleConfigurationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vehicleConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehiclesType(VehiclesType vehiclesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vehiclesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionInfosType(VersionInfosType versionInfosType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionInfosType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionInfoType(VersionInfoType versionInfoType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVtpFrameDefType(VtpFrameDefType vtpFrameDefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vtpFrameDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVtpInterfaceDefType(VtpInterfaceDefType vtpInterfaceDefType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vtpInterfaceDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallPositionsType(WallPositionsType wallPositionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallPositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallPositionType(WallPositionType wallPositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallPositionUIDsType(WallPositionUIDsType wallPositionUIDsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallPositionUIDsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallSegmentsType(WallSegmentsType wallSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallSegmentType(WallSegmentType wallSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallsType(WallsType wallsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWayPointTypeType(WayPointTypeType wayPointTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wayPointTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebType(WebType webType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalanceCaseType(WeightAndBalanceCaseType weightAndBalanceCaseType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalanceCaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalanceFuelInTanksType(
			WeightAndBalanceFuelInTanksType weightAndBalanceFuelInTanksType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalanceFuelInTanksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalanceFuelInTankType(WeightAndBalanceFuelInTankType weightAndBalanceFuelInTankType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalanceFuelInTankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalanceFuelType(WeightAndBalanceFuelType weightAndBalanceFuelType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalanceFuelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalancemCargosType(WeightAndBalancemCargosType weightAndBalancemCargosType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalancemCargosType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalancemPaxxType(WeightAndBalancemPaxxType weightAndBalancemPaxxType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalancemPaxxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalancePayloadType(WeightAndBalancePayloadType weightAndBalancePayloadType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalancePayloadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightAndBalanceType(WeightAndBalanceType weightAndBalanceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightAndBalanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWheelType(WheelType wheelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wheelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowAssemblyPositionType(WindowAssemblyPositionType windowAssemblyPositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(windowAssemblyPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowsAssemblyType(WindowsAssemblyType windowsAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(windowsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowsType(WindowsType windowsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(windowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingAeroPerformanceType(WingAeroPerformanceType wingAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingAirfoilsType(WingAirfoilsType wingAirfoilsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingAirfoilsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingAttachmentPositioningType(WingAttachmentPositioningType wingAttachmentPositioningType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingAttachmentPositioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingCellsType(WingCellsType wingCellsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingCellType(WingCellType wingCellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingComponentSegmentStructureType(
			WingComponentSegmentStructureType wingComponentSegmentStructureType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingComponentSegmentStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingElementsType(WingElementsType wingElementsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingElementType(WingElementType wingElementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuelTankBorderType(WingFuelTankBorderType wingFuelTankBorderType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuelTankBorderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuelTankGeometryType(WingFuelTankGeometryType wingFuelTankGeometryType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuelTankGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuelTanksType(WingFuelTanksType wingFuelTanksType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuelTanksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuelTankType(WingFuelTankType wingFuelTankType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuelTankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuselageAttachmentsType(WingFuselageAttachmentsType wingFuselageAttachmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuselageAttachmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingFuselageAttachmentType(WingFuselageAttachmentType wingFuselageAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingFuselageAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingInterfaceDefinitionsType(WingInterfaceDefinitionsType wingInterfaceDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingInterfaceDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingInterfaceMainFramesType(WingInterfaceMainFramesType wingInterfaceMainFramesType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingInterfaceMainFramesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingInterfaceSupportStrutsAssemblyType(
			WingInterfaceSupportStrutsAssemblyType wingInterfaceSupportStrutsAssemblyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingInterfaceSupportStrutsAssemblyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingInterfaceSupportStrutType(WingInterfaceSupportStrutType wingInterfaceSupportStrutType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingInterfaceSupportStrutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingIntermediateStructureCellsType(
			WingIntermediateStructureCellsType wingIntermediateStructureCellsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingIntermediateStructureCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingIntermediateStructureCellType(
			WingIntermediateStructureCellType wingIntermediateStructureCellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingIntermediateStructureCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibCellType(WingRibCellType wingRibCellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibCrossSectionType(WingRibCrossSectionType wingRibCrossSectionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibCrossSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibExplicitPositioningType(WingRibExplicitPositioningType wingRibExplicitPositioningType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibExplicitPositioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibPointType(WingRibPointType wingRibPointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibsDefinitionsType(WingRibsDefinitionsType wingRibsDefinitionsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibsDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibsDefinitionType(WingRibsDefinitionType wingRibsDefinitionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibsDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingRibsPositioningType(WingRibsPositioningType wingRibsPositioningType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingRibsPositioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingsAeroPerformanceType(WingsAeroPerformanceType wingsAeroPerformanceType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingsAeroPerformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSectionsType(WingSectionsType wingSectionsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSectionType(WingSectionType wingSectionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSegmentsType(WingSegmentsType wingSegmentsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSegmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSegmentType(WingSegmentType wingSegmentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingShellType(WingShellType wingShellType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingShellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSkinType(WingSkinType wingSkinType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSkinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingSparType(WingSparType wingSparType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingSparType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingStringerType(WingStringerType wingStringerType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingStringerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingStructuralMountsType(WingStructuralMountsType wingStructuralMountsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingStructuralMountsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingsType(WingsType wingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingType(WingType wingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingWingAttachmentElementsType(WingWingAttachmentElementsType wingWingAttachmentElementsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingWingAttachmentElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingWingAttachmentSparsType(WingWingAttachmentSparsType wingWingAttachmentSparsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingWingAttachmentSparsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingWingAttachmentsSparsType(WingWingAttachmentsSparsType wingWingAttachmentsSparsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingWingAttachmentsSparsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingWingAttachmentsType(WingWingAttachmentsType wingWingAttachmentsType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingWingAttachmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWingWingAttachmentType(WingWingAttachmentType wingWingAttachmentType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wingWingAttachmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXsiIsoLineType(XsiIsoLineType xsiIsoLineType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xsiIsoLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZCouplingsType(ZCouplingsType zCouplingsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zCouplingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZCouplingType(ZCouplingType zCouplingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zCouplingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometricBaseTypeType(GeometricBaseTypeType geometricBaseTypeType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementType(PlacementType placementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefTypeType(RefTypeType refTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorType(RelationalOperatorType relationalOperatorType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorType1(RelationalOperatorType1 relationalOperatorType1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorType2(RelationalOperatorType2 relationalOperatorType2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideOfFirstWheelType(SideOfFirstWheelType sideOfFirstWheelType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizingTypeType(SizingTypeType sizingTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepTypeType(StepTypeType stepTypeType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepTypeType1(StepTypeType1 stepTypeType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryType(SymmetryType symmetryType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryType1(SymmetryType1 symmetryType1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryXyXzYzType(SymmetryXyXzYzType symmetryXyXzYzType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(TypeType2 typeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType3(TypeType3 typeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUncertaintyFunctionType(UncertaintyFunctionType uncertaintyFunctionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleVectorBaseTypeBase(String doubleVectorBaseTypeBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateDoubleVectorBaseTypeBase_Pattern(doubleVectorBaseTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDoubleVectorBaseTypeBase_Pattern
	 */
	public static final PatternMatcher[][] DOUBLE_VECTOR_BASE_TYPE_BASE__PATTERN__VALUES = new PatternMatcher[][] {
			new PatternMatcher[] { XMLTypeUtil.createPatternMatcher(
					"((\\s+)?[-+]?(\\d+)?(\\.)?(\\d+)?(([eE][-+]?)?\\d+)?(\\s+)?|(\\s+)?(NaN)(\\s+)?)(;(((\\s+)?[-+]?(\\d+)?(\\.)?(\\d+)?(([eE][-+]?)?\\d+)?(\\s+)?)|(\\s+)?(NaN)(\\s+)?))*") } };

	/**
	 * Validates the Pattern constraint of '<em>Double Vector Base Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleVectorBaseTypeBase_Pattern(String doubleVectorBaseTypeBase,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CpacsPackage.eINSTANCE.getDoubleVectorBaseTypeBase(), doubleVectorBaseTypeBase,
				DOUBLE_VECTOR_BASE_TYPE_BASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatTypeObject(FormatType formatTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometricBaseTypeTypeObject(GeometricBaseTypeType geometricBaseTypeTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutRelativePositionType(double mainStrutRelativePositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMainStrutRelativePositionType_Min(mainStrutRelativePositionType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMainStrutRelativePositionType_Max(mainStrutRelativePositionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMainStrutRelativePositionType_Min
	 */
	public static final double MAIN_STRUT_RELATIVE_POSITION_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Main Strut Relative Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutRelativePositionType_Min(double mainStrutRelativePositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = mainStrutRelativePositionType >= MAIN_STRUT_RELATIVE_POSITION_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(CpacsPackage.eINSTANCE.getMainStrutRelativePositionType(), mainStrutRelativePositionType,
					MAIN_STRUT_RELATIVE_POSITION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMainStrutRelativePositionType_Max
	 */
	public static final double MAIN_STRUT_RELATIVE_POSITION_TYPE__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Main Strut Relative Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutRelativePositionType_Max(double mainStrutRelativePositionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = mainStrutRelativePositionType <= MAIN_STRUT_RELATIVE_POSITION_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(CpacsPackage.eINSTANCE.getMainStrutRelativePositionType(), mainStrutRelativePositionType,
					MAIN_STRUT_RELATIVE_POSITION_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainStrutRelativePositionTypeObject(Double mainStrutRelativePositionTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMainStrutRelativePositionType_Min(mainStrutRelativePositionTypeObject, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validateMainStrutRelativePositionType_Max(mainStrutRelativePositionTypeObject, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementTypeObject(PlacementType placementTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosOnBogieType(double posOnBogieType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validatePosOnBogieType_Min(posOnBogieType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePosOnBogieType_Max(posOnBogieType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePosOnBogieType_Min
	 */
	public static final double POS_ON_BOGIE_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Pos On Bogie Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosOnBogieType_Min(double posOnBogieType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = posOnBogieType >= POS_ON_BOGIE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(CpacsPackage.eINSTANCE.getPosOnBogieType(), posOnBogieType,
					POS_ON_BOGIE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePosOnBogieType_Max
	 */
	public static final double POS_ON_BOGIE_TYPE__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Pos On Bogie Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosOnBogieType_Max(double posOnBogieType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = posOnBogieType <= POS_ON_BOGIE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(CpacsPackage.eINSTANCE.getPosOnBogieType(), posOnBogieType,
					POS_ON_BOGIE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosOnBogieTypeObject(Double posOnBogieTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validatePosOnBogieType_Min(posOnBogieTypeObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePosOnBogieType_Max(posOnBogieTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefTypeTypeObject(RefTypeType refTypeTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorTypeObject(RelationalOperatorType1 relationalOperatorTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorTypeObject1(RelationalOperatorType relationalOperatorTypeObject1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorTypeObject2(RelationalOperatorType2 relationalOperatorTypeObject2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionType(double relativePositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateRelativePositionType_Min(relativePositionType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRelativePositionType_Max(relativePositionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativePositionType_Min
	 */
	public static final double RELATIVE_POSITION_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Relative Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionType_Min(double relativePositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = relativePositionType >= RELATIVE_POSITION_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(CpacsPackage.eINSTANCE.getRelativePositionType(), relativePositionType,
					RELATIVE_POSITION_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativePositionType_Max
	 */
	public static final double RELATIVE_POSITION_TYPE__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Relative Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionType_Max(double relativePositionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = relativePositionType <= RELATIVE_POSITION_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(CpacsPackage.eINSTANCE.getRelativePositionType(), relativePositionType,
					RELATIVE_POSITION_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionTypeObject(Double relativePositionTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateRelativePositionType_Min(relativePositionTypeObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRelativePositionType_Max(relativePositionTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSideOfFirstWheelTypeObject(SideOfFirstWheelType sideOfFirstWheelTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizingTypeTypeObject(SizingTypeType sizingTypeTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepTypeTypeObject(StepTypeType stepTypeTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepTypeTypeObject1(StepTypeType1 stepTypeTypeObject1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryTypeObject(SymmetryType symmetryTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryTypeObject1(SymmetryType1 symmetryTypeObject1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryXyXzYzTypeObject(SymmetryXyXzYzType symmetryXyXzYzTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType1 typeTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType2 typeTypeObject1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject2(TypeType3 typeTypeObject2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUncertaintyFunctionTypeObject(UncertaintyFunctionType uncertaintyFunctionTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CpacsValidator
