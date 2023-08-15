Ava Fritz
08/07/2023

For Assignment 10, I've created readReformat.java which contains two "programs."
The main program takes in a file path, destination file path, and file length.
It converts the file path to a reformatted version and stores it in the destination file path, then calls the outputReformat program.
outputReformat takes in the destination file path and new file length. It outputs the contents to the user.

To run this program, please follow this format:

java readReformat filePath destPath fileLength

where:
1. filePath is a String of the path to the file of interest (ex: filePath = "C:\\Users\\avafr\\repos\\introtojava\\Module10\\Hw10\\SmallAreaIncomePovertyEstData.txt")
2. destPath is a String of the desired path to the output file (ex: destPath = "C:\\Users\\avafr\\repos\\introtojava\\Module10\\Hw10\\results.txt")
3. fileLength is an Int of the number of lines in the file of interest (ex: fileLength = 13486)

Example:

java readReformat "C:\\Users\\avafr\\repos\\introtojava\\Module10\\Hw10\\SmallAreaIncomePovertyEstData.txt" "C:\\Users\\avafr\\repos\\introtojava\\Module10\\Hw10\\results.txt" 13486