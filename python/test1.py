__author__ = 'Ekta'
import csv
import gzip

# Returns true if the specified filename is a valid gzip'd CSV file
# If the optional 'columns' parameter is specified, also check that
# the first row has that many columns
def is_valid(filename, columns=None):

    try:

        # Chain a CSV reader onto a gzip reader
        csv_file = csv.reader(gzip.open(filename))

        # This will try to read the first line
        # If it's not a valid gzip, this will raise IOError
        for row in csv_file:

            # We got at least one row
            # Bail out here if we don't care how many columns we have
            if columns is None:
                return True

            # Check it has the right number of columns
            return len(row) == columns

        else:

            # There were no rows
            return False

    except IOError:

        # This is not a valid gzip file
        return False


# Example to check whether File.txt.gz is valid
result = is_valid('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File.txt.gz')
print(result)
# Example to check whether File.txt.gz is valid, and has three columns
result = is_valid('C:\Users\sss\Documents\Python Scripts\pydata-book-master\ch06\File.txt.gz', columns=3)
print(result)