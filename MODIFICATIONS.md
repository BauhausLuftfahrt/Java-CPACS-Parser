# Modifications to CPACS

This list contains the changes to the CPACS structure of the Java model compared to the raw .xsd file implementation. 

## Cabin

### CabGeometry

* Removed the y string array
* Introduction of yZ1, yZ2, yZ3, yZ4 and yZ5 as used in the CPACS format. The definition of the .xsd file is flawed at this point. The issue will be dealt with during the introduction of the reworked cabin node of the CPACS schema. See CPACS GitHub issue for more information [here](https://github.com/DLR-SL/CPACS/issues/674).



