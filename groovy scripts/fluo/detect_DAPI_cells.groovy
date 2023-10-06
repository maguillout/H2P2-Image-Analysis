// detect DAPI cells, then class them as DAPI detections
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage":"DAPI","requestedPixelSizeMicrons":0.5,"backgroundRadiusMicrons":8.0,"backgroundByReconstruction":true,"medianRadiusMicrons":0.0,"sigmaMicrons":1.5,"minAreaMicrons":10.0,"maxAreaMicrons":400.0,"threshold":25.0,"watershedPostProcess":true,"cellExpansionMicrons":0.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true}')
runObjectClassifier("DAPI_classifier");
