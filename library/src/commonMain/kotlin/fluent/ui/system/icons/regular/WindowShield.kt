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
 * WindowShield icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: window, shield
 * - Source: ic_fluent_window_shield_24_regular.svg
 * 
 * @return The [ImageVector] for the WindowShield icon.
 */
public val FluentIcons.Regular.WindowShield: ImageVector
    get() {
        if (_windowShield != null) {
            return _windowShield!!
        }
        _windowShield = Builder(name = "WindowShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(13.854f)
                curveTo(13.398f, 20.542f, 13.023f, 20.04f, 12.732f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.185f)
                curveTo(19.92f, 11.496f, 20.433f, 11.798f, 21.0f, 11.976f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.99f, 11.194f)
                curveTo(18.642f, 11.845f, 19.896f, 12.88f, 21.439f, 13.093f)
                curveTo(21.747f, 13.135f, 22.0f, 13.378f, 22.0f, 13.682f)
                verticalLineTo(16.52f)
                curveTo(22.0f, 20.336f, 18.421f, 21.721f, 17.647f, 21.976f)
                curveTo(17.55f, 22.008f, 17.451f, 22.008f, 17.354f, 21.976f)
                curveTo(16.58f, 21.721f, 13.0f, 20.336f, 13.0f, 16.52f)
                lineTo(13.0f, 13.682f)
                curveTo(13.0f, 13.378f, 13.253f, 13.135f, 13.561f, 13.093f)
                curveTo(15.103f, 12.88f, 16.358f, 11.845f, 17.01f, 11.194f)
                curveTo(17.27f, 10.935f, 17.729f, 10.935f, 17.99f, 11.194f)
                close()
            }
        }
        .build()
        return _windowShield!!
    }

@Suppress("ObjectPropertyName")
private var _windowShield: ImageVector? = null

@Preview
@Composable
private fun WindowShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowShield, contentDescription = null)
    }
}

