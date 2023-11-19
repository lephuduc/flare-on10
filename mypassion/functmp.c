__int64 __fastcall sub_0(context *ctx)
{

  *(_DWORD *)(ctx->sus2 + 8) = 3;
  v2 = Parsing(ctx, *(unsigned int *)(ctx->sus2 + 8));
  v6 = 0i64;
  v3 = v2;
  v4 = ((__int64 (__fastcall *)(__int64, __int64 *, __int64))ctx->strtol)(v2, &v6, 4i64);
  if ( ((unsigned int (__fastcall *)(__int64, __int64))ctx->StrLen)(v6, 32i64) == v4 )
    (*(void (__fastcall **)(_QWORD))ctx->Sleep)((unsigned int)(1000 * v4));
  else
    ExitProcess(ctx->sus2 + 8));
  free(v3);
  return (ctx->Proc)(ctx);
}