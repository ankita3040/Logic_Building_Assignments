// Write application which accept file name from user and create that file.
/*
    Input : Demo.txt
    OUtput : File create successfully.

*/

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    char fName[50] = {'\0'};
    int fd = 0;

    printf("Enter file name to create \n");
    scanf("%s",fName);

    fd = creat(fName,0777);

    printf("File created successfully\n");

    return 0;


}