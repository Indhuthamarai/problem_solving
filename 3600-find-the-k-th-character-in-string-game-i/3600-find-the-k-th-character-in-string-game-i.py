class Solution(object):
    def kthCharacter(self, k):
        word='a'
        while (len(word)<k):
            next_c=''.join(chr((ord(c)-ord('a')+1)%26+ord('a')) for c in word)
            word+=next_c
            
        return word[k-1]