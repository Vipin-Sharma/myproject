__author__ = 'Ekta'
import pandas as pd
import struct
import gzip

def getuncompressedsize(filename):
    with open(filename, 'rb') as f:
        f.seek(-4, 2)
        return struct.unpack('I', f.read(4))[0]

def gz_size(fname):
    f = gzip.open(fname, 'rb')
    data = f.read()
    f.close()
    return len(data)

i = getuncompressedsize('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File.txt.gz')

if not (i==0):
    pd.read_csv('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File.txt.gz', compression='gzip', names={'a', 'b', 'c'}, header=False)
    print('file not empty')
else:
    print('file empty')
print(gz_size('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz'))