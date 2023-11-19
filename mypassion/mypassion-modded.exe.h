#define __int8 char
#define __int16 short
#define __int32 int
#define __int64 long long
#define _QWORD unsigned long long
#define _BYTE unsigned char
/* 57 */
struct __declspec(align(8)) context
{
  char input[256];
  __int64 sus1;
  __int64 sus2;
  char prc_address[520];
  __int64 GetTickCount;
  __int64 (__fastcall *GetProcAddress)(__int64 (__fastcall *)(_QWORD), char *);
  __int64 (__fastcall *LoadLibraryW)(const __int16 *);
  void (__fastcall *GetModuleFileNameW)(_QWORD, __int16 *, __int64);
  __int64 (__fastcall *CreateFileW)(__int64, __int64, __int64);
  _BYTE ReadFile[8];
  void (__fastcall *WriteFile)(void *, int *, __int64, char *, _QWORD);
  _BYTE Sleep[8];
  void (__fastcall *ExitProcess)(__int64);
  __int64 (__fastcall *VirtualAlloc)(_QWORD, __int64, __int64, __int64);
  __int64 free;
  __int64 GetStdHandle;
  __int64 nop;
  __int64 strtol;
  __int64 StrLen;
  __int64 Parsing;
  void (__fastcall *Hash_and_set_key)(char *);
  void (__fastcall *Decrypt_with_static_key)(_QWORD *, __int64);
  __int64 Execute_;
  __int64 Proc;
};

