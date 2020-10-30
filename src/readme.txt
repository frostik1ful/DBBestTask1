This application is written using java, spring boot, spring date, javafx,
When you select scv files with pipe data and point data,
all data is parsing into pipe and point objects and saving them to the database,
after that, passing through the list of points
application finds all pipes with starting points equal to the starting point from the point file,
each pipe found goes into a recursive function that searches for all possible paths to the desired point,
if such a path is found, it adds to the list of answers along with the sum of the lengths of the searched pipes,
if the list already contains an answer by this index the length of the path is compared,
and if the new value is less than it is sets to the list of answers by same index,
the list of answers is displayed in the javafx window.