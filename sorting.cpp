#include <bits/stdc++.h>
using namespace std;
void insertionsort(int n, int arr[])
{
  for (int i = 1; i < n; i++)
  {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key)
    {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = key;
  }
}
void bubblesort(int n, int arr[])
{
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = 0; j < n - 1 - i; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        swap(arr[j], arr[j + 1]);
      }
    }
  }
}
void selectionsort(int n, int arr[])
{
  for (int i = 0; i < n - 1; i++)
  {
    int min_idx = i;
    for (int j = i + 1; j < n; j++)
    {
      if (arr[j] < arr[min_idx])
        min_idx = j;
    }
    swap(arr[i], arr[min_idx]);
  }
}
void mergesort(int arr[], int left, int right)
{
  if (left < right)
  {
    int mid = left + (right - left) / 2; 
    mergesort(arr, left, mid);           
    mergesort(arr, mid + 1, right);      
    merge(arr, left, mid, right);        
  }
}

void merge(int arr[], int left, int mid, int right)
{
  int n1 = mid - left + 1;
  int n2 = right - mid;
  int L[n1], R[n2];

  // Copy data to temp arrays
  for (int i = 0; i < n1; i++)
    L[i] = arr[left + i];
  for (int j = 0; j < n2; j++)
    R[j] = arr[mid + 1 + j];

  // Merge back into arr[]
  int i = 0, j = 0, k = left;
  while (i < n1 && j < n2)
  {
    if (L[i] <= R[j])
      arr[k++] = L[i++];
    else
      arr[k++] = R[j++];
  }

  // Copy remaining elements
  while (i < n1)
    arr[k++] = L[i++];
  while (j < n2)
    arr[k++] = R[j++];
}
void quicksort(int arr[], int low, int high)
{
  if (low < high)
  {
    int pivot = myPartition(arr, low, high);
    quicksort(arr, low, pivot - 1);
    quicksort(arr, pivot + 1, high);
  }
}

int myPartition(int arr[], int low, int high)
{
  int pivot = arr[high];
  int i = low - 1;
  for (int j = low; j < high; j++)
  {
    if (arr[j] < pivot)
    {
      i++;
      swap(arr[i], arr[j]);
    }
  }
  swap(arr[i + 1], arr[high]);
  return i + 1;
}

void heapify(int arr[], int n, int i)
{
  int largest = i;
  int left = 2 * i + 1;
  int right = 2 * i + 2;

  if (left < n && arr[left] > arr[largest])
    largest = left;

  if (right < n && arr[right] > arr[largest])
    largest = right;

  if (largest != i)
  {
    swap(arr[i], arr[largest]);
    heapify(arr, n, largest);
  }
}

void heapsort(int n, int arr[])
{
  for (int i = n / 2 - 1; i >= 0; i--)
    heapify(arr, n, i);

  for (int i = n - 1; i > 0; i--)
  {
    swap(arr[0], arr[i]);
    heapify(arr, i, 0);
  }
}


int main()
{
  int n;
  cout << "Enter the number of elements: ";
  cin >> n;
  int arr[n];
  cout << "Enter the elements: ";
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  insertionsort(n, arr);
  bubblesort(n, arr);
  selectionsort(n, arr);
  mergesort(arr, 0, n - 1);
  quicksort(arr, 0, n - 1);
  heapsort(n, arr);
  cout << "Sorted array using Insertion Sort: ";
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  cout << endl;
  return 0;
}

