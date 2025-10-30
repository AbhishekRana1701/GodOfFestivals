#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main() {
    pid_t pid1, pid2;

    pid1 = fork();
    if (pid1 == 0) {
        // This is Child Process P1
        printf("Child Process P1 (PID: %d, Parent PID: %d)\n", getpid(), getppid());
    } else {
        pid2 = fork();
        if (pid2 == 0) {
            // This is Child Process P2
            printf("Child Process P2 (PID: %d, Parent PID: %d)\n", getpid(), getppid());
        } else {
            // This is the Parent Process
            printf("Parent Process P (PID: %d)\n", getpid());
        }
    }
    return 0;
}
