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

package fluent.ui.system.icons.filled

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
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a mouse and keyboard combo.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_keyboard_mouse_16_filled.svg)
 * 
 * @return The [ImageVector] for the KeyboardMouse icon.
 */
public val FluentIcons.Filled.KeyboardMouse: ImageVector
    get() {
        if (_keyboardMouse != null) {
            return _keyboardMouse!!
        }
        _keyboardMouse = Builder(name = "KeyboardMouse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 1.0f)
                curveTo(13.9f, 1.0f, 14.28f, 1.16f, 14.56f, 1.44f)
                curveTo(14.84f, 1.72f, 15.0f, 2.1f, 15.0f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(15.0f, 6.16f, 14.74f, 6.8f, 14.27f, 7.27f)
                curveTo(13.8f, 7.74f, 13.16f, 8.0f, 12.5f, 8.0f)
                curveTo(11.84f, 8.0f, 11.2f, 7.74f, 10.73f, 7.27f)
                curveTo(10.26f, 6.8f, 10.0f, 6.16f, 10.0f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(10.0f, 2.1f, 10.16f, 1.72f, 10.44f, 1.44f)
                curveTo(10.72f, 1.16f, 11.1f, 1.0f, 11.5f, 1.0f)
                horizontalLineTo(13.5f)
                close()
                moveTo(12.85f, 3.85f)
                curveTo(12.95f, 3.76f, 13.0f, 3.63f, 13.0f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.5f)
                curveTo(12.0f, 3.63f, 12.05f, 3.76f, 12.15f, 3.85f)
                curveTo(12.24f, 3.95f, 12.37f, 4.0f, 12.5f, 4.0f)
                curveTo(12.63f, 4.0f, 12.76f, 3.95f, 12.85f, 3.85f)
                close()
                moveTo(12.5f, 9.0f)
                curveTo(13.436f, 9.0f, 14.315f, 8.636f, 14.975f, 7.975f)
                curveTo(14.979f, 7.97f, 14.983f, 7.965f, 14.988f, 7.959f)
                curveTo(14.991f, 7.954f, 14.995f, 7.949f, 15.0f, 7.944f)
                verticalLineTo(11.25f)
                curveTo(15.0f, 12.216f, 14.216f, 13.0f, 13.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(1.784f, 13.0f, 1.0f, 12.216f, 1.0f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(1.0f, 3.784f, 1.784f, 3.0f, 2.75f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 6.434f, 9.364f, 7.313f, 10.025f, 7.974f)
                curveTo(10.686f, 8.636f, 11.564f, 9.0f, 12.5f, 9.0f)
                close()
                moveTo(9.0f, 8.25f)
                curveTo(9.0f, 7.836f, 8.664f, 7.5f, 8.25f, 7.5f)
                curveTo(7.836f, 7.5f, 7.5f, 7.836f, 7.5f, 8.25f)
                curveTo(7.5f, 8.664f, 7.836f, 9.0f, 8.25f, 9.0f)
                curveTo(8.664f, 9.0f, 9.0f, 8.664f, 9.0f, 8.25f)
                close()
                moveTo(7.0f, 6.25f)
                curveTo(7.0f, 5.836f, 6.664f, 5.5f, 6.25f, 5.5f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                curveTo(5.5f, 6.664f, 5.836f, 7.0f, 6.25f, 7.0f)
                curveTo(6.664f, 7.0f, 7.0f, 6.664f, 7.0f, 6.25f)
                close()
                moveTo(6.0f, 8.25f)
                curveTo(6.0f, 7.836f, 5.664f, 7.5f, 5.25f, 7.5f)
                curveTo(4.836f, 7.5f, 4.5f, 7.836f, 4.5f, 8.25f)
                curveTo(4.5f, 8.664f, 4.836f, 9.0f, 5.25f, 9.0f)
                curveTo(5.664f, 9.0f, 6.0f, 8.664f, 6.0f, 8.25f)
                close()
                moveTo(3.25f, 5.5f)
                curveTo(2.836f, 5.5f, 2.5f, 5.836f, 2.5f, 6.25f)
                curveTo(2.5f, 6.664f, 2.836f, 7.0f, 3.25f, 7.0f)
                curveTo(3.664f, 7.0f, 4.0f, 6.664f, 4.0f, 6.25f)
                curveTo(4.0f, 5.836f, 3.664f, 5.5f, 3.25f, 5.5f)
                close()
                moveTo(3.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 11.0f, 13.0f, 10.776f, 13.0f, 10.5f)
                curveTo(13.0f, 10.224f, 12.776f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 10.0f, 3.0f, 10.224f, 3.0f, 10.5f)
                curveTo(3.0f, 10.776f, 3.224f, 11.0f, 3.5f, 11.0f)
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
        Image(imageVector = FluentIcons.Filled.KeyboardMouse, contentDescription = "KeyboardMouse Icon")
    }
}

