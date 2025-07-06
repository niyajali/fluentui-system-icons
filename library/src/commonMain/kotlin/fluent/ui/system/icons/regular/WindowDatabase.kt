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
 * WindowDatabase Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_database_24_regular.svg)
 * 
 * @return The [ImageVector] for the WindowDatabase icon.
 */
public val FluentIcons.Regular.WindowDatabase: ImageVector
    get() {
        if (_windowDatabase != null) {
            return _windowDatabase!!
        }
        _windowDatabase = Builder(name = "WindowDatabase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.576f)
                curveTo(20.024f, 10.631f, 20.529f, 10.715f, 21.0f, 10.826f)
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
                moveTo(14.664f, 12.481f)
                curveTo(15.551f, 12.177f, 16.732f, 12.0f, 18.0f, 12.0f)
                curveTo(19.268f, 12.0f, 20.449f, 12.177f, 21.336f, 12.481f)
                curveTo(21.778f, 12.633f, 22.177f, 12.826f, 22.474f, 13.066f)
                curveTo(22.773f, 13.307f, 23.0f, 13.623f, 23.0f, 14.0f)
                curveTo(23.0f, 14.377f, 22.773f, 14.693f, 22.474f, 14.934f)
                curveTo(22.177f, 15.174f, 21.778f, 15.367f, 21.336f, 15.519f)
                curveTo(20.449f, 15.823f, 19.268f, 16.0f, 18.0f, 16.0f)
                curveTo(16.732f, 16.0f, 15.551f, 15.823f, 14.664f, 15.519f)
                curveTo(14.222f, 15.367f, 13.823f, 15.174f, 13.526f, 14.934f)
                curveTo(13.227f, 14.693f, 13.0f, 14.377f, 13.0f, 14.0f)
                curveTo(13.0f, 13.623f, 13.227f, 13.307f, 13.526f, 13.066f)
                curveTo(13.823f, 12.826f, 14.222f, 12.633f, 14.664f, 12.481f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineTo(16.395f)
                curveTo(13.381f, 16.631f, 13.791f, 16.806f, 14.177f, 16.938f)
                curveTo(15.258f, 17.309f, 16.611f, 17.5f, 18.0f, 17.5f)
                curveTo(19.389f, 17.5f, 20.742f, 17.309f, 21.823f, 16.938f)
                curveTo(22.209f, 16.806f, 22.619f, 16.631f, 23.0f, 16.395f)
                verticalLineTo(21.0f)
                curveTo(23.0f, 21.427f, 22.738f, 21.753f, 22.454f, 21.976f)
                curveTo(22.163f, 22.204f, 21.773f, 22.388f, 21.336f, 22.534f)
                curveTo(20.458f, 22.827f, 19.277f, 23.0f, 18.0f, 23.0f)
                curveTo(16.723f, 23.0f, 15.542f, 22.827f, 14.664f, 22.534f)
                curveTo(14.227f, 22.388f, 13.837f, 22.204f, 13.546f, 21.976f)
                curveTo(13.262f, 21.753f, 13.0f, 21.427f, 13.0f, 21.0f)
                close()
            }
        }
        .build()
        return _windowDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _windowDatabase: ImageVector? = null

@Preview
@Composable
private fun WindowDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowDatabase, contentDescription = "WindowDatabase Icon")
    }
}

