/**
 */
package Cpacs.impl;

import Cpacs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpacsFactoryImpl extends EFactoryImpl implements CpacsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpacsFactory init() {
		try {
			CpacsFactory theCpacsFactory = (CpacsFactory) EPackage.Registry.INSTANCE.getEFactory(CpacsPackage.eNS_URI);
			if (theCpacsFactory != null) {
				return theCpacsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpacsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CpacsPackage.ACTUATOR_ATTACHMENT_TYPE:
			return createActuatorAttachmentType();
		case CpacsPackage.ACTUATOR_CONTROL_SURFACE_ATTACHMENT_TYPE:
			return createActuatorControlSurfaceAttachmentType();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_ATTACHMENT_TYPE:
			return createActuatorFuselageWingAttachmentType();
		case CpacsPackage.ACTUATOR_FUSELAGE_WING_TYPE:
			return createActuatorFuselageWingType();
		case CpacsPackage.ACTUATOR_PARENT_ATTACHMENT_TYPE:
			return createActuatorParentAttachmentType();
		case CpacsPackage.ACTUATORS_FUSELAGE_WING_TYPE:
			return createActuatorsFuselageWingType();
		case CpacsPackage.ADDITIONAL_PARAMETERS_TYPE:
			return createAdditionalParametersType();
		case CpacsPackage.ADDITIONAL_PARAMETER_TYPE:
			return createAdditionalParameterType();
		case CpacsPackage.AERO_DATA_SET_FOR_LOADS_TYPE:
			return createAeroDataSetForLoadsType();
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE:
			return createAeroDataSetsForLoadsType();
		case CpacsPackage.AEROELASTIC_DIVERGENCE_TYPE:
			return createAeroelasticDivergenceType();
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE:
			return createAeroelasticStaticMaxDisplacementType();
		case CpacsPackage.AEROELASTICS_TYPE:
			return createAeroelasticsType();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAPS_TYPE:
			return createAeroLimitsIncrementMapsType();
		case CpacsPackage.AERO_LIMITS_MAP_TYPE:
			return createAeroLimitsMapType();
		case CpacsPackage.AERO_MAP_OPERATION_LIMIT_TYPE:
			return createAeroMapOperationLimitType();
		case CpacsPackage.AERO_MAP_TYPE:
			return createAeroMapType();
		case CpacsPackage.AERO_PERFORMANCE_BOUNDARY_CONDITIONS_TYPE:
			return createAeroPerformanceBoundaryConditionsType();
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENTS_TYPE:
			return createAeroPerformanceControlElementsType();
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE:
			return createAeroPerformanceControlElementType();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE:
			return createAeroPerformanceIncrementMapsType();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE:
			return createAeroPerformanceIncrementMapType();
		case CpacsPackage.AERO_PERFORMANCE_MAP_RC_TYPE:
			return createAeroPerformanceMapRCType();
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE:
			return createAeroPerformanceMapsRCType();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE:
			return createAeroPerformanceMapType();
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE:
			return createAeroPerformanceRCType();
		case CpacsPackage.AERO_PERFORMANCE_TYPE:
			return createAeroPerformanceType();
		case CpacsPackage.AIRCRAFT_ANALYSES_TYPE:
			return createAircraftAnalysesType();
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE:
			return createAircraftGlobalType();
		case CpacsPackage.AIRCRAFT_MODEL_TYPE:
			return createAircraftModelType();
		case CpacsPackage.AIRCRAFT_TYPE:
			return createAircraftType();
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE:
			return createAirfoilAeroPerformanceType();
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE:
			return createAirfoilsAeroPerformanceType();
		case CpacsPackage.AIRFRAME_MAINTENANCE_COST_TYPE:
			return createAirframeMaintenanceCostType();
		case CpacsPackage.AIRLINES_TYPE:
			return createAirlinesType();
		case CpacsPackage.AIRLINE_TYPE:
			return createAirlineType();
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE:
			return createAirportCompatabilityGlobalType();
		case CpacsPackage.AIRPORTS_TYPE:
			return createAirportsType();
		case CpacsPackage.AIRPORT_TYPE:
			return createAirportType();
		case CpacsPackage.ALIGNMENT_CROSS_BEAM_TYPE:
			return createAlignmentCrossBeamType();
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE:
			return createAlignmentFloorPanelType();
		case CpacsPackage.ALIGNMENT_STRING_FRAME_TYPE:
			return createAlignmentStringFrameType();
		case CpacsPackage.ALIGNMENT_STRUCT_MEMBER_TYPE:
			return createAlignmentStructMemberType();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE:
			return createAngleAccelerationType();
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE:
			return createAngleDisplacementType();
		case CpacsPackage.ANISOTROPIC_SHELL_PROPERTIES_TYPE:
			return createAnisotropicShellPropertiesType();
		case CpacsPackage.ANISOTROPIC_SOLID_PROPERTIES_TYPE:
			return createAnisotropicSolidPropertiesType();
		case CpacsPackage.ATMOSPHERIC_CONDITIONS_TYPE:
			return createAtmosphericConditionsType();
		case CpacsPackage.ATMOSPHERIC_MODEL_OLD_TYPE:
			return createAtmosphericModelOldType();
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE:
			return createAtmosphericModelType();
		case CpacsPackage.ATMOSPHERIC_MODEL_TYPE1:
			return createAtmosphericModelType1();
		case CpacsPackage.ATTACHMENT_PINS_TYPE:
			return createAttachmentPinsType();
		case CpacsPackage.ATTACHMENT_PIN_TYPE:
			return createAttachmentPinType();
		case CpacsPackage.ATTITUDE_AND_MOTION_TYPE:
			return createAttitudeAndMotionType();
		case CpacsPackage.AXLES_TYPE:
			return createAxlesType();
		case CpacsPackage.AXLE_TYPE:
			return createAxleType();
		case CpacsPackage.BEAM_CROSS_SECTION_TYPE:
			return createBeamCrossSectionType();
		case CpacsPackage.BEAM_STIFFNESS_TYPE:
			return createBeamStiffnessType();
		case CpacsPackage.BLOCKED_DOF_TYPE:
			return createBlockedDOFType();
		case CpacsPackage.BOGIE_AXLES_TYPE:
			return createBogieAxlesType();
		case CpacsPackage.BOGIE_AXLE_TYPE:
			return createBogieAxleType();
		case CpacsPackage.BOGIE_TYPE:
			return createBogieType();
		case CpacsPackage.BOOLEAN_BASE_TYPE:
			return createBooleanBaseType();
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE:
			return createBoundingElementUIDsType();
		case CpacsPackage.CAB_GEOMETRY_TYPE:
			return createCabGeometryType();
		case CpacsPackage.CABIN_AISLES_TYPE:
			return createCabinAislesType();
		case CpacsPackage.CABIN_AISLE_TYPE:
			return createCabinAisleType();
		case CpacsPackage.CABIN_DOORS_TYPE:
			return createCabinDoorsType();
		case CpacsPackage.CABIN_DOOR_TYPE:
			return createCabinDoorType();
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE:
			return createCabinFloorElementsType();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE:
			return createCabinFloorElementType();
		case CpacsPackage.CABIN_SEAT_ELEMENTS_TYPE:
			return createCabinSeatElementsType();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE:
			return createCabinSeatElementType();
		case CpacsPackage.CABIN_SPACES_TYPE:
			return createCabinSpacesType();
		case CpacsPackage.CABIN_SPACE_TYPE:
			return createCabinSpaceType();
		case CpacsPackage.CAP_TYPE:
			return createCapType();
		case CpacsPackage.CARGO_CROSS_BEAMS_ASSEMBLY_TYPE:
			return createCargoCrossBeamsAssemblyType();
		case CpacsPackage.CARGO_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE:
			return createCargoCrossBeamStrutsAssemblyType();
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE:
			return createCargoDoorsAssemblyType();
		case CpacsPackage.CELL_POSITIONING_CHORDWISE_TYPE:
			return createCellPositioningChordwiseType();
		case CpacsPackage.CELL_POSITIONING_SPANWISE_TYPE:
			return createCellPositioningSpanwiseType();
		case CpacsPackage.CENTER_FUSELAGE_AREAS_ASSEMBLY_TYPE:
			return createCenterFuselageAreasAssemblyType();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE:
			return createCenterFuselageAreaType();
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE:
			return createCenterFuselageHighWingConfigurationType();
		case CpacsPackage.CENTER_FUSELAGE_KEELBEAM_TYPE:
			return createCenterFuselageKeelbeamType();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE:
			return createCenterFuselageLateralPanelsType();
		case CpacsPackage.CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION_TYPE:
			return createCenterFuselageLongFloorBeamsConnectionType();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE:
			return createCenterFuselageLowWingConfigurationType();
		case CpacsPackage.CENTER_FUSELAGE_MAIN_FRAMES_TYPE:
			return createCenterFuselageMainFramesType();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE:
			return createCenterFuselagePressureFloorType();
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE:
			return createCenterFuselageSideboxType();
		case CpacsPackage.CERTIFICATION_CASES_TYPE:
			return createCertificationCasesType();
		case CpacsPackage.CHARGES_COST_TYPE:
			return createChargesCostType();
		case CpacsPackage.COCKPIT_CONTROLS_TYPE:
			return createCockpitControlsType();
		case CpacsPackage.COCKPIT_CONTROL_TYPE:
			return createCockpitControlType();
		case CpacsPackage.COEFFICIENTS_TYPE:
			return createCoefficientsType();
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE:
			return createCommandCaseCommandType();
		case CpacsPackage.COMMAND_CASES_TYPE:
			return createCommandCasesType();
		case CpacsPackage.COMMAND_CASE_TYPE:
			return createCommandCaseType();
		case CpacsPackage.COMPARTMENT_GEOMETRY_TYPE:
			return createCompartmentGeometryType();
		case CpacsPackage.COMPARTMENTS_TYPE:
			return createCompartmentsType();
		case CpacsPackage.COMPARTMENT_TYPE:
			return createCompartmentType();
		case CpacsPackage.COMPLEX_BASE_TYPE:
			return createComplexBaseType();
		case CpacsPackage.COMPONENT_COST_TYPE:
			return createComponentCostType();
		case CpacsPackage.COMPONENT_CUT_LOADS_ENVELOPE_TYPE:
			return createComponentCutLoadsEnvelopeType();
		case CpacsPackage.COMPONENT_SEGMENT_PATH_TYPE:
			return createComponentSegmentPathType();
		case CpacsPackage.COMPONENT_SEGMENT_STEPS_TYPE:
			return createComponentSegmentStepsType();
		case CpacsPackage.COMPONENT_SEGMENT_STEP_TYPE:
			return createComponentSegmentStepType();
		case CpacsPackage.COMPONENT_SEGMENTS_TYPE:
			return createComponentSegmentsType();
		case CpacsPackage.COMPONENT_SEGMENT_TYPE:
			return createComponentSegmentType();
		case CpacsPackage.COMPOSITE_LAYER_TYPE:
			return createCompositeLayerType();
		case CpacsPackage.COMPOSITES_TYPE:
			return createCompositesType();
		case CpacsPackage.COMPOSITE_TYPE:
			return createCompositeType();
		case CpacsPackage.CONNECTIVITIES_TYPE:
			return createConnectivitiesType();
		case CpacsPackage.CONNECTIVITY_TYPE:
			return createConnectivityType();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE:
			return createConstraintSettingsPointPerformanceType();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE:
			return createConstraintSettingsType();
		case CpacsPackage.CONTINUITY_AT_P1_TYPE:
			return createContinuityAtP1Type();
		case CpacsPackage.CONTINUITY_AT_P2_TYPE:
			return createContinuityAtP2Type();
		case CpacsPackage.CONTINUITY_TYPE:
			return createContinuityType();
		case CpacsPackage.CONTINUITY_TYPE1:
			return createContinuityType1();
		case CpacsPackage.CONTINUITY_TYPE2:
			return createContinuityType2();
		case CpacsPackage.CONTINUITY_TYPE3:
			return createContinuityType3();
		case CpacsPackage.CONTOUR_REFERENCE_TYPE:
			return createContourReferenceType();
		case CpacsPackage.CONTROL_DISTRIBUTORS_TYPE:
			return createControlDistributorsType();
		case CpacsPackage.CONTROL_DISTRIBUTOR_TYPE:
			return createControlDistributorType();
		case CpacsPackage.CONTROL_ELEMENTS_TYPE:
			return createControlElementsType();
		case CpacsPackage.CONTROL_ELEMENT_TYPE:
			return createControlElementType();
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE:
			return createControlFunctionsType();
		case CpacsPackage.CONTROL_FUNCTION_TYPE:
			return createControlFunctionType();
		case CpacsPackage.CONTROL_INPUTS_TYPE:
			return createControlInputsType();
		case CpacsPackage.CONTROL_INPUT_TYPE:
			return createControlInputType();
		case CpacsPackage.CONTROL_LAW_MODES_TYPE:
			return createControlLawModesType();
		case CpacsPackage.CONTROL_LAW_MODE_TYPE:
			return createControlLawModeType();
		case CpacsPackage.CONTROL_LAWS_TYPE:
			return createControlLawsType();
		case CpacsPackage.CONTROL_SURFACE_ACTUATORS_TYPE:
			return createControlSurfaceActuatorsType();
		case CpacsPackage.CONTROL_SURFACE_ACTUATOR_TYPE:
			return createControlSurfaceActuatorType();
		case CpacsPackage.CONTROL_SURFACE_AIRFOIL_TYPE:
			return createControlSurfaceAirfoilType();
		case CpacsPackage.CONTROL_SURFACE_BORDER_LEADING_EDGE_TYPE:
			return createControlSurfaceBorderLeadingEdgeType();
		case CpacsPackage.CONTROL_SURFACE_BORDER_SPOILER_TYPE:
			return createControlSurfaceBorderSpoilerType();
		case CpacsPackage.CONTROL_SURFACE_BORDER_TRAILING_EDGE_TYPE:
			return createControlSurfaceBorderTrailingEdgeType();
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE:
			return createControlSurfaceContoursType();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE:
			return createControlSurfaceDeflectionsType();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE:
			return createControlSurfaceDeflectionType();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTORS_TYPE:
			return createControlSurfaceDeflectionVectorsType();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE:
			return createControlSurfaceDeflectionVectorType();
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAPS_TYPE:
			return createControlSurfaceHingeMomentMapsType();
		case CpacsPackage.CONTROL_SURFACE_HINGE_MOMENT_MAP_TYPE:
			return createControlSurfaceHingeMomentMapType();
		case CpacsPackage.CONTROL_SURFACE_HINGE_POINT_TYPE:
			return createControlSurfaceHingePointType();
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_LEADING_EDGE_TYPE:
			return createControlSurfaceOuterShapeLeadingEdgeType();
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_SPOILER_TYPE:
			return createControlSurfaceOuterShapeSpoilerType();
		case CpacsPackage.CONTROL_SURFACE_OUTER_SHAPE_TRAILING_EDGE_TYPE:
			return createControlSurfaceOuterShapeTrailingEdgeType();
		case CpacsPackage.CONTROL_SURFACE_PATH_TYPE:
			return createControlSurfacePathType();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE:
			return createControlSurfacePerformanceMapOldType();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAPS_OLD_TYPE:
			return createControlSurfacePerformanceMapsOldType();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_BORDER_TYPE:
			return createControlSurfaceSkinCutOutBorderType();
		case CpacsPackage.CONTROL_SURFACE_SKIN_CUT_OUT_TYPE:
			return createControlSurfaceSkinCutOutType();
		case CpacsPackage.CONTROL_SURFACE_STEPS_TYPE:
			return createControlSurfaceStepsType();
		case CpacsPackage.CONTROL_SURFACE_STEP_TYPE:
			return createControlSurfaceStepType();
		case CpacsPackage.CONTROL_SURFACES_TYPE:
			return createControlSurfacesType();
		case CpacsPackage.CONTROL_SURFACE_TRACKS_TYPE:
			return createControlSurfaceTracksType();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE:
			return createControlSurfaceTrackTypeType();
		case CpacsPackage.CONTROL_SURFACE_WING_CUT_OUT_TYPE:
			return createControlSurfaceWingCutOutType();
		case CpacsPackage.COST_AIR_CONDITIONING_SYSTEMS_TYPE:
			return createCostAirConditioningSystemsType();
		case CpacsPackage.COST_AUTOMATIC_FLIGHT_SYSTEMS_TYPE:
			return createCostAutomaticFlightSystemsType();
		case CpacsPackage.COST_AUXILARY_POWER_UNITS_TYPE:
			return createCostAuxilaryPowerUnitsType();
		case CpacsPackage.COST_BLEED_AIR_SYSTEMS_TYPE:
			return createCostBleedAirSystemsType();
		case CpacsPackage.COST_COMMUNICATION_SYSTEMS_TYPE:
			return createCostCommunicationSystemsType();
		case CpacsPackage.COST_COMPONENTS_TYPE:
			return createCostComponentsType();
		case CpacsPackage.COST_DE_ICING_SYSTEMS_TYPE:
			return createCostDeIcingSystemsType();
		case CpacsPackage.COST_ELECTRICAL_SYSTEMS_TYPE:
			return createCostElectricalSystemsType();
		case CpacsPackage.COST_ENGINE_PYLONS_TYPE:
			return createCostEnginePylonsType();
		case CpacsPackage.COST_EQUIPPED_ENGINES_TYPE:
			return createCostEquippedEnginesType();
		case CpacsPackage.COST_FIRE_PROTECTION_SYSTEMS_TYPE:
			return createCostFireProtectionSystemsType();
		case CpacsPackage.COST_FIXED_EMERGENCY_OXYGEN_SYSTEMS_TYPE:
			return createCostFixedEmergencyOxygenSystemsType();
		case CpacsPackage.COST_FLIGHT_CONTROL_SYSTEMS_TYPE:
			return createCostFlightControlSystemsType();
		case CpacsPackage.COST_FUEL_SYSTEMS_TYPE:
			return createCostFuelSystemsType();
		case CpacsPackage.COST_FURNISHING_ELEMENTS_TYPE:
			return createCostFurnishingElementsType();
		case CpacsPackage.COST_FURNISHINGS_TYPE:
			return createCostFurnishingsType();
		case CpacsPackage.COST_FUSELAGES_TYPE:
			return createCostFuselagesType();
		case CpacsPackage.COST_HYDRAULIC_SYSTEMS_TYPE:
			return createCostHydraulicSystemsType();
		case CpacsPackage.COST_INSTRUMENT_SYSTEMS_TYPE:
			return createCostInstrumentSystemsType();
		case CpacsPackage.COST_LANDING_GEAR_TYPE:
			return createCostLandingGearType();
		case CpacsPackage.COST_LIGHTING_SYSTEMS_TYPE:
			return createCostLightingSystemsType();
		case CpacsPackage.COST_NACELLES_TYPE:
			return createCostNacellesType();
		case CpacsPackage.COST_NAVIGATION_SYSTEMS_TYPE:
			return createCostNavigationSystemsType();
		case CpacsPackage.COST_POWER_UNITS_TYPE:
			return createCostPowerUnitsType();
		case CpacsPackage.COST_SYSTEMS_TYPE:
			return createCostSystemsType();
		case CpacsPackage.COST_WATER_INSTALLATION_SYSTEMS_TYPE:
			return createCostWaterInstallationSystemsType();
		case CpacsPackage.COST_WINGS_TYPE:
			return createCostWingsType();
		case CpacsPackage.CPACS_TYPE:
			return createCpacsType();
		case CpacsPackage.CRASH_LOAD_CASES_TYPE:
			return createCrashLoadCasesType();
		case CpacsPackage.CRASH_LOADCASE_TYPE:
			return createCrashLoadcaseType();
		case CpacsPackage.CREW_COST_TYPE:
			return createCrewCostType();
		case CpacsPackage.CROSS_BEAM_ASSEMBLY_POSITION_TYPE:
			return createCrossBeamAssemblyPositionType();
		case CpacsPackage.CROSS_BEAM_STRUT_ASSEMBLY_POSITION_TYPE:
			return createCrossBeamStrutAssemblyPositionType();
		case CpacsPackage.CRUISE_ROLLERS_TYPE:
			return createCruiseRollersType();
		case CpacsPackage.CRUISE_ROLLER_TYPE:
			return createCruiseRollerType();
		case CpacsPackage.CST2_DTYPE:
			return createCst2DType();
		case CpacsPackage.CURVE_PARAM_POINT_MAP_TYPE:
			return createCurveParamPointMapType();
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE:
			return createCurvePointListXYZType();
		case CpacsPackage.CURVE_POINT_TYPE:
			return createCurvePointType();
		case CpacsPackage.CURVE_PROFILES_TYPE:
			return createCurveProfilesType();
		case CpacsPackage.CUT_LOAD_INTEGRATION_POINTS_TYPE:
			return createCutLoadIntegrationPointsType();
		case CpacsPackage.CUT_LOADS_ENVELOPE_TYPE:
			return createCutLoadsEnvelopeType();
		case CpacsPackage.CUT_LOADS_TYPE:
			return createCutLoadsType();
		case CpacsPackage.CUT_LOAD_TYPE:
			return createCutLoadType();
		case CpacsPackage.CUT_OUT_CONTROL_POINTS_TYPE:
			return createCutOutControlPointsType();
		case CpacsPackage.CUT_OUT_CONTROL_POINT_TYPE:
			return createCutOutControlPointType();
		case CpacsPackage.CUT_OUT_PROFILES_TYPE:
			return createCutOutProfilesType();
		case CpacsPackage.CUT_OUT_PROFILE_TYPE:
			return createCutOutProfileType();
		case CpacsPackage.CUT_OUT_TYPE:
			return createCutOutType();
		case CpacsPackage.CUTOUT_TYPE_TYPE:
			return createCutoutTypeType();
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_ARRAY_TYPE:
			return createDampingDerivativesRatesArrayType();
		case CpacsPackage.DAMPING_DERIVATIVES_RATES_TYPE:
			return createDampingDerivativesRatesType();
		case CpacsPackage.DAMPING_DERIVATIVES_TYPE:
			return createDampingDerivativesType();
		case CpacsPackage.DAM_TOL_BEHAVIOUR_TYPE:
			return createDamTolBehaviourType();
		case CpacsPackage.DAM_TOL_FORMAN_TYPE:
			return createDamTolFormanType();
		case CpacsPackage.DAM_TOL_WALKER_TYPE:
			return createDamTolWalkerType();
		case CpacsPackage.DATE_BASE_TYPE:
			return createDateBaseType();
		case CpacsPackage.DATE_TIME_BASE_TYPE:
			return createDateTimeBaseType();
		case CpacsPackage.DECKS_TYPE:
			return createDecksType();
		case CpacsPackage.DECK_TYPE:
			return createDeckType();
		case CpacsPackage.DELTA_TEMPERATURE_TYPE:
			return createDeltaTemperatureType();
		case CpacsPackage.DESIGN_MASSES_TYPE:
			return createDesignMassesType();
		case CpacsPackage.DESIGN_PARAMETERS_TYPE:
			return createDesignParametersType();
		case CpacsPackage.DESIGN_PARAMETER_TYPE:
			return createDesignParameterType();
		case CpacsPackage.DESIGN_SPACE_TYPE:
			return createDesignSpaceType();
		case CpacsPackage.DESIGN_SPEED_TYPE:
			return createDesignSpeedType();
		case CpacsPackage.DESIGN_STUDIES_TYPE:
			return createDesignStudiesType();
		case CpacsPackage.DESIGN_VOLUME_TYPE:
			return createDesignVolumeType();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE:
			return createDirectOperatingCostType();
		case CpacsPackage.DIVERGENCE_CASES_TYPE:
			return createDivergenceCasesType();
		case CpacsPackage.DIVERGENCE_CASE_TYPE:
			return createDivergenceCaseType();
		case CpacsPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE:
			return createDoorAssemblyPositionType();
		case CpacsPackage.DOOR_CUT_OUT_TYPE:
			return createDoorCutOutType();
		case CpacsPackage.DOORS_TYPE:
			return createDoorsType();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE:
			return createDoorSurroundStructurePositionType();
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE:
			return createDoorSurroundStructuresAssemblyType();
		case CpacsPackage.DOOR_TYPE_TYPE:
			return createDoorTypeType();
		case CpacsPackage.DOUBLE_BASE_TYPE:
			return createDoubleBaseType();
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE:
			return createDoubleConstraintBaseType();
		case CpacsPackage.DRIVE_SYSTEMS_TYPE:
			return createDriveSystemsType();
		case CpacsPackage.DRIVE_SYSTEM_TYPE:
			return createDriveSystemType();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_ANALYSIS_TYPE:
			return createDynamicAircraftModelAnalysisType();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_POINTS_TYPE:
			return createDynamicAircraftModelPointsType();
		case CpacsPackage.DYNAMIC_AIRCRAFT_MODEL_TYPE:
			return createDynamicAircraftModelType();
		case CpacsPackage.EMISSIVITY_MAP_TYPE:
			return createEmissivityMapType();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE:
			return createEngineAnalysisType();
		case CpacsPackage.ENGINE_CONCEPT_TYPE:
			return createEngineConceptType();
		case CpacsPackage.ENGINE_FAN_TYPE:
			return createEngineFanType();
		case CpacsPackage.ENGINE_GEOMETRY_TYPE:
			return createEngineGeometryType();
		case CpacsPackage.ENGINE_GLOBAL_TYPE:
			return createEngineGlobalType();
		case CpacsPackage.ENGINE_MOUNTS_TYPE:
			return createEngineMountsType();
		case CpacsPackage.ENGINE_MOUNT_TYPE:
			return createEngineMountType();
		case CpacsPackage.ENGINE_NACELLE_TYPE:
			return createEngineNacelleType();
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE:
			return createEnginePerformanceMapsType();
		case CpacsPackage.ENGINE_PERFORMANCE_MAP_TYPE:
			return createEnginePerformanceMapType();
		case CpacsPackage.ENGINE_POSITIONS_TYPE:
			return createEnginePositionsType();
		case CpacsPackage.ENGINE_POSITION_TYPE:
			return createEnginePositionType();
		case CpacsPackage.ENGINE_PYLONS_TYPE:
			return createEnginePylonsType();
		case CpacsPackage.ENGINE_PYLON_TYPE:
			return createEnginePylonType();
		case CpacsPackage.ENGINE_SETTING_TYPE:
			return createEngineSettingType();
		case CpacsPackage.ENGINE_SPINNER_TYPE:
			return createEngineSpinnerType();
		case CpacsPackage.ENGINES_TYPE:
			return createEnginesType();
		case CpacsPackage.ENGINE_TYPE:
			return createEngineType();
		case CpacsPackage.ETA_ISO_LINE_TYPE:
			return createEtaIsoLineType();
		case CpacsPackage.ETA_XSI_POINT_TYPE:
			return createEtaXsiPointType();
		case CpacsPackage.ETA_XSI_REL_HEIGHT_POINT_TYPE:
			return createEtaXsiRelHeightPointType();
		case CpacsPackage.FATIGUE_BEHAVIOUR_TYPE:
			return createFatigueBehaviourType();
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE:
			return createFatigueStressBasedBrownMillerType();
		case CpacsPackage.FLEET_TYPE:
			return createFleetType();
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE:
			return createFlightAnalysisType();
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE:
			return createFlightDynamicsAnalysisType();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE:
			return createFlightDynamicsFlightCasesType();
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASE_TYPE:
			return createFlightDynamicsFlightCaseType();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE:
			return createFlightDynamicsLinearModelType();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE:
			return createFlightDynamicsModelType();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE:
			return createFlightDynamicsTrimResultType();
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE:
			return createFlightLoadCasesType();
		case CpacsPackage.FLIGHT_LOAD_CASE_TYPE:
			return createFlightLoadCaseType();
		case CpacsPackage.FLIGHT_PATH_TYPE:
			return createFlightPathType();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE:
			return createFlightPerformanceCasesType();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE:
			return createFlightPerformanceCaseType();
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE:
			return createFlightPerformanceLandingType();
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE:
			return createFlightPerformanceTakeoffType();
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE:
			return createFlightPerformanceType();
		case CpacsPackage.FLIGHT_POINT_TYPE:
			return createFlightPointType();
		case CpacsPackage.FLIGHTS_TYPE:
			return createFlightsType();
		case CpacsPackage.FLIGHT_SYSTEMS_TYPE:
			return createFlightSystemsType();
		case CpacsPackage.FLIGHT_TYPE:
			return createFlightType();
		case CpacsPackage.FLOOR_PANELS_TYPE:
			return createFloorPanelsType();
		case CpacsPackage.FLOOR_PANEL_TYPE:
			return createFloorPanelType();
		case CpacsPackage.FLOW_CONDITION_TYPE:
			return createFlowConditionType();
		case CpacsPackage.FLYING_QUALITIES_TYPE:
			return createFlyingQualitiesType();
		case CpacsPackage.FQ_CASE_TYPE:
			return createFqCaseType();
		case CpacsPackage.FQ_CHAR_PARAMETERS_TYPE:
			return createFqCharParametersType();
		case CpacsPackage.FQ_EIGLAT_TYPE:
			return createFqEiglatType();
		case CpacsPackage.FQ_LATERAL_TYPE:
			return createFqLateralType();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE:
			return createFqLongitudinalType();
		case CpacsPackage.FQ_PHUGOID_TYPE:
			return createFqPhugoidType();
		case CpacsPackage.FQ_RATINGS_TYPE:
			return createFqRatingsType();
		case CpacsPackage.FQ_ROLL_PERF_TYPE:
			return createFqRollPerfType();
		case CpacsPackage.FQ_ROLOSC_TYPE:
			return createFqRoloscType();
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE:
			return createFqShortPeriodType();
		case CpacsPackage.FQ_TREFF_TYPE:
			return createFqTreffType();
		case CpacsPackage.FRAMES_ASSEMBLY_TYPE:
			return createFramesAssemblyType();
		case CpacsPackage.FRAME_TYPE:
			return createFrameType();
		case CpacsPackage.FREE_PATH_TYPE:
			return createFreePathType();
		case CpacsPackage.FUEL_IN_TANK_TYPE:
			return createFuelInTankType();
		case CpacsPackage.FUEL_PLANNING_TYPE_TYPE:
			return createFuelPlanningTypeType();
		case CpacsPackage.FUELS_TYPE:
			return createFuelsType();
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE:
			return createFuelTankVolumeType();
		case CpacsPackage.FUEL_TYPE:
			return createFuelType();
		case CpacsPackage.FUSELAGE_AERO_PERFORMANCE_TYPE:
			return createFuselageAeroPerformanceType();
		case CpacsPackage.FUSELAGE_COEFFICIENTS_TYPE:
			return createFuselageCoefficientsType();
		case CpacsPackage.FUSELAGE_CUT_OUTS_TYPE:
			return createFuselageCutOutsType();
		case CpacsPackage.FUSELAGE_CUT_OUT_TYPE:
			return createFuselageCutOutType();
		case CpacsPackage.FUSELAGE_ELEMENTS_TYPE:
			return createFuselageElementsType();
		case CpacsPackage.FUSELAGE_ELEMENT_TYPE:
			return createFuselageElementType();
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE:
			return createFuselageFuelTanksType();
		case CpacsPackage.FUSELAGE_FUEL_TANK_TYPE:
			return createFuselageFuelTankType();
		case CpacsPackage.FUSELAGE_PROFILES_TYPE:
			return createFuselageProfilesType();
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE:
			return createFuselagesAeroPerformanceType();
		case CpacsPackage.FUSELAGES_COEFFICIENTS_TYPE:
			return createFuselagesCoefficientsType();
		case CpacsPackage.FUSELAGE_SECTIONS_TYPE:
			return createFuselageSectionsType();
		case CpacsPackage.FUSELAGE_SECTION_TYPE:
			return createFuselageSectionType();
		case CpacsPackage.FUSELAGE_SEGMENT_COEFFICIENTS_TYPE:
			return createFuselageSegmentCoefficientsType();
		case CpacsPackage.FUSELAGE_SEGMENTS_COEFFICIENTS_TYPE:
			return createFuselageSegmentsCoefficientsType();
		case CpacsPackage.FUSELAGE_SEGMENT_STRIP_COEFFICIENTS_TYPE:
			return createFuselageSegmentStripCoefficientsType();
		case CpacsPackage.FUSELAGE_SEGMENTS_TYPE:
			return createFuselageSegmentsType();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE:
			return createFuselageSegmentType();
		case CpacsPackage.FUSELAGE_STRUCTURE_TYPE:
			return createFuselageStructureType();
		case CpacsPackage.FUSELAGES_TYPE:
			return createFuselagesType();
		case CpacsPackage.FUSELAGE_TYPE:
			return createFuselageType();
		case CpacsPackage.GEAR_COMPONENTS_TYPE:
			return createGearComponentsType();
		case CpacsPackage.GEAR_DEFLECTION_VECTORS_TYPE:
			return createGearDeflectionVectorsType();
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE:
			return createGearDeflectionVectorType();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE:
			return createGeneralStructuralMemberPositionType();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBERS_ASSEMBLY_TYPE:
			return createGeneralStructuralMembersAssemblyType();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE:
			return createGeneralStructuralMemberType();
		case CpacsPackage.GENERIC_COMPONENT_COEFFICIENTS_TYPE:
			return createGenericComponentCoefficientsType();
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE:
			return createGenericComponentsCoefficientsType();
		case CpacsPackage.GENERIC_COST_TYPE:
			return createGenericCostType();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE:
			return createGenericGeometricComponentType();
		case CpacsPackage.GENERIC_GEOMETRY_COMPONENTS_TYPE:
			return createGenericGeometryComponentsType();
		case CpacsPackage.GENERIC_MASS_TYPE:
			return createGenericMassType();
		case CpacsPackage.GENERIC_SYSTEMS_TYPE:
			return createGenericSystemsType();
		case CpacsPackage.GENERIC_SYSTEM_TYPE:
			return createGenericSystemType();
		case CpacsPackage.GEOGEN_WING_OUTPUT_OPTIONS_TYPE:
			return createGeogenWingOutputOptionsType();
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE:
			return createGeographicPointConstraintType();
		case CpacsPackage.GEOGRAPHIC_POINT_TYPE:
			return createGeographicPointType();
		case CpacsPackage.GLOBAL_AERO_PERFORMANCE_TYPE:
			return createGlobalAeroPerformanceType();
		case CpacsPackage.GLOBAL_BEAM_PROPERTIES_TYPE:
			return createGlobalBeamPropertiesType();
		case CpacsPackage.GROUND_LOAD_CASES_TYPE:
			return createGroundLoadCasesType();
		case CpacsPackage.GROUND_LOAD_CASE_TYPE:
			return createGroundLoadCaseType();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE:
			return createGuideCurveProfileGeometryType();
		case CpacsPackage.GUIDE_CURVE_PROFILES_TYPE:
			return createGuideCurveProfilesType();
		case CpacsPackage.GUIDE_CURVES_TYPE:
			return createGuideCurvesType();
		case CpacsPackage.GUIDE_CURVE_TYPE:
			return createGuideCurveType();
		case CpacsPackage.HANDBOOK_AERO_LAST_TRANSITION_REGION_TYPE:
			return createHandbookAeroLastTransitionRegionType();
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE:
			return createHandbookAeroPolynomialCoefficientsType();
		case CpacsPackage.HANDBOOK_AERO_TRANSITION_REGION_TYPE:
			return createHandbookAeroTransitionRegionType();
		case CpacsPackage.HEADER_TYPE:
			return createHeaderType();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE:
			return createHingeMomentsMapType();
		case CpacsPackage.HTP_FWD_INTERFACE_DEF_TYPE:
			return createHtpFwdInterfaceDefType();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE:
			return createHtpInterfaceDefType();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE:
			return createHtpStructElemDefType();
		case CpacsPackage.IDENTIFIER_TYPE:
			return createIdentifierType();
		case CpacsPackage.IMPACT_SURFACE_DEFINITION_TYPE:
			return createImpactSurfaceDefinitionType();
		case CpacsPackage.INDIRECT_OPERATING_COST_TYPE:
			return createIndirectOperatingCostType();
		case CpacsPackage.INTEGER_BASE_TYPE:
			return createIntegerBaseType();
		case CpacsPackage.INTER_CONNECTION_STRUT_ATTACHMENT_TYPE:
			return createInterConnectionStrutAttachmentType();
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE:
			return createInterconnectionStrutsType();
		case CpacsPackage.INTERCONNECTION_STRUT_TYPE:
			return createInterconnectionStrutType();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE:
			return createIntercostalPositionType();
		case CpacsPackage.INTERCOSTALS_ASSEMBLY_TYPE:
			return createIntercostalsAssemblyType();
		case CpacsPackage.INTERFACE_DEFINITIONS_TYPE:
			return createInterfaceDefinitionsType();
		case CpacsPackage.INTERPOLATION_TYPE:
			return createInterpolationType();
		case CpacsPackage.INTERPOLATION_TYPE1:
			return createInterpolationType1();
		case CpacsPackage.INTERPOLATION_TYPE2:
			return createInterpolationType2();
		case CpacsPackage.ISOTROPIC_PROPERTIES_TYPE:
			return createIsotropicPropertiesType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE:
			return createLandingGearInterfaceDefinitionsType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_KEELBEAM_TYPE:
			return createLandingGearInterfaceKeelbeamType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_LATERAL_PANELS_TYPE:
			return createLandingGearInterfaceLateralPanelsType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION_TYPE:
			return createLandingGearInterfaceLongFloorBeamsConnectionType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_MAIN_FRAMES_TYPE:
			return createLandingGearInterfaceMainFramesType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_PRESSURE_FLOOR_TYPE:
			return createLandingGearInterfacePressureFloorType();
		case CpacsPackage.LANDING_GEAR_INTERFACE_SIDEBOX_TYPE:
			return createLandingGearInterfaceSideboxType();
		case CpacsPackage.LANDING_GEAR_POSITION_SAFETY_MARGINS_TYPE:
			return createLandingGearPositionSafetyMarginsType();
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE:
			return createLandingGearSettingType();
		case CpacsPackage.LANDING_GEAR_TYPE:
			return createLandingGearType();
		case CpacsPackage.LATERAL_CAP_TYPE:
			return createLateralCapType();
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE:
			return createLeadingEdgeDevicesType();
		case CpacsPackage.LEADING_EDGE_DEVICE_TYPE:
			return createLeadingEdgeDeviceType();
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE:
			return createLeadingEdgeHollowType();
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE:
			return createLeadingEdgeShapeType();
		case CpacsPackage.LINER_TYPE:
			return createLinerType();
		case CpacsPackage.LINK_TO_FILE_TYPE:
			return createLinkToFileType();
		case CpacsPackage.LOAD_ANALYSIS_TYPE:
			return createLoadAnalysisType();
		case CpacsPackage.LOAD_BREAKDOWN_TYPE:
			return createLoadBreakdownType();
		case CpacsPackage.LOAD_CASE_ENGINES_TYPE:
			return createLoadCaseEnginesType();
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE:
			return createLoadCaseLandingGearsType();
		case CpacsPackage.LOAD_CASE_MASS_TYPE:
			return createLoadCaseMassType();
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE:
			return createLoadCaseRotationType();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE:
			return createLoadCaseRotationVelocityType();
		case CpacsPackage.LOAD_CASE_SETTINGS_TYPE:
			return createLoadCaseSettingsType();
		case CpacsPackage.LOAD_CASE_STATE_TYPE:
			return createLoadCaseStateType();
		case CpacsPackage.LOAD_CASES_TYPE:
			return createLoadCasesType();
		case CpacsPackage.LOAD_CASE_TRANSLATION_ACCELERATION_TYPE:
			return createLoadCaseTranslationAccelerationType();
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE:
			return createLoadCaseTranslationType();
		case CpacsPackage.LOAD_CASE_TRANSLATION_VELOCITY_TYPE:
			return createLoadCaseTranslationVelocityType();
		case CpacsPackage.LOAD_CONDITION_TYPE:
			return createLoadConditionType();
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINTS_TYPE:
			return createLoadReferenceAxisPointsType();
		case CpacsPackage.LOAD_REFERENCE_AXIS_POINT_TYPE:
			return createLoadReferenceAxisPointType();
		case CpacsPackage.LOAD_REFERENCE_TYPE:
			return createLoadReferenceType();
		case CpacsPackage.LOADS_ENVELOPE_TYPE:
			return createLoadsEnvelopeType();
		case CpacsPackage.LONG_FLOOR_BEAM_POSITION_TYPE:
			return createLongFloorBeamPositionType();
		case CpacsPackage.LONG_FLOOR_BEAMS_ASSEMBLY_TYPE:
			return createLongFloorBeamsAssemblyType();
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE:
			return createLongFloorBeamType();
		case CpacsPackage.MAIN_ACTUATOR_TYPE:
			return createMainActuatorType();
		case CpacsPackage.MAIN_GEAR_GLOBAL_TYPE:
			return createMainGearGlobalType();
		case CpacsPackage.MAIN_GEARS_TYPE:
			return createMainGearsType();
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_POSITION_TYPE:
			return createMainGearSupportBeamPositionType();
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE:
			return createMainGearSupportBeamType();
		case CpacsPackage.MAIN_GEAR_TYPE:
			return createMainGearType();
		case CpacsPackage.MAIN_GEAR_WING_ATTACHMENT_TYPE:
			return createMainGearWingAttachmentType();
		case CpacsPackage.MAIN_STRUT_INTERFACE_DEFINITIONS_TYPE:
			return createMainStrutInterfaceDefinitionsType();
		case CpacsPackage.MAIN_STRUT_WING_FUSELAGE_ATTACHMENT_TYPE:
			return createMainStrutWingFuselageAttachmentType();
		case CpacsPackage.MAINTENANCE_COST_TYPE:
			return createMaintenanceCostType();
		case CpacsPackage.MAIR_CONDITIONING_TYPE:
			return createMAirConditioningType();
		case CpacsPackage.MASS_BREAKDOWN_TYPE:
			return createMassBreakdownType();
		case CpacsPackage.MASS_FRACTION_TYPE:
			return createMassFractionType();
		case CpacsPackage.MASS_INERTIA_TYPE:
			return createMassInertiaType();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE:
			return createMassInertiaVectorType();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE:
			return createMaterialDefinitionForProfileBasedPointType();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_TYPE:
			return createMaterialDefinitionForProfileBasedType();
		case CpacsPackage.MATERIAL_DEFINITION_TYPE:
			return createMaterialDefinitionType();
		case CpacsPackage.MATERIALS_TYPE:
			return createMaterialsType();
		case CpacsPackage.MATERIAL_TYPE:
			return createMaterialType();
		case CpacsPackage.MAUTOMATIC_FLIGHT_SYSTEM_TYPE:
			return createMAutomaticFlightSystemType();
		case CpacsPackage.MAUXILLARY_POWER_UNIT_TYPE:
			return createMAuxillaryPowerUnitType();
		case CpacsPackage.MBELLY_FAIRINGS_TYPE:
			return createMBellyFairingsType();
		case CpacsPackage.MBLEED_AIR_SYSTEM_TYPE:
			return createMBleedAirSystemType();
		case CpacsPackage.MBULK_CARGOS_TYPE:
			return createMBulkCargosType();
		case CpacsPackage.MBULK_CARGO_TYPE:
			return createMBulkCargoType();
		case CpacsPackage.MBULKHEADS_TYPE:
			return createMBulkheadsType();
		case CpacsPackage.MCABIN_FLOORS_TYPE:
			return createMCabinFloorsType();
		case CpacsPackage.MCABIN_LIGHTINGS_TYPE:
			return createMCabinLightingsType();
		case CpacsPackage.MCARGO_FLOORS_TYPE:
			return createMCargoFloorsType();
		case CpacsPackage.MCARGO_LININGS_TYPE:
			return createMCargoLiningsType();
		case CpacsPackage.MCARGO_LOADINGS_TYPE:
			return createMCargoLoadingsType();
		case CpacsPackage.MCARGO_TYPE:
			return createMCargoType();
		case CpacsPackage.MCARRIAGES_TYPE:
			return createMCarriagesType();
		case CpacsPackage.MCARRY_ONS_TYPE:
			return createMCarryOnsType();
		case CpacsPackage.MCARRY_ON_TYPE:
			return createMCarryOnType();
		case CpacsPackage.MCATERINGS_TYPE:
			return createMCateringsType();
		case CpacsPackage.MCELLS_TYPE:
			return createMCellsType();
		case CpacsPackage.MCOCKPIT_LIGHTINGS_TYPE:
			return createMCockpitLightingsType();
		case CpacsPackage.MCOMMUNICATION_TYPE:
			return createMCommunicationType();
		case CpacsPackage.MCOMPONENT_SEGMENTS_TYPE:
			return createMComponentSegmentsType();
		case CpacsPackage.MCOMPONENT_SEGMENT_TYPE:
			return createMComponentSegmentType();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE:
			return createMControlSurfaceSupportsType();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORT_TYPE:
			return createMControlSurfaceSupportType();
		case CpacsPackage.MCREW_MEMBERS_TYPE:
			return createMCrewMembersType();
		case CpacsPackage.MCREW_SEATS_TYPE:
			return createMCrewSeatsType();
		case CpacsPackage.MDE_ICING_TYPE:
			return createMDeIcingType();
		case CpacsPackage.MDOCUMENTS_TOOLS_TYPE:
			return createMDocumentsToolsType();
		case CpacsPackage.MDOORS_TYPE:
			return createMDoorsType();
		case CpacsPackage.MELECTRICAL_DISTRIBUTION_TYPE:
			return createMElectricalDistributionType();
		case CpacsPackage.MELECTRICAL_GENERATION_TYPE:
			return createMElectricalGenerationType();
		case CpacsPackage.MEMERGENCY_EQUIPMENTS_TYPE:
			return createMEmergencyEquipmentsType();
		case CpacsPackage.MEMERGENCY_OXYGEN_SYSTEMS_TYPE:
			return createMEmergencyOxygenSystemsType();
		case CpacsPackage.MEMPTY_UL_DS_TYPE:
			return createMEmptyULDsType();
		case CpacsPackage.MEMPTY_ULD_TYPE:
			return createMEmptyULDType();
		case CpacsPackage.MENGINE_CONTROL_TYPE:
			return createMEngineControlType();
		case CpacsPackage.MEQUIPPED_ENGINES_TYPE:
			return createMEquippedEnginesType();
		case CpacsPackage.MEXT_LIGHTINGS_TYPE:
			return createMExtLightingsType();
		case CpacsPackage.MFIRE_PROTECTION_TYPE:
			return createMFireProtectionType();
		case CpacsPackage.MFIXED_GALLEYS_TYPE:
			return createMFixedGalleysType();
		case CpacsPackage.MFIXED_LEADING_EDGES_TYPE:
			return createMFixedLeadingEdgesType();
		case CpacsPackage.MFIXED_LEADING_EDGE_TYPE:
			return createMFixedLeadingEdgeType();
		case CpacsPackage.MFIXED_TRAILING_EDGES_TYPE:
			return createMFixedTrailingEdgesType();
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE:
			return createMFixedTrailingEdgeType();
		case CpacsPackage.MFLIGHT_CONTROLS_TYPE:
			return createMFlightControlsType();
		case CpacsPackage.MFLOOR_COVERINGS_TYPE:
			return createMFloorCoveringsType();
		case CpacsPackage.MFRAMES_TYPE:
			return createMFramesType();
		case CpacsPackage.MFRESH_WATER_SYSTEMS_TYPE:
			return createMFreshWaterSystemsType();
		case CpacsPackage.MFUEL_SYSTEM_TYPE:
			return createMFuelSystemType();
		case CpacsPackage.MFUEL_TYPE:
			return createMFuelType();
		case CpacsPackage.MFURNISHING_TYPE:
			return createMFurnishingType();
		case CpacsPackage.MFUSELAGES_STRUCTURE_TYPE:
			return createMFuselagesStructureType();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE:
			return createMFuselageStructureType();
		case CpacsPackage.MHYDRAULIC_DISTRIBUTION_TYPE:
			return createMHydraulicDistributionType();
		case CpacsPackage.MHYDRAULIC_GENERATION_TYPE:
			return createMHydraulicGenerationType();
		case CpacsPackage.MIFE_SYSTEMS_TYPE:
			return createMIFESystemsType();
		case CpacsPackage.MINSTRUMENT_PANEL_TYPE:
			return createMInstrumentPanelType();
		case CpacsPackage.MINSULATIONS_TYPE:
			return createMInsulationsType();
		case CpacsPackage.MINTEGRATED_MODULAR_AVIONICS_TYPE:
			return createMIntegratedModularAvionicsType();
		case CpacsPackage.MINTER_GAS_SYSTEM_TYPE:
			return createMInterGasSystemType();
		case CpacsPackage.MISSION_DEFINITIONS_TYPE:
			return createMissionDefinitionsType();
		case CpacsPackage.MISSION_PERFORMANCE_MAP_DEFINITION_TYPE:
			return createMissionPerformanceMapDefinitionType();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE:
			return createMissionSegmentBlockConstraintsType();
		case CpacsPackage.MISSION_SEGMENT_BLOCKS_TYPE:
			return createMissionSegmentBlocksType();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE:
			return createMissionSegmentBlockType();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE:
			return createMissionSegmentEndConditionType();
		case CpacsPackage.MISSION_SEGMENTS_TYPE:
			return createMissionSegmentsType();
		case CpacsPackage.MISSION_SEGMENT_TYPE:
			return createMissionSegmentType();
		case CpacsPackage.MISSION_START_CONDITION_TYPE:
			return createMissionStartConditionType();
		case CpacsPackage.MISSIONS_TYPE:
			return createMissionsType();
		case CpacsPackage.MISSION_TYPE:
			return createMissionType();
		case CpacsPackage.MLANDING_GEARS_TYPE:
			return createMLandingGearsType();
		case CpacsPackage.MLANDING_GEAR_SUPPORTS_TYPE:
			return createMLandingGearSupportsType();
		case CpacsPackage.MLAVATORIES_TYPE:
			return createMLavatoriesType();
		case CpacsPackage.MLININGS_TYPE:
			return createMLiningsType();
		case CpacsPackage.MMAIN_GEARS_TYPE:
			return createMMainGearsType();
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE:
			return createMManufacturerEmptyType();
		case CpacsPackage.MMILLITARY_SYSTEMS_TYPE:
			return createMMillitarySystemsType();
		case CpacsPackage.MMISCELLANEOUS_TYPE:
			return createMMiscellaneousType();
		case CpacsPackage.MMOVEABLE_LEADING_EDGES_TYPE:
			return createMMoveableLeadingEdgesType();
		case CpacsPackage.MMOVEABLE_LEADING_EDGE_TYPE:
			return createMMoveableLeadingEdgeType();
		case CpacsPackage.MMOVEABLES_TYPE:
			return createMMoveablesType();
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE:
			return createMMoveableTrailingEdgeType();
		case CpacsPackage.MNAVIGATION_TYPE:
			return createMNavigationType();
		case CpacsPackage.MNOSE_GEARS_TYPE:
			return createMNoseGearsType();
		case CpacsPackage.MODEL_TYPE:
			return createModelType();
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE:
			return createMonetaryValuesAnalysisType();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE:
			return createMOperatorItemsType();
		case CpacsPackage.MOVERHEAD_BINS_TYPE:
			return createMOverheadBinsType();
		case CpacsPackage.MPART_STOW_DOORS_TYPE:
			return createMPartStowDoorsType();
		case CpacsPackage.MPASSENGERS_TYPE:
			return createMPassengersType();
		case CpacsPackage.MPASSENGER_TYPE:
			return createMPassengerType();
		case CpacsPackage.MPAX_TYPE:
			return createMPaxType();
		case CpacsPackage.MPAYLOAD_TYPE:
			return createMPayloadType();
		case CpacsPackage.MPOWER_UNITS_TYPE:
			return createMPowerUnitsType();
		case CpacsPackage.MPYLON_ATTACHMENTS_TYPE:
			return createMPylonAttachmentsType();
		case CpacsPackage.MPYLONS_TYPE:
			return createMPylonsType();
		case CpacsPackage.MRIBS_TYPE:
			return createMRibsType();
		case CpacsPackage.MRIB_TYPE:
			return createMRibType();
		case CpacsPackage.MSEATS_TYPE:
			return createMSeatsType();
		case CpacsPackage.MSHELLS_TYPE:
			return createMShellsType();
		case CpacsPackage.MSHELL_TYPE:
			return createMShellType();
		case CpacsPackage.MSKIN_PANELS_TYPE:
			return createMSkinPanelsType();
		case CpacsPackage.MSKINS_TYPE:
			return createMSkinsType();
		case CpacsPackage.MSPARS_TYPE:
			return createMSparsType();
		case CpacsPackage.MSPECIAL_STRUCTURES_TYPE:
			return createMSpecialStructuresType();
		case CpacsPackage.MSPOILERS_TYPE:
			return createMSpoilersType();
		case CpacsPackage.MSTRINGERS_TYPE:
			return createMStringersType();
		case CpacsPackage.MSTRUCTURE_TYPE:
			return createMStructureType();
		case CpacsPackage.MSYSTEMS_TYPE:
			return createMSystemsType();
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE:
			return createMTrailingEdgeDevicesType();
		case CpacsPackage.MTRAILING_EDGE_DEVICE_TYPE:
			return createMTrailingEdgeDeviceType();
		case CpacsPackage.MULD_CONTENTS_TYPE:
			return createMULDContentsType();
		case CpacsPackage.MULD_CONTENT_TYPE:
			return createMULDContentType();
		case CpacsPackage.MVACUUM_WASTE_SYSTEMS_TYPE:
			return createMVacuumWasteSystemsType();
		case CpacsPackage.MWASTE_WATER_SYSTEMS_TYPE:
			return createMWasteWaterSystemsType();
		case CpacsPackage.MWINDOWS_TYPE:
			return createMWindowsType();
		case CpacsPackage.MWING_BOX_TYPE:
			return createMWingBoxType();
		case CpacsPackage.MWINGS_STRUCTURE_TYPE:
			return createMWingsStructureType();
		case CpacsPackage.MWING_STRUCTURE_TYPE:
			return createMWingStructureType();
		case CpacsPackage.NACELLE_CENTER_COWL_TYPE:
			return createNacelleCenterCowlType();
		case CpacsPackage.NACELLE_COWL_TYPE:
			return createNacelleCowlType();
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE:
			return createNacelleGuideCurvesType();
		case CpacsPackage.NACELLE_GUIDE_CURVE_TYPE:
			return createNacelleGuideCurveType();
		case CpacsPackage.NACELLE_PROFILES_TYPE:
			return createNacelleProfilesType();
		case CpacsPackage.NACELLE_SECTIONS_TYPE:
			return createNacelleSectionsType();
		case CpacsPackage.NACELLE_SECTION_TYPE:
			return createNacelleSectionType();
		case CpacsPackage.NODAL_LOADS_TYPE:
			return createNodalLoadsType();
		case CpacsPackage.NODAL_LOAD_TYPE:
			return createNodalLoadType();
		case CpacsPackage.NOISE_ANALYSIS_TYPE:
			return createNoiseAnalysisType();
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE:
			return createNoseGearGlobalType();
		case CpacsPackage.NOSE_GEARS_TYPE:
			return createNoseGearsType();
		case CpacsPackage.NOSE_GEAR_TYPE:
			return createNoseGearType();
		case CpacsPackage.OEM_TYPE:
			return createOEMType();
		case CpacsPackage.OPERATIONAL_CASES_TYPE:
			return createOperationalCasesType();
		case CpacsPackage.OPERATIONAL_CASE_TYPE:
			return createOperationalCaseType();
		case CpacsPackage.OPERATION_LIMIT_INCREMENTS_TYPE:
			return createOperationLimitIncrementsType();
		case CpacsPackage.ORIENTATION_TYPE:
			return createOrientationType();
		case CpacsPackage.ORTHOTROPIC_SHELL_PROPERTIES_TYPE:
			return createOrthotropicShellPropertiesType();
		case CpacsPackage.ORTHOTROPIC_SOLID_PROPERTIES_TYPE:
			return createOrthotropicSolidPropertiesType();
		case CpacsPackage.OUTER_CUT_OUT_PROFILE_TYPE:
			return createOuterCutOutProfileType();
		case CpacsPackage.PARAMETERS_TYPE:
			return createParametersType();
		case CpacsPackage.PARAMETER_TYPE:
			return createParameterType();
		case CpacsPackage.PAX_CROSS_BEAMS_ASSEMBLY_TYPE:
			return createPaxCrossBeamsAssemblyType();
		case CpacsPackage.PAX_CROSS_BEAM_STRUTS_ASSEMBLY_TYPE:
			return createPaxCrossBeamStrutsAssemblyType();
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE:
			return createPaxDoorsAssemblyType();
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE:
			return createPayloadGlobalType();
		case CpacsPackage.PERFORMANCE_CASES_TYPE:
			return createPerformanceCasesType();
		case CpacsPackage.PERFORMANCE_CASE_TYPE:
			return createPerformanceCaseType();
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE:
			return createPerformanceMapSelectionType();
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE:
			return createPerformanceRequirementsType();
		case CpacsPackage.PERFORMANCE_TARGETS_GLOBAL_TYPE:
			return createPerformanceTargetsGlobalType();
		case CpacsPackage.PHI_TYPE:
			return createPhiType();
		case CpacsPackage.PISTON_TYPE:
			return createPistonType();
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE:
			return createPlasticityCurvePointsType();
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE:
			return createPlasticityCurvePointType();
		case CpacsPackage.PLASTICITY_CURVES_TYPE:
			return createPlasticityCurvesType();
		case CpacsPackage.PLASTICITY_CURVE_TYPE:
			return createPlasticityCurveType();
		case CpacsPackage.POINT_ABS_REL_TYPE:
			return createPointAbsRelType();
		case CpacsPackage.POINT_CONSTRAINT_TYPE:
			return createPointConstraintType();
		case CpacsPackage.POINT_LIST_REL_XYZ_VECTOR_TYPE:
			return createPointListRelXYZVectorType();
		case CpacsPackage.POINT_LIST_TYPE:
			return createPointListType();
		case CpacsPackage.POINT_LIST_XY_TYPE:
			return createPointListXYType();
		case CpacsPackage.POINT_LIST_XY_VECTOR_TYPE:
			return createPointListXYVectorType();
		case CpacsPackage.POINT_LIST_XYZ_VECTOR_TYPE:
			return createPointListXYZVectorType();
		case CpacsPackage.POINT_PERFORMANCES_TYPE:
			return createPointPerformancesType();
		case CpacsPackage.POINT_PERFORMANCE_TYPE:
			return createPointPerformanceType();
		case CpacsPackage.POINT_TYPE:
			return createPointType();
		case CpacsPackage.POINT_XTYPE:
			return createPointXType();
		case CpacsPackage.POINT_XY_TYPE:
			return createPointXYType();
		case CpacsPackage.POINT_XYZ_TYPE:
			return createPointXYZType();
		case CpacsPackage.POINT_XZ_TYPE:
			return createPointXZType();
		case CpacsPackage.POINT_YTYPE:
			return createPointYType();
		case CpacsPackage.POINT_YZ_TYPE:
			return createPointYZType();
		case CpacsPackage.POINT_ZTYPE:
			return createPointZType();
		case CpacsPackage.POSITIONINGS_TYPE:
			return createPositioningsType();
		case CpacsPackage.POSITIONING_TYPE:
			return createPositioningType();
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_POSITION_TYPE:
			return createPressureBulkheadAssemblyPositionType();
		case CpacsPackage.PRESSURE_BULKHEAD_ASSEMBLY_TYPE:
			return createPressureBulkheadAssemblyType();
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE:
			return createPressureBulkheadsType();
		case CpacsPackage.PRESSURE_BULKHEAD_TYPE:
			return createPressureBulkheadType();
		case CpacsPackage.PRIORITY_SETTING_TYPE:
			return createPrioritySettingType();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE:
			return createProfileBasedStructuralElementsType();
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENT_TYPE:
			return createProfileBasedStructuralElementType();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE:
			return createProfileGeometry2DType();
		case CpacsPackage.PROFILE_GEOMETRY_TYPE:
			return createProfileGeometryType();
		case CpacsPackage.PROFILES_TYPE:
			return createProfilesType();
		case CpacsPackage.PYLON_ATTACHMENTS_TYPE:
			return createPylonAttachmentsType();
		case CpacsPackage.PYLON_ATTACHMENT_TYPE:
			return createPylonAttachmentType();
		case CpacsPackage.PYLON_BOX_TYPE:
			return createPylonBoxType();
		case CpacsPackage.PYLON_PINS_TYPE:
			return createPylonPinsType();
		case CpacsPackage.PYLON_PIN_TYPE:
			return createPylonPinType();
		case CpacsPackage.PYLON_RIBS_DEFINITIONS_TYPE:
			return createPylonRibsDefinitionsType();
		case CpacsPackage.PYLON_RIBS_DEFINITION_TYPE:
			return createPylonRibsDefinitionType();
		case CpacsPackage.PYLON_RIBS_POSITIONING_TYPE:
			return createPylonRibsPositioningType();
		case CpacsPackage.PYLON_SHACKLES_TYPE:
			return createPylonShacklesType();
		case CpacsPackage.PYLON_SHACKLE_TYPE:
			return createPylonShackleType();
		case CpacsPackage.PYLON_SHELL_TYPE:
			return createPylonShellType();
		case CpacsPackage.PYLON_STRUCTURE_TYPE:
			return createPylonStructureType();
		case CpacsPackage.PYLON_STRUTS_TYPE:
			return createPylonStrutsType();
		case CpacsPackage.QUASI_STEADY_ROTATION_TYPE:
			return createQuasiSteadyRotationType();
		case CpacsPackage.RADIATIVE_FORCING_TYPE:
			return createRadiativeForcingType();
		case CpacsPackage.RECURRING_COST_TYPE:
			return createRecurringCostType();
		case CpacsPackage.REFERENCE_TYPE:
			return createReferenceType();
		case CpacsPackage.REQUIREMENT_TYPE:
			return createRequirementType();
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE:
			return createRibCrossingBehaviourType();
		case CpacsPackage.RIB_CROSSING_BEHAVIOUR_TYPE1:
			return createRibCrossingBehaviourType1();
		case CpacsPackage.RIB_IDENTIFICATION_TYPE:
			return createRibIdentificationType();
		case CpacsPackage.RIB_ROTATION_TYPE:
			return createRibRotationType();
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE:
			return createRivetJointAreaAssemblyPositionType();
		case CpacsPackage.RIVET_JOINT_AREAS_ASSEMBLY_TYPE:
			return createRivetJointAreasAssemblyType();
		case CpacsPackage.RIVETS_TYPE:
			return createRivetsType();
		case CpacsPackage.RIVET_TYPE:
			return createRivetType();
		case CpacsPackage.ROTATION_CURVE_TYPE:
			return createRotationCurveType();
		case CpacsPackage.ROT_DIRECTION_TYPE:
			return createRotDirectionType();
		case CpacsPackage.ROTOR_AIRFOILS_TYPE:
			return createRotorAirfoilsType();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENTS_TYPE:
			return createRotorBladeAttachmentsType();
		case CpacsPackage.ROTOR_BLADE_ATTACHMENT_TYPE:
			return createRotorBladeAttachmentType();
		case CpacsPackage.ROTOR_BLADES_TYPE:
			return createRotorBladesType();
		case CpacsPackage.ROTORCRAFT_ANALYSES_TYPE:
			return createRotorcraftAnalysesType();
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE:
			return createRotorcraftGlobalType();
		case CpacsPackage.ROTORCRAFT_MASS_BREAKDOWN_TYPE:
			return createRotorcraftMassBreakdownType();
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE:
			return createRotorcraftMassEMType();
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE:
			return createRotorcraftMassGroupLevel1Type();
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL2_TYPE:
			return createRotorcraftMassGroupLevel2Type();
		case CpacsPackage.ROTORCRAFT_MASS_OEM_TYPE:
			return createRotorcraftMassOEMType();
		case CpacsPackage.ROTORCRAFT_MODEL_TYPE:
			return createRotorcraftModelType();
		case CpacsPackage.ROTORCRAFT_TYPE:
			return createRotorcraftType();
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE:
			return createRotorHubHingesType();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE:
			return createRotorHubHingeType();
		case CpacsPackage.ROTOR_HUB_TYPE:
			return createRotorHubType();
		case CpacsPackage.ROTORS_TYPE:
			return createRotorsType();
		case CpacsPackage.ROTOR_TYPE:
			return createRotorType();
		case CpacsPackage.RUNWAY_ILS_TYPE:
			return createRunwayILSType();
		case CpacsPackage.RUNWAYS_TYPE:
			return createRunwaysType();
		case CpacsPackage.RUNWAY_TYPE:
			return createRunwayType();
		case CpacsPackage.SEAT_MODULES_TYPE:
			return createSeatModulesType();
		case CpacsPackage.SEAT_MODULE_TYPE:
			return createSeatModuleType();
		case CpacsPackage.SECTION_DISTRIBUTION_MODE_TYPE:
			return createSectionDistributionModeType();
		case CpacsPackage.SEGMENT_DIRECTION_TYPE:
			return createSegmentDirectionType();
		case CpacsPackage.SEGMENT_TYPE_TYPE:
			return createSegmentTypeType();
		case CpacsPackage.SHAFT_LINKED_COMPONENTS_TYPE:
			return createShaftLinkedComponentsType();
		case CpacsPackage.SHAFTS_TYPE:
			return createShaftsType();
		case CpacsPackage.SHAFT_TYPE:
			return createShaftType();
		case CpacsPackage.SHEET3_DTYPE:
			return createSheet3DType();
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENTS_TYPE:
			return createSheetBasedStructuralElementsType();
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE:
			return createSheetBasedStructuralElementType();
		case CpacsPackage.SHEET_LIST3_DTYPE:
			return createSheetList3DType();
		case CpacsPackage.SHEET_LIST_TYPE:
			return createSheetListType();
		case CpacsPackage.SHEET_POINTS_TYPE:
			return createSheetPointsType();
		case CpacsPackage.SHEET_TYPE:
			return createSheetType();
		case CpacsPackage.SIDE_STRUTS_TYPE:
			return createSideStrutsType();
		case CpacsPackage.SIDE_TYPE:
			return createSideType();
		case CpacsPackage.SINGLE_GENERIC_MASS_TYPE:
			return createSingleGenericMassType();
		case CpacsPackage.SIZING_TYPE_TYPE:
			return createSizingTypeType();
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE:
			return createSkidGearGlobalType();
		case CpacsPackage.SKID_GEARS_TYPE:
			return createSkidGearsType();
		case CpacsPackage.SKID_GEAR_TYPE:
			return createSkidGearType();
		case CpacsPackage.SKIN_SEGMENTS_TYPE:
			return createSkinSegmentsType();
		case CpacsPackage.SKIN_SEGMENT_TYPE:
			return createSkinSegmentType();
		case CpacsPackage.SKIN_TYPE:
			return createSkinType();
		case CpacsPackage.SPAR_CELLS_TYPE:
			return createSparCellsType();
		case CpacsPackage.SPAR_CELL_TYPE:
			return createSparCellType();
		case CpacsPackage.SPAR_CROSS_SECTION_TYPE:
			return createSparCrossSectionType();
		case CpacsPackage.SPAR_POSITIONS_TYPE:
			return createSparPositionsType();
		case CpacsPackage.SPAR_POSITION_TYPE:
			return createSparPositionType();
		case CpacsPackage.SPAR_POSITION_UI_DS_TYPE:
			return createSparPositionUIDsType();
		case CpacsPackage.SPAR_SEGMENTS_TYPE:
			return createSparSegmentsType();
		case CpacsPackage.SPAR_SEGMENT_TYPE:
			return createSparSegmentType();
		case CpacsPackage.SPECIFIC_HEAT_MAP_TYPE:
			return createSpecificHeatMapType();
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE:
			return createSpecificPerformanceMapsType();
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE:
			return createSpecificPerformanceMapType();
		case CpacsPackage.SPOILERS_TYPE:
			return createSpoilersType();
		case CpacsPackage.SPOILER_TYPE:
			return createSpoilerType();
		case CpacsPackage.STANDARD_PROFILE_TYPE_TYPE:
			return createStandardProfileTypeType();
		case CpacsPackage.STATE_PARAMETERS_TYPE:
			return createStateParametersType();
		case CpacsPackage.STATE_PARAMETER_TYPE:
			return createStateParameterType();
		case CpacsPackage.STIFFNESS_TYPE:
			return createStiffnessType();
		case CpacsPackage.STRING_ARRAY_BASE_TYPE:
			return createStringArrayBaseType();
		case CpacsPackage.STRING_BASE_TYPE:
			return createStringBaseType();
		case CpacsPackage.STRINGER_FRAME_POSITION_TYPE:
			return createStringerFramePositionType();
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE:
			return createStringersAssemblyType();
		case CpacsPackage.STRINGER_TYPE:
			return createStringerType();
		case CpacsPackage.STRING_UID_BASE_TYPE:
			return createStringUIDBaseType();
		case CpacsPackage.STRING_VECTOR_BASE_TYPE:
			return createStringVectorBaseType();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE:
			return createStructuralElementsType();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE:
			return createStructuralMountType();
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE:
			return createStructuralProfile3DType();
		case CpacsPackage.STRUCTURAL_PROFILES_TYPE:
			return createStructuralProfilesType();
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE:
			return createStructuralProfileType();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENTS_TYPE:
			return createStructuralWallElementsType();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE:
			return createStructuralWallElementType();
		case CpacsPackage.STRUT_TYPE:
			return createStrutType();
		case CpacsPackage.STRUT_WITH_ACTUATOR_TYPE:
			return createStrutWithActuatorType();
		case CpacsPackage.STUDIES_TYPE:
			return createStudiesType();
		case CpacsPackage.SUB_FLEETS_TYPE:
			return createSubFleetsType();
		case CpacsPackage.SUB_FLEET_TYPE:
			return createSubFleetType();
		case CpacsPackage.SUB_LOAD_TYPE:
			return createSubLoadType();
		case CpacsPackage.SYMMETRY_TYPE3:
			return createSymmetryType3();
		case CpacsPackage.SYSTEMS_TYPE:
			return createSystemsType();
		case CpacsPackage.TAILPLANE_ATTACHMENT_AREA_TYPE:
			return createTailplaneAttachmentAreaType();
		case CpacsPackage.TAILPLANE_ATTACHMENT_TYPE_TYPE:
			return createTailplaneAttachmentTypeType();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE:
			return createTakeoffPerformanceParametersType();
		case CpacsPackage.TANGENT_LINKS_TYPE:
			return createTangentLinksType();
		case CpacsPackage.TIED_INTERFACES_TYPE:
			return createTiedInterfacesType();
		case CpacsPackage.TIED_INTERFACE_TYPE:
			return createTiedInterfaceType();
		case CpacsPackage.TIME_BASE_TYPE:
			return createTimeBaseType();
		case CpacsPackage.TOOLSPECIFIC_TYPE:
			return createToolspecificType();
		case CpacsPackage.TOOL_TYPE:
			return createToolType();
		case CpacsPackage.TOPOLOGY_ENTRIES_TYPE:
			return createTopologyEntriesType();
		case CpacsPackage.TOPOLOGY_ENTRY_TYPE:
			return createTopologyEntryType();
		case CpacsPackage.TOTAL_OPERATING_COST_TYPE:
			return createTotalOperatingCostType();
		case CpacsPackage.TRACK_ACTUATOR_TYPE:
			return createTrackActuatorType();
		case CpacsPackage.TRACK_CAR_TYPE:
			return createTrackCarType();
		case CpacsPackage.TRACK_FAIRING_TYPE:
			return createTrackFairingType();
		case CpacsPackage.TRACK_STRUCTURE_TYPE:
			return createTrackStructureType();
		case CpacsPackage.TRACK_STRUT1_TYPE:
			return createTrackStrut1Type();
		case CpacsPackage.TRACK_STRUT2_TYPE:
			return createTrackStrut2Type();
		case CpacsPackage.TRACK_SUB_TYPE_TYPE:
			return createTrackSubTypeType();
		case CpacsPackage.TRACK_TYPE_TYPE:
			return createTrackTypeType();
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE:
			return createTrailingEdgeDevicesType();
		case CpacsPackage.TRAILING_EDGE_DEVICE_TYPE:
			return createTrailingEdgeDeviceType();
		case CpacsPackage.TRAJECTORIES_TYPE:
			return createTrajectoriesType();
		case CpacsPackage.TRAJECTORY_GLOBAL_TYPE:
			return createTrajectoryGlobalType();
		case CpacsPackage.TRAJECTORY_TYPE:
			return createTrajectoryType();
		case CpacsPackage.TRANSFORMATION2_DTYPE:
			return createTransformation2DType();
		case CpacsPackage.TRANSFORMATION_TYPE:
			return createTransformationType();
		case CpacsPackage.TRANSMISSION_GEAR_RATIO_TYPE:
			return createTransmissionGearRatioType();
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE:
			return createTransmissionShaftInputsType();
		case CpacsPackage.TRANSMISSION_SHAFT_INPUT_TYPE:
			return createTransmissionShaftInputType();
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUTS_TYPE:
			return createTransmissionShaftOutputsType();
		case CpacsPackage.TRANSMISSION_SHAFT_OUTPUT_TYPE:
			return createTransmissionShaftOutputType();
		case CpacsPackage.TRANSMISSIONS_TYPE:
			return createTransmissionsType();
		case CpacsPackage.TRANSMISSION_TYPE:
			return createTransmissionType();
		case CpacsPackage.TRIM_PARAMETERS_TYPE:
			return createTrimParametersType();
		case CpacsPackage.TYPE_OF_POINT_PERFORMANCE_TYPE:
			return createTypeOfPointPerformanceType();
		case CpacsPackage.TYPE_TYPE1:
			return createTypeType1();
		case CpacsPackage.TYPE_TYPE2:
			return createTypeType2();
		case CpacsPackage.TYPE_TYPE5:
			return createTypeType5();
		case CpacsPackage.TYPE_TYPE6:
			return createTypeType6();
		case CpacsPackage.TYPE_TYPE7:
			return createTypeType7();
		case CpacsPackage.UID_GROUP_DEFINITIONS_TYPE:
			return createUIDGroupDefinitionsType();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE:
			return createUIDGroupDefinitionType();
		case CpacsPackage.UPDATES_TYPE:
			return createUpdatesType();
		case CpacsPackage.UPDATE_TYPE:
			return createUpdateType();
		case CpacsPackage.UPPER_LINKS_TYPE:
			return createUpperLinksType();
		case CpacsPackage.VARIABLE_SEGMENTS_TYPE:
			return createVariableSegmentsType();
		case CpacsPackage.VARIABLE_SEGMENT_TYPE:
			return createVariableSegmentType();
		case CpacsPackage.VEHICLES_TYPE:
			return createVehiclesType();
		case CpacsPackage.VTP_FRAME_DEF_TYPE:
			return createVtpFrameDefType();
		case CpacsPackage.VTP_INTERFACE_DEF_TYPE:
			return createVtpInterfaceDefType();
		case CpacsPackage.WALL_POSITIONS_TYPE:
			return createWallPositionsType();
		case CpacsPackage.WALL_POSITION_TYPE:
			return createWallPositionType();
		case CpacsPackage.WALL_POSITION_UI_DS_TYPE:
			return createWallPositionUIDsType();
		case CpacsPackage.WALL_SEGMENTS_TYPE:
			return createWallSegmentsType();
		case CpacsPackage.WALL_SEGMENT_TYPE:
			return createWallSegmentType();
		case CpacsPackage.WALLS_TYPE:
			return createWallsType();
		case CpacsPackage.WAY_POINT_TYPE_TYPE:
			return createWayPointTypeType();
		case CpacsPackage.WEB_TYPE:
			return createWebType();
		case CpacsPackage.WEIGHT_AND_BALANCE_CASE_TYPE:
			return createWeightAndBalanceCaseType();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE:
			return createWeightAndBalanceFuelInTanksType();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANK_TYPE:
			return createWeightAndBalanceFuelInTankType();
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_TYPE:
			return createWeightAndBalanceFuelType();
		case CpacsPackage.WEIGHT_AND_BALANCEM_CARGOS_TYPE:
			return createWeightAndBalancemCargosType();
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE:
			return createWeightAndBalancemPaxxType();
		case CpacsPackage.WEIGHT_AND_BALANCE_PAYLOAD_TYPE:
			return createWeightAndBalancePayloadType();
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE:
			return createWeightAndBalanceType();
		case CpacsPackage.WHEELS_TYPE:
			return createWheelsType();
		case CpacsPackage.WHEEL_TYPE:
			return createWheelType();
		case CpacsPackage.WINDOW_ASSEMBLY_POSITION_TYPE:
			return createWindowAssemblyPositionType();
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE:
			return createWindowsAssemblyType();
		case CpacsPackage.WINDOWS_TYPE:
			return createWindowsType();
		case CpacsPackage.WING_AERO_PERFORMANCE_TYPE:
			return createWingAeroPerformanceType();
		case CpacsPackage.WING_AIRFOILS_TYPE:
			return createWingAirfoilsType();
		case CpacsPackage.WING_CELLS_TYPE:
			return createWingCellsType();
		case CpacsPackage.WING_CELL_TYPE:
			return createWingCellType();
		case CpacsPackage.WING_COEFFICIENTS_TYPE:
			return createWingCoefficientsType();
		case CpacsPackage.WING_COMPONENT_SEGMENT_STRUCTURE_TYPE:
			return createWingComponentSegmentStructureType();
		case CpacsPackage.WING_ELEMENTS_TYPE:
			return createWingElementsType();
		case CpacsPackage.WING_ELEMENT_TYPE:
			return createWingElementType();
		case CpacsPackage.WING_FUEL_TANK_BORDER_TYPE:
			return createWingFuelTankBorderType();
		case CpacsPackage.WING_FUEL_TANK_GEOMETRY_TYPE:
			return createWingFuelTankGeometryType();
		case CpacsPackage.WING_FUEL_TANKS_TYPE:
			return createWingFuelTanksType();
		case CpacsPackage.WING_FUEL_TANK_TYPE:
			return createWingFuelTankType();
		case CpacsPackage.WING_FUSELAGE_ATTACHMENTS_TYPE:
			return createWingFuselageAttachmentsType();
		case CpacsPackage.WING_FUSELAGE_ATTACHMENT_TYPE:
			return createWingFuselageAttachmentType();
		case CpacsPackage.WING_INTERFACE_DEFINITIONS_TYPE:
			return createWingInterfaceDefinitionsType();
		case CpacsPackage.WING_INTERFACE_MAIN_FRAMES_TYPE:
			return createWingInterfaceMainFramesType();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUTS_ASSEMBLY_TYPE:
			return createWingInterfaceSupportStrutsAssemblyType();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE:
			return createWingInterfaceSupportStrutType();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELLS_TYPE:
			return createWingIntermediateStructureCellsType();
		case CpacsPackage.WING_INTERMEDIATE_STRUCTURE_CELL_TYPE:
			return createWingIntermediateStructureCellType();
		case CpacsPackage.WING_RIB_CELL_TYPE:
			return createWingRibCellType();
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE:
			return createWingRibCrossSectionType();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE:
			return createWingRibExplicitPositioningType();
		case CpacsPackage.WING_RIB_POINT_TYPE:
			return createWingRibPointType();
		case CpacsPackage.WING_RIBS_DEFINITIONS_TYPE:
			return createWingRibsDefinitionsType();
		case CpacsPackage.WING_RIBS_DEFINITION_TYPE:
			return createWingRibsDefinitionType();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE:
			return createWingRibsPositioningType();
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE:
			return createWingsAeroPerformanceType();
		case CpacsPackage.WINGS_COEFFICIENTS_TYPE:
			return createWingsCoefficientsType();
		case CpacsPackage.WING_SECTIONS_TYPE:
			return createWingSectionsType();
		case CpacsPackage.WING_SECTION_TYPE:
			return createWingSectionType();
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE:
			return createWingSegmentCoefficientsType();
		case CpacsPackage.WING_SEGMENTS_COEFFICIENTS_TYPE:
			return createWingSegmentsCoefficientsType();
		case CpacsPackage.WING_SEGMENT_STRIP_COEFFICIENTS_TYPE:
			return createWingSegmentStripCoefficientsType();
		case CpacsPackage.WING_SEGMENTS_TYPE:
			return createWingSegmentsType();
		case CpacsPackage.WING_SEGMENT_TYPE:
			return createWingSegmentType();
		case CpacsPackage.WING_SHELL_TYPE:
			return createWingShellType();
		case CpacsPackage.WING_SKIN_TYPE:
			return createWingSkinType();
		case CpacsPackage.WING_SPAR_TYPE:
			return createWingSparType();
		case CpacsPackage.WING_STRINGER_TYPE:
			return createWingStringerType();
		case CpacsPackage.WING_STRUCTURAL_MOUNTS_TYPE:
			return createWingStructuralMountsType();
		case CpacsPackage.WINGS_TYPE:
			return createWingsType();
		case CpacsPackage.WING_TYPE:
			return createWingType();
		case CpacsPackage.WING_WING_ATTACHMENT_ELEMENTS_TYPE:
			return createWingWingAttachmentElementsType();
		case CpacsPackage.WING_WING_ATTACHMENT_SPARS_TYPE:
			return createWingWingAttachmentSparsType();
		case CpacsPackage.WING_WING_ATTACHMENTS_SPARS_TYPE:
			return createWingWingAttachmentsSparsType();
		case CpacsPackage.WING_WING_ATTACHMENTS_TYPE:
			return createWingWingAttachmentsType();
		case CpacsPackage.WING_WING_ATTACHMENT_TYPE:
			return createWingWingAttachmentType();
		case CpacsPackage.XSI_ISO_LINE_TYPE:
			return createXsiIsoLineType();
		case CpacsPackage.ZCOUPLINGS_TYPE:
			return createZCouplingsType();
		case CpacsPackage.ZCOUPLING_TYPE:
			return createZCouplingType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CpacsPackage.CPACS_VERSION_TYPE:
			return createCpacsVersionTypeFromString(eDataType, initialValue);
		case CpacsPackage.FORMAT_TYPE:
			return createFormatTypeFromString(eDataType, initialValue);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE:
			return createGeometricBaseTypeTypeFromString(eDataType, initialValue);
		case CpacsPackage.PLACEMENT_TYPE:
			return createPlacementTypeFromString(eDataType, initialValue);
		case CpacsPackage.REF_TYPE_TYPE:
			return createRefTypeTypeFromString(eDataType, initialValue);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE:
			return createRelationalOperatorTypeFromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE:
			return createSymmetryTypeFromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE1:
			return createSymmetryType1FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE2:
			return createSymmetryType2FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE4:
			return createSymmetryType4FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE5:
			return createSymmetryType5FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE6:
			return createSymmetryType6FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE7:
			return createSymmetryType7FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE8:
			return createSymmetryType8FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE9:
			return createSymmetryType9FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE10:
			return createSymmetryType10FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE11:
			return createSymmetryType11FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE12:
			return createSymmetryType12FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE13:
			return createSymmetryType13FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE14:
			return createSymmetryType14FromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE:
			return createTypeTypeFromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE3:
			return createTypeType3FromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE4:
			return createTypeType4FromString(eDataType, initialValue);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE:
			return createUncertaintyFunctionTypeFromString(eDataType, initialValue);
		case CpacsPackage.CPACS_VERSION_TYPE_OBJECT:
			return createCpacsVersionTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.FORMAT_TYPE_OBJECT:
			return createFormatTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE_OBJECT:
			return createGeometricBaseTypeTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.PLACEMENT_TYPE_OBJECT:
			return createPlacementTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.REF_TYPE_TYPE_OBJECT:
			return createRefTypeTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE_OBJECT:
			return createRelationalOperatorTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT:
			return createSymmetryTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT1:
			return createSymmetryTypeObject1FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT2:
			return createSymmetryTypeObject2FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT3:
			return createSymmetryTypeObject3FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT4:
			return createSymmetryTypeObject4FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT5:
			return createSymmetryTypeObject5FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT6:
			return createSymmetryTypeObject6FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT7:
			return createSymmetryTypeObject7FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT8:
			return createSymmetryTypeObject8FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT9:
			return createSymmetryTypeObject9FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT10:
			return createSymmetryTypeObject10FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT11:
			return createSymmetryTypeObject11FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT12:
			return createSymmetryTypeObject12FromString(eDataType, initialValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT13:
			return createSymmetryTypeObject13FromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE_OBJECT:
			return createTypeTypeObjectFromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE_OBJECT1:
			return createTypeTypeObject1FromString(eDataType, initialValue);
		case CpacsPackage.TYPE_TYPE_OBJECT2:
			return createTypeTypeObject2FromString(eDataType, initialValue);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE_OBJECT:
			return createUncertaintyFunctionTypeObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CpacsPackage.CPACS_VERSION_TYPE:
			return convertCpacsVersionTypeToString(eDataType, instanceValue);
		case CpacsPackage.FORMAT_TYPE:
			return convertFormatTypeToString(eDataType, instanceValue);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE:
			return convertGeometricBaseTypeTypeToString(eDataType, instanceValue);
		case CpacsPackage.PLACEMENT_TYPE:
			return convertPlacementTypeToString(eDataType, instanceValue);
		case CpacsPackage.REF_TYPE_TYPE:
			return convertRefTypeTypeToString(eDataType, instanceValue);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE:
			return convertRelationalOperatorTypeToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE:
			return convertSymmetryTypeToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE1:
			return convertSymmetryType1ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE2:
			return convertSymmetryType2ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE4:
			return convertSymmetryType4ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE5:
			return convertSymmetryType5ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE6:
			return convertSymmetryType6ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE7:
			return convertSymmetryType7ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE8:
			return convertSymmetryType8ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE9:
			return convertSymmetryType9ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE10:
			return convertSymmetryType10ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE11:
			return convertSymmetryType11ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE12:
			return convertSymmetryType12ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE13:
			return convertSymmetryType13ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE14:
			return convertSymmetryType14ToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE:
			return convertTypeTypeToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE3:
			return convertTypeType3ToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE4:
			return convertTypeType4ToString(eDataType, instanceValue);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE:
			return convertUncertaintyFunctionTypeToString(eDataType, instanceValue);
		case CpacsPackage.CPACS_VERSION_TYPE_OBJECT:
			return convertCpacsVersionTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.FORMAT_TYPE_OBJECT:
			return convertFormatTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.GEOMETRIC_BASE_TYPE_TYPE_OBJECT:
			return convertGeometricBaseTypeTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.PLACEMENT_TYPE_OBJECT:
			return convertPlacementTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.REF_TYPE_TYPE_OBJECT:
			return convertRefTypeTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.RELATIONAL_OPERATOR_TYPE_OBJECT:
			return convertRelationalOperatorTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT:
			return convertSymmetryTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT1:
			return convertSymmetryTypeObject1ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT2:
			return convertSymmetryTypeObject2ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT3:
			return convertSymmetryTypeObject3ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT4:
			return convertSymmetryTypeObject4ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT5:
			return convertSymmetryTypeObject5ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT6:
			return convertSymmetryTypeObject6ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT7:
			return convertSymmetryTypeObject7ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT8:
			return convertSymmetryTypeObject8ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT9:
			return convertSymmetryTypeObject9ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT10:
			return convertSymmetryTypeObject10ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT11:
			return convertSymmetryTypeObject11ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT12:
			return convertSymmetryTypeObject12ToString(eDataType, instanceValue);
		case CpacsPackage.SYMMETRY_TYPE_OBJECT13:
			return convertSymmetryTypeObject13ToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE_OBJECT:
			return convertTypeTypeObjectToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE_OBJECT1:
			return convertTypeTypeObject1ToString(eDataType, instanceValue);
		case CpacsPackage.TYPE_TYPE_OBJECT2:
			return convertTypeTypeObject2ToString(eDataType, instanceValue);
		case CpacsPackage.UNCERTAINTY_FUNCTION_TYPE_OBJECT:
			return convertUncertaintyFunctionTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorAttachmentType createActuatorAttachmentType() {
		ActuatorAttachmentTypeImpl actuatorAttachmentType = new ActuatorAttachmentTypeImpl();
		return actuatorAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorControlSurfaceAttachmentType createActuatorControlSurfaceAttachmentType() {
		ActuatorControlSurfaceAttachmentTypeImpl actuatorControlSurfaceAttachmentType = new ActuatorControlSurfaceAttachmentTypeImpl();
		return actuatorControlSurfaceAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorFuselageWingAttachmentType createActuatorFuselageWingAttachmentType() {
		ActuatorFuselageWingAttachmentTypeImpl actuatorFuselageWingAttachmentType = new ActuatorFuselageWingAttachmentTypeImpl();
		return actuatorFuselageWingAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorFuselageWingType createActuatorFuselageWingType() {
		ActuatorFuselageWingTypeImpl actuatorFuselageWingType = new ActuatorFuselageWingTypeImpl();
		return actuatorFuselageWingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorParentAttachmentType createActuatorParentAttachmentType() {
		ActuatorParentAttachmentTypeImpl actuatorParentAttachmentType = new ActuatorParentAttachmentTypeImpl();
		return actuatorParentAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorsFuselageWingType createActuatorsFuselageWingType() {
		ActuatorsFuselageWingTypeImpl actuatorsFuselageWingType = new ActuatorsFuselageWingTypeImpl();
		return actuatorsFuselageWingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalParametersType createAdditionalParametersType() {
		AdditionalParametersTypeImpl additionalParametersType = new AdditionalParametersTypeImpl();
		return additionalParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalParameterType createAdditionalParameterType() {
		AdditionalParameterTypeImpl additionalParameterType = new AdditionalParameterTypeImpl();
		return additionalParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroDataSetForLoadsType createAeroDataSetForLoadsType() {
		AeroDataSetForLoadsTypeImpl aeroDataSetForLoadsType = new AeroDataSetForLoadsTypeImpl();
		return aeroDataSetForLoadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroDataSetsForLoadsType createAeroDataSetsForLoadsType() {
		AeroDataSetsForLoadsTypeImpl aeroDataSetsForLoadsType = new AeroDataSetsForLoadsTypeImpl();
		return aeroDataSetsForLoadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticDivergenceType createAeroelasticDivergenceType() {
		AeroelasticDivergenceTypeImpl aeroelasticDivergenceType = new AeroelasticDivergenceTypeImpl();
		return aeroelasticDivergenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticStaticMaxDisplacementType createAeroelasticStaticMaxDisplacementType() {
		AeroelasticStaticMaxDisplacementTypeImpl aeroelasticStaticMaxDisplacementType = new AeroelasticStaticMaxDisplacementTypeImpl();
		return aeroelasticStaticMaxDisplacementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticsType createAeroelasticsType() {
		AeroelasticsTypeImpl aeroelasticsType = new AeroelasticsTypeImpl();
		return aeroelasticsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroLimitsIncrementMapsType createAeroLimitsIncrementMapsType() {
		AeroLimitsIncrementMapsTypeImpl aeroLimitsIncrementMapsType = new AeroLimitsIncrementMapsTypeImpl();
		return aeroLimitsIncrementMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroLimitsMapType createAeroLimitsMapType() {
		AeroLimitsMapTypeImpl aeroLimitsMapType = new AeroLimitsMapTypeImpl();
		return aeroLimitsMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroMapOperationLimitType createAeroMapOperationLimitType() {
		AeroMapOperationLimitTypeImpl aeroMapOperationLimitType = new AeroMapOperationLimitTypeImpl();
		return aeroMapOperationLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroMapType createAeroMapType() {
		AeroMapTypeImpl aeroMapType = new AeroMapTypeImpl();
		return aeroMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceBoundaryConditionsType createAeroPerformanceBoundaryConditionsType() {
		AeroPerformanceBoundaryConditionsTypeImpl aeroPerformanceBoundaryConditionsType = new AeroPerformanceBoundaryConditionsTypeImpl();
		return aeroPerformanceBoundaryConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceControlElementsType createAeroPerformanceControlElementsType() {
		AeroPerformanceControlElementsTypeImpl aeroPerformanceControlElementsType = new AeroPerformanceControlElementsTypeImpl();
		return aeroPerformanceControlElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceControlElementType createAeroPerformanceControlElementType() {
		AeroPerformanceControlElementTypeImpl aeroPerformanceControlElementType = new AeroPerformanceControlElementTypeImpl();
		return aeroPerformanceControlElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceIncrementMapsType createAeroPerformanceIncrementMapsType() {
		AeroPerformanceIncrementMapsTypeImpl aeroPerformanceIncrementMapsType = new AeroPerformanceIncrementMapsTypeImpl();
		return aeroPerformanceIncrementMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceIncrementMapType createAeroPerformanceIncrementMapType() {
		AeroPerformanceIncrementMapTypeImpl aeroPerformanceIncrementMapType = new AeroPerformanceIncrementMapTypeImpl();
		return aeroPerformanceIncrementMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceMapRCType createAeroPerformanceMapRCType() {
		AeroPerformanceMapRCTypeImpl aeroPerformanceMapRCType = new AeroPerformanceMapRCTypeImpl();
		return aeroPerformanceMapRCType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceMapsRCType createAeroPerformanceMapsRCType() {
		AeroPerformanceMapsRCTypeImpl aeroPerformanceMapsRCType = new AeroPerformanceMapsRCTypeImpl();
		return aeroPerformanceMapsRCType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceMapType createAeroPerformanceMapType() {
		AeroPerformanceMapTypeImpl aeroPerformanceMapType = new AeroPerformanceMapTypeImpl();
		return aeroPerformanceMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceRCType createAeroPerformanceRCType() {
		AeroPerformanceRCTypeImpl aeroPerformanceRCType = new AeroPerformanceRCTypeImpl();
		return aeroPerformanceRCType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceType createAeroPerformanceType() {
		AeroPerformanceTypeImpl aeroPerformanceType = new AeroPerformanceTypeImpl();
		return aeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftAnalysesType createAircraftAnalysesType() {
		AircraftAnalysesTypeImpl aircraftAnalysesType = new AircraftAnalysesTypeImpl();
		return aircraftAnalysesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftGlobalType createAircraftGlobalType() {
		AircraftGlobalTypeImpl aircraftGlobalType = new AircraftGlobalTypeImpl();
		return aircraftGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftModelType createAircraftModelType() {
		AircraftModelTypeImpl aircraftModelType = new AircraftModelTypeImpl();
		return aircraftModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftType createAircraftType() {
		AircraftTypeImpl aircraftType = new AircraftTypeImpl();
		return aircraftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirfoilAeroPerformanceType createAirfoilAeroPerformanceType() {
		AirfoilAeroPerformanceTypeImpl airfoilAeroPerformanceType = new AirfoilAeroPerformanceTypeImpl();
		return airfoilAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirfoilsAeroPerformanceType createAirfoilsAeroPerformanceType() {
		AirfoilsAeroPerformanceTypeImpl airfoilsAeroPerformanceType = new AirfoilsAeroPerformanceTypeImpl();
		return airfoilsAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirframeMaintenanceCostType createAirframeMaintenanceCostType() {
		AirframeMaintenanceCostTypeImpl airframeMaintenanceCostType = new AirframeMaintenanceCostTypeImpl();
		return airframeMaintenanceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirlinesType createAirlinesType() {
		AirlinesTypeImpl airlinesType = new AirlinesTypeImpl();
		return airlinesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirlineType createAirlineType() {
		AirlineTypeImpl airlineType = new AirlineTypeImpl();
		return airlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportCompatabilityGlobalType createAirportCompatabilityGlobalType() {
		AirportCompatabilityGlobalTypeImpl airportCompatabilityGlobalType = new AirportCompatabilityGlobalTypeImpl();
		return airportCompatabilityGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportsType createAirportsType() {
		AirportsTypeImpl airportsType = new AirportsTypeImpl();
		return airportsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportType createAirportType() {
		AirportTypeImpl airportType = new AirportTypeImpl();
		return airportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentCrossBeamType createAlignmentCrossBeamType() {
		AlignmentCrossBeamTypeImpl alignmentCrossBeamType = new AlignmentCrossBeamTypeImpl();
		return alignmentCrossBeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentFloorPanelType createAlignmentFloorPanelType() {
		AlignmentFloorPanelTypeImpl alignmentFloorPanelType = new AlignmentFloorPanelTypeImpl();
		return alignmentFloorPanelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentStringFrameType createAlignmentStringFrameType() {
		AlignmentStringFrameTypeImpl alignmentStringFrameType = new AlignmentStringFrameTypeImpl();
		return alignmentStringFrameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentStructMemberType createAlignmentStructMemberType() {
		AlignmentStructMemberTypeImpl alignmentStructMemberType = new AlignmentStructMemberTypeImpl();
		return alignmentStructMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleAccelerationType createAngleAccelerationType() {
		AngleAccelerationTypeImpl angleAccelerationType = new AngleAccelerationTypeImpl();
		return angleAccelerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleDisplacementType createAngleDisplacementType() {
		AngleDisplacementTypeImpl angleDisplacementType = new AngleDisplacementTypeImpl();
		return angleDisplacementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnisotropicShellPropertiesType createAnisotropicShellPropertiesType() {
		AnisotropicShellPropertiesTypeImpl anisotropicShellPropertiesType = new AnisotropicShellPropertiesTypeImpl();
		return anisotropicShellPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnisotropicSolidPropertiesType createAnisotropicSolidPropertiesType() {
		AnisotropicSolidPropertiesTypeImpl anisotropicSolidPropertiesType = new AnisotropicSolidPropertiesTypeImpl();
		return anisotropicSolidPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericConditionsType createAtmosphericConditionsType() {
		AtmosphericConditionsTypeImpl atmosphericConditionsType = new AtmosphericConditionsTypeImpl();
		return atmosphericConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelOldType createAtmosphericModelOldType() {
		AtmosphericModelOldTypeImpl atmosphericModelOldType = new AtmosphericModelOldTypeImpl();
		return atmosphericModelOldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelType createAtmosphericModelType() {
		AtmosphericModelTypeImpl atmosphericModelType = new AtmosphericModelTypeImpl();
		return atmosphericModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtmosphericModelType1 createAtmosphericModelType1() {
		AtmosphericModelType1Impl atmosphericModelType1 = new AtmosphericModelType1Impl();
		return atmosphericModelType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachmentPinsType createAttachmentPinsType() {
		AttachmentPinsTypeImpl attachmentPinsType = new AttachmentPinsTypeImpl();
		return attachmentPinsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachmentPinType createAttachmentPinType() {
		AttachmentPinTypeImpl attachmentPinType = new AttachmentPinTypeImpl();
		return attachmentPinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttitudeAndMotionType createAttitudeAndMotionType() {
		AttitudeAndMotionTypeImpl attitudeAndMotionType = new AttitudeAndMotionTypeImpl();
		return attitudeAndMotionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxlesType createAxlesType() {
		AxlesTypeImpl axlesType = new AxlesTypeImpl();
		return axlesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxleType createAxleType() {
		AxleTypeImpl axleType = new AxleTypeImpl();
		return axleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeamCrossSectionType createBeamCrossSectionType() {
		BeamCrossSectionTypeImpl beamCrossSectionType = new BeamCrossSectionTypeImpl();
		return beamCrossSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeamStiffnessType createBeamStiffnessType() {
		BeamStiffnessTypeImpl beamStiffnessType = new BeamStiffnessTypeImpl();
		return beamStiffnessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockedDOFType createBlockedDOFType() {
		BlockedDOFTypeImpl blockedDOFType = new BlockedDOFTypeImpl();
		return blockedDOFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BogieAxlesType createBogieAxlesType() {
		BogieAxlesTypeImpl bogieAxlesType = new BogieAxlesTypeImpl();
		return bogieAxlesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BogieAxleType createBogieAxleType() {
		BogieAxleTypeImpl bogieAxleType = new BogieAxleTypeImpl();
		return bogieAxleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BogieType createBogieType() {
		BogieTypeImpl bogieType = new BogieTypeImpl();
		return bogieType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType createBooleanBaseType() {
		BooleanBaseTypeImpl booleanBaseType = new BooleanBaseTypeImpl();
		return booleanBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingElementUIDsType createBoundingElementUIDsType() {
		BoundingElementUIDsTypeImpl boundingElementUIDsType = new BoundingElementUIDsTypeImpl();
		return boundingElementUIDsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabGeometryType createCabGeometryType() {
		CabGeometryTypeImpl cabGeometryType = new CabGeometryTypeImpl();
		return cabGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinAislesType createCabinAislesType() {
		CabinAislesTypeImpl cabinAislesType = new CabinAislesTypeImpl();
		return cabinAislesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinAisleType createCabinAisleType() {
		CabinAisleTypeImpl cabinAisleType = new CabinAisleTypeImpl();
		return cabinAisleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinDoorsType createCabinDoorsType() {
		CabinDoorsTypeImpl cabinDoorsType = new CabinDoorsTypeImpl();
		return cabinDoorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinDoorType createCabinDoorType() {
		CabinDoorTypeImpl cabinDoorType = new CabinDoorTypeImpl();
		return cabinDoorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinFloorElementsType createCabinFloorElementsType() {
		CabinFloorElementsTypeImpl cabinFloorElementsType = new CabinFloorElementsTypeImpl();
		return cabinFloorElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinFloorElementType createCabinFloorElementType() {
		CabinFloorElementTypeImpl cabinFloorElementType = new CabinFloorElementTypeImpl();
		return cabinFloorElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSeatElementsType createCabinSeatElementsType() {
		CabinSeatElementsTypeImpl cabinSeatElementsType = new CabinSeatElementsTypeImpl();
		return cabinSeatElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSeatElementType createCabinSeatElementType() {
		CabinSeatElementTypeImpl cabinSeatElementType = new CabinSeatElementTypeImpl();
		return cabinSeatElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSpacesType createCabinSpacesType() {
		CabinSpacesTypeImpl cabinSpacesType = new CabinSpacesTypeImpl();
		return cabinSpacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSpaceType createCabinSpaceType() {
		CabinSpaceTypeImpl cabinSpaceType = new CabinSpaceTypeImpl();
		return cabinSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType createCapType() {
		CapTypeImpl capType = new CapTypeImpl();
		return capType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoCrossBeamsAssemblyType createCargoCrossBeamsAssemblyType() {
		CargoCrossBeamsAssemblyTypeImpl cargoCrossBeamsAssemblyType = new CargoCrossBeamsAssemblyTypeImpl();
		return cargoCrossBeamsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoCrossBeamStrutsAssemblyType createCargoCrossBeamStrutsAssemblyType() {
		CargoCrossBeamStrutsAssemblyTypeImpl cargoCrossBeamStrutsAssemblyType = new CargoCrossBeamStrutsAssemblyTypeImpl();
		return cargoCrossBeamStrutsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoDoorsAssemblyType createCargoDoorsAssemblyType() {
		CargoDoorsAssemblyTypeImpl cargoDoorsAssemblyType = new CargoDoorsAssemblyTypeImpl();
		return cargoDoorsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningChordwiseType createCellPositioningChordwiseType() {
		CellPositioningChordwiseTypeImpl cellPositioningChordwiseType = new CellPositioningChordwiseTypeImpl();
		return cellPositioningChordwiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningSpanwiseType createCellPositioningSpanwiseType() {
		CellPositioningSpanwiseTypeImpl cellPositioningSpanwiseType = new CellPositioningSpanwiseTypeImpl();
		return cellPositioningSpanwiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageAreasAssemblyType createCenterFuselageAreasAssemblyType() {
		CenterFuselageAreasAssemblyTypeImpl centerFuselageAreasAssemblyType = new CenterFuselageAreasAssemblyTypeImpl();
		return centerFuselageAreasAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageAreaType createCenterFuselageAreaType() {
		CenterFuselageAreaTypeImpl centerFuselageAreaType = new CenterFuselageAreaTypeImpl();
		return centerFuselageAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageHighWingConfigurationType createCenterFuselageHighWingConfigurationType() {
		CenterFuselageHighWingConfigurationTypeImpl centerFuselageHighWingConfigurationType = new CenterFuselageHighWingConfigurationTypeImpl();
		return centerFuselageHighWingConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageKeelbeamType createCenterFuselageKeelbeamType() {
		CenterFuselageKeelbeamTypeImpl centerFuselageKeelbeamType = new CenterFuselageKeelbeamTypeImpl();
		return centerFuselageKeelbeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLateralPanelsType createCenterFuselageLateralPanelsType() {
		CenterFuselageLateralPanelsTypeImpl centerFuselageLateralPanelsType = new CenterFuselageLateralPanelsTypeImpl();
		return centerFuselageLateralPanelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLongFloorBeamsConnectionType createCenterFuselageLongFloorBeamsConnectionType() {
		CenterFuselageLongFloorBeamsConnectionTypeImpl centerFuselageLongFloorBeamsConnectionType = new CenterFuselageLongFloorBeamsConnectionTypeImpl();
		return centerFuselageLongFloorBeamsConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLowWingConfigurationType createCenterFuselageLowWingConfigurationType() {
		CenterFuselageLowWingConfigurationTypeImpl centerFuselageLowWingConfigurationType = new CenterFuselageLowWingConfigurationTypeImpl();
		return centerFuselageLowWingConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageMainFramesType createCenterFuselageMainFramesType() {
		CenterFuselageMainFramesTypeImpl centerFuselageMainFramesType = new CenterFuselageMainFramesTypeImpl();
		return centerFuselageMainFramesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselagePressureFloorType createCenterFuselagePressureFloorType() {
		CenterFuselagePressureFloorTypeImpl centerFuselagePressureFloorType = new CenterFuselagePressureFloorTypeImpl();
		return centerFuselagePressureFloorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageSideboxType createCenterFuselageSideboxType() {
		CenterFuselageSideboxTypeImpl centerFuselageSideboxType = new CenterFuselageSideboxTypeImpl();
		return centerFuselageSideboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificationCasesType createCertificationCasesType() {
		CertificationCasesTypeImpl certificationCasesType = new CertificationCasesTypeImpl();
		return certificationCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargesCostType createChargesCostType() {
		ChargesCostTypeImpl chargesCostType = new ChargesCostTypeImpl();
		return chargesCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlsType createCockpitControlsType() {
		CockpitControlsTypeImpl cockpitControlsType = new CockpitControlsTypeImpl();
		return cockpitControlsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CockpitControlType createCockpitControlType() {
		CockpitControlTypeImpl cockpitControlType = new CockpitControlTypeImpl();
		return cockpitControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoefficientsType createCoefficientsType() {
		CoefficientsTypeImpl coefficientsType = new CoefficientsTypeImpl();
		return coefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseCommandType createCommandCaseCommandType() {
		CommandCaseCommandTypeImpl commandCaseCommandType = new CommandCaseCommandTypeImpl();
		return commandCaseCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCasesType createCommandCasesType() {
		CommandCasesTypeImpl commandCasesType = new CommandCasesTypeImpl();
		return commandCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandCaseType createCommandCaseType() {
		CommandCaseTypeImpl commandCaseType = new CommandCaseTypeImpl();
		return commandCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentGeometryType createCompartmentGeometryType() {
		CompartmentGeometryTypeImpl compartmentGeometryType = new CompartmentGeometryTypeImpl();
		return compartmentGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentsType createCompartmentsType() {
		CompartmentsTypeImpl compartmentsType = new CompartmentsTypeImpl();
		return compartmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexBaseType createComplexBaseType() {
		ComplexBaseTypeImpl complexBaseType = new ComplexBaseTypeImpl();
		return complexBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCostType createComponentCostType() {
		ComponentCostTypeImpl componentCostType = new ComponentCostTypeImpl();
		return componentCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCutLoadsEnvelopeType createComponentCutLoadsEnvelopeType() {
		ComponentCutLoadsEnvelopeTypeImpl componentCutLoadsEnvelopeType = new ComponentCutLoadsEnvelopeTypeImpl();
		return componentCutLoadsEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentPathType createComponentSegmentPathType() {
		ComponentSegmentPathTypeImpl componentSegmentPathType = new ComponentSegmentPathTypeImpl();
		return componentSegmentPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentStepsType createComponentSegmentStepsType() {
		ComponentSegmentStepsTypeImpl componentSegmentStepsType = new ComponentSegmentStepsTypeImpl();
		return componentSegmentStepsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentStepType createComponentSegmentStepType() {
		ComponentSegmentStepTypeImpl componentSegmentStepType = new ComponentSegmentStepTypeImpl();
		return componentSegmentStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentsType createComponentSegmentsType() {
		ComponentSegmentsTypeImpl componentSegmentsType = new ComponentSegmentsTypeImpl();
		return componentSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSegmentType createComponentSegmentType() {
		ComponentSegmentTypeImpl componentSegmentType = new ComponentSegmentTypeImpl();
		return componentSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeLayerType createCompositeLayerType() {
		CompositeLayerTypeImpl compositeLayerType = new CompositeLayerTypeImpl();
		return compositeLayerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositesType createCompositesType() {
		CompositesTypeImpl compositesType = new CompositesTypeImpl();
		return compositesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectivitiesType createConnectivitiesType() {
		ConnectivitiesTypeImpl connectivitiesType = new ConnectivitiesTypeImpl();
		return connectivitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectivityType createConnectivityType() {
		ConnectivityTypeImpl connectivityType = new ConnectivityTypeImpl();
		return connectivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSettingsPointPerformanceType createConstraintSettingsPointPerformanceType() {
		ConstraintSettingsPointPerformanceTypeImpl constraintSettingsPointPerformanceType = new ConstraintSettingsPointPerformanceTypeImpl();
		return constraintSettingsPointPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSettingsType createConstraintSettingsType() {
		ConstraintSettingsTypeImpl constraintSettingsType = new ConstraintSettingsTypeImpl();
		return constraintSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityAtP1Type createContinuityAtP1Type() {
		ContinuityAtP1TypeImpl continuityAtP1Type = new ContinuityAtP1TypeImpl();
		return continuityAtP1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityAtP2Type createContinuityAtP2Type() {
		ContinuityAtP2TypeImpl continuityAtP2Type = new ContinuityAtP2TypeImpl();
		return continuityAtP2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType createContinuityType() {
		ContinuityTypeImpl continuityType = new ContinuityTypeImpl();
		return continuityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType1 createContinuityType1() {
		ContinuityType1Impl continuityType1 = new ContinuityType1Impl();
		return continuityType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType2 createContinuityType2() {
		ContinuityType2Impl continuityType2 = new ContinuityType2Impl();
		return continuityType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType3 createContinuityType3() {
		ContinuityType3Impl continuityType3 = new ContinuityType3Impl();
		return continuityType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContourReferenceType createContourReferenceType() {
		ContourReferenceTypeImpl contourReferenceType = new ContourReferenceTypeImpl();
		return contourReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlDistributorsType createControlDistributorsType() {
		ControlDistributorsTypeImpl controlDistributorsType = new ControlDistributorsTypeImpl();
		return controlDistributorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlDistributorType createControlDistributorType() {
		ControlDistributorTypeImpl controlDistributorType = new ControlDistributorTypeImpl();
		return controlDistributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlElementsType createControlElementsType() {
		ControlElementsTypeImpl controlElementsType = new ControlElementsTypeImpl();
		return controlElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlElementType createControlElementType() {
		ControlElementTypeImpl controlElementType = new ControlElementTypeImpl();
		return controlElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlFunctionsType createControlFunctionsType() {
		ControlFunctionsTypeImpl controlFunctionsType = new ControlFunctionsTypeImpl();
		return controlFunctionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlFunctionType createControlFunctionType() {
		ControlFunctionTypeImpl controlFunctionType = new ControlFunctionTypeImpl();
		return controlFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlInputsType createControlInputsType() {
		ControlInputsTypeImpl controlInputsType = new ControlInputsTypeImpl();
		return controlInputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlInputType createControlInputType() {
		ControlInputTypeImpl controlInputType = new ControlInputTypeImpl();
		return controlInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawModesType createControlLawModesType() {
		ControlLawModesTypeImpl controlLawModesType = new ControlLawModesTypeImpl();
		return controlLawModesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawModeType createControlLawModeType() {
		ControlLawModeTypeImpl controlLawModeType = new ControlLawModeTypeImpl();
		return controlLawModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawsType createControlLawsType() {
		ControlLawsTypeImpl controlLawsType = new ControlLawsTypeImpl();
		return controlLawsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceActuatorsType createControlSurfaceActuatorsType() {
		ControlSurfaceActuatorsTypeImpl controlSurfaceActuatorsType = new ControlSurfaceActuatorsTypeImpl();
		return controlSurfaceActuatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceActuatorType createControlSurfaceActuatorType() {
		ControlSurfaceActuatorTypeImpl controlSurfaceActuatorType = new ControlSurfaceActuatorTypeImpl();
		return controlSurfaceActuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceAirfoilType createControlSurfaceAirfoilType() {
		ControlSurfaceAirfoilTypeImpl controlSurfaceAirfoilType = new ControlSurfaceAirfoilTypeImpl();
		return controlSurfaceAirfoilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceBorderLeadingEdgeType createControlSurfaceBorderLeadingEdgeType() {
		ControlSurfaceBorderLeadingEdgeTypeImpl controlSurfaceBorderLeadingEdgeType = new ControlSurfaceBorderLeadingEdgeTypeImpl();
		return controlSurfaceBorderLeadingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceBorderSpoilerType createControlSurfaceBorderSpoilerType() {
		ControlSurfaceBorderSpoilerTypeImpl controlSurfaceBorderSpoilerType = new ControlSurfaceBorderSpoilerTypeImpl();
		return controlSurfaceBorderSpoilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceBorderTrailingEdgeType createControlSurfaceBorderTrailingEdgeType() {
		ControlSurfaceBorderTrailingEdgeTypeImpl controlSurfaceBorderTrailingEdgeType = new ControlSurfaceBorderTrailingEdgeTypeImpl();
		return controlSurfaceBorderTrailingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceContoursType createControlSurfaceContoursType() {
		ControlSurfaceContoursTypeImpl controlSurfaceContoursType = new ControlSurfaceContoursTypeImpl();
		return controlSurfaceContoursType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionsType createControlSurfaceDeflectionsType() {
		ControlSurfaceDeflectionsTypeImpl controlSurfaceDeflectionsType = new ControlSurfaceDeflectionsTypeImpl();
		return controlSurfaceDeflectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionType createControlSurfaceDeflectionType() {
		ControlSurfaceDeflectionTypeImpl controlSurfaceDeflectionType = new ControlSurfaceDeflectionTypeImpl();
		return controlSurfaceDeflectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionVectorsType createControlSurfaceDeflectionVectorsType() {
		ControlSurfaceDeflectionVectorsTypeImpl controlSurfaceDeflectionVectorsType = new ControlSurfaceDeflectionVectorsTypeImpl();
		return controlSurfaceDeflectionVectorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionVectorType createControlSurfaceDeflectionVectorType() {
		ControlSurfaceDeflectionVectorTypeImpl controlSurfaceDeflectionVectorType = new ControlSurfaceDeflectionVectorTypeImpl();
		return controlSurfaceDeflectionVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingeMomentMapsType createControlSurfaceHingeMomentMapsType() {
		ControlSurfaceHingeMomentMapsTypeImpl controlSurfaceHingeMomentMapsType = new ControlSurfaceHingeMomentMapsTypeImpl();
		return controlSurfaceHingeMomentMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingeMomentMapType createControlSurfaceHingeMomentMapType() {
		ControlSurfaceHingeMomentMapTypeImpl controlSurfaceHingeMomentMapType = new ControlSurfaceHingeMomentMapTypeImpl();
		return controlSurfaceHingeMomentMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingePointType createControlSurfaceHingePointType() {
		ControlSurfaceHingePointTypeImpl controlSurfaceHingePointType = new ControlSurfaceHingePointTypeImpl();
		return controlSurfaceHingePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceOuterShapeLeadingEdgeType createControlSurfaceOuterShapeLeadingEdgeType() {
		ControlSurfaceOuterShapeLeadingEdgeTypeImpl controlSurfaceOuterShapeLeadingEdgeType = new ControlSurfaceOuterShapeLeadingEdgeTypeImpl();
		return controlSurfaceOuterShapeLeadingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceOuterShapeSpoilerType createControlSurfaceOuterShapeSpoilerType() {
		ControlSurfaceOuterShapeSpoilerTypeImpl controlSurfaceOuterShapeSpoilerType = new ControlSurfaceOuterShapeSpoilerTypeImpl();
		return controlSurfaceOuterShapeSpoilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceOuterShapeTrailingEdgeType createControlSurfaceOuterShapeTrailingEdgeType() {
		ControlSurfaceOuterShapeTrailingEdgeTypeImpl controlSurfaceOuterShapeTrailingEdgeType = new ControlSurfaceOuterShapeTrailingEdgeTypeImpl();
		return controlSurfaceOuterShapeTrailingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacePathType createControlSurfacePathType() {
		ControlSurfacePathTypeImpl controlSurfacePathType = new ControlSurfacePathTypeImpl();
		return controlSurfacePathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacePerformanceMapOldType createControlSurfacePerformanceMapOldType() {
		ControlSurfacePerformanceMapOldTypeImpl controlSurfacePerformanceMapOldType = new ControlSurfacePerformanceMapOldTypeImpl();
		return controlSurfacePerformanceMapOldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacePerformanceMapsOldType createControlSurfacePerformanceMapsOldType() {
		ControlSurfacePerformanceMapsOldTypeImpl controlSurfacePerformanceMapsOldType = new ControlSurfacePerformanceMapsOldTypeImpl();
		return controlSurfacePerformanceMapsOldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutBorderType createControlSurfaceSkinCutOutBorderType() {
		ControlSurfaceSkinCutOutBorderTypeImpl controlSurfaceSkinCutOutBorderType = new ControlSurfaceSkinCutOutBorderTypeImpl();
		return controlSurfaceSkinCutOutBorderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceSkinCutOutType createControlSurfaceSkinCutOutType() {
		ControlSurfaceSkinCutOutTypeImpl controlSurfaceSkinCutOutType = new ControlSurfaceSkinCutOutTypeImpl();
		return controlSurfaceSkinCutOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceStepsType createControlSurfaceStepsType() {
		ControlSurfaceStepsTypeImpl controlSurfaceStepsType = new ControlSurfaceStepsTypeImpl();
		return controlSurfaceStepsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceStepType createControlSurfaceStepType() {
		ControlSurfaceStepTypeImpl controlSurfaceStepType = new ControlSurfaceStepTypeImpl();
		return controlSurfaceStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacesType createControlSurfacesType() {
		ControlSurfacesTypeImpl controlSurfacesType = new ControlSurfacesTypeImpl();
		return controlSurfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceTracksType createControlSurfaceTracksType() {
		ControlSurfaceTracksTypeImpl controlSurfaceTracksType = new ControlSurfaceTracksTypeImpl();
		return controlSurfaceTracksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceTrackTypeType createControlSurfaceTrackTypeType() {
		ControlSurfaceTrackTypeTypeImpl controlSurfaceTrackTypeType = new ControlSurfaceTrackTypeTypeImpl();
		return controlSurfaceTrackTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceWingCutOutType createControlSurfaceWingCutOutType() {
		ControlSurfaceWingCutOutTypeImpl controlSurfaceWingCutOutType = new ControlSurfaceWingCutOutTypeImpl();
		return controlSurfaceWingCutOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAirConditioningSystemsType createCostAirConditioningSystemsType() {
		CostAirConditioningSystemsTypeImpl costAirConditioningSystemsType = new CostAirConditioningSystemsTypeImpl();
		return costAirConditioningSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAutomaticFlightSystemsType createCostAutomaticFlightSystemsType() {
		CostAutomaticFlightSystemsTypeImpl costAutomaticFlightSystemsType = new CostAutomaticFlightSystemsTypeImpl();
		return costAutomaticFlightSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAuxilaryPowerUnitsType createCostAuxilaryPowerUnitsType() {
		CostAuxilaryPowerUnitsTypeImpl costAuxilaryPowerUnitsType = new CostAuxilaryPowerUnitsTypeImpl();
		return costAuxilaryPowerUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostBleedAirSystemsType createCostBleedAirSystemsType() {
		CostBleedAirSystemsTypeImpl costBleedAirSystemsType = new CostBleedAirSystemsTypeImpl();
		return costBleedAirSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostCommunicationSystemsType createCostCommunicationSystemsType() {
		CostCommunicationSystemsTypeImpl costCommunicationSystemsType = new CostCommunicationSystemsTypeImpl();
		return costCommunicationSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentsType createCostComponentsType() {
		CostComponentsTypeImpl costComponentsType = new CostComponentsTypeImpl();
		return costComponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostDeIcingSystemsType createCostDeIcingSystemsType() {
		CostDeIcingSystemsTypeImpl costDeIcingSystemsType = new CostDeIcingSystemsTypeImpl();
		return costDeIcingSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostElectricalSystemsType createCostElectricalSystemsType() {
		CostElectricalSystemsTypeImpl costElectricalSystemsType = new CostElectricalSystemsTypeImpl();
		return costElectricalSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostEnginePylonsType createCostEnginePylonsType() {
		CostEnginePylonsTypeImpl costEnginePylonsType = new CostEnginePylonsTypeImpl();
		return costEnginePylonsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostEquippedEnginesType createCostEquippedEnginesType() {
		CostEquippedEnginesTypeImpl costEquippedEnginesType = new CostEquippedEnginesTypeImpl();
		return costEquippedEnginesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFireProtectionSystemsType createCostFireProtectionSystemsType() {
		CostFireProtectionSystemsTypeImpl costFireProtectionSystemsType = new CostFireProtectionSystemsTypeImpl();
		return costFireProtectionSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFixedEmergencyOxygenSystemsType createCostFixedEmergencyOxygenSystemsType() {
		CostFixedEmergencyOxygenSystemsTypeImpl costFixedEmergencyOxygenSystemsType = new CostFixedEmergencyOxygenSystemsTypeImpl();
		return costFixedEmergencyOxygenSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFlightControlSystemsType createCostFlightControlSystemsType() {
		CostFlightControlSystemsTypeImpl costFlightControlSystemsType = new CostFlightControlSystemsTypeImpl();
		return costFlightControlSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFuelSystemsType createCostFuelSystemsType() {
		CostFuelSystemsTypeImpl costFuelSystemsType = new CostFuelSystemsTypeImpl();
		return costFuelSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFurnishingElementsType createCostFurnishingElementsType() {
		CostFurnishingElementsTypeImpl costFurnishingElementsType = new CostFurnishingElementsTypeImpl();
		return costFurnishingElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFurnishingsType createCostFurnishingsType() {
		CostFurnishingsTypeImpl costFurnishingsType = new CostFurnishingsTypeImpl();
		return costFurnishingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFuselagesType createCostFuselagesType() {
		CostFuselagesTypeImpl costFuselagesType = new CostFuselagesTypeImpl();
		return costFuselagesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostHydraulicSystemsType createCostHydraulicSystemsType() {
		CostHydraulicSystemsTypeImpl costHydraulicSystemsType = new CostHydraulicSystemsTypeImpl();
		return costHydraulicSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostInstrumentSystemsType createCostInstrumentSystemsType() {
		CostInstrumentSystemsTypeImpl costInstrumentSystemsType = new CostInstrumentSystemsTypeImpl();
		return costInstrumentSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostLandingGearType createCostLandingGearType() {
		CostLandingGearTypeImpl costLandingGearType = new CostLandingGearTypeImpl();
		return costLandingGearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostLightingSystemsType createCostLightingSystemsType() {
		CostLightingSystemsTypeImpl costLightingSystemsType = new CostLightingSystemsTypeImpl();
		return costLightingSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostNacellesType createCostNacellesType() {
		CostNacellesTypeImpl costNacellesType = new CostNacellesTypeImpl();
		return costNacellesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostNavigationSystemsType createCostNavigationSystemsType() {
		CostNavigationSystemsTypeImpl costNavigationSystemsType = new CostNavigationSystemsTypeImpl();
		return costNavigationSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostPowerUnitsType createCostPowerUnitsType() {
		CostPowerUnitsTypeImpl costPowerUnitsType = new CostPowerUnitsTypeImpl();
		return costPowerUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostSystemsType createCostSystemsType() {
		CostSystemsTypeImpl costSystemsType = new CostSystemsTypeImpl();
		return costSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostWaterInstallationSystemsType createCostWaterInstallationSystemsType() {
		CostWaterInstallationSystemsTypeImpl costWaterInstallationSystemsType = new CostWaterInstallationSystemsTypeImpl();
		return costWaterInstallationSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostWingsType createCostWingsType() {
		CostWingsTypeImpl costWingsType = new CostWingsTypeImpl();
		return costWingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpacsType createCpacsType() {
		CpacsTypeImpl cpacsType = new CpacsTypeImpl();
		return cpacsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrashLoadCasesType createCrashLoadCasesType() {
		CrashLoadCasesTypeImpl crashLoadCasesType = new CrashLoadCasesTypeImpl();
		return crashLoadCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrashLoadcaseType createCrashLoadcaseType() {
		CrashLoadcaseTypeImpl crashLoadcaseType = new CrashLoadcaseTypeImpl();
		return crashLoadcaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrewCostType createCrewCostType() {
		CrewCostTypeImpl crewCostType = new CrewCostTypeImpl();
		return crewCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossBeamAssemblyPositionType createCrossBeamAssemblyPositionType() {
		CrossBeamAssemblyPositionTypeImpl crossBeamAssemblyPositionType = new CrossBeamAssemblyPositionTypeImpl();
		return crossBeamAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossBeamStrutAssemblyPositionType createCrossBeamStrutAssemblyPositionType() {
		CrossBeamStrutAssemblyPositionTypeImpl crossBeamStrutAssemblyPositionType = new CrossBeamStrutAssemblyPositionTypeImpl();
		return crossBeamStrutAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CruiseRollersType createCruiseRollersType() {
		CruiseRollersTypeImpl cruiseRollersType = new CruiseRollersTypeImpl();
		return cruiseRollersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CruiseRollerType createCruiseRollerType() {
		CruiseRollerTypeImpl cruiseRollerType = new CruiseRollerTypeImpl();
		return cruiseRollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cst2DType createCst2DType() {
		Cst2DTypeImpl cst2DType = new Cst2DTypeImpl();
		return cst2DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveParamPointMapType createCurveParamPointMapType() {
		CurveParamPointMapTypeImpl curveParamPointMapType = new CurveParamPointMapTypeImpl();
		return curveParamPointMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePointListXYZType createCurvePointListXYZType() {
		CurvePointListXYZTypeImpl curvePointListXYZType = new CurvePointListXYZTypeImpl();
		return curvePointListXYZType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePointType createCurvePointType() {
		CurvePointTypeImpl curvePointType = new CurvePointTypeImpl();
		return curvePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveProfilesType createCurveProfilesType() {
		CurveProfilesTypeImpl curveProfilesType = new CurveProfilesTypeImpl();
		return curveProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadIntegrationPointsType createCutLoadIntegrationPointsType() {
		CutLoadIntegrationPointsTypeImpl cutLoadIntegrationPointsType = new CutLoadIntegrationPointsTypeImpl();
		return cutLoadIntegrationPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadsEnvelopeType createCutLoadsEnvelopeType() {
		CutLoadsEnvelopeTypeImpl cutLoadsEnvelopeType = new CutLoadsEnvelopeTypeImpl();
		return cutLoadsEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadsType createCutLoadsType() {
		CutLoadsTypeImpl cutLoadsType = new CutLoadsTypeImpl();
		return cutLoadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutLoadType createCutLoadType() {
		CutLoadTypeImpl cutLoadType = new CutLoadTypeImpl();
		return cutLoadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutControlPointsType createCutOutControlPointsType() {
		CutOutControlPointsTypeImpl cutOutControlPointsType = new CutOutControlPointsTypeImpl();
		return cutOutControlPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutControlPointType createCutOutControlPointType() {
		CutOutControlPointTypeImpl cutOutControlPointType = new CutOutControlPointTypeImpl();
		return cutOutControlPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutProfilesType createCutOutProfilesType() {
		CutOutProfilesTypeImpl cutOutProfilesType = new CutOutProfilesTypeImpl();
		return cutOutProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutProfileType createCutOutProfileType() {
		CutOutProfileTypeImpl cutOutProfileType = new CutOutProfileTypeImpl();
		return cutOutProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutOutType createCutOutType() {
		CutOutTypeImpl cutOutType = new CutOutTypeImpl();
		return cutOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CutoutTypeType createCutoutTypeType() {
		CutoutTypeTypeImpl cutoutTypeType = new CutoutTypeTypeImpl();
		return cutoutTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesRatesArrayType createDampingDerivativesRatesArrayType() {
		DampingDerivativesRatesArrayTypeImpl dampingDerivativesRatesArrayType = new DampingDerivativesRatesArrayTypeImpl();
		return dampingDerivativesRatesArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesRatesType createDampingDerivativesRatesType() {
		DampingDerivativesRatesTypeImpl dampingDerivativesRatesType = new DampingDerivativesRatesTypeImpl();
		return dampingDerivativesRatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesType createDampingDerivativesType() {
		DampingDerivativesTypeImpl dampingDerivativesType = new DampingDerivativesTypeImpl();
		return dampingDerivativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolBehaviourType createDamTolBehaviourType() {
		DamTolBehaviourTypeImpl damTolBehaviourType = new DamTolBehaviourTypeImpl();
		return damTolBehaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolFormanType createDamTolFormanType() {
		DamTolFormanTypeImpl damTolFormanType = new DamTolFormanTypeImpl();
		return damTolFormanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DamTolWalkerType createDamTolWalkerType() {
		DamTolWalkerTypeImpl damTolWalkerType = new DamTolWalkerTypeImpl();
		return damTolWalkerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateBaseType createDateBaseType() {
		DateBaseTypeImpl dateBaseType = new DateBaseTypeImpl();
		return dateBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeBaseType createDateTimeBaseType() {
		DateTimeBaseTypeImpl dateTimeBaseType = new DateTimeBaseTypeImpl();
		return dateTimeBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecksType createDecksType() {
		DecksTypeImpl decksType = new DecksTypeImpl();
		return decksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckType createDeckType() {
		DeckTypeImpl deckType = new DeckTypeImpl();
		return deckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaTemperatureType createDeltaTemperatureType() {
		DeltaTemperatureTypeImpl deltaTemperatureType = new DeltaTemperatureTypeImpl();
		return deltaTemperatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignMassesType createDesignMassesType() {
		DesignMassesTypeImpl designMassesType = new DesignMassesTypeImpl();
		return designMassesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignParametersType createDesignParametersType() {
		DesignParametersTypeImpl designParametersType = new DesignParametersTypeImpl();
		return designParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignParameterType createDesignParameterType() {
		DesignParameterTypeImpl designParameterType = new DesignParameterTypeImpl();
		return designParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignSpaceType createDesignSpaceType() {
		DesignSpaceTypeImpl designSpaceType = new DesignSpaceTypeImpl();
		return designSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignSpeedType createDesignSpeedType() {
		DesignSpeedTypeImpl designSpeedType = new DesignSpeedTypeImpl();
		return designSpeedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignStudiesType createDesignStudiesType() {
		DesignStudiesTypeImpl designStudiesType = new DesignStudiesTypeImpl();
		return designStudiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignVolumeType createDesignVolumeType() {
		DesignVolumeTypeImpl designVolumeType = new DesignVolumeTypeImpl();
		return designVolumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectOperatingCostType createDirectOperatingCostType() {
		DirectOperatingCostTypeImpl directOperatingCostType = new DirectOperatingCostTypeImpl();
		return directOperatingCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergenceCasesType createDivergenceCasesType() {
		DivergenceCasesTypeImpl divergenceCasesType = new DivergenceCasesTypeImpl();
		return divergenceCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivergenceCaseType createDivergenceCaseType() {
		DivergenceCaseTypeImpl divergenceCaseType = new DivergenceCaseTypeImpl();
		return divergenceCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorAssemblyPositionType createDoorAssemblyPositionType() {
		DoorAssemblyPositionTypeImpl doorAssemblyPositionType = new DoorAssemblyPositionTypeImpl();
		return doorAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorCutOutType createDoorCutOutType() {
		DoorCutOutTypeImpl doorCutOutType = new DoorCutOutTypeImpl();
		return doorCutOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorsType createDoorsType() {
		DoorsTypeImpl doorsType = new DoorsTypeImpl();
		return doorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorSurroundStructurePositionType createDoorSurroundStructurePositionType() {
		DoorSurroundStructurePositionTypeImpl doorSurroundStructurePositionType = new DoorSurroundStructurePositionTypeImpl();
		return doorSurroundStructurePositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorSurroundStructuresAssemblyType createDoorSurroundStructuresAssemblyType() {
		DoorSurroundStructuresAssemblyTypeImpl doorSurroundStructuresAssemblyType = new DoorSurroundStructuresAssemblyTypeImpl();
		return doorSurroundStructuresAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorTypeType createDoorTypeType() {
		DoorTypeTypeImpl doorTypeType = new DoorTypeTypeImpl();
		return doorTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType createDoubleBaseType() {
		DoubleBaseTypeImpl doubleBaseType = new DoubleBaseTypeImpl();
		return doubleBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType createDoubleConstraintBaseType() {
		DoubleConstraintBaseTypeImpl doubleConstraintBaseType = new DoubleConstraintBaseTypeImpl();
		return doubleConstraintBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveSystemsType createDriveSystemsType() {
		DriveSystemsTypeImpl driveSystemsType = new DriveSystemsTypeImpl();
		return driveSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveSystemType createDriveSystemType() {
		DriveSystemTypeImpl driveSystemType = new DriveSystemTypeImpl();
		return driveSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAircraftModelAnalysisType createDynamicAircraftModelAnalysisType() {
		DynamicAircraftModelAnalysisTypeImpl dynamicAircraftModelAnalysisType = new DynamicAircraftModelAnalysisTypeImpl();
		return dynamicAircraftModelAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAircraftModelPointsType createDynamicAircraftModelPointsType() {
		DynamicAircraftModelPointsTypeImpl dynamicAircraftModelPointsType = new DynamicAircraftModelPointsTypeImpl();
		return dynamicAircraftModelPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicAircraftModelType createDynamicAircraftModelType() {
		DynamicAircraftModelTypeImpl dynamicAircraftModelType = new DynamicAircraftModelTypeImpl();
		return dynamicAircraftModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmissivityMapType createEmissivityMapType() {
		EmissivityMapTypeImpl emissivityMapType = new EmissivityMapTypeImpl();
		return emissivityMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineAnalysisType createEngineAnalysisType() {
		EngineAnalysisTypeImpl engineAnalysisType = new EngineAnalysisTypeImpl();
		return engineAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineConceptType createEngineConceptType() {
		EngineConceptTypeImpl engineConceptType = new EngineConceptTypeImpl();
		return engineConceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineFanType createEngineFanType() {
		EngineFanTypeImpl engineFanType = new EngineFanTypeImpl();
		return engineFanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineGeometryType createEngineGeometryType() {
		EngineGeometryTypeImpl engineGeometryType = new EngineGeometryTypeImpl();
		return engineGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineGlobalType createEngineGlobalType() {
		EngineGlobalTypeImpl engineGlobalType = new EngineGlobalTypeImpl();
		return engineGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineMountsType createEngineMountsType() {
		EngineMountsTypeImpl engineMountsType = new EngineMountsTypeImpl();
		return engineMountsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineMountType createEngineMountType() {
		EngineMountTypeImpl engineMountType = new EngineMountTypeImpl();
		return engineMountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineNacelleType createEngineNacelleType() {
		EngineNacelleTypeImpl engineNacelleType = new EngineNacelleTypeImpl();
		return engineNacelleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePerformanceMapsType createEnginePerformanceMapsType() {
		EnginePerformanceMapsTypeImpl enginePerformanceMapsType = new EnginePerformanceMapsTypeImpl();
		return enginePerformanceMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePerformanceMapType createEnginePerformanceMapType() {
		EnginePerformanceMapTypeImpl enginePerformanceMapType = new EnginePerformanceMapTypeImpl();
		return enginePerformanceMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePositionsType createEnginePositionsType() {
		EnginePositionsTypeImpl enginePositionsType = new EnginePositionsTypeImpl();
		return enginePositionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePositionType createEnginePositionType() {
		EnginePositionTypeImpl enginePositionType = new EnginePositionTypeImpl();
		return enginePositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePylonsType createEnginePylonsType() {
		EnginePylonsTypeImpl enginePylonsType = new EnginePylonsTypeImpl();
		return enginePylonsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePylonType createEnginePylonType() {
		EnginePylonTypeImpl enginePylonType = new EnginePylonTypeImpl();
		return enginePylonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineSettingType createEngineSettingType() {
		EngineSettingTypeImpl engineSettingType = new EngineSettingTypeImpl();
		return engineSettingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineSpinnerType createEngineSpinnerType() {
		EngineSpinnerTypeImpl engineSpinnerType = new EngineSpinnerTypeImpl();
		return engineSpinnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginesType createEnginesType() {
		EnginesTypeImpl enginesType = new EnginesTypeImpl();
		return enginesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineType createEngineType() {
		EngineTypeImpl engineType = new EngineTypeImpl();
		return engineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType createEtaIsoLineType() {
		EtaIsoLineTypeImpl etaIsoLineType = new EtaIsoLineTypeImpl();
		return etaIsoLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiPointType createEtaXsiPointType() {
		EtaXsiPointTypeImpl etaXsiPointType = new EtaXsiPointTypeImpl();
		return etaXsiPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType createEtaXsiRelHeightPointType() {
		EtaXsiRelHeightPointTypeImpl etaXsiRelHeightPointType = new EtaXsiRelHeightPointTypeImpl();
		return etaXsiRelHeightPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FatigueBehaviourType createFatigueBehaviourType() {
		FatigueBehaviourTypeImpl fatigueBehaviourType = new FatigueBehaviourTypeImpl();
		return fatigueBehaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FatigueStressBasedBrownMillerType createFatigueStressBasedBrownMillerType() {
		FatigueStressBasedBrownMillerTypeImpl fatigueStressBasedBrownMillerType = new FatigueStressBasedBrownMillerTypeImpl();
		return fatigueStressBasedBrownMillerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FleetType createFleetType() {
		FleetTypeImpl fleetType = new FleetTypeImpl();
		return fleetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightAnalysisType createFlightAnalysisType() {
		FlightAnalysisTypeImpl flightAnalysisType = new FlightAnalysisTypeImpl();
		return flightAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsAnalysisType createFlightDynamicsAnalysisType() {
		FlightDynamicsAnalysisTypeImpl flightDynamicsAnalysisType = new FlightDynamicsAnalysisTypeImpl();
		return flightDynamicsAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsFlightCasesType createFlightDynamicsFlightCasesType() {
		FlightDynamicsFlightCasesTypeImpl flightDynamicsFlightCasesType = new FlightDynamicsFlightCasesTypeImpl();
		return flightDynamicsFlightCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsFlightCaseType createFlightDynamicsFlightCaseType() {
		FlightDynamicsFlightCaseTypeImpl flightDynamicsFlightCaseType = new FlightDynamicsFlightCaseTypeImpl();
		return flightDynamicsFlightCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsLinearModelType createFlightDynamicsLinearModelType() {
		FlightDynamicsLinearModelTypeImpl flightDynamicsLinearModelType = new FlightDynamicsLinearModelTypeImpl();
		return flightDynamicsLinearModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsModelType createFlightDynamicsModelType() {
		FlightDynamicsModelTypeImpl flightDynamicsModelType = new FlightDynamicsModelTypeImpl();
		return flightDynamicsModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightDynamicsTrimResultType createFlightDynamicsTrimResultType() {
		FlightDynamicsTrimResultTypeImpl flightDynamicsTrimResultType = new FlightDynamicsTrimResultTypeImpl();
		return flightDynamicsTrimResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightLoadCasesType createFlightLoadCasesType() {
		FlightLoadCasesTypeImpl flightLoadCasesType = new FlightLoadCasesTypeImpl();
		return flightLoadCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightLoadCaseType createFlightLoadCaseType() {
		FlightLoadCaseTypeImpl flightLoadCaseType = new FlightLoadCaseTypeImpl();
		return flightLoadCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPathType createFlightPathType() {
		FlightPathTypeImpl flightPathType = new FlightPathTypeImpl();
		return flightPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceCasesType createFlightPerformanceCasesType() {
		FlightPerformanceCasesTypeImpl flightPerformanceCasesType = new FlightPerformanceCasesTypeImpl();
		return flightPerformanceCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceCaseType createFlightPerformanceCaseType() {
		FlightPerformanceCaseTypeImpl flightPerformanceCaseType = new FlightPerformanceCaseTypeImpl();
		return flightPerformanceCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceLandingType createFlightPerformanceLandingType() {
		FlightPerformanceLandingTypeImpl flightPerformanceLandingType = new FlightPerformanceLandingTypeImpl();
		return flightPerformanceLandingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceTakeoffType createFlightPerformanceTakeoffType() {
		FlightPerformanceTakeoffTypeImpl flightPerformanceTakeoffType = new FlightPerformanceTakeoffTypeImpl();
		return flightPerformanceTakeoffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceType createFlightPerformanceType() {
		FlightPerformanceTypeImpl flightPerformanceType = new FlightPerformanceTypeImpl();
		return flightPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPointType createFlightPointType() {
		FlightPointTypeImpl flightPointType = new FlightPointTypeImpl();
		return flightPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightsType createFlightsType() {
		FlightsTypeImpl flightsType = new FlightsTypeImpl();
		return flightsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightSystemsType createFlightSystemsType() {
		FlightSystemsTypeImpl flightSystemsType = new FlightSystemsTypeImpl();
		return flightSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightType createFlightType() {
		FlightTypeImpl flightType = new FlightTypeImpl();
		return flightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorPanelsType createFloorPanelsType() {
		FloorPanelsTypeImpl floorPanelsType = new FloorPanelsTypeImpl();
		return floorPanelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloorPanelType createFloorPanelType() {
		FloorPanelTypeImpl floorPanelType = new FloorPanelTypeImpl();
		return floorPanelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowConditionType createFlowConditionType() {
		FlowConditionTypeImpl flowConditionType = new FlowConditionTypeImpl();
		return flowConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlyingQualitiesType createFlyingQualitiesType() {
		FlyingQualitiesTypeImpl flyingQualitiesType = new FlyingQualitiesTypeImpl();
		return flyingQualitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqCaseType createFqCaseType() {
		FqCaseTypeImpl fqCaseType = new FqCaseTypeImpl();
		return fqCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqCharParametersType createFqCharParametersType() {
		FqCharParametersTypeImpl fqCharParametersType = new FqCharParametersTypeImpl();
		return fqCharParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqEiglatType createFqEiglatType() {
		FqEiglatTypeImpl fqEiglatType = new FqEiglatTypeImpl();
		return fqEiglatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqLateralType createFqLateralType() {
		FqLateralTypeImpl fqLateralType = new FqLateralTypeImpl();
		return fqLateralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqLongitudinalType createFqLongitudinalType() {
		FqLongitudinalTypeImpl fqLongitudinalType = new FqLongitudinalTypeImpl();
		return fqLongitudinalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqPhugoidType createFqPhugoidType() {
		FqPhugoidTypeImpl fqPhugoidType = new FqPhugoidTypeImpl();
		return fqPhugoidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqRatingsType createFqRatingsType() {
		FqRatingsTypeImpl fqRatingsType = new FqRatingsTypeImpl();
		return fqRatingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqRollPerfType createFqRollPerfType() {
		FqRollPerfTypeImpl fqRollPerfType = new FqRollPerfTypeImpl();
		return fqRollPerfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqRoloscType createFqRoloscType() {
		FqRoloscTypeImpl fqRoloscType = new FqRoloscTypeImpl();
		return fqRoloscType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqShortPeriodType createFqShortPeriodType() {
		FqShortPeriodTypeImpl fqShortPeriodType = new FqShortPeriodTypeImpl();
		return fqShortPeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FqTreffType createFqTreffType() {
		FqTreffTypeImpl fqTreffType = new FqTreffTypeImpl();
		return fqTreffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramesAssemblyType createFramesAssemblyType() {
		FramesAssemblyTypeImpl framesAssemblyType = new FramesAssemblyTypeImpl();
		return framesAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType createFrameType() {
		FrameTypeImpl frameType = new FrameTypeImpl();
		return frameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreePathType createFreePathType() {
		FreePathTypeImpl freePathType = new FreePathTypeImpl();
		return freePathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelInTankType createFuelInTankType() {
		FuelInTankTypeImpl fuelInTankType = new FuelInTankTypeImpl();
		return fuelInTankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelPlanningTypeType createFuelPlanningTypeType() {
		FuelPlanningTypeTypeImpl fuelPlanningTypeType = new FuelPlanningTypeTypeImpl();
		return fuelPlanningTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelsType createFuelsType() {
		FuelsTypeImpl fuelsType = new FuelsTypeImpl();
		return fuelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelTankVolumeType createFuelTankVolumeType() {
		FuelTankVolumeTypeImpl fuelTankVolumeType = new FuelTankVolumeTypeImpl();
		return fuelTankVolumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelType createFuelType() {
		FuelTypeImpl fuelType = new FuelTypeImpl();
		return fuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageAeroPerformanceType createFuselageAeroPerformanceType() {
		FuselageAeroPerformanceTypeImpl fuselageAeroPerformanceType = new FuselageAeroPerformanceTypeImpl();
		return fuselageAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageCoefficientsType createFuselageCoefficientsType() {
		FuselageCoefficientsTypeImpl fuselageCoefficientsType = new FuselageCoefficientsTypeImpl();
		return fuselageCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageCutOutsType createFuselageCutOutsType() {
		FuselageCutOutsTypeImpl fuselageCutOutsType = new FuselageCutOutsTypeImpl();
		return fuselageCutOutsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageCutOutType createFuselageCutOutType() {
		FuselageCutOutTypeImpl fuselageCutOutType = new FuselageCutOutTypeImpl();
		return fuselageCutOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageElementsType createFuselageElementsType() {
		FuselageElementsTypeImpl fuselageElementsType = new FuselageElementsTypeImpl();
		return fuselageElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageElementType createFuselageElementType() {
		FuselageElementTypeImpl fuselageElementType = new FuselageElementTypeImpl();
		return fuselageElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageFuelTanksType createFuselageFuelTanksType() {
		FuselageFuelTanksTypeImpl fuselageFuelTanksType = new FuselageFuelTanksTypeImpl();
		return fuselageFuelTanksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageFuelTankType createFuselageFuelTankType() {
		FuselageFuelTankTypeImpl fuselageFuelTankType = new FuselageFuelTankTypeImpl();
		return fuselageFuelTankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageProfilesType createFuselageProfilesType() {
		FuselageProfilesTypeImpl fuselageProfilesType = new FuselageProfilesTypeImpl();
		return fuselageProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesAeroPerformanceType createFuselagesAeroPerformanceType() {
		FuselagesAeroPerformanceTypeImpl fuselagesAeroPerformanceType = new FuselagesAeroPerformanceTypeImpl();
		return fuselagesAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesCoefficientsType createFuselagesCoefficientsType() {
		FuselagesCoefficientsTypeImpl fuselagesCoefficientsType = new FuselagesCoefficientsTypeImpl();
		return fuselagesCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSectionsType createFuselageSectionsType() {
		FuselageSectionsTypeImpl fuselageSectionsType = new FuselageSectionsTypeImpl();
		return fuselageSectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSectionType createFuselageSectionType() {
		FuselageSectionTypeImpl fuselageSectionType = new FuselageSectionTypeImpl();
		return fuselageSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentCoefficientsType createFuselageSegmentCoefficientsType() {
		FuselageSegmentCoefficientsTypeImpl fuselageSegmentCoefficientsType = new FuselageSegmentCoefficientsTypeImpl();
		return fuselageSegmentCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentsCoefficientsType createFuselageSegmentsCoefficientsType() {
		FuselageSegmentsCoefficientsTypeImpl fuselageSegmentsCoefficientsType = new FuselageSegmentsCoefficientsTypeImpl();
		return fuselageSegmentsCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentStripCoefficientsType createFuselageSegmentStripCoefficientsType() {
		FuselageSegmentStripCoefficientsTypeImpl fuselageSegmentStripCoefficientsType = new FuselageSegmentStripCoefficientsTypeImpl();
		return fuselageSegmentStripCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentsType createFuselageSegmentsType() {
		FuselageSegmentsTypeImpl fuselageSegmentsType = new FuselageSegmentsTypeImpl();
		return fuselageSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageSegmentType createFuselageSegmentType() {
		FuselageSegmentTypeImpl fuselageSegmentType = new FuselageSegmentTypeImpl();
		return fuselageSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageStructureType createFuselageStructureType() {
		FuselageStructureTypeImpl fuselageStructureType = new FuselageStructureTypeImpl();
		return fuselageStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesType createFuselagesType() {
		FuselagesTypeImpl fuselagesType = new FuselagesTypeImpl();
		return fuselagesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselageType createFuselageType() {
		FuselageTypeImpl fuselageType = new FuselageTypeImpl();
		return fuselageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GearComponentsType createGearComponentsType() {
		GearComponentsTypeImpl gearComponentsType = new GearComponentsTypeImpl();
		return gearComponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GearDeflectionVectorsType createGearDeflectionVectorsType() {
		GearDeflectionVectorsTypeImpl gearDeflectionVectorsType = new GearDeflectionVectorsTypeImpl();
		return gearDeflectionVectorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GearDeflectionVectorType createGearDeflectionVectorType() {
		GearDeflectionVectorTypeImpl gearDeflectionVectorType = new GearDeflectionVectorTypeImpl();
		return gearDeflectionVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStructuralMemberPositionType createGeneralStructuralMemberPositionType() {
		GeneralStructuralMemberPositionTypeImpl generalStructuralMemberPositionType = new GeneralStructuralMemberPositionTypeImpl();
		return generalStructuralMemberPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStructuralMembersAssemblyType createGeneralStructuralMembersAssemblyType() {
		GeneralStructuralMembersAssemblyTypeImpl generalStructuralMembersAssemblyType = new GeneralStructuralMembersAssemblyTypeImpl();
		return generalStructuralMembersAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStructuralMemberType createGeneralStructuralMemberType() {
		GeneralStructuralMemberTypeImpl generalStructuralMemberType = new GeneralStructuralMemberTypeImpl();
		return generalStructuralMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericComponentCoefficientsType createGenericComponentCoefficientsType() {
		GenericComponentCoefficientsTypeImpl genericComponentCoefficientsType = new GenericComponentCoefficientsTypeImpl();
		return genericComponentCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericComponentsCoefficientsType createGenericComponentsCoefficientsType() {
		GenericComponentsCoefficientsTypeImpl genericComponentsCoefficientsType = new GenericComponentsCoefficientsTypeImpl();
		return genericComponentsCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType createGenericCostType() {
		GenericCostTypeImpl genericCostType = new GenericCostTypeImpl();
		return genericCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericGeometricComponentType createGenericGeometricComponentType() {
		GenericGeometricComponentTypeImpl genericGeometricComponentType = new GenericGeometricComponentTypeImpl();
		return genericGeometricComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericGeometryComponentsType createGenericGeometryComponentsType() {
		GenericGeometryComponentsTypeImpl genericGeometryComponentsType = new GenericGeometryComponentsTypeImpl();
		return genericGeometryComponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType createGenericMassType() {
		GenericMassTypeImpl genericMassType = new GenericMassTypeImpl();
		return genericMassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericSystemsType createGenericSystemsType() {
		GenericSystemsTypeImpl genericSystemsType = new GenericSystemsTypeImpl();
		return genericSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericSystemType createGenericSystemType() {
		GenericSystemTypeImpl genericSystemType = new GenericSystemTypeImpl();
		return genericSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeogenWingOutputOptionsType createGeogenWingOutputOptionsType() {
		GeogenWingOutputOptionsTypeImpl geogenWingOutputOptionsType = new GeogenWingOutputOptionsTypeImpl();
		return geogenWingOutputOptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicPointConstraintType createGeographicPointConstraintType() {
		GeographicPointConstraintTypeImpl geographicPointConstraintType = new GeographicPointConstraintTypeImpl();
		return geographicPointConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicPointType createGeographicPointType() {
		GeographicPointTypeImpl geographicPointType = new GeographicPointTypeImpl();
		return geographicPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalAeroPerformanceType createGlobalAeroPerformanceType() {
		GlobalAeroPerformanceTypeImpl globalAeroPerformanceType = new GlobalAeroPerformanceTypeImpl();
		return globalAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalBeamPropertiesType createGlobalBeamPropertiesType() {
		GlobalBeamPropertiesTypeImpl globalBeamPropertiesType = new GlobalBeamPropertiesTypeImpl();
		return globalBeamPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundLoadCasesType createGroundLoadCasesType() {
		GroundLoadCasesTypeImpl groundLoadCasesType = new GroundLoadCasesTypeImpl();
		return groundLoadCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundLoadCaseType createGroundLoadCaseType() {
		GroundLoadCaseTypeImpl groundLoadCaseType = new GroundLoadCaseTypeImpl();
		return groundLoadCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurveProfileGeometryType createGuideCurveProfileGeometryType() {
		GuideCurveProfileGeometryTypeImpl guideCurveProfileGeometryType = new GuideCurveProfileGeometryTypeImpl();
		return guideCurveProfileGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurveProfilesType createGuideCurveProfilesType() {
		GuideCurveProfilesTypeImpl guideCurveProfilesType = new GuideCurveProfilesTypeImpl();
		return guideCurveProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurvesType createGuideCurvesType() {
		GuideCurvesTypeImpl guideCurvesType = new GuideCurvesTypeImpl();
		return guideCurvesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurveType createGuideCurveType() {
		GuideCurveTypeImpl guideCurveType = new GuideCurveTypeImpl();
		return guideCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandbookAeroLastTransitionRegionType createHandbookAeroLastTransitionRegionType() {
		HandbookAeroLastTransitionRegionTypeImpl handbookAeroLastTransitionRegionType = new HandbookAeroLastTransitionRegionTypeImpl();
		return handbookAeroLastTransitionRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandbookAeroPolynomialCoefficientsType createHandbookAeroPolynomialCoefficientsType() {
		HandbookAeroPolynomialCoefficientsTypeImpl handbookAeroPolynomialCoefficientsType = new HandbookAeroPolynomialCoefficientsTypeImpl();
		return handbookAeroPolynomialCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandbookAeroTransitionRegionType createHandbookAeroTransitionRegionType() {
		HandbookAeroTransitionRegionTypeImpl handbookAeroTransitionRegionType = new HandbookAeroTransitionRegionTypeImpl();
		return handbookAeroTransitionRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HingeMomentsMapType createHingeMomentsMapType() {
		HingeMomentsMapTypeImpl hingeMomentsMapType = new HingeMomentsMapTypeImpl();
		return hingeMomentsMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpFwdInterfaceDefType createHtpFwdInterfaceDefType() {
		HtpFwdInterfaceDefTypeImpl htpFwdInterfaceDefType = new HtpFwdInterfaceDefTypeImpl();
		return htpFwdInterfaceDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpInterfaceDefType createHtpInterfaceDefType() {
		HtpInterfaceDefTypeImpl htpInterfaceDefType = new HtpInterfaceDefTypeImpl();
		return htpInterfaceDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpStructElemDefType createHtpStructElemDefType() {
		HtpStructElemDefTypeImpl htpStructElemDefType = new HtpStructElemDefTypeImpl();
		return htpStructElemDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactSurfaceDefinitionType createImpactSurfaceDefinitionType() {
		ImpactSurfaceDefinitionTypeImpl impactSurfaceDefinitionType = new ImpactSurfaceDefinitionTypeImpl();
		return impactSurfaceDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndirectOperatingCostType createIndirectOperatingCostType() {
		IndirectOperatingCostTypeImpl indirectOperatingCostType = new IndirectOperatingCostTypeImpl();
		return indirectOperatingCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType createIntegerBaseType() {
		IntegerBaseTypeImpl integerBaseType = new IntegerBaseTypeImpl();
		return integerBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterConnectionStrutAttachmentType createInterConnectionStrutAttachmentType() {
		InterConnectionStrutAttachmentTypeImpl interConnectionStrutAttachmentType = new InterConnectionStrutAttachmentTypeImpl();
		return interConnectionStrutAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterconnectionStrutsType createInterconnectionStrutsType() {
		InterconnectionStrutsTypeImpl interconnectionStrutsType = new InterconnectionStrutsTypeImpl();
		return interconnectionStrutsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterconnectionStrutType createInterconnectionStrutType() {
		InterconnectionStrutTypeImpl interconnectionStrutType = new InterconnectionStrutTypeImpl();
		return interconnectionStrutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercostalPositionType createIntercostalPositionType() {
		IntercostalPositionTypeImpl intercostalPositionType = new IntercostalPositionTypeImpl();
		return intercostalPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercostalsAssemblyType createIntercostalsAssemblyType() {
		IntercostalsAssemblyTypeImpl intercostalsAssemblyType = new IntercostalsAssemblyTypeImpl();
		return intercostalsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDefinitionsType createInterfaceDefinitionsType() {
		InterfaceDefinitionsTypeImpl interfaceDefinitionsType = new InterfaceDefinitionsTypeImpl();
		return interfaceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType createInterpolationType() {
		InterpolationTypeImpl interpolationType = new InterpolationTypeImpl();
		return interpolationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType1 createInterpolationType1() {
		InterpolationType1Impl interpolationType1 = new InterpolationType1Impl();
		return interpolationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType2 createInterpolationType2() {
		InterpolationType2Impl interpolationType2 = new InterpolationType2Impl();
		return interpolationType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsotropicPropertiesType createIsotropicPropertiesType() {
		IsotropicPropertiesTypeImpl isotropicPropertiesType = new IsotropicPropertiesTypeImpl();
		return isotropicPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceDefinitionsType createLandingGearInterfaceDefinitionsType() {
		LandingGearInterfaceDefinitionsTypeImpl landingGearInterfaceDefinitionsType = new LandingGearInterfaceDefinitionsTypeImpl();
		return landingGearInterfaceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceKeelbeamType createLandingGearInterfaceKeelbeamType() {
		LandingGearInterfaceKeelbeamTypeImpl landingGearInterfaceKeelbeamType = new LandingGearInterfaceKeelbeamTypeImpl();
		return landingGearInterfaceKeelbeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceLateralPanelsType createLandingGearInterfaceLateralPanelsType() {
		LandingGearInterfaceLateralPanelsTypeImpl landingGearInterfaceLateralPanelsType = new LandingGearInterfaceLateralPanelsTypeImpl();
		return landingGearInterfaceLateralPanelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceLongFloorBeamsConnectionType createLandingGearInterfaceLongFloorBeamsConnectionType() {
		LandingGearInterfaceLongFloorBeamsConnectionTypeImpl landingGearInterfaceLongFloorBeamsConnectionType = new LandingGearInterfaceLongFloorBeamsConnectionTypeImpl();
		return landingGearInterfaceLongFloorBeamsConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceMainFramesType createLandingGearInterfaceMainFramesType() {
		LandingGearInterfaceMainFramesTypeImpl landingGearInterfaceMainFramesType = new LandingGearInterfaceMainFramesTypeImpl();
		return landingGearInterfaceMainFramesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfacePressureFloorType createLandingGearInterfacePressureFloorType() {
		LandingGearInterfacePressureFloorTypeImpl landingGearInterfacePressureFloorType = new LandingGearInterfacePressureFloorTypeImpl();
		return landingGearInterfacePressureFloorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceSideboxType createLandingGearInterfaceSideboxType() {
		LandingGearInterfaceSideboxTypeImpl landingGearInterfaceSideboxType = new LandingGearInterfaceSideboxTypeImpl();
		return landingGearInterfaceSideboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearPositionSafetyMarginsType createLandingGearPositionSafetyMarginsType() {
		LandingGearPositionSafetyMarginsTypeImpl landingGearPositionSafetyMarginsType = new LandingGearPositionSafetyMarginsTypeImpl();
		return landingGearPositionSafetyMarginsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearSettingType createLandingGearSettingType() {
		LandingGearSettingTypeImpl landingGearSettingType = new LandingGearSettingTypeImpl();
		return landingGearSettingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearType createLandingGearType() {
		LandingGearTypeImpl landingGearType = new LandingGearTypeImpl();
		return landingGearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LateralCapType createLateralCapType() {
		LateralCapTypeImpl lateralCapType = new LateralCapTypeImpl();
		return lateralCapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeDevicesType createLeadingEdgeDevicesType() {
		LeadingEdgeDevicesTypeImpl leadingEdgeDevicesType = new LeadingEdgeDevicesTypeImpl();
		return leadingEdgeDevicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeDeviceType createLeadingEdgeDeviceType() {
		LeadingEdgeDeviceTypeImpl leadingEdgeDeviceType = new LeadingEdgeDeviceTypeImpl();
		return leadingEdgeDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeHollowType createLeadingEdgeHollowType() {
		LeadingEdgeHollowTypeImpl leadingEdgeHollowType = new LeadingEdgeHollowTypeImpl();
		return leadingEdgeHollowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeShapeType createLeadingEdgeShapeType() {
		LeadingEdgeShapeTypeImpl leadingEdgeShapeType = new LeadingEdgeShapeTypeImpl();
		return leadingEdgeShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinerType createLinerType() {
		LinerTypeImpl linerType = new LinerTypeImpl();
		return linerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkToFileType createLinkToFileType() {
		LinkToFileTypeImpl linkToFileType = new LinkToFileTypeImpl();
		return linkToFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadAnalysisType createLoadAnalysisType() {
		LoadAnalysisTypeImpl loadAnalysisType = new LoadAnalysisTypeImpl();
		return loadAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBreakdownType createLoadBreakdownType() {
		LoadBreakdownTypeImpl loadBreakdownType = new LoadBreakdownTypeImpl();
		return loadBreakdownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseEnginesType createLoadCaseEnginesType() {
		LoadCaseEnginesTypeImpl loadCaseEnginesType = new LoadCaseEnginesTypeImpl();
		return loadCaseEnginesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseLandingGearsType createLoadCaseLandingGearsType() {
		LoadCaseLandingGearsTypeImpl loadCaseLandingGearsType = new LoadCaseLandingGearsTypeImpl();
		return loadCaseLandingGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseMassType createLoadCaseMassType() {
		LoadCaseMassTypeImpl loadCaseMassType = new LoadCaseMassTypeImpl();
		return loadCaseMassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseRotationType createLoadCaseRotationType() {
		LoadCaseRotationTypeImpl loadCaseRotationType = new LoadCaseRotationTypeImpl();
		return loadCaseRotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseRotationVelocityType createLoadCaseRotationVelocityType() {
		LoadCaseRotationVelocityTypeImpl loadCaseRotationVelocityType = new LoadCaseRotationVelocityTypeImpl();
		return loadCaseRotationVelocityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseSettingsType createLoadCaseSettingsType() {
		LoadCaseSettingsTypeImpl loadCaseSettingsType = new LoadCaseSettingsTypeImpl();
		return loadCaseSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseStateType createLoadCaseStateType() {
		LoadCaseStateTypeImpl loadCaseStateType = new LoadCaseStateTypeImpl();
		return loadCaseStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCasesType createLoadCasesType() {
		LoadCasesTypeImpl loadCasesType = new LoadCasesTypeImpl();
		return loadCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationAccelerationType createLoadCaseTranslationAccelerationType() {
		LoadCaseTranslationAccelerationTypeImpl loadCaseTranslationAccelerationType = new LoadCaseTranslationAccelerationTypeImpl();
		return loadCaseTranslationAccelerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationType createLoadCaseTranslationType() {
		LoadCaseTranslationTypeImpl loadCaseTranslationType = new LoadCaseTranslationTypeImpl();
		return loadCaseTranslationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationVelocityType createLoadCaseTranslationVelocityType() {
		LoadCaseTranslationVelocityTypeImpl loadCaseTranslationVelocityType = new LoadCaseTranslationVelocityTypeImpl();
		return loadCaseTranslationVelocityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadConditionType createLoadConditionType() {
		LoadConditionTypeImpl loadConditionType = new LoadConditionTypeImpl();
		return loadConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceAxisPointsType createLoadReferenceAxisPointsType() {
		LoadReferenceAxisPointsTypeImpl loadReferenceAxisPointsType = new LoadReferenceAxisPointsTypeImpl();
		return loadReferenceAxisPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceAxisPointType createLoadReferenceAxisPointType() {
		LoadReferenceAxisPointTypeImpl loadReferenceAxisPointType = new LoadReferenceAxisPointTypeImpl();
		return loadReferenceAxisPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadReferenceType createLoadReferenceType() {
		LoadReferenceTypeImpl loadReferenceType = new LoadReferenceTypeImpl();
		return loadReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadsEnvelopeType createLoadsEnvelopeType() {
		LoadsEnvelopeTypeImpl loadsEnvelopeType = new LoadsEnvelopeTypeImpl();
		return loadsEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongFloorBeamPositionType createLongFloorBeamPositionType() {
		LongFloorBeamPositionTypeImpl longFloorBeamPositionType = new LongFloorBeamPositionTypeImpl();
		return longFloorBeamPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongFloorBeamsAssemblyType createLongFloorBeamsAssemblyType() {
		LongFloorBeamsAssemblyTypeImpl longFloorBeamsAssemblyType = new LongFloorBeamsAssemblyTypeImpl();
		return longFloorBeamsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongFloorBeamType createLongFloorBeamType() {
		LongFloorBeamTypeImpl longFloorBeamType = new LongFloorBeamTypeImpl();
		return longFloorBeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainActuatorType createMainActuatorType() {
		MainActuatorTypeImpl mainActuatorType = new MainActuatorTypeImpl();
		return mainActuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearGlobalType createMainGearGlobalType() {
		MainGearGlobalTypeImpl mainGearGlobalType = new MainGearGlobalTypeImpl();
		return mainGearGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearsType createMainGearsType() {
		MainGearsTypeImpl mainGearsType = new MainGearsTypeImpl();
		return mainGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearSupportBeamPositionType createMainGearSupportBeamPositionType() {
		MainGearSupportBeamPositionTypeImpl mainGearSupportBeamPositionType = new MainGearSupportBeamPositionTypeImpl();
		return mainGearSupportBeamPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearSupportBeamType createMainGearSupportBeamType() {
		MainGearSupportBeamTypeImpl mainGearSupportBeamType = new MainGearSupportBeamTypeImpl();
		return mainGearSupportBeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearType createMainGearType() {
		MainGearTypeImpl mainGearType = new MainGearTypeImpl();
		return mainGearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearWingAttachmentType createMainGearWingAttachmentType() {
		MainGearWingAttachmentTypeImpl mainGearWingAttachmentType = new MainGearWingAttachmentTypeImpl();
		return mainGearWingAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainStrutInterfaceDefinitionsType createMainStrutInterfaceDefinitionsType() {
		MainStrutInterfaceDefinitionsTypeImpl mainStrutInterfaceDefinitionsType = new MainStrutInterfaceDefinitionsTypeImpl();
		return mainStrutInterfaceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainStrutWingFuselageAttachmentType createMainStrutWingFuselageAttachmentType() {
		MainStrutWingFuselageAttachmentTypeImpl mainStrutWingFuselageAttachmentType = new MainStrutWingFuselageAttachmentTypeImpl();
		return mainStrutWingFuselageAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintenanceCostType createMaintenanceCostType() {
		MaintenanceCostTypeImpl maintenanceCostType = new MaintenanceCostTypeImpl();
		return maintenanceCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAirConditioningType createMAirConditioningType() {
		MAirConditioningTypeImpl mAirConditioningType = new MAirConditioningTypeImpl();
		return mAirConditioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassBreakdownType createMassBreakdownType() {
		MassBreakdownTypeImpl massBreakdownType = new MassBreakdownTypeImpl();
		return massBreakdownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassFractionType createMassFractionType() {
		MassFractionTypeImpl massFractionType = new MassFractionTypeImpl();
		return massFractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaType createMassInertiaType() {
		MassInertiaTypeImpl massInertiaType = new MassInertiaTypeImpl();
		return massInertiaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaVectorType createMassInertiaVectorType() {
		MassInertiaVectorTypeImpl massInertiaVectorType = new MassInertiaVectorTypeImpl();
		return massInertiaVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionForProfileBasedPointType createMaterialDefinitionForProfileBasedPointType() {
		MaterialDefinitionForProfileBasedPointTypeImpl materialDefinitionForProfileBasedPointType = new MaterialDefinitionForProfileBasedPointTypeImpl();
		return materialDefinitionForProfileBasedPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionForProfileBasedType createMaterialDefinitionForProfileBasedType() {
		MaterialDefinitionForProfileBasedTypeImpl materialDefinitionForProfileBasedType = new MaterialDefinitionForProfileBasedTypeImpl();
		return materialDefinitionForProfileBasedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType createMaterialDefinitionType() {
		MaterialDefinitionTypeImpl materialDefinitionType = new MaterialDefinitionTypeImpl();
		return materialDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialsType createMaterialsType() {
		MaterialsTypeImpl materialsType = new MaterialsTypeImpl();
		return materialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialType createMaterialType() {
		MaterialTypeImpl materialType = new MaterialTypeImpl();
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAutomaticFlightSystemType createMAutomaticFlightSystemType() {
		MAutomaticFlightSystemTypeImpl mAutomaticFlightSystemType = new MAutomaticFlightSystemTypeImpl();
		return mAutomaticFlightSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAuxillaryPowerUnitType createMAuxillaryPowerUnitType() {
		MAuxillaryPowerUnitTypeImpl mAuxillaryPowerUnitType = new MAuxillaryPowerUnitTypeImpl();
		return mAuxillaryPowerUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBellyFairingsType createMBellyFairingsType() {
		MBellyFairingsTypeImpl mBellyFairingsType = new MBellyFairingsTypeImpl();
		return mBellyFairingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBleedAirSystemType createMBleedAirSystemType() {
		MBleedAirSystemTypeImpl mBleedAirSystemType = new MBleedAirSystemTypeImpl();
		return mBleedAirSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBulkCargosType createMBulkCargosType() {
		MBulkCargosTypeImpl mBulkCargosType = new MBulkCargosTypeImpl();
		return mBulkCargosType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBulkCargoType createMBulkCargoType() {
		MBulkCargoTypeImpl mBulkCargoType = new MBulkCargoTypeImpl();
		return mBulkCargoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBulkheadsType createMBulkheadsType() {
		MBulkheadsTypeImpl mBulkheadsType = new MBulkheadsTypeImpl();
		return mBulkheadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCabinFloorsType createMCabinFloorsType() {
		MCabinFloorsTypeImpl mCabinFloorsType = new MCabinFloorsTypeImpl();
		return mCabinFloorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCabinLightingsType createMCabinLightingsType() {
		MCabinLightingsTypeImpl mCabinLightingsType = new MCabinLightingsTypeImpl();
		return mCabinLightingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoFloorsType createMCargoFloorsType() {
		MCargoFloorsTypeImpl mCargoFloorsType = new MCargoFloorsTypeImpl();
		return mCargoFloorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoLiningsType createMCargoLiningsType() {
		MCargoLiningsTypeImpl mCargoLiningsType = new MCargoLiningsTypeImpl();
		return mCargoLiningsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoLoadingsType createMCargoLoadingsType() {
		MCargoLoadingsTypeImpl mCargoLoadingsType = new MCargoLoadingsTypeImpl();
		return mCargoLoadingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoType createMCargoType() {
		MCargoTypeImpl mCargoType = new MCargoTypeImpl();
		return mCargoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCarriagesType createMCarriagesType() {
		MCarriagesTypeImpl mCarriagesType = new MCarriagesTypeImpl();
		return mCarriagesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCarryOnsType createMCarryOnsType() {
		MCarryOnsTypeImpl mCarryOnsType = new MCarryOnsTypeImpl();
		return mCarryOnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCarryOnType createMCarryOnType() {
		MCarryOnTypeImpl mCarryOnType = new MCarryOnTypeImpl();
		return mCarryOnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCateringsType createMCateringsType() {
		MCateringsTypeImpl mCateringsType = new MCateringsTypeImpl();
		return mCateringsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCellsType createMCellsType() {
		MCellsTypeImpl mCellsType = new MCellsTypeImpl();
		return mCellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCockpitLightingsType createMCockpitLightingsType() {
		MCockpitLightingsTypeImpl mCockpitLightingsType = new MCockpitLightingsTypeImpl();
		return mCockpitLightingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCommunicationType createMCommunicationType() {
		MCommunicationTypeImpl mCommunicationType = new MCommunicationTypeImpl();
		return mCommunicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MComponentSegmentsType createMComponentSegmentsType() {
		MComponentSegmentsTypeImpl mComponentSegmentsType = new MComponentSegmentsTypeImpl();
		return mComponentSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MComponentSegmentType createMComponentSegmentType() {
		MComponentSegmentTypeImpl mComponentSegmentType = new MComponentSegmentTypeImpl();
		return mComponentSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MControlSurfaceSupportsType createMControlSurfaceSupportsType() {
		MControlSurfaceSupportsTypeImpl mControlSurfaceSupportsType = new MControlSurfaceSupportsTypeImpl();
		return mControlSurfaceSupportsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MControlSurfaceSupportType createMControlSurfaceSupportType() {
		MControlSurfaceSupportTypeImpl mControlSurfaceSupportType = new MControlSurfaceSupportTypeImpl();
		return mControlSurfaceSupportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCrewMembersType createMCrewMembersType() {
		MCrewMembersTypeImpl mCrewMembersType = new MCrewMembersTypeImpl();
		return mCrewMembersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCrewSeatsType createMCrewSeatsType() {
		MCrewSeatsTypeImpl mCrewSeatsType = new MCrewSeatsTypeImpl();
		return mCrewSeatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDeIcingType createMDeIcingType() {
		MDeIcingTypeImpl mDeIcingType = new MDeIcingTypeImpl();
		return mDeIcingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDocumentsToolsType createMDocumentsToolsType() {
		MDocumentsToolsTypeImpl mDocumentsToolsType = new MDocumentsToolsTypeImpl();
		return mDocumentsToolsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDoorsType createMDoorsType() {
		MDoorsTypeImpl mDoorsType = new MDoorsTypeImpl();
		return mDoorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MElectricalDistributionType createMElectricalDistributionType() {
		MElectricalDistributionTypeImpl mElectricalDistributionType = new MElectricalDistributionTypeImpl();
		return mElectricalDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MElectricalGenerationType createMElectricalGenerationType() {
		MElectricalGenerationTypeImpl mElectricalGenerationType = new MElectricalGenerationTypeImpl();
		return mElectricalGenerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmergencyEquipmentsType createMEmergencyEquipmentsType() {
		MEmergencyEquipmentsTypeImpl mEmergencyEquipmentsType = new MEmergencyEquipmentsTypeImpl();
		return mEmergencyEquipmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmergencyOxygenSystemsType createMEmergencyOxygenSystemsType() {
		MEmergencyOxygenSystemsTypeImpl mEmergencyOxygenSystemsType = new MEmergencyOxygenSystemsTypeImpl();
		return mEmergencyOxygenSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmptyULDsType createMEmptyULDsType() {
		MEmptyULDsTypeImpl mEmptyULDsType = new MEmptyULDsTypeImpl();
		return mEmptyULDsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmptyULDType createMEmptyULDType() {
		MEmptyULDTypeImpl mEmptyULDType = new MEmptyULDTypeImpl();
		return mEmptyULDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEngineControlType createMEngineControlType() {
		MEngineControlTypeImpl mEngineControlType = new MEngineControlTypeImpl();
		return mEngineControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEquippedEnginesType createMEquippedEnginesType() {
		MEquippedEnginesTypeImpl mEquippedEnginesType = new MEquippedEnginesTypeImpl();
		return mEquippedEnginesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MExtLightingsType createMExtLightingsType() {
		MExtLightingsTypeImpl mExtLightingsType = new MExtLightingsTypeImpl();
		return mExtLightingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFireProtectionType createMFireProtectionType() {
		MFireProtectionTypeImpl mFireProtectionType = new MFireProtectionTypeImpl();
		return mFireProtectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedGalleysType createMFixedGalleysType() {
		MFixedGalleysTypeImpl mFixedGalleysType = new MFixedGalleysTypeImpl();
		return mFixedGalleysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedLeadingEdgesType createMFixedLeadingEdgesType() {
		MFixedLeadingEdgesTypeImpl mFixedLeadingEdgesType = new MFixedLeadingEdgesTypeImpl();
		return mFixedLeadingEdgesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedLeadingEdgeType createMFixedLeadingEdgeType() {
		MFixedLeadingEdgeTypeImpl mFixedLeadingEdgeType = new MFixedLeadingEdgeTypeImpl();
		return mFixedLeadingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedTrailingEdgesType createMFixedTrailingEdgesType() {
		MFixedTrailingEdgesTypeImpl mFixedTrailingEdgesType = new MFixedTrailingEdgesTypeImpl();
		return mFixedTrailingEdgesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedTrailingEdgeType createMFixedTrailingEdgeType() {
		MFixedTrailingEdgeTypeImpl mFixedTrailingEdgeType = new MFixedTrailingEdgeTypeImpl();
		return mFixedTrailingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlightControlsType createMFlightControlsType() {
		MFlightControlsTypeImpl mFlightControlsType = new MFlightControlsTypeImpl();
		return mFlightControlsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFloorCoveringsType createMFloorCoveringsType() {
		MFloorCoveringsTypeImpl mFloorCoveringsType = new MFloorCoveringsTypeImpl();
		return mFloorCoveringsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFramesType createMFramesType() {
		MFramesTypeImpl mFramesType = new MFramesTypeImpl();
		return mFramesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFreshWaterSystemsType createMFreshWaterSystemsType() {
		MFreshWaterSystemsTypeImpl mFreshWaterSystemsType = new MFreshWaterSystemsTypeImpl();
		return mFreshWaterSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuelSystemType createMFuelSystemType() {
		MFuelSystemTypeImpl mFuelSystemType = new MFuelSystemTypeImpl();
		return mFuelSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuelType createMFuelType() {
		MFuelTypeImpl mFuelType = new MFuelTypeImpl();
		return mFuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFurnishingType createMFurnishingType() {
		MFurnishingTypeImpl mFurnishingType = new MFurnishingTypeImpl();
		return mFurnishingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuselagesStructureType createMFuselagesStructureType() {
		MFuselagesStructureTypeImpl mFuselagesStructureType = new MFuselagesStructureTypeImpl();
		return mFuselagesStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuselageStructureType createMFuselageStructureType() {
		MFuselageStructureTypeImpl mFuselageStructureType = new MFuselageStructureTypeImpl();
		return mFuselageStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHydraulicDistributionType createMHydraulicDistributionType() {
		MHydraulicDistributionTypeImpl mHydraulicDistributionType = new MHydraulicDistributionTypeImpl();
		return mHydraulicDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHydraulicGenerationType createMHydraulicGenerationType() {
		MHydraulicGenerationTypeImpl mHydraulicGenerationType = new MHydraulicGenerationTypeImpl();
		return mHydraulicGenerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MIFESystemsType createMIFESystemsType() {
		MIFESystemsTypeImpl mifeSystemsType = new MIFESystemsTypeImpl();
		return mifeSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInstrumentPanelType createMInstrumentPanelType() {
		MInstrumentPanelTypeImpl mInstrumentPanelType = new MInstrumentPanelTypeImpl();
		return mInstrumentPanelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInsulationsType createMInsulationsType() {
		MInsulationsTypeImpl mInsulationsType = new MInsulationsTypeImpl();
		return mInsulationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MIntegratedModularAvionicsType createMIntegratedModularAvionicsType() {
		MIntegratedModularAvionicsTypeImpl mIntegratedModularAvionicsType = new MIntegratedModularAvionicsTypeImpl();
		return mIntegratedModularAvionicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInterGasSystemType createMInterGasSystemType() {
		MInterGasSystemTypeImpl mInterGasSystemType = new MInterGasSystemTypeImpl();
		return mInterGasSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionDefinitionsType createMissionDefinitionsType() {
		MissionDefinitionsTypeImpl missionDefinitionsType = new MissionDefinitionsTypeImpl();
		return missionDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionPerformanceMapDefinitionType createMissionPerformanceMapDefinitionType() {
		MissionPerformanceMapDefinitionTypeImpl missionPerformanceMapDefinitionType = new MissionPerformanceMapDefinitionTypeImpl();
		return missionPerformanceMapDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentBlockConstraintsType createMissionSegmentBlockConstraintsType() {
		MissionSegmentBlockConstraintsTypeImpl missionSegmentBlockConstraintsType = new MissionSegmentBlockConstraintsTypeImpl();
		return missionSegmentBlockConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentBlocksType createMissionSegmentBlocksType() {
		MissionSegmentBlocksTypeImpl missionSegmentBlocksType = new MissionSegmentBlocksTypeImpl();
		return missionSegmentBlocksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentBlockType createMissionSegmentBlockType() {
		MissionSegmentBlockTypeImpl missionSegmentBlockType = new MissionSegmentBlockTypeImpl();
		return missionSegmentBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentEndConditionType createMissionSegmentEndConditionType() {
		MissionSegmentEndConditionTypeImpl missionSegmentEndConditionType = new MissionSegmentEndConditionTypeImpl();
		return missionSegmentEndConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentsType createMissionSegmentsType() {
		MissionSegmentsTypeImpl missionSegmentsType = new MissionSegmentsTypeImpl();
		return missionSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentType createMissionSegmentType() {
		MissionSegmentTypeImpl missionSegmentType = new MissionSegmentTypeImpl();
		return missionSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionStartConditionType createMissionStartConditionType() {
		MissionStartConditionTypeImpl missionStartConditionType = new MissionStartConditionTypeImpl();
		return missionStartConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionsType createMissionsType() {
		MissionsTypeImpl missionsType = new MissionsTypeImpl();
		return missionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionType createMissionType() {
		MissionTypeImpl missionType = new MissionTypeImpl();
		return missionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLandingGearsType createMLandingGearsType() {
		MLandingGearsTypeImpl mLandingGearsType = new MLandingGearsTypeImpl();
		return mLandingGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLandingGearSupportsType createMLandingGearSupportsType() {
		MLandingGearSupportsTypeImpl mLandingGearSupportsType = new MLandingGearSupportsTypeImpl();
		return mLandingGearSupportsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLavatoriesType createMLavatoriesType() {
		MLavatoriesTypeImpl mLavatoriesType = new MLavatoriesTypeImpl();
		return mLavatoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLiningsType createMLiningsType() {
		MLiningsTypeImpl mLiningsType = new MLiningsTypeImpl();
		return mLiningsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMainGearsType createMMainGearsType() {
		MMainGearsTypeImpl mMainGearsType = new MMainGearsTypeImpl();
		return mMainGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MManufacturerEmptyType createMManufacturerEmptyType() {
		MManufacturerEmptyTypeImpl mManufacturerEmptyType = new MManufacturerEmptyTypeImpl();
		return mManufacturerEmptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMillitarySystemsType createMMillitarySystemsType() {
		MMillitarySystemsTypeImpl mMillitarySystemsType = new MMillitarySystemsTypeImpl();
		return mMillitarySystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMiscellaneousType createMMiscellaneousType() {
		MMiscellaneousTypeImpl mMiscellaneousType = new MMiscellaneousTypeImpl();
		return mMiscellaneousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveableLeadingEdgesType createMMoveableLeadingEdgesType() {
		MMoveableLeadingEdgesTypeImpl mMoveableLeadingEdgesType = new MMoveableLeadingEdgesTypeImpl();
		return mMoveableLeadingEdgesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveableLeadingEdgeType createMMoveableLeadingEdgeType() {
		MMoveableLeadingEdgeTypeImpl mMoveableLeadingEdgeType = new MMoveableLeadingEdgeTypeImpl();
		return mMoveableLeadingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveablesType createMMoveablesType() {
		MMoveablesTypeImpl mMoveablesType = new MMoveablesTypeImpl();
		return mMoveablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveableTrailingEdgeType createMMoveableTrailingEdgeType() {
		MMoveableTrailingEdgeTypeImpl mMoveableTrailingEdgeType = new MMoveableTrailingEdgeTypeImpl();
		return mMoveableTrailingEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MNavigationType createMNavigationType() {
		MNavigationTypeImpl mNavigationType = new MNavigationTypeImpl();
		return mNavigationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MNoseGearsType createMNoseGearsType() {
		MNoseGearsTypeImpl mNoseGearsType = new MNoseGearsTypeImpl();
		return mNoseGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonetaryValuesAnalysisType createMonetaryValuesAnalysisType() {
		MonetaryValuesAnalysisTypeImpl monetaryValuesAnalysisType = new MonetaryValuesAnalysisTypeImpl();
		return monetaryValuesAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MOperatorItemsType createMOperatorItemsType() {
		MOperatorItemsTypeImpl mOperatorItemsType = new MOperatorItemsTypeImpl();
		return mOperatorItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MOverheadBinsType createMOverheadBinsType() {
		MOverheadBinsTypeImpl mOverheadBinsType = new MOverheadBinsTypeImpl();
		return mOverheadBinsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPartStowDoorsType createMPartStowDoorsType() {
		MPartStowDoorsTypeImpl mPartStowDoorsType = new MPartStowDoorsTypeImpl();
		return mPartStowDoorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPassengersType createMPassengersType() {
		MPassengersTypeImpl mPassengersType = new MPassengersTypeImpl();
		return mPassengersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPassengerType createMPassengerType() {
		MPassengerTypeImpl mPassengerType = new MPassengerTypeImpl();
		return mPassengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPaxType createMPaxType() {
		MPaxTypeImpl mPaxType = new MPaxTypeImpl();
		return mPaxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPayloadType createMPayloadType() {
		MPayloadTypeImpl mPayloadType = new MPayloadTypeImpl();
		return mPayloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPowerUnitsType createMPowerUnitsType() {
		MPowerUnitsTypeImpl mPowerUnitsType = new MPowerUnitsTypeImpl();
		return mPowerUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPylonAttachmentsType createMPylonAttachmentsType() {
		MPylonAttachmentsTypeImpl mPylonAttachmentsType = new MPylonAttachmentsTypeImpl();
		return mPylonAttachmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPylonsType createMPylonsType() {
		MPylonsTypeImpl mPylonsType = new MPylonsTypeImpl();
		return mPylonsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRibsType createMRibsType() {
		MRibsTypeImpl mRibsType = new MRibsTypeImpl();
		return mRibsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRibType createMRibType() {
		MRibTypeImpl mRibType = new MRibTypeImpl();
		return mRibType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSeatsType createMSeatsType() {
		MSeatsTypeImpl mSeatsType = new MSeatsTypeImpl();
		return mSeatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MShellsType createMShellsType() {
		MShellsTypeImpl mShellsType = new MShellsTypeImpl();
		return mShellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MShellType createMShellType() {
		MShellTypeImpl mShellType = new MShellTypeImpl();
		return mShellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSkinPanelsType createMSkinPanelsType() {
		MSkinPanelsTypeImpl mSkinPanelsType = new MSkinPanelsTypeImpl();
		return mSkinPanelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSkinsType createMSkinsType() {
		MSkinsTypeImpl mSkinsType = new MSkinsTypeImpl();
		return mSkinsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSparsType createMSparsType() {
		MSparsTypeImpl mSparsType = new MSparsTypeImpl();
		return mSparsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSpecialStructuresType createMSpecialStructuresType() {
		MSpecialStructuresTypeImpl mSpecialStructuresType = new MSpecialStructuresTypeImpl();
		return mSpecialStructuresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSpoilersType createMSpoilersType() {
		MSpoilersTypeImpl mSpoilersType = new MSpoilersTypeImpl();
		return mSpoilersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MStringersType createMStringersType() {
		MStringersTypeImpl mStringersType = new MStringersTypeImpl();
		return mStringersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MStructureType createMStructureType() {
		MStructureTypeImpl mStructureType = new MStructureTypeImpl();
		return mStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSystemsType createMSystemsType() {
		MSystemsTypeImpl mSystemsType = new MSystemsTypeImpl();
		return mSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MTrailingEdgeDevicesType createMTrailingEdgeDevicesType() {
		MTrailingEdgeDevicesTypeImpl mTrailingEdgeDevicesType = new MTrailingEdgeDevicesTypeImpl();
		return mTrailingEdgeDevicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MTrailingEdgeDeviceType createMTrailingEdgeDeviceType() {
		MTrailingEdgeDeviceTypeImpl mTrailingEdgeDeviceType = new MTrailingEdgeDeviceTypeImpl();
		return mTrailingEdgeDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MULDContentsType createMULDContentsType() {
		MULDContentsTypeImpl muldContentsType = new MULDContentsTypeImpl();
		return muldContentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MULDContentType createMULDContentType() {
		MULDContentTypeImpl muldContentType = new MULDContentTypeImpl();
		return muldContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MVacuumWasteSystemsType createMVacuumWasteSystemsType() {
		MVacuumWasteSystemsTypeImpl mVacuumWasteSystemsType = new MVacuumWasteSystemsTypeImpl();
		return mVacuumWasteSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWasteWaterSystemsType createMWasteWaterSystemsType() {
		MWasteWaterSystemsTypeImpl mWasteWaterSystemsType = new MWasteWaterSystemsTypeImpl();
		return mWasteWaterSystemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWindowsType createMWindowsType() {
		MWindowsTypeImpl mWindowsType = new MWindowsTypeImpl();
		return mWindowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWingBoxType createMWingBoxType() {
		MWingBoxTypeImpl mWingBoxType = new MWingBoxTypeImpl();
		return mWingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWingsStructureType createMWingsStructureType() {
		MWingsStructureTypeImpl mWingsStructureType = new MWingsStructureTypeImpl();
		return mWingsStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWingStructureType createMWingStructureType() {
		MWingStructureTypeImpl mWingStructureType = new MWingStructureTypeImpl();
		return mWingStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleCenterCowlType createNacelleCenterCowlType() {
		NacelleCenterCowlTypeImpl nacelleCenterCowlType = new NacelleCenterCowlTypeImpl();
		return nacelleCenterCowlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleCowlType createNacelleCowlType() {
		NacelleCowlTypeImpl nacelleCowlType = new NacelleCowlTypeImpl();
		return nacelleCowlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleGuideCurvesType createNacelleGuideCurvesType() {
		NacelleGuideCurvesTypeImpl nacelleGuideCurvesType = new NacelleGuideCurvesTypeImpl();
		return nacelleGuideCurvesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleGuideCurveType createNacelleGuideCurveType() {
		NacelleGuideCurveTypeImpl nacelleGuideCurveType = new NacelleGuideCurveTypeImpl();
		return nacelleGuideCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleProfilesType createNacelleProfilesType() {
		NacelleProfilesTypeImpl nacelleProfilesType = new NacelleProfilesTypeImpl();
		return nacelleProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleSectionsType createNacelleSectionsType() {
		NacelleSectionsTypeImpl nacelleSectionsType = new NacelleSectionsTypeImpl();
		return nacelleSectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NacelleSectionType createNacelleSectionType() {
		NacelleSectionTypeImpl nacelleSectionType = new NacelleSectionTypeImpl();
		return nacelleSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodalLoadsType createNodalLoadsType() {
		NodalLoadsTypeImpl nodalLoadsType = new NodalLoadsTypeImpl();
		return nodalLoadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodalLoadType createNodalLoadType() {
		NodalLoadTypeImpl nodalLoadType = new NodalLoadTypeImpl();
		return nodalLoadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoiseAnalysisType createNoiseAnalysisType() {
		NoiseAnalysisTypeImpl noiseAnalysisType = new NoiseAnalysisTypeImpl();
		return noiseAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoseGearGlobalType createNoseGearGlobalType() {
		NoseGearGlobalTypeImpl noseGearGlobalType = new NoseGearGlobalTypeImpl();
		return noseGearGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoseGearsType createNoseGearsType() {
		NoseGearsTypeImpl noseGearsType = new NoseGearsTypeImpl();
		return noseGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoseGearType createNoseGearType() {
		NoseGearTypeImpl noseGearType = new NoseGearTypeImpl();
		return noseGearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OEMType createOEMType() {
		OEMTypeImpl oemType = new OEMTypeImpl();
		return oemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalCasesType createOperationalCasesType() {
		OperationalCasesTypeImpl operationalCasesType = new OperationalCasesTypeImpl();
		return operationalCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalCaseType createOperationalCaseType() {
		OperationalCaseTypeImpl operationalCaseType = new OperationalCaseTypeImpl();
		return operationalCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationLimitIncrementsType createOperationLimitIncrementsType() {
		OperationLimitIncrementsTypeImpl operationLimitIncrementsType = new OperationLimitIncrementsTypeImpl();
		return operationLimitIncrementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrthotropicShellPropertiesType createOrthotropicShellPropertiesType() {
		OrthotropicShellPropertiesTypeImpl orthotropicShellPropertiesType = new OrthotropicShellPropertiesTypeImpl();
		return orthotropicShellPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrthotropicSolidPropertiesType createOrthotropicSolidPropertiesType() {
		OrthotropicSolidPropertiesTypeImpl orthotropicSolidPropertiesType = new OrthotropicSolidPropertiesTypeImpl();
		return orthotropicSolidPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OuterCutOutProfileType createOuterCutOutProfileType() {
		OuterCutOutProfileTypeImpl outerCutOutProfileType = new OuterCutOutProfileTypeImpl();
		return outerCutOutProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxCrossBeamsAssemblyType createPaxCrossBeamsAssemblyType() {
		PaxCrossBeamsAssemblyTypeImpl paxCrossBeamsAssemblyType = new PaxCrossBeamsAssemblyTypeImpl();
		return paxCrossBeamsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxCrossBeamStrutsAssemblyType createPaxCrossBeamStrutsAssemblyType() {
		PaxCrossBeamStrutsAssemblyTypeImpl paxCrossBeamStrutsAssemblyType = new PaxCrossBeamStrutsAssemblyTypeImpl();
		return paxCrossBeamStrutsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaxDoorsAssemblyType createPaxDoorsAssemblyType() {
		PaxDoorsAssemblyTypeImpl paxDoorsAssemblyType = new PaxDoorsAssemblyTypeImpl();
		return paxDoorsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayloadGlobalType createPayloadGlobalType() {
		PayloadGlobalTypeImpl payloadGlobalType = new PayloadGlobalTypeImpl();
		return payloadGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceCasesType createPerformanceCasesType() {
		PerformanceCasesTypeImpl performanceCasesType = new PerformanceCasesTypeImpl();
		return performanceCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceCaseType createPerformanceCaseType() {
		PerformanceCaseTypeImpl performanceCaseType = new PerformanceCaseTypeImpl();
		return performanceCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMapSelectionType createPerformanceMapSelectionType() {
		PerformanceMapSelectionTypeImpl performanceMapSelectionType = new PerformanceMapSelectionTypeImpl();
		return performanceMapSelectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceRequirementsType createPerformanceRequirementsType() {
		PerformanceRequirementsTypeImpl performanceRequirementsType = new PerformanceRequirementsTypeImpl();
		return performanceRequirementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceTargetsGlobalType createPerformanceTargetsGlobalType() {
		PerformanceTargetsGlobalTypeImpl performanceTargetsGlobalType = new PerformanceTargetsGlobalTypeImpl();
		return performanceTargetsGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhiType createPhiType() {
		PhiTypeImpl phiType = new PhiTypeImpl();
		return phiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PistonType createPistonType() {
		PistonTypeImpl pistonType = new PistonTypeImpl();
		return pistonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurvePointsType createPlasticityCurvePointsType() {
		PlasticityCurvePointsTypeImpl plasticityCurvePointsType = new PlasticityCurvePointsTypeImpl();
		return plasticityCurvePointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurvePointType createPlasticityCurvePointType() {
		PlasticityCurvePointTypeImpl plasticityCurvePointType = new PlasticityCurvePointTypeImpl();
		return plasticityCurvePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurvesType createPlasticityCurvesType() {
		PlasticityCurvesTypeImpl plasticityCurvesType = new PlasticityCurvesTypeImpl();
		return plasticityCurvesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurveType createPlasticityCurveType() {
		PlasticityCurveTypeImpl plasticityCurveType = new PlasticityCurveTypeImpl();
		return plasticityCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointAbsRelType createPointAbsRelType() {
		PointAbsRelTypeImpl pointAbsRelType = new PointAbsRelTypeImpl();
		return pointAbsRelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointConstraintType createPointConstraintType() {
		PointConstraintTypeImpl pointConstraintType = new PointConstraintTypeImpl();
		return pointConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListRelXYZVectorType createPointListRelXYZVectorType() {
		PointListRelXYZVectorTypeImpl pointListRelXYZVectorType = new PointListRelXYZVectorTypeImpl();
		return pointListRelXYZVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListType createPointListType() {
		PointListTypeImpl pointListType = new PointListTypeImpl();
		return pointListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYType createPointListXYType() {
		PointListXYTypeImpl pointListXYType = new PointListXYTypeImpl();
		return pointListXYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYVectorType createPointListXYVectorType() {
		PointListXYVectorTypeImpl pointListXYVectorType = new PointListXYVectorTypeImpl();
		return pointListXYVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType createPointListXYZVectorType() {
		PointListXYZVectorTypeImpl pointListXYZVectorType = new PointListXYZVectorTypeImpl();
		return pointListXYZVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPerformancesType createPointPerformancesType() {
		PointPerformancesTypeImpl pointPerformancesType = new PointPerformancesTypeImpl();
		return pointPerformancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPerformanceType createPointPerformanceType() {
		PointPerformanceTypeImpl pointPerformanceType = new PointPerformanceTypeImpl();
		return pointPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXType createPointXType() {
		PointXTypeImpl pointXType = new PointXTypeImpl();
		return pointXType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType createPointXYType() {
		PointXYTypeImpl pointXYType = new PointXYTypeImpl();
		return pointXYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType createPointXYZType() {
		PointXYZTypeImpl pointXYZType = new PointXYZTypeImpl();
		return pointXYZType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXZType createPointXZType() {
		PointXZTypeImpl pointXZType = new PointXZTypeImpl();
		return pointXZType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointYType createPointYType() {
		PointYTypeImpl pointYType = new PointYTypeImpl();
		return pointYType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointYZType createPointYZType() {
		PointYZTypeImpl pointYZType = new PointYZTypeImpl();
		return pointYZType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointZType createPointZType() {
		PointZTypeImpl pointZType = new PointZTypeImpl();
		return pointZType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositioningsType createPositioningsType() {
		PositioningsTypeImpl positioningsType = new PositioningsTypeImpl();
		return positioningsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositioningType createPositioningType() {
		PositioningTypeImpl positioningType = new PositioningTypeImpl();
		return positioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadAssemblyPositionType createPressureBulkheadAssemblyPositionType() {
		PressureBulkheadAssemblyPositionTypeImpl pressureBulkheadAssemblyPositionType = new PressureBulkheadAssemblyPositionTypeImpl();
		return pressureBulkheadAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadAssemblyType createPressureBulkheadAssemblyType() {
		PressureBulkheadAssemblyTypeImpl pressureBulkheadAssemblyType = new PressureBulkheadAssemblyTypeImpl();
		return pressureBulkheadAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadsType createPressureBulkheadsType() {
		PressureBulkheadsTypeImpl pressureBulkheadsType = new PressureBulkheadsTypeImpl();
		return pressureBulkheadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadType createPressureBulkheadType() {
		PressureBulkheadTypeImpl pressureBulkheadType = new PressureBulkheadTypeImpl();
		return pressureBulkheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrioritySettingType createPrioritySettingType() {
		PrioritySettingTypeImpl prioritySettingType = new PrioritySettingTypeImpl();
		return prioritySettingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileBasedStructuralElementsType createProfileBasedStructuralElementsType() {
		ProfileBasedStructuralElementsTypeImpl profileBasedStructuralElementsType = new ProfileBasedStructuralElementsTypeImpl();
		return profileBasedStructuralElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileBasedStructuralElementType createProfileBasedStructuralElementType() {
		ProfileBasedStructuralElementTypeImpl profileBasedStructuralElementType = new ProfileBasedStructuralElementTypeImpl();
		return profileBasedStructuralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileGeometry2DType createProfileGeometry2DType() {
		ProfileGeometry2DTypeImpl profileGeometry2DType = new ProfileGeometry2DTypeImpl();
		return profileGeometry2DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileGeometryType createProfileGeometryType() {
		ProfileGeometryTypeImpl profileGeometryType = new ProfileGeometryTypeImpl();
		return profileGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfilesType createProfilesType() {
		ProfilesTypeImpl profilesType = new ProfilesTypeImpl();
		return profilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonAttachmentsType createPylonAttachmentsType() {
		PylonAttachmentsTypeImpl pylonAttachmentsType = new PylonAttachmentsTypeImpl();
		return pylonAttachmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonAttachmentType createPylonAttachmentType() {
		PylonAttachmentTypeImpl pylonAttachmentType = new PylonAttachmentTypeImpl();
		return pylonAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonBoxType createPylonBoxType() {
		PylonBoxTypeImpl pylonBoxType = new PylonBoxTypeImpl();
		return pylonBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonPinsType createPylonPinsType() {
		PylonPinsTypeImpl pylonPinsType = new PylonPinsTypeImpl();
		return pylonPinsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonPinType createPylonPinType() {
		PylonPinTypeImpl pylonPinType = new PylonPinTypeImpl();
		return pylonPinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsDefinitionsType createPylonRibsDefinitionsType() {
		PylonRibsDefinitionsTypeImpl pylonRibsDefinitionsType = new PylonRibsDefinitionsTypeImpl();
		return pylonRibsDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsDefinitionType createPylonRibsDefinitionType() {
		PylonRibsDefinitionTypeImpl pylonRibsDefinitionType = new PylonRibsDefinitionTypeImpl();
		return pylonRibsDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsPositioningType createPylonRibsPositioningType() {
		PylonRibsPositioningTypeImpl pylonRibsPositioningType = new PylonRibsPositioningTypeImpl();
		return pylonRibsPositioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShacklesType createPylonShacklesType() {
		PylonShacklesTypeImpl pylonShacklesType = new PylonShacklesTypeImpl();
		return pylonShacklesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShackleType createPylonShackleType() {
		PylonShackleTypeImpl pylonShackleType = new PylonShackleTypeImpl();
		return pylonShackleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType createPylonShellType() {
		PylonShellTypeImpl pylonShellType = new PylonShellTypeImpl();
		return pylonShellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonStructureType createPylonStructureType() {
		PylonStructureTypeImpl pylonStructureType = new PylonStructureTypeImpl();
		return pylonStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonStrutsType createPylonStrutsType() {
		PylonStrutsTypeImpl pylonStrutsType = new PylonStrutsTypeImpl();
		return pylonStrutsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuasiSteadyRotationType createQuasiSteadyRotationType() {
		QuasiSteadyRotationTypeImpl quasiSteadyRotationType = new QuasiSteadyRotationTypeImpl();
		return quasiSteadyRotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadiativeForcingType createRadiativeForcingType() {
		RadiativeForcingTypeImpl radiativeForcingType = new RadiativeForcingTypeImpl();
		return radiativeForcingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurringCostType createRecurringCostType() {
		RecurringCostTypeImpl recurringCostType = new RecurringCostTypeImpl();
		return recurringCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType createRequirementType() {
		RequirementTypeImpl requirementType = new RequirementTypeImpl();
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibCrossingBehaviourType createRibCrossingBehaviourType() {
		RibCrossingBehaviourTypeImpl ribCrossingBehaviourType = new RibCrossingBehaviourTypeImpl();
		return ribCrossingBehaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibCrossingBehaviourType1 createRibCrossingBehaviourType1() {
		RibCrossingBehaviourType1Impl ribCrossingBehaviourType1 = new RibCrossingBehaviourType1Impl();
		return ribCrossingBehaviourType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibIdentificationType createRibIdentificationType() {
		RibIdentificationTypeImpl ribIdentificationType = new RibIdentificationTypeImpl();
		return ribIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibRotationType createRibRotationType() {
		RibRotationTypeImpl ribRotationType = new RibRotationTypeImpl();
		return ribRotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetJointAreaAssemblyPositionType createRivetJointAreaAssemblyPositionType() {
		RivetJointAreaAssemblyPositionTypeImpl rivetJointAreaAssemblyPositionType = new RivetJointAreaAssemblyPositionTypeImpl();
		return rivetJointAreaAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetJointAreasAssemblyType createRivetJointAreasAssemblyType() {
		RivetJointAreasAssemblyTypeImpl rivetJointAreasAssemblyType = new RivetJointAreasAssemblyTypeImpl();
		return rivetJointAreasAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetsType createRivetsType() {
		RivetsTypeImpl rivetsType = new RivetsTypeImpl();
		return rivetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetType createRivetType() {
		RivetTypeImpl rivetType = new RivetTypeImpl();
		return rivetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotationCurveType createRotationCurveType() {
		RotationCurveTypeImpl rotationCurveType = new RotationCurveTypeImpl();
		return rotationCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotDirectionType createRotDirectionType() {
		RotDirectionTypeImpl rotDirectionType = new RotDirectionTypeImpl();
		return rotDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorAirfoilsType createRotorAirfoilsType() {
		RotorAirfoilsTypeImpl rotorAirfoilsType = new RotorAirfoilsTypeImpl();
		return rotorAirfoilsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorBladeAttachmentsType createRotorBladeAttachmentsType() {
		RotorBladeAttachmentsTypeImpl rotorBladeAttachmentsType = new RotorBladeAttachmentsTypeImpl();
		return rotorBladeAttachmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorBladeAttachmentType createRotorBladeAttachmentType() {
		RotorBladeAttachmentTypeImpl rotorBladeAttachmentType = new RotorBladeAttachmentTypeImpl();
		return rotorBladeAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorBladesType createRotorBladesType() {
		RotorBladesTypeImpl rotorBladesType = new RotorBladesTypeImpl();
		return rotorBladesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftAnalysesType createRotorcraftAnalysesType() {
		RotorcraftAnalysesTypeImpl rotorcraftAnalysesType = new RotorcraftAnalysesTypeImpl();
		return rotorcraftAnalysesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftGlobalType createRotorcraftGlobalType() {
		RotorcraftGlobalTypeImpl rotorcraftGlobalType = new RotorcraftGlobalTypeImpl();
		return rotorcraftGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassBreakdownType createRotorcraftMassBreakdownType() {
		RotorcraftMassBreakdownTypeImpl rotorcraftMassBreakdownType = new RotorcraftMassBreakdownTypeImpl();
		return rotorcraftMassBreakdownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassEMType createRotorcraftMassEMType() {
		RotorcraftMassEMTypeImpl rotorcraftMassEMType = new RotorcraftMassEMTypeImpl();
		return rotorcraftMassEMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassGroupLevel1Type createRotorcraftMassGroupLevel1Type() {
		RotorcraftMassGroupLevel1TypeImpl rotorcraftMassGroupLevel1Type = new RotorcraftMassGroupLevel1TypeImpl();
		return rotorcraftMassGroupLevel1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassGroupLevel2Type createRotorcraftMassGroupLevel2Type() {
		RotorcraftMassGroupLevel2TypeImpl rotorcraftMassGroupLevel2Type = new RotorcraftMassGroupLevel2TypeImpl();
		return rotorcraftMassGroupLevel2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassOEMType createRotorcraftMassOEMType() {
		RotorcraftMassOEMTypeImpl rotorcraftMassOEMType = new RotorcraftMassOEMTypeImpl();
		return rotorcraftMassOEMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftModelType createRotorcraftModelType() {
		RotorcraftModelTypeImpl rotorcraftModelType = new RotorcraftModelTypeImpl();
		return rotorcraftModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftType createRotorcraftType() {
		RotorcraftTypeImpl rotorcraftType = new RotorcraftTypeImpl();
		return rotorcraftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorHubHingesType createRotorHubHingesType() {
		RotorHubHingesTypeImpl rotorHubHingesType = new RotorHubHingesTypeImpl();
		return rotorHubHingesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorHubHingeType createRotorHubHingeType() {
		RotorHubHingeTypeImpl rotorHubHingeType = new RotorHubHingeTypeImpl();
		return rotorHubHingeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorHubType createRotorHubType() {
		RotorHubTypeImpl rotorHubType = new RotorHubTypeImpl();
		return rotorHubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorsType createRotorsType() {
		RotorsTypeImpl rotorsType = new RotorsTypeImpl();
		return rotorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorType createRotorType() {
		RotorTypeImpl rotorType = new RotorTypeImpl();
		return rotorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwayILSType createRunwayILSType() {
		RunwayILSTypeImpl runwayILSType = new RunwayILSTypeImpl();
		return runwayILSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwaysType createRunwaysType() {
		RunwaysTypeImpl runwaysType = new RunwaysTypeImpl();
		return runwaysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwayType createRunwayType() {
		RunwayTypeImpl runwayType = new RunwayTypeImpl();
		return runwayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeatModulesType createSeatModulesType() {
		SeatModulesTypeImpl seatModulesType = new SeatModulesTypeImpl();
		return seatModulesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeatModuleType createSeatModuleType() {
		SeatModuleTypeImpl seatModuleType = new SeatModuleTypeImpl();
		return seatModuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionDistributionModeType createSectionDistributionModeType() {
		SectionDistributionModeTypeImpl sectionDistributionModeType = new SectionDistributionModeTypeImpl();
		return sectionDistributionModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentDirectionType createSegmentDirectionType() {
		SegmentDirectionTypeImpl segmentDirectionType = new SegmentDirectionTypeImpl();
		return segmentDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentTypeType createSegmentTypeType() {
		SegmentTypeTypeImpl segmentTypeType = new SegmentTypeTypeImpl();
		return segmentTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaftLinkedComponentsType createShaftLinkedComponentsType() {
		ShaftLinkedComponentsTypeImpl shaftLinkedComponentsType = new ShaftLinkedComponentsTypeImpl();
		return shaftLinkedComponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaftsType createShaftsType() {
		ShaftsTypeImpl shaftsType = new ShaftsTypeImpl();
		return shaftsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaftType createShaftType() {
		ShaftTypeImpl shaftType = new ShaftTypeImpl();
		return shaftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sheet3DType createSheet3DType() {
		Sheet3DTypeImpl sheet3DType = new Sheet3DTypeImpl();
		return sheet3DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetBasedStructuralElementsType createSheetBasedStructuralElementsType() {
		SheetBasedStructuralElementsTypeImpl sheetBasedStructuralElementsType = new SheetBasedStructuralElementsTypeImpl();
		return sheetBasedStructuralElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetBasedStructuralElementType createSheetBasedStructuralElementType() {
		SheetBasedStructuralElementTypeImpl sheetBasedStructuralElementType = new SheetBasedStructuralElementTypeImpl();
		return sheetBasedStructuralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetList3DType createSheetList3DType() {
		SheetList3DTypeImpl sheetList3DType = new SheetList3DTypeImpl();
		return sheetList3DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetListType createSheetListType() {
		SheetListTypeImpl sheetListType = new SheetListTypeImpl();
		return sheetListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetPointsType createSheetPointsType() {
		SheetPointsTypeImpl sheetPointsType = new SheetPointsTypeImpl();
		return sheetPointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetType createSheetType() {
		SheetTypeImpl sheetType = new SheetTypeImpl();
		return sheetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideStrutsType createSideStrutsType() {
		SideStrutsTypeImpl sideStrutsType = new SideStrutsTypeImpl();
		return sideStrutsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideType createSideType() {
		SideTypeImpl sideType = new SideTypeImpl();
		return sideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType createSingleGenericMassType() {
		SingleGenericMassTypeImpl singleGenericMassType = new SingleGenericMassTypeImpl();
		return singleGenericMassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizingTypeType createSizingTypeType() {
		SizingTypeTypeImpl sizingTypeType = new SizingTypeTypeImpl();
		return sizingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkidGearGlobalType createSkidGearGlobalType() {
		SkidGearGlobalTypeImpl skidGearGlobalType = new SkidGearGlobalTypeImpl();
		return skidGearGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkidGearsType createSkidGearsType() {
		SkidGearsTypeImpl skidGearsType = new SkidGearsTypeImpl();
		return skidGearsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkidGearType createSkidGearType() {
		SkidGearTypeImpl skidGearType = new SkidGearTypeImpl();
		return skidGearType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkinSegmentsType createSkinSegmentsType() {
		SkinSegmentsTypeImpl skinSegmentsType = new SkinSegmentsTypeImpl();
		return skinSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkinSegmentType createSkinSegmentType() {
		SkinSegmentTypeImpl skinSegmentType = new SkinSegmentTypeImpl();
		return skinSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkinType createSkinType() {
		SkinTypeImpl skinType = new SkinTypeImpl();
		return skinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCellsType createSparCellsType() {
		SparCellsTypeImpl sparCellsType = new SparCellsTypeImpl();
		return sparCellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCellType createSparCellType() {
		SparCellTypeImpl sparCellType = new SparCellTypeImpl();
		return sparCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCrossSectionType createSparCrossSectionType() {
		SparCrossSectionTypeImpl sparCrossSectionType = new SparCrossSectionTypeImpl();
		return sparCrossSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparPositionsType createSparPositionsType() {
		SparPositionsTypeImpl sparPositionsType = new SparPositionsTypeImpl();
		return sparPositionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparPositionType createSparPositionType() {
		SparPositionTypeImpl sparPositionType = new SparPositionTypeImpl();
		return sparPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparPositionUIDsType createSparPositionUIDsType() {
		SparPositionUIDsTypeImpl sparPositionUIDsType = new SparPositionUIDsTypeImpl();
		return sparPositionUIDsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparSegmentsType createSparSegmentsType() {
		SparSegmentsTypeImpl sparSegmentsType = new SparSegmentsTypeImpl();
		return sparSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparSegmentType createSparSegmentType() {
		SparSegmentTypeImpl sparSegmentType = new SparSegmentTypeImpl();
		return sparSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificHeatMapType createSpecificHeatMapType() {
		SpecificHeatMapTypeImpl specificHeatMapType = new SpecificHeatMapTypeImpl();
		return specificHeatMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPerformanceMapsType createSpecificPerformanceMapsType() {
		SpecificPerformanceMapsTypeImpl specificPerformanceMapsType = new SpecificPerformanceMapsTypeImpl();
		return specificPerformanceMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPerformanceMapType createSpecificPerformanceMapType() {
		SpecificPerformanceMapTypeImpl specificPerformanceMapType = new SpecificPerformanceMapTypeImpl();
		return specificPerformanceMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpoilersType createSpoilersType() {
		SpoilersTypeImpl spoilersType = new SpoilersTypeImpl();
		return spoilersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpoilerType createSpoilerType() {
		SpoilerTypeImpl spoilerType = new SpoilerTypeImpl();
		return spoilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardProfileTypeType createStandardProfileTypeType() {
		StandardProfileTypeTypeImpl standardProfileTypeType = new StandardProfileTypeTypeImpl();
		return standardProfileTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateParametersType createStateParametersType() {
		StateParametersTypeImpl stateParametersType = new StateParametersTypeImpl();
		return stateParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateParameterType createStateParameterType() {
		StateParameterTypeImpl stateParameterType = new StateParameterTypeImpl();
		return stateParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StiffnessType createStiffnessType() {
		StiffnessTypeImpl stiffnessType = new StiffnessTypeImpl();
		return stiffnessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType createStringArrayBaseType() {
		StringArrayBaseTypeImpl stringArrayBaseType = new StringArrayBaseTypeImpl();
		return stringArrayBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType createStringBaseType() {
		StringBaseTypeImpl stringBaseType = new StringBaseTypeImpl();
		return stringBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringerFramePositionType createStringerFramePositionType() {
		StringerFramePositionTypeImpl stringerFramePositionType = new StringerFramePositionTypeImpl();
		return stringerFramePositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringersAssemblyType createStringersAssemblyType() {
		StringersAssemblyTypeImpl stringersAssemblyType = new StringersAssemblyTypeImpl();
		return stringersAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringerType createStringerType() {
		StringerTypeImpl stringerType = new StringerTypeImpl();
		return stringerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType createStringUIDBaseType() {
		StringUIDBaseTypeImpl stringUIDBaseType = new StringUIDBaseTypeImpl();
		return stringUIDBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType createStringVectorBaseType() {
		StringVectorBaseTypeImpl stringVectorBaseType = new StringVectorBaseTypeImpl();
		return stringVectorBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralElementsType createStructuralElementsType() {
		StructuralElementsTypeImpl structuralElementsType = new StructuralElementsTypeImpl();
		return structuralElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralMountType createStructuralMountType() {
		StructuralMountTypeImpl structuralMountType = new StructuralMountTypeImpl();
		return structuralMountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralProfile3DType createStructuralProfile3DType() {
		StructuralProfile3DTypeImpl structuralProfile3DType = new StructuralProfile3DTypeImpl();
		return structuralProfile3DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralProfilesType createStructuralProfilesType() {
		StructuralProfilesTypeImpl structuralProfilesType = new StructuralProfilesTypeImpl();
		return structuralProfilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralProfileType createStructuralProfileType() {
		StructuralProfileTypeImpl structuralProfileType = new StructuralProfileTypeImpl();
		return structuralProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralWallElementsType createStructuralWallElementsType() {
		StructuralWallElementsTypeImpl structuralWallElementsType = new StructuralWallElementsTypeImpl();
		return structuralWallElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralWallElementType createStructuralWallElementType() {
		StructuralWallElementTypeImpl structuralWallElementType = new StructuralWallElementTypeImpl();
		return structuralWallElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType createStrutType() {
		StrutTypeImpl strutType = new StrutTypeImpl();
		return strutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutWithActuatorType createStrutWithActuatorType() {
		StrutWithActuatorTypeImpl strutWithActuatorType = new StrutWithActuatorTypeImpl();
		return strutWithActuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudiesType createStudiesType() {
		StudiesTypeImpl studiesType = new StudiesTypeImpl();
		return studiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubFleetsType createSubFleetsType() {
		SubFleetsTypeImpl subFleetsType = new SubFleetsTypeImpl();
		return subFleetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubFleetType createSubFleetType() {
		SubFleetTypeImpl subFleetType = new SubFleetTypeImpl();
		return subFleetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLoadType createSubLoadType() {
		SubLoadTypeImpl subLoadType = new SubLoadTypeImpl();
		return subLoadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryType3 createSymmetryType3() {
		SymmetryType3Impl symmetryType3 = new SymmetryType3Impl();
		return symmetryType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemsType createSystemsType() {
		SystemsTypeImpl systemsType = new SystemsTypeImpl();
		return systemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TailplaneAttachmentAreaType createTailplaneAttachmentAreaType() {
		TailplaneAttachmentAreaTypeImpl tailplaneAttachmentAreaType = new TailplaneAttachmentAreaTypeImpl();
		return tailplaneAttachmentAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TailplaneAttachmentTypeType createTailplaneAttachmentTypeType() {
		TailplaneAttachmentTypeTypeImpl tailplaneAttachmentTypeType = new TailplaneAttachmentTypeTypeImpl();
		return tailplaneAttachmentTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TakeoffPerformanceParametersType createTakeoffPerformanceParametersType() {
		TakeoffPerformanceParametersTypeImpl takeoffPerformanceParametersType = new TakeoffPerformanceParametersTypeImpl();
		return takeoffPerformanceParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TangentLinksType createTangentLinksType() {
		TangentLinksTypeImpl tangentLinksType = new TangentLinksTypeImpl();
		return tangentLinksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TiedInterfacesType createTiedInterfacesType() {
		TiedInterfacesTypeImpl tiedInterfacesType = new TiedInterfacesTypeImpl();
		return tiedInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TiedInterfaceType createTiedInterfaceType() {
		TiedInterfaceTypeImpl tiedInterfaceType = new TiedInterfaceTypeImpl();
		return tiedInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBaseType createTimeBaseType() {
		TimeBaseTypeImpl timeBaseType = new TimeBaseTypeImpl();
		return timeBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolspecificType createToolspecificType() {
		ToolspecificTypeImpl toolspecificType = new ToolspecificTypeImpl();
		return toolspecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolType createToolType() {
		ToolTypeImpl toolType = new ToolTypeImpl();
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyEntriesType createTopologyEntriesType() {
		TopologyEntriesTypeImpl topologyEntriesType = new TopologyEntriesTypeImpl();
		return topologyEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyEntryType createTopologyEntryType() {
		TopologyEntryTypeImpl topologyEntryType = new TopologyEntryTypeImpl();
		return topologyEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TotalOperatingCostType createTotalOperatingCostType() {
		TotalOperatingCostTypeImpl totalOperatingCostType = new TotalOperatingCostTypeImpl();
		return totalOperatingCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackActuatorType createTrackActuatorType() {
		TrackActuatorTypeImpl trackActuatorType = new TrackActuatorTypeImpl();
		return trackActuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackCarType createTrackCarType() {
		TrackCarTypeImpl trackCarType = new TrackCarTypeImpl();
		return trackCarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackFairingType createTrackFairingType() {
		TrackFairingTypeImpl trackFairingType = new TrackFairingTypeImpl();
		return trackFairingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStructureType createTrackStructureType() {
		TrackStructureTypeImpl trackStructureType = new TrackStructureTypeImpl();
		return trackStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStrut1Type createTrackStrut1Type() {
		TrackStrut1TypeImpl trackStrut1Type = new TrackStrut1TypeImpl();
		return trackStrut1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStrut2Type createTrackStrut2Type() {
		TrackStrut2TypeImpl trackStrut2Type = new TrackStrut2TypeImpl();
		return trackStrut2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSubTypeType createTrackSubTypeType() {
		TrackSubTypeTypeImpl trackSubTypeType = new TrackSubTypeTypeImpl();
		return trackSubTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackTypeType createTrackTypeType() {
		TrackTypeTypeImpl trackTypeType = new TrackTypeTypeImpl();
		return trackTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrailingEdgeDevicesType createTrailingEdgeDevicesType() {
		TrailingEdgeDevicesTypeImpl trailingEdgeDevicesType = new TrailingEdgeDevicesTypeImpl();
		return trailingEdgeDevicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrailingEdgeDeviceType createTrailingEdgeDeviceType() {
		TrailingEdgeDeviceTypeImpl trailingEdgeDeviceType = new TrailingEdgeDeviceTypeImpl();
		return trailingEdgeDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrajectoriesType createTrajectoriesType() {
		TrajectoriesTypeImpl trajectoriesType = new TrajectoriesTypeImpl();
		return trajectoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrajectoryGlobalType createTrajectoryGlobalType() {
		TrajectoryGlobalTypeImpl trajectoryGlobalType = new TrajectoryGlobalTypeImpl();
		return trajectoryGlobalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrajectoryType createTrajectoryType() {
		TrajectoryTypeImpl trajectoryType = new TrajectoryTypeImpl();
		return trajectoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transformation2DType createTransformation2DType() {
		Transformation2DTypeImpl transformation2DType = new Transformation2DTypeImpl();
		return transformation2DType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType createTransformationType() {
		TransformationTypeImpl transformationType = new TransformationTypeImpl();
		return transformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionGearRatioType createTransmissionGearRatioType() {
		TransmissionGearRatioTypeImpl transmissionGearRatioType = new TransmissionGearRatioTypeImpl();
		return transmissionGearRatioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftInputsType createTransmissionShaftInputsType() {
		TransmissionShaftInputsTypeImpl transmissionShaftInputsType = new TransmissionShaftInputsTypeImpl();
		return transmissionShaftInputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftInputType createTransmissionShaftInputType() {
		TransmissionShaftInputTypeImpl transmissionShaftInputType = new TransmissionShaftInputTypeImpl();
		return transmissionShaftInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftOutputsType createTransmissionShaftOutputsType() {
		TransmissionShaftOutputsTypeImpl transmissionShaftOutputsType = new TransmissionShaftOutputsTypeImpl();
		return transmissionShaftOutputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionShaftOutputType createTransmissionShaftOutputType() {
		TransmissionShaftOutputTypeImpl transmissionShaftOutputType = new TransmissionShaftOutputTypeImpl();
		return transmissionShaftOutputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionsType createTransmissionsType() {
		TransmissionsTypeImpl transmissionsType = new TransmissionsTypeImpl();
		return transmissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionType createTransmissionType() {
		TransmissionTypeImpl transmissionType = new TransmissionTypeImpl();
		return transmissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrimParametersType createTrimParametersType() {
		TrimParametersTypeImpl trimParametersType = new TrimParametersTypeImpl();
		return trimParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfPointPerformanceType createTypeOfPointPerformanceType() {
		TypeOfPointPerformanceTypeImpl typeOfPointPerformanceType = new TypeOfPointPerformanceTypeImpl();
		return typeOfPointPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType1 createTypeType1() {
		TypeType1Impl typeType1 = new TypeType1Impl();
		return typeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 createTypeType2() {
		TypeType2Impl typeType2 = new TypeType2Impl();
		return typeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType5 createTypeType5() {
		TypeType5Impl typeType5 = new TypeType5Impl();
		return typeType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType6 createTypeType6() {
		TypeType6Impl typeType6 = new TypeType6Impl();
		return typeType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType7 createTypeType7() {
		TypeType7Impl typeType7 = new TypeType7Impl();
		return typeType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDGroupDefinitionsType createUIDGroupDefinitionsType() {
		UIDGroupDefinitionsTypeImpl uidGroupDefinitionsType = new UIDGroupDefinitionsTypeImpl();
		return uidGroupDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDGroupDefinitionType createUIDGroupDefinitionType() {
		UIDGroupDefinitionTypeImpl uidGroupDefinitionType = new UIDGroupDefinitionTypeImpl();
		return uidGroupDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatesType createUpdatesType() {
		UpdatesTypeImpl updatesType = new UpdatesTypeImpl();
		return updatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperLinksType createUpperLinksType() {
		UpperLinksTypeImpl upperLinksType = new UpperLinksTypeImpl();
		return upperLinksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableSegmentsType createVariableSegmentsType() {
		VariableSegmentsTypeImpl variableSegmentsType = new VariableSegmentsTypeImpl();
		return variableSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableSegmentType createVariableSegmentType() {
		VariableSegmentTypeImpl variableSegmentType = new VariableSegmentTypeImpl();
		return variableSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehiclesType createVehiclesType() {
		VehiclesTypeImpl vehiclesType = new VehiclesTypeImpl();
		return vehiclesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VtpFrameDefType createVtpFrameDefType() {
		VtpFrameDefTypeImpl vtpFrameDefType = new VtpFrameDefTypeImpl();
		return vtpFrameDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VtpInterfaceDefType createVtpInterfaceDefType() {
		VtpInterfaceDefTypeImpl vtpInterfaceDefType = new VtpInterfaceDefTypeImpl();
		return vtpInterfaceDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallPositionsType createWallPositionsType() {
		WallPositionsTypeImpl wallPositionsType = new WallPositionsTypeImpl();
		return wallPositionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallPositionType createWallPositionType() {
		WallPositionTypeImpl wallPositionType = new WallPositionTypeImpl();
		return wallPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallPositionUIDsType createWallPositionUIDsType() {
		WallPositionUIDsTypeImpl wallPositionUIDsType = new WallPositionUIDsTypeImpl();
		return wallPositionUIDsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallSegmentsType createWallSegmentsType() {
		WallSegmentsTypeImpl wallSegmentsType = new WallSegmentsTypeImpl();
		return wallSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallSegmentType createWallSegmentType() {
		WallSegmentTypeImpl wallSegmentType = new WallSegmentTypeImpl();
		return wallSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WallsType createWallsType() {
		WallsTypeImpl wallsType = new WallsTypeImpl();
		return wallsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WayPointTypeType createWayPointTypeType() {
		WayPointTypeTypeImpl wayPointTypeType = new WayPointTypeTypeImpl();
		return wayPointTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebType createWebType() {
		WebTypeImpl webType = new WebTypeImpl();
		return webType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceCaseType createWeightAndBalanceCaseType() {
		WeightAndBalanceCaseTypeImpl weightAndBalanceCaseType = new WeightAndBalanceCaseTypeImpl();
		return weightAndBalanceCaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceFuelInTanksType createWeightAndBalanceFuelInTanksType() {
		WeightAndBalanceFuelInTanksTypeImpl weightAndBalanceFuelInTanksType = new WeightAndBalanceFuelInTanksTypeImpl();
		return weightAndBalanceFuelInTanksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceFuelInTankType createWeightAndBalanceFuelInTankType() {
		WeightAndBalanceFuelInTankTypeImpl weightAndBalanceFuelInTankType = new WeightAndBalanceFuelInTankTypeImpl();
		return weightAndBalanceFuelInTankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceFuelType createWeightAndBalanceFuelType() {
		WeightAndBalanceFuelTypeImpl weightAndBalanceFuelType = new WeightAndBalanceFuelTypeImpl();
		return weightAndBalanceFuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalancemCargosType createWeightAndBalancemCargosType() {
		WeightAndBalancemCargosTypeImpl weightAndBalancemCargosType = new WeightAndBalancemCargosTypeImpl();
		return weightAndBalancemCargosType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalancemPaxxType createWeightAndBalancemPaxxType() {
		WeightAndBalancemPaxxTypeImpl weightAndBalancemPaxxType = new WeightAndBalancemPaxxTypeImpl();
		return weightAndBalancemPaxxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalancePayloadType createWeightAndBalancePayloadType() {
		WeightAndBalancePayloadTypeImpl weightAndBalancePayloadType = new WeightAndBalancePayloadTypeImpl();
		return weightAndBalancePayloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightAndBalanceType createWeightAndBalanceType() {
		WeightAndBalanceTypeImpl weightAndBalanceType = new WeightAndBalanceTypeImpl();
		return weightAndBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WheelsType createWheelsType() {
		WheelsTypeImpl wheelsType = new WheelsTypeImpl();
		return wheelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WheelType createWheelType() {
		WheelTypeImpl wheelType = new WheelTypeImpl();
		return wheelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowAssemblyPositionType createWindowAssemblyPositionType() {
		WindowAssemblyPositionTypeImpl windowAssemblyPositionType = new WindowAssemblyPositionTypeImpl();
		return windowAssemblyPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsAssemblyType createWindowsAssemblyType() {
		WindowsAssemblyTypeImpl windowsAssemblyType = new WindowsAssemblyTypeImpl();
		return windowsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsType createWindowsType() {
		WindowsTypeImpl windowsType = new WindowsTypeImpl();
		return windowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingAeroPerformanceType createWingAeroPerformanceType() {
		WingAeroPerformanceTypeImpl wingAeroPerformanceType = new WingAeroPerformanceTypeImpl();
		return wingAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingAirfoilsType createWingAirfoilsType() {
		WingAirfoilsTypeImpl wingAirfoilsType = new WingAirfoilsTypeImpl();
		return wingAirfoilsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingCellsType createWingCellsType() {
		WingCellsTypeImpl wingCellsType = new WingCellsTypeImpl();
		return wingCellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingCellType createWingCellType() {
		WingCellTypeImpl wingCellType = new WingCellTypeImpl();
		return wingCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingCoefficientsType createWingCoefficientsType() {
		WingCoefficientsTypeImpl wingCoefficientsType = new WingCoefficientsTypeImpl();
		return wingCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingComponentSegmentStructureType createWingComponentSegmentStructureType() {
		WingComponentSegmentStructureTypeImpl wingComponentSegmentStructureType = new WingComponentSegmentStructureTypeImpl();
		return wingComponentSegmentStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingElementsType createWingElementsType() {
		WingElementsTypeImpl wingElementsType = new WingElementsTypeImpl();
		return wingElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingElementType createWingElementType() {
		WingElementTypeImpl wingElementType = new WingElementTypeImpl();
		return wingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTankBorderType createWingFuelTankBorderType() {
		WingFuelTankBorderTypeImpl wingFuelTankBorderType = new WingFuelTankBorderTypeImpl();
		return wingFuelTankBorderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTankGeometryType createWingFuelTankGeometryType() {
		WingFuelTankGeometryTypeImpl wingFuelTankGeometryType = new WingFuelTankGeometryTypeImpl();
		return wingFuelTankGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTanksType createWingFuelTanksType() {
		WingFuelTanksTypeImpl wingFuelTanksType = new WingFuelTanksTypeImpl();
		return wingFuelTanksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTankType createWingFuelTankType() {
		WingFuelTankTypeImpl wingFuelTankType = new WingFuelTankTypeImpl();
		return wingFuelTankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuselageAttachmentsType createWingFuselageAttachmentsType() {
		WingFuselageAttachmentsTypeImpl wingFuselageAttachmentsType = new WingFuselageAttachmentsTypeImpl();
		return wingFuselageAttachmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuselageAttachmentType createWingFuselageAttachmentType() {
		WingFuselageAttachmentTypeImpl wingFuselageAttachmentType = new WingFuselageAttachmentTypeImpl();
		return wingFuselageAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceDefinitionsType createWingInterfaceDefinitionsType() {
		WingInterfaceDefinitionsTypeImpl wingInterfaceDefinitionsType = new WingInterfaceDefinitionsTypeImpl();
		return wingInterfaceDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceMainFramesType createWingInterfaceMainFramesType() {
		WingInterfaceMainFramesTypeImpl wingInterfaceMainFramesType = new WingInterfaceMainFramesTypeImpl();
		return wingInterfaceMainFramesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceSupportStrutsAssemblyType createWingInterfaceSupportStrutsAssemblyType() {
		WingInterfaceSupportStrutsAssemblyTypeImpl wingInterfaceSupportStrutsAssemblyType = new WingInterfaceSupportStrutsAssemblyTypeImpl();
		return wingInterfaceSupportStrutsAssemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceSupportStrutType createWingInterfaceSupportStrutType() {
		WingInterfaceSupportStrutTypeImpl wingInterfaceSupportStrutType = new WingInterfaceSupportStrutTypeImpl();
		return wingInterfaceSupportStrutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingIntermediateStructureCellsType createWingIntermediateStructureCellsType() {
		WingIntermediateStructureCellsTypeImpl wingIntermediateStructureCellsType = new WingIntermediateStructureCellsTypeImpl();
		return wingIntermediateStructureCellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingIntermediateStructureCellType createWingIntermediateStructureCellType() {
		WingIntermediateStructureCellTypeImpl wingIntermediateStructureCellType = new WingIntermediateStructureCellTypeImpl();
		return wingIntermediateStructureCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibCellType createWingRibCellType() {
		WingRibCellTypeImpl wingRibCellType = new WingRibCellTypeImpl();
		return wingRibCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibCrossSectionType createWingRibCrossSectionType() {
		WingRibCrossSectionTypeImpl wingRibCrossSectionType = new WingRibCrossSectionTypeImpl();
		return wingRibCrossSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibExplicitPositioningType createWingRibExplicitPositioningType() {
		WingRibExplicitPositioningTypeImpl wingRibExplicitPositioningType = new WingRibExplicitPositioningTypeImpl();
		return wingRibExplicitPositioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibPointType createWingRibPointType() {
		WingRibPointTypeImpl wingRibPointType = new WingRibPointTypeImpl();
		return wingRibPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibsDefinitionsType createWingRibsDefinitionsType() {
		WingRibsDefinitionsTypeImpl wingRibsDefinitionsType = new WingRibsDefinitionsTypeImpl();
		return wingRibsDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibsDefinitionType createWingRibsDefinitionType() {
		WingRibsDefinitionTypeImpl wingRibsDefinitionType = new WingRibsDefinitionTypeImpl();
		return wingRibsDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibsPositioningType createWingRibsPositioningType() {
		WingRibsPositioningTypeImpl wingRibsPositioningType = new WingRibsPositioningTypeImpl();
		return wingRibsPositioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsAeroPerformanceType createWingsAeroPerformanceType() {
		WingsAeroPerformanceTypeImpl wingsAeroPerformanceType = new WingsAeroPerformanceTypeImpl();
		return wingsAeroPerformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsCoefficientsType createWingsCoefficientsType() {
		WingsCoefficientsTypeImpl wingsCoefficientsType = new WingsCoefficientsTypeImpl();
		return wingsCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSectionsType createWingSectionsType() {
		WingSectionsTypeImpl wingSectionsType = new WingSectionsTypeImpl();
		return wingSectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSectionType createWingSectionType() {
		WingSectionTypeImpl wingSectionType = new WingSectionTypeImpl();
		return wingSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentCoefficientsType createWingSegmentCoefficientsType() {
		WingSegmentCoefficientsTypeImpl wingSegmentCoefficientsType = new WingSegmentCoefficientsTypeImpl();
		return wingSegmentCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentsCoefficientsType createWingSegmentsCoefficientsType() {
		WingSegmentsCoefficientsTypeImpl wingSegmentsCoefficientsType = new WingSegmentsCoefficientsTypeImpl();
		return wingSegmentsCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentStripCoefficientsType createWingSegmentStripCoefficientsType() {
		WingSegmentStripCoefficientsTypeImpl wingSegmentStripCoefficientsType = new WingSegmentStripCoefficientsTypeImpl();
		return wingSegmentStripCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentsType createWingSegmentsType() {
		WingSegmentsTypeImpl wingSegmentsType = new WingSegmentsTypeImpl();
		return wingSegmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSegmentType createWingSegmentType() {
		WingSegmentTypeImpl wingSegmentType = new WingSegmentTypeImpl();
		return wingSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingShellType createWingShellType() {
		WingShellTypeImpl wingShellType = new WingShellTypeImpl();
		return wingShellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSkinType createWingSkinType() {
		WingSkinTypeImpl wingSkinType = new WingSkinTypeImpl();
		return wingSkinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSparType createWingSparType() {
		WingSparTypeImpl wingSparType = new WingSparTypeImpl();
		return wingSparType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStringerType createWingStringerType() {
		WingStringerTypeImpl wingStringerType = new WingStringerTypeImpl();
		return wingStringerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStructuralMountsType createWingStructuralMountsType() {
		WingStructuralMountsTypeImpl wingStructuralMountsType = new WingStructuralMountsTypeImpl();
		return wingStructuralMountsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsType createWingsType() {
		WingsTypeImpl wingsType = new WingsTypeImpl();
		return wingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingType createWingType() {
		WingTypeImpl wingType = new WingTypeImpl();
		return wingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentElementsType createWingWingAttachmentElementsType() {
		WingWingAttachmentElementsTypeImpl wingWingAttachmentElementsType = new WingWingAttachmentElementsTypeImpl();
		return wingWingAttachmentElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentSparsType createWingWingAttachmentSparsType() {
		WingWingAttachmentSparsTypeImpl wingWingAttachmentSparsType = new WingWingAttachmentSparsTypeImpl();
		return wingWingAttachmentSparsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentsSparsType createWingWingAttachmentsSparsType() {
		WingWingAttachmentsSparsTypeImpl wingWingAttachmentsSparsType = new WingWingAttachmentsSparsTypeImpl();
		return wingWingAttachmentsSparsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentsType createWingWingAttachmentsType() {
		WingWingAttachmentsTypeImpl wingWingAttachmentsType = new WingWingAttachmentsTypeImpl();
		return wingWingAttachmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingWingAttachmentType createWingWingAttachmentType() {
		WingWingAttachmentTypeImpl wingWingAttachmentType = new WingWingAttachmentTypeImpl();
		return wingWingAttachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType createXsiIsoLineType() {
		XsiIsoLineTypeImpl xsiIsoLineType = new XsiIsoLineTypeImpl();
		return xsiIsoLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZCouplingsType createZCouplingsType() {
		ZCouplingsTypeImpl zCouplingsType = new ZCouplingsTypeImpl();
		return zCouplingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZCouplingType createZCouplingType() {
		ZCouplingTypeImpl zCouplingType = new ZCouplingTypeImpl();
		return zCouplingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsVersionType createCpacsVersionTypeFromString(EDataType eDataType, String initialValue) {
		CpacsVersionType result = CpacsVersionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCpacsVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricBaseTypeType createGeometricBaseTypeTypeFromString(EDataType eDataType, String initialValue) {
		GeometricBaseTypeType result = GeometricBaseTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometricBaseTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType createPlacementTypeFromString(EDataType eDataType, String initialValue) {
		PlacementType result = PlacementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTypeType createRefTypeTypeFromString(EDataType eDataType, String initialValue) {
		RefTypeType result = RefTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorType createRelationalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		RelationalOperatorType result = RelationalOperatorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeFromString(EDataType eDataType, String initialValue) {
		SymmetryType result = SymmetryType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType1 createSymmetryType1FromString(EDataType eDataType, String initialValue) {
		SymmetryType1 result = SymmetryType1.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType2 createSymmetryType2FromString(EDataType eDataType, String initialValue) {
		SymmetryType2 result = SymmetryType2.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType4 createSymmetryType4FromString(EDataType eDataType, String initialValue) {
		SymmetryType4 result = SymmetryType4.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType5 createSymmetryType5FromString(EDataType eDataType, String initialValue) {
		SymmetryType5 result = SymmetryType5.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType6 createSymmetryType6FromString(EDataType eDataType, String initialValue) {
		SymmetryType6 result = SymmetryType6.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType7 createSymmetryType7FromString(EDataType eDataType, String initialValue) {
		SymmetryType7 result = SymmetryType7.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType8 createSymmetryType8FromString(EDataType eDataType, String initialValue) {
		SymmetryType8 result = SymmetryType8.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType9 createSymmetryType9FromString(EDataType eDataType, String initialValue) {
		SymmetryType9 result = SymmetryType9.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType10 createSymmetryType10FromString(EDataType eDataType, String initialValue) {
		SymmetryType10 result = SymmetryType10.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType11 createSymmetryType11FromString(EDataType eDataType, String initialValue) {
		SymmetryType11 result = SymmetryType11.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType12 createSymmetryType12FromString(EDataType eDataType, String initialValue) {
		SymmetryType12 result = SymmetryType12.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType13 createSymmetryType13FromString(EDataType eDataType, String initialValue) {
		SymmetryType13 result = SymmetryType13.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType13ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType14 createSymmetryType14FromString(EDataType eDataType, String initialValue) {
		SymmetryType14 result = SymmetryType14.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryType14ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeType3FromString(EDataType eDataType, String initialValue) {
		TypeType3 result = TypeType3.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeType4FromString(EDataType eDataType, String initialValue) {
		TypeType4 result = TypeType4.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFunctionType createUncertaintyFunctionTypeFromString(EDataType eDataType, String initialValue) {
		UncertaintyFunctionType result = UncertaintyFunctionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUncertaintyFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpacsVersionType createCpacsVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCpacsVersionTypeFromString(CpacsPackage.eINSTANCE.getCpacsVersionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCpacsVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCpacsVersionTypeToString(CpacsPackage.eINSTANCE.getCpacsVersionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(CpacsPackage.eINSTANCE.getFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(CpacsPackage.eINSTANCE.getFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricBaseTypeType createGeometricBaseTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGeometricBaseTypeTypeFromString(CpacsPackage.eINSTANCE.getGeometricBaseTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometricBaseTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeometricBaseTypeTypeToString(CpacsPackage.eINSTANCE.getGeometricBaseTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType createPlacementTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPlacementTypeFromString(CpacsPackage.eINSTANCE.getPlacementType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlacementTypeToString(CpacsPackage.eINSTANCE.getPlacementType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTypeType createRefTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRefTypeTypeFromString(CpacsPackage.eINSTANCE.getRefTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRefTypeTypeToString(CpacsPackage.eINSTANCE.getRefTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorType createRelationalOperatorTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createRelationalOperatorTypeFromString(CpacsPackage.eINSTANCE.getRelationalOperatorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationalOperatorTypeToString(CpacsPackage.eINSTANCE.getRelationalOperatorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType2 createSymmetryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetryType2FromString(CpacsPackage.eINSTANCE.getSymmetryType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType2ToString(CpacsPackage.eINSTANCE.getSymmetryType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSymmetryTypeFromString(CpacsPackage.eINSTANCE.getSymmetryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryTypeToString(CpacsPackage.eINSTANCE.getSymmetryType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType4 createSymmetryTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType4FromString(CpacsPackage.eINSTANCE.getSymmetryType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType4ToString(CpacsPackage.eINSTANCE.getSymmetryType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType6 createSymmetryTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType6FromString(CpacsPackage.eINSTANCE.getSymmetryType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType6ToString(CpacsPackage.eINSTANCE.getSymmetryType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType5 createSymmetryTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType5FromString(CpacsPackage.eINSTANCE.getSymmetryType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType5ToString(CpacsPackage.eINSTANCE.getSymmetryType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType9 createSymmetryTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType9FromString(CpacsPackage.eINSTANCE.getSymmetryType9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType9ToString(CpacsPackage.eINSTANCE.getSymmetryType9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType10 createSymmetryTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType10FromString(CpacsPackage.eINSTANCE.getSymmetryType10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType10ToString(CpacsPackage.eINSTANCE.getSymmetryType10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType13 createSymmetryTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType13FromString(CpacsPackage.eINSTANCE.getSymmetryType13(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType13ToString(CpacsPackage.eINSTANCE.getSymmetryType13(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType12 createSymmetryTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType12FromString(CpacsPackage.eINSTANCE.getSymmetryType12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType12ToString(CpacsPackage.eINSTANCE.getSymmetryType12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType8 createSymmetryTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType8FromString(CpacsPackage.eINSTANCE.getSymmetryType8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType8ToString(CpacsPackage.eINSTANCE.getSymmetryType8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType7 createSymmetryTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType7FromString(CpacsPackage.eINSTANCE.getSymmetryType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType7ToString(CpacsPackage.eINSTANCE.getSymmetryType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType11 createSymmetryTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType11FromString(CpacsPackage.eINSTANCE.getSymmetryType11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType11ToString(CpacsPackage.eINSTANCE.getSymmetryType11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType1 createSymmetryTypeObject12FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType1FromString(CpacsPackage.eINSTANCE.getSymmetryType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject12ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType1ToString(CpacsPackage.eINSTANCE.getSymmetryType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType14 createSymmetryTypeObject13FromString(EDataType eDataType, String initialValue) {
		return createSymmetryType14FromString(CpacsPackage.eINSTANCE.getSymmetryType14(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObject13ToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryType14ToString(CpacsPackage.eINSTANCE.getSymmetryType14(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType4FromString(CpacsPackage.eINSTANCE.getTypeType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType4ToString(CpacsPackage.eINSTANCE.getTypeType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType3FromString(CpacsPackage.eINSTANCE.getTypeType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType3ToString(CpacsPackage.eINSTANCE.getTypeType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(CpacsPackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(CpacsPackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFunctionType createUncertaintyFunctionTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createUncertaintyFunctionTypeFromString(CpacsPackage.eINSTANCE.getUncertaintyFunctionType(),
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUncertaintyFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUncertaintyFunctionTypeToString(CpacsPackage.eINSTANCE.getUncertaintyFunctionType(),
				instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpacsPackage getCpacsPackage() {
		return (CpacsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpacsPackage getPackage() {
		return CpacsPackage.eINSTANCE;
	}

} //CpacsFactoryImpl
