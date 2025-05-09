typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkVowel(char cChar)
{
    if(cChar == 'a' || cChar == 'e' || cChar == 'i' || cChar == 'o' ||  cChar == 'u' ||  cChar == 'A' || cChar == 'E' ||  cChar == 'I' ||  cChar == 'O' ||  cChar == 'U' )
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}