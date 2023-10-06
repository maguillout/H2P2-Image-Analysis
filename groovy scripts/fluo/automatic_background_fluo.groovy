// Fluorescence channels settings
setImageType('FLUORESCENCE');

// Image data
def imageData = getCurrentImageData()
def img_name = GeneralTools.getNameWithoutExtension(imageData.getServer().getMetadata().getName())
def server = getCurrentServer()
def cal = server.getPixelCalibration()
double pixelWidth = cal.getPixelWidthMicrons()
double pixelHeight = cal.getPixelHeightMicrons()
boolean create_annot = false

// Automatic segmentation of positive and negative areas (background)
resetSelection();
createAnnotationsFromPixelClassifier("positive_area", 100.0, 100.0)
positive_zone = getAnnotationObjects().findAll{it.getPathClass() == getPathClass("Positive")};
positive_area = getAnnotationObjects()[0].getROI().getScaledArea(pixelWidth, pixelHeight)