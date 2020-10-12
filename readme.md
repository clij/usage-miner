# CLIJx Usage Analyser
Future [CLIJ](https://clij.github.io) will come with an [expert system](https://en.wikipedia.org/wiki/Expert_system) 
facilitating design of GPU-accelerated image analysis workflows. The underlying knowledge base will be built up by 
community contributions.

In order to allow extract usage statistics from CLIJ users without collecting the workflows they actually applied, we 
set up this Fiji plugin, which parses a folder of ImageJ CLIJ Macros and extracts usage stagistics from those scripts. 
For example, if a script contains a workflow applying thresholding and connected component labeling subsequently, 
the connection between these operations will be extracted and can be submitted to the CLIJ developers without submitting 
the script itself.

## How to extract usage statistics
Download and install [Fiji](https://fiji.sc/), install [CLIJ](https://clij.github.io/installation) and the [usage-miner plugin]() by downloading the jar file and putting it in the /plugins/ directory of your Fiji.
Start Fiji, and execute the menu `Plugins > ImageJ on GPU (CLIJx) > Options > CLIJ Usage Miner`. Please select a folder
of imagej macros which use CLIJ. Such a file will open up:
 
![Image](images/screenshot.png)

Please submit this file via email to rhaase@mpi-cbg.de. By submitting the file you agree that this file may become part of future CLIJ 
releases shared under this [BSD3](https://github.com/clij/clij2/blob/master/license.txt) license. 
In exchange you will find your name in the list of contributors in the acknowledgements section of the [website](https://clij.github.io/) and the 
CLIJ expert system related publication. 
If you want your affiliation to be mentioned correctly, please specify it in the email.

Thanks for your contribution!

[Imprint](https://clij.github.io/imprint)
