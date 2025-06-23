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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.TableArrowUp: ImageVector
    get() {
        if (_TableArrowUp != null) {
            return _TableArrowUp!!
        }
        _TableArrowUp = ImageVector.Builder(
            name = "Filled.TableArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.022f, 21f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 16f)
                horizontalLineTo(11.174f)
                curveTo(11.06f, 16.482f, 11f, 16.984f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
                close()
                moveTo(21f, 12.022f)
                verticalLineTo(9.5f)
                horizontalLineTo(16f)
                verticalLineTo(11.174f)
                curveTo(16.482f, 11.06f, 16.984f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                close()
                moveTo(14.5f, 11.732f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.732f)
                curveTo(12.349f, 13.318f, 13.318f, 12.349f, 14.5f, 11.732f)
                close()
                moveTo(21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                close()
                moveTo(9.5f, 3f)
                horizontalLineTo(14.5f)
                verticalLineTo(8f)
                horizontalLineTo(9.5f)
                verticalLineTo(3f)
                close()
                moveTo(6.25f, 3f)
                horizontalLineTo(8f)
                lineTo(8f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(3f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 17.75f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                lineTo(8f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17.427f, 14.005f)
                lineTo(17.511f, 14f)
                curveTo(17.532f, 14.001f, 17.553f, 14.002f, 17.574f, 14.005f)
                lineTo(17.628f, 14.017f)
                lineTo(17.691f, 14.038f)
                lineTo(17.758f, 14.072f)
                lineTo(17.806f, 14.104f)
                lineTo(20.354f, 16.646f)
                lineTo(20.411f, 16.716f)
                curveTo(20.546f, 16.911f, 20.527f, 17.18f, 20.354f, 17.354f)
                curveTo(20.18f, 17.527f, 19.911f, 17.546f, 19.716f, 17.411f)
                lineTo(19.646f, 17.354f)
                lineTo(17.999f, 15.706f)
                lineTo(18f, 21f)
                lineTo(17.992f, 21.09f)
                curveTo(17.955f, 21.294f, 17.794f, 21.455f, 17.59f, 21.492f)
                lineTo(17.5f, 21.5f)
                lineTo(17.41f, 21.492f)
                curveTo(17.206f, 21.455f, 17.045f, 21.294f, 17.008f, 21.09f)
                lineTo(17f, 21f)
                lineTo(16.999f, 15.708f)
                lineTo(15.354f, 17.354f)
                lineTo(15.284f, 17.411f)
                curveTo(15.114f, 17.529f, 14.886f, 17.529f, 14.716f, 17.411f)
                lineTo(14.646f, 17.354f)
                lineTo(14.589f, 17.284f)
                curveTo(14.47f, 17.114f, 14.47f, 16.886f, 14.589f, 16.716f)
                lineTo(14.646f, 16.646f)
                lineTo(17.159f, 14.134f)
                lineTo(17.215f, 14.089f)
                lineTo(17.289f, 14.047f)
                lineTo(17.372f, 14.017f)
                lineTo(17.427f, 14.005f)
                close()
            }
        }.build()

        return _TableArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _TableArrowUp: ImageVector? = null

@Preview
@Composable
private fun TableArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableArrowUp, contentDescription = null)
    }
}
