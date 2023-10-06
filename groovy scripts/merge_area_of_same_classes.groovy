// Merge splitted positive and negative areas
selectObjectsByClassification("Positive")
mergeSelectedAnnotations()
print("all positive areas merged")
selectObjectsByClassification("Negative")
mergeSelectedAnnotations()
print("all negative areas merged")