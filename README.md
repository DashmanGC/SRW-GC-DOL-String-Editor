Super Robot Wars GC DOL String Editor by Dashman
--------------------------------------------------

How to use this:
------------------

1) Go to "File -> Import strings from DOL file" and browse for Start.dol.
2) Translate the text in each category.
3) After editing what you wanted, go to "File -> Override DOL pointers" and browse for Start.dol.
	* This overwrites Start.dol, so make sure you have a backup somewhere.
4) Go to "File -> Export strings to BIN file". This creates a BIN file of your choice with all the text that is currently loaded in the editor (translated or not). 
	* You can open this file later with "File -> Import strings from BIN file". That way you can save your progress and continue whenever you want.
5) Open the BIN file you generated with MadEdit and copy its contents (CTRL+A, then CTRL+C). Then open the file pilotinfo.bin with MadEdit and paste those contents at the end of the file.
	* The program assumes that you already pasted the two extra font files at the end of pilotinfo.bin before pasting the contents of the BIN file.
6) Rebuild the ISO using GC Rebuilder with the new Start.dol and pilotinfo.bin.



Notes:
------------------

* The "Starting Offset" on the top-right of the window is the address in memory where the injected BIN file is expected to appear. This number assumes that the font files have been injected (pasted at the end of pilotinfo.bin) before your BIN file.

If you only put the bin file and no font files, the offset would be 809d1460. The default value is 809d1460 + the size in bytes of the font files.

* Under category "Staff", entry 175 has a character (the third one) that can't be displayed (appears as a little square or an interrogation sign if you saved the file and reloaded it). That's because it's stored with a non-standard SJIS code (0xeb40). Looking at the character in the font, it's very similar to the one with value 0x97b2. The name would be íáìcÅ@ó≤éi, which Google Translate says is "Takashi Nakata".


