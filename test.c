#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid1, pid2;

    pid1 = fork();
    if (pid1 == 0) {
        printf("I am child process P1 with PID: %d\n", getpid());
        exit(EXIT_SUCCESS);
    } else {
        pid2 = fork();
        if (pid2 == 0) {
            printf("I am child process P2 with PID: %d\n", getpid());
            exit(EXIT_SUCCESS);
        } else {
            waitpid(pid1, NULL, 0);
            waitpid(pid2, NULL, 0);
            printf("I am the parent process P with PID: %d\n", getpid());
        }
    }

    return 0;
}