__author__ = 'Ekta'
import struct

def getuncompressedsize(filename):
    with open(filename, 'rb') as f:
        f.seek(-4, 2)
        return struct.unpack('I', f.read(4))[0]


print(getuncompressedsize('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File.txt.gz'))