#include <stdio.h>
#include <pthread.h>

pthread_mutex_t lock;  // Mutex declaration

void* critical_section(void* arg) {
    pthread_mutex_lock(&lock);  // Acquire the lock
    printf("Thread %d is in the critical section.\n", *(int*)arg);
    
    // Simulating work in the critical section
    sleep(1);
    
    printf("Thread %d is leaving the critical section.\n", *(int*)arg);
    pthread_mutex_unlock(&lock);  // Release the lock
    return NULL;
}

int main() {
    pthread_t t1, t2;
    int id1 = 1, id2 = 2;

    pthread_mutex_init(&lock, NULL);  // Initialize mutex

    pthread_create(&t1, NULL, critical_section, &id1);
    pthread_create(&t2, NULL, critical_section, &id2);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    pthread_mutex_destroy(&lock);  // Destroy mutex
    return 0;
}
