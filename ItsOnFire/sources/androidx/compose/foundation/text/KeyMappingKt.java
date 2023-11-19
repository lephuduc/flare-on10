package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.appcompat.R;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(KeyMappingKt$defaultKeyMapping$1.INSTANCE);
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo540mapZmokQxo(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2553isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2551isCtrlPressedZmokQxo(event)) {
                    long m2547getKeyZmokQxo = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m559getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m560getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m561getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m558getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2551isCtrlPressedZmokQxo(event)) {
                    long m2547getKeyZmokQxo2 = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m559getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m560getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m561getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m558getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m563getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m557getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m554getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m553getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2553isShiftPressedZmokQxo(event)) {
                    long m2547getKeyZmokQxo3 = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m566getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m565getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo540mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super androidx.compose.ui.input.key.KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo540mapZmokQxo(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(androidx.compose.ui.input.key.KeyEvent.m2530boximpl(event)).booleanValue() && KeyEvent_androidKt.m2553isShiftPressedZmokQxo(event)) {
                    if (Key.m1952equalsimpl0(KeyEvent_androidKt.m2547getKeyZmokQxo(event), MappedKeys.INSTANCE.m573getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                } else if (shortcutModifier.invoke(androidx.compose.ui.input.key.KeyEvent.m2530boximpl(event)).booleanValue()) {
                    long m2547getKeyZmokQxo = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m555getCEK5gGoQ()) ? true : Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m564getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (!Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m571getVEK5gGoQ())) {
                        if (!Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m572getXEK5gGoQ())) {
                            if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m552getAEK5gGoQ())) {
                                return KeyCommand.SELECT_ALL;
                            }
                            if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, mappedKeys.m573getZEK5gGoQ())) {
                                return KeyCommand.UNDO;
                            }
                            return null;
                        }
                        return KeyCommand.CUT;
                    }
                    return KeyCommand.PASTE;
                } else if (KeyEvent_androidKt.m2551isCtrlPressedZmokQxo(event)) {
                    return null;
                } else {
                    if (KeyEvent_androidKt.m2553isShiftPressedZmokQxo(event)) {
                        long m2547getKeyZmokQxo2 = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                        MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m559getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m560getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m561getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m558getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m568getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m567getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m566getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m565getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (!Key.m1952equalsimpl0(m2547getKeyZmokQxo2, mappedKeys2.m564getInsertEK5gGoQ())) {
                            return null;
                        }
                    } else {
                        long m2547getKeyZmokQxo3 = KeyEvent_androidKt.m2547getKeyZmokQxo(event);
                        MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m559getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.LEFT_CHAR;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m560getDirectionRightEK5gGoQ())) {
                            return KeyCommand.RIGHT_CHAR;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m561getDirectionUpEK5gGoQ())) {
                            return KeyCommand.UP;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m558getDirectionDownEK5gGoQ())) {
                            return KeyCommand.DOWN;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m568getPageUpEK5gGoQ())) {
                            return KeyCommand.PAGE_UP;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m567getPageDownEK5gGoQ())) {
                            return KeyCommand.PAGE_DOWN;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m566getMoveHomeEK5gGoQ())) {
                            return KeyCommand.LINE_START;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m565getMoveEndEK5gGoQ())) {
                            return KeyCommand.LINE_END;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m562getEnterEK5gGoQ())) {
                            return KeyCommand.NEW_LINE;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m554getBackspaceEK5gGoQ())) {
                            return KeyCommand.DELETE_PREV_CHAR;
                        }
                        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m557getDeleteEK5gGoQ())) {
                            return KeyCommand.DELETE_NEXT_CHAR;
                        }
                        if (!Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m569getPasteEK5gGoQ())) {
                            if (!Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m556getCutEK5gGoQ())) {
                                if (Key.m1952equalsimpl0(m2547getKeyZmokQxo3, mappedKeys3.m570getTabEK5gGoQ())) {
                                    return KeyCommand.TAB;
                                }
                                return null;
                            }
                            return KeyCommand.CUT;
                        }
                    }
                    return KeyCommand.PASTE;
                }
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
