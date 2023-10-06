// Automatic segmentation of positive and negative areas (background)
setImageType('FLUORESCENCE');
resetSelection();
createAnnotationsFromPixelClassifier("select_interest_area", 100.0, 100.0)
