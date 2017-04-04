__author__ = 'Ekta'

from pandas import Series, DataFrame
import pandas as pd
import struct
import gc

# from guppy import hpy
# h = hpy()
# print h.heap()

print('Hello')


#chunker = pd.read_csv('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\ex6_mod.csv', chunksize=1000000)
#df = pd.read_csv('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz')
'''
pd.read_csv('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz', compression='gzip',
            names={'a', 'b', 'c'}, usecols={'a', 'b'})
'''

def getuncompressedsize(filename):
    with open(filename, 'rb') as f:
        f.seek(-4, 2)
        return struct.unpack('I', f.read(4))[0]


#print(getuncompressedsize('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz'))
i = getuncompressedsize('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz')

if not (i==0):
    pd.read_csv('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File1.txt.gz', compression='gzip',
            names={'a', 'b', 'c'}, header=0)
    print('file not empty')
else:
    print('file empty')

'''
tot = Series([])
for piece in chunker:
    # tot = tot.add(piece['key'].value_counts(), fill_value=0)
    gc.collect()
    pass

tot = tot.order(ascending=False)
'''