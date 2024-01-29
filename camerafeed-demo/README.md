# camerafeed-demo

This is only for recording and viewing the footage from Furhat

 1. Install Python3.8 and pip3, and make sure they are accessible from the command line. Other lower python versions may work, but the requirements don't match 3.9 and higher.

 2. Install the python requirements (preferably in a virtual env.)

    `pip install .`
    
 3. Run 
 
     `python object-detection-server/furhattube.py  <Furhat IP address or hostname>`
     
 4. Press ESC to stop.
     
 5. It will write 2 files: `output-bare.mp4` and `output.mp4` with
    face and emotion blocks.


