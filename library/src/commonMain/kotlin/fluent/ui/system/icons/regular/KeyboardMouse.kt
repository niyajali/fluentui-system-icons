/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * KeyboardMouse Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a mouse and keyboard combo.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_keyboard_mouse_16_regular.svg)
 * 
 * @return The [ImageVector] for the KeyboardMouse icon.
 */
public val FluentIcons.Regular.KeyboardMouse: ImageVector
    get() {
        if (_keyboardMouse != null) {
            return _keyboardMouse!!
        }
        _keyboardMouse = Builder(name = "KeyboardMouse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 10.0f, 3.24f, 10.053f, 3.146f, 10.146f)
                curveTo(3.053f, 10.24f, 3.0f, 10.367f, 3.0f, 10.5f)
                curveTo(3.0f, 10.633f, 3.053f, 10.76f, 3.146f, 10.854f)
                curveTo(3.24f, 10.947f, 3.367f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.633f, 11.0f, 12.76f, 10.947f, 12.854f, 10.854f)
                curveTo(12.947f, 10.76f, 13.0f, 10.633f, 13.0f, 10.5f)
                curveTo(13.0f, 10.367f, 12.947f, 10.24f, 12.854f, 10.146f)
                curveTo(12.76f, 10.053f, 12.633f, 10.0f, 12.5f, 10.0f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(8.398f, 9.0f, 8.543f, 8.956f, 8.667f, 8.874f)
                curveTo(8.79f, 8.791f, 8.886f, 8.674f, 8.943f, 8.537f)
                curveTo(9.0f, 8.4f, 9.015f, 8.249f, 8.986f, 8.104f)
                curveTo(8.957f, 7.958f, 8.885f, 7.825f, 8.78f, 7.72f)
                curveTo(8.675f, 7.615f, 8.542f, 7.543f, 8.396f, 7.514f)
                curveTo(8.251f, 7.485f, 8.1f, 7.5f, 7.963f, 7.557f)
                curveTo(7.826f, 7.614f, 7.709f, 7.71f, 7.626f, 7.833f)
                curveTo(7.544f, 7.957f, 7.5f, 8.102f, 7.5f, 8.25f)
                curveTo(7.501f, 8.449f, 7.581f, 8.639f, 7.721f, 8.779f)
                curveTo(7.861f, 8.919f, 8.052f, 8.999f, 8.25f, 9.0f)
                close()
                moveTo(6.25f, 7.0f)
                curveTo(6.398f, 7.0f, 6.543f, 6.956f, 6.667f, 6.874f)
                curveTo(6.79f, 6.791f, 6.886f, 6.674f, 6.943f, 6.537f)
                curveTo(7.0f, 6.4f, 7.015f, 6.249f, 6.986f, 6.104f)
                curveTo(6.957f, 5.958f, 6.885f, 5.825f, 6.78f, 5.72f)
                curveTo(6.675f, 5.615f, 6.542f, 5.543f, 6.396f, 5.514f)
                curveTo(6.251f, 5.485f, 6.1f, 5.5f, 5.963f, 5.557f)
                curveTo(5.826f, 5.614f, 5.709f, 5.71f, 5.626f, 5.833f)
                curveTo(5.544f, 5.957f, 5.5f, 6.102f, 5.5f, 6.25f)
                curveTo(5.501f, 6.449f, 5.581f, 6.639f, 5.721f, 6.779f)
                curveTo(5.861f, 6.919f, 6.051f, 6.999f, 6.25f, 7.0f)
                close()
                moveTo(5.25f, 9.0f)
                curveTo(5.398f, 9.0f, 5.543f, 8.956f, 5.667f, 8.874f)
                curveTo(5.79f, 8.791f, 5.886f, 8.674f, 5.943f, 8.537f)
                curveTo(6.0f, 8.4f, 6.015f, 8.249f, 5.986f, 8.104f)
                curveTo(5.957f, 7.958f, 5.885f, 7.825f, 5.78f, 7.72f)
                curveTo(5.675f, 7.615f, 5.542f, 7.543f, 5.396f, 7.514f)
                curveTo(5.251f, 7.485f, 5.1f, 7.5f, 4.963f, 7.557f)
                curveTo(4.826f, 7.614f, 4.709f, 7.71f, 4.626f, 7.833f)
                curveTo(4.544f, 7.957f, 4.5f, 8.102f, 4.5f, 8.25f)
                curveTo(4.501f, 8.449f, 4.581f, 8.639f, 4.721f, 8.779f)
                curveTo(4.861f, 8.919f, 5.051f, 8.999f, 5.25f, 9.0f)
                close()
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 6.102f, 3.956f, 5.957f, 3.874f, 5.833f)
                curveTo(3.791f, 5.71f, 3.674f, 5.614f, 3.537f, 5.557f)
                curveTo(3.4f, 5.5f, 3.249f, 5.485f, 3.104f, 5.514f)
                curveTo(2.958f, 5.543f, 2.825f, 5.615f, 2.72f, 5.72f)
                curveTo(2.615f, 5.825f, 2.543f, 5.958f, 2.514f, 6.104f)
                curveTo(2.485f, 6.249f, 2.5f, 6.4f, 2.557f, 6.537f)
                curveTo(2.614f, 6.674f, 2.71f, 6.791f, 2.833f, 6.874f)
                curveTo(2.957f, 6.956f, 3.102f, 7.0f, 3.25f, 7.0f)
                curveTo(3.449f, 6.999f, 3.639f, 6.919f, 3.779f, 6.779f)
                curveTo(3.919f, 6.639f, 3.999f, 6.449f, 4.0f, 6.25f)
                close()
                moveTo(14.0f, 8.65f)
                verticalLineTo(11.25f)
                curveTo(13.999f, 11.448f, 13.919f, 11.639f, 13.779f, 11.779f)
                curveTo(13.639f, 11.919f, 13.448f, 11.999f, 13.25f, 12.0f)
                horizontalLineTo(2.75f)
                curveTo(2.552f, 11.999f, 2.361f, 11.919f, 2.221f, 11.779f)
                curveTo(2.081f, 11.639f, 2.001f, 11.448f, 2.0f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(2.001f, 4.551f, 2.081f, 4.361f, 2.221f, 4.221f)
                curveTo(2.361f, 4.081f, 2.552f, 4.001f, 2.75f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.75f)
                curveTo(2.52f, 2.999f, 2.292f, 3.044f, 2.08f, 3.132f)
                curveTo(1.867f, 3.22f, 1.674f, 3.349f, 1.511f, 3.511f)
                curveTo(1.349f, 3.674f, 1.22f, 3.867f, 1.132f, 4.08f)
                curveTo(1.044f, 4.292f, 0.999f, 4.52f, 1.0f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(0.999f, 11.48f, 1.044f, 11.708f, 1.132f, 11.92f)
                curveTo(1.22f, 12.133f, 1.349f, 12.326f, 1.511f, 12.489f)
                curveTo(1.674f, 12.651f, 1.867f, 12.78f, 2.08f, 12.868f)
                curveTo(2.292f, 12.956f, 2.52f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(13.25f)
                curveTo(13.48f, 13.0f, 13.708f, 12.956f, 13.92f, 12.868f)
                curveTo(14.133f, 12.78f, 14.326f, 12.651f, 14.489f, 12.489f)
                curveTo(14.651f, 12.326f, 14.78f, 12.133f, 14.868f, 11.92f)
                curveTo(14.956f, 11.708f, 15.0f, 11.48f, 15.0f, 11.25f)
                verticalLineTo(7.94f)
                curveTo(14.717f, 8.241f, 14.377f, 8.483f, 14.0f, 8.65f)
                close()
                moveTo(3.0f, 10.5f)
                curveTo(3.0f, 10.633f, 3.053f, 10.76f, 3.146f, 10.854f)
                curveTo(3.24f, 10.947f, 3.367f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.633f, 11.0f, 12.76f, 10.947f, 12.854f, 10.854f)
                curveTo(12.947f, 10.76f, 13.0f, 10.633f, 13.0f, 10.5f)
                curveTo(13.0f, 10.367f, 12.947f, 10.24f, 12.854f, 10.146f)
                curveTo(12.76f, 10.053f, 12.633f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 10.0f, 3.24f, 10.053f, 3.146f, 10.146f)
                curveTo(3.053f, 10.24f, 3.0f, 10.367f, 3.0f, 10.5f)
                close()
                moveTo(9.0f, 8.25f)
                curveTo(9.0f, 8.102f, 8.956f, 7.957f, 8.874f, 7.833f)
                curveTo(8.791f, 7.71f, 8.674f, 7.614f, 8.537f, 7.557f)
                curveTo(8.4f, 7.5f, 8.249f, 7.485f, 8.104f, 7.514f)
                curveTo(7.958f, 7.543f, 7.825f, 7.615f, 7.72f, 7.72f)
                curveTo(7.615f, 7.825f, 7.543f, 7.958f, 7.514f, 8.104f)
                curveTo(7.485f, 8.249f, 7.5f, 8.4f, 7.557f, 8.537f)
                curveTo(7.614f, 8.674f, 7.71f, 8.791f, 7.833f, 8.874f)
                curveTo(7.957f, 8.956f, 8.102f, 9.0f, 8.25f, 9.0f)
                curveTo(8.449f, 8.999f, 8.639f, 8.919f, 8.779f, 8.779f)
                curveTo(8.919f, 8.639f, 8.999f, 8.449f, 9.0f, 8.25f)
                close()
                moveTo(7.0f, 6.25f)
                curveTo(7.0f, 6.102f, 6.956f, 5.957f, 6.874f, 5.833f)
                curveTo(6.791f, 5.71f, 6.674f, 5.614f, 6.537f, 5.557f)
                curveTo(6.4f, 5.5f, 6.249f, 5.485f, 6.104f, 5.514f)
                curveTo(5.958f, 5.543f, 5.825f, 5.615f, 5.72f, 5.72f)
                curveTo(5.615f, 5.825f, 5.543f, 5.958f, 5.514f, 6.104f)
                curveTo(5.485f, 6.249f, 5.5f, 6.4f, 5.557f, 6.537f)
                curveTo(5.614f, 6.674f, 5.71f, 6.791f, 5.833f, 6.874f)
                curveTo(5.957f, 6.956f, 6.102f, 7.0f, 6.25f, 7.0f)
                curveTo(6.449f, 6.999f, 6.639f, 6.919f, 6.779f, 6.779f)
                curveTo(6.919f, 6.639f, 6.999f, 6.449f, 7.0f, 6.25f)
                close()
                moveTo(4.5f, 8.25f)
                curveTo(4.5f, 8.398f, 4.544f, 8.543f, 4.626f, 8.667f)
                curveTo(4.709f, 8.79f, 4.826f, 8.886f, 4.963f, 8.943f)
                curveTo(5.1f, 9.0f, 5.251f, 9.015f, 5.396f, 8.986f)
                curveTo(5.542f, 8.957f, 5.675f, 8.885f, 5.78f, 8.78f)
                curveTo(5.885f, 8.675f, 5.957f, 8.542f, 5.986f, 8.396f)
                curveTo(6.015f, 8.251f, 6.0f, 8.1f, 5.943f, 7.963f)
                curveTo(5.886f, 7.826f, 5.79f, 7.709f, 5.667f, 7.626f)
                curveTo(5.543f, 7.544f, 5.398f, 7.5f, 5.25f, 7.5f)
                curveTo(5.051f, 7.501f, 4.861f, 7.581f, 4.721f, 7.721f)
                curveTo(4.581f, 7.861f, 4.501f, 8.051f, 4.5f, 8.25f)
                close()
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 6.102f, 3.956f, 5.957f, 3.874f, 5.833f)
                curveTo(3.791f, 5.71f, 3.674f, 5.614f, 3.537f, 5.557f)
                curveTo(3.4f, 5.5f, 3.249f, 5.485f, 3.104f, 5.514f)
                curveTo(2.958f, 5.543f, 2.825f, 5.615f, 2.72f, 5.72f)
                curveTo(2.615f, 5.825f, 2.543f, 5.958f, 2.514f, 6.104f)
                curveTo(2.485f, 6.249f, 2.5f, 6.4f, 2.557f, 6.537f)
                curveTo(2.614f, 6.674f, 2.71f, 6.791f, 2.833f, 6.874f)
                curveTo(2.957f, 6.956f, 3.102f, 7.0f, 3.25f, 7.0f)
                curveTo(3.449f, 6.999f, 3.639f, 6.919f, 3.779f, 6.779f)
                curveTo(3.919f, 6.639f, 3.999f, 6.449f, 4.0f, 6.25f)
                close()
                moveTo(8.25f, 7.5f)
                curveTo(8.102f, 7.5f, 7.957f, 7.544f, 7.833f, 7.626f)
                curveTo(7.71f, 7.709f, 7.614f, 7.826f, 7.557f, 7.963f)
                curveTo(7.5f, 8.1f, 7.485f, 8.251f, 7.514f, 8.396f)
                curveTo(7.543f, 8.542f, 7.615f, 8.675f, 7.72f, 8.78f)
                curveTo(7.825f, 8.885f, 7.958f, 8.957f, 8.104f, 8.986f)
                curveTo(8.249f, 9.015f, 8.4f, 9.0f, 8.537f, 8.943f)
                curveTo(8.674f, 8.886f, 8.791f, 8.79f, 8.874f, 8.667f)
                curveTo(8.956f, 8.543f, 9.0f, 8.398f, 9.0f, 8.25f)
                curveTo(8.999f, 8.051f, 8.919f, 7.861f, 8.779f, 7.721f)
                curveTo(8.639f, 7.581f, 8.449f, 7.501f, 8.25f, 7.5f)
                close()
                moveTo(5.25f, 7.5f)
                curveTo(5.102f, 7.5f, 4.957f, 7.544f, 4.833f, 7.626f)
                curveTo(4.71f, 7.709f, 4.614f, 7.826f, 4.557f, 7.963f)
                curveTo(4.5f, 8.1f, 4.485f, 8.251f, 4.514f, 8.396f)
                curveTo(4.543f, 8.542f, 4.615f, 8.675f, 4.72f, 8.78f)
                curveTo(4.825f, 8.885f, 4.958f, 8.957f, 5.104f, 8.986f)
                curveTo(5.249f, 9.015f, 5.4f, 9.0f, 5.537f, 8.943f)
                curveTo(5.674f, 8.886f, 5.791f, 8.79f, 5.874f, 8.667f)
                curveTo(5.956f, 8.543f, 6.0f, 8.398f, 6.0f, 8.25f)
                curveTo(5.999f, 8.051f, 5.919f, 7.861f, 5.779f, 7.721f)
                curveTo(5.639f, 7.581f, 5.449f, 7.501f, 5.25f, 7.5f)
                close()
                moveTo(6.25f, 5.5f)
                curveTo(6.102f, 5.5f, 5.957f, 5.544f, 5.833f, 5.626f)
                curveTo(5.71f, 5.709f, 5.614f, 5.826f, 5.557f, 5.963f)
                curveTo(5.5f, 6.1f, 5.485f, 6.251f, 5.514f, 6.396f)
                curveTo(5.543f, 6.542f, 5.615f, 6.675f, 5.72f, 6.78f)
                curveTo(5.825f, 6.885f, 5.958f, 6.957f, 6.104f, 6.986f)
                curveTo(6.249f, 7.015f, 6.4f, 7.0f, 6.537f, 6.943f)
                curveTo(6.674f, 6.886f, 6.791f, 6.79f, 6.874f, 6.667f)
                curveTo(6.956f, 6.543f, 7.0f, 6.398f, 7.0f, 6.25f)
                curveTo(6.999f, 6.051f, 6.919f, 5.861f, 6.779f, 5.721f)
                curveTo(6.639f, 5.581f, 6.449f, 5.501f, 6.25f, 5.5f)
                close()
                moveTo(3.25f, 5.5f)
                curveTo(3.102f, 5.5f, 2.957f, 5.544f, 2.833f, 5.626f)
                curveTo(2.71f, 5.709f, 2.614f, 5.826f, 2.557f, 5.963f)
                curveTo(2.5f, 6.1f, 2.485f, 6.251f, 2.514f, 6.396f)
                curveTo(2.543f, 6.542f, 2.615f, 6.675f, 2.72f, 6.78f)
                curveTo(2.825f, 6.885f, 2.958f, 6.957f, 3.104f, 6.986f)
                curveTo(3.249f, 7.015f, 3.4f, 7.0f, 3.537f, 6.943f)
                curveTo(3.674f, 6.886f, 3.791f, 6.79f, 3.874f, 6.667f)
                curveTo(3.956f, 6.543f, 4.0f, 6.398f, 4.0f, 6.25f)
                curveTo(3.999f, 6.051f, 3.919f, 5.861f, 3.779f, 5.721f)
                curveTo(3.639f, 5.581f, 3.449f, 5.501f, 3.25f, 5.5f)
                close()
                moveTo(12.5f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 10.0f, 3.24f, 10.053f, 3.146f, 10.146f)
                curveTo(3.053f, 10.24f, 3.0f, 10.367f, 3.0f, 10.5f)
                curveTo(3.0f, 10.633f, 3.053f, 10.76f, 3.146f, 10.854f)
                curveTo(3.24f, 10.947f, 3.367f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.633f, 11.0f, 12.76f, 10.947f, 12.854f, 10.854f)
                curveTo(12.947f, 10.76f, 13.0f, 10.633f, 13.0f, 10.5f)
                curveTo(13.0f, 10.367f, 12.947f, 10.24f, 12.854f, 10.146f)
                curveTo(12.76f, 10.053f, 12.633f, 10.0f, 12.5f, 10.0f)
                close()
                moveTo(13.5f, 1.0f)
                horizontalLineTo(11.5f)
                curveTo(11.102f, 1.0f, 10.721f, 1.158f, 10.439f, 1.439f)
                curveTo(10.158f, 1.721f, 10.0f, 2.102f, 10.0f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(10.0f, 6.163f, 10.263f, 6.799f, 10.732f, 7.268f)
                curveTo(11.201f, 7.737f, 11.837f, 8.0f, 12.5f, 8.0f)
                curveTo(13.163f, 8.0f, 13.799f, 7.737f, 14.268f, 7.268f)
                curveTo(14.737f, 6.799f, 15.0f, 6.163f, 15.0f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(15.0f, 2.102f, 14.842f, 1.721f, 14.561f, 1.439f)
                curveTo(14.279f, 1.158f, 13.898f, 1.0f, 13.5f, 1.0f)
                close()
                moveTo(14.0f, 5.5f)
                curveTo(14.0f, 5.898f, 13.842f, 6.279f, 13.561f, 6.561f)
                curveTo(13.279f, 6.842f, 12.898f, 7.0f, 12.5f, 7.0f)
                curveTo(12.102f, 7.0f, 11.721f, 6.842f, 11.439f, 6.561f)
                curveTo(11.158f, 6.279f, 11.0f, 5.898f, 11.0f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.367f, 11.053f, 2.24f, 11.146f, 2.146f)
                curveTo(11.24f, 2.053f, 11.367f, 2.0f, 11.5f, 2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.5f)
                curveTo(12.0f, 3.633f, 12.053f, 3.76f, 12.146f, 3.854f)
                curveTo(12.24f, 3.947f, 12.367f, 4.0f, 12.5f, 4.0f)
                curveTo(12.633f, 4.0f, 12.76f, 3.947f, 12.854f, 3.854f)
                curveTo(12.947f, 3.76f, 13.0f, 3.633f, 13.0f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.5f)
                curveTo(13.633f, 2.0f, 13.76f, 2.053f, 13.854f, 2.146f)
                curveTo(13.947f, 2.24f, 14.0f, 2.367f, 14.0f, 2.5f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _keyboardMouse!!
    }

@Suppress("ObjectPropertyName")
private var _keyboardMouse: ImageVector? = null

@Preview
@Composable
private fun KeyboardMousePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.KeyboardMouse, contentDescription = "KeyboardMouse Icon")
    }
}

