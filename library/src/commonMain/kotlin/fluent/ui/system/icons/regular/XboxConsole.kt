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
 * XboxConsole Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, xbox
 * - Description: Used to represent the Xbox Series X, but okay to use for general xbox console.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_xbox_console_24_regular.svg)
 * 
 * @return The [ImageVector] for the XboxConsole icon.
 */
public val FluentIcons.Regular.XboxConsole: ImageVector
    get() {
        if (_xboxConsole != null) {
            return _xboxConsole!!
        }
        _xboxConsole = Builder(name = "XboxConsole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 5.75f)
                curveTo(9.5f, 6.164f, 9.164f, 6.5f, 8.75f, 6.5f)
                curveTo(8.336f, 6.5f, 8.0f, 6.164f, 8.0f, 5.75f)
                curveTo(8.0f, 5.336f, 8.336f, 5.0f, 8.75f, 5.0f)
                curveTo(9.164f, 5.0f, 9.5f, 5.336f, 9.5f, 5.75f)
                close()
                moveTo(5.75f, 2.0f)
                curveTo(5.336f, 2.0f, 5.0f, 2.336f, 5.0f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.0f, 21.664f, 5.336f, 22.0f, 5.75f, 22.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 22.0f, 19.0f, 21.664f, 19.0f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(19.0f, 2.336f, 18.664f, 2.0f, 18.25f, 2.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(9.5f, 20.5f)
                verticalLineTo(11.75f)
                curveTo(9.5f, 11.336f, 9.164f, 11.0f, 8.75f, 11.0f)
                curveTo(8.336f, 11.0f, 8.0f, 11.336f, 8.0f, 11.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _xboxConsole!!
    }

@Suppress("ObjectPropertyName")
private var _xboxConsole: ImageVector? = null

@Preview
@Composable
private fun XboxConsolePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.XboxConsole, contentDescription = "XboxConsole Icon")
    }
}

